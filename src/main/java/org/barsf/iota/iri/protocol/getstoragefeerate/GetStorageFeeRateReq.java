package org.barsf.iota.iri.protocol.getstoragefeerate;

import com.google.api.client.util.Key;
import org.barsf.iota.iri.protocol.BaseReq;

public class GetStorageFeeRateReq extends BaseReq {

    @Key("startBarsfMilestoneIndex")
    private int startBarsfMilestoneIndex;
    @Key("endBarsfMilestoneIndex")
    private int endBarsfMilestoneIndex;

    public int getStartBarsfMilestoneIndex() {
        return startBarsfMilestoneIndex;
    }

    public void setStartBarsfMilestoneIndex(int startBarsfMilestoneIndex) {
        this.startBarsfMilestoneIndex = startBarsfMilestoneIndex;
    }

    public int getEndBarsfMilestoneIndex() {
        return endBarsfMilestoneIndex;
    }

    public void setEndBarsfMilestoneIndex(int endBarsfMilestoneIndex) {
        this.endBarsfMilestoneIndex = endBarsfMilestoneIndex;
    }

}
