package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by abhishek on 19-03-2018.
 */

public interface NewsApiClient {
    @GET("https://newsapi.org/v2/sources")
    Observable<NewsSourceDataModel> getNewsSources(@Query("language") String url,@Query("apiKey") String apiKey);
}
