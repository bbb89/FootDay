package com.lukasz;

import java.io.Serializable;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Łukasz on 02.06.2017.
 */
public class Match implements Serializable{
    private String league;
    private String teamFirst;
    private String teamSecond;
    private List<String> channels;
    private String hour;
    static final long serialVersionUID = 42L;

    public Match(String league, String teamFirst, String teamSecond, List<String> channels, String hour) {
        this.league = league;
        this.teamFirst = teamFirst;
        this.teamSecond = teamSecond;
        this.channels = channels;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return teamFirst + " - " + teamSecond;
    }

    public String getMatchDetails() {
        String s = league + "\n" + teamFirst + " - " + teamSecond + "\n";
        ListIterator<String> iterator = channels.listIterator();
        while(iterator.hasNext()) {
            s += iterator.next() + ", ";
        }
        s += "godz. " + hour;
        return s;
    }

    public String getTeamFirst() {
        return teamFirst;
    }

    public String getTeamSecond() {
        return teamSecond;
    }
}
