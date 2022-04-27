import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    Operation operation = new Operacao();
    Scanner scanner = new Scanner(System.in);
    int value = Integer.parseInt(scanner.nextLine());
    scanner.close();
    operation.moneyBillsQuantity(value);
    }
  }

//just basic java thing, you know how it is.
