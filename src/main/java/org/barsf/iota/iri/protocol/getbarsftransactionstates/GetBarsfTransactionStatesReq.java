package org.barsf.iota.iri.protocol.getbarsftransactionstates;

import com.google.api.client.util.Key;
import org.barsf.iota.iri.protocol.BaseRes;

import java.util.List;

public class GetBarsfTransactionStatesReq extends BaseRes {

    @Key("hashes")
    private List<String> hashes;

    public List<String> getHashes() {
        return hashes;
    }

    public void setHashes(List<String> hashes) {
        this.hashes = hashes;
    }
}
