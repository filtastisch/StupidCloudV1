package net.filtastisch.cloud;

import lombok.Getter;
import lombok.Setter;
import net.filtastisch.cloud.utils.enums.MessageType;

public class Main {

    @Getter
    @Setter
    private Thread commandSystem;

    @Getter
    private StupidCloud cloud = new StupidCloud();

    public static void main(String[] args) {
        Main main = new Main();
        main.getCloud().onEnable();
        main.startCommandSystem();
        main.loadShutDownHook();
    }

    public void startCommandSystem(){
        this.setCommandSystem(new Thread(StupidCloud.getCloud().getCommandManager().reading(), "COMMAND"));
        this.getCommandSystem().start();
    }

    public void loadShutDownHook(){
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            this.getCloud().getConsoleManager().sendMessage("The Cloud is shutting down!", MessageType.INFO);
            this.getCommandSystem().interrupt();
            this.getCloud().onDisable();
            this.getCloud().saveAll();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ignored){
                this.getCloud().getConsoleManager().sendMessage("STOPPING WITHOUT SAVING!", MessageType.FATAL);
            }
        }));
    }

}
