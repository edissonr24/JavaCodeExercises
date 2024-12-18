package org.example.JavaChallenges2024.practice;

public class TrainComposition {

    TrainComposition train = new TrainComposition();
    int id;


    public void attachWagonFromLeft(int wagonId) {


        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public void attachWagonFromRight(int wagonId) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public int detachWagonFromLeft() {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public int detachWagonFromRight() {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {

       /* train.attachWagonFromLeft(7);
        train.attachWagonFromLeft(13);
        System.out.println(train.detachWagonFromRight()); // 7
        System.out.println(train.detachWagonFromLeft()); // 13*/
    }

    public class Wagon {
        int id;
        Wagon wagon;


        public Wagon(int id, Wagon wagon) {
            this.id = id;
            this.wagon = wagon;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Wagon getWagon() {
            return wagon;
        }

        public void setWagon(Wagon wagon) {
            this.wagon = wagon;
        }
    }

}


