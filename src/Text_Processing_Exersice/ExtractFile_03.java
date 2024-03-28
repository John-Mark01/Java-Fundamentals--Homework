package Text_Processing_Exersice;

import java.util.Scanner;

public class ExtractFile_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] strings = input.split("\\\\");

        String fileName = strings[strings.length -1].split("\\.")[0];
        String fileExtension = strings[strings.length -1].split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}
