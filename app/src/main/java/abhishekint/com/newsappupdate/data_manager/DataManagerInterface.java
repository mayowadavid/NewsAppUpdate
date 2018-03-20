package abhishekint.com.newsappupdate.data_manager;

import abhishekint.com.newsappupdate.app.MainActivity.MainActivity;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.NewsFragment;
import abhishekint.com.newsappupdate.modules.ActivityContextModule;
import abhishekint.com.newsappupdate.modules.ApplicationContextModule;
import abhishekint.com.newsappupdate.modules.BaseUrlModule;
import abhishekint.com.newsappupdate.modules.GlideInitModule;
import abhishekint.com.newsappupdate.modules.NetworkModule;
import abhishekint.com.newsappupdate.modules.OkHttpModule;
import abhishekint.com.newsappupdate.modules.RetrofitInitModule;
import dagger.Component;

/**
 * Created by abhishek on 14-03-2018.
 */

@Component(modules = {ApplicationContextModule.class, ActivityContextModule.class, GlideInitModule.class, RetrofitInitModule.class,
        BaseUrlModule.class, OkHttpModule.class, NetworkModule.class})
public interface DataManagerInterface {
    void b(MainActivity mainActivity);
    void c(NewsFragment newsFragment);
}
