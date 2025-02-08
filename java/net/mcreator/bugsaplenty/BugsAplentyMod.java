package net.mcreator.bugsaplenty;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.neoforged.neoforge.network.handling.IPayloadHandler;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.util.Tuple;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.bugsaplenty.world.features.StructureFeature;
import net.mcreator.bugsaplenty.network.BugsAplentyModVariables;
import net.mcreator.bugsaplenty.init.BugsAplentyModTabs;
import net.mcreator.bugsaplenty.init.BugsAplentyModSounds;
import net.mcreator.bugsaplenty.init.BugsAplentyModPotions;
import net.mcreator.bugsaplenty.init.BugsAplentyModMenus;
import net.mcreator.bugsaplenty.init.BugsAplentyModItems;
import net.mcreator.bugsaplenty.init.BugsAplentyModEntities;
import net.mcreator.bugsaplenty.init.BugsAplentyModBlocks;
import net.mcreator.bugsaplenty.init.BugsAplentyModBlockEntities;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;

@Mod("bugs_aplenty")
public class BugsAplentyMod {
	public static final Logger LOGGER = LogManager.getLogger(BugsAplentyMod.class);
	public static final String MODID = "bugs_aplenty";

	public BugsAplentyMod(IEventBus modEventBus) {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		NeoForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::registerNetworking);
		BugsAplentyModSounds.REGISTRY.register(modEventBus);
		BugsAplentyModBlocks.REGISTRY.register(modEventBus);
		BugsAplentyModBlockEntities.REGISTRY.register(modEventBus);
		BugsAplentyModItems.REGISTRY.register(modEventBus);
		BugsAplentyModEntities.REGISTRY.register(modEventBus);
		BugsAplentyModTabs.REGISTRY.register(modEventBus);
		BugsAplentyModVariables.ATTACHMENT_TYPES.register(modEventBus);

		StructureFeature.REGISTRY.register(modEventBus);
		BugsAplentyModPotions.REGISTRY.register(modEventBus);

		BugsAplentyModMenus.REGISTRY.register(modEventBus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static boolean networkingRegistered = false;
	private static final Map<CustomPacketPayload.Type<?>, NetworkMessage<?>> MESSAGES = new HashMap<>();

	private record NetworkMessage<T extends CustomPacketPayload>(StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
	}

	public static <T extends CustomPacketPayload> void addNetworkMessage(CustomPacketPayload.Type<T> id, StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
		if (networkingRegistered)
			throw new IllegalStateException("Cannot register new network messages after networking has been registered");
		MESSAGES.put(id, new NetworkMessage<>(reader, handler));
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	private void registerNetworking(final RegisterPayloadHandlersEvent event) {
		final PayloadRegistrar registrar = event.registrar(MODID);
		MESSAGES.forEach((id, networkMessage) -> registrar.playBidirectional(id, ((NetworkMessage) networkMessage).reader(), ((NetworkMessage) networkMessage).handler()));
		networkingRegistered = true;
	}

	private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new Tuple<>(action, tick));
	}

	@SubscribeEvent
	public void tick(ServerTickEvent.Post event) {
		List<Tuple<Runnable, Integer>> actions = new ArrayList<>();
		workQueue.forEach(work -> {
			work.setB(work.getB() - 1);
			if (work.getB() == 0)
				actions.add(work);
		});
		actions.forEach(e -> e.getA().run());
		workQueue.removeAll(actions);
	}
}
