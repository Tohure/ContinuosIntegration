package pe.tohure.continuosintegration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblText = (TextView) findViewById(R.id.textView);
    }

    public void changeText(View view) {
        lblText.setText("Tohure");
    }
}
