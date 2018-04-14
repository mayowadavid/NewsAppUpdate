package abhishekint.com.newsappupdate.app.MainActivity.SearchFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import abhishekint.com.newsappupdate.R;
import butterknife.BindView;

/**
 * Created by abhishek on 14-04-2018.
 */

public class SearchFragment extends Fragment {
    @BindView(R.id.common_recycler_view)
    RecyclerView common_recycler_view;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.recycler_view,container,false);
        return view;
    }
}
