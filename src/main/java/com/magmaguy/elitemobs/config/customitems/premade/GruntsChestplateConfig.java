package com.magmaguy.elitemobs.config.customitems.premade;

import com.magmaguy.elitemobs.config.customitems.CustomItemsConfigFields;
import com.magmaguy.elitemobs.items.customitems.CustomItem;
import org.bukkit.Material;

import java.util.Arrays;

public class GruntsChestplateConfig extends CustomItemsConfigFields {
    public GruntsChestplateConfig() {
        super("grunts_chestplate", true, Material.IRON_CHESTPLATE, "&fGrunt's Chestplate", Arrays.asList("&2Awarded to those who challenge the", "&2Wood League Arena!"));
        setEnchantments(Arrays.asList("PROTECTION,5", "PROJECTILE_PROTECTION,4", "UNBREAKING,5"));
        setItemType(CustomItem.ItemType.UNIQUE);
        setLevel(20);
    }
}
