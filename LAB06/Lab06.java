import java.io.*;
import java.util.*;
// class decision{
//     public String vowel(String l){
// }if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
//c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')

public class Lab06 {
    public static void vowel(String l){
        int vowelCounta=0;   int vowelCounte=0;int vowelCounti=0;int vowelCounto=0;int vowelCountu=0;

        for (char c : l.toCharArray()) {
            
            if (c == 'a' || c == 'A' ) {
                vowelCounta++;
            }
            if (c == 'e' || c == 'E' ) {
                vowelCounte++;
            }
            if (c == 'i' || c == 'I' ) {
                vowelCounti++;
            }
            if (c == 'o' || c == 'O' ) {
                vowelCounto++;
            }
            if (c == 'u' || c == 'U' ) {
                vowelCountu++;
            }

    }
    
    System.out.println("count of a "+vowelCounta) ;
    System.out.println("count of e "+vowelCounte) ;
    System.out.println("count of i "+vowelCounti) ;
    System.out.println("count of o "+vowelCounto) ;
    System.out.println("count of u "+vowelCountu) ;
}
    public static void digit(String l){
        int digitcount=0;
        for(char c : l.toCharArray()){
            if(Character.isDigit(c)){
                digitcount++;
            }
         }System.out.println("Count of digit " +digitcount); ;
    }
    public static void TopFive(String l){
        String[] words = l.split(" ");
        String[] uniqueWords = new String[words.length];
        int[] wordCount = new int[words.length];
        int count = 0;
        for (String word : words) {
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (uniqueWords[i].equals(word)) {
                    wordCount[i]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords[count] = word;
                wordCount[count]++;
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (wordCount[j] > wordCount[i]) {
                    int tempCount = wordCount[i];
                    wordCount[i] = wordCount[j];
                    wordCount[j] = tempCount;
                    String tempWord = uniqueWords[i];
                    uniqueWords[i] = uniqueWords[j];
                    uniqueWords[j] = tempWord;
                }
            }
        }
        for (int i = 0; i < 5 && i < count; i++) {
            System.out.println(uniqueWords[i] + " : " + wordCount[i]);
        }
    }

    public static void LeastFive(String l){
        String[] words = l.split("");
        String[] uniqueWords = new String[words.length];
        int[] wordCount = new int[words.length];
        int count = 0;
        for (String word : words) {
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (uniqueWords[i].equals(word)) {
                    wordCount[i]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords[count] = word;
                wordCount[count]++;
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (wordCount[j] < wordCount[i]) {
                    int tempCount = wordCount[i];
                    wordCount[i] = wordCount[j];
                    wordCount[j] = tempCount;
                    String tempWord = uniqueWords[i];
                    uniqueWords[i] = uniqueWords[j];
                    uniqueWords[j] = tempWord;
                }
            }
        }
        for (int i = 0; i < 5 && i < count; i++) {
            System.out.println(uniqueWords[i] + " : " + wordCount[i]);
        }
    }
public static void TopFiveChars(String l){
    int[] charCount = new int[500]; 
        for (int i = 0; i < l.length(); i++) {
            char ch = l.charAt(i);
            charCount[ch]++;
        }
        for (int i = 0; i < 5; i++) {
            int maxCount = 0;
            int maxIndex = 0;
            for (int j = 0; j < charCount.length; j++) {
                if (charCount[j] > maxCount) {
                    maxCount = charCount[j];
                    maxIndex = j;
                }
            }
            if (maxCount == 0) {
                break;
            }
            char ch = (char) maxIndex;
            System.out.println(ch + " : " + maxCount);
            charCount[maxIndex] = 0;
        }
}
    
public static void LeastFiveChars(String l){
    int[] charCount = new int[500]; 
        for (int i = 0; i < l.length(); i++) {
            char ch = l.charAt(i);
            charCount[ch]++;
        }
        for (int i = 0; i < 5; i++) {
            int minCount = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = 0; j < charCount.length; j++) {
                if (charCount[j] > 0 && charCount[j] < minCount) {
                    minCount = charCount[j];
                    minIndex = j;
                }
            }
            if (minCount == Integer.MAX_VALUE) {
                break;
            }
            char ch = (char) minIndex;
            System.out.println(ch + " : " + minCount);
            charCount[minIndex] = Integer.MAX_VALUE;
        }
}
    public static void main(String[] args) {
        
        try {
            File file = new File("text.txt");
            Scanner read=new Scanner(new File("text.txt"));
            
            String para = "";
            while(read.hasNextLine()){
                
             String line=read.nextLine();
             
             para = para + line;
            }
            vowel(para);
            digit(para);
            System.out.println("Top five words are ");
            TopFive(para);
            System.out.println("Least five words are ");
            LeastFive(para);
            System.out.println("Top five characters are ");
            TopFiveChars(para);
            System.out.println("Least five characters are ");
            LeastFiveChars(para);
            //System.out.println(para);

    }    

           
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
            
}
        






