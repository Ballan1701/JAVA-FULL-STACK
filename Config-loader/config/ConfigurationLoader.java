package config;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationLoader {

    private Properties properties; // Encapsulation

    // Constructor
    public ConfigurationLoader(String filePath) {
        properties = new Properties();
        try {
            FileInputStream file = new FileInputStream(filePath);
            properties.load(file);
        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }

    // Method to get value
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}