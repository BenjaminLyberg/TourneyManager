package andben.com.tourneymanager.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import andben.com.tourneymanager.R;
import andben.com.tourneymanager.model.User;

/**
 * Created by Benjamin on 06.08.2017.
 */

public class SummaryAdapter extends RecyclerView.Adapter<SummaryAdapter.SummaryViewHolder>{

    private ArrayList<User> mUsers;

    public SummaryAdapter(ArrayList<User> users){
        mUsers = users;
    }

    @Override
    public SummaryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.summary_list_item, parent, false);
        SummaryViewHolder viewHolder = new SummaryViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SummaryViewHolder holder, int position) {
        holder.bindUser(mUsers.get(position));
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public class SummaryViewHolder extends RecyclerView.ViewHolder {

        public TextView mPlayerLabel;
        public TextView mTeamLabel;
        public ImageView mLogoImageView;

        public SummaryViewHolder(View itemView) {
            super(itemView);

            mPlayerLabel = (TextView) itemView.findViewById(R.id.playerLabel);
            mTeamLabel = (TextView) itemView.findViewById(R.id.teamLabel);
            mLogoImageView = (ImageView) itemView.findViewById(R.id.logoImageView);
        }

        public void bindUser(User user){
            mPlayerLabel.setText(user.getUsername());
            mTeamLabel.setText(user.getChosenTeam().getName());
            mLogoImageView.setImageResource(user.getChosenTeam().getsImageId());
        }
    }
}
