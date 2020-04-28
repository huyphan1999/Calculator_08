package hcmute.hcmute.edu.vn.calculator_08;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.RoundingMode;
import java.text.DecimalFormat;

//Xử lý và tính toán -- Phan Phú Huy
public class MainActivity extends AppCompatActivity {
    private char operator;
    private double result = 0;
    private boolean isClear = true;
    private TextView calculatorScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatorScreen = findViewById(R.id.calculatorScreen);
        final Button n0 = findViewById(R.id.n0);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button dot = findViewById(R.id.dot);
        final Button equals = findViewById(R.id.nEqual);
        final Button addition = findViewById(R.id.nAdd);
        final Button subtraction = findViewById(R.id.subtract);
        final Button division = findViewById(R.id.division);
        final Button multiplication = findViewById(R.id.nMultiply);
        final Button cancel = findViewById(R.id.nCancel);
        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id) {
                    case R.id.n0:
                        onClickNubmer("0");

                        break;
                    case R.id.n1:

                        onClickNubmer("1");

                        break;
                    case R.id.n2:
                        onClickNubmer("2");

                        break;
                    case R.id.n3:
                        onClickNubmer("3");

                        break;
                    case R.id.n4:
                        onClickNubmer("4");

                        break;
                    case R.id.n5:
                        onClickNubmer("5");

                        break;
                    case R.id.n6:
                        onClickNubmer("6");

                        break;
                    case R.id.n7:
                        onClickNubmer("7");

                        break;
                    case R.id.n8:

                        onClickNubmer("8");

                        break;
                    case R.id.n9:
                        onClickNubmer("9");

                        break;
                    case R.id.nEqual:
                        cal();
                        result=0;
                        break;
                    case R.id.division:
                        cal();
                        operator = '/';

                        break;
                    case R.id.dot:
                        calculatorScreen.append(".");
                        break;
                    case R.id.nAdd:
                        cal();
                        operator = '+';

                        break;
                    case R.id.nMultiply:
                        cal();
                        operator = 'x';
                        break;
                    case R.id.nCancel:
                        clearAll();
                        break;
                    case R.id.subtract:
                        cal();
                        operator = '-';
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

    //Get number on screen
    public double getCalScreen() {
        double temp;
        try {
            temp = Double.parseDouble(calculatorScreen.getText().toString());
        } catch (Exception ref) {
            temp = 0;
        }
        return temp;
    }

    // Set all to default
    public void clearAll() {
        operator = 'i';
        result = 0;
        isClear=false;
        calculatorScreen.setText("0");
    }

    //Handle click event
    public void onClickNubmer(String number) {
        if (isClear) {
            calculatorScreen.append(number);
        } else {
            calculatorScreen.setText("");
            isClear = true;
            calculatorScreen.append(number);
        }

    }



    //Calculate result
    public double cal() {
        switch (operator) {
            case '+':
                result += getCalScreen();
                break;
            case '-':
                result -= getCalScreen();
                break;
            case 'x':
                result *= getCalScreen();
                break;
            case '/':
                if (getCalScreen() != 0) {
                    result /= getCalScreen();
                }
                //Divided by zero
                else{
                    operator = 'i';
                    result = 0;
                    isClear=false;
                    Toast.makeText(getApplicationContext(),"Không thể chia cho 0",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                result=getCalScreen();
                break;
        }

        isClear=false;

        DecimalFormat df = new DecimalFormat("#.########");
        df.setRoundingMode(RoundingMode.FLOOR);

        calculatorScreen.setText(String.valueOf(df.format(result)));

        return result;
    }

}

