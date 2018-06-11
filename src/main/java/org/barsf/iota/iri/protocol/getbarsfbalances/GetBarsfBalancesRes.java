package org.barsf.iota.iri.protocol.getbarsfbalances;

import com.google.api.client.util.Key;
import org.barsf.iota.iri.protocol.BaseRes;

import java.util.List;

public class GetBarsfBalancesRes extends BaseRes {

    @Key("balances")
    private List<String> balances = null;
    @Key("lastChangedMilestoneIndexes")
    private List<Integer> lastChangedMilestoneIndexes = null;
    @Key("references")
    private List<String> references;
    @Key("milestoneIndex")
    private Integer milestoneIndex;

    public List<String> getBalances() {
        return balances;
    }

    public void setBalances(List<String> balances) {
        this.balances = balances;
    }

    public List<Integer> getLastChangedMilestoneIndexes() {
        return lastChangedMilestoneIndexes;
    }

    public void setLastChangedMilestoneIndexes(List<Integer> lastChangedMilestoneIndexes) {
        this.lastChangedMilestoneIndexes = lastChangedMilestoneIndexes;
    }

    public List<String> getReferences() {
        return references;
    }

    public void setReferences(List<String> references) {
        this.references = references;
    }

    public Integer getMilestoneIndex() {
        return milestoneIndex;
    }

    public void setMilestoneIndex(Integer milestoneIndex) {
        this.milestoneIndex = milestoneIndex;
    }
}
