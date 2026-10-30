void main() {
    Scanner userInput = new Scanner(System.in);
    boolean flag = true;
    double value1 = 0;
    double value2 = 0;
    int optionValue = 0;


        operationsMenu();

        try{

            System.out.print("\nSelect the operation: ");
            optionValue = userInput.nextInt();

            switch (optionValue){
                case 1:
                    System.out.print("\n\nInsert value 1: ");
                    value1 = userInput.nextDouble();

                    System.out.print("Insert value 2: ");
                    value2 = userInput.nextDouble();
                    sum(value1, value2);
                    break;
                case 2:
                    System.out.print("\n\nInsert value 1: ");
                    value1 = userInput.nextDouble();

                    System.out.print("Insert value 2: ");
                    value2 = userInput.nextDouble();
                    subtract(value1, value2);
                    break;
                case 3:
                    System.out.print("\n\nInsert value 1: ");
                    value1 = userInput.nextDouble();

                    System.out.print("Insert value 2: ");
                    value2 = userInput.nextDouble();
                    multiplication(value1, value2);
                    break;
                case 4:
                    System.out.print("\n\nInsert value 1: ");
                    value1 = userInput.nextDouble();

                    System.out.print("Insert value 2: ");
                    value2 = userInput.nextDouble();
                    division(value1, value2);
                    break;
                default:
                    System.out.print("Bye!");
                    break;
                }
            } catch (InputMismatchException e){
                System.out.println("Invalid Input");
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





