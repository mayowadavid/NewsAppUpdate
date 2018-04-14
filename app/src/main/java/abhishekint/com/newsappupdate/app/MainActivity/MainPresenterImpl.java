package abhishekint.com.newsappupdate.app.MainActivity;

import android.app.Fragment;

import abhishekint.com.newsappupdate.app.MainActivity.SearchFragment.MainPresenter;

/**
 * Created by abhishek on 16-03-2018.
 */

public class MainPresenterImpl implements MainPresenter{

    private final MainActivityView mainActivityView;
    public MainPresenterImpl(MainActivityView mainActivityView) {
        this.mainActivityView = mainActivityView;
    }

    @Override
    public void SearchButtonClick(Fragment fragment) {
        mainActivityView.firstTimeApplaunch(fragment);
    }
}
