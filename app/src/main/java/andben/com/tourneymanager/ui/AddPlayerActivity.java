package andben.com.tourneymanager.ui;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import andben.com.tourneymanager.R;
import andben.com.tourneymanager.model.Team;
import andben.com.tourneymanager.model.TeamPool;
import andben.com.tourneymanager.model.User;

public class AddPlayerActivity extends AppCompatActivity {
    private static TeamPool teamPool = new TeamPool();
    private List<Team> teams;
    private ArrayList<User> players;
    private Team selectedTeam;
    private int cursor = 0;
    private ImageView logoImage;
    private TextView teamName;
    private TextView playerNumber;
    private EditText playerName;
    private Button nextButton;
    private Button previousButton;
    private Button addPlayerButton;
    private Button startTourneyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);

        logoImage = (ImageView) findViewById(R.id.logoImageView);
        teamName = (TextView) findViewById(R.id.teamNameTextView);
        playerNumber = (TextView) findViewById(R.id.playerNumberTextView);

        nextButton = (Button) findViewById(R.id.nextButton);
        previousButton = (Button) findViewById(R.id.previousButton);
        addPlayerButton = (Button) findViewById(R.id.addPlayerButton);
        startTourneyButton = (Button) findViewById(R.id.startTourneyButton);

        playerName = (EditText) findViewById(R.id.playerNameEditText);

        teams = teamPool.getTeams();
        players = new ArrayList<>();

        Log.e("Size of teams", Integer.toString(teams.size()));

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cursor < teams.size()-1) {
                    cursor++;
                    Log.e("Size of Cursor", Integer.toString(cursor));
                    setTeam(cursor);
                } else {
                    cursor = 0;
                    Log.e("Size of Cursor", Integer.toString(cursor));
                    setTeam(cursor);
                }

            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cursor > 0){
                    cursor--;
                    setTeam(cursor);
                } else {
                    cursor = teams.size() -1;
                    setTeam(cursor);
                }
            }
        });

        addPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(playerName.getText().toString(), selectedTeam);
                players.add(user);
                int displayNumber = players.size()+1;
                playerNumber.setText("Player " +displayNumber);
                cursor = 0;
                setTeam(cursor);
                Toast toast = Toast.makeText(AddPlayerActivity.this, user.getUsername() + " added to tournament", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        startTourneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPlayerActivity.this, PlayersSummaryActivity.class);
                intent.putParcelableArrayListExtra("players", players);
                startActivity(intent);
            }
        });

    }

    public void setTeam(int cursor){
        logoImage.setImageResource(teams.get(cursor).getImageId());
        teamName.setText(teams.get(cursor).getName());
        selectedTeam = teams.get(cursor);
    }


}
