package abhishekint.com.newsappupdate.modules;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by abhishek on 14-03-2018.
 */

@Module(includes = OkHttpModule.class)
public class RetrofitInitModule {

    @Provides
    public Retrofit getClient(String baseURL,@Named("object_OkHttp") OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(baseURL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}