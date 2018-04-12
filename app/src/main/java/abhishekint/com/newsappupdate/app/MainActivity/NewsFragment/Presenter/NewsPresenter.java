package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Presenter;

import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter.SubAdapter.SourceItemAdapterLayer;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter.SubAdapter.ViewHolderLayer;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter.SubAdapter.ViewLayer;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel.NewsModel;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel.SourceModel;

/**
 * Created by abhishek on 28-03-2018.
 */

public interface NewsPresenter {
    void loadCategorywiseCountryData(int page,String country,String category);
    int getNewsSize(NewsModel newsModel);
    void getTopName(ViewLayer viewLayer);
    void getSources(ViewLayer viewLayer);
    void getSourcesWithCategory(SourceModel sourceModel, SourceItemAdapterLayer sourceItemAdapterLayer, String nameId);
    void getIndiaNews(NewsModel newsModel, ViewHolderLayer viewHolderLayer,String nameId,int page,int pageSize);
}
