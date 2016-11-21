package letterflip;

import java.util.Scanner;

public class LetterFlip{
    public static String StringFlip(String text){
        String flipped = "";
        String lowercase = text.toLowerCase();
        for(int i = 0; i < lowercase.length(); i++){
            flipped += flipCharacter(lowercase.charAt(i));
        }
        return flipped;
    }

    public static String MirrorAndFlip(String text){
        String mirrored = "";
        String lowercase = text.toLowerCase();
        for(int i = lowercase.length()-1; i > -1; i--){
            mirrored += flipCharacter(lowercase.charAt(i));
        }
        return mirrored;
    }

    public static char flipCharacter(char c){
        switch(c){
            case '[': return ']';      case ']': return '[';
            case '(': return ')';      case ')': return '(';
            case '{': return '}';      case '}': return '{';
            case '?': return '\u00BF'; case ' ': return ' ';
            case 'a': return '\u0250'; case 'b': return 'q';
            case 'c': return '\u0254'; case 'd': return 'p';
            case 'e': return '\u01DD'; case 'f': return '\u025F';
            case 'g': return 'b';      case 'h': return '\u0265';
            case 'i': return '\u0131'; case 'j': return '\u0638';
            case 'k': return '\u029E'; case 'l': return '1';
            case 'm': return '\u026F'; case 'n': return 'u';
            case 'o': return 'o';      case 'p': return 'd';
            case 'q': return 'b';      case 'r': return '\u0279';
            case 's': return 's';      case 't': return '\u0287';
            case 'u': return 'n';      case 'v': return '\u028C';
            case 'w': return '\u028D'; case 'x': return 'x';
            case 'y': return '\u028E'; case 'z': return 'z';
            default: return c;
        }
    }

    public static void main(String[] args){
        Scanner uOption = new Scanner(System.in);
        System.out.println("FLIP or MIRROR? ");
        String choice = uOption.next();
        System.out.println();

        if(choice.toLowerCase().equals("flip") || choice.toLowerCase().equals("f")){
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter Text: ");
            String input = userInput.next();
            System.out.println(StringFlip(input));

        }else if(choice.toLowerCase().equals("mirror") || choice.toLowerCase().equals("m")){
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter Text: ");
            String input = userInput.next();
            System.out.println(MirrorAndFlip(input));
        }
    }
}
