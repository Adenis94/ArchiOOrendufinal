/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice2;

/**
 *
 * @author adeni
 */

public class Addition implements Operation {
	
	@Override
	public double calculate(double x, double y) throws MonException {
		return x+y;
	}

    

	

}
