package net.nokx.mustardutil.item;

import net.minecraft.item.FoodComponent;

public class MustardUtilFoodComponents {
    public static final FoodComponent DONUT = (new FoodComponent.Builder()).hunger(3).saturationModifier(1.0F).build();
    public static final FoodComponent CHOCOLATE_BAR = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.5F).build();
    public static final FoodComponent PINEAPPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.7F).build();

}
