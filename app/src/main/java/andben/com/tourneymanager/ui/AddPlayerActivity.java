package andben.com.tourneymanager.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import andben.com.tourneymanager.R;
import andben.com.tourneymanager.model.Team;
import andben.com.tourneymanager.model.TeamPool;

public class AddPlayerActivity extends AppCompatActivity {
    private static TeamPool teamPool = new TeamPool();
    private List<Team> teams;
    private int cursor = 0;
    private ImageView logoImage;
    private TextView teamName;
    private Button nextButton;
    private Button previousButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);

        logoImage = (ImageView) findViewById(R.id.logoImageView);
        teamName = (TextView) findViewById(R.id.teamNameTextView);

        nextButton = (Button) findViewById(R.id.nextButton);
        previousButton = (Button) findViewById(R.id.previousButton);

        teams = teamPool.getTeams();

        Log.e("Size of teams", Integer.toString(teams.size()));

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cursor < teams.size()-1) {
                    cursor++;
                    Log.e("Size of Cursor", Integer.toString(cursor));
                    logoImage.setImageResource(teams.get(cursor).getImageId());
                    teamName.setText(teams.get(cursor).getName());
                } else {
                    cursor = 0;
                    Log.e("Size of Cursor", Integer.toString(cursor));
                    logoImage.setImageResource(teams.get(cursor).getImageId());
                    teamName.setText(teams.get(cursor).getName());
                }

            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cursor > 0){
                    cursor--;
                    logoImage.setImageResource(teams.get(cursor).getImageId());
                    teamName.setText(teams.get(cursor).getName());
                } else {
                    cursor = teams.size() -1;
                    logoImage.setImageResource(teams.get(cursor).getImageId());
                    teamName.setText(teams.get(cursor).getName());
                }
            }
        });

    }
}
