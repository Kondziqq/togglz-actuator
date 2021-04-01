package com.example.togglz;

import com.example.togglz.features.Features;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;

@RestController
@RequestMapping("/api")
public class TestController {

    private final FeatureManager featureManager;

    public TestController(FeatureManager featureManager) {
        this.featureManager = featureManager;
    }

    @GetMapping("/test-feature")
    public boolean testFeatures() {

        return featureManager.isActive(Features.TEST_FEATURE);
    }
}
