package com.homannsoftware.blockbuilder.datasource.xrpl.domain;

import com.homannsoftware.blockbuilder.api.domain.datasource.ledger.LedgerDataSource;

public class XrplLedgerDataSource implements LedgerDataSource {

    @Override
    public String getName() {
        return XrplLedgerDataSource.class.getSimpleName();
    }
}
