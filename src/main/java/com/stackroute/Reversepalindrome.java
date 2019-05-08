package com.stackroute;

public class Reversepalindrome {

        public boolean checkPalindrome(String s)
        {
            String temp="";
            for(int i=0;i<s.length();i++)
            {
                temp+=s.charAt(s.length()-i-1);
            }

            if(temp.equalsIgnoreCase(s)) {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
