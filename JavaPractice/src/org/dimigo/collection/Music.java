package org.dimigo.collection;

/**
 * Created by HIPERCUBE on 9/24/15.
 */
public class Music {
    private String title;
    private String singer;

    public Music(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Music [" +
                "title='" + title + '\'' +
                ", singer='" + singer + '\'' +
                ']';
    }
}
