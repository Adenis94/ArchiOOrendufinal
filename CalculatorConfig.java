/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice2;

/**
 *
 * @author adenis/Amir
 */
import java.util.HashMap;
import java.util.Map;

public class CalculatorConfig {
	private Operation oper;
	
	static Map<Character, Operation> mapOp = new HashMap<Character, Operation>();
	
	public static Operation getOperator(char oper){
		init();
		return mapOp.get(oper);
		
	}
	
	public static void init() {
		mapOp.put('+', new Addition());
		mapOp.put('/', new Division());
	}
	
}
