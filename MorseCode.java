import java.util.HashMap;
import java.util.Scanner;

public class MorseCode {

    public static void main(String[] args) {
        MorseCode x = new MorseCode();
        x.morseCode();
    }

    public void morseCode() {
    HashMap<String, String> map = new HashMap<>();

    //to input letter and retrieve MC value
    map.put("A", ".-");
    map.put("B", "-...");
    map.put("C", "-.-.");
    map.put("D", "-..");
    map.put("E", ".");
    map.put("F", "..-.");
    map.put("G", "--.");
    map.put("H", "....");
    map.put("I", "..");
    map.put("J", ".---");
    map.put("K", "-.-");
    map.put("L", ".-..");
    map.put("M", "--");
    map.put("N", "-.");
    map.put("O", "---");
    map.put("P", ".--.");
    map.put("Q", "--.-");
    map.put("R", ".-.");
    map.put("S", "...");
    map.put("T", "-");
    map.put("U", "..-");
    map.put("V", "...-");
    map.put("W", ".--");
    map.put("X", "-..-");
    map.put("Y", "-.--");
    map.put("Z", "--..");
    map.put("1", ".----");
    map.put("2", "..---");
    map.put("3", "...--");
    map.put("4", "....-");
    map.put("5", ".....");
    map.put("6", "-....");
    map.put("7", "--...");
    map.put("8", "---..");
    map.put("9", "----.");
    map.put("0", "-----");
    map.put(" ", "/");

        //to input MC and retrieve letter value
        map.put(".-", "A");
        map.put("-...", "B");
        map.put("-.-.", "C");
        map.put("-..", "D");
        map.put( ".","E");
        map.put("..-.","F");
        map.put("--.", "G");
        map.put("....","H");
        map.put("..", "I");
        map.put(".---", "J");
        map.put("-.-" , "K");
        map.put(".-..","L");
        map.put("--","M");
        map.put( "-.","N");
        map.put( "---","O");
        map.put(".--.","P");
        map.put("--.-","Q");
        map.put(".-.","R");
        map.put("...","S");
        map.put( "-","T");
        map.put("..-","U");
        map.put("...-","V");
        map.put(".--","W");
        map.put("-..-","X");
        map.put("-.--","Y");
        map.put("--..","Z");
        map.put(".----","1");
        map.put( "..---","2");
        map.put("...--","3");
        map.put("....-","4");
        map.put(".....","5");
        map.put("-....","6");
        map.put("--...","7");
        map.put("---..","8");
        map.put("----.","9");
        map.put("-----","0");
        map.put("/"," ");
        map.put(" ","/");
//        map.put("Hello", ".... . .-.. .-.. ---");
//        map.put("daily","-.. .- .. .-.. -.--");
//        map.put("programmer",".--. .-. --- --. .-. .- -- -- . .-.");



        String str = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
        String[] strgs = str.split(" ");

        for(String i: strgs){
            System.out.print(map.get(i).toLowerCase());
        }

       String str2 = "H E L L O / D A I L Y / P R O G R A M M E R / G O O D / L U C K / O N / T H E / C H A L L E N G E S / T O D A Y";
        String[] strgs2 = str2.split(" ");
        System.out.println(" ");
        for (String i: strgs2){
            System.out.print(map.get(i));
        }
    }

}