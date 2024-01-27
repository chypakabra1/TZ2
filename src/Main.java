import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Калькулятор.");
        System.out.println("");
        /*String ch1 = sc.next();
        String st = sc.next();
        String ch2 = sc.next();*/

        String line = sc.nextLine();

        String[] strings = line.split(" ");  // splits the string wherever a space character is encountered, returns the result as a String[]

        if (strings.length == 1 || strings.length == 2) {

            System.out.println("Cтрока не является математической операцией");
            System.exit(1);

        } else if (strings.length > 3) {

            System.out.println("Формат математической операции не удовлетворяет заданию");
            System.exit(1);
        }

        String ch1 = String.format(strings[0]);
        String st = String.format(strings[1]);
        String ch2 = String.format(strings[2]);



        int x = 0;
        int y = 0;
        int z = 0;
        int h = 0;
        int otv = 0;

        if ((ch1.equals("1") || ch1.equals("2") || ch1.equals("3") || ch1.equals("4") || ch1.equals("5") || ch1.equals("6")
                || ch1.equals("7") || ch1.equals("8") || ch1.equals("9") || ch1.equals("10")) && (ch2.equals("I") || ch2.equals("II")
                || ch2.equals("III") || ch2.equals("IV") || ch2.equals("V") || ch2.equals("VI") || ch2.equals("VII")
                || ch2.equals("VIII") || ch2.equals("IX") || ch2.equals("X")) || (ch2.equals("1") || ch2.equals("2")
                || ch2.equals("3") || ch2.equals("4") || ch2.equals("5") || ch2.equals("6")|| ch2.equals("7")
                || ch2.equals("8") || ch2.equals("9") || ch2.equals("10")) && (ch1.equals("I") || ch1.equals("II")
                || ch1.equals("III") || ch1.equals("IV") || ch1.equals("V") || ch1.equals("VI") || ch1.equals("VII")
                || ch1.equals("VIII") || ch1.equals("IX") || ch1.equals("X"))) {
            System.out.println("Введены разные системы счисления");
        } else if ((!ch1.equals("1") && !ch1.equals("2") && !ch1.equals("3") && !ch1.equals("4") && !ch1.equals("5") && !ch1.equals("6")
                && !ch1.equals("7") && !ch1.equals("8") && !ch1.equals("9") && !ch1.equals("10")) && (!ch1.equals("I") && !ch1.equals("II")
                && !ch1.equals("III") && !ch1.equals("IV") && !ch1.equals("V") && !ch1.equals("VI") && !ch1.equals("VII")
                && !ch1.equals("VIII") && !ch1.equals("IX") && !ch1.equals("X")) || (!ch2.equals("I") && !ch2.equals("II")
                && !ch2.equals("III") && !ch2.equals("IV") && !ch2.equals("V") && !ch2.equals("VI") && !ch2.equals("VII")
                && !ch2.equals("VIII") && !ch2.equals("IX") && !ch2.equals("X")) && (!ch2.equals("1") && !ch2.equals("2")
                && !ch2.equals("3") && !ch2.equals("4") && !ch2.equals("5") && !ch2.equals("6") && !ch2.equals("7")
                && !ch2.equals("8") && !ch2.equals("9") && !ch2.equals("10"))) {
            System.out.println("Введено неверное число (меньше 1 || больше 10 || меньше I || больше X)");
        } else {

            switch (ch1) {

                case "1":
                    x = 1;
                    break;

                case "2":
                    x = 2;
                    break;

                case "3":
                    x = 3;
                    break;

                case "4":
                    x = 4;
                    break;

                case "5":
                    x = 5;
                    break;

                case "6":
                    x = 6;
                    break;

                case "7":
                    x = 7;
                    break;

                case "8":
                    x = 8;
                    break;

                case "9":
                    x = 9;
                    break;

                case "10":
                    x = 10;
                    break;

                case "I":
                    z = 1;
                    break;

                case "II":
                    z = 2;
                    break;

                case "III":
                    z = 3;
                    break;

                case "IV":
                    z = 4;
                    break;

                case "V":
                    z = 5;
                    break;

                case "VI":
                    z = 6;
                    break;

                case "VII":
                    z = 7;
                    break;

                case "VIII":
                    z = 8;
                    break;

                case "IX":
                    z = 9;
                    break;

                case "X":
                    z = 10;
                    break;

                default:

            }

            switch (ch2) {

                case "1":
                    y = 1;
                    break;

                case "2":
                    y = 2;
                    break;

                case "3":
                    y = 3;
                    break;

                case "4":
                    y = 4;
                    break;

                case "5":
                    y = 5;
                    break;

                case "6":
                    y = 6;
                    break;

                case "7":
                    y = 7;
                    break;

                case "8":
                    y = 8;
                    break;

                case "9":
                    y = 9;
                    break;

                case "10":
                    y = 10;
                    break;

                case "I":
                    h = 1;
                    break;

                case "II":
                    h = 2;
                    break;

                case "III":
                    h = 3;
                    break;

                case "IV":
                    h = 4;
                    break;

                case "V":
                    h = 5;
                    break;

                case "VI":
                    h = 6;
                    break;

                case "VII":
                    h = 7;
                    break;

                case "VIII":
                    h = 8;
                    break;

                case "IX":
                    h = 9;
                    break;

                case "X":
                    h = 10;
                    break;

                default:
                    System.out.println("Ошибка");

            }
            if (x != 0) {
                switch (st) {

                    case "+":
                        otv = x + y;
                        System.out.println(otv);
                        break;

                    case "-":
                        otv = x - y;
                        System.out.println(otv);
                        break;

                    case "*":
                        otv = x * y;
                        System.out.println(otv);
                        break;

                    case "/":
                        otv = x / y;
                        System.out.println(otv);
                        break;

                    default:
                        System.out.println("Знак неверный");
                }
            } else {
                switch (st) {

                    case "+":
                        otv = z + h;
                        break;

                    case "-":
                        otv = z - h;
                        break;

                    case "*":
                        otv = z * h;
                        break;

                    case "/":
                        otv = z / h;
                        break;

                    default:
                        System.out.println("Знак неверный");
                }

                switch (otv) {

                    case -9:
                        System.out.println("Римское число не может быть отрицательным");
                        break;
                    case -8:
                        System.out.println("Римское число не может быть отрицательным");
                        break;
                    case -7:
                        System.out.println("Римское число не может быть отрицательным");
                        break;
                    case -6:
                        System.out.println("Римское число не может быть отрицательным");
                        break;
                    case -5:
                        System.out.println("Римское число не может быть отрицательным");
                        break;
                    case -4:
                        System.out.println("Римское число не может быть отрицательным");
                        break;
                    case -3:
                        System.out.println("Римское число не может быть отрицательным");
                        break;
                    case -2:
                        System.out.println("Римское число не может быть отрицательным");
                        break;
                    case -1:
                        System.out.println("Римское число не может быть отрицательным");
                        break;
                    case 0:
                        System.out.println("nulla");
                        break;
                    case 1:
                        System.out.println("I");
                        break;
                    case 2:
                        System.out.println("II");
                        break;
                    case 3:
                        System.out.println("III");
                        break;
                    case 4:
                        System.out.println("IV");
                        break;
                    case 5:
                        System.out.println("V");
                        break;
                    case 6:
                        System.out.println("VI");
                        break;
                    case 7:
                        System.out.println("VII");
                        break;
                    case 8:
                        System.out.println("VIII");
                        break;
                    case 9:
                        System.out.println("IX");
                        break;
                    case 10:
                        System.out.println("X");
                        break;
                    case 11:
                        System.out.println("XI");
                        break;
                    case 12:
                        System.out.println("XII");
                        break;
                    case 13:
                        System.out.println("XIII");
                        break;
                    case 14:
                        System.out.println("XIV");
                        break;
                    case 15:
                        System.out.println("XV");
                        break;
                    case 16:
                        System.out.println("XVI");
                        break;
                    case 17:
                        System.out.println("XVII");
                        break;
                    case 18:
                        System.out.println("XVIII");
                        break;
                    case 19:
                        System.out.println("XIX");
                        break;
                    case 20:
                        System.out.println("XX");
                        break;
                    case 21:
                        System.out.println("XXI");
                        break;
                    case 24:
                        System.out.println("XXIV");
                        break;
                    case 25:
                        System.out.println("XXV");
                        break;
                    case 27:
                        System.out.println("XXVII");
                        break;
                    case 28:
                        System.out.println("XXVIII");
                        break;
                    case 30:
                        System.out.println("XXX");
                        break;
                    case 32:
                        System.out.println("XXXII");
                        break;
                    case 35:
                        System.out.println("XXXV");
                        break;
                    case 36:
                        System.out.println("XXXVI");
                        break;
                    case 40:
                        System.out.println("XL");
                        break;
                    case 42:
                        System.out.println("XLII");
                        break;
                    case 45:
                        System.out.println("XLV");
                        break;
                    case 48:
                        System.out.println("XLVIII");
                        break;
                    case 49:
                        System.out.println("XLIX");
                        break;
                    case 50:
                        System.out.println("L");
                        break;
                    case 54:
                        System.out.println("LIV");
                        break;
                    case 56:
                        System.out.println("LVI");
                        break;
                    case 60:
                        System.out.println("LX");
                        break;
                    case 63:
                        System.out.println("LXIII");
                        break;
                    case 64:
                        System.out.println("LXIV");
                        break;
                    case 70:
                        System.out.println("LXX");
                        break;
                    case 72:
                        System.out.println("LXXII");
                        break;
                    case 80:
                        System.out.println("LXXX");
                        break;
                    case 81:
                        System.out.println("LXXXI");
                        break;
                    case 90:
                        System.out.println("XC");
                        break;
                    case 100:
                        System.out.println("C");
                        break;

                    default:
                }
            }
        }
        //else System.out.println("всё ок");

        /*if (st == str2) {
            otv = ch1 * ch2;
            System.out.println(otv);
        } else {
        System.out.println("error");}*/
    }
}
