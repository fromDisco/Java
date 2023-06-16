package CodeWars_8kyu.CharacterMatching;

public class Client {
    public static void main(String[] args) {
        String doesSheHe01 = CharacterMatching.areYouPlayingBanjo("Martin"); // "Martin does not play banjo",
        System.out.println(doesSheHe01);

        String doesSheHe02 = CharacterMatching.areYouPlayingBanjo("Rikke"); // "Rikke plays banjo",
        System.out.println(doesSheHe02);

        String doesSheHe03 = CharacterMatching.areYouPlayingBanjo("rolf"); // "rolf plays banjo",
        System.out.println(doesSheHe03);

        String doesSheHe04 = CharacterMatching.areYouPlayingBanjo("bravo"); // "bravo does not play banjo",
        System.out.println(doesSheHe04);
    }
}
