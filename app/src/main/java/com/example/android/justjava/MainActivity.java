/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity = 0;
    int price = 5;
    String macchiato = " Macchiato; ";
    String esspreso =" Esspreso; ";
    String cappucino = " Cappucino; ";
    int myPriceA;
    int myPriceB;
    int myPriceC;
    //int total = myPriceA + myPriceB + myPriceC;

    /**
     * This method is called when the order button is clicked.
     */
    public void macchiato(View view) {
        myPriceA = quantity * price;
        String myOrderA = quantity + macchiato;
        displayMacchiato(myOrderA);
    }


    public void esspreso(View view) {
        myPriceB = quantity * price;
        String myOrderB = quantity + esspreso;
        displayEsspreso(myOrderB);
    }

    public void cappucino(View view) {
        myPriceC = quantity * price;
        String myOrderC = quantity + cappucino;
        displayCappucino(myOrderC);
    }


    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    public void decrement(View view){
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    protected void submitOrder(View view) {
        int totalMess = myPriceA + myPriceB + myPriceC;
        String total = "Total: " + totalMess + " RON";
        total = total + "\n Thank you !";
        displayMessage(total);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    private void displayMacchiato(String message) {
        TextView macchiatoTextView = (TextView) findViewById(R.id.macchiato_text_view);
        macchiatoTextView.setText(message);
    }

    private void displayEsspreso(String message) {
        TextView esspresoTotalTextView = (TextView) findViewById(R.id.esspreso_text_view);
        esspresoTotalTextView.setText(message);
    }

    private void displayCappucino(String message) {
        TextView cappucinoTextView = (TextView) findViewById(R.id.cappucino_text_view);
        cappucinoTextView.setText(message);
    }
}
