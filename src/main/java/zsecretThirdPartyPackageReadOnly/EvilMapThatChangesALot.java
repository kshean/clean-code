package zsecretThirdPartyPackageReadOnly;

import java.util.Map;

public interface EvilMapThatChangesALot<K, V> extends Map<K, V> {

    void doSomethingEvil();

}
