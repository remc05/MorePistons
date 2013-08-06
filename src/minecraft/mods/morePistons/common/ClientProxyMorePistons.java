package mods.morePistons.common;


import mods.morePistons.common.CommonProxyMorePistons;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyMorePistons extends CommonProxyMorePistons {
	@Override
	public void registerRenderers() {
		
		ModLoader.registerTileEntity(TileEntityMorePistons.class, "MorePistons");
		ModLoader.registerTileEntity(TileEntityMorePistons.class, "MorePistonsRenderer", new TileEntityMorePistonsRenderer());

		super.registerRenderers();
		
	}

}