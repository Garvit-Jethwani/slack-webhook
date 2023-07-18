// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;

public class SlackAttachment_prepareMarkdownAttributes_d1daa7c15a_Test {

    private Set<String> markdownAttributes;

    @BeforeEach
    public void setup() {
        markdownAttributes = new HashSet<>();
    }

    @Test
    public void testPrepareMarkdownAttributes_WithValidAttributes() {
        markdownAttributes.addAll(Arrays.asList("attr1", "attr2", "attr3"));
        JsonArray expectedResult = new JsonArray();
        expectedResult.add(new JsonPrimitive("attr1"));
        expectedResult.add(new JsonPrimitive("attr2"));
        expectedResult.add(new JsonPrimitive("attr3"));

        JsonArray actualResult = prepareMarkdownAttributes();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPrepareMarkdownAttributes_WithNoAttributes() {
        JsonArray expectedResult = new JsonArray();

        JsonArray actualResult = prepareMarkdownAttributes();

        assertEquals(expectedResult, actualResult);
    }

    private JsonArray prepareMarkdownAttributes() {
        final JsonArray data = new JsonArray();
        for (String attr : markdownAttributes) {
            data.add(new JsonPrimitive(attr));
        }

        return data;
    }
}
