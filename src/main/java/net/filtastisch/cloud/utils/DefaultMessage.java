package net.filtastisch.cloud.utils;

import lombok.Getter;
import net.filtastisch.cloud.StupidCloud;
import net.filtastisch.cloud.utils.types.ANSICodes;

public class DefaultMessage {

    @Getter
    private static StupidCloud cloud = StupidCloud.getCloud();

    public static String startMessage(){
        StringBuilder sb = new StringBuilder("");
        sb.append(ANSICodes.CYAN_BRIGHT).append(".d8888b.  888                      d8b      888  .d8888b.  888                        888      888     888  d888   ").append("\n");
        sb.append(ANSICodes.CYAN_BRIGHT).append("d88P  Y88b 888                      Y8P      888 d88P  Y88b 888                        888      888     888 d8888   ").append("\n");
        sb.append(ANSICodes.CYAN_BRIGHT).append("Y88b.      888                               888 888    888 888                        888      888     888   888   ").append("\n");
        sb.append(ANSICodes.CYAN_BRIGHT).append(" \"Y888b.   888888 888  888 88888b.  888  .d88888 888        888  .d88b.  888  888  .d88888      Y88b   d88P   888   ").append("\n");
        sb.append(ANSICodes.CYAN_BRIGHT).append("    \"Y88b. 888    888  888 888 \"88b 888 d88\" 888 888        888 d88\"\"88b 888  888 d88\" 888       Y88b d88P    888   ").append("\n");
        sb.append(ANSICodes.CYAN_BRIGHT).append("      \"888 888    888  888 888  888 888 888  888 888    888 888 888  888 888  888 888  888        Y88o88P     888   ").append("\n");
        sb.append(ANSICodes.CYAN_BRIGHT).append("Y88b  d88P Y88b.  Y88b 888 888 d88P 888 Y88b 888 Y88b  d88P 888 Y88..88P Y88b 888 Y88b 888         Y888P      888   ").append("\n");
        sb.append(ANSICodes.CYAN_BRIGHT).append(" \"Y8888P\"   \"Y888  \"Y88888 88888P\"  888  \"Y88888  \"Y8888P\"  888  \"Y88P\"   \"Y88888  \"Y88888          Y8P     8888888 ").append("\n");
        sb.append(ANSICodes.CYAN_BRIGHT).append("                           888                                                                                      ").append("\n");
        sb.append(ANSICodes.CYAN_BRIGHT).append("                           888                                                                                      ").append("\n");
        sb.append(ANSICodes.CYAN_BRIGHT).append("                           888                                                                                      ").append("\n");

        return sb.toString();
    }

}
