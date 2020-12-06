package grigorev.mikhail.services;

public class CardManager {

    public void send(String cardNumber, Double sum) {
        System.out.println("Send " + Math.round(sum) + " to card with number " + cardNumber);
    }

}
