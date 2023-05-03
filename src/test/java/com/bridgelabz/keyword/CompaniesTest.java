package com.bridgelabz.keyword;

import com.bridgelabz.keyword.engine.KeywordEngine;
import org.testng.annotations.Test;

public class CompaniesTest {
    KeywordEngine keywordEngine;

    @Test
    public void CompaniesTest() {
        keywordEngine = new KeywordEngine();
        keywordEngine.starExecution("Companies");
    }
}
