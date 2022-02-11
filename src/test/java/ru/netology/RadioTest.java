package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio(20);

        assertEquals(20, radio.getNumberOfStation());

        Radio radio1 = new Radio();

        assertEquals(10, radio1.getNumberOfStation());

    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void increaseVolumeIfVolumeNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void increaseVolumeIfVolumeHundred() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void decreaseVolumeIfOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void decreaseVolumeIfNull() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void nextIfStationNull() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStationNum();
        assertEquals(expected, actual);

    }

    @Test
    void nextIfStationNine() {

        Radio radio = new Radio();
        radio.setCurrentStationNum(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStationNum();
        assertEquals(expected, actual);

    }

    @Test
    void prevIfStationNull() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStationNum();
        assertEquals(expected, actual);

    }

    @Test
    void prevIfStationMoreNull() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(2);
        radio.prev();
        int expected = 1;
        int actual = radio.getCurrentStationNum();
        assertEquals(expected, actual);

    }

    @Test
    public void setCurrentStationNumNull() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(0);
        int expected = 0;
        int actual = radio.getCurrentStationNum();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentStationNumNine() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(9);
        int expected = 9;
        int actual = radio.getCurrentStationNum();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentStationNumFive() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(5);
        int expected = 5;
        int actual = radio.getCurrentStationNum();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentStationNumEleven() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(11);
        int expected = 0;
        int actual = radio.getCurrentStationNum();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentStationNumMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(-1);
        int expected = 0;
        int actual = radio.getCurrentStationNum();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentVolumeIfHundredOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentVolumeIfMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

}