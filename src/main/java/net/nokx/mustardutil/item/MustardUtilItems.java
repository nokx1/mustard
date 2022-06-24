package net.nokx.mustardutil.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nokx.mustardutil.MustardUtil;
import net.nokx.mustardutil.item.custom.RemoteItem;
import net.nokx.mustardutil.item.custom.WireCuttersItem;

public class MustardUtilItems {

    //crafting items
    public static final Item EXPLOSIVE = registerItem("explosive",
            new Item(new FabricItemSettings().group(MustardUtilItemGroup.MUSTARDUTIL)));
    //tools
    public static final Item LIGHTER = registerItem("lighter",
            new FlintAndSteelItem(new FabricItemSettings().group(MustardUtilItemGroup.MUSTARDUTIL)));

    //utility items
    public static final Item REMOTE = registerItem("remote",
            new RemoteItem(new FabricItemSettings().group(MustardUtilItemGroup.MUSTARDUTIL).maxCount(1)));
    public static final Item WIRE_CUTTERS = registerItem("wire_cutters",
            new WireCuttersItem(new FabricItemSettings().group(MustardUtilItemGroup.MUSTARDUTIL).maxCount(1)));


    //food
    public static final Item CHOCOLATE_BAR = registerItem("chocolate_bar",
            new Item(new FabricItemSettings().group(MustardUtilItemGroup.MUSTARDUTIL).food(MustardUtilFoodComponents.CHOCOLATE_BAR)));
    public static final Item DONUT = registerItem("donut",
            new Item(new FabricItemSettings().group(MustardUtilItemGroup.MUSTARDUTIL).food(MustardUtilFoodComponents.DONUT)));
    public static final Item PINEAPPLE = registerItem("pineapple",
            new Item(new FabricItemSettings().group(MustardUtilItemGroup.MUSTARDUTIL).food(MustardUtilFoodComponents.PINEAPPLE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MustardUtil.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MustardUtil.LOGGER.debug("Registering Mod Items for " + MustardUtil.MOD_ID);

    }

}
