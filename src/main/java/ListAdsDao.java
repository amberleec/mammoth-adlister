/**
 * Created by Amberlee on 6/8/17.
 */
import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<AD> ads;

    public List<AD> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    private List<AD> generateAds() {
        List<AD> ads = new ArrayList<>();
        ads.add(new AD(
                1,
                1,
                "playstation for sale",
                "This is a slightly used playstation"
        ));
        ads.add(new AD(
                2,
                1,
                "Super Nintendo",
                "Get your game on with this old-school classic!"
        ));
        ads.add(new AD(
                3,
                2,
                "Junior Java Developer Position",
                "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        ads.add(new AD(
                4,
                2,
                "JavaScript Developer needed",
                "Must have strong Java skills"
        ));
        return ads;
    }
}
