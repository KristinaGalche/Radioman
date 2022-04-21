package ru.netology.radio;
import lombok.Data;
@Data
public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int numberRadioStation) {
        this.maxRadioStation = numberRadioStation - 1;
    }

    public Radio() {
    }

//    public int getCurrentRadioStation() {
//        return this.currentRadioStation;
//    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextStation() {
        int newCurrentStation = currentRadioStation + 1;
        if (newCurrentStation > maxRadioStation) {
            newCurrentStation = minRadioStation;
        }

        setCurrentRadioStation(newCurrentStation);
    }

    public void prevStation() {
        int newCurrentStation = currentRadioStation - 1;
        if (newCurrentStation < minRadioStation) {
            newCurrentStation = maxRadioStation;
        }
        setCurrentRadioStation(newCurrentStation);
    }

//   public int getCurrentVolume() {
//        return this.currentVolume;
//    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
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
