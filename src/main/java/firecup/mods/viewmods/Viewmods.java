package firecup.mods.viewmods;

import firecup.mods.viewmods.item.ViewerItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Viewmods implements ModInitializer {
    public static final String MOD_ID = "viewmods";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ViewerItems.registermoditems();

    }
}
