import java.util.Scanner;

public class 05DivisionWithoutRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countFirst = 0;
        int countSecond = 0;
        int countThird = 0;

        for( int num = 1; num <= n; num++){
            int value = Integer.parseInt(scanner.nextLine());

            if(value % 2 == 0){
                countFirst++;
            }
            if(value % 3 == 0){
                countSecond++;
            }
            if(value % 4 == 0){
                countThird++;
            }
        }

        double percentFirst = countFirst * 1.0 / n * 100;
        double percentSecond = countSecond * 1.0 / n * 100;
        double percentThird = countThird * 1.0 / n * 100;

        System.out.printf("%.2f%%%n",percentFirst);
        System.out.printf("%.2f%%%n",percentSecond);
        System.out.printf("%.2f%%",percentThird);
    }
}