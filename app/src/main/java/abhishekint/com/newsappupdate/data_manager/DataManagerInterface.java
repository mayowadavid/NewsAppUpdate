package abhishekint.com.newsappupdate.data_manager;

import abhishekint.com.newsappupdate.MainActivity;
import abhishekint.com.newsappupdate.modules.ActivityContextModule;
import abhishekint.com.newsappupdate.modules.ApplicationContextModule;
import abhishekint.com.newsappupdate.modules.BaseUrlModule;
import abhishekint.com.newsappupdate.modules.GlideInitModule;
import abhishekint.com.newsappupdate.modules.OkHttpModule;
import abhishekint.com.newsappupdate.modules.RetrofitInitModule;
import dagger.Component;

/**
 * Created by abhishek on 14-03-2018.
 */

@Component(modules = {ApplicationContextModule.class, ActivityContextModule.class, GlideInitModule.class, RetrofitInitModule.class,
        BaseUrlModule.class, OkHttpModule.class})
public interface DataManagerInterface {
    void b(MainActivity mainActivity);
}
