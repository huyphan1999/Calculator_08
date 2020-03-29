package hcmute.hcmute.edu.vn.calculator_08;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView calculatorScreen= findViewById(R.id.calculatorScreen);
        final Button n0= findViewById(R.id.n0);
        final Button n1= findViewById(R.id.n1);
        final Button n2= findViewById(R.id.n2);
        final Button n3= findViewById(R.id.n3);
        final Button n4= findViewById(R.id.n4);
        final Button n5= findViewById(R.id.n5);
        final Button n6= findViewById(R.id.n6);
        final Button n7= findViewById(R.id.n7);
        final Button n8= findViewById(R.id.n8);
        final Button n9= findViewById(R.id.n9);
        final Button dot= findViewById(R.id.dot);
        final Button equals= findViewById(R.id.nEqual);
        final Button addition= findViewById(R.id.nAdd);
        final Button subtraction= findViewById(R.id.subtract);
        final Button division= findViewById(R.id.division);
        final Button multiplication = findViewById(R.id.nMultiply);
        final Button cancel = findViewById(R.id.nCancel);
        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id){
                    case R.id.n0:
                        calculatorScreen.append("0");

                        break;
                    case R.id.n1:
                        calculatorScreen.append("1");

                        break;
                    case R.id.n2:
                        calculatorScreen.append("2");

                        break;
                    case R.id.n3:
                        calculatorScreen.append("3");

                        break;
                    case R.id.n4:
                        calculatorScreen.append("4");

                        break;
                    case R.id.n5:
                        calculatorScreen.append("5");

                        break;
                    case R.id.n6:
                        calculatorScreen.append("6");

                        break;
                    case R.id.n7:
                        calculatorScreen.append("7");

                        break;
                    case R.id.n8:
                        calculatorScreen.append("8");

                        break;
                    case R.id.n9:
                        calculatorScreen.append("9");

                        break;
                    case R.id.nEqual:


                        break;
                    case R.id.division:
                        calculatorScreen.append("/");

                        break;
                    case R.id.dot:
                        calculatorScreen.append(".");

                        break;
                    case R.id.nAdd:
                        calculatorScreen.append("+");

                        break;
                    case R.id.nMultiply:
                        calculatorScreen.append("x");

                        break;
                    case R.id.nCancel:

                        break;
                    case R.id.subtract:
                        calculatorScreen.append("-");

                        break;

                }
            }
        };
        n0.setOnClickListener(calculatorListener);
        n1.setOnClickListener(calculatorListener);
        n2.setOnClickListener(calculatorListener);
        n3.setOnClickListener(calculatorListener);
        n4.setOnClickListener(calculatorListener);
        n5.setOnClickListener(calculatorListener);
        n6.setOnClickListener(calculatorListener);
        n7.setOnClickListener(calculatorListener);
        n8.setOnClickListener(calculatorListener);
        n9.setOnClickListener(calculatorListener);
        equals.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        addition.setOnClickListener(calculatorListener);
        subtraction.setOnClickListener(calculatorListener);
        multiplication.setOnClickListener(calculatorListener);
        cancel.setOnClickListener(calculatorListener);
    }
}

