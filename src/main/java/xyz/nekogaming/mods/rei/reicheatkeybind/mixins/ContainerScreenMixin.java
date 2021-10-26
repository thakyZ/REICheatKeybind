package xyz.nekogaming.mods.rei.reicheatkeybind.mixins;

import me.shedaniel.rei.api.client.config.ConfigManager;
import me.shedaniel.rei.api.client.config.ConfigObject;
import me.shedaniel.rei.impl.client.gui.ScreenOverlayImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.nekogaming.mods.rei.reicheatkeybind.api.ICustomConfig;
import xyz.nekogaming.mods.rei.reicheatkeybind.api.REICheatKeybindConfig;

@Mixin(ScreenOverlayImpl.class)
public abstract class ContainerScreenMixin {
  @Inject(at = @At("HEAD"), cancellable = true, method = "keyPressed(III)Z")
  public void keyPress(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir) {
    if (ConfigObject.getInstance() instanceof ICustomConfig) {
      REICheatKeybindConfig.Config config = ((ICustomConfig) ConfigObject.getInstance()).RCK_getConfig();
      if (config.keybind.matchesKey(keyCode, scanCode)) {
        ConfigManager.getInstance().getConfig().setCheating(!ConfigManager.getInstance().getConfig().isCheating());
      }
    }
  }
}
