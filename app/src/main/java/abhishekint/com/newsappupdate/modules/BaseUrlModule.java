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
    public String getBaseUrl(Context applicationContext) {
        return applicationContext.getString(R.string.base_url);
    }

}
