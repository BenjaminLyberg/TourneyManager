package andben.com.tourneymanager.ui;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import andben.com.tourneymanager.R;
import andben.com.tourneymanager.adapters.SummaryAdapter;
import andben.com.tourneymanager.model.User;

public class PlayersSummaryActivity extends AppCompatActivity {
    private ArrayList<User> players;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_summary);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        Intent intent = getIntent();
        players = intent.getParcelableArrayListExtra("players");

        SummaryAdapter summaryAdapter = new SummaryAdapter(players);
        mRecyclerView.setAdapter(summaryAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);
    }
}
