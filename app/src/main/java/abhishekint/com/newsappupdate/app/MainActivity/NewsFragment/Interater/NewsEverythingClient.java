package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Interater;

import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel.EverythingModel;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by abhishek on 20-03-2018.
 */

public interface NewsEverythingClient {
    @GET("https://newsapi.org/v2/everything")
    Observable<EverythingModel> getCountryTopHead(@Query("q") String query, @Query("language") String lang,
                                                  @Query("sortBy") String sortBy,
                                                  @Query("pageSize") int pageSize, @Header("X-Api-Key") String apiKey);
}
