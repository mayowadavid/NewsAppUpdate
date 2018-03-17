package abhishekint.com.newsappupdate.app.MainActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.TextView;

import javax.inject.Inject;

import abhishekint.com.newsappupdate.NewsApplication;
import abhishekint.com.newsappupdate.R;
import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import retrofit2.Retrofit;
import timber.log.Timber;

/**
 * Created by abhishek on 14-03-2018.
 */

public class MainActivity extends AppCompatActivity implements MainActivityMethodCall{

    @Inject
    public Retrofit retrofit;
    @BindView(R.id.main_frame_layout)
    FrameLayout main_frame_layout;
    @BindView(R.id.main_bottom_navigation_view)
    BottomNavigationView main_bottom_navigation_view;
    Unbinder unbinder;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((NewsApplication) getApplicationContext()).getNewsAppComponent().b(this);
        presenterInit();
        unbinder = ButterKnife.bind(this);
    }

    private void presenterInit() {
        mainPresenter=new MainPresenter(this);
    }

    /*@OnClick(R.id.activity_main_tv)
    public void buttonClick() {
        activity_main_tv.setText("Awesome Life!");
    }*/

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
