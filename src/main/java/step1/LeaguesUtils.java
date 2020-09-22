package step1;

import zsecretThirdPartyPackageReadOnly.EvilMapThatChangesALot;

public class LeaguesUtils {
    public void log(EvilMapThatChangesALot<Integer, String> leagues) {
        System.out.println("Logging Leagues...");
        leagues.doSomethingEvil();
    }

    public void publish(EvilMapThatChangesALot<Integer, String> leagues) {
        System.out.println("Publishing Leagues...");
        leagues.doSomethingEvil();
    }

    public void translate(EvilMapThatChangesALot<Integer, String> leagues) {
        System.out.println("Translating Leagues...");
        leagues.doSomethingEvil();

    }
}
