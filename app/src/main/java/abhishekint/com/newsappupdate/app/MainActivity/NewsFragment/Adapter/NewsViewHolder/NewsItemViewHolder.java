package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.Adapter.NewsViewHolder;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import abhishekint.com.newsappupdate.R;

/**
 * Created by abhishek on 02-04-2018.
 */

public class NewsItemViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView textView;
    public NewsItemViewHolder(View itemView) {
        super(itemView);
        imageView=(ImageView)itemView.findViewById(R.id.item_news_recycler_iv);
        textView=(TextView)itemView.findViewById(R.id.item_news_recycler_tv);
    }
}
