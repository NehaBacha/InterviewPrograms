package com.assignment2.oops;


	
import java.util.TreeMap;

public class RomanNumber {

	private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

	static {

		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");

	}

	public final static String toRoman(int number) {
		int l =  map.floorKey(number);
		//System.out.println(l);
		if ( number == l ) {
			return map.get(number);
		}
		return map.get(l) + toRoman(number-l);
	}
	
	public static String intToRoman(int num) {
        if(num<1 || num>4000 ){
            return "Invalid number";
        }
        String romanNumber="";
        while(num >= 1000){
            romanNumber+="M";
            num-= 1000;
        }
        
        while(num>=900){
            romanNumber+="CM";
            num-=900;
        }
        
        while(num>=500){
            romanNumber+="D";
            num-=500;
        }
        
        while(num>=400){
            romanNumber+="CD";
            num-=400;
        }
        
        while(num>=100){
            romanNumber+="C";
            num-=100;
        }
        
        while(num>=90){
            romanNumber+="XC";
              num-=90;
        }
      
        while(num>=50){
            romanNumber+="L";
            num-=50;
        }
        
        while(num>=40){
            romanNumber+="XL";
             num-=40;
        }
       
        while(num>=10){
            romanNumber+="X";
            num-=10;
        }
        
        while(num>=9){
            romanNumber+="IX";
            num-=9;
        }
        
        while(num>=5){
            romanNumber+="V";
            num-=5;
        }
        
        while(num>=4){
            romanNumber+="IV";
            num-=4;
        }
        
        while(num>=1){
            romanNumber+="I";
            num-=1;
        }
     return romanNumber;   
    }
	
	public static String IntegerToRomanNumeral(int input) {
	    if (input < 1 || input > 3999)
	        return "Invalid Roman Number Value";
	    String s = "";
	    while (input >= 1000) {
	        s += "M";
	        input -= 1000;        }
	    while (input >= 900) {
	        s += "CM";
	        input -= 900;
	    }
	    while (input >= 500) {
	        s += "D";
	        input -= 500;
	    }
	    while (input >= 400) {
	        s += "CD";
	        input -= 400;
	    }
	    while (input >= 100) {
	        s += "C";
	        input -= 100;
	    }
	    while (input >= 90) {
	        s += "XC";
	        input -= 90;
	    }
	    while (input >= 50) {
	        s += "L";
	        input -= 50;
	    }
	    while (input >= 40) {
	        s += "XL";
	        input -= 40;
	    }
	    while (input >= 10) {
	        s += "X";
	        input -= 10;
	    }
	    while (input >= 9) {
	        s += "IX";
	        input -= 9;
	    }
	    while (input >= 5) {
	        s += "V";
	        input -= 5;
	    }
	    while (input >= 4) {
	        s += "IV";
	        input -= 4;
	    }
	    while (input >= 1) {
	        s += "I";
	        input -= 1;
	    }    
	    return s;
	}
	
	public static void main(String[] args) {

		System.out.println(toRoman(25));
		System.out.println(IntegerToRomanNumeral(25));
		System.out.println(intToRoman(25));
		
	}

}
