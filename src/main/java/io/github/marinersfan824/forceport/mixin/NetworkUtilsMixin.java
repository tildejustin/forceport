package io.github.marinersfan824.forceport.mixin;

import net.minecraft.client.util.NetworkUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(NetworkUtils.class)
public abstract class NetworkUtilsMixin {
    /**
     * @author DuncanRuns
     * @reason Replace port with 25565
     */
    @Overwrite
    public static int method_2294() {
        return 25565;
    }
}
