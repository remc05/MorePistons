package mods.morepistons.common.block;

import java.util.Random;

import mods.morepistons.common.ModMorePistons;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockMorePistonsRedStone extends BlockMorePistonsBase {
	
	private boolean ignoreUpdates = false;
	public  int maxBlockMove = 12;
	
	private Icon textureFileSide1;
	private Icon textureFileSide2;
	private Icon textureFileSide3;
	private Icon textureFileSide4;
	private Icon textureFileSide5;
	private Icon textureFileSide6;
	private Icon textureFileSide7;
	private Icon textureFileSide8;
	
	private int mutiplicateur = 1;
	
	/**
	 * Constructeur
	 * @param id
	 * @param flag
	 * @param texturePrefixe
	 */
	public BlockMorePistonsRedStone(int id, boolean flag, String texturePrefixe) {
		super(id, flag, texturePrefixe);
		
		setCreativeTab(null);
	}
	
	public BlockMorePistonsRedStone setMultiplicateur (int mutiplicateur) {
		this.mutiplicateur = mutiplicateur;
		return this;
	}

	public int idDropped(int par1, Random par2Random, int par3) {
		return ModMorePistons.blockRedStonePistonBase1.blockID;
	}
	
	//////////////////////////
	// Gestion des textures //
	//////////////////////////
	
	
	/**
	 * Enregistre les textures
	 * Depuis la 1.5 on est obligé de charger les texture fichier par fichier
	 */
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.textureFileTop       = this.loadTexture(iconRegister, ModMorePistons.PATH_TEXTURES + "top");
		this.textureFileTopSticky = this.loadTexture(iconRegister, ModMorePistons.PATH_TEXTURES + "top_sticky");
		this.textureFileOpen      = this.loadTexture(iconRegister, ModMorePistons.PATH_TEXTURES + this.texturePrefixe + "top");
		this.textureFileBottom    = this.loadTexture(iconRegister, ModMorePistons.PATH_TEXTURES + this.texturePrefixe + "bottom");
		this.textureFileSide1     = this.loadTexture(iconRegister, ModMorePistons.PATH_TEXTURES + this.texturePrefixe + "side_1");
		this.textureFileSide2     = this.loadTexture(iconRegister, ModMorePistons.PATH_TEXTURES + this.texturePrefixe + "side_2");
		this.textureFileSide3     = this.loadTexture(iconRegister, ModMorePistons.PATH_TEXTURES + this.texturePrefixe + "side_3");
		this.textureFileSide4     = this.loadTexture(iconRegister, ModMorePistons.PATH_TEXTURES + this.texturePrefixe + "side_4");
		this.textureFileSide5     = this.loadTexture(iconRegister, ModMorePistons.PATH_TEXTURES + this.texturePrefixe + "side_5");
		this.textureFileSide6     = this.loadTexture(iconRegister, ModMorePistons.PATH_TEXTURES + this.texturePrefixe + "side_6");
		this.textureFileSide7     = this.loadTexture(iconRegister, ModMorePistons.PATH_TEXTURES + this.texturePrefixe + "side_7");
		this.textureFileSide8     = this.loadTexture(iconRegister, ModMorePistons.PATH_TEXTURES + this.texturePrefixe + "side_8");
		
		this.textureFileSide     = this.textureFileSide1;
	}
	
	
	public Icon getIcon (int i, int j) {
		
		switch (this.getMutiplicateur ()) {
			case 1: this.textureFileSide     = this.textureFileSide1;  break;
			case 2: this.textureFileSide     = this.textureFileSide2;  break;
			case 3: this.textureFileSide     = this.textureFileSide3;  break;
			case 4: this.textureFileSide     = this.textureFileSide4;  break;
			case 5: this.textureFileSide     = this.textureFileSide5;  break;
			case 6: this.textureFileSide     = this.textureFileSide6;  break;
			case 7: this.textureFileSide     = this.textureFileSide7;  break;
			case 8: this.textureFileSide     = this.textureFileSide8;  break;
			default: this.textureFileSide     = this.textureFileSide1; break;
		}
		
		return super.getIcon(i, j);
	}
	
	
	///////////////////////////////////
	// Gestion du signal de redstone //
	///////////////////////////////////
	
	/**
	 * @param int metadata
	 * @return int mutiplicateur
	 */
	public int getMutiplicateur () {
		return this.mutiplicateur;
	}
	
	/**
	 * Applique le bon multiplicateur
	 * @param par1World
	 * @param par2
	 * @param par3
	 * @param par4
	 * @param multi
	 */
	public void applyMutiplicateur (World world, int x, int y, int z, int multi) {
		
		int metadata = world.getBlockMetadata(x, y, z);
		BlockMorePistonsRedStone newBlock = null;
		
		if (this.isSticky) {
			
			switch (multi) {
				case 1:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStoneStickyPistonBase1;  break;
				case 2:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStoneStickyPistonBase2;  break;
				case 3:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStoneStickyPistonBase3;  break;
				case 4:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStoneStickyPistonBase4;  break;
				case 5:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStoneStickyPistonBase5;  break;
				case 6:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStoneStickyPistonBase6;  break;
				case 7:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStoneStickyPistonBase7;  break;
				case 8:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStoneStickyPistonBase8;  break;
				default: newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStoneStickyPistonBase1;  break;
			}
		} else {
			switch (multi) {
				case 1:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStonePistonBase1;  break;
				case 2:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStonePistonBase2;  break;
				case 3:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStonePistonBase3;  break;
				case 4:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStonePistonBase4;  break;
				case 5:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStonePistonBase5;  break;
				case 6:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStonePistonBase6;  break;
				case 7:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStonePistonBase7;  break;
				case 8:  newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStonePistonBase8;  break;
				default: newBlock = (BlockMorePistonsRedStone) ModMorePistons.blockRedStonePistonBase1;  break;
			}
		}
		world.setBlock(x, y, z, newBlock.blockID);
		world.setBlockMetadataWithNotify(x, y, z, metadata, 2);
		
		newBlock.updatePistonState(world, x, y, z, true);
		
	}

	////////////////////////
	// Gestion des events //
	////////////////////////
	
	/**
	 * Affecte la taille du piston
	 * @param length
	 * @return
	 */
	public int getLengthInWorld(World world, int x, int y, int z, int orientation) {
		int power = 0;
		int multi    = getMutiplicateur();
		
		if (this.isIndirectlyPowered(world, x, y, z, orientation)) {
			
			power = world.getBlockPowerInput(x, y, z);
			
			power = (power <= 0) ? 16 : power;
			power = (power > 16) ? 16 : power;
		}
		
		return power*multi;
	}
	
	/**
	 * Called upon block activation (right click on the block.)
	 */
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer par5EntityPlayer, int faceClicked, float par7, float par8, float par9)  {
		int metadata = world.getBlockMetadata(x, y, z);
		int orientation = this.getOrientation(metadata);
		if (faceClicked == orientation) {
			return false;
		}
		
		int multi = getMutiplicateur() % 8 + 1;
		applyMutiplicateur(world, x, y, z, multi);
		world.playSoundEffect((double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, "random.click", 0.3F, 0.6F);
		
		return true;
	}
	
}