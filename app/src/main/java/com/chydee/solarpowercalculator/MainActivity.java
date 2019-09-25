package com.chydee.solarpowercalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Generals
    //EditTexts
    private EditText avgSunlightPerDay;
    private EditText applianceName;
    //Appliances with power rated in watts
    private EditText applianceWattage;
    private EditText numberOfHrsPerDay; //Indicates the number of hours the appliance is in use on a daily basis
    private EditText applianceVolt; // for appliances with volts and amps instead of watts
    private EditText applianceAmps;

    //for appliances with Horse Power (HP) instead of watts, voltage, and/or amps
    private EditText applianceHP;
    //Buttons
    private Button addAppliance;
    private Button reset; // Used for clearing all fields
    private Button calculate; //To do the math



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Initialize Views
        //EditText
        avgSunlightPerDay = findViewById(R.id.edt_avg_sunlight);
        applianceName = findViewById(R.id.edit_text_appliance_name);


        //Buttons
        addAppliance = findViewById(R.id.add_an_appliance_btn);
        reset = findViewById(R.id.reset_btn);
        calculate = findViewById(R.id.calculate_btn);

        //Add Logic to Add An Appliance Button
        addAppliance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}
