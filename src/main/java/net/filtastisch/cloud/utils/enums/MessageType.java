package net.filtastisch.cloud.utils.enums;

import net.filtastisch.cloud.utils.types.ANSICodes;

public enum MessageType {

    INFO(ANSICodes.WHITE + "Info: "),
    WARNING(ANSICodes.YELLOW_BRIGHT + "Warning: "),
    ERROR(ANSICodes.YELLOW_BOLD + "ERROR: "),
    FATAL(ANSICodes.RED_BOLD + "FATAL: ");


    private final String content;
    MessageType(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
