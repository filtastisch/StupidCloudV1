package net.filtastisch.cloud.command;

import lombok.Getter;
import net.filtastisch.cloud.StupidCloud;
import net.filtastisch.cloud.utils.enums.MessageEnum;
import net.filtastisch.cloud.utils.enums.MessageType;
import org.jline.reader.LineReader;
import org.jline.reader.UserInterruptException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This file is a JavaDoc
 * created: 04.08.2022
 *
 * @author filtastisch
 * Discord: filtastisch#7683
 */

public class CommandManager {

    StupidCloud cloud = StupidCloud.getCloud();

    public static List<String> args = new ArrayList<>();

    @Getter
    private final HashMap<String, Command> commandHashMap = new HashMap<>();

    public void registerCommands(Command command) {
        commandHashMap.put(command.getCommand().toLowerCase(), command);

        if (command.getAliases() == null) return;
        for (String c : command.getAliases()) {
            commandHashMap.put(c.toLowerCase(), command);
        }

    }

    public Runnable reading() {
        return () -> {
            LineReader lineReader = cloud.getConsoleManager().createLineReader();
            while (true) {
                try {
                    String cmd;
                    String[] input;

                    cmd = lineReader.readLine(MessageEnum.PREFIX.getContent());
                    input = cmd.split(" ");
                    if (commandHashMap.containsKey(input[0].toLowerCase())) {
                        for (String c : input) {
                            if (!c.equalsIgnoreCase(input[0])) {
                                args.add(c);
                            }
                        }
                        commandHashMap.get(input[0].toLowerCase()).execute(args.toArray(new String[0]));

                    } else {
                        cloud.getConsoleManager().sendMessage("Command " + input[0] + " could not be found! Please Type 'help' to see all commands!", MessageType.WARNING);
                    }
                } catch (UserInterruptException ignored) {
                    System.out.println(MessageType.FATAL.getContent() + "STOPPING WITHOUT SAVING!");
                }
            }
        };
    }

}
