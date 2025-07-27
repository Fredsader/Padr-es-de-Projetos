public class ConfigSingleton {
    public String idioma;
    public String modo;
    public int volume;
    private static ConfigSingleton instanceSingleton;
    
    private ConfigSingleton (String idioma, String modo, int volume){
      this.idioma = idioma;
      this.modo = modo;
      this.volume = volume;
    }
    
    public static ConfigSingleton getInstance (String idioma, String modo, int volume){
      if (instanceSingleton == null){
        instanceSingleton = new ConfigSingleton( idioma, modo, volume);
      }
      return instanceSingleton;
    }
    
    public String getIdioma(){
      return idioma;
    }
    public String getModo(){
      return modo;
    }
    public int getVolume(){
      return volume;
    }
    
    
    public void setIdioma(String idioma){
      this.idioma = idioma;
    }
    public void setModo(String modo){
      this.modo = modo;
    }
    public void setVolume(int volume){
      this.volume = volume;
    }
    }