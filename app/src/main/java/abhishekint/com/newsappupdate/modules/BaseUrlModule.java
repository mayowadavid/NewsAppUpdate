package abhishekint.com.newsappupdate.modules;

import android.content.Context;

import javax.inject.Named;

import abhishekint.com.newsappupdate.R;
import dagger.Module;
import dagger.Provides;

/**
 * Created by abhishek on 14-03-2018.
 */

@Module
public class BaseUrlModule {

    @Provides
    @Named("top_head_url")
    public String getBaseUrlTopHead(Context applicationContext) {
        return applicationContext.getString(R.string.base_url_top);
    }

    @Provides
    @Named("everything_url")
    public String getBaseUrlEverything(Context applicationContext) {
        return applicationContext.getString(R.string.base_url_everything);
    }

    @Provides
    @Named("api_key")
    public String getApiKey(Context applicationContext) {
        return applicationContext.getString(R.string.api_key3);
    }

    @Provides
    @Named("source_url")
    public String getSourceKey(Context applicationContext) {
        return applicationContext.getString(R.string.base_url_source);
    }
}
