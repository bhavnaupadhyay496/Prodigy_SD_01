import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get temperature value from user
        System.out.print("Enter the temperature value: ");
        double inputTemp = scanner.nextDouble();

        // Get the original unit from user
        System.out.print("Enter the unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        double celsius, fahrenheit, kelvin;

        switch (unit) {
            case 'C':
                celsius = inputTemp;
                fahrenheit = (celsius * 9 / 5) + 32;
                kelvin = celsius + 273.15;
                System.out.println("Fahrenheit: " + fahrenheit + " °F");
                System.out.println("Kelvin: " + kelvin + " K");
                break;

            case 'F':
                fahrenheit = inputTemp;
                celsius = (fahrenheit - 32) * 5 / 9;
                kelvin = celsius + 273.15;
                System.out.println("Celsius: " + celsius + " °C");
                System.out.println("Kelvin: " + kelvin + " K");
                break;

            case 'K':
                kelvin = inputTemp;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Celsius: " + celsius + " °C");
                System.out.println("Fahrenheit: " + fahrenheit + " °F");
                break;

            default:
                System.out.println("Invalid unit! Please enter C, F, or K.");
        }

        scanner.close();
    }
}
