package com.example.menuandordering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {


    Button MixBut,ChesBut,ChicBut,TexBut,PastaBut,RavBut,MixedButton,ChefButton,ChickenButton,TexasButton,PastaButton,RavioliButton,CokeButton,CokeBut,WaterButton,WaterBut;

    String delete = "";
    String choices = "";
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MixBut = (Button) findViewById(R.id.MixBut);
        ChesBut = (Button) findViewById(R.id.ChesBut);
        ChicBut = (Button) findViewById(R.id.ChicBut);
        TexBut = (Button) findViewById(R.id.TexBut);
        PastaBut = (Button) findViewById(R.id.PastaBut);
        RavBut = (Button) findViewById(R.id.RavBut);
        CokeBut = (Button) findViewById(R.id.CokeBut);
        WaterBut = (Button) findViewById(R.id.WaterBut);


        MixedButton = (Button) findViewById(R.id.MixedButton);
        ChefButton = (Button) findViewById(R.id.ChefButton);
        ChickenButton = (Button) findViewById(R.id.ChickenButton);
        TexasButton = (Button) findViewById(R.id.TexasButton);
        PastaButton = (Button) findViewById(R.id.PastaButton);
        RavioliButton = (Button) findViewById(R.id.RavioliButton);
        CokeButton = (Button) findViewById(R.id.CokeButton);
        WaterButton = (Button) findViewById(R.id.WaterButton);



    }
    public void del_to_list(View view)
    {
        if (view == findViewById(R.id.MixBut))
        {
            choices = choices.replaceFirst(Pattern.quote("Mixed Pizza"),"");
            price = price-35;
        }
        else if (view == findViewById(R.id.ChesBut))
        {
            choices = choices.replaceFirst(Pattern.quote("Chef's Pizza"),"");
            price = price-32;
        }

        else if (view == findViewById(R.id.ChicBut))
        {
            choices = choices.replaceFirst(Pattern.quote("Chicken Burger"),"");
            price = price-25;
        }
        else if (view == findViewById(R.id.TexBut))
        {
            choices = choices.replaceFirst(Pattern.quote("Texas Burger"),"");
            price = price-30;
        }

        else if (view == findViewById(R.id.PastaBut))
        {
            choices = choices.replaceFirst(Pattern.quote("Fettucini Pasta"),"");
            price = price-27;
        }

        else if (view == findViewById(R.id.RavBut))
        {
            choices = choices.replaceFirst(Pattern.quote("Turkish Ravioli"),"");
            price = price-28;
        }
        else if (view == findViewById(R.id.CokeBut))
        {
            choices = choices.replaceFirst(Pattern.quote("Coke"),"");
            price = price-8;
        }
        else if (view == findViewById(R.id.WaterBut))
        {
            choices = choices.replaceFirst(Pattern.quote("Water"),"");
            price = price-5;
        }
    }


    public void add_to_list(View view)
    {
        if (view == findViewById(R.id.MixedButton) )
        {
            choices = choices+"Mixed Pizza"+"\n";
            price = price+35;
        }

        else if (view == findViewById(R.id.ChefButton) )
        {
            choices = choices+"Chef's Pizza"+"\n";
            price = price+32;
        }

        else if (view == findViewById(R.id.ChickenButton) )
        {
            choices = choices+"Chicken Burger"+"\n";
            price = price+25;
        }

        else if (view == findViewById(R.id.TexasButton) )
        {
            choices = choices+"Texas Burger"+"\n";
            price = price+30;
        }

        else if (view == findViewById(R.id.PastaButton) )
        {
            choices = choices+"Fettucini Pasta"+"\n";
            price = price+27;
        }

        else if (view == findViewById(R.id.RavioliButton) )
        {
            choices = choices+"Turkish Ravioli"+"\n";
            price = price+28;
        }
        else if (view == findViewById(R.id.CokeButton) )
        {
            choices = choices+"Coke"+"\n";
            price = price+8;
        }

        else if (view == findViewById(R.id.WaterButton) )
        {
            choices = choices+"Water"+"\n";
            price = price+5;
        }


    }

    public void placeOrder(View view){

        Intent i = new Intent(MainActivity.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",delete);
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        i.putExtras(bundle);
        startActivity(i);


    }

}
