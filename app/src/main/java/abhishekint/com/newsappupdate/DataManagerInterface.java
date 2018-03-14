package abhishekint.com.newsappupdate;

import dagger.Component;

/**
 * Created by abhishek on 14-03-2018.
 */

@Component(modules = {ApplicationContextModule.class, ActivityContextModule.class, GlideInitModule.class, RetrofitInitModule.class,
        TimberModule.class})
public interface DataManagerInterface {
}
