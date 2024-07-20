package ex_072024;

import java.util.Scanner;

public class char_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        switch(ch){
            case 'a':
                System.out.println("Vowel");
                break;
                case 'e':
                    System.out.println("Vowel");
                    break;
                    case 'i':
                        System.out.println("Vowel");
                        break;
                        case 'o':
                            System.out.println("Vowel");
                            break;
                            case 'u':
                                System.out.println("Vowel");
                                break;
            default:
                System.out.println("Consonant");

        }
        switch(ch) {
            case 'a', 'e', 'i', 'o':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
        }

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
                    }

    }
}
