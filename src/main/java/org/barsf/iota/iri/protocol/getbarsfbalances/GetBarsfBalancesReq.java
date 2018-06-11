package org.barsf.iota.iri.protocol.getbarsfbalances;

import com.google.api.client.util.Key;
import org.barsf.iota.iri.protocol.BaseReq;

import java.util.List;

public class GetBarsfBalancesReq extends BaseReq {

    public GetBarsfBalancesReq() {
        super("getBarsfBalances");
    }

    @Key("addresses")
    private List<String> addresses;

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }
}
