package step1;

import zsecretThirdPartyPackageReadOnly.EvilMapThatChangesALot;
import zsecretThirdPartyPackageReadOnly.LeaguesApi;

import java.util.Map;

class EdgeClient {

    private LeaguesApi leaguesApi = new LeaguesApi();
    private LeaguesUtils leaguesUtils = new LeaguesUtils();


    public EdgeClient() {
    }

    public EvilMapThatChangesALot<Integer, String> getLeagues() {
        EvilMapThatChangesALot<Integer, String> leagues = this.leaguesApi.getLeagues();
        EvilMapThatChangesALot<Integer, String> leagues1 = this.leaguesApi.getLeagues();
        Map<Integer, String> result = foobar(leagues1);
        this.leaguesUtils.log(leagues);
        this.leaguesUtils.publish(leagues);
        this.leaguesUtils.translate(leagues);
        return leagues;
    }

    private Map<Integer, String> foobar(EvilMapThatChangesALot<Integer, String> leagues1) {

        leagues1.entrySet().stre
    }

}