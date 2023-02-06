package src.main.java.com.autorabit.npe;

/**
 * This class contains 5 cases of NullPointerException. The cases are commented
 * out
 * and can be run by passing the case number as an argument to the main method.
 * The cases are:
 * <ol>
 * <li>Accessing null object</li>
 * <li>Accessing object through an uninitialized reference</li>
 * <li>Accessing object through a null object reference in a nested method</li>
 * <li>Accessing null object in an array</li>
 * <li>Accessing object through a null object reference in a static field</li>
 * </ol>
 *
 * @author Autorabit
 * @version 1.0
 * @since 1.0
 */
public final class App {
  private String name;

  App() {
    System.out.println(this.name.toString()); // not initialized yet!
    this.name = "test";
  }

  static void log(Object x) {
    System.out.println(x.toString());
  }

  static void foo() {
    log(null);
  }

  /**
   * This method runs the cases based on the argument passed to it.
   *
   * @param args The argument passed to the main method which is the case number
   *             to run (case1, case2, case3, case4, case5)
   */
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Please provide a case number");
      return;
    }

    switch (args[0]) {
      case "case1":
        // case1();
        System.out.println("Case 1 is commented out because it will not compile");
        break;
      case "case2":
        // case2();
        System.out.println("Case 2 is commented out because it will not compile");
        break;
      case "case3":
        case3();
        break;
      case "case4":
        case4();
        break;
      // case "case5":
      // case5();
      // break;
      default:
        System.out.println("Invalid case number");
    }
  }

  // This case is commented out because it will not compile
  // private static void case1() {
  // // Case 1: Accessing null object
  // String s = null;
  // System.out.println(s.length()); // Throws NullPointerException
  // }

  // This case is commented out because it will not compile
  // private static void case2() {
  // // Case 2: Accessing object through an uninitialized reference
  // String t;
  // System.out.println(t.length()); // Throws NullPointerException
  // }

  private static void case3() {
    // Case 3: Accessing object through a null object reference in a nested method
    System.out.println(getNullString().length()); // Throws NullPointerException
  }

  private static void case4() {
    // Case 4: Accessing null object in an array
    String[] array = new String[2];
    System.out.println(array[0].length()); // Throws NullPointerException
  }

  // private static void case5() {
  // // Case 5: Accessing object through a null object reference in a static field
  // System.out.println(name.length()); // Throws NullPointerException
  // }

  public static String getNullString() {
    return null;
  }
}
