package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import abhishekint.com.newsappupdate.R;

/**
 * Created by abhishek on 17-03-2018.
 */

public class NewsFragment extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_news,container,false);
        return view;
    }
}
