package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import abhishekint.com.newsappupdate.R;

/**
 * Created by abhishek on 19-03-2018.
 */

public class NewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    NewsSourceDataModel newsSourceDataModel;
    Context context;
    NewsSourceIconDataModel newsSourceIconDataModel;
    public NewsAdapter(NewsSourceIconDataModel newsSourceIconDataModel, NewsSourceDataModel newsSourceDataModel, Context context) {
        this.newsSourceDataModel=newsSourceDataModel;
        this.context=context;
        this.newsSourceIconDataModel=newsSourceIconDataModel;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news_recycler,parent,false);
        return new ViewHolder1(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder1)holder).item_news_recycler_tv.setText(newsSourceDataModel.getSources().get(position).getId());
        Glide.with(context).load(newsSourceIconDataModel.getServer_response().get(position).getImg_id()).into(((ViewHolder1)holder).item_news_recycler_iv);
    }

    @Override
    public int getItemCount() {
        return newsSourceDataModel.getSources().size();
    }

    private class ViewHolder1 extends RecyclerView.ViewHolder {
        TextView item_news_recycler_tv;
        ImageView item_news_recycler_iv;
        public ViewHolder1(View itemView) {
            super(itemView);
            item_news_recycler_tv=(TextView)itemView.findViewById(R.id.item_news_recycler_tv);
            item_news_recycler_iv=(ImageView) itemView.findViewById(R.id.item_news_recycler_iv);
        }
    }
}
