package io.github.marinersfan824.forceport.mixin;

import io.github.marinersfan824.forceport.ForcePort;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.util.NetworkUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(NetworkUtils.class)
public abstract class NetworkUtilsMixin {
    /**
     * @author DuncanRuns
     * @reason Replace port with 25565
     */
    @Environment(EnvType.CLIENT)
    @Overwrite
    public static int findLocalPort() {
        return ForcePort.port;
    }
}
