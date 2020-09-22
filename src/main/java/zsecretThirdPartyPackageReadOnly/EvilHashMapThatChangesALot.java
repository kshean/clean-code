package zsecretThirdPartyPackageReadOnly;

import java.util.HashMap;

public class EvilHashMapThatChangesALot<K,V> extends HashMap<K,V> implements EvilMapThatChangesALot<K,V> {
    public void doSomethingEvil() {
        this.remove(this.size() - 1);
    }

}
