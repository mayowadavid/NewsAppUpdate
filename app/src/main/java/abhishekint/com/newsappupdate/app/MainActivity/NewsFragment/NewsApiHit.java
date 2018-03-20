package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment;

import io.reactivex.Observable;

/**
 * Created by abhishek on 19-03-2018.
 */

public class NewsApiHit {

    NewsApiClient newsApiClient;
    public NewsApiHit(NewsApiClient newsApiClient) {
        this.newsApiClient=newsApiClient;
    }

    public Observable<String> loadNewsDataFromApi()
    {
        return  Observable.just("abhi","aakash","patta","vinay","shalu","rahul");
    }
}
