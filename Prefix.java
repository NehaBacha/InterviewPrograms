package com.assignment2.oops;

import java.util.HashMap;


public class Prefix {

    static final HashMap<String, Integer> PREC = new HashMap<>();
    static { PREC.put("+", 1); PREC.put("-", 1); PREC.put("*", 2); PREC.put("/", 2); }

    static class Source {
        final String s;
        Source(String s)
        {
        	this.s = s;
        	}
        int index = 0;
        String token;
        String next() {
        	return token = index >= s.length() ? null : s.substring(index, ++index);
        	}
    }

    static String parse(String s) {
    	return parse(new Source(s), 0);
    	}

    static String parse(Source t, int prec) {
        Integer self = PREC.get(t.next());
        if (self != null) {
            String op = t.token;
            String result = String.format("%s%s%s",parse(t, self), op, parse(t, self));
            if (self < prec) result = "(" + result + ")";
            return result;
        } else
            return t.token;
    }

    static void test(String prefix) { System.out.println(prefix + " -> " + parse(prefix)); }

    public static void main(String[] args) {
        test("-4/+1*327");
        test("+-a*bc/de");
        test("*-ab+cd");
    }
}
