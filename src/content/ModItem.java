package content;

import mindustry.type.Item;

public class ModItem {
    public static Item copper;
    public static void load(){
        copper = new Item("copper"){{}};
    }

}
