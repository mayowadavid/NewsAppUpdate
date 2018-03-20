package abhishekint.com.newsappupdate.modules;

import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.NewsApiClient;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.NewsApiHit;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by abhishek on 19-03-2018.
 */

@Module
public class NetworkModule {

    @Provides
    public NewsApiClient providesNewsApiClient(Retrofit retrofit)
    {
     return retrofit.create(NewsApiClient.class);
    }

    @Provides
    public NewsApiHit providesNewsFeed(NewsApiClient newsApiClient)
    {
        return new NewsApiHit(newsApiClient);
    }
}
