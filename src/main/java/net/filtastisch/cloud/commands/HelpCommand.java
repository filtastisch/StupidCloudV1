package net.filtastisch.cloud.commands;

import net.filtastisch.cloud.StupidCloud;
import net.filtastisch.cloud.utils.enums.MessageEnum;
import net.filtastisch.cloud.command.CommandExecutor;

public class HelpCommand implements CommandExecutor {

    StupidCloud cloud = StupidCloud.getCloud();

    @Override
    public boolean onCommand(String command, String... args) {
        System.out.println(MessageEnum.PREFIX.getContent() + "All available Commands:");
        return false;
    }
}
