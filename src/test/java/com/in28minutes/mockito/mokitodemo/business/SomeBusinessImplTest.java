package com.in28minutes.mockito.mokitodemo.business;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {
    @Test
    void test(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        businessImpl.findTheGreatestFromAllData();
    }
}

class DataServiceStub implements DataService{
    @Override
    public int[] retrieveAllData(){
        return new int[] {25,15,5};
    }
}
