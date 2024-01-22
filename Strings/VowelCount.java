

public class VowelCount {
    public static void main(String[] args){
        String name1 = "Anusha";
        int count = 0;
        name1 = name1.toLowerCase();
        for (int i = 0; i < name1.length(); i++) {
            char ch = name1.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of Vowels in string are "+count);
    }

}