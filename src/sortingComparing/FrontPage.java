package sortingComparing;

import java.util.ArrayList;
import java.util.Collections;

public class FrontPage {
    public static void main(String[] args) {
        RedditPost post1 = new RedditPost("Cats are awesome","Luv em",10);
        RedditPost post2 = new RedditPost("Dogs are awesome","Luv em",5000);
        RedditPost post3 = new RedditPost("Bush did 9/11","???",555);
        RedditPost post4 = new RedditPost("Pidgeons are not real","Never seen 'em",-400);

        ArrayList<RedditPost> frontPage = new ArrayList<RedditPost>();
        frontPage.add(post1);
        frontPage.add(post2);
        frontPage.add(post3);
        frontPage.add(post4);

        System.out.println(frontPage);
        Collections.sort(frontPage);
        System.out.println(frontPage);
    }
}
