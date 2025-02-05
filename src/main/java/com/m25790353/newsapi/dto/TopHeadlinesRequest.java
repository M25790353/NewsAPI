//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.m25790353.newsapi.dto;

// @Data, @Builder
public class TopHeadlinesRequest {
    private String category;
    private String sources;
    private String query;
    private String pageSize;
    private String page;
    private String country;
    private String language;
    private String excludeDomains;
    private String searchIn;

    TopHeadlinesRequest(final String category, final String sources, final String query, final String pageSize, final String page, final String country, final String language, final String excludeDomains, final String searchIn) {
        this.category = category;
        this.sources = sources;
        this.query = query;
        this.pageSize = pageSize;
        this.page = page;
        this.country = country;
        this.language = language;
        this.excludeDomains = excludeDomains;
        this.searchIn = searchIn;
    }

    public static TopHeadlinesRequestBuilder builder() {
        return new TopHeadlinesRequestBuilder();
    }

    public String getCategory() {
        return this.category;
    }

    public String getSources() {
        return this.sources;
    }

    public String getQuery() {
        return this.query;
    }

    public String getPageSize() {
        return this.pageSize;
    }

    public String getPage() {
        return this.page;
    }

    public String getCountry() {
        return this.country;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getExcludeDomains() {
        return this.excludeDomains;
    }

    public String getSearchIn() {
        return this.searchIn;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public void setSources(final String sources) {
        this.sources = sources;
    }

    public void setQuery(final String query) {
        this.query = query;
    }

    public void setPageSize(final String pageSize) {
        this.pageSize = pageSize;
    }

    public void setPage(final String page) {
        this.page = page;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setExcludeDomains(final String excludeDomains) {
        this.excludeDomains = excludeDomains;
    }

    public void setSearchIn(final String searchIn) {
        this.searchIn = searchIn;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof TopHeadlinesRequest)) {
            return false;
        } else {
            TopHeadlinesRequest other = (TopHeadlinesRequest)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$category = this.getCategory();
                Object other$category = other.getCategory();
                if (this$category == null) {
                    if (other$category != null) {
                        return false;
                    }
                } else if (!this$category.equals(other$category)) {
                    return false;
                }

                Object this$sources = this.getSources();
                Object other$sources = other.getSources();
                if (this$sources == null) {
                    if (other$sources != null) {
                        return false;
                    }
                } else if (!this$sources.equals(other$sources)) {
                    return false;
                }

                Object this$query = this.getQuery();
                Object other$query = other.getQuery();
                if (this$query == null) {
                    if (other$query != null) {
                        return false;
                    }
                } else if (!this$query.equals(other$query)) {
                    return false;
                }

                Object this$pageSize = this.getPageSize();
                Object other$pageSize = other.getPageSize();
                if (this$pageSize == null) {
                    if (other$pageSize != null) {
                        return false;
                    }
                } else if (!this$pageSize.equals(other$pageSize)) {
                    return false;
                }

                Object this$page = this.getPage();
                Object other$page = other.getPage();
                if (this$page == null) {
                    if (other$page != null) {
                        return false;
                    }
                } else if (!this$page.equals(other$page)) {
                    return false;
                }

                Object this$country = this.getCountry();
                Object other$country = other.getCountry();
                if (this$country == null) {
                    if (other$country != null) {
                        return false;
                    }
                } else if (!this$country.equals(other$country)) {
                    return false;
                }

                Object this$language = this.getLanguage();
                Object other$language = other.getLanguage();
                if (this$language == null) {
                    if (other$language != null) {
                        return false;
                    }
                } else if (!this$language.equals(other$language)) {
                    return false;
                }

                Object this$excludeDomains = this.getExcludeDomains();
                Object other$excludeDomains = other.getExcludeDomains();
                if (this$excludeDomains == null) {
                    if (other$excludeDomains != null) {
                        return false;
                    }
                } else if (!this$excludeDomains.equals(other$excludeDomains)) {
                    return false;
                }

                Object this$searchIn = this.getSearchIn();
                Object other$searchIn = other.getSearchIn();
                if (this$searchIn == null) {
                    if (other$searchIn != null) {
                        return false;
                    }
                } else if (!this$searchIn.equals(other$searchIn)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TopHeadlinesRequest;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $category = this.getCategory();
        result = result * 59 + ($category == null ? 43 : $category.hashCode());
        Object $sources = this.getSources();
        result = result * 59 + ($sources == null ? 43 : $sources.hashCode());
        Object $query = this.getQuery();
        result = result * 59 + ($query == null ? 43 : $query.hashCode());
        Object $pageSize = this.getPageSize();
        result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
        Object $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : $page.hashCode());
        Object $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        Object $language = this.getLanguage();
        result = result * 59 + ($language == null ? 43 : $language.hashCode());
        Object $excludeDomains = this.getExcludeDomains();
        result = result * 59 + ($excludeDomains == null ? 43 : $excludeDomains.hashCode());
        Object $searchIn = this.getSearchIn();
        result = result * 59 + ($searchIn == null ? 43 : $searchIn.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getCategory();
        return "TopHeadlinesRequest(category=" + var10000 + ", sources=" + this.getSources() + ", query=" + this.getQuery() + ", pageSize=" + this.getPageSize() + ", page=" + this.getPage() + ", country=" + this.getCountry() + ", language=" + this.getLanguage() + ", excludeDomains=" + this.getExcludeDomains() + ", searchIn=" + this.getSearchIn() + ")";
    }

    public static class TopHeadlinesRequestBuilder {
        private String category;
        private String sources;
        private String query;
        private String pageSize;
        private String page;
        private String country;
        private String language;
        private String excludeDomains;
        private String searchIn;

        TopHeadlinesRequestBuilder() {
        }

        public TopHeadlinesRequestBuilder category(final String category) {
            this.category = category;
            return this;
        }

        public TopHeadlinesRequestBuilder sources(final String sources) {
            this.sources = sources;
            return this;
        }

        public TopHeadlinesRequestBuilder query(final String query) {
            this.query = query;
            return this;
        }

        public TopHeadlinesRequestBuilder pageSize(final String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public TopHeadlinesRequestBuilder page(final String page) {
            this.page = page;
            return this;
        }

        public TopHeadlinesRequestBuilder country(final String country) {
            this.country = country;
            return this;
        }

        public TopHeadlinesRequestBuilder language(final String language) {
            this.language = language;
            return this;
        }

        public TopHeadlinesRequestBuilder excludeDomains(final String excludeDomains) {
            this.excludeDomains = excludeDomains;
            return this;
        }

        public TopHeadlinesRequestBuilder searchIn(final String searchIn) {
            this.searchIn = searchIn;
            return this;
        }

        public TopHeadlinesRequest build() {
            return new TopHeadlinesRequest(this.category, this.sources, this.query, this.pageSize, this.page, this.country, this.language, this.excludeDomains, this.searchIn);
        }

        public String toString() {
            return "TopHeadlinesRequest.TopHeadlinesRequestBuilder(category=" + this.category + ", sources=" + this.sources + ", query=" + this.query + ", pageSize=" + this.pageSize + ", page=" + this.page + ", country=" + this.country + ", language=" + this.language + ", excludeDomains=" + this.excludeDomains + ", searchIn=" + this.searchIn + ")";
        }
    }
}
