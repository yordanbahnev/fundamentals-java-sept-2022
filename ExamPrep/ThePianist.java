package ExamPrep;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPieces = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> piecesComKey = new LinkedHashMap<>();

        for (int i = 0; i < numberPieces ; i++) {

            String [] piecesArr = scanner.nextLine().split("\\|");

            String pieces = piecesArr[0];
            String composer = piecesArr[1];
            String key = piecesArr[2];

            piecesComKey.put(pieces, new ArrayList<>());
            piecesComKey.get(pieces).add(composer);
            piecesComKey.get(pieces).add(key);

        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commandInfo = command.split("\\|");
            String commandWord = commandInfo[0];
            String piece = commandInfo[1];

            if (commandWord.equals("Add")) {
                //•	"Add|{piece}|{composer}|{key}":
                String composer = commandInfo[2];
                String key = commandInfo[3];

                if(!isPieceInTheCollection(piecesComKey,piece)) {
                    piecesComKey.put(piece, new ArrayList<>());
                    List<String> composerKey = piecesComKey.get(piece);
                    composerKey.add(composer);
                    composerKey.add(key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);

                } else {//"{piece} by {composer} in {key} added to the collection!"
                    System.out.printf("%s is already in the collection!%n", piece);
                }

            } else if (commandWord.equals("Remove")) {
                //"Successfully removed {piece}!"
                if (isPieceInTheCollection(piecesComKey,piece)) {
                    piecesComKey.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
                //"Invalid operation! {piece} does not exist in the collection."

            } else if (commandWord.equals("ChangeKey")) {
                String newKey = commandInfo[2];
                if (isPieceInTheCollection(piecesComKey,piece)) {

                    String oldKey = piecesComKey.get(piece).get(1);
                    piecesComKey.get(piece).set(1, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : piecesComKey.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }

    }
    public static boolean isPieceInTheCollection(Map<String, List<String>> pieceMap, String piece) {
        if (pieceMap.containsKey(piece)) {
            return true;
        }
        return false;
    }
}
