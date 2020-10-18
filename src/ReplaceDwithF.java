public class ReplaceDwithF {
    
   public static void main(String[] args)
    {
        String s = "The quick brown fox jumps over the lazy dog.";

        
        String s1 = s.replace('d', 'f');

       
        System.out.println("Old String: " + s);
        System.out.println("New String: " + s1);
    }
}