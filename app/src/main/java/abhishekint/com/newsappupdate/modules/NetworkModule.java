package abhishekint.com.newsappupdate.modules;

import javax.inject.Named;

import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Interater.NewsApiClient;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Interater.NewsApiHit;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Interater.NewsIconClient;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by abhishek on 19-03-2018.
 */

@Module
public class NetworkModule {

    @Provides
    public NewsApiClient providesTopHeadApiClient(@Named("top_head_retrofit") Retrofit retrofit)
    {
     return retrofit.create(NewsApiClient.class);
    }

    @Provides
    public NewsIconClient providesEverythingApiClient(@Named("everything_retrofit") Retrofit retrofit)
    {
        return retrofit.create(NewsIconClient.class);
    }

   /* @Provides
    public NewsIconClient providesSourceApiClient(@Named("everything_retrofit") Retrofit retrofit)
    {
        return retrofit.create(NewsIconClient.class);
    }*/

    @Provides
    public NewsApiHit providesNewsFeed(NewsApiClient newsApiClient,NewsIconClient newsIconClient,@Named("api_key") String api_key)
    {
        return new NewsApiHit(newsApiClient,newsIconClient,api_key);
    }

}
