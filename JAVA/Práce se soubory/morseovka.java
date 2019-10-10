import java.util.Scanner;

public class morseovka
{
    char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                  'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
                  'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                  ',', '.', '?', ' '};
    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--..", "/ " };
    char[] chars;
    String vetam = "";
    Scanner sc = new Scanner(System.in);
    String veta;
    public morseovka()
    {
        System.out.println("Napiste text, který chcete převést do morseovky:");
        veta = sc.nextLine();
        System.out.println("Věta: '"+veta+"' se v morseovce napíše takto: "+ přelož(veta.toLowerCase()));
    }
    
    public String přelož(String veta)
    {
        chars = veta.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            for (int j = 0; j < english.length; j++)
            {
                if (english[j] == chars[i])
                {
                    vetam = vetam + morse[j] + " ";
                }
            }
        }
        return vetam;
    }
}
