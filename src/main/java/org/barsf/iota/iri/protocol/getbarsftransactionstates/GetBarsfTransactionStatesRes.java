package org.barsf.iota.iri.protocol.getbarsftransactionstates;

import com.google.api.client.util.Key;
import org.barsf.iota.iri.protocol.BaseRes;

import java.util.List;

public class GetBarsfTransactionStatesRes extends BaseRes {

    @Key("states")
    private List<String> states ;
    @Key("barsfMilestone")
    private String barsfMilestone;
    @Key("barsfMilestoneIndex")
    private long barsfMilestoneIndex;

    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }

    public String getBarsfMilestone() {
        return barsfMilestone;
    }

    public void setBarsfMilestone(String barsfMilestone) {
        this.barsfMilestone = barsfMilestone;
    }

    public long getBarsfMilestoneIndex() {
        return barsfMilestoneIndex;
    }

    public void setBarsfMilestoneIndex(long barsfMilestoneIndex) {
        this.barsfMilestoneIndex = barsfMilestoneIndex;
    }
}
