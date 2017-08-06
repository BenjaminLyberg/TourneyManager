package andben.com.tourneymanager.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import andben.com.tourneymanager.R;

/**
 * Created by Benjamin on 05.08.2017.
 */

public class TeamPool {
    private static List<Team> mTeams = Arrays.asList(
            new Team("Anaheim Ducks", R.drawable.anaheim, R.drawable.anaheims),
            new Team("Arizona Coyotes", R.drawable.arizona, R.drawable.arizonas),
            new Team("Boston Bruins", R.drawable.boston, R.drawable.bostons),
            new Team("Buffalo Sabres", R.drawable.buffalo, R.drawable.buffalos),
            new Team("Calgary Flames", R.drawable.calgary, R.drawable.calgarys),
            new Team("Carolina Hurricanes", R.drawable.carolina, R.drawable.carolinas),
            new Team("Chicago Blackhawks", R.drawable.chicago, R.drawable.chicagos),
            new Team("Columbus Blue Jackets", R.drawable.colombus, R.drawable.colombuss),
            new Team("Colorado Avalanche", R.drawable.colorado, R.drawable.colorados),
            new Team("Dallas Stars", R.drawable.dallas, R.drawable.dallass),
            new Team("Detroit Red Wings", R.drawable.detroit, R.drawable.detroits),
            new Team("Edmonton Oilers", R.drawable.edmonton, R.drawable.edmontons),
            new Team("Florida Panthers", R.drawable.florida, R.drawable.floridas),
            new Team("Los Angeles Kings", R.drawable.losangeles, R.drawable.losangeless),
            new Team("Minnesota Wild", R.drawable.minnesota, R.drawable.minnesotas),
            new Team("Montreal Canadiens", R.drawable.montreal, R.drawable.montreals),
            new Team("Nashville Predators", R.drawable.nashville, R.drawable.nashvilles),
            new Team("New Jersey Devils", R.drawable.newjersey, R.drawable.newjerseys),
            new Team("New York Islanders", R.drawable.newyorki, R.drawable.newyorkis),
            new Team("New York Rangers", R.drawable.newyorkr, R.drawable.newyorkrs),
            new Team("Ottawa Senators", R.drawable.ottawa, R.drawable.ottawas),
            new Team("Philadelphia Flyers", R.drawable.philadelphia, R.drawable.philadelphias),
            new Team("Pittsburgh Penguins", R.drawable.pittsburgh, R.drawable.pittsburghs),
            new Team("San Jose Sharks", R.drawable.sanjose, R.drawable.sanjoses),
            new Team("St. Louis Blues", R.drawable.stlouis, R.drawable.stlouiss),
            new Team("Tampa Bay Lightning", R.drawable.tampabay, R.drawable.tampabays),
            new Team("Toronto Maple Leafs", R.drawable.toronto, R.drawable.torontos),
            new Team("Vancouver Canucks", R.drawable.vancouver, R.drawable.vancouvers),
            new Team("Vegas Golden Knights", R.drawable.vegas, R.drawable.vegass),
            new Team("Washington Capitals", R.drawable.washington, R.drawable.washingtons),
            new Team("Winnipeg Jets", R.drawable.winnipeg, R.drawable.winnipegs));

    public List<Team> getTeams(){
        return mTeams;
    }
}
