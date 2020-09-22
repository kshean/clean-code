package zsecretThirdPartyPackageReadOnly;

public class LeaguesApi {
    public EvilMapThatChangesALot<Integer, String> getLeagues() {
        EvilMapThatChangesALot<Integer, String> leagues = new EvilHashMapThatChangesALot<Integer, String>();
        leagues.put(1, "EPL");
        leagues.put(2, "La Liga");
        leagues.put(3, "Bundesliga");
        return leagues;
    }
}
