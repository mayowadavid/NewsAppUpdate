package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by abhishek on 20-03-2018.
 */

public class NewsSourceDataModel {
    @SerializedName("sources")
    private List<NewsInner> sources;

    public List<NewsInner> getSources() {
        return sources;
    }

    public void setSources(List<NewsInner> sources) {
        this.sources = sources;
    }

    public class NewsInner
    {
        @SerializedName("id")
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
