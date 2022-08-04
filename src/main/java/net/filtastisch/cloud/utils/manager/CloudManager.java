package net.filtastisch.cloud.utils.manager;

import java.util.Properties;

public class CloudManager {

    public Properties getProperties(){
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getClassLoader().getResourceAsStream("project.properties"));
        }catch (Exception ignored){}
        return properties;
    }

}
