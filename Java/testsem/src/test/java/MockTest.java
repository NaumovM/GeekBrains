import org.junit.Test;
import sem4hw.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;
import java.util.Iterator;


public class MockTest {
    @Test
    public void iterTest() {
        Iterator iterator = mock(Iterator.class);
        when(iterator.next()).thenReturn("Hello").thenReturn("World!");
        String result = iterator.next() + " " + iterator.next();
        assertThat(result).isEqualTo("Hello World!");
    }



}
