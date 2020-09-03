package xyz.nekogaming.mods.rei.reicheatkeybind;

import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import net.fabricmc.api.ModInitializer;

public class REICheatKeybind {
  public static final String MODID = "reicheatkeybind";
  public static final Logger LOGGER = LogManager.getLogger(MODID);

  public static Identifier id(String path) {
    return new Identifier(MODID, path);
  }

//  @Override
//  public void onInitialize() {
//
//  }
}
