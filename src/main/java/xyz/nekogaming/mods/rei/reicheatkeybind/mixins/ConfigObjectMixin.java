package xyz.nekogaming.mods.rei.reicheatkeybind.mixins;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.rei.api.client.config.ConfigObject;
import me.shedaniel.rei.impl.client.config.ConfigObjectImpl;
import org.spongepowered.asm.mixin.Mixin;
import xyz.nekogaming.mods.rei.reicheatkeybind.REICheatKeybind;
import xyz.nekogaming.mods.rei.reicheatkeybind.api.ICustomConfig;
import xyz.nekogaming.mods.rei.reicheatkeybind.api.REICheatKeybindConfig;

@Mixin(ConfigObjectImpl.class)
public abstract class ConfigObjectMixin implements ConfigObject, ConfigData, ICustomConfig {
  @ConfigEntry.Category(REICheatKeybind.MODID)
  @ConfigEntry.Gui.TransitiveObject
  public REICheatKeybindConfig.Config reicheatkeybind = new REICheatKeybindConfig.Config();

  @Override
  public REICheatKeybindConfig.Config RCK_getConfig() {
    return reicheatkeybind;
  }
}
