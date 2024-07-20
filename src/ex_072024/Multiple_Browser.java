package ex_072024;

import java.util.Scanner;

public class Multiple_Browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the browser: ");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":
                System.out.println("Starting chrome browser");
                break;
                case "chromium":
                    System.out.println("Starting chromium browser");
                    break;
                    case "firefox":
                        System.out.println("Starting firefox browser");
                        break;
                        case "opera":
                            System.out.println("Starting opera browser");
                            break;
                            case "safari":
                                System.out.println("Starting safari browser");
                                break;
                                case "ie":
                                    System.out.println("Starting IE browser");
                                    break;
                                    case "edge":
                                        System.out.println("Starting edge browser");
                                        break;

        }
    }
}
