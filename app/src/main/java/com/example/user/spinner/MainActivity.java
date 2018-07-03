package com.example.user.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        public class MainActivity extends AppCompatActivity {

            Spinner country, states;
            String[] countries = {"India", "USA", "Japan"};
            String[] indianStates = {"chandigarh", "jammu and kashmir", "Rajasthan"};
            String[] USAstates = {"LA", "Newyork", "california"};
            String[] JapanStates = {"Nagoya", "Obu", "Ama"};


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate ( savedInstanceState );
                setContentView ( R.layout.activity_main );

                country = findViewById ( R.id.country );
                states = findViewById ( R.id.state );

                ArrayAdapter<String> countryAdapter = new ArrayAdapter<> ( this, android.R.layout.simple_dropdown_item_1line, countries );
                country.setAdapter ( countryAdapter );

                country.setOnItemSelectedListener ( new AdapterView.OnItemSelectedListener () {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                        if (position == 0) {
                            setAdapter ( indianStates );
                        } else if (position == 1) {
                            setAdapter ( USAstates );
                        } else if (position == 2) {
                            setAdapter ( JapanStates );
                        }

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {


                    }
                } );


            }


            public void setAdapter(String[] statesArray) {

                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<> ( this, android.R.layout.simple_dropdown_item_1line, statesArray );
                states.setAdapter ( arrayAdapter );

            }
        }

    }}
