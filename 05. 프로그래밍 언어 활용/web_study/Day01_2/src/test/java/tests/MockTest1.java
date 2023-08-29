package tests;

import exam03.Calculator;
import exam03.Scheduler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MockTest1 {
    @Mock
    Calculator cal;
    @Mock
    Scheduler scheduler;
    @Test
    void test1() {
//        Calculator cal = mock(Calculator.class);
        given(cal.add(10,20)).willReturn(30);

        int result = cal.add(10,20);
        System.out.println(result);

    }
    @Test
    void test2() {
//        Scheduler scheduler = mock(Scheduler.class);
        given(scheduler.view(2023,2,31))
                .willThrow(IllegalArgumentException.class);

        assertThrows(IllegalArgumentException.class, () -> {
           scheduler.view(2023,2,31);
        });
    }

    @Test
    void test3(){
//        Scheduler scheduler = mock(Scheduler.class);
        willThrow(RuntimeException.class)
                .given(scheduler)
                .print();
        assertThrows(RuntimeException.class, () -> {
            scheduler.print();
        });
    }
}
