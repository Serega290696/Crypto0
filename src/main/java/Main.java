import java.util.Scanner;

/**
 * Created by Serega on 04.06.2015.
 */
public class Main {

    private static String userName = "User";
    private static String userKeyDefault = "root";
    private static String fileName = "Crypto File.dat";

    private final static String enterMessage = "Enter action number (integer):  ";
    private final static String greetingMessage = "Hello, " + userName + "!";
    private final static String beginMessage = "\nWhat are you want to do?\n" +
            "Press one of next numbers to choose action:\n" +
            "1. Encrypt.\n" +
            "2. Decrypt.\n" +
            "3. Exit.\n" +
            enterMessage;

    private static int action = 0;
    private static int writeTo = 0;

    private static final Cryptographer crypto = new Cryptographer();
    private static final Scanner in = new Scanner(System.in);
    private static String text = "";
    private static String key = "";
    private static FileWorker fileWorker = new FileWorker();
    private static String currentText;
    private static boolean isExit = false;
    private static boolean inFile = false;


    public static void main(String[] args) {

        System.out.print(greetingMessage);
        while(!isExit) {
            System.out.print(beginMessage);
            action = in.nextInt();
            doAction(action);
        }
        System.out.println("Goodbye!");


//        System.out.print(greetingMessage);
//        System.out.print(beginMessage);
//        String a = in.nextLine();


//        System.out.println("Finish! You input: " + a);


//        System.out.println(enterMessage + "Where you want to write encrypted text?");
//        switch(action) {
//            case 1:
////                System.out.println("Where you want to write encrypted text?");
////                System.out.println("1. Write result to console.");
////                System.out.println("2. Write result to file.");
////                System.out.println(enterMessage);
////
////                writeTo = in.nextInt();
//
//                String tmpText = "\""+currentText.substring(0, 10) +"\"";
//                if(currentText.length()>10) tmpText+="...";
//                System.out.println("Write text to encryption["+tmpText+"]:  ");
//
//                text = in.nextLine();
//                System.out.println("Write key ["+userKeyDefault+"]:  ");
//                key = in.nextLine();
//                String cryptedText = crypto.encrypt(text, key);
//                fileWorker.writeToFile(cryptedText, fileName);
//                fileWorker.readFromFile(cryptedText, fileName);
//                break;
//            case 2:
//                break;
//            case 3:
//                isExit = true;
//                break;
//        }
//        switch (writeTo) {
//            case 1:
//                break;
//            case 2:
//                break;
//        }
    }

    private static void doAction(int action) {
        String newText = "";
        switch (action) {
            case 1:
//                isInFile();
                System.out.print("\nEnter text: ");
                text = in.nextLine();
                if(text.length() > 0) {
                    System.out.println(text.length());
                    System.out.print("\nEnter key: ");
                    key = in.nextLine();
                    newText = crypto.encrypt(text, key);
                }
                break;
            case 2:
//                isInFile();
                System.out.print("\nEnter text: ");
                text = in.nextLine();
                if(text.length() > 0) {
                    System.out.print("\nEnter key: ");
                    key = in.nextLine();
                    newText = crypto.decrypt(text, key);
                }
                break;
            case 3:
                isExit = true;
                break;
        }
        if(action == 3) return;

//        if(newText.length() > 0) System.out.println("Successful!");
//        if(inFile) {
//            fileWorker.writeToFile(newText, fileName);
//        }
//        else {
//            System.out.println(newText);
//        }
    }

    private static void isInFile() {
        System.out.println("\nWhere you want to write text?");
        System.out.println("1. Write result to console.");
        System.out.println("2. Write result to file.");
        System.out.print(enterMessage);

        writeTo = in.nextInt();
    }


}
