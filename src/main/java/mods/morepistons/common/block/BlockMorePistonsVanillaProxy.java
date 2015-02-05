package mods.morepistons.common.block;

import static mods.morepistons.ModMorePistons.log;
import mods.gollum.core.tools.helper.blocks.HBlockPistonBase;
import mods.gollum.core.tools.registered.RegisteredObjects;
import mods.gollum.core.tools.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockMorePistonsVanillaProxy extends HBlockPistonBase {
	
	BlockMorePistonsVanilla target;
	BlockPistonBase vanillaPiston;
	
	public BlockMorePistonsVanillaProxy(BlockMorePistonsVanilla target) {
		super(
			target.isSticky() ? RegisteredObjects.instance().getRegisterName(Blocks.sticky_piston) : RegisteredObjects.instance().getRegisterName(Blocks.piston), 
			target.isSticky()
		);
		this.target = target;

		if (target.isSticky()) {
			this.vanillaPiston = Blocks.sticky_piston;
		} else {
			this.vanillaPiston = Blocks.piston;
		}
		
		helper.vanillaTexture  = true;
		helper.vanillaRegister = true;
	}
	
	////////////////////
	// Helper methods //
	////////////////////
	
	@Override
	public void register() {
		if (helper.vanillaRegister) return;
		
//		BlockRegistry.instance().overrideRegistered(this.getRegisterName(), this);
	}
	
	////////////
	// Events //
	////////////
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ) {
		
		log.debug("VanillaProxy replace onBlockActivated : ",x, y, z);
//		world.setBlock(x, y, z, this.target, world.getBlockMetadata(x, y, z), 2);
		
		return false;
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack) {
		
		log.debug("VanillaProxy replace onBlockPlacedBy : ",x, y, z);
		world.setBlock(x, y, z, this.target);
//		this.target.onBlockPlacedBy(world, x, y, z, entityLiving, itemStack);
	}
	
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		
		log.debug("VanillaProxy replace onNeighborBlockChange : ",x, y, z);
//		world.setBlock(x, y, z, this.target, world.getBlockMetadata(x, y, z), 2);
		
	}
	
	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		
		log.debug("VanillaProxy replace onBlockAdded : ",x, y, z);
//		world.setBlock(x, y, z, this.target, world.getBlockMetadata(x, y, z), 2);
		
	}
	
	@Override
	public boolean equals(Object o) {
		return super.equals(o) || o == this.vanillaPiston;
	}
}