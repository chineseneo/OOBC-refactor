import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FakeTest {
    @Test
    public void testPass() {
        assertThat(true, is(true));
    }

    @Ignore
    public void testFail() {
        assertThat(false, is(true));
    }
}
