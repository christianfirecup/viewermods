package firecup.mods.viewmods.item;

import firecup.mods.viewmods.Viewmods;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class VMCreativeTab {
    public static final ItemGroup VMODS = FabricItemGroupBuilder.build(new Identifier(Viewmods.MOD_ID, "viewermodsgroup"), () -> new ItemStack(ViewerItems.STONESTICK));
}
