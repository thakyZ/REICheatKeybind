package xyz.nekogaming.mods.rei.reicheatkeybind.api;

import me.shedaniel.rei.api.ConfigObject;

public interface ICustomConfig {
  static REICheatKeybindConfig.Config getConfig() {
    return ((ICustomConfig) ConfigObject.getInstance()).RCK_getConfig();
  }

  REICheatKeybindConfig.Config RCK_getConfig();
}
