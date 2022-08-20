package com.flansmod.common.teams;

import java.util.ArrayList;

import net.minecraft.client.model.ModelBase;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class ArmourType extends InfoType
{
	public static ArrayList<ArmourType> armours = new ArrayList<>();
	
	/**
	 * 0 = Helmet, 1 = Chestplate, 2 = Legs, 3 = Shoes
	 */
	public int type;
	/**
	 * The amount of damage to absorb. From 0 to 1. Stacks additively between armour pieces
	 */
	public double defence;
	
	public int DamageReductionAmount;
	// < 0 durability = infinite
	public int Durability;
	// Armour toughness, like diamond
	public int Toughness;
	// Enchantability, optional
	public int Enchantability = 10;
	
	/**
     * The amount of damage to absorb. From 0 to 1. Stacks additively between armour
     * pieces. For bullet damage specifically.
     */
    public double bulletDefence;

    /**
     * How good the armour is at stopping bullets. Same units as bullet penetration. Default 0 to emulate previous behaviour
     */
    public float penetrationResistance = 0;
    /**
     * The name for the armour texture. Texture path/name is assets/flansmod/armor/<armourTextureName>_1.png or _2 for legs
     */
	
	/**
	 * The name for the armour texture. Texture path/name is assets/flansmod/armor/<armourTextureName>_1.png or _2 for legs
	 */
	public String armourTextureName;
	/**
	 * Modifiers for various player stats
	 */
	public float moveSpeedModifier = 1F, knockbackModifier = 0.2F, jumpModifier = 1F;
	/**
	 * If true, then the player gets a night vision buff every couple of seconds
	 */
	public boolean nightVision = false;
	 /**
     * If true, then the player gets a invisiblity buff every couple of seconds
     */
    public boolean invisible = false;
	/**
	 * The overlay to display when using this helmet. Textures are pulled from the scopes directory
	 */
	public String overlay = null;
	/**
	 * If true, then smoke effects from grenades will have no effect on players wearing this
	 */
	public boolean smokeProtection = false;
	/**
	 * If ture, the player will not receive fall damage
	 */
	public boolean negateFallDamage = false;
	/**
     * If true, the player will not receive fire damage
     */
    public boolean fireResistance = false;
    /**
     * If true, the player can breath under water
     */
    public boolean waterBreathing = false;
    /**
     * If true, the player can walk on water
     */
    public boolean onWaterWalking = false;
    /**
     * If true, the armor has durability
     */
    public boolean hasDurability = false;
    /**
     * The durability for the piece of armor
     */
    public int durability = 0;
	
	@SideOnly(Side.CLIENT)
	public ModelCustomArmour model;
	
	public ArmourType(TypeFile file)
	{
		super(file);
		armours.add(this);
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
			{
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelCustomArmour.class);
				model.type = this;
			}
			if(split[0].equals("Type"))
			{
				if(split[1].equals("Hat") || split[1].equals("Helmet"))
					type = 0;
				if(split[1].equals("Chest") || split[1].equals("Body"))
					type = 1;
				if(split[1].equals("Legs") || split[1].equals("Pants"))
					type = 2;
				if(split[1].equals("Shoes") || split[1].equals("Boots"))
					type = 3;
			}
			
			defence = Read(split, "DamageReduction", defence);
			defence = Read(split, "Defence", defence);
			if (split[0].equals("DamageReduction") || split[0].equals("Defence"))
            {
                bulletDefence = defence;
            }
			bulletDefence = Read(split, "BulletDefence", bulletDefence);
			defence = Read(split, "OtherDefence", defence);
			moveSpeedModifier = Read(split, "MoveSpeedModifier", moveSpeedModifier);
			moveSpeedModifier = Read(split, "Slowness", moveSpeedModifier);
			jumpModifier = Read(split, "JumpModifier", jumpModifier);
			knockbackModifier = Read(split, "KnockbackReduction", knockbackModifier);
			knockbackModifier = Read(split, "KnockbackModifier", knockbackModifier);
			penetrationResistance = Read(split, "PenetrationResistance", penetrationResistance);
			nightVision = Read(split, "NightVision", nightVision);
			invisible = Read(split, "Invisible", invisible);
			negateFallDamage = Read(split, "NegateFallDamage", negateFallDamage);
			fireResistance = Read(split, "FireResistance", fireResistance);
			waterBreathing = Read(split, "WaterBreathing", waterBreathing);
			overlay = Read(split, "Overlay", overlay);
			smokeProtection = Read(split, "SmokeProtection", smokeProtection);
			onWaterWalking = Read(split, "OnWaterWalking", onWaterWalking);
			durability = Read(split, "Durability", durability);
			if (split[0].equals("Durability")) 
			{
                hasDurability = durability > 0;
            }
			armourTextureName = Read(split, "ArmourTexture", armourTextureName);
			armourTextureName = Read(split, "ArmorTexture", armourTextureName);
			Enchantability = Read(split, "Enchantability", Enchantability);
			Toughness = Read(split, "Toughness", Toughness);
			Durability = Read(split, "Durability", Durability);
			DamageReductionAmount = Read(split, "DamageReductionAmount", DamageReductionAmount);
			
		}
		catch(Exception e)
		{
			FlansMod.log.error("Reading armour file failed : " + this.shortName + " from pack " + this.packName);
			FlansMod.log.throwing(e);
		}
	}
	
	public static ArmourType getArmourType(String string)
	{
		for(ArmourType armour : armours)
		{
			if(armour.shortName.equals(string))
				return armour;
		}
		return null;
	}
	
	/**
	 * To be overriden by subtypes for model reloading
	 */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelCustomArmour.class);
		if(model != null)
			model.type = this;
	}
	
	@Override
	protected void preRead(TypeFile file)
	{
	}
	
	@Override
	protected void postRead(TypeFile file)
	{
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel()
	{
		return model;
	}
	
	@Override
    public float GetRecommendedScale() {
        return 50.0f;
    }
}
