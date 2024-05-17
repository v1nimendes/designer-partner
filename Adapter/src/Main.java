import adapters.PayoneerAdapter;
import payoneer.Payoneer;
import paypal.IPayPalPayments;

public class Main {

    public static void main(String[] args) {

        //IPayonnerPayments payment = new Payoneer();



        IPayPalPayments payment = new PayoneerAdapter(new Payoneer());

        payment.paypalPayment();
        payment.paypalReceive();


    }
}
