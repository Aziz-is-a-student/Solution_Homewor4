public class ConfigManagerDemo {
    public static void main(String[] args) {

        ConfigurationManager singleton = ConfigurationManager.getInstance();
        System.out.println(singleton);
        ConfigurationManager singleton2 = ConfigurationManager.getInstance();
        System.out.println(singleton2);
    }
}
