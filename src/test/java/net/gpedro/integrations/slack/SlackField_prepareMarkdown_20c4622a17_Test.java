// Test generated by RoostGPT for test slack-webhook-java using AI Type Open AI and AI Model gpt-4

package net.gpedro.integrations.slack;

import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class SlackField_prepareMarkdown_20c4622a17_Test {

    @InjectMocks
    private YourClass yourClass; // TODO: Replace YourClass with the actual class name

    @Mock
    private List<String> allowMarkdown;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPrepareMarkdown_success() {
        List<String> mockData = new ArrayList<>();
        mockData.add("item1");
        mockData.add("item2");
        when(allowMarkdown.iterator()).thenReturn(mockData.iterator());

        JsonArray expectedOutput = new JsonArray();
        expectedOutput.add(new JsonPrimitive("item1"));
        expectedOutput.add(new JsonPrimitive("item2"));

        JsonArray actualOutput = yourClass.prepareMarkdown();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPrepareMarkdown_emptyList() {
        List<String> mockData = new ArrayList<>();
        when(allowMarkdown.iterator()).thenReturn(mockData.iterator());

        JsonArray expectedOutput = new JsonArray();

        JsonArray actualOutput = yourClass.prepareMarkdown();
        assertEquals(expectedOutput, actualOutput);
    }
}
