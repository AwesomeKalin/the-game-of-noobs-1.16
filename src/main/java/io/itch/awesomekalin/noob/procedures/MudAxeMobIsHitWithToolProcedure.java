package io.itch.awesomekalin.noob.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import java.util.Map;

import io.itch.awesomekalin.noob.NoobMod;

public class MudAxeMobIsHitWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NoobMod.LOGGER.warn("Failed to load dependency entity for procedure MudAxeMobIsHitWithTool!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NoobMod.LOGGER.warn("Failed to load dependency itemstack for procedure MudAxeMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		entity.setCustomName(new StringTextComponent("Noobed"));
		(itemstack).setDisplayName(new StringTextComponent("HOW DARE YOU!"));
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"effect @p poison 5 5");
			}
		}
	}
}
