package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by abhishek on 10-04-2018.
 */

public class NewsModel {
    private String topName;
    private String nameId;
    @SerializedName("totalResults")
    private int totalResults;
    @SerializedName("status")
    private String status;
    @SerializedName("articles")
    private List<NewsInnerData> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public String getTopName() {
        return topName;
    }

    public void setTopName(String topName) {
        this.topName = topName;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewsInnerData> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsInnerData> articles) {
        this.articles = articles;
    }

    public class NewsInnerData
    {
        @SerializedName("source")
        private NewsSource source;
        @SerializedName("author")
        private String author;
        @SerializedName("title")
        private String title;
        @SerializedName("description")
        private String description;
        @SerializedName("url")
        private String url;
        @SerializedName("urlToImage")
        private String urlToImage;

        public NewsSource getSource() {
            return source;
        }

        public void setSource(NewsSource source) {
            this.source = source;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
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

        public class NewsSource
        {
            @SerializedName("id")
            private String id;
            @SerializedName("name")
            private String name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
