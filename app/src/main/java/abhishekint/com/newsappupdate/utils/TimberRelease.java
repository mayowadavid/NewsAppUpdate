package abhishekint.com.newsappupdate.utils;

import dagger.Module;
import timber.log.Timber;

/**
 * Created by abhishek on 14-03-2018.
 */

public class TimberRelease extends Timber.Tree {
    @Override
    protected void log(int priority, String tag, String message, Throwable t) {

    }
}
