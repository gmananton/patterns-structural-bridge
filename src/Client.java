import abstraction.AdvancedRemote;
import abstraction.BasicRemote;
import implementation.Radio;
import implementation.TV;

/**
 * Created by Anton Mikhaylov on 22.12.2017.
 */
public class Client {
    public static void main(String[] args) {
        BasicRemote tvRemote = new BasicRemote(new TV());
        AdvancedRemote radioRemote = new AdvancedRemote(new Radio());

        tvRemote.togglePower();
        tvRemote.channelUp();
        tvRemote.channelUp();
        tvRemote.channelUp();
        tvRemote.togglePower();
        System.out.println("------------------\n");

        radioRemote.togglePower();
        radioRemote.channelUp();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.volumeDown();
        radioRemote.mute(); // Новая функциональность, которой нет в BasicRemote
        radioRemote.togglePower();
    }
}
