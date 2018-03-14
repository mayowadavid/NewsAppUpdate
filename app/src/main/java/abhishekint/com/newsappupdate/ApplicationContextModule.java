package abhishekint.com.newsappupdate;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by abhishek on 14-03-2018.
 */

@Module
public class ApplicationContextModule {
    private Context applicationContext;

    public ApplicationContextModule(Context applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Provides
    public Context getApplicationContext() {
        return applicationContext;
    }
}
