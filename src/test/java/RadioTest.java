import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        int expected = 1;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);

    }

    @Test
   void decreaseVolume() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);

    }

    @Test
    void next() {
        Radio radio = new Radio();
        int expected = 1;
        int actual = radio.next();
        assertEquals(expected, actual);

    }

    @Test
    void prev() {
        Radio radio = new Radio();
        int expected = 9;
        int actual = radio.prev();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentStationNum() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = 0;
        assertEquals(expected, actual);

    }

}