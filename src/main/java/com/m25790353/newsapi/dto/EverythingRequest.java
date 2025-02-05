//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.m25790353.newsapi.dto;

// @Data, @Builder
public class EverythingRequest {
    private String query;
    private String sources;
    private String domains;
    private String from;
    private String to;
    private String language;
    private String sortBy;
    private String pageSize;
    private String page;
    private String searchIn;
    private String excludeDomains;

    EverythingRequest(final String query, final String sources, final String domains, final String from, final String to, final String language, final String sortBy, final String pageSize, final String page, final String searchIn, final String excludeDomains) {
        this.query = query;
        this.sources = sources;
        this.domains = domains;
        this.from = from;
        this.to = to;
        this.language = language;
        this.sortBy = sortBy;
        this.pageSize = pageSize;
        this.page = page;
        this.searchIn = searchIn;
        this.excludeDomains = excludeDomains;
    }

    public static EverythingRequestBuilder builder() {
        return new EverythingRequestBuilder();
    }

    public String getQuery() {
        return this.query;
    }

    public String getSources() {
        return this.sources;
    }

    public String getDomains() {
        return this.domains;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getSortBy() {
        return this.sortBy;
    }

    public String getPageSize() {
        return this.pageSize;
    }

    public String getPage() {
        return this.page;
    }

    public String getSearchIn() {
        return this.searchIn;
    }

    public String getExcludeDomains() {
        return this.excludeDomains;
    }

    public void setQuery(final String query) {
        this.query = query;
    }

    public void setSources(final String sources) {
        this.sources = sources;
    }

    public void setDomains(final String domains) {
        this.domains = domains;
    }

    public void setFrom(final String from) {
        this.from = from;
    }

    public void setTo(final String to) {
        this.to = to;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setSortBy(final String sortBy) {
        this.sortBy = sortBy;
    }

    public void setPageSize(final String pageSize) {
        this.pageSize = pageSize;
    }

    public void setPage(final String page) {
        this.page = page;
    }

    public void setSearchIn(final String searchIn) {
        this.searchIn = searchIn;
    }

    public void setExcludeDomains(final String excludeDomains) {
        this.excludeDomains = excludeDomains;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof EverythingRequest)) {
            return false;
        } else {
            EverythingRequest other = (EverythingRequest)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$query = this.getQuery();
                Object other$query = other.getQuery();
                if (this$query == null) {
                    if (other$query != null) {
                        return false;
                    }
                } else if (!this$query.equals(other$query)) {
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

                Object this$domains = this.getDomains();
                Object other$domains = other.getDomains();
                if (this$domains == null) {
                    if (other$domains != null) {
                        return false;
                    }
                } else if (!this$domains.equals(other$domains)) {
                    return false;
                }

                Object this$from = this.getFrom();
                Object other$from = other.getFrom();
                if (this$from == null) {
                    if (other$from != null) {
                        return false;
                    }
                } else if (!this$from.equals(other$from)) {
                    return false;
                }

                Object this$to = this.getTo();
                Object other$to = other.getTo();
                if (this$to == null) {
                    if (other$to != null) {
                        return false;
                    }
                } else if (!this$to.equals(other$to)) {
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

                Object this$sortBy = this.getSortBy();
                Object other$sortBy = other.getSortBy();
                if (this$sortBy == null) {
                    if (other$sortBy != null) {
                        return false;
                    }
                } else if (!this$sortBy.equals(other$sortBy)) {
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

                Object this$searchIn = this.getSearchIn();
                Object other$searchIn = other.getSearchIn();
                if (this$searchIn == null) {
                    if (other$searchIn != null) {
                        return false;
                    }
                } else if (!this$searchIn.equals(other$searchIn)) {
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

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof EverythingRequest;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $query = this.getQuery();
        result = result * 59 + ($query == null ? 43 : $query.hashCode());
        Object $sources = this.getSources();
        result = result * 59 + ($sources == null ? 43 : $sources.hashCode());
        Object $domains = this.getDomains();
        result = result * 59 + ($domains == null ? 43 : $domains.hashCode());
        Object $from = this.getFrom();
        result = result * 59 + ($from == null ? 43 : $from.hashCode());
        Object $to = this.getTo();
        result = result * 59 + ($to == null ? 43 : $to.hashCode());
        Object $language = this.getLanguage();
        result = result * 59 + ($language == null ? 43 : $language.hashCode());
        Object $sortBy = this.getSortBy();
        result = result * 59 + ($sortBy == null ? 43 : $sortBy.hashCode());
        Object $pageSize = this.getPageSize();
        result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
        Object $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : $page.hashCode());
        Object $searchIn = this.getSearchIn();
        result = result * 59 + ($searchIn == null ? 43 : $searchIn.hashCode());
        Object $excludeDomains = this.getExcludeDomains();
        result = result * 59 + ($excludeDomains == null ? 43 : $excludeDomains.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getQuery();
        return "EverythingRequest(query=" + var10000 + ", sources=" + this.getSources() + ", domains=" + this.getDomains() + ", from=" + this.getFrom() + ", to=" + this.getTo() + ", language=" + this.getLanguage() + ", sortBy=" + this.getSortBy() + ", pageSize=" + this.getPageSize() + ", page=" + this.getPage() + ", searchIn=" + this.getSearchIn() + ", excludeDomains=" + this.getExcludeDomains() + ")";
    }

    public static class EverythingRequestBuilder {
        private String query;
        private String sources;
        private String domains;
        private String from;
        private String to;
        private String language;
        private String sortBy;
        private String pageSize;
        private String page;
        private String searchIn;
        private String excludeDomains;

        EverythingRequestBuilder() {
        }

        public EverythingRequestBuilder query(final String query) {
            this.query = query;
            return this;
        }

        public EverythingRequestBuilder sources(final String sources) {
            this.sources = sources;
            return this;
        }

        public EverythingRequestBuilder domains(final String domains) {
            this.domains = domains;
            return this;
        }

        public EverythingRequestBuilder from(final String from) {
            this.from = from;
            return this;
        }

        public EverythingRequestBuilder to(final String to) {
            this.to = to;
            return this;
        }

        public EverythingRequestBuilder language(final String language) {
            this.language = language;
            return this;
        }

        public EverythingRequestBuilder sortBy(final String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        public EverythingRequestBuilder pageSize(final String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public EverythingRequestBuilder page(final String page) {
            this.page = page;
            return this;
        }

        public EverythingRequestBuilder searchIn(final String searchIn) {
            this.searchIn = searchIn;
            return this;
        }

        public EverythingRequestBuilder excludeDomains(final String excludeDomains) {
            this.excludeDomains = excludeDomains;
            return this;
        }

        public EverythingRequest build() {
            return new EverythingRequest(this.query, this.sources, this.domains, this.from, this.to, this.language, this.sortBy, this.pageSize, this.page, this.searchIn, this.excludeDomains);
        }

        public String toString() {
            return "EverythingRequest.EverythingRequestBuilder(query=" + this.query + ", sources=" + this.sources + ", domains=" + this.domains + ", from=" + this.from + ", to=" + this.to + ", language=" + this.language + ", sortBy=" + this.sortBy + ", pageSize=" + this.pageSize + ", page=" + this.page + ", searchIn=" + this.searchIn + ", excludeDomains=" + this.excludeDomains + ")";
        }
    }
}
