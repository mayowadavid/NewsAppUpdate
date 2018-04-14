package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by abhishek on 14-04-2018.
 */

public class EverythingModel {
    @SerializedName("articles")
    private List<InnerModel> articles;

    public List<InnerModel> getArticles() {
        return articles;
    }

    public void setArticles(List<InnerModel> articles) {
        this.articles = articles;
    }

    public class InnerModel
    {
        @SerializedName("source")
        private SearchSource source;
        @SerializedName("title")
        private String title;
        @SerializedName("description")
        private String description;
        @SerializedName("url")
        private String url;
        @SerializedName("urlToImage")
        private String urlToImage;

        public SearchSource getSource() {
            return source;
        }

        public void setSource(SearchSource source) {
            this.source = source;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrlToImage() {
            return urlToImage;
        }

        public void setUrlToImage(String urlToImage) {
            this.urlToImage = urlToImage;
        }

        public class SearchSource
        {
            @SerializedName("name")
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
