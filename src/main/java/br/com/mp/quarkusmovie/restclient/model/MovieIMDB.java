
package br.com.mp.quarkusmovie.restclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MovieIMDB {

    @JsonProperty("d")
    private List<DescriptionIMDB> descriptionIMDBS;

    @JsonProperty("q")
    private String query;

    public List<DescriptionIMDB> getDescriptionIMDBS() {
        return descriptionIMDBS;
    }

    public void setDescriptionIMDBS(List<DescriptionIMDB> descriptionIMDBS) {
        this.descriptionIMDBS = descriptionIMDBS;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
