package abstraction;

import implementation.Device;

/**
 * Created by Anton Mikhaylov on 22.12.2017.
 * Расширяем функциональность пультов, не трогая классы девайсов
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }
}
