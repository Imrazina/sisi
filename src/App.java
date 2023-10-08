import java.util.Scanner;

public class App {

  public static final String KVADRAT = "kvadrat";
  public static final String TREUHELNIK = "treuhelnik";
  public static final String KONUS = "konus";

  public static void main(String[] args) {

    System.out.println("Choose the figure: \na = " + KVADRAT + "\nb = " + TREUHELNIK + "\nc = " + KONUS);

    Scanner input = new Scanner(System.in);

    String figure = input.nextLine();

    resolveFigure(figure, input);
  }

  private static void resolveFigure(String figure, Scanner input) {
    if (!figure.equals(KONUS)) {
      System.out.println("Choose what you want to find:\n1 = perimetr\n2 = ploshad");
    } else {
      System.out.println("Choose what you want to find:\n1 = stena\n2 = ploshad");
    }
    if (figure.equals(KVADRAT)) {
      System.out.println("3 = diagonal");
    } else if (figure.equals(TREUHELNIK)) {
      System.out.println("3 = vysota");
    } else if (figure.equals(KONUS)) {
      System.out.println("3 = objem");
    }

    String find = input.nextLine();
    String otvet = "";

    if (find.equals("2")) {
      otvet = findPloshad(figure, input);
    }
    
    System.out.println("You answer is: " + otvet);
  }

  private static String findPloshad(String figure, Scanner input) {
    String otvet = "";

    if (figure.equals(KVADRAT)) {
      System.out.print("Storona kvadrata: ");
      double storonaKvadrata = input.nextDouble();
      otvet = String.valueOf(storonaKvadrata * storonaKvadrata);
    } else if (figure.equals(KVADRAT)) {
      System.out.print("Storona treugolnika A: ");
      double storonaTreugolnikaA = input.nextDouble();
      System.out.print("storona treugolnika B: ");
      double storonaTreugolnikaB = input.nextDouble();
      System.out.print("storona treugolnika C: ");
      double storonaTreugolnikaC = input.nextDouble();
      double poluPerimetr = (storonaTreugolnikaA + storonaTreugolnikaC + storonaTreugolnikaB) / 2;
      otvet = String.valueOf(Math.sqrt((poluPerimetr* (poluPerimetr- storonaTreugolnikaA) * (poluPerimetr- storonaTreugolnikaB) * (poluPerimetr- storonaTreugolnikaC))));
    } else if (figure.equals(KONUS)) {
      System.out.print("Radius: ");
      double radius = input.nextDouble();
      System.out.print("Vysota: ");
      double vysota = input.nextDouble();
      otvet = String.valueOf(Math.PI * radius * vysota + 2 * Math.PI * radius);
    }

    return otvet;
  }

  /**
   * if (figure.equals(KVADRAT)) {
   *
   *       if (find.equals("1")) {
   *
   *         System.out.println("Zadejte storonu " + KVADRAT + "a: ");
   *
   *         double d = input.nextDouble();
   *
   *         System.out.println("Perimetr: " + 4 * d);
   *
   *       } else if (find.equals("2")) {
   *
   *         System.out.println("Zadejte storonu " + KVADRAT + "a: ");
   *
   *         double f = input.nextDouble();
   *
   *         System.out.println("Ploshad: " + f * f);
   *
   *       } else if (find.equals("3")) {
   *
   *         System.out.println("Zadejte storonu " + KVADRAT + "a: ");
   *
   *         double g = input.nextDouble();
   *
   *         System.out.println("diagonal: " + g * (Math.sqrt(2)));
   *       } else {
   *
   *         System.out.println("error");
   *
   *       }
   *     } else if (figure.equals(TREUHELNIK)) {
   *
   *       String find = input.nextLine();
   *
   *       if (find.equals("1")) {
   *
   *         System.out.println("Zadejte storonu " + TREUHELNIK + "a: ");
   *
   *         double x = input.nextDouble();
   *
   *         System.out.println("Perimetr: " + 3 * x);
   *
   *       } else if (find.equals("2")) {
   *
   *         System.out.println("Zadejte storony " + TREUHELNIK + "a: ");
   *
   *         double z;
   *         double p;
   *         double r;
   *         double t;
   *
   *         z = input.nextDouble();
   *         r = input.nextDouble();
   *         t = input.nextDouble();
   *
   *         poluPerimetr= (z + r + t) / 2;
   *
   *         System.out.println("Ploshad: " + (Math.sqrt((poluPerimetr* (poluPerimetr- z) * (poluPerimetr- r) * (poluPerimetr- t)))));
   *
   *       } else if (find.equals("3")) {
   *
   *         System.out.println("Zadejte storony " + TREUHELNIK + "a: ");
   *
   *         double m;
   *         double n;
   *         double k;
   *         double o;
   *
   *         m = input.nextDouble();
   *         n = input.nextDouble();
   *         k = input.nextDouble();
   *
   *         o = (m + n + k) / 2;
   *
   *         System.out.println("vysota: " + ((2 * (Math.sqrt((o * (o - m) * (o - n) * (o - k))))) / m));
   *       } else {
   *
   *         System.out.println("error");
   *
   *       }
   *
   *     } else if (figure.equals(KONUS)) {
   *
   *       System.out.println("Choose ur parametr: ");
   *       System.out.println("1 = stena: ");
   *       System.out.println("2 = ploshad: ");
   *
   *       String parameter = input.nextLine();
   *
   *       if (parameter.equals("1")) {
   *         int r;
   *         int h;
   *         System.out.println("zadajte parametry " + KONUS + "a: ");
   *         r = input.nextInt();
   *         h = input.nextInt();
   *         System.out.println(Math.sqrt(r * r - h * h));
   *       } else if (parameter.equals("3")) {
   *         Double u;
   *         Double h;
   *
   *         System.out.println("zadajte parametry ");
   *
   *         u = input.nextDouble();
   *         h = input.nextDouble();
   *
   *         System.out.println(1 / 3 * pi * (u) * h);
   *       } else if (parameter.equals("2")) {
   *
   *         int g;
   *         int l;
   *
   *         System.out.println("zadejte parametry: ");
   *
   *         g = input.nextInt();
   *
   *         l = input.nextInt();
   *
   *         System.out.println(pi * (g * l));
   *
   *       } else {
   *         System.out.println("error");
   *       }
   *     } else {
   *       System.out.println("eror");
   *     }
   */
}