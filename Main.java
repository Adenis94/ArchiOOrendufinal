/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice2;

import java.io.IOException;

/**
 *
 * @author Adenis/Amir
 */

public class Main {
	public static void main(String [] args) {
		
		IHM ihm = new LigneCommande();
		CalculatorConfig.init();
                ihm.launch(); 
                
                /*new Thread(new Runnable() {

                    @Override
                    public void run() {
                        try{
                            try{
                                LigneCommande.launch();
                            }catch(MonException e){
                                System.out.println(LanguageProperties.readProperty(MonEnumException.getNameFromCode(e.getCode(),e.getDefaultMessage())));
                            }
                        }catch(ClassNotFoundException | IOException e){
                            System.out.println(LanguageProperties.readProperty(MonEnumException.getNameFromCode(MonEnumException.SERVER_ERROR.getCode()), MonEnumException.SERVER_ERROR.getDefaultMessage()));
                        }
                    }
                }).start();
                
                    
                
		
            }*/
}
}

