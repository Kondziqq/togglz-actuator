package com.example.togglz.features;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;

public enum Features implements Feature {

    @Label("Test feature")
    @EnabledByDefault
    TEST_FEATURE
}
