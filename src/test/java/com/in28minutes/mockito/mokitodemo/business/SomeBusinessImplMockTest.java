package com.in28minutes.mockito.mokitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessImplMockTest {

  @Test
  void findTheGreatestFromAllData_basicScenario() {
    DataService dataServiceMock = mock(DataService.class);
    when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 25, 15, 5 });
    SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
    int result = businessImpl.findTheGreatestFromAllData();
    assertEquals(25, result);
  }
  @Test
  void findTheGreatestFromAllData_oneValue() {
    DataService dataServiceMock = mock(DataService.class);
    when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 35 });
    SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
    int result = businessImpl.findTheGreatestFromAllData();
    assertEquals(35, result);
  }
}
