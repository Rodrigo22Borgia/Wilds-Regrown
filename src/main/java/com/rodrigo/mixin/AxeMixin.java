package com.rodrigo.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.AxeItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

import static com.rodrigo.block.WRBlocks.STRIPPED;

@Mixin(AxeItem.class)
public class AxeMixin {
	@Inject(at = @At("TAIL"), method = "getStrippedState", cancellable = true)
	private void getStrippedState(BlockState state, CallbackInfoReturnable<Optional<BlockState>> cir) {
		if (cir.getReturnValue().isEmpty()) {
			cir.setReturnValue(Optional.ofNullable(STRIPPED.get(state.getBlock())).map((block) -> block.getDefaultState().with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)))
		);}
	}
}