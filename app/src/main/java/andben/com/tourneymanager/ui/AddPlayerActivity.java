package andben.com.tourneymanager.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import andben.com.tourneymanager.R;
import andben.com.tourneymanager.model.Team;
import andben.com.tourneymanager.model.TeamPool;

public class AddPlayerActivity extends AppCompatActivity {
    private static TeamPool teamPool;
    private List<Team> teams;
    private int cursor;
    private Button nextButton;
    private Button previousButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);

        teams = teamPool.getTeams();

    }
}
