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
    public ImageView item_news_recycler_image_iv;
    public TextView item_news_recycler_title_tv,item_news_recycler_source_tv;
    public NewsItemViewHolder(View itemView) {
        super(itemView);
        item_news_recycler_image_iv=(ImageView)itemView.findViewById(R.id.item_news_recycler_image_iv);
        item_news_recycler_title_tv=(TextView)itemView.findViewById(R.id.item_news_recycler_title_tv);
        item_news_recycler_source_tv=(TextView)itemView.findViewById(R.id.item_news_recycler_source_tv);
    }
}
