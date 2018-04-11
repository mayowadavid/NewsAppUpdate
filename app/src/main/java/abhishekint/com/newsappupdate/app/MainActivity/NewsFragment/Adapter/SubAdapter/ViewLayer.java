package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter.SubAdapter;

import java.util.List;

import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel.NewsModel;

/**
 * Created by abhishek on 10-04-2018.
 */

public interface ViewLayer {
    void getAllTopName(List<NewsModel> newsModels);
    void setIndiaNews();
}
