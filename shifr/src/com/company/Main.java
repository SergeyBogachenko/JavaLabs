package com.company;


class ShifrProgramme {
        public static void main(String[] args) {
        }

        public static String shifr(String str, char a) {
            StringBuilder AllChars = new StringBuilder();
            for (Character b : str.toCharArray()) {
                char result = (char)(b + a);
                AllChars.append(result);
            }
            return AllChars.toString();
        }

        public static String unshifr(String str, char a) {
            StringBuilder AllChars = new StringBuilder();
            for (Character b : str.toCharArray()) {
                char result = (char)(b - a);
                if(result==0){
                   result = 0;
                }
                AllChars.append(result);
            }
            return AllChars.toString();
        }

}