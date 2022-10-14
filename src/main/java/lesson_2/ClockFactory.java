package lesson_2;

class ClockFactory {

    /* It produces concrete clocks corresponding their types : Digital, Sand or Mechanical */
    public Clock produce(String type) {

        return switch (type) {
            case "Sand" -> new SandClock();
            case "Digital" -> new DigitalClock();
            case "Mechanical" -> new MechanicalClock();
            default -> null;
        };
    }
}
