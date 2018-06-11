package org.barsf.iota.iri.protocol.getstoragefeerate;

import com.google.api.client.util.Key;
import org.barsf.iota.iri.protocol.BaseRes;

import java.util.List;

public class GetBarsfStorageFeeRatesRes extends BaseRes {

    @Key("rates")
    private List<String> rates;
    @Key("barsfMilestoneIndexes")
    private List<Integer> barsfMilestoneIndexes;

    public List<String> getRates() {
        return rates;
    }

    public void setRates(List<String> rates) {
        this.rates = rates;
    }

    public List<Integer> getBarsfMilestoneIndexes() {
        return barsfMilestoneIndexes;
    }

    public void setBarsfMilestoneIndexes(List<Integer> barsfMilestoneIndexes) {
        this.barsfMilestoneIndexes = barsfMilestoneIndexes;
    }
}
