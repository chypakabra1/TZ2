import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        System.out.println(calc(line));
    }

    public static String calc(String line) {

        int z = line.indexOf('+');
        int h = line.indexOf('-');
        int q = line.indexOf('*');
        int u = line.indexOf('/');
        String line1 = null;

        int x; int y;

        if (z != -1) { //Проверяем +
            String[] strings = line.split("\\+");

            int l = strings[0].length();
            int l2 = strings[1].length();

            if (strings.length == 1 || strings[0].charAt(0) != '"' || strings[0].charAt(l - 2) != '"'
                    || Character.isDigit(strings[0].charAt(0)) || Character.isDigit(strings[1].charAt(1))
                    || strings[1].charAt(1) != '"' || strings[1].charAt(l2 - 1) != '"' || l > 13 || l2 > 13) {

                throw new IllegalArgumentException();

            } else {
                line1 = strings[0].substring(1, l-2) + strings[1].substring(2, l2 - 1);
            }

        } else if (h != -1) { //Проверяем -

            String[] strings = line.split(" - ");

            int l = strings[0].length();
            int l2 = strings[1].length();

            if (strings.length == 1 || strings[0].charAt(0) != '"' || strings[0].charAt(l - 1) != '"'
                    || Character.isDigit(strings[0].charAt(0)) || Character.isDigit(strings[1].charAt(1))
                    || strings[1].charAt(0) != '"' || strings[1].charAt(l2 - 1) != '"' || l > 12 || l2 > 12) {

                throw new IllegalArgumentException();

            }

            String ch1 = strings[0].substring(1, l-1);
            String ch2 = strings[1].substring(1, l2-1);

            if (ch1.indexOf(ch2) == -1) {

                line1 = ch1;

            } else {
                
                x = ch1.indexOf(ch2);
                y = x + l2 - 2;
                line1 = ch1.substring(0, x) + ch1.substring(y);
                
            }
        } else if (q != -1) { //Проверяем *

            String[] strings = line.split(" * ");

            int l = strings[0].length();
            int l2 = strings[1].length();

            if (Character.isDigit(strings[0].charAt(0)) || !Character.isDigit(strings[2].charAt(0))) {
                throw new IllegalArgumentException();
            }

            String ch1 = strings[0].substring(1, l - 1);
            int ch2 = Integer.parseInt(strings[2]);

            if (strings.length == 1 || strings[0].charAt(0) != '"' || strings[0].charAt(l - 1) != '"'
                    || strings[2].charAt(0) == '"' || strings[2].charAt(l2 - 1) == '"' || ch2 < 1 || ch2 > 10 || l > 12|| ch2 % 1 != 0) {

                throw new IllegalArgumentException();

            } else

                for(int i = 1; i <= ch2; i++) {
                    line1 += ch1;
                }

            line1 = line1.substring(4);

        } else if (u != -1) { //Проверяем /

            String[] strings = line.split(" / ");

            int l = strings[0].length();
            int l2 = strings[1].length();

            if (Character.isDigit(strings[0].charAt(0)) || !Character.isDigit(strings[1].charAt(0))) {
                throw new IllegalArgumentException();
            }

            String ch1 = strings[0].substring(1, l - 1);
            int ch2 = Integer.parseInt(strings[1]);

            if (strings.length == 1 || strings[0].charAt(0) != '"' || strings[0].charAt(l - 1) != '"' || strings[1].charAt(0) == '"'
                    || strings[1].charAt(l2 - 1) == '"' || ch2 < 1 || ch2 > 10 || l > 12 || ch2 % 1 != 0 || l - 2 < ch2) {

                throw new IllegalArgumentException();

            } else
                
                x = l / ch2;
            
            if (ch2 == 1) {
                
                line1 = ch1;
                
            } else
                
            line1 = ch1.substring(0, x - 1);
            
        } else
            
            throw new IllegalArgumentException();

        if (line1.length() > 40) {
            
            line1 = '"' + line1.substring(0, 40) + "..." + '"';

        } else line1 = '"' + line1 + '"';
        
        return line1;
    }
}
