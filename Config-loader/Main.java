import config.ConfigurationLoader;
public class Main {
    public static void main(String[] args) {

        config.ConfigurationLoader config = new config.ConfigurationLoader("config.properties");

        System.out.println("App Name: " + config.getValue("app.name"));
        System.out.println("Version: " + config.getValue("app.version"));
        System.out.println("DB URL: " + config.getValue("db.url"));
    }
}