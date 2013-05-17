package mods.morePistons.common;

import net.minecraft.block.Block; //amq;

public class MorePistonsBlocks {
	
	public MorePistonsBlocks() {

		MorePistons.doublePistonBase              = new BlockMorePistonBase (ModMorePistons.idBlockDoublePistonBase      , false, "double_").setLength (2);
		MorePistons.doubleStickyPistonBase        = new BlockMorePistonBase (ModMorePistons.idBlockDoubleStickyPistonBase, true , "double_").setLength (2);
		MorePistons.triplePistonBase              = new BlockMorePistonBase (ModMorePistons.idBlockTriplePistonBase      , false, "triple_").setLength (3);
		MorePistons.tripleStickyPistonBase        = new BlockMorePistonBase (ModMorePistons.idBlockTripleStickyPistonBase, true, "triple_").setLength (3);
		MorePistons.quadruplePistonBase           = new BlockMorePistonBase (ModMorePistons.idBlockQuadPistonBase        , false, "quad_").setLength (4);
		MorePistons.quadrupleStickyPistonBase     = new BlockMorePistonBase (ModMorePistons.idBlockQuadStickyPistonBase  , true, "quad_").setLength (4);
		MorePistons.quintuplePistonBase           = new BlockMorePistonBase (ModMorePistons.idBlockQuintPistonBase        , false, "quint_").setLength (5);
		MorePistons.quintupleStickyPistonBase     = new BlockMorePistonBase (ModMorePistons.idBlockQuintStickyPistonBase  , true, "quint_").setLength (5);
		MorePistons.gravitationalPistonBase       = new BlockGravitationalPistonBase(ModMorePistons.idBlockGravitationalPistonBase, false);
		MorePistons.gravitationalStickyPistonBase = new BlockGravitationalPistonBase(ModMorePistons.idBlockGravitationalStickyPistonBase, true);
		
		MorePistons.superPistonBase       = new BlockSuperPistonBase(ModMorePistons.idBlockStrongPistonBase, false);
		MorePistons.superStickyPistonBase = new BlockSuperPistonBase(ModMorePistons.idBlockStrongStickyPistonBase, true);
		
		MorePistons.pistonExtension = new BlockMorePistonsExtension(ModMorePistons.idBlockPistonExtension);
		MorePistons.pistonRod       = new BlockPistonRod(ModMorePistons.idBlockPistonRod);
		
	}
}