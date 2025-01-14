package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        /*if(leftBorder>rightBorder){
            int m=rightBorder;
            rightBorder=leftBorder;
            leftBorder=m;
        }
        List<Integer> input=new ArrayList<>();
        for (int i = leftBorder; i <= rightBorder; i++) {
            input.add(i);
        }
        return input.stream().filter(item->item%2==0).mapToInt(item->item).sum();*/
        return IntStream.rangeClosed(Math.min(leftBorder,rightBorder),Math.max(leftBorder,rightBorder)).boxed().collect(Collectors.toList()).stream().filter(item->item%2==0).mapToInt(item->item).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(item->item*3+2).mapToInt(item->item).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return  arrayList.stream().map(item->item%2!=0?(item*3+2):item).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
       return arrayList.stream().filter(item->item%2==0).mapToInt(item->item).average().orElse(0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().distinct().filter(item->item%2==0).collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();;
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
