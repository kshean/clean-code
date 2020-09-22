package zsecretThirdPartyPackageReadOnly;

import java.util.HashMap;
import java.util.Map;

public class FeaturesStructureDifferentThanWhatWeAgreedOn {
    private Map<String, Integer> features = new HashMap<String, Integer>();

    public FeaturesStructureDifferentThanWhatWeAgreedOn() {
        this.features.put("feature1", 1);
        this.features.put("feature2", 2);
        this.features.put("feature3", 3);
    }

    public Map<String, Integer> listAllFeatures(){
        return this.features;
    }

    public Integer getMostImportantFeature(){
        return this.features.get("feature2");
    }

    public Map<String, Integer> getFeatures() {
        return features;
    }
}
