package com.ibm.bluemix.westpac.hackathon.beans;

/**
 * Created by pasapicella on 20/08/15.
 */
public class Search
{
    private String searchstr;

    public String getSearchstr() {
        return searchstr;
    }

    public void setSearchstr(String searchstr) {
        this.searchstr = searchstr;
    }

    @Override
    public String toString() {
        return "Search{" +
                "searchstr='" + searchstr + '\'' +
                '}';
    }
}
