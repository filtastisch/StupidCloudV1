package net.filtastisch.cloud.command;

public interface CommandExecutor {

    boolean onCommand(String command, String... args);

}
