import java.util.Scanner;

/**
 * Calculates the time it will take to microwave something.
 *
 * @author Kevin Csiffary
 * @version 1.0
 * @since 2024-02-08
 */
public final class Microwave {
  /** Private constructor to prevent instantiation of this utility class. */
  private Microwave() {
    // Prevents instantiation.
  }

  public static void main(final String[] args) {

    // Initialize times for items.
    final float pizzaTime = 45f;
    final float subTime = 60f;
    final float soupTime = 105f;

    float time = 0;

    // Create the scanner.
    Scanner sc = new Scanner(System.in);

    // Tell the user what the program does.
    System.out.print("This program calculates the time");
    System.out.println(" it will take to microwave something!");

    // Setup try catch
    try {
      // Get user input.
      System.out.println("What item are you microwaving? (soup, sub, or pizza)");
      String item = sc.nextLine();
      System.out.println("How many are you microwaving? (1, 2, or 3)");
      int amount = sc.nextInt();

      if (0 < amount && amount < 4) {
        // Check the item and then calculate the time.
        if (item.equals("soup")) {
          time = soupTime + ((soupTime / 2) * (amount - 1));
          // calculate the minutes and seconds.
          int minutes = (int) time / 60;
          float seconds = time % 60;

          // Tell the user the time it will take.
          System.out.print("It will take " + minutes + " minutes and ");
          System.out.print(String.format("%.1f", seconds) + " seconds ");
          System.out.println("to cook " + amount + " " + item + "(s).");
        } else if (item.equals("sub")) {
          time = subTime + ((subTime / 2) * (amount - 1));
          // calculate the minutes and seconds.
          int minutes = (int) time / 60;
          float seconds = time % 60;

          // Tell the user the time it will take.
          System.out.print("It will take " + minutes + " minutes and ");
          System.out.print(String.format("%.1f", seconds) + " seconds ");
          System.out.println("to cook " + amount + " " + item + "(s).");
        } else if (item.equals("pizza")) {
          time = pizzaTime + ((pizzaTime / 2) * (amount - 1));
          // calculate the minutes and seconds.
          int minutes = (int) time / 60;
          float seconds = time % 60;

          // Tell the user the time it will take.
          System.out.print("It will take " + minutes + " minutes and ");
          System.out.print(String.format("%.1f", seconds) + " seconds ");
          System.out.println("to cook " + amount + " " + item + "(s).");
        } else {
          System.out.println("Please enter either soup, sub or pizza.");
        }

      } else {
        System.out.println("Please enter 1, 2, or 3!");
      }
    } catch (Exception e) {
      System.out.println("Please enter a proper number!");
    }
  }
}
