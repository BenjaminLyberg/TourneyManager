package andben.com.tourneymanager.model;

import java.util.Arrays;

import andben.com.tourneymanager.R;

/**
 * Created by Benjamin on 05.08.2017.
 */

public class TeamPool {
    private static Team[] mTeams = {
            new Team("Anaheim Ducks", R.drawable.anaheim),
            new Team("Arizona Coyotes", R.drawable.arizona),
            new Team("Boston Bruins", R.drawable.boston),
            new Team("Buffalo Sabres", R.drawable.buffalo),
            new Team("Calgary Flames", R.drawable.calgary),
            new Team("Carolina Hurricanes", R.drawable.carolina),
            new Team("Chicago Blackhawks", R.drawable.chicago),
            new Team("Columbus Blue Jackets", R.drawable.colombus),
            new Team("Colorado Avalanche", R.drawable.colorado),
            new Team("Dallas Stars", R.drawable.dallas),
            new Team("Detroit Red Wings", R.drawable.detroit),
            new Team("Edmonton Oilers", R.drawable.edmonton),
            new Team("Florida Panthers", R.drawable.florida),
            new Team("Los Angeles Kings", R.drawable.losangeles),
            new Team("Minnesota Wild", R.drawable.minnesota),
            new Team("Montreal Canadiens", R.drawable.montreal),
            new Team("Nashville Predators", R.drawable.nashville),
            new Team("New Jersey Devils", R.drawable.newjersey),
            new Team("New York Islanders", R.drawable.newyorki),
            new Team("New York Rangers", R.drawable.newyorkr),
            new Team("Ottawa Senators", R.drawable.ottawa),
            new Team("Philadelphia Flyers", R.drawable.philadelphia),
            new Team("Pittsburgh Penguins", R.drawable.pittsburgh),
            new Team("San Jose Sharks", R.drawable.sanjose),
            new Team("St. Louis Blues", R.drawable.stlouis),
            new Team("Tampa Bay Lightning", R.drawable.tampabay),
            new Team("Toronto Maple Leafs", R.drawable.toronto),
            new Team("Vancouver Canucks", R.drawable.vancouver),
            new Team("Vegas Golden Knights", R.drawable.vegas),
            new Team("Washington Capitals", R.drawable.washington),
            new Team("Winnipeg Jets", R.drawable.winnipeg),
    };

    public static Team[] getTeams(){
        return mTeams;
    }
}
