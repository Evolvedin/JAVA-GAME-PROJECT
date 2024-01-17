
/**
 * purpose of the class: Trivia Game blueprint
 * Name:
 * Date:26/07/2023
 * Time:11.40 pm
 * This is just a test!
 */
import java.util.Random;
import java.util.Scanner;

public class TriviaGameTest {
  public static void main(String[] args) {
    TriviaGame player1 = new TriviaGame();
    Category player = new Category();
    Scanner input = new Scanner(System.in);
    System.out.println(input);
    System.out.println("");
    System.out.println("------------------------------------------");
    System.out.println("WELCOME!!");
    System.out.println("------------------------------------------");
    System.out.println("");
    System.out.println("Choose a Game Mode: 'M' or 'C'");
    System.out.println("");
    System.out.println("M : MILIONARE MODE $$$");
    System.out.println("C : Category Mode");
    String gameModeSt = input.nextLine();
    char gameMode = gameModeSt.charAt(0);

    if (gameMode == 'M' || gameMode == 'm') {
      System.out.println("------------------------------------------");
      System.out.println("Enter your name: ");
      String player1Name = input.nextLine();
      player1.setPlayerName(player1Name);
      System.out.println("------------------------------------------");

      System.out.println("HOW WANTS TO BE A MILLIONARE $$$");
      System.out.println("");
      System.out.println(player1.getPlayerName() + ", LET'S START THE GAME!");
      Random rData = new Random();
      int rPattern = rData.nextInt(900) + 100;
      player1.setPattern(rPattern);
      // System.out.println(player1.getPattern());

      String[] questionOne = player1.questionsOne();
      System.out.println("");
      System.out.println("First question is Worth $250.000 DOLLARS!!");
      System.out.println("------------------------------------------");
      for (int i = 0; i < 5; i++) {
        System.out.println("");
        System.out.println(questionOne[i]);
      }
      String answerOneStr = input.nextLine();
      char answerOne = Character.toLowerCase(answerOneStr.charAt(0));

      if (answerOne == player1.answersOne()) {
        player1.setPlayerScore(250000);
        System.out.println("");
        System.out.println("The answer is CORRECT!");
        System.out.println("You just WON! $250.000 Dollars");
        System.out.println("");
        System.out.println("Your have $" + player1.getPlayerScore() + " Dollars");
        System.out.println("------------------------------------------");
      } else {
        player1.setPlayerScore(0);
        System.out.println("");
        System.out.println("WRONG!, next question");
        System.out.println("------------------------------------------");
        System.out.println("");
      }

      // Adding a delay of 3 seconds before the next question
      try {
        Thread.sleep(3000);
      } catch (InterruptedException ignored) {
      }

      String[] questionTwo = player1.questionsTwo();
      System.out.println("");
      System.out.println("Second question is Worth another $250.000 DOLLARS!!");
      System.out.println("---------------------------------------------------");
      for (int i = 0; i < 5; i++) {
        System.out.println("");
        System.out.println(questionTwo[i]);
      }
      String answerTwoStr = input.nextLine();
      char answerTwo = Character.toLowerCase(answerTwoStr.charAt(0));

      if (answerTwo == player1.answersTwo()) {
        player1.setPlayerScore(player1.getPlayerScore() + 250000);
        System.out.println("");
        System.out.println("The answer is CORRECT!");
        System.out.println("You just WON! $250.000 Dollars");
        System.out.println("");
        System.out.println("Your have $" + player1.getPlayerScore() + " Dollars");
        System.out.println("------------------------------------------");
        System.out.println("");
      } else {
        if (player1.getPlayerScore() != 0) {
          player1.setPlayerScore(player1.getPlayerScore() / 2);
          System.out.println("");
          System.out.println("WRONG!, you lost HALF of your prize");
          System.out.println("");
          System.out.println("Your have $" + player1.getPlayerScore() + " Dollars");
          System.out.println("------------------------------------------");
          System.out.println("");
        } else {
          System.out.println("");
          System.out.println("WRONG!, next question");
          System.out.println("------------------------------------------");
          System.out.println("");
        }
      }
      // Adding a delay of 3 seconds before the next question
      try {
        Thread.sleep(3000);
      } catch (InterruptedException ignored) {
      }

      String[] questionThree = player1.questionsThree();
      System.out.println("");
      System.out.println("The Third and LAST question is Worth a WOPPING! $500.000 DOLLARS!!");
      System.out.println("------------------------------------------------------------------");
      System.out.println("");
      try {
        Thread.sleep(3000);
      } catch (InterruptedException ignored) {
      }
      System.out.println("Here it Goes!");
      try {
        Thread.sleep(2000);
      } catch (InterruptedException ignored) {
      }
      System.out.println("");
      for (int i = 0; i < 5; i++) {
        System.out.println("");
        System.out.println(questionThree[i]);
      }
      String answerThreeStr = input.nextLine();
      char answerThree = Character.toLowerCase(answerThreeStr.charAt(0));

      if (answerThree == player1.answersThree()) {
        player1.setPlayerScore(player1.getPlayerScore() + 500000);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("");
        System.out.println("Your answer IS");
        try {
          Thread.sleep(3000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("");
        System.out.println("CORRECT!");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("");
        System.out.println("You just WON! $500.000 Dollars");
      } else {
        if (player1.getPlayerScore() != 0) {
          player1.setPlayerScore(player1.getPlayerScore() / 2);
          try {
            Thread.sleep(1000);
          } catch (InterruptedException ignored) {
          }
          System.out.println("");
          System.out.println("Your answer IS");
          try {
            Thread.sleep(3000);
          } catch (InterruptedException ignored) {
          }
          System.out.println("");
          System.out.println("WRONG!");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException ignored) {
          }
          System.out.println("You just lost HALF of your prize");
        } else {
          try {
            Thread.sleep(3000);
          } catch (InterruptedException ignored) {
          }
          System.out.println("");
          System.out.println("WRONG!, again?");
        }
      }

      if (player1.getPlayerScore() == 1000000) {
        try {
          Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("");
        System.out.println("INCREDIBLE !");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("");
        System.out.println("Your have WON! $1.000.000 Dollars");
        try {
          Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }
        for (int i = 0; i <= 2; i++) {
          System.out.println("");
          System.out.println("Congratulations " + player1.getPlayerName() + " You're a MILLIONARE!!!");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException ignored) {
          }
        }
      } else {
        try {
          Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("");
        System.out.println("Congratulations!");
        System.out.println("");
        System.out.println("You WON! $" + player1.getPlayerScore());
      }
      System.out.println("------------------------------------------");
    }

    // !##################################################################------------------###########################################################################
    // !##################################################################---CATEGORY|MODE---###########################################################################
    // !##################################################################------------------###########################################################################

    else if (gameMode == 'C' || gameMode == 'c') {
      System.out.println("---------------------------");
      System.out.println("Enter your name: ");
      String playerName = input.nextLine();
      player.setPlayerName(playerName);
      System.out.println("---------------------------");

      System.out.println("choose a Category: S/H/E/M");
      System.out.println("(S= Science and Technology)");
      System.out.println("(H= Geography and History)");
      System.out.println("(E= Entertainment)");
      System.out.println("(M= Music and Literature)");

      player.setQuestion(1);
      String gameCateStr = input.nextLine();
      char gameCategory = gameCateStr.charAt(0);
      String answerStr;
      char answer;

      switch (gameCategory) {
        case 'S', 's':
          for (int x = 0; x < 5; x++) {
            player.setQuestion(x);
            String[] questionSc = player.Science();
            for (int i = 0; i < 5; i++) {
              System.out.println(questionSc[i]);
            }

            answerStr = input.nextLine();
            answer = Character.toLowerCase(answerStr.charAt(0));
            if (answer == player.answersSc()) {
              player1.setPlayerScore(player1.getPlayerScore() + 500000);
              System.out.println("The answer is CORRECT!");
            } else {
              System.out.println("WRONG!");
            }
          }
          break;

        case 'H', 'h':
          for (int x = 0; x < 5; x++) {
            player.setQuestion(x);
            String[] questionHi = player.History();
            for (int i = 0; i < 5; i++) {
              System.out.println(questionHi[i]);
            }

            answerStr = input.nextLine();
            answer = Character.toLowerCase(answerStr.charAt(0));
            if (answer == player.answersH()) {
              player1.setPlayerScore(player1.getPlayerScore() + 500000);
              System.out.println("The answer is CORRECT!");
            } else {
              System.out.println("WRONG!");
            }
          }
          break;

        case 'E', 'e':
          for (int x = 0; x < 5; x++) {
            player.setQuestion(x);
            String[] questionEn = player.Entertainment();
            for (int i = 0; i < 5; i++) {
              System.out.println(questionEn[i]);
            }

            answerStr = input.nextLine();
            answer = Character.toLowerCase(answerStr.charAt(0));
            if (answer == player.answersEn()) {
              player1.setPlayerScore(player1.getPlayerScore() + 500000);
              System.out.println("The answer is CORRECT!");
            } else {
              System.out.println("WRONG!");
            }
          }
          break;

        case 'M', 'm':
          for (int x = 0; x < 5; x++) {
            player.setQuestion(x);
            String[] questionMu = player.Music();
            for (int i = 0; i < 5; i++) {
              System.out.println(questionMu[i]);
            }

            answerStr = input.nextLine();
            answer = Character.toLowerCase(answerStr.charAt(0));
            if (answer == player.answersMu()) {
              player1.setPlayerScore(player1.getPlayerScore() + 500000);
              System.out.println("The answer is CORRECT!");
            } else {
              System.out.println("WRONG!");
            }
          }
          break;
        default:
          System.out.println("invalid category");
      }
    }

    else {
      System.out.println("invalid game mode");
    }
  }
}