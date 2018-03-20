package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment;

import io.reactivex.Observable;
import timber.log.Timber;

/**
 * Created by abhishek on 19-03-2018.
 */

public class NewsApiHit {

    NewsApiClient newsApiClient;
    public NewsApiHit(NewsApiClient newsApiClient) {
        this.newsApiClient=newsApiClient;
    }

    public Observable<NewsSourceDataModel> loadNewsDataFromApi()
    {
        return newsApiClient.getTopRatedMovies("en");
        /*return  Observable.just("abhi","aakash","patta","vinay","shalu","rahul");*/
    }
}
