package com.gollum.morepistons.common.block;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;

public class BlockMorePistonsVanilla extends BlockMorePistonsBase {
	
	public BlockMorePistonsVanilla(String registerName, boolean isSticky) {
		super(registerName, isSticky);
		this.setBlockName((isSticky ? Blocks.sticky_piston.getUnlocalizedName() : Blocks.piston.getUnlocalizedName()).replace("tile.", ""));
	}
	
	@Override protected void registerBlockIconsTop   (IIconRegister iconRegister) { this.iconTop    = iconRegister.registerIcon(this.isSticky ? "piston_top_sticky" : "piston_top_normal"); }
	@Override protected void registerBlockIconsOpen  (IIconRegister iconRegister) { this.iconOpen   = iconRegister.registerIcon("piston_inner");   }
	@Override protected void registerBlockIconsBottom(IIconRegister iconRegister) { this.iconBottom = iconRegister.registerIcon("piston_bottom"); }
	@Override protected void registerBlockIconsSide  (IIconRegister iconRegister) { this.blockIcon  = iconRegister.registerIcon("piston_side");   }
	
}
