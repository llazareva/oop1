import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 8;
        int expected = 9;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);

    }

    @Test
    void increaseVolumeIfVolumeNine() {
        Radio radio = new Radio();
        radio.currentVolume = 9;
        int expected = 10;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);

    }

    @Test
    void increaseVolumeIfVolumeTen() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        int expected = 10;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);

    }

    @Test
    void decreaseVolumeIfOne() {
        Radio radio = new Radio();
        radio.currentVolume = 1;
        int expected = 0;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);

    }

    @Test
    void decreaseVolumeIfNull() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        int expected = 0;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);

    }

    @Test
    void nextIfStationNull() {
        Radio radio = new Radio();
        radio.currentStationNum = 0;
        int expected = 1;
        int actual = radio.next();
        assertEquals(expected, actual);

    }

    @Test
    void nextIfStationNine() {

        Radio radio = new Radio();
        radio.currentStationNum = 9;
        int expected = 0;
        int actual = radio.next();
        assertEquals(expected, actual);

    }

    @Test
    void prevIfStationNull() {
        Radio radio = new Radio();
        radio.currentStationNum = 0;
        int expected = 9;
        int actual = radio.prev();
        assertEquals(expected, actual);

    }

    @Test
    void prevIfStationMoreNull() {
        Radio radio = new Radio();
        radio.currentStationNum = 2;
        int expected = 1;
        int actual = radio.prev();
        assertEquals(expected, actual);

    }

    @Test
    public void setCurrentStationNumNull() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.setCurrentStationNum(0);
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentStationNumNine() {
        Radio radio = new Radio();
        int expected = 9;
        radio.newCurrentStationNum = 9;
        int actual = radio.setCurrentStationNum(9);
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentStationNumFive() {
        Radio radio = new Radio();
        radio.newCurrentStationNum = 5;
        int expected = 5;
        int actual = radio.setCurrentStationNum(5);
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentStationNumEleven() {
        Radio radio = new Radio();
        radio.newCurrentStationNum = 11;
        int expected = 0;
        int actual = radio.setCurrentStationNum(11);
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentStationNumMinusOne() {
        Radio radio = new Radio();
        radio.newCurrentStationNum = -1;
        int expected = 0;
        int actual = radio.setCurrentStationNum(-1);
        assertEquals(expected, actual);

    }

}