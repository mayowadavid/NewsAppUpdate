package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Interater;

import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel.NewsModel;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by abhishek on 19-03-2018.
 */

public interface NewsApiClient {
    @GET("https://newsapi.org/v2/top-headlines")
    Observable<NewsModel> getCountryTopHead(@Query("country") String country,@Query("pageSize") int pageSize,
            @Query("page") int page, @Header("X-Api-Key") String apiKey);
}
