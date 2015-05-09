package io.github.hsyyid;

import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandResult;
import org.spongepowered.api.util.command.CommandSource;
import org.spongepowered.api.util.command.args.CommandContext;
import org.spongepowered.api.util.command.spec.CommandExecutor;

public class KitAddExecutor implements CommandExecutor {
	
	public CommandResult execute(CommandSource src, CommandContext args)
			throws CommandException {
		
		String name = args.<String>getOne("kit name").get();
		String item = args.<String>getOne("item").get();
		String items = Main.getItems(name);
		if(items != null){
			Utils.addItem(name, item);
		}
		else{
			Utils.addKit(name, item);
		}
		return CommandResult.success();
	}

}