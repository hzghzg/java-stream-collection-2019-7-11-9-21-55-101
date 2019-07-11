package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
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
        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
