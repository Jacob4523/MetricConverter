import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Metric Converter App!\n");
        System.out.println("To use this app, first input the conversion you want to do (Ex: km = miles)");
        System.out.println("The available conversions are:\n'km = miles': kilometers to miles\n'cm = in': centimeters to inches");
        System.out.println("'kg = lb': grams to pounds\n'L = gal': milliliters to ounces\n");
        System.out.println("Next, input a value that is not negative (can include decimals) that you want to convert");
        System.out.println("The program will then display the result of the conversion\n");
        System.out.println("Input -1 anytime to end the program\n");
        
        String conversion;
        double inputValue = 0;
        double outputValue;
        
        while (inputValue != -1) {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter the conversion you want to do (Ex: km = miles): ");
            conversion = userInput.nextLine();
            switch (conversion) {
                case "cm = in":
                    System.out.print("Enter the value you want to convert: ");
                    inputValue = userInput.nextDouble();
                    if (inputValue == -1) {
                        break;
                    } else if (inputValue < 0) {
                        System.out.println("That input is not supported by this app, please input a value >= 0\n");
                        break;
                    } else {
                        outputValue = inputValue * 0.394;
                        System.out.println("\n" + inputValue + " cm = " + outputValue + " in\n");
                        break;
                    }
                case "km = miles":
                    System.out.print("Enter the value you want to convert: ");
                    inputValue = userInput.nextDouble();
                    if (inputValue == -1) {
                        break;
                    } else if (inputValue < 0) {
                        System.out.println("That input is not supported by this app, please input a value >= 0\n");
                        break;
                    } else {
                        outputValue = inputValue * 0.621;
                        System.out.println("\n" + inputValue + " km = " + outputValue + " miles\n");
                        break;
                    }
                case "kg = lb":
                    System.out.print("Enter the value you want to convert: ");
                    inputValue = userInput.nextDouble();
                    if (inputValue == -1) {
                        break;
                    } else if (inputValue < 0) {
                        System.out.println("That input is not supported by this app, please input a value >= 0\n");
                        break;
                    } else {
                        outputValue = inputValue * 2.205;
                        System.out.println("\n" + inputValue + " kg = " + outputValue + " lb\n");
                        break;
                    }
                case "L = gal":
                    System.out.print("Enter the value you want to convert: ");
                    inputValue = userInput.nextDouble();
                    if (inputValue == -1) {
                        break;
                    } else if (inputValue < 0) {
                        System.out.println("That input is not supported by this app, please input a value >= 0\n");
                        break;
                    } else {
                        outputValue = inputValue * 0.264;
                        System.out.println("\n" + inputValue + " L = " + outputValue + " gal\n");
                        break;
                    }
                case "-1":
                    inputValue = -1;
                    break;
                default:
                    System.out.println("That input is not supported by this app, please input another query (Ex: km = mile)\n"); 
                    break;
            }
        }
    }
}
