import java.util.Scanner;

/**
 * Created by 1 on 31.07.2017.
 */
public class TicTacToe {
    Scanner sc = new Scanner(System.in);
    String loc;
    static String str[] = new String[]{"  | ", " | ", " ", "--+-", "-+--", " ",
                                       "  | ", " | ", " ", "--+-", "-+--", " ",
                                       "  | ", " | ", " "};

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.game();
    }



    public void table() {
        for (int i = 0; i < str.length; i += 3) {
            for (int j = i; j <= i + 2; j++) {
                System.out.print(str[j]);
            }
            System.out.println();
        }
    }


    public void game() {
            System.out.println("Введите местоположение ячейки согласно таблицы");
            for (int i = 1; i <= 9; i+=3) {
                for (int j = i; j <= i + 2; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        int z = 9;
        while (z >= 0) {
            if (z % 2 == 0) {
                System.out.println("Ходит Х");
            } else {
                System.out.println("Ходит 0");
            }
            switch (loc = sc.nextLine()) {
                case "1":
                    if (z%2==0) {
                        str[0] = " X| ";
                        z--;
                        table();
                        break;}
                    else {
                        str[0] = " 0| ";
                        z--;
                        table();
                        break;}
                case "2":
                    if (z%2==0) {
                        str[1] = "X|  ";
                        z--;
                        table();
                        break;}
                    else {
                        str[1] = "0|  ";
                        z--;
                        table();
                        break;}
                case "3":
                    if (z%2==0) {
                        str[2] = "X";
                        z--;
                        table();
                        break;}
                    else {
                        str[2] = "0";
                        z--;
                        table();
                        break;}
                case "4":
                    if (z%2==0) {
                        str[6] = " X| ";
                        z--;
                        table();
                        break;}
                    else {
                        str[6] = " 0| ";
                        z--;
                        table();
                        break;}
                case "5":
                    if (z%2==0) {
                        str[7] = "X|  ";
                        z--;
                        table();
                        break;}
                    else {
                        str[7] = "0|  ";
                        z--;
                        table();
                        break;}
                case "6":
                    if (z%2==0) {
                        str[8] = "X";
                        z--;
                        table();
                        break;}
                    else {
                        str[8] = "0";
                        z--;
                        table();
                        break;}
                case "7":
                    if (z%2==0) {
                        str[12] = " X| ";
                        z--;
                        table();
                        break;}
                    else {
                        str[12] = " 0| ";
                        z--;
                        table();
                        break;}
                case "8":
                    if (z%2==0) {
                        str[13] = "X|  ";
                        z--;
                        table();
                        break;}
                    else {
                        str[13] = "0|  ";
                        z--;
                        table();
                        break;}
                case "9":
                    if (z%2==0) {
                        str[14] = "X";
                        z--;
                        table();
                        break;}
                    else {
                        str[14] = "0";
                        z--;
                        table();
                        break;}
                default:
                    System.out.println("Вы вышли за границы таблицы");
                    break;
            }
            System.out.println();

            if (str[0].equals(" X| ")&&str[1].equals("X|  ")&&str[2].equals("X")||
                    str[6].equals(" X| ")&&str[7].equals("X|  ")&&str[7].equals("X")||
                    str[12].equals(" X| ")&&str[13].equals("X|  ")&&str[14].equals("X")||
                    str[0].equals(" X| ")&&str[6].equals(" X| ")&&str[12].equals(" X| ")||
                    str[1].equals("X|  ")&&str[7].equals("X|  ")&&str[1].equals("X|  ")||
                    str[2].equals("X")&&str[8].equals("X")&&str[14].equals("X")||
                    str[0].equals(" X| ")&&str[7].equals("X|  ")&&str[14].equals("X")){
                System.out.println("Победил Х");
                break;
            }else if(str[0].equals(" 0| ")&&str[1].equals("0|  ")&&str[2].equals("0")||
                    str[6].equals(" 0| ")&&str[7].equals("0|  ")&&str[7].equals("0")||
                    str[12].equals(" 0| ")&&str[13].equals("0|  ")&&str[14].equals("0")||
                    str[0].equals(" 0| ")&&str[6].equals(" 0| ")&&str[12].equals(" 0| ")||
                    str[1].equals("0|  ")&&str[7].equals("0|  ")&&str[1].equals("0|  ")||
                    str[2].equals("0")&&str[8].equals("0")&&str[14].equals("0")||
                    str[0].equals(" 0| ")&&str[7].equals("0|  ")&&str[14].equals("0")){
                System.out.println("Победил 0");
                break;
            }

        }

    }
}
