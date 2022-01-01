public class Radio {

    int currentVolume ;
    int currentStationNum ;
    int newCurrentStationNum;


    public int increaseVolume() {
        if (currentVolume <= 9) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }


    public int decreaseVolume() {
        if (currentVolume == 0) {
            return currentVolume;

        } else {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }


    public int next() {
        if (currentStationNum == 9) {
            currentStationNum = 0;
        } else {

            currentStationNum = currentStationNum + 1;
        }
        return currentStationNum;
    }


    public int prev() {
        if (currentStationNum == 0) {
            currentStationNum = 9;
        } else {
            currentStationNum = currentStationNum - 1;
        }
        return currentStationNum;
    }


    public int setCurrentStationNum(int newCurrentStationNum) {
        if ((newCurrentStationNum >= 0) && (newCurrentStationNum <= 9)) {
            currentStationNum = newCurrentStationNum ;
        }
        return currentStationNum;
    }
}

