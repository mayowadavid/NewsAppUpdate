package abhishekint.com.newsappupdate.modules;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by abhishek on 14-03-2018.
 */

@Module
public class RetrofitInitModule {

    @Provides
    @Named("parent_retrofit")
    public Retrofit getParentRetrofit(@Named("parent_base_url") String baseURL,OkHttpClient okHttpClient)
    {
        return  getClient(baseURL, okHttpClient);
    }

    @Provides
    @Named("icon_retrofit")
    public Retrofit getIconRetrofit(@Named("icon_base_url") String baseURL,OkHttpClient okHttpClient)
    {
        return  getClient(baseURL, okHttpClient);
    }

    @Provides
    public Retrofit getClient(String baseURL,OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(baseURL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
}