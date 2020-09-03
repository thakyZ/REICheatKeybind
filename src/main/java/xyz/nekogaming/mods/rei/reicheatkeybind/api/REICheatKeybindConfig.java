package xyz.nekogaming.mods.rei.reicheatkeybind.api;

import me.shedaniel.clothconfig2.api.Modifier;
import me.shedaniel.clothconfig2.api.ModifierKeyCode;
import net.minecraft.client.util.InputUtil;

public class REICheatKeybindConfig {
  public static class Config {
    public ModifierKeyCode RCK_keybind;

    public Config() {
      RCK_keybind = ModifierKeyCode.of(InputUtil.Type.KEYSYM.createFromCode(181), Modifier.of(false, false, false));
    }
  }
}
