package abhishekint.com.newsappupdate.app.MainActivity;

import android.app.Fragment;

import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel.EverythingModel;

/**
 * Created by abhishek on 16-03-2018.
 */

public interface MainActivityView {
    void firstTimeApplaunch(Fragment fragment);
    void launchFragmentWIthoutSaving(Fragment fragment);
    void showToast(String toastMsg);
    void searchCallWithData(Fragment fragment, EverythingModel everythingModel);
}
