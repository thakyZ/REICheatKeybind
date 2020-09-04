package xyz.nekogaming.mods.rei.reicheatkeybind.api;

import me.shedaniel.clothconfig2.api.Modifier;
import me.shedaniel.clothconfig2.api.ModifierKeyCode;
import net.minecraft.client.util.InputUtil;

public class REICheatKeybindConfig {
  public static class Config {
    public ModifierKeyCode keybind;

    public Config() {
      keybind = ModifierKeyCode.of(InputUtil.fromName("key.keyboard.keypad.divide"), Modifier.of(false, false, false));
    }
  }
}
