package org.barsf.iota.iri.protocol.getbarsfnodeinfo;

import com.google.api.client.util.Key;
import org.barsf.iota.iri.protocol.BaseRes;

public class GetBarsfNodeInfoRes extends BaseRes {

    @Key("barsfAppName")
    private String barsfAppName;
    @Key("barsfAppVersion")
    private String barsfAppVersion;
    @Key("nextFeeAddress")
    private String nextFeeAddress;
    @Key("nextStorageFeeRate")
    private double nextStorageFeeRate;
    @Key("latestBarsfMilestone")
    private String latestBarsfMilestone;
    @Key("latestBarsfMilestoneIndex")
    private long latestBarsfMilestoneIndex;
    @Key("latestIotaMilestone")
    private String latestIotaMilestone;
    @Key("latestIotaMilestoneIndex")
    private long latestIotaMilestoneIndex;
    @Key("latestIotaSolidSubtangleMilestone")
    private String latestIotaSolidSubtangleMilestone;
    @Key("latestIotaSolidSubtangleMilestoneIndex")
    private long latestIotaSolidSubtangleMilestoneIndex;

    public String getBarsfAppName() {
        return barsfAppName;
    }

    public void setBarsfAppName(String barsfAppName) {
        this.barsfAppName = barsfAppName;
    }

    public String getBarsfAppVersion() {
        return barsfAppVersion;
    }

    public void setBarsfAppVersion(String barsfAppVersion) {
        this.barsfAppVersion = barsfAppVersion;
    }

    public String getNextFeeAddress() {
        return nextFeeAddress;
    }

    public void setNextFeeAddress(String nextFeeAddress) {
        this.nextFeeAddress = nextFeeAddress;
    }

    public double getNextStorageFeeRate() {
        return nextStorageFeeRate;
    }

    public void setNextStorageFeeRate(double nextStorageFeeRate) {
        this.nextStorageFeeRate = nextStorageFeeRate;
    }

    public String getLatestBarsfMilestone() {
        return latestBarsfMilestone;
    }

    public void setLatestBarsfMilestone(String latestBarsfMilestone) {
        this.latestBarsfMilestone = latestBarsfMilestone;
    }

    public long getLatestBarsfMilestoneIndex() {
        return latestBarsfMilestoneIndex;
    }

    public void setLatestBarsfMilestoneIndex(long latestBarsfMilestoneIndex) {
        this.latestBarsfMilestoneIndex = latestBarsfMilestoneIndex;
    }

    public String getLatestIotaMilestone() {
        return latestIotaMilestone;
    }

    public void setLatestIotaMilestone(String latestIotaMilestone) {
        this.latestIotaMilestone = latestIotaMilestone;
    }

    public long getLatestIotaMilestoneIndex() {
        return latestIotaMilestoneIndex;
    }

    public void setLatestIotaMilestoneIndex(long latestIotaMilestoneIndex) {
        this.latestIotaMilestoneIndex = latestIotaMilestoneIndex;
    }

    public String getLatestIotaSolidSubtangleMilestone() {
        return latestIotaSolidSubtangleMilestone;
    }

    public void setLatestIotaSolidSubtangleMilestone(String latestIotaSolidSubtangleMilestone) {
        this.latestIotaSolidSubtangleMilestone = latestIotaSolidSubtangleMilestone;
    }

    public long getLatestIotaSolidSubtangleMilestoneIndex() {
        return latestIotaSolidSubtangleMilestoneIndex;
    }

    public void setLatestIotaSolidSubtangleMilestoneIndex(long latestIotaSolidSubtangleMilestoneIndex) {
        this.latestIotaSolidSubtangleMilestoneIndex = latestIotaSolidSubtangleMilestoneIndex;
    }
}
