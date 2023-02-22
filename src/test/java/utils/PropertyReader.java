package utils;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

// Singleton pattern
public class PropertyReader {
    private static PropertyReader instance = new PropertyReader();
    private Properties properties;

    @SneakyThrows
    public PropertyReader() {
        properties = new Properties();
        try (BufferedReader reader = new BufferedReader(new FileReader("mytest.properties"))) {
            properties.load(reader);
        }

    }

    public static PropertyReader getInstance() {
        return instance;
    }

    public String getURL(){
        return properties.getProperty("url");
    }

    public String getPassword(){
        return properties.getProperty("password");
    }
}
