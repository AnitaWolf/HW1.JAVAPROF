import java.util.Arrays;

class Example {


    public static void main(String[] args) {
        Transportation[] value = Transportation.values();
        // System.out.println(Arrays.toString(value));
        for (int i = 0; i < Transportation.values().length; i++) {

            Transportation.values()[i].printTime();
        }
        System.out.println("---------------------------");


        System.out.println(Transportation.Airplane + ":"+ " " +
                "Days:" + Transportation.Airplane.getTimeOfDays()
                + " " +
                "Hour:" + Transportation.Airplane.getTimeOfHour()
                + " " +
                "Minutes:" + Transportation.Airplane.getTimeOfMinutes()
                + " " +
                "Seconds:" + Transportation.Airplane.getTimeOfSeconds());
//
    }

    enum Transportation {

        Airplane(0, 1, 5, 0) {
            void printTime() {
                System.out.print(Airplane + ":" + "Days: " + Transportation.Airplane.getTimeOfDays() + "  " + " Hour: " +
                        Transportation.Airplane.getTimeOfHour() + "  " + "Minutes: " + Transportation.Airplane.getTimeOfMinutes() + "  " +
                        "Seconds: " + Transportation.Airplane.getTimeOfSeconds());
                System.out.println(" ");
            }
        },

        Train(0, 4, 1, 0) {
            void printTime() {

                System.out.println(Train + ":" + "Days:" + Transportation.Train.getTimeOfDays() + " " + " Hour:" +
                        Transportation.Train.getTimeOfHour() + "  " + "Minutes:" + Transportation.Train.getTimeOfMinutes() + "  " +
                        "Seconds:" + Transportation.Train.getTimeOfSeconds());
            }
        },

        Car(0, 5, 20, 0) {
            void printTime() {
                System.out.println(Car + ":" + "Days:" + Transportation.Car.getTimeOfDays() + " " + " Hour:" +
                        Transportation.Car.getTimeOfHour() + "  " + "Minutes:" + Transportation.Car.getTimeOfMinutes() + "  " +
                        "Seconds:" + Transportation.Car.getTimeOfSeconds());
            }
        },

        Bike(1, 12, 6, 0) {
            void printTime() {
                System.out.println(Bike + ":" + "Days:" + Transportation.Bike.getTimeOfDays() + " " + " Hour:" +
                        Transportation.Bike.getTimeOfHour() + "  " + "Minutes:" + Transportation.Bike.getTimeOfMinutes() + "  " +
                        "Seconds:" + Transportation.Bike.getTimeOfSeconds());

            }
        },


        OnFoot(8, 2, 59, 36) {
            void printTime() {
                System.out.println(OnFoot + ":" + "Days:" + Transportation.OnFoot.getTimeOfDays() + " " + " Hour:" +
                        Transportation.OnFoot.getTimeOfHour() + "  " + "Minutes:" + Transportation.OnFoot.getTimeOfMinutes() + "  " +
                        "Seconds:" + Transportation.OnFoot.getTimeOfSeconds());

            }
        };


        int timeOfDays;
        int timeOfHour;
        int timeOfMinutes;
        int timeOfSeconds;

        Transportation(int timeOfDays, int timeOfHour, int timeOfMinutes, int timeOfSeconds) {
            this.timeOfDays = timeOfDays;
            this.timeOfHour = timeOfHour;
            this.timeOfMinutes = timeOfMinutes;
            this.timeOfSeconds = timeOfSeconds;
        }

        public int getTimeOfDays() {
            return timeOfDays;
        }

        public int getTimeOfHour() {
            return timeOfHour;
        }

        public int getTimeOfMinutes() {
            return timeOfMinutes;
        }

        public int getTimeOfSeconds() {
            return timeOfSeconds;
        }

        abstract void printTime();

    }

}

