import com.algaworks.agencia.Hotel;

public class Principal2 {

    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Hotel1", "PE", 1400);
        Hotel hotel2 = new Hotel("Hotel2", "PE", 1500);

        System.out.println(hotel1.compareTo(hotel2));

    }

}
