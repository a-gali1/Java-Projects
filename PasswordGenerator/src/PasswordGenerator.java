import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class PasswordGenerator {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to The Password Generator");
       int redo = 0;
        while (redo == 0) {
           System.out.println("How long do you want your password to be? (minimum 12 characters)");
           while (!scan.hasNextInt()) {
               System.out.println("you have entered an incorrect input, Please try again: ");
               scan.next();
           }
           int pwdLength = scan.nextInt();
           while (pwdLength < 12) {
               System.out.println("Password length must be at least 12 characters.");
               System.out.println("Please Try Again: ");
               pwdLength = scan.nextInt();
           }

           String password = generatePassword(pwdLength);

           System.out.println("Password: " + password);

            System.out.println("Do you want to generate another password?");

            String response;

            while (!scan.hasNext() || (!(response = scan.next()).equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no"))){
                System.out.println("you have entered an incorrect input, Please try again: ");
            }
            if (response.equalsIgnoreCase("no")){
                redo = 1;
            }
       }
    }

    public static String generatePassword(int pwdLength) throws IOException {
        StringBuilder password = new StringBuilder();
        int PassEnd = 0;
        Random r = new Random();

        int numWords = pwdLength/2;
        if (pwdLength % 2 == 1){
            numWords = numWords + 1;
        }

        List<String> dictionary = getDictionary();
        List<String> SymNum = getSymNum();

        for (int i = 0; i < numWords; i++) {
            int ranWordIndex = r.nextInt(370105);
            String store = dictionary.get(ranWordIndex);
            if (i == numWords - 1){
                PassEnd = 4;
            }
            password.append(Raninput(store, r, pwdLength, PassEnd));
        }
        
            for (int i = 0; i < (pwdLength * 0.3); i++) {
                int ranSymNum = r.nextInt(40);
                String addSymNum = SymNum.get((ranSymNum));
                int ranplacement = r.nextInt(password.length());
                if (SymNum.contains(password.charAt(ranplacement))) {
                    ranplacement = r.nextInt(password.length());
                }

                password.setCharAt(ranplacement, addSymNum.charAt(0));
            }
        return password.toString();
    }

    private static String Raninput(String store, Random r, int pwdLength, int PassEnd) {

        int p = store.length();
        int i1 = r.nextInt(p);
        int i2 = r.nextInt(p);
        while (i2 == i1) {
            i2 = r.nextInt(p);
        }
        String sp1 = String.valueOf(store.charAt(i1));
        String sp2 = String.valueOf(store.charAt(i2));

        int r1 = r.nextInt(100);

        if(r1 >= 50){
            sp1 = sp1.toUpperCase();
            sp2 = sp2.toLowerCase();
        } else {
            sp2 = sp2.toUpperCase();
            sp1 = sp1.toLowerCase();
        }

        if (pwdLength % 2 == 1 && PassEnd == 4){
            int r2 = r.nextInt(100);
            if(r2 >= 50){
                return sp1;
            } else {
                return sp2;
            }
        }
        else {
            return sp1 + sp2;
        }
    }

    public static List getDictionary() throws IOException {
        Charset charset = Charset.forName("ISO-8859-1");
        return Files.readAllLines(Paths.get("dictionary.txt"), charset);
    }
    public static List getSymNum() throws IOException {
        Charset charset = Charset.forName("ISO-8859-1");
        return Files.readAllLines(Paths.get("SymNum.txt"), charset);
    }
}
