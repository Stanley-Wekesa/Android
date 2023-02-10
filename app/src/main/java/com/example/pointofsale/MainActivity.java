package com.example.pointofsale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView QntMilk, QntBread,QntButter, QntSugar, PriceMilk,
            PriceBread, PriceButter,PriceSugar, milkTtl,breadTtl, butterTtl, sugarTtl;
    private TextView grandTotal, discount, netAmount;
    int counter, count, number, times;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QntMilk = findViewById(R.id.txtViewQntMilk);
        QntBread = findViewById(R.id.txtViewQntBread);
        QntButter = findViewById(R.id.txtViewQntButter);
        QntSugar = findViewById(R.id.txtViewQntSugar);

        PriceMilk = findViewById(R.id.txtViewMilkPrice);
        PriceBread = findViewById(R.id.txtViewBreadPrice);
        PriceButter = findViewById(R.id.txtViewButterPrice);
        PriceSugar = findViewById(R.id.txtViewSugarPrice);

        milkTtl = findViewById(R.id.txtViewMilkTtl);
        breadTtl = findViewById(R.id.txtViewBreadTtl);
        butterTtl = findViewById(R.id.txtViewButterTtl);
        sugarTtl = findViewById(R.id.txtViewSugarTtl);

        grandTotal = findViewById(R.id.txtViewGrandTotal);
        discount = findViewById(R.id.txtViewDiscnt);
        netAmount = findViewById(R.id.txtViewNetAmnt);

        Button milk = findViewById(R.id.btnMilk);
        Button bread = findViewById(R.id.btnBread);
        Button butter = findViewById(R.id.btnButter);
        Button sugar = findViewById(R.id.btnSugar);
        Button clear = findViewById(R.id.btnClear);
        Button enter = findViewById(R.id.btnEnter);

        milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                QntMilk.setText(String.valueOf(counter));
                double milkQuantity = Double.parseDouble(QntMilk.getText().toString());
                PriceMilk.setText(String.valueOf(65));
                double milkPrice = Double.parseDouble(PriceMilk.getText().toString());
                milkTtl.setText(String.valueOf(milkQuantity * milkPrice));
            }
        });

        bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                QntBread.setText(String.valueOf(count));
                double breadQuantity = Double.parseDouble(QntBread.getText().toString());
                PriceBread.setText(String.valueOf(75));
                double breadPrice = Double.parseDouble(PriceBread.getText().toString());
                breadTtl.setText(String.valueOf(breadQuantity * breadPrice));

            }
        });

        butter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number++;
                QntButter.setText(String.valueOf(number));
                double butterQuantity = Double.parseDouble(QntButter.getText().toString());
                PriceButter.setText(String.valueOf(125));
                double butterPrice = Double.parseDouble(PriceBread.getText().toString());
                butterTtl.setText(String.valueOf(butterQuantity * butterPrice));

            }
        });

        sugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                times++;
                QntSugar.setText(String.valueOf(times));
                double sugarQuantity = Double.parseDouble(QntSugar.getText().toString());
                PriceSugar.setText(String.valueOf(230));
                double sugarPrice = Double.parseDouble(PriceSugar.getText().toString());
                sugarTtl.setText( String.valueOf(sugarQuantity * sugarPrice));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                count = 0;
                number = 0;
                times = 0;

                QntMilk.setText(String.valueOf(counter));
                QntBread.setText(String.valueOf(count));
                QntButter.setText(String.valueOf(number));
                QntSugar.setText(String.valueOf(times));

                milkTtl.setText(String.valueOf(0));
                breadTtl.setText(String.valueOf(0));
                sugarTtl.setText(String.valueOf(0));
                butterTtl.setText(String.valueOf(0));
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double milkTotal = Double.parseDouble(milkTtl.getText().toString());
                double breadTotal = Double.parseDouble(breadTtl.getText().toString());
                double butterTotal = Double.parseDouble(butterTtl.getText().toString());
                double sugarTotal = Double.parseDouble(sugarTtl.getText().toString());

                grandTotal.setText(String.valueOf(milkTotal + breadTotal + butterTotal + sugarTotal));
                double grand = Double.parseDouble(grandTotal.getText().toString());
                discount.setText(String.valueOf(grand*0.15));
                double disc = Double.parseDouble(discount.getText().toString());
                netAmount.setText(String.valueOf(grand - disc));
            }
        });

    }

}