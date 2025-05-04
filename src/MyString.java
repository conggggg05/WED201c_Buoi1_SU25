/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyString implements IString{

    @Override
    public int f1(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String f2(String string) {
        boolean check = true;
        String result="";
        String[]arr =string.split("\\s+");
        for (String str : arr) {
            if(checkPalindrom(str)){ 
                if(check==true){ 
                    result += "YY ";
                    check = false;
                }
                else result+=str +" ";
            }
            else result +=str+" ";
        }
        return result.trim();
    }
    public boolean checkPalindrom(String str){ 
        StringBuilder str1 = new StringBuilder(str).reverse();
        return str.equalsIgnoreCase(str1.toString());
    }
}
