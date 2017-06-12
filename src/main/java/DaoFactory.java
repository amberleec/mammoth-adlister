/**
 * Created by Amberlee on 6/8/17.
 */

public class DaoFactory {
    private static Ads adsDao;

    static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
