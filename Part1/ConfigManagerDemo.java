package Part1;

public class ConfigManagerDemo {
    public static void main(String[] args) {
    ConfigurationManager configurationManager = ConfigurationManager.getInstance();
        System.out.println(configurationManager);
        System.out.println(configurationManager.getConfig("defaultLanguage"));

        configurationManager.printConfigs();
        System.out.println("\n\nSecond ConfigurationManager");
        ConfigurationManager configurationManager2 = ConfigurationManager.getInstance();
        System.out.println(configurationManager2);
        System.out.println(configurationManager2.getConfig("defaultLanguage"));

        configurationManager2.printConfigs();

    }
}
