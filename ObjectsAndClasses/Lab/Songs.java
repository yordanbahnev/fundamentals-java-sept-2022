package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song {
        // ПОЛЕТА
        private String typeList;
        private String name;
        private String time;

        // ГЕТЕРИ
        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
        //КОНСТРУКТОР
        public Song (String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int songsNum = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < songsNum; i++) {
            String [] inputData = scanner.nextLine().split("_");

//            String type = inputData[0];
//            String name = inputData[1];
//            String time = inputData[2];
            // Създаване на обект "currentSong"
            Song currentSong = new Song(inputData[0], inputData[1], inputData[2]);
            //добавяне на обекта към list songs
            songs.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
        }
    }

