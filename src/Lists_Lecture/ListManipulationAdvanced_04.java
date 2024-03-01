package Lists_Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String method = command.split(" ")[0];

            switch (method) {

                case "Contains":
                    int number = Integer.parseInt(command.split(" ")[1]);
                    if (numbersList.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = command.split(" ")[1];
                    if (evenOrOdd.equals("even")) {
                        List<Integer> evenIntegers = new ArrayList<>();
                        for (int num = 0; num <= numbersList.size() - 1; num++) {
                            if (numbersList.get(num) % 2 == 0) {
                                evenIntegers.add(numbersList.get(num));
                            }
                        }
                        for (Integer evenInteger : evenIntegers) {
                            System.out.print(evenInteger + " ");
                        }
                        System.out.println();
                    } else {

                        if (evenOrOdd.equals("odd")) {
                            List<Integer> oddIntegers = new ArrayList<>();
                            for (int num = 0; num <= numbersList.size() - 1; num++) {
                                if (numbersList.get(num) % 2 != 0) {
                                    oddIntegers.add(numbersList.get(num));
                                }
                            }
                            for (Integer evenInteger : oddIntegers) {
                                System.out.print(evenInteger + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int n = 0; n <= numbersList.size() - 1; n++) {
                        int newNumber = numbersList.get(n);
                        sum += newNumber;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = command.split(" ")[1];
                    int conditionNumber = Integer.parseInt(command.split(" ")[2]);

                    switch (condition) {
                        case "<":
                            for (Integer integer : numbersList) {
                                if (integer < conditionNumber) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (Integer integer : numbersList) {
                                if (integer > conditionNumber) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (Integer integer : numbersList) {
                                if (integer >= conditionNumber) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (Integer integer : numbersList) {
                                if (integer <= conditionNumber) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
            }
            command = scanner.nextLine();

        }

    }
}
