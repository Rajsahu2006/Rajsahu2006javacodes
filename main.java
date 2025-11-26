public class main {
    //public class FirstUniqueChar {
    public static void main(String[] args) {
        String input = "aabbcdd";
        char result = findFirstNonRepeatingChar(input);

        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (str.indexOf(current) == str.lastIndexOf(current)) {
                return current;
            }
        }
        return 0; // Indicates no unique character found
    }
}

