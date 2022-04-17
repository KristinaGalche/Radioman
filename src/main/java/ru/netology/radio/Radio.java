package ru.netology.radio;

public class Radio {
    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
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
        setCurrentRadioStation(newCurrentStation);
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        int newCurrentStation = currentRadioStation - 1;
        setCurrentRadioStation(newCurrentStation);
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
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
