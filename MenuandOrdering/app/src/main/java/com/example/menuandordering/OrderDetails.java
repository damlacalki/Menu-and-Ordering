package com.example.menuandordering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.Key;

public class OrderDetails extends AppCompatActivity {

    private Button pay;
    TextView listView,priceView;
    String list_choice;
    Double price_tl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        listView = (TextView) findViewById(R.id.listView);
        priceView = (TextView) findViewById(R.id.priceView);

        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_tl = bundle.getDouble("price");

        listView.setText(list_choice);
        priceView.setText("TL : "+price_tl.toString());


        pay = (Button) findViewById(R.id.button1);
        pay.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                pay();
            }
        });


    }

    public void pay(){

        Intent j = new Intent(OrderDetails.this,Confirmation.class);
        startActivity(j);


    }
}
