package io.github.marinersfan824.forceport.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PlayerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerManager.class)
public abstract class PlayerManagerMixin {
    @Shadow protected int maxPlayers;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void changeMaxPlayers(MinecraftServer server, CallbackInfo ci) {
        this.maxPlayers = Integer.MAX_VALUE;
    }
}
