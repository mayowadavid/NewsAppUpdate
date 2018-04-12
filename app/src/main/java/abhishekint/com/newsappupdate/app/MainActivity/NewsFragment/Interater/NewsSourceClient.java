package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Interater;

import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel.SourceModel;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by abhishek on 20-03-2018.
 */

public interface NewsSourceClient {
    @GET("https://newsapi.org/v2/sources")
    Observable<SourceModel> getSourceData(@Query("language") String lang,@Query("category") String category,
                                          @Header("X-Api-Key") String apiKey);
}
