package org.barsf.iota.iri.protocol.getbarsftransactionstates;

import com.google.api.client.util.Key;
import org.barsf.iota.iri.protocol.BaseReq;

import java.util.List;

public class GetBarsfTransactionStatesReq extends BaseReq {

    @Key("hashes")
    private List<String> hashes;

    public GetBarsfTransactionStatesReq() {
        super("getBarsfTransactionStates");
    }

    public List<String> getHashes() {
        return hashes;
    }

    public void setHashes(List<String> hashes) {
        this.hashes = hashes;
    }
}
