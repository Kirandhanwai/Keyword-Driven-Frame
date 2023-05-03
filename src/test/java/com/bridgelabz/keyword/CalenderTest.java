package com.bridgelabz.keyword;

import com.bridgelabz.keyword.engine.KeywordEngine;
import org.testng.annotations.Test;

public class CalenderTest {
    KeywordEngine keywordEngine;

    @Test
    public void Calender() {
        keywordEngine = new KeywordEngine();
        keywordEngine.starExecution("Calender");
    }
}
