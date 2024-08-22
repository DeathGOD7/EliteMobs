package com.magmaguy.elitemobs.config.custombosses.premade;

import com.magmaguy.elitemobs.config.custombosses.CustomBossesConfigFields;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OmegaWolfBoss extends CustomBossesConfigFields {
    public OmegaWolfBoss() {
        super("omega_wolf",
                EntityType.WOLF,
                true,
                "$reinforcementLevel &7Omega Wolf",
                "dynamic");
        setPowers(new ArrayList<>(List.of("attack_poison.yml", "moonwalk.yml")));
        HashMap<Material, Double> damageModifiers = new HashMap<>();
        damageModifiers.put(Material.IRON_SWORD, 2D);
        damageModifiers.put(Material.IRON_AXE, 2D);
        setDamageModifiers(damageModifiers);
        setFollowDistance(100);
    }
}
