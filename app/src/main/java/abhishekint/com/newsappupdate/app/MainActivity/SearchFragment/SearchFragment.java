package abhishekint.com.newsappupdate.app.MainActivity.SearchFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import abhishekint.com.newsappupdate.R;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel.EverythingModel;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by abhishek on 14-04-2018.
 */

public class SearchFragment extends Fragment implements SearchFragmentView{
    @BindView(R.id.common_recycler_view)
    RecyclerView common_recycler_view;
    View view;
    EverythingModel everythingModel;
    SearchPresenter searchPresenter;
    SearchAdapter searchAdatper;
    RecyclerView.LayoutManager layoutManager;
    Unbinder unbinder;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.recycler_view,container,false);
        unbinder = ButterKnife.bind(this,view);
        initializeView();
        initializeRest();
        return view;
    }

    private void initializeView() {
        layoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        common_recycler_view.setLayoutManager(layoutManager);
    }

    private void initializeRest() {
        searchAdatper=new SearchAdapter(getActivity(),everythingModel);
        common_recycler_view.setAdapter(searchAdatper);
    }

    public void getSearchQueryData(EverythingModel everythingModel)
    {
        this.everythingModel=everythingModel;
    }
}
