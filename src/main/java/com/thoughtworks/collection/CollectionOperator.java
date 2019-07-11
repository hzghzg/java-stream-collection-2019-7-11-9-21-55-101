package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> input=new ArrayList<>();
        if(left>right){
            for (int i = left; i>=right; i--) {
                input.add(i);
            }
        }
        else{
            for (int i = left; i <=right; i++) {
                input.add(i);
            }
        }
        return input;

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> input=new ArrayList<>();
        if(left>right){
            for (int i = left; i>=right; i--) {
                input.add(i);
            }
        }
        else{
            for (int i = left; i <=right; i++) {
                input.add(i);
            }
        }
        return input.stream().filter(item->item%2==0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        Integer[] input=new Integer[array.length];
        for (int i = 0; i <array.length ; i++) {
            Integer integer=array[i];
            input[i]=integer;
        }
        List<Integer> inputList= Arrays.asList(input);
        return inputList.stream().filter(item->item%2==0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
