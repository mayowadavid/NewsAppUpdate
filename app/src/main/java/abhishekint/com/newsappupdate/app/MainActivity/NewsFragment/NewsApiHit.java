package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/**
 * Created by abhishek on 19-03-2018.
 */

public class NewsApiHit {

    NewsApiClient newsApiClient;
    NewsIconClient newsIconClient;
    String api_key;
    public NewsApiHit(NewsApiClient newsApiClient,NewsIconClient newsIconClient,String api_key) {
        this.newsApiClient=newsApiClient;
        this.newsIconClient=newsIconClient;
        this.api_key=api_key;
    }

    public Observable<NewsSourceDataModel> loadNewsDataFromApi()
    {
        return newsApiClient.getNewsSources("en",api_key)
                .filter(filterForNull());
        /*return  Observable.just("abhi","aakash","patta","vinay","shalu","rahul");*/
    }

    private Predicate<? super NewsSourceDataModel> filterForNull() {
        return new Predicate<NewsSourceDataModel>() {
            @Override
            public boolean test(NewsSourceDataModel newsSourceDataModel) throws Exception {
                return newsSourceDataModel!=null;
            }
        };
    }

    public Observable<NewsSourceIconDataModel> loadNewsIconFromApi()
    {
        return newsIconClient.getNewsIconImg("http://abhishekint.16mb.com/NewsApp/retrieve.php")
                .filter(filterIconForNull());
        /*return  Observable.just("abhi","aakash","patta","vinay","shalu","rahul");*/
    }

    private Predicate<? super NewsSourceIconDataModel> filterIconForNull() {
        return new Predicate<NewsSourceIconDataModel>() {
            @Override
            public boolean test(NewsSourceIconDataModel newsSourceIconDataModel) throws Exception {
                return (newsSourceIconDataModel!=null);
            }
        };
    }

    /*private Function<? super NewsSourceDataModel,? extends ObservableSource<? extends NewsSourceDataModel>> toFeedItemDetailsObservableMapper() {
        return (Function<? super NewsSourceDataModel, ? extends ObservableSource<? extends NewsSourceDataModel>>) new Function<NewsSourceDataModel, Observable<Object>>() {
            @Override
            public Observable<Object> apply(NewsSourceDataModel newsSourceDataModel) throws Exception {
                Observable<NewsSourceIconDataModel> newsSourceIconDataModel=newsIconClient.getNewsIconImg("http://abhishekint.16mb.com/NewsApp/retrieve.php");
               return Observable.zip(newsSourceIconDataModel,newsSourceDataModel,new Func2<Integer, String, ClassModel>() {
                   @Override
                   public ClassModel call(Integer integer, String s) {
                       ClassModel zipObject = new ClassModel();
                       zipObject.alphabet = s;
                       zipObject.number = integer;
                       return zipObject;
                   }
               }););
            }
        };
    }
*/
    /*private Function<? super NewsSourceDataModel,? extends ObservableSource<? extends NewsSourceIconDataModel>> toFeedItemDetailsObservableMapper() {
        return new Function<NewsSourceDataModel, ObservableSource<? extends NewsSourceIconDataModel>>() {
            @Override
            public ObservableSource<? extends NewsSourceDataModel> apply(NewsSourceIconDataModel newsSourceDataModel) throws Exception {
                return newsIconClient.getNewsIconImg("http://abhishekint.16mb.com/NewsApp/retrieve.php")
                        ;
            }
        };
    }*/
}
