package Songs_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int times = 1; times <= n ; times++) {
            String input = scanner.nextLine();
            String[] songData = input.split("_");

            String typeList = songData[0];
            String name = songData[1];
            String time = songData[2];

            Song song = new Song();
            song.setTypeList(typeList);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String lastCommand = scanner.nextLine();
        if (lastCommand.equals("all")) {
            songs.forEach(song -> System.out.println(song.getName()));
        } else {
           for (Song song : songs) {
               if (song.getTypeList().equals(lastCommand)) {
                   System.out.println(song.getName());
               }
           }
        }
    }
}
