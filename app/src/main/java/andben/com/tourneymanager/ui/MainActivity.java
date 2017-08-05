package andben.com.tourneymanager.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import andben.com.tourneymanager.R;

public class MainActivity extends AppCompatActivity {
    private Button startButton;
    private Button historyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.newTourneyButton);
        historyButton = (Button) findViewById(R.id.tourneyHistoryButton);


    }
}
