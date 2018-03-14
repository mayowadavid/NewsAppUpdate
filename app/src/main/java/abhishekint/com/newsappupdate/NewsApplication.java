package abhishekint.com.newsappupdate;

import android.app.Application;

import abhishekint.com.newsappupdate.data_manager.DataManagerInterface;
import abhishekint.com.newsappupdate.modules.ApplicationContextModule;

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
