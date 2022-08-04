package net.filtastisch.cloud.utils.enums;

import net.filtastisch.cloud.utils.types.ANSICodes;

public enum MessageEnum {

    PREFIX(ANSICodes.CYAN_BRIGHT + "Cloud" + ANSICodes.CYAN + "Tastisch" + ANSICodes.CYAN_BRIGHT + "V1" + ANSICodes.RESET + " | ");

    private final String content;

    MessageEnum(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
