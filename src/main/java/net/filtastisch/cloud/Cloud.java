package net.filtastisch.cloud;

import net.filtastisch.cloud.command.CloudCommand;
import net.filtastisch.cloud.command.CommandExecutor;

public abstract class Cloud implements CommandExecutor {

    public CloudCommand getCommand(String name, String description, String... aliases){
        return new CloudCommand(name, description, aliases);
    }

    public void onDisable() {
    }

    public void onEnable() {
    }

    public void saveAll(){

    }

    @Override
    public boolean onCommand(String command, String... args) {
        return false;
    }
}
