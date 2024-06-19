package com.magmaguy.elitemobs.config.customitems.premade;

import com.magmaguy.elitemobs.config.customitems.CustomItemsConfigFields;
import com.magmaguy.elitemobs.items.customitems.CustomItem;
import org.bukkit.Material;

import java.util.Arrays;
import java.util.List;

public class InvictusBootsConfig extends CustomItemsConfigFields {
    public InvictusBootsConfig() {
        super("invictus_boots", true, Material.NETHERITE_BOOTS, "&4Invictus Boots", Arrays.asList("&2Awarded to the champions of the", "&2Wood League Arena!"));
        setEnchantments(Arrays.asList("PROTECTION,5", "BLAST_PROTECTION,4", "PROJECTILE_PROTECTION,4", "MENDING,1", "UNBREAKING,5"));
        setPotionEffects(List.of("SPEED,0,self,continuous"));
        setItemType(CustomItem.ItemType.UNIQUE);
        setLevel(50);
    }
}
