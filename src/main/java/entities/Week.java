package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Week {

    private int number;
    private Duration rideTime;
    private String objective;

    private Plan plan;
    private List<Session> sessions;

    public Week() {
        this.sessions = new ArrayList<>();
    }

    public void registerSession(Session session) {
        this.sessions.add(session);
    }

    public void assingPlan(Plan plan) {
        this.plan = plan;
    }



    public double avarageBeats()
    {
        double sab = 0;
        for (Session s : sessions) {
            double sessionAvarageBeats = s.averageBeats();

            if (sessionAvarageBeats != 0) {
                sab+=s.averageBeats();
            }
        }
        return this.sessions.size()== 0 ? 0: sab /this.sessions.size();
    }

}
