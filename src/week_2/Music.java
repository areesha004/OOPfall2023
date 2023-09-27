package week_2;

import java.util.Objects;

public class Music {
    private String title;
    private String duration;
    private String genre;
    private Date releasedate;
    private Singer singer;

    Music(String title,String duration,String genre,Date releasedate,Singer singer){
        this.title=title;
        this.duration=duration;
        this.genre=genre;
        this.releasedate=releasedate;
        this.singer=singer;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }
    public String toString(){
        return String.format("song title is %s\nduration of song is %s\ngenre is %s\nrelease date of song is %s\nsinger name is %s",title,duration,genre,releasedate,singer);

    }

    public boolean equals(Music m2) {
        if (this.title == m2.title)
            return true;
        else
            return false;

    }



}
