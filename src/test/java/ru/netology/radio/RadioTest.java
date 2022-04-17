package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void getCurrentRadioStation() {
        Radio home = new Radio();
        home.setCurrentRadioStation(5);

        int expected = 5;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStation0() {
        Radio home = new Radio();
        home.setCurrentRadioStation(0);

        int expected = 0;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStation9() {
        Radio home = new Radio();
        home.setCurrentRadioStation(9);

        int expected = 9;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation() {
        Radio home = new Radio();
        home.setCurrentRadioStation(5);

        int expected = 5;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation0() {
        Radio home = new Radio();
        home.setCurrentRadioStation(0);

        int expected = 0;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation9() {
        Radio home = new Radio();
        home.setCurrentRadioStation(9);

        int expected = 9;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation2() {
        Radio home = new Radio();
        home.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation15() {
        Radio home = new Radio();
        home.setCurrentRadioStation(15);

        int expected = 0;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio home = new Radio();
        home.setCurrentRadioStation(2);

        home.nextStation();

        int expected = 3;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextStation0() {
        Radio home = new Radio();
        home.setCurrentRadioStation(0);

        home.nextStation();

        int expected = 1;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextStation9() {
        Radio home = new Radio();
        home.setCurrentRadioStation(9);

        home.nextStation();

        int expected = 0;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio home = new Radio();
        home.setCurrentRadioStation(9);

        home.prevStation();

        int expected = 8;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStation1() {
        Radio home = new Radio();
        home.setCurrentRadioStation(1);

        home.prevStation();

        int expected = 0;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStation0() {
        Radio home = new Radio();
        home.setCurrentRadioStation(0);

        home.prevStation();

        int expected = 9;
        int actual = home.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume() {
        Radio home = new Radio();
        home.setCurrentVolume(5);

        int expected = 5;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume0() {
        Radio home = new Radio();
        home.setCurrentVolume(0);

        int expected = 0;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume10() {
        Radio home = new Radio();
        home.setCurrentVolume(10);

        int expected = 10;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio home = new Radio();
        home.setCurrentVolume(3);

        int expected = 3;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume0() {
        Radio home = new Radio();
        home.setCurrentVolume(0);

        int expected = 0;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume10() {
        Radio home = new Radio();
        home.setCurrentVolume(10);

        int expected = 10;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume11() {
        Radio home = new Radio();
        home.setCurrentVolume(11);

        int expected = 0;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio home = new Radio();
        home.setCurrentVolume(3);

        home.increaseVolume();

        int expected = 4;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume10() {
        Radio home = new Radio();
        home.setCurrentVolume(10);

        home.increaseVolume();

        int expected = 10;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume0() {
        Radio home = new Radio();
        home.setCurrentVolume(0);

        home.increaseVolume();

        int expected = 1;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        Radio home = new Radio();
        home.setCurrentVolume(5);

        home.decreaseVolume();

        int expected = 4;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume0() {
        Radio home = new Radio();
        home.setCurrentVolume(0);

        home.decreaseVolume();

        int expected = 0;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume10() {
        Radio home = new Radio();
        home.setCurrentVolume(10);

        home.decreaseVolume();

        int expected = 9;
        int actual = home.getCurrentVolume();

        assertEquals(expected, actual);
    }
}