package abhishekint.com.newsappupdate.modules;

import java.util.concurrent.TimeUnit;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by abhishek on 14-03-2018.
 */
@Module
public class OkHttpModule {

    @Named("object_OkHttp")
    @Provides
    public OkHttpClient getOkHttp()
    {
        return new OkHttpClient.Builder()
                .connectTimeout(30L, TimeUnit.SECONDS)
                .readTimeout(30L, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();
    }
}
