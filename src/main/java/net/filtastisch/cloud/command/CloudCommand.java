package net.filtastisch.cloud.command;

import net.filtastisch.cloud.StupidCloud;

public class CloudCommand extends Command{

    private CommandExecutor executor;
    private final String command;
    private String description;

    public CloudCommand(String command, String description, String... aliases) {
        super(command, description, aliases);

        StupidCloud.getCloud().getCommandManager().registerCommands(this);

        this.command = command;
    }

    public void setExecutor(CommandExecutor executor) {
        this.executor = executor;
    }

    public CommandExecutor getExecutor() {
        return executor;
    }

    @Override
    public void execute(String... args) {
        executor.onCommand(command, args);
    }
}
