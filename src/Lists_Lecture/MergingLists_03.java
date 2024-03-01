package Lists_Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        int min = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < min ; i++) {

            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));
        }

       if (firstList.size() > secondList.size()) {

           List<Integer> remainingList = firstList.subList(min, firstList.size());
           resultList.addAll(remainingList);
       } else if (secondList.size() > firstList.size()) {

           List<Integer> remainingList = secondList.subList(min, secondList.size());
           resultList.addAll(remainingList);
       }

        for (Integer number : resultList) {
            System.out.print(number + " ");
        }
    }
}
