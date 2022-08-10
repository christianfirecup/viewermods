package firecup.mods.viewmods.block;

import firecup.mods.viewmods.Viewmods;
import firecup.mods.viewmods.item.VMCreativeTab;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ViewerBlock {
    public static final Block TESTBLOCK = registerblock("testblock", new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), VMCreativeTab.VMODS);


private static Block registerblock(String name, Block block, ItemGroup tab){
        registerblockitem(name, block, tab);
    return Registry.register(Registry.BLOCK, new Identifier(Viewmods.MOD_ID, name), block);
}
  private static Item registerblockitem(String name, Block block, ItemGroup tab){
      return Registry.register(Registry.ITEM, new Identifier(Viewmods.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
  }

    public static void registermodblocks(){
        Viewmods.LOGGER.debug("Reg blocks for " + Viewmods.MOD_ID);
    }
}
