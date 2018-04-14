package abhishekint.com.newsappupdate.modules;

import javax.inject.Named;

import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Interater.NewsApiClient;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Interater.NewsApiHit;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Interater.NewsEverythingClient;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Interater.NewsSourceClient;
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
    public NewsEverythingClient providesEverythingApiClient(@Named("everything_retrofit") Retrofit retrofit)
    {
        return retrofit.create(NewsEverythingClient.class);
    }

    @Provides
    public NewsSourceClient providesSourceApiClient(@Named("source_retrofit") Retrofit retrofit)
    {
        return retrofit.create(NewsSourceClient.class);
    }
   /* @Provides
    public NewsEverythingClient providesSourceApiClient(@Named("everything_retrofit") Retrofit retrofit)
    {
        return retrofit.create(NewsEverythingClient.class);
    }*/

    @Provides
    public NewsApiHit providesNewsFeed(NewsApiClient newsApiClient, NewsEverythingClient newsEverythingClient, NewsSourceClient newsSourceClient, @Named("api_key") String api_key)
    {
        return new NewsApiHit(newsApiClient, newsEverythingClient,newsSourceClient,api_key);
    }

}
