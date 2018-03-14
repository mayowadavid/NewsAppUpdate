package abhishekint.com.newsappupdate;

import android.app.Application;

/**
 * Created by abhishek on 14-03-2018.
 */

public class NewsApplication extends Application {

    DataManagerInterface dataManagerInterface;
    @Override
    public void onCreate() {
        super.onCreate();
        dataManagerInterface= DaggerDataManagerInterface.builder()
                .applicationContextModule(new ApplicationContextModule(this)).build();
    }
}
