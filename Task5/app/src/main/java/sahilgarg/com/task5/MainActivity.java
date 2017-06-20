package sahilgarg.com.task5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import static java.lang.Math.pow;
import static sahilgarg.com.task5.R.id.divide;
import static sahilgarg.com.task5.R.id.minus;
import static sahilgarg.com.task5.R.id.power;
import static sahilgarg.com.task5.R.id.product;
import static sahilgarg.com.task5.R.id.remainder;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    TextView resu;
    double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add=(Button) findViewById(R.id.sum);
        num1=(EditText) findViewById(R.id.n1);
        num2=(EditText) findViewById(R.id.n2);
        resu=(TextView) findViewById(R.id.result);
        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String mynum1=num1.getText().toString().trim();
                String mynum2=num2.getText().toString().trim();
                if(mynum1.equals(""))
                {

                    Toast a1 =Toast.makeText(getApplicationContext(), "Enter first number.", Toast.LENGTH_SHORT);
                    a1.show();
                    resu.setText("Error, no input.");

                }
                else if(mynum2.equals(""))
                {

                    Toast a1 =Toast.makeText(getApplicationContext(), "Enter second number.", Toast.LENGTH_SHORT);
                    a1.show();
                    resu.setText("Error, no input.");

                }
                else
                {
                double mnum1= Double.parseDouble(mynum1);
                double mnum2=Double.parseDouble(mynum2);

                    res=mnum1+mnum2;
                    resu.setText(String.format("%.2f",res));}


            }
        });

        Button diff=(Button) findViewById(minus);
        diff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String mynum1=num1.getText().toString();
                String mynum2=num2.getText().toString();
                if(mynum1.equals(""))
                {

                    Toast a1 =Toast.makeText(getApplicationContext(), "Enter first number.", Toast.LENGTH_SHORT);
                    a1.show();
                    resu.setText("Error, no input.");

                }
                else if(mynum2.equals(""))
                {

                    Toast a1 =Toast.makeText(getApplicationContext(), "Enter second number.", Toast.LENGTH_SHORT);
                    a1.show();
                    resu.setText("Error, no input.");

                }
                else
                {
                double mnum1= Double.parseDouble(mynum1);
                double mnum2=Double.parseDouble(mynum2);

                res=mnum1+(-mnum2);
                resu.setText(String.format("%.2f",res));}
            }
        });


        Button mult=(Button) findViewById(product);
        mult.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String mynum1=num1.getText().toString();
                String mynum2=num2.getText().toString();
                if(mynum1.equals(""))
                {

                    Toast a1 =Toast.makeText(getApplicationContext(), "Enter first number.", Toast.LENGTH_SHORT);
                    a1.show();
                    resu.setText("Error, no input.");

                }
                else if(mynum2.equals(""))
                {

                    Toast a1 =Toast.makeText(getApplicationContext(), "Enter second number.", Toast.LENGTH_SHORT);
                    a1.show();
                    resu.setText("Error, no input.");

                }
                else
                {
                    double mnum2=Double.parseDouble(mynum2);
                    double mnum1= Double.parseDouble(mynum1);
                res=mnum1*mnum2;
                resu.setText(String.format("%.2f",res));}
            }
        });

        Button div = (Button) findViewById(divide);
        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String mynum1=num1.getText().toString();
                String mynum2=num2.getText().toString();

                if(mynum1.equals(""))
                {

                    Toast a1 =Toast.makeText(getApplicationContext(), "Enter first number.", Toast.LENGTH_SHORT);
                    a1.show();
                    resu.setText("Error, no input.");

                }
                else if(mynum2.equals(""))
                {

                    Toast a1 =Toast.makeText(getApplicationContext(), "Enter second number.", Toast.LENGTH_SHORT);
                    a1.show();
                    resu.setText("Error, no input.");

                }
                else
                {
                double mnum2=Double.parseDouble(mynum2);double mnum1= Double.parseDouble(mynum1);
                    res=mnum1/mnum2;
                resu.setText(String.format("%.2f",res));}
            }
        });

        Button remain=(Button) findViewById(remainder);
        remain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String mynum1=num1.getText().toString();
                String mynum2=num2.getText().toString();

                if(mynum1.equals(""))
                {

                    Toast a1 =Toast.makeText(getApplicationContext(), "Enter first number.", Toast.LENGTH_SHORT);
                    a1.show();
                    resu.setText("Error, no input.");

                }
                else if(mynum2.equals(""))
                {

                    Toast a1 =Toast.makeText(getApplicationContext(), "Enter second number.", Toast.LENGTH_SHORT);
                    a1.show();
                    resu.setText("Error, no input.");

                }
                else
                {
                    double mnum2=Double.parseDouble(mynum2);double mnum1= Double.parseDouble(mynum1);
                    res=mnum1%mnum2;
                    resu.setText(String.format("%.2f",res));}
            }
        });

        Button powe=(Button) findViewById(power);
        powe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String mynum1=num1.getText().toString();
                String mynum2=num2.getText().toString();

                if(mynum1.equals(""))
                {

                    Toast a1 =Toast.makeText(getApplicationContext(), "Enter first number.", Toast.LENGTH_SHORT);
                    a1.show();
                    resu.setText("Error, no input.");

                }
                else if(mynum2.equals(""))
                {

                    Toast a1 =Toast.makeText(getApplicationContext(), "Enter second number.", Toast.LENGTH_SHORT);
                    a1.show();
                    resu.setText("Error, no input.");

                }
                else
                {
                    double mnum2=Double.parseDouble(mynum2);double mnum1= Double.parseDouble(mynum1);
                    res=pow(mnum1,mnum2);
                    resu.setText(String.format("%.2f",res));}
            }
        });
    }

}
