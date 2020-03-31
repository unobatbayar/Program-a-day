import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
@author unobatbayar
Cyrillic script is a writing system used for various languages. This program
recognises if text is using cyrillic letters or not. Tuned for Mongolian cyrillic.
*/
class Cyrillic{
    public static void main (String[] args){
        System.out.println(isCyrillic("Education")); 
        System.out.println(isCyrillic("Боловсрол"));
    }

    public static boolean isCyrillic(final String text) {
        for(int i = 0; i<text.length(); i++){
            Pattern pattern;
            Matcher matcher;
            final String PASSWORD_PATTERN = "^(?=.*[АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯѲӨҮабвгдеёжзийклмнопрстуфхцчшщъыьэюяөѳү]).{1,}$";
            pattern = Pattern.compile(PASSWORD_PATTERN);
            matcher = pattern.matcher(text.charAt(i) + "");
            if(!matcher.matches()){
                return false;
            }
        }
        return true;
    }
}
