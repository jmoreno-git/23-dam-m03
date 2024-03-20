package arrayintvalid;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class ArrayValid {

    private static final int MIN_VALUE = 10;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        int[] data;
        try {
            //read length
            System.out.print("Input length: ");
            length = sc.nextInt();
            //assess that length is positive
            if (length > 0) {
                //instantiate data
                data = new int[length];
                //read data from user
                int counter = 0;
                do {
                    try {
                        //read a value
                        System.out.format("Value at index %d: ", counter);
                        int value = sc.nextInt();
                        //validate value
                        if (value < MIN_VALUE) {
                            throw new TooLowValueException(
                                    String.format("Value %d lower than minim value allowed %d", value, MIN_VALUE)
                            );
                        }
                        if (value >= MAX_VALUE) {
                            throw new TooHighValueException(
                                    String.format("Value %d greater than or equal to maxim value allowed %d", value, MAX_VALUE)
                            );
                        }
                        //ok
                        //put value in array
                        data[counter] = value;
                        //increment counter
                        counter++;
                    } catch (TooLowValueException ex) {
                        System.out.println("Invalid value. Too low. Try again.");
                    } catch (TooHighValueException ex) {
                        System.out.println("Invalid value. Too high. Try again.");
                    } catch (InputMismatchException ex) {
                        sc.next();
                        System.out.println("Invalid data. Characters not allowed. Try again.");
                    }
                } while (counter < length);
                //show array of data
                System.out.println(Arrays.toString(data));
//                for (int v : data) {
//                    System.out.println(v);
//                }
            } else {
                System.out.println("Length must be positive");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error reading array length");
        }

    }

}
