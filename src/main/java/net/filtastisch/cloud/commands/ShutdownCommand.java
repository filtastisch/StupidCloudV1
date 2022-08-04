package net.filtastisch.cloud.commands;

import net.filtastisch.cloud.command.CommandExecutor;

public class ShutdownCommand implements CommandExecutor {
    @Override
    public boolean onCommand(String command, String... args) {
        System.exit(0);
        return false;
    }
}
