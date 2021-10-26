package sortingComparing;

import java.util.ArrayList;

public class RedditPost implements Comparable<RedditPost>  {
    private String title;
    private String text;
    private int upvotes;
    private ArrayList<String> comments;

    public RedditPost(String title, String text, int upvotes){
        this.title = title;
        this.text = text;
        this.upvotes = upvotes;
    }

    public int getUpvotes(){
        return this.upvotes;
    }

    @Override
    public int compareTo(RedditPost postToCompareWith){
        if(this.upvotes < postToCompareWith.getUpvotes()){
            return -1298343;
        }
        else if(this.upvotes > postToCompareWith.getUpvotes()){
            return 1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString(){
        return this.title + " " + this.upvotes;
    }
}
