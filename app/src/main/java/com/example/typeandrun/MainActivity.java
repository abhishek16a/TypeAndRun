package com.example.typeandrun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

     TextView tvOutput;
     Button btnCreateCar;
     EditText etManufacturer, etYear, etColor, etPrice, etEngineSize;
    int i=1;
    TypeOutput typeOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCreateCar = findViewById(R.id.btnCreateCar);
        etManufacturer = findViewById(R.id.etManufacturer);
        etYear = findViewById(R.id.etYear);
        etColor = findViewById(R.id.etColor);
        etPrice = findViewById(R.id.etPrice);
        etEngineSize = findViewById(R.id.etEngineSize);
        tvOutput = findViewById(R.id.tvOutput);

        typeOutput = new TypeOutput();



        btnCreateCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (!validate()){
                        return;
                    }
                typeOutput.setManufacturer(etManufacturer.getText().toString());
                typeOutput.setYear(Integer.parseInt(etYear.getText().toString()));
                typeOutput.setColor(etColor.getText().toString());
                typeOutput.setPrice(Float.parseFloat(etPrice.getText().toString()));
                typeOutput.setEngineSize(Integer.parseInt(etEngineSize.getText().toString()));

                tvOutput.append("This is Vehicle No " + i + "\n" + "Manufactured by " + typeOutput.getManufacturer()
                                + "\n" + "color is "+ typeOutput.getColor()+ "\n" + "The price is "+typeOutput.getPrice()
                                + "\n" +"The engine size is "+typeOutput.getEngineSize());


            }
        });


    }

    private boolean validate() {
        if(TextUtils.isEmpty(etManufacturer.getText().toString())){
            etManufacturer.setError("please enter manufacturer");
            etManufacturer.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etYear.getText().toString())){
            etYear.setError("please enter Year of purchase");
            etYear.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etColor.getText().toString())){
            etColor.setError("please enter Color");
            etColor.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etPrice.getText().toString())){
            etPrice.setError("please enter Price");
            etPrice.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(etEngineSize.getText().toString())){
            etEngineSize.setError("please enter manufacturer");
            etEngineSize.requestFocus();
            return false;
        }
        return true;
    }

}