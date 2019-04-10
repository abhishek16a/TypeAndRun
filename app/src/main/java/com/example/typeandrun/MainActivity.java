package com.example.typeandrun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvOutput;
    private Button btnCreateCar;
    private EditText etManufacturer, etYear, etColor, etPrice, etEngineSize;
    int i=0;
    TypeOutput typeOutput=new TypeOutput();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etManufacturer=findViewById(R.id.etManufacturer);
        etYear=findViewById(R.id.etYear);
        etColor=findViewById(R.id.etColor);
        etPrice=findViewById(R.id.etPrice);
        etEngineSize=findViewById(R.id.etEngineSize);
        tvOutput=findViewById(R.id.tvOutput);

        btnCreateCar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

     typeOutput.setManufacturer(etManufacturer.getText().toString());
     typeOutput.setYear(Integer.parseInt(etYear.getText().toString()));
     typeOutput.setColor(etColor.getText().toString());
     typeOutput.setPrice(Float.parseFloat(etPrice.getText().toString()));
     typeOutput.setEngineSize(Integer.parseInt(etEngineSize.getText().toString()));

     tvOutput.append("This is Vehicle No " +i+ "\n" + "Manufactured by" +etManufacturer+ "\n" + "color is  ");

    }
}
