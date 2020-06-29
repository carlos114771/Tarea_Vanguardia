package Observer;

import java.util.ArrayList;

public class HeadHunter implements Subject {

    private ArrayList<Observer> userList = new ArrayList<Observer>();
    private ArrayList<String> jobs = new ArrayList<String>();

    @Override
    public void registerObserver(Observer o) {
        userList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        userList.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o : userList) {
            o.update(this);
        }
    }

    public void addJob(String job) {
        this.jobs.add(job);
        notifyAllObservers();
    }

    public ArrayList<String> getJobs() {
        return jobs;
    }
}