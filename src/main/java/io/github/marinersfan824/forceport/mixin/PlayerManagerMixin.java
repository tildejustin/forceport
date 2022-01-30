package io.github.marinersfan824.forceport.mixin;

import net.minecraft.server.PlayerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerManager.class)
public abstract class PlayerManagerMixin {
    @Inject(method = "getMaxPlayerCount", at = @At("TAIL"), cancellable = true)
    private void changeMaxPlayers(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(20);
    }
}
