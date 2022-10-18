package com.homannsoftware.blockbuilder.api.domain.datasource;

public interface DataSource {

    default String getName() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
