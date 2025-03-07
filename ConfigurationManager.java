public class ConfigurationManager {
    private ConfigurationManager(){

    }
    private  int maxPlayers;
    private String defaultLanguage;
    private String gameDifficulty;
    private  static ConfigurationManager instance;

    public static ConfigurationManager getInstance(){
        if(instance==null){
            instance = new ConfigurationManager();
        }
        return instance;
    }


}
