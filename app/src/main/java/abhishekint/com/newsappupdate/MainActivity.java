package abhishekint.com.newsappupdate;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Created by abhishek on 14-03-2018.
 */

public class MainActivity extends AppCompatActivity {

    @Inject
    public Retrofit retrofit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((NewsApplication) getApplicationContext()).getNewsAppComponent().b(this);
    }
}
