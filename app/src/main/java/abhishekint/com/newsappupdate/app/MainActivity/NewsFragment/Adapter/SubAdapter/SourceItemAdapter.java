package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter.SubAdapter;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import abhishekint.com.newsappupdate.R;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel.SourceModel;
import abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Presenter.NewsPresenter;

/**
 * Created by abhishek on 12-04-2018.
 */

public class SourceItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements SourceItemAdapterLayer{
    Context context;
    NewsPresenter newsPresenter;
    SourceModel sourceModel;
    Integer integer;

    public SourceItemAdapter(Context context, NewsPresenter newsPresenter, SourceModel sourceModel,Integer integer) {
        this.context=context;
        this.newsPresenter=newsPresenter;
        this.sourceModel=sourceModel;
        this.integer=integer;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType==0)
        {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_blank_page_trans_back,parent,false);
            return new BlankPageViewHolder(view);
        }
        else
        {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news_source_recycler,parent,false);
            return new SourceViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType()==2)
        {
            ((SourceViewHolder)holder).textView.setText(sourceModel.getSources().get(position-1).getName());
            Glide.with(context).load(integer).into(((SourceViewHolder)holder).imageView);
        }
    }

    @Override
    public int getItemCount() {
        return sourceModel.getSources()!=null?sourceModel.getSources().size()+1:0;
        /*return sourceModel.getSources()!=null?
                (sourceModel.getSources().size()==20?
                        sourceModel.getSources().size()+1:
                        sourceModel.getSources().size()+2):
                0;*/
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0)
            return 0;
        /*else if (position>sourceModel.getSources().size())
        {
            if (sourceModel.getSources().size()!=20)
                return 1;
            return 2;
        }*/
        else
            return 2;
    }

    @Override
    public void setSourceItem() {
        notifyDataSetChanged();
    }

    public class SourceViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        ImageView imageView;
        public SourceViewHolder(View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.item_news_source_recycler_tv);
            imageView=(ImageView)itemView.findViewById(R.id.item_news_source_recycler_iv);
        }
    }
    public class BlankPageViewHolder extends RecyclerView.ViewHolder
    {
        public BlankPageViewHolder(View itemView) {
            super(itemView);
        }
    }
}
