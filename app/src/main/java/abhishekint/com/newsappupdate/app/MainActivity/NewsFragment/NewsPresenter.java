package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment;

import android.widget.Toast;

import abhishekint.com.newsappupdate.schedulers.AppSchedulerProvider;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import timber.log.Timber;

/**
 * Created by abhishek on 19-03-2018.
 */

public class NewsPresenter {

    NewsApiHit newsApiHit;
    AppSchedulerProvider appSchedulerProvider;
    NewsFragMethodCall newsFragMethodCall;

    public NewsPresenter(NewsApiHit newsApiHit,AppSchedulerProvider appSchedulerProvider,NewsFragMethodCall newsFragMethodCall ) {
        this.newsApiHit=newsApiHit;
        this.appSchedulerProvider=appSchedulerProvider;
        this.newsFragMethodCall=newsFragMethodCall;
    }

    public void loadNewsFeed()
    {
        /*Observable<String>  observable=*/newsApiHit.loadNewsDataFromApi()
                .subscribeOn(appSchedulerProvider.io())
                .observeOn(appSchedulerProvider.ui())
                .subscribe(new Observer<NewsSourceDataModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Timber.e(""+d);
                    }

                    @Override
                    public void onNext(NewsSourceDataModel newsSourceDataModel) {
                        newsFragMethodCall.interfaceOnNextCall(newsSourceDataModel);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Timber.e(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void loadNewsIcon(final NewsSourceDataModel newsSourceDataModel)
    {
        /*Observable<String>  observable=*/newsApiHit.loadNewsIconFromApi()
            .subscribeOn(appSchedulerProvider.io())
            .observeOn(appSchedulerProvider.ui())
            .subscribe(new Observer<NewsSourceIconDataModel>() {
                @Override
                public void onSubscribe(Disposable d) {
                    Timber.e(""+d);
                }

                @Override
                public void onNext(NewsSourceIconDataModel newsSourceIconDataModel) {
                    newsFragMethodCall.interfaceOnIconNextCall(newsSourceIconDataModel,newsSourceDataModel);
                }

                @Override
                public void onError(Throwable e) {
                    Timber.e(e);
                }

                @Override
                public void onComplete() {

                }
            });
    }
}
