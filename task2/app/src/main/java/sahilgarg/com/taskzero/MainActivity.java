package sahilgarg.com.taskzero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button button;
    protected TextView textview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        textview = (TextView) findViewById(R.id.textview);
        button.setOnClickListener(this);
    }
    int x = 0;
    private void showMessage(){
        String s1 = "Hello World!";
        String s2 = "Goodbye World!";
        x++;
        if(x%2==1)
            textview.setText(s2);
        else
            textview.setText(s1);
    }
    @Override
    public void onClick(View view) {
            showMessage();
    }
}
