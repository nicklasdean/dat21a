package interfaces;

public class KeaStudent implements Talkable{
    private String email;

    @Override
    public void talk(){
        System.out.println("Hey guys - KEA student here");
    }
}
