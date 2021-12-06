import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    int increaseVolume() {
        Radio radio = new Radio();
        int expacted = 1;
        int actual = radio.increaseVolume();
        return actual;
    }

    @Test
    int decreaseVolume() {
        Radio radio = new Radio();
        int expacted = 0;
        int actual = radio.decreaseVolume();

        return actual;
    }

    @Test
    int next() {
        Radio radio = new Radio();
        int expacted = 1;
        int actual = radio.next();
        return actual;
    }

    @Test
    int prev() {
        Radio radio = new Radio();
        int expacted = 9;
        int actual = radio.prev();
        return actual;
    }

    @Test
    int setCurrentStationNum() {
        Radio radio = new Radio();
        int expacted = 0;
        int actual = 0;
        return actual;
    }
}