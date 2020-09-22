package step2;

import org.junit.Test;
import zsecretThirdPartyPackageReadOnly.FeaturesStructureDifferentThanWhatWeAgreedOn;
import zsecretThirdPartyPackageReadOnly.ModelFeaturesApi;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EdgeClientTest {

    @Test
    public void using_mocked_features_for_development() {
        EdgeClient edgeClient = new EdgeClient();
        FakeFeatureForDevelopment fakeFeatureForDevelopment = new FakeFeatureForDevelopment(Arrays.asList("feature1", "feature2", "feature3"));
        edgeClient.trainModel(fakeFeatureForDevelopment);
        assertThat("Using mocked features for development", true, is(true));
    }

    @Test
    public void real_features_have_different_shape_than_expected() {
        EdgeClient edgeClient = new EdgeClient();
// uncomment me; it's not compiling
//        FeaturesStructureDifferentThanWhatWeAgreedOn realFeatures = new ModelFeaturesApi().getFeatures();
//        edgeClient.trainModel(realFeatures);
//        assertThat("Fix me without changing EdgeClient code", true, is(false));
    }
}