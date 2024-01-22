package com.in28minutes.mockito.mokitodemo.business;

public class SomeBusinessImpl {

  private DataService dataService;

  public int findTheGreatestFromAllData() {
    int[] data = dataService.retrieveAllData();
    int greatestValue = Integer.MIN_VALUE;
    for(int value : data){
        if(greatestValue<value){
            greatestValue=value;
        }
    }
    return greatestValue;
  }
}

interface DataService {
  int[] retrieveAllData();
}
