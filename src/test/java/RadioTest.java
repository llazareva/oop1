import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    int increaseVolume() {
        Radio radio = new Radio();
        int expacted = 1;
        int actual = radio.increaseVolume();
    }

    @Test
    int decreaseVolume() {
        Radio radio = new Radio();
        int expacted = 0;
        int actual = radio.decreaseVolume();

    }

    @Test
    void next() {
        Radio radio = new Radio();
        int expacted = 1;
        int actual = radio.next();
    }

    @Test
    void prev() {
        Radio radio = new Radio();
        int expacted = 9;
        int actual = radio.prev();
    }

    @Test
    void setCurrentStationNum() {
        Radio radio = new Radio();
        int expacted = 0;
        int actual = 0;
    }
}