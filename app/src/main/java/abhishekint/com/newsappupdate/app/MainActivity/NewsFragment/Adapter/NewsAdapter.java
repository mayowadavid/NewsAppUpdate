package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import abhishekint.com.newsappupdate.R;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter.NewsViewHolder.NewsItemViewHolder;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter.SubAdapter.IndiaAdapter;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter.SubAdapter.ViewHolderLayer;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter.SubAdapter.ViewLayer;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationLayer.NewsAdapterView;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel.NewsModel;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Presenter.NewsPresenter;

/**
 * Created by abhishek on 28-03-2018.
 */

public class NewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements ViewLayer {
    NewsAdapterView newsAdapterView;
    RecyclerView.LayoutManager layoutManager;
    Context context;
    IndiaAdapter indiaAdapter;
    NewsPresenter newsPresenter;
    NewsModel newsModel;
    List<NewsModel> newsModels;
    int page=1;
    int pageSize=10;

    public NewsAdapter(NewsAdapterView newsAdapterView,NewsPresenter newsPresenter, Context context) {
        this.newsAdapterView = newsAdapterView;
        this.context=context;
        this.newsPresenter=newsPresenter;
        newsModel=new NewsModel();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news_genre,parent,false);
        return new NewsAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((NewsAdapterViewHolder)holder).textView.setText(newsModels.get(position).getTopName());
        layoutManager=new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
        ((NewsAdapterViewHolder)holder).recyclerView.setLayoutManager(layoutManager);
        indiaAdapter=new IndiaAdapter(context,newsAdapterView,newsPresenter,newsModels.get(position),page,pageSize);
        ((NewsAdapterViewHolder)holder).recyclerView.setAdapter(indiaAdapter);
        newsPresenter.getIndiaNews(newsModels.get(position),indiaAdapter,newsModels.get(position).getNameId(),page,pageSize);
        /*layoutManager=new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
        ((NewsAdapterViewHolder)holder).recyclerView.setLayoutManager(layoutManager);
        indiaAdapter=new IndiaAdapter(context,newsAdapterView,newsPresenter,newsModel);
        ((NewsAdapterViewHolder)holder).recyclerView.setAdapter(indiaAdapter);*/
    }

    @Override
    public int getItemCount() {
        Log.e("chck for cunt","check for count"+newsModels.size());
        return newsModels != null ? newsModels.size() : 0;
    }

    @Override
    public void getAllTopName(List<NewsModel> newsModels) {
        Log.e("chck for method","cehckf for mehod"+newsModels.size());
        this.newsModels=newsModels;
        notifyDataSetChanged();
    }

    @Override
    public void setIndiaNews() {

    }

    public class NewsAdapterViewHolder extends RecyclerView.ViewHolder
    {
        public RecyclerView recyclerView;
        public TextView textView;
        public NewsAdapterViewHolder(View itemView) {
            super(itemView);
            recyclerView=(RecyclerView)itemView.findViewById(R.id.item_news_genre_recyclerview);
            textView=(TextView)itemView.findViewById(R.id.fragment_fashion_new_title);
        }

        /*@Override
        public void setIndiaItem() {
            *//*layoutManager=new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
            recyclerView.setLayoutManager(layoutManager);
            indiaAdapter=new IndiaAdapter(context,newsAdapterView,newsPresenter,newsModels.get(getAdapterPosition()));
            recyclerView.setAdapter(indiaAdapter);*//*

        }*/
    }
}
