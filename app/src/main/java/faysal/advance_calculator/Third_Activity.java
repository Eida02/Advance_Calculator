package faysal.advance_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Third_Activity extends AppCompatActivity {

    Button convert,back;
    RadioButton usd,cad,inr,euro;
    EditText input;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_);

        input=(EditText) findViewById(R.id.inputtxt);

        usd=(RadioButton) findViewById(R.id.rbusd);
        cad=(RadioButton) findViewById(R.id.rbcad);
        inr=(RadioButton) findViewById(R.id.rbinr);
        euro=(RadioButton) findViewById(R.id.rbeuro);

        result=(TextView) findViewById(R.id.txtresult);
        convert=(Button) findViewById(R.id.btnconvert);
        back=(Button) findViewById(R.id.btnback);


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sinput=input.getText().toString();
                Double b = Double.parseDouble(sinput);
                if (usd.isChecked()){
                    b=b/80.58;
                    result.setText(String.valueOf(b));
                    cad.setChecked(false);
                    inr.setChecked(false);
                    euro.setChecked(false);
                }
                else if (cad.isChecked()){
                    b=b/60.81;
                    result.setText(String.valueOf(b));
                    usd.setChecked(false);
                    inr.setChecked(false);
                    euro.setChecked(false);
                }
                else if (inr.isChecked()){
                    b=b*0.78;
                    result.setText(String.valueOf(b));
                    usd.setChecked(false);
                    cad.setChecked(false);
                    euro.setChecked(false);
                }
                else if (euro.isChecked()){
                    b=b*0.0097;
                    result.setText(String.valueOf(b));
                    usd.setChecked(false);
                    cad.setChecked(false);
                    inr.setChecked(false);
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Third_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
