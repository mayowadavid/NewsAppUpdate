package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Presenter;

import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter.SubAdapter.ViewHolderLayer;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter.SubAdapter.ViewLayer;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel.NewsModel;

/**
 * Created by abhishek on 28-03-2018.
 */

public interface NewsPresenter {
    void loadCategorywiseCountryData(int page,String country,String category);
    int getNewsSize(NewsModel newsModel);
    void getTopName(ViewLayer viewLayer);
    void getIndiaNews(NewsModel newsModel, ViewHolderLayer viewHolderLayer,String nameId,int page,int pageSize);
}
