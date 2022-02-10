package ru.netology;

public class Radio {


    private int currentVolume;
    private int currentStationNum;
    private int numberOfStation = 10;

    public Radio (){

    }

    public Radio(int numberOfStation) {

        this.numberOfStation= numberOfStation;
    }

    public int getCurrentVolume(){
        return currentVolume;

    }
    public int getCurrentStationNum(){
        return currentStationNum;

    }

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public int increaseVolume() {
        if (currentVolume <= 99) {
            currentVolume = this.currentVolume + 1;
        }
        return currentVolume;
    }


    public int decreaseVolume() {
        if (currentVolume == 0) {
            return currentVolume ;

        } else {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }


    public int next() {
        if (currentStationNum == (numberOfStation-1)) {
            currentStationNum = 0;
        } else {

            currentStationNum = currentStationNum + 1;
        }
        return currentStationNum;
    }


    public int prev() {
        if (currentStationNum == 0) {
          currentStationNum = numberOfStation-1;
        } else {
            currentStationNum = currentStationNum - 1;
        }
        return currentStationNum;
    }


    public int setCurrentStationNum(int newCurrentStationNum) {

        if ((newCurrentStationNum >= 0) && (newCurrentStationNum <= (numberOfStation-1))) {
            currentStationNum = newCurrentStationNum;
        }
        return currentStationNum;
    }

    public int setCurrentVolume(int newCurrentVolume) {
        if ((newCurrentVolume >= 0) && (newCurrentVolume <= 100)) {
            currentVolume = newCurrentVolume;
        }
        return currentVolume;
    }

}

