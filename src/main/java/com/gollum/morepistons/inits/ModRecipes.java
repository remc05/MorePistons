package com.gollum.morepistons.inits;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	/**
	 * Ajout des recettes
	 */
	public static void init () {

		////////////////////
		// Vanilla Piston //
		////////////////////
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockPistonBase, Character.valueOf('Y'), Item.slimeBall });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDoublePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockPistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDoubleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockStickyPistonBase });
		
		////////////////////
		// Classic Piston //
		////////////////////
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDoublePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), Block.pistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDoubleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockDoublePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDoubleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), Block.pistonStickyBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTriplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockDoublePistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTripleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockTriplePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTripleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockDoubleStickyPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockQuadruplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockTriplePistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockQuadrupleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockQuadruplePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockQuadrupleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockTripleStickyPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockQuintuplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockQuadruplePistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockQuintupleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockQuintuplePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockQuintupleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockQuadrupleStickyPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSextuplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockQuintuplePistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSextupleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockSextuplePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSextupleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockQuintupleStickyPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSeptuplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSextuplePistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSeptupleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockSeptuplePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSeptupleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSextupleStickyPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockOctuplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSeptuplePistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockOctupleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockOctuplePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockOctupleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSeptupleStickyPistonBase });

		//////////////////
		// Super Piston //
		//////////////////
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperPistonBase, 1), new Object[] { "WWW", "CIC", "ORO", Character.valueOf('W'), Block.planks, Character.valueOf('C'), Block.cobblestone, Character.valueOf('I'), Item.ingotIron, Character.valueOf('O'), Block.obsidian, Character.valueOf('R'), Item.redstone });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperStickyPistonBase, 1), new Object[] { "S", "P", Character.valueOf('S'), Item.slimeBall, Character.valueOf('P'), ModBlocks.blockSuperPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperDoublePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperPistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperDoubleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockSuperDoublePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperDoubleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperStickyPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperTriplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperDoublePistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperTripleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockSuperTriplePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperTripleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperDoubleStickyPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperQuadruplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperTriplePistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperQuadrupleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockSuperQuadruplePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperQuadrupleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperTripleStickyPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperQuintuplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperQuadruplePistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperQuintupleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockSuperQuintuplePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperQuintupleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperQuadrupleStickyPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperSextuplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperQuintuplePistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperSextupleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockSuperSextuplePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperSextupleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperQuintupleStickyPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperSeptuplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperSextuplePistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperSeptupleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockSuperSeptuplePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperSeptupleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperSextupleStickyPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperOctuplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperSeptuplePistonBase });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperOctupleStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockSuperOctuplePistonBase, Character.valueOf('Y'), Item.slimeBall });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSuperOctupleStickyPistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockSuperSeptupleStickyPistonBase });
		
		////////////////////
		// Manetic Piston //
		////////////////////
		
		GameRegistry.addRecipe(
			new ItemStack(ModItems.itemMagnet, 1), 
			new Object[] {
				"R L",
				"I I",
				" I ",
				Character.valueOf('R'), Item.redstone,
				Character.valueOf('L'), new ItemStack(Item.dyePowder, 1, 4),
				Character.valueOf('I'), Item.ingotIron,
			}
		);
		
		GameRegistry.addRecipe(
			new ItemStack(ModItems.itemMagnet, 1), 
			new Object[] {
				"L R",
				"I I",
				" I ",
				Character.valueOf('R'), Item.redstone,
				Character.valueOf('L'), new ItemStack(Item.dyePowder, 1, 4),
				Character.valueOf('I'), Item.ingotIron,
			}
		);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), Block.pistonBase         , Character.valueOf('Y'), ModItems.itemMagnet });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockPistonBase, Character.valueOf('Y'), ModItems.itemMagnet });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticDoublePistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockDoublePistonBase, Character.valueOf('Y'), ModItems.itemMagnet });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticDoublePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockMagneticPistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticTriplePistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockTriplePistonBase, Character.valueOf('Y'), ModItems.itemMagnet });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticTriplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockMagneticDoublePistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticQuadruplePistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockQuadruplePistonBase, Character.valueOf('Y'), ModItems.itemMagnet });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticQuadruplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockMagneticTriplePistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticQuintuplePistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockQuintuplePistonBase, Character.valueOf('Y'), ModItems.itemMagnet });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticQuintuplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockMagneticQuadruplePistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticSextuplePistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockSextuplePistonBase, Character.valueOf('Y'), ModItems.itemMagnet });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticSextuplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockMagneticQuintuplePistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticSeptuplePistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockSeptuplePistonBase, Character.valueOf('Y'), ModItems.itemMagnet });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticSeptuplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockMagneticSextuplePistonBase });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticOctuplePistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockOctuplePistonBase, Character.valueOf('Y'), ModItems.itemMagnet });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMagneticOctuplePistonBase, 1), new Object[] { "XXX", " Y ", " Z ", Character.valueOf('X'), Block.planks, Character.valueOf('Y'), Item.ingotIron, Character.valueOf('Z'), ModBlocks.blockMagneticSeptuplePistonBase });
		

		
		//////////////////////////
		// Gravitational Piston //
		//////////////////////////
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockGravitationalPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), Block.pistonBase, Character.valueOf('Y'), Block.tnt });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockGravitationalStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockGravitationalPistonBase, Character.valueOf('Y'), Item.slimeBall });
		
		////////////////////
		// Redston Piston //
		////////////////////
		
		
		GameRegistry.addRecipe(
		new ItemStack(ModBlocks.blockRedStonePistonBase, 1),
			new Object[] {
				"XXX",
				"DRE",
				" Y ",
				Character.valueOf('X'), Block.planks,
				Character.valueOf('D'), Item.diamond,
				Character.valueOf('E'), Item.emerald,
				Character.valueOf('R'), Item.redstoneRepeater,
				Character.valueOf('Y'), ModBlocks.blockOctuplePistonBase
			}
		);
		GameRegistry.addRecipe(
			new ItemStack(ModBlocks.blockRedStonePistonBase, 1),
			new Object[] {
				"XXX",
				"ERD",
				" Y ",
				Character.valueOf('X'), Block.planks,
				Character.valueOf('D'), Item.diamond,
				Character.valueOf('E'), Item.emerald,
				Character.valueOf('R'), Item.redstoneRepeater,
				Character.valueOf('Y'), ModBlocks.blockOctuplePistonBase
			}
		);
		GameRegistry.addRecipe(
		new ItemStack(ModBlocks.blockRedStoneStickyPistonBase, 1),
			new Object[] {
				"XXX",
				"ERD",
				" Y ",
				Character.valueOf('X'), Block.planks,
				Character.valueOf('D'), Item.diamond,
				Character.valueOf('E'), Item.emerald,
				Character.valueOf('R'), Item.redstoneRepeater,
				Character.valueOf('Y'), ModBlocks.blockOctupleStickyPistonBase
			}
		);
		GameRegistry.addRecipe(
		new ItemStack(ModBlocks.blockRedStoneStickyPistonBase, 1),
			new Object[] {
				"XXX",
				"DRE",
				" Y ",
				Character.valueOf('X'), Block.planks,
				Character.valueOf('D'), Item.diamond,
				Character.valueOf('E'), Item.emerald,
				Character.valueOf('R'), Item.redstoneRepeater,
				Character.valueOf('Y'), ModBlocks.blockOctupleStickyPistonBase
			}
		);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockRedStoneStickyPistonBase, 1), new Object[] { "Y", "X", Character.valueOf('X'), ModBlocks.blockRedStonePistonBase, Character.valueOf('Y'), Item.slimeBall });
		
	}
}
