package calculatrice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author adeni
 */
public class LanguageProperties {
    
    static Properties prop; //Properties existe deja, donc prop va permettre d'appeler une fonction de cette classe

    static boolean readProperty(String nameFromCode, String defaultMessage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    InputStream input = null; //on l'instancie plus tard
    private static LanguageProperties languageProperties = null;
    
    public static LanguageProperties getInstance( String fileName){ //ca va permettre de recupere le fichier dans lignecommande
        if(languageProperties == null)
            languageProperties = new LanguageProperties(fileName);
        return languageProperties;
            
    }

    private LanguageProperties(String fileName) {
        prop = new Properties();
        try { //try catch pour lire le fichier
            input = new FileInputStream(fileName);
        } catch (FileNotFoundException e1){
            e1.printStackTrace();
        }
        try{
            prop.load(input); // charger le fichier
        } catch( IOException e){
            e.printStackTrace();
        }
    }
    
    public String getProperty(String key){ //permet de recuperer la clé associé a la valeur 
        return prop.getProperty(key);
    }
    
}
