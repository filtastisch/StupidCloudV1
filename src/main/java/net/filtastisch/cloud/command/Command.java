package net.filtastisch.cloud.command;

import lombok.Getter;

/**
 * This file is a JavaDoc
 * created: 04.08.2022
 *
 * @author filtastisch
 * Discord: filtastisch#7683
 */

public abstract class Command {

    @Getter
    private final String command;
    @Getter
    private final String description;
    @Getter
    private final String[] aliases;

    public Command(String command, String description, String... aliases){
        this.command = command;
        this.aliases = aliases;
        this.description = description;
    }

    public boolean hasAliases(){
        return aliases.length > 0;
    }

    public abstract void execute(String... args);

}
