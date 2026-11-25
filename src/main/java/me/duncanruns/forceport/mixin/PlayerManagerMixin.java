package me.duncanruns.forceport.mixin;

import net.minecraft.server.PlayerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(PlayerManager.class)
public abstract class PlayerManagerMixin {
    /**
     * @author AppDevMichael
     * @reason Replace the default 8 player limit with maximum integer value
     */
    @ModifyConstant(method = "<init>*", constant = @Constant(intValue = 8))
    private static int changeMaxPlayers(int maxPlayers) {
        return Integer.MAX_VALUE;
    }
}
