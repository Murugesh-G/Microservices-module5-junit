package com.edureka.springboot.tutorial.basics.example.unittes;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.edureka.springboot.tutorial.basics.example.unittesting.BusinessService;
import com.edureka.springboot.tutorial.basics.example.unittesting.DataService;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessServicesMockSpringContextTest {

    @MockBean
    DataService dataServiceMock;

    @Autowired
    BusinessService businessImpl;

    @Test
    public void testFindTheGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
        assertEquals(24, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });
        assertEquals(15, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllData_NoValues() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
    }
}