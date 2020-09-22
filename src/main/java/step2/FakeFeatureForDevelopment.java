package step2;

import java.util.List;

public class FakeFeatureForDevelopment implements Features {

    private List<String> features;

    public FakeFeatureForDevelopment(List<String> features) {
        this.features = features;
    }

    public List<String> listAllFeatures(){
        return features;
    }

    public String getMostImportantFeature() {
        return features.get(2);
    }

    public void foo() {
        System.out.println("foo");
    }

    public void bar() {
        System.out.println("bar");

    }

    public void donkey() {
        System.out.println("donkey");

    }

}

