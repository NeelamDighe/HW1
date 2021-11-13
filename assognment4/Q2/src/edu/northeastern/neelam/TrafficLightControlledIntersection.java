package edu.northeastern.neelam;

public class TrafficLightControlledIntersection {

    class TrafficLight {
        private final Signal signal;
        public TrafficLight() {
            signal = new Signal();
        }
        public void carArrived(int direction, int carId, int roadId, Runnable turnGreen, Runnable crossCar)
        {
            synchronized (signal) {
                if (signal.greenRoadA != roadId) {
                    turnGreen.run();
                    signal.greenRoadA = roadId;
                }
                crossCar.run();
            }
        }
        class Signal {
            int greenRoadA = 1;
        }
    }
}