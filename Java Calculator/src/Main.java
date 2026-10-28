void main() {
    Scanner userInput = new Scanner(System.in);
    boolean flag = false;

    while(!flag){
        try{
            operationsMenu();

            System.out.print("\nSelect the operation: ");
            int optionValue = userInput.nextInt();

            System.out.print("\n\nInsert value 1: ");
            double value1 = userInput.nextDouble();

            System.out.print("Insert value 2: ");
            double value2 = userInput.nextDouble();

            switch (optionValue){
                case 1:
                    sum(value1, value2);
                    break;
                case 2:
                    subtract(value1, value2);
                    break;
                case 3:
                    multiplication(value1, value2);
                    break;
                case 4:
                    division(value1, value2);
                    break;
                default:
                    System.out.print("Bye!");
                    flag = true;
                    break;
            }
        } catch (InputMismatchException | NumberFormatException e){
            System.out.println("Invalid Input");
        }
    }




}

public static void operationsMenu(){
    System.out.println("\nCalculator Menu");
    System.out.println("1 -> Addition");
    System.out.println("2 -> Subtract");
    System.out.println("3 -> Multiplication");
    System.out.println("4 -> Division");
    System.out.println("5 -> Quit");
}

public static void sum(double value1, double value2){
    System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
}

public static void subtract(double value1, double value2){
    System.out.println(value1 + " - " + value2 + " = " + (value1 - value2));
}

public static void multiplication(double value1, double value2){
    System.out.println(value1 + " * " + value2 + " = " + (value1 * value2));
}

public static void division(double value1, double value2){
    if(value1 == 0 || value2 == 0){
        System.out.println("The result is: " + 0);
    }

    if(value1 < 0 || value2 < 0){
        System.out.println("The result is: " + -1);
    }

    System.out.println(value1 + " / " + value2 + " = " + (value1 / value2));
}





