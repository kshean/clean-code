package step2;


import java.util.List;

public class EdgeClient {

    public void trainModel(Features features){
        features.foo();
        features.bar();
        features.donkey();
        List<String> allFeatures = features.listAllFeatures();
        String mostImportantFeature = features.getMostImportantFeature();
        Model.train(allFeatures, mostImportantFeature);
    }
}
