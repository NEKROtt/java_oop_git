package seminar_3_dz.oldmain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        seminar_3_dz.gamefiles.NumberGame numberGame = new seminar_3_dz.gamefiles.NumberGame();
        Scanner scanner = new Scanner(System.in);
        numberGame.start(scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        while (!numberGame.getGameStatus().equals(seminar_3_dz.gamefiles.GameStatus.FINISH)){
            String value = scanner.nextLine();
            seminar_3_dz.gamefiles.Answer answer = numberGame.inputValue(value);
          if (answer!=null){
              System.out.println("answer = " + answer);
          }
            System.out.println(numberGame.getMoveHistory());
        }
    }
}