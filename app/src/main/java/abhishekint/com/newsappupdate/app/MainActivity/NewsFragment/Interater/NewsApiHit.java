package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Interater;

import java.util.ArrayList;
import java.util.List;

import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel.NewsModel;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;

/**
 * Created by abhishek on 19-03-2018.
 */

public class NewsApiHit {

    NewsApiClient newsApiClient;
    NewsIconClient newsIconClient;
    public String api_key;

    public NewsApiHit(NewsApiClient newsApiClient, NewsIconClient newsIconClient, String api_key) {
        this.newsApiClient = newsApiClient;
        this.newsIconClient = newsIconClient;
        this.api_key = api_key;
    }

    public List<NewsModel> fillModelWithTopName() {
        List<NewsModel> newsModels = new ArrayList<>();
        NewsModel newsModel1 = new NewsModel();
        newsModel1.setTopName("Top India");
        newsModel1.setNameId("in");
        NewsModel newsModel2 = new NewsModel();
        newsModel2.setTopName("Top United States");
        newsModel2.setNameId("us");
        NewsModel newsModel3 = new NewsModel();
        newsModel3.setTopName("Top Canada");
        newsModel3.setNameId("ca");
        NewsModel newsModel4 = new NewsModel();
        newsModel4.setTopName("Top Australia");
        newsModel4.setNameId("au");
        NewsModel newsModel5 = new NewsModel();
        newsModel5.setTopName("Top Britain");
        newsModel5.setNameId("br");

        newsModels.add(newsModel1);
        newsModels.add(newsModel2);
        newsModels.add(newsModel3);
        newsModels.add(newsModel4);
        newsModels.add(newsModel5);

        return newsModels;
    }


    public Observable<NewsModel> loadNewsDataFromApi(int page, int pageSize,String country) {
        return newsApiClient.getCountryTopHead(country,pageSize,page, api_key)
                /*.filter(filterForNull())*/;
       // return  Observable.just("abhi","aakash","patta","vinay","shalu","rahul");
    }

    /*private Predicate<? super CountryTopHeadNews> filterForNull() {
        return new Predicate<CountryTopHeadNews>() {
            @Override
            public boolean test(CountryTopHeadNews countryTopHeadNews) throws Exception {
                return countryTopHeadNews !=null;
            }
        };
    }*/
    /*public Observable<NewsSourceIconDataModel> loadNewsIconFromApi()
    {
        return newsIconClient.getNewsIconImg("http://abhishekint.16mb.com/NewsApp/retrieve.php")
                .filter(filterIconForNull());
        *//*return  Observable.just("abhi","aakash","patta","vinay","shalu","rahul");*//*
    }

    private Predicate<? super NewsSourceIconDataModel> filterIconForNull() {
        return new Predicate<NewsSourceIconDataModel>() {
            @Override
            public boolean test(NewsSourceIconDataModel newsSourceIconDataModel) throws Exception {
                return (newsSourceIconDataModel!=null);
            }
        };
    }*/

    }

