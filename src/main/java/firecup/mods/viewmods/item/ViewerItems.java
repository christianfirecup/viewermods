package firecup.mods.viewmods.item;

import firecup.mods.viewmods.Viewmods;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ViewerItems {
    public static final Item STONESTICK = registeritem("stone_stick" , new Item(new FabricItemSettings().group(VMCreativeTab.VMODS)));



    private static Item registeritem(String name, Item item){
        return Registry.register(Registry.ITEM,new Identifier(Viewmods.MOD_ID, name), item);
    }
    public static void registermoditems(){
        Viewmods.LOGGER.debug("Reg items for " + Viewmods.MOD_ID);
    }

}
