public class Radio {
    private int currentVolume = 0;
    private int currentStationNum = 1;

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int next() {
        if (currentStationNum == 9) {
            currentStationNum = 0;
        }

        if (currentStationNum < 9) {
            currentStationNum = currentStationNum + 1;
        }
        return currentStationNum;
    }


    public int prev() {
        if (currentStationNum > 0) {
            currentStationNum = currentStationNum - 1;

            return currentStationNum;
        }
        if (currentStationNum == 0) {
            currentStationNum = 9;

        }

        return currentStationNum;

    }


    public int setCurrentStationNum(int currentStationNum) {
        if (this.currentStationNum >= 0 && this.currentStationNum <= 9)
            this.currentStationNum = currentStationNum;
        return currentStationNum;
    }
}

