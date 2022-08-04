package net.filtastisch.cloud.utils.manager;

import net.filtastisch.cloud.utils.enums.MessageEnum;
import net.filtastisch.cloud.utils.enums.MessageType;
import net.filtastisch.cloud.utils.types.ANSICodes;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.nio.charset.StandardCharsets;

/**
 * This file is a JavaDoc
 * created: 04.08.2022
 *
 * @author filtastisch
 * Discord: filtastisch#7683
 */

public class ConsoleManager {

    public LineReader createLineReader() {
        try {
            Terminal terminal = TerminalBuilder
                    .builder()
                    .system(true)
                    .streams(System.in, System.out)
                    .encoding(StandardCharsets.UTF_8)
                    .dumb(true).build();


            return LineReaderBuilder.builder().terminal(terminal)
                    .option(LineReader.Option.DISABLE_EVENT_EXPANSION, true)
                    .option(LineReader.Option.AUTO_REMOVE_SLASH, true)
                    .option(LineReader.Option.INSERT_TAB, true).build();
        } catch (Exception ignored) {
        }
        return null;
    }

    public void sendMessage(String message, MessageType type){
        System.out.println(MessageEnum.PREFIX.getContent() + type.getContent() + message + ANSICodes.RESET);
    }



}
