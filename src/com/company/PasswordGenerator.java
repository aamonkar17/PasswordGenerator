//Ankit Amonkar
//3B Computer Science
//PasswordGenerator Class
package com.company;

public class PasswordGenerator {
    private String prefix;
    private int count;
    private int suffix;
    private static int passcount = 0;
    public PasswordGenerator(int c) {
        count = c;
        prefix = "A";
    }
    public PasswordGenerator(int c, String pre){
        count = c;
        prefix = pre;
    }
    public static int pwCount(){
        return passcount;
    }
    public String pwGen(){
        for (int i = 0; i < this.count; i++){
            suffix=(int)(Math.random()*10*Math.pow(10,i));
        }
        String fin = prefix + "." + suffix;
        passcount++;
        return fin;
    }
}