package com.bridgelabz.keyword;

import com.bridgelabz.keyword.engine.KeywordEngine;
import org.testng.annotations.Test;

public class ContactsTest {
    KeywordEngine keywordEngine;

    @Test
    public void ContactsTest() {
        keywordEngine = new KeywordEngine();
        keywordEngine.starExecution("Contacts");

    }
}
