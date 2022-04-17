package ru.netology.radio;

public class Radio {
    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextStation() {
        int newCurrentStation = currentRadioStation + 1;
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }

        setCurrentRadioStation(newCurrentStation);
    }

    public void prevStation() {
        int newCurrentStation = currentRadioStation - 1;
        if (newCurrentStation < 0) {
            newCurrentStation = 9;
        }

        setCurrentRadioStation(newCurrentStation);
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        int newCurrentVolume = currentVolume + 1;
        setCurrentVolume(newCurrentVolume);
    }

    public void decreaseVolume() {
        int newCurrentVolume = currentVolume - 1;
        setCurrentVolume(newCurrentVolume);
    }
}
