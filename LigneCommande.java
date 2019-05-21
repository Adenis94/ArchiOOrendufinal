package calculatrice2;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LigneCommande implements IHM {
        private static int PORT = 4999;
        private static final Logger LOGGER = Logger.getLogger(LigneCommande.class.getName());
        LanguageProperties prop;
	
        protected static char operateur;
        protected Scanner sc = new Scanner(System.in);
        InputStream input = null;
	
	public void Operator() {
		launch();
	}

	@Override
	public void launch() {
            System.out.println("Choose your language 'fr' for french, 'en' for english");
            String language = sc.nextLine();
            if((language.equals("FR") || language.equals("fr")) || language.equals("francais"))
                prop = LanguageProperties.getInstance("/Users/adeni/Documents/NetBeansProjects/Calculatrice2/src/calculatrice2/textefrancais.properties");
            else
                prop = LanguageProperties.getInstance("/Users/adeni/Documents/NetBeansProjects/Calculatrice2/src/calculatrice2/texteanglais.properties");
            System.out.println(prop.getProperty("Text1"));
            char op=sc.nextLine().charAt(0);
            try {
                exceptionOperator(op);
                System.out.println(prop.getProperty("Text2"));
                double x = sc.nextInt();
                System.out.println(prop.getProperty("Text3"));
                double y = sc.nextInt();
                double resultat = Operator.execute(x,y,op);
                System.out.println(prop.getProperty("Text4")+ resultat);
            }catch(MonException e){
                System.out.println(MonEnumException.UTILISATION_SIGNE_MAUVAIS.getDefaultMessage());
            }catch(InputMismatchException e){
                System.out.println(MonEnumException.UTILISATION_DIFF_NOMBRE.getDefaultMessage());
            }
            
            
                
	}
        void exceptionOperator(char op) throws MonException {
		if(op != '/' && op != '+'){
                    throw new MonException(MonEnumException.UTILISATION_SIGNE_MAUVAIS.getCode(),MonEnumException.UTILISATION_SIGNE_MAUVAIS.getDefaultMessage());
                }
            }
        
        
	

}

