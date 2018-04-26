package faysal.advance_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {


    /*******************Decleare variable****************/
    Button btnce,one,two,three,four,five,six,seven,eight,nine,zero,dec,btcurrency;
    TextView tvinput,tvresult;
    String processor;
    Boolean brackopen;
    Button plus,minus,multiply,divide,back,bracket,equal,percent,sin,cos,tan,temp,currency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        brackopen=false;

        /******************** Assigning veriable************************/

        temp=(Button)findViewById(R.id.btntemp);
        btcurrency=(Button) findViewById(R.id.btncurrency);

        btnce=(Button)findViewById(R.id.btnc);
        back=(Button) findViewById(R.id.btnclr);
        tvinput=(TextView) findViewById(R.id.txtt);
        tvresult=(TextView) findViewById(R.id.txtt1);

        sin=(Button) findViewById(R.id.btnsin);
        cos=(Button) findViewById(R.id.btncos);
        tan=(Button) findViewById(R.id.btntan);

        zero=(Button)findViewById(R.id.btn0);
        one=(Button)findViewById(R.id.btn1);
        two=(Button)findViewById(R.id.btn2);
        three=(Button)findViewById(R.id.btn3);
        four=(Button)findViewById(R.id.btn4);
        five =(Button)findViewById(R.id.btn5);
        six=(Button)findViewById(R.id.btn6);
        seven=(Button)findViewById(R.id.btn7);
        eight=(Button)findViewById(R.id.btn8);
        nine=(Button)findViewById(R.id.btn9);

        plus=(Button) findViewById(R.id.btnplus);
        minus=(Button) findViewById(R.id.btnminus);
        multiply=(Button) findViewById(R.id.btnmulty);
        divide=(Button) findViewById(R.id.btndiv);
        dec=(Button) findViewById(R.id.btndot);
        bracket=(Button) findViewById(R.id.btnbrac);
        equal=(Button) findViewById(R.id.btnequal);
        percent=(Button) findViewById(R.id.btnpercent);


        /**********************Button click process for c and back*****************/
       btnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvinput.setText("");
                tvresult.setText("");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                processor=tvinput.getText().toString();
                if (processor.length()>0)
                {
                    processor=processor.substring(0,processor.length() -1);
                    tvinput.setText(processor);
                }
            }
        });

        /*********************Number Button Click view************************/
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "3");
            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "9");
            }
        });




        /*********************Functional Button Click view************************/
       plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "+");
            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "-");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "*");
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "/");
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "%");
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + ".");
            }
        });


        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "Sin");

            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "Cos");
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                tvinput.setText(processor + "Tan");

            }
        });


        /************Barcket Button on click view*************/
       bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (brackopen)
                {
                    processor=tvinput.getText().toString();
                    tvinput.setText(processor + ")");
                    brackopen=false;
                }
                else{
                    processor=tvinput.getText().toString();
                    tvinput.setText(processor + "(");
                    brackopen=true;
                }
            }
        });

        /**********Button equal work***********/
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor=tvinput.getText().toString();
                processor=processor.replaceAll("×","*");
                processor=processor.replaceAll("%","/100");
                //processor=processor.replaceAll("Sin","*(3.14159265/180)");
                processor=processor.replaceAll("Cos","*(3.14159265/180)");
                processor=processor.replaceAll("Tan","*(3.14159265/180)");


                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String Result="";

                try{

                    Scriptable scriptable=rhino.initStandardObjects();
                    Result=rhino.evaluateString(scriptable, processor, "JavaScript", 1,
                            null).toString();



                }catch (Exception e){
                    Result= "Error";
                }

                tvresult.setText(Result);




            }
        });

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Second_Activity.class);
                startActivity(intent);
            }
        });

        btcurrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Third_Activity.class);
                startActivity(intent);
            }
        });


    }
}
