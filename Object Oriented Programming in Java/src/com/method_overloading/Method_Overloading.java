/**
 * 
 */
package com.method_overloading;

/**
 * @author Manish
 *
 */
public class Method_Overloading {

	// properties
	public String _message;
	int _codeNum;
	
	public Method_Overloading(String msg) {
		 if("".equals(msg)) {
			 System.out.println("Invalid Message.");
		 } else {
			 this._message = msg;
		 }
	}
	
	public Method_Overloading(int code) {
		 if(code <= 0) {
			 System.out.println(code + " is Invalid Code");
		 } else {
			 this._codeNum = code;
		 }
	}

}
