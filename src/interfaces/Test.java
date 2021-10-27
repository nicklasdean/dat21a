package interfaces;

public class Test {
    public static void main(String[] args) {
        Talkable nicklas = new KeaStudent();
        Talkable neil = new KeaTeacher();

        nicklas.talk();
        neil.talk();

        makeTalkableTalk(nicklas);
        makeTalkableTalk(neil);
    }

    public static void makeTalkableTalk(Talkable t){

    }
}
