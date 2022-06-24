package net.nokx.mustardutil.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nokx.mustardutil.MustardUtil;

public class MustardUtilItemGroup {
    public static final ItemGroup MUSTARDUTIL = FabricItemGroupBuilder.build(
            new Identifier(MustardUtil.MOD_ID, "mustardutil"), () -> new ItemStack(MustardUtilItems.LIGHTER));
}
