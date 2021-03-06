package com.tenjava.entries.xJeremyCx.t1;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemsFactory {
    //Create items

    public static ItemStack getWarAxe() {
        ItemStack i = new ItemStack(Material.IRON_AXE);
        ItemMeta im = i.getItemMeta();
        im.setDisplayName(ChatColor.GREEN + "WarAxe");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "Rocket target to the sky when hit!");
        im.setLore(lore);
        i.setItemMeta(im);
        return i;
    }

    public static ItemStack getMultiShoots() {
        ItemStack i = new ItemStack(Material.BOW);
        ItemMeta im = i.getItemMeta();
        im.setDisplayName(ChatColor.GREEN + "MultiShoots");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "Target and click to shoot!");
        im.setLore(lore);
        i.setItemMeta(im);
        return i;
    }

    public static ItemStack getEnderStick() {
        ItemStack i = new ItemStack(Material.STICK);
        ItemMeta im = i.getItemMeta();
        im.setDisplayName(ChatColor.GREEN + "EnderSticks");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.RED + "Click a player to use it!");
        lore.add(ChatColor.DARK_RED + "Causing really high damage!");
        im.setLore(lore);
        i.setItemMeta(im);
        return i;
    }
}
