/**
 * Created by Amberlee on 6/8/17.
 */
import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                1,
                "car for sale",
                "This is a used 2014 Lancer GT"
        ));
        ads.add(new Ad(
                2,
                1,
                "free puppy",
                "puppy to a good home"
        ));
        ads.add(new Ad(
                3,
                2,
                "",
                "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        ads.add(new Ad(
                4,
                2,
                "JavaScript Developer needed",
                "Must have strong Java skills"
        ));
        return ads;
    }
}
