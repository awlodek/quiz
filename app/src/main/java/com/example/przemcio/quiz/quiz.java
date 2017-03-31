package com.example.przemcio.quiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class quiz extends Activity {


    int x=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button button = (Button) findViewById (R.id.button4);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                RadioGroup rG1 = (RadioGroup) findViewById(R.id.radioGroup);
                RadioButton rB1 = (RadioButton) findViewById(R.id.radioButton);

                int zaz1 = rG1.getCheckedRadioButtonId();
                RadioButton r1 = (RadioButton) findViewById(zaz1);

                if ((r1.equals(rB1))) {
                    x++;
                }


                RadioGroup rG2 = (RadioGroup) findViewById(R.id.radioGroup2);
                RadioButton rB2 = (RadioButton) findViewById(R.id.radioButton4);
                int zaz2 =rG2.getCheckedRadioButtonId();
                RadioButton r2 = (RadioButton) findViewById(zaz2);
                if(r2.equals(rB2))
                {
                    x++;
                }


                RadioGroup rG3 = (RadioGroup) findViewById(R.id.radioGroup3);
                RadioButton rB3 = (RadioButton) findViewById(R.id.radioButton6);
                int zaz3 =rG3.getCheckedRadioButtonId();
                RadioButton r3 = (RadioButton) findViewById(zaz3);
                if(r3.equals(rB3))
                {
                    x++;
                }

                RadioGroup rG4 = (RadioGroup) findViewById(R.id.radioGroup4);
                RadioButton rB4 = (RadioButton) findViewById(R.id.radioButton7);
                int zaz4 =rG4.getCheckedRadioButtonId();
                RadioButton r4 = (RadioButton) findViewById(zaz4);
                if(r4.equals(rB4))
                {
                    x++;
                }

                RadioGroup rG5 = (RadioGroup) findViewById(R.id.radioGroup5);
                RadioButton rB5 = (RadioButton) findViewById(R.id.radioButton10);
                int zaz5 =rG5.getCheckedRadioButtonId();
                RadioButton r5 = (RadioButton) findViewById(zaz5);
                if(r5.equals(rB5))
                {
                    x++;
                }


                Toast.makeText(getApplicationContext(), "Twój wynik:"+x+"/5", Toast.LENGTH_SHORT).show();
                x=0;
            }

        });
    }
}



