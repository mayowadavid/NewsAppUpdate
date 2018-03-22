package abhishekint.com.newsappupdate.app.MainActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import abhishekint.com.newsappupdate.NewsApplication;
import abhishekint.com.newsappupdate.R;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.NewsFragment;
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

public class MainActivity extends AppCompatActivity implements MainActivityMethodCall, BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.main_frame_layout)
    FrameLayout main_frame_layout;
    @BindView(R.id.main_bottom_navigation_view)
    BottomNavigationView main_bottom_navigation_view;
    Unbinder unbinder;
    MainPresenter mainPresenter;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((NewsApplication) getApplicationContext()).getNewsAppComponent().b(this);
        unbinder = ButterKnife.bind(this);
        presenterInit();
        initializeViews();
        initializeRest();
        firstTimeApplaunch(new NewsFragment());
    }

    private void initializeRest() {
        fragmentManager = getFragmentManager();
        main_bottom_navigation_view.setOnNavigationItemSelectedListener(this);
    }

    private void initializeViews() {
    }

    private void presenterInit() {
        mainPresenter = new MainPresenter(this);
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

    @Override
    public void firstTimeApplaunch(Fragment fragment) {
        fragmentManager.beginTransaction()
                .add(R.id.main_frame_layout, fragment)
                .addToBackStack("")
                .commit();
    }

    @Override
    public void launchFragment(Fragment fragment) {
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_news:
            {
                Timber.e(""+fragmentManager.findFragmentById(R.id.main_frame_layout).getClass().getName());
                Timber.e(""+new NewsFragment().getClass().getName());
                if (fragmentManager.findFragmentById(R.id.main_frame_layout).getClass().getName().equals(new NewsFragment().getClass().getName()))
                {
                    Toast.makeText(this, "You're already on News", Toast.LENGTH_SHORT).show();
                }
                else if (!fragmentManager.findFragmentById(R.id.main_frame_layout).getClass().getName().equals(new NewsFragment().getClass().getName()))
                {
                    launchFragment(new NewsFragment());
                    Toast.makeText(this, "opening News", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(this, "wrong class name", Toast.LENGTH_SHORT).show();
            }
                break;
            case R.id.menu_articles:
                Toast.makeText(this, "Comming Soon", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}
