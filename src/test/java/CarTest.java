import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CarTest {

    private Car car;

    @Before
    public void setUp() {
        car = new Car();
    }

    @Test
    public void shouldShowXiHuoForInitialStatus() {
        String status = car.getStatus();
        assertThat(status, is("stopped"));
    }

    @Test
    public void shouldShowQidongWhenFaDong() {
        car.faDong();
        String status = car.getStatus();
        assertThat(status, is("started"));
    }

    @Test
    public void shouldShowGuaDangAfterStartAndGuaDang() {
        car.faDong();
        car.guaDang();
        String status = car.getStatus();
        assertThat(status, is("guaDang"));
    }

    @Test
    public void shouldShowKongZhuanAfterStartAndCaiYouMen() {
        car.faDong();
        car.caiYouMen();
        String status = car.getStatus();
        assertThat(status, is("kongZhuan"));
    }

    @Test
    public void shouldShowXiHuoAfterCaiYouMen() {
        car.caiYouMen();
        String status = car.getStatus();
        assertThat(status, is("stopped"));
    }

    @Test
    public void shouldShowXiHuoAfterGuaDang() {
        car.guaDang();
        String status = car.getStatus();
        assertThat(status, is("stopped"));
    }

    @Test
    public void shouldShowMovingAfterStartAndGuaDangAndCaiYouMen() {
        car.faDong();
        car.guaDang();
        car.caiYouMen();
        String status = car.getStatus();
        assertThat(status, is("moving"));
    }
}
