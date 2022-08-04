package net.filtastisch.cloud;

import lombok.Getter;
import lombok.Setter;
import net.filtastisch.cloud.commands.HelpCommand;
import net.filtastisch.cloud.commands.ShutdownCommand;
import net.filtastisch.cloud.utils.DefaultMessage;
import net.filtastisch.cloud.utils.manager.CloudManager;
import net.filtastisch.cloud.utils.manager.ConsoleManager;
import net.filtastisch.cloud.command.CommandManager;

/**
 * This file is a JavaDoc
 * created: 04.08.2022
 *
 * @author filtastisch
 * Discord: filtastisch#7683
 */

public class StupidCloud extends Cloud {

    @Getter
    public static StupidCloud cloud;

    @Getter @Setter
    private ConsoleManager consoleManager;

    @Getter @Setter
    private CommandManager commandManager;

    @Getter @Setter
    private CloudManager cloudManager;

    public void onEnable(){
        cloud = this;
        System.out.println(DefaultMessage.startMessage());
        this.registerManager();
        this.registerCommands();
    }

    public void registerManager(){
        this.consoleManager = new ConsoleManager();
        this.commandManager = new CommandManager();
        this.cloudManager = new CloudManager();
    }

    public void registerCommands(){
        this.getCommand("help", "shows all available commands").setExecutor(new HelpCommand());
        this.getCommand("shutdown", "Stops the Cloud", "exit", "stop").setExecutor(new ShutdownCommand());
    }

}
