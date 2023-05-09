public class Main {
    public static void main(String[] args) {

        String str = "я могу делить строку на части";
        String[] words = str.split(" ");
        for(String word: words){
            System.out.println(word);
        }
    }
}