/*
 * This file is part of the IDNCTST project, licensed under the
 * GNU Lesser General Public License v3.0
 *
 * Copyright (C) 2023  Fallen_Breath and contributors
 *
 * IDNCTST is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * IDNCTST is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with IDNCTST.  If not, see <https://www.gnu.org/licenses/>.
 */

package Crystal0404.IDNCTST.mixins;

import net.minecraft.server.network.ServerPlayNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.time.Instant;

@Mixin(ServerPlayNetworkHandler.class)
public class out_of_order_chat_mixin {
    @Inject(method = "isInProperOrder", at = @At("HEAD"), cancellable = true)
    private void isInProperOrder(Instant timestamp, CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(true);
    }
}
