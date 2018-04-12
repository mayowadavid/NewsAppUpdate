package abhishekint.com.newsappupdate.app.MainActivity.NewsFragment.PresentationModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by abhishek on 12-04-2018.
 */

public class SourceModel {
    private String topSourceName;
    private String sourceId;
    @SerializedName("status")
    private String status;
    @SerializedName("sources")
    private List<Sources> sources;

    public String getTopSourceName() {
        return topSourceName;
    }

    public void setTopSourceName(String topSourceName) {
        this.topSourceName = topSourceName;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Sources> getSources() {
        return sources;
    }

    public void setSources(List<Sources> sources) {
        this.sources = sources;
    }

    public class Sources
    {
        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        @SerializedName("description")
        private String description;
        @SerializedName("url")
        private String url;
        @SerializedName("category")
        private String category;
        @SerializedName("language")
        private String language;
        @SerializedName("country")
        private String country;

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

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }
}
