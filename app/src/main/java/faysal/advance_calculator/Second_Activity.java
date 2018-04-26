package faysal.advance_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    EditText text;
    RadioButton CtoF,FtoC;
    TextView v;
    Button b,back;
    boolean rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        text = (EditText) findViewById(R.id.edittext);
        CtoF= (RadioButton) findViewById(R.id.radioButton1);
        FtoC= (RadioButton) findViewById(R.id.radiobutton2);
        b= (Button) findViewById(R.id.button);
        v= (TextView) findViewById(R.id.textview);
        back=(Button) findViewById(R.id.btnback);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double value = new Double(text.getText().toString());

                if (CtoF.isChecked())
                {
                    value= ((value-32)/9)*5;
                    v.setText(new Double(value).toString());
                    //FtoC.isChecked()=false;
                    FtoC.setChecked(false);

                }
                else if(FtoC.isChecked())
                {
                    value = ((9*value)/5)+32;
                    v.setText(new Double(value).toString());
                    CtoF.setChecked(false);
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Second_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
