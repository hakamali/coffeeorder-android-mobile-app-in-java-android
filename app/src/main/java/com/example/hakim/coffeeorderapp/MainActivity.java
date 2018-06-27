package com.example.hakim.coffeeorderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
     int quantity=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View View){

        quantity=quantity+1;
        dispaly(quantity);


    }
    /**
     *This method called when minus button is clicked
     */

    public void decrement(View View){

        quantity=quantity-1;
        dispaly(quantity);


    }

    public void submitOrder(View view){
        displayPrice(quantity*5);

    }


    /**
     * This method display the given quantity value on the screen

     */
    private void dispaly(int number){
        TextView quantitytextview=(TextView)findViewById(R.id.quantity_text_view);
        quantitytextview.setText("" + number);

    }
    private void displayPrice(int number){
        TextView pricetextview=(TextView)findViewById(R.id.price_text_view);
        pricetextview.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
