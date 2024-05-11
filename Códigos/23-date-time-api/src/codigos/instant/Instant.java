package codigos.instant;

public class Instant {

    public static void main(String[] args) {
        java.time.Instant instant = java.time.Instant.now();
        System.out.println(instant);

//        System.out.println(instant.getEpochSecond());
//        System.out.println(instant.getNano());


        System.out.println(instant.toEpochMilli());
        System.out.println(System.currentTimeMillis());


    }

}