package com.testspringonly.testwebSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearch(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int BinarySearchs(int numbers[], int item){
        BubbleSortAlogorithm BinarySearchObj = new BubbleSortAlogorithm();
        int []getSort= BinarySearchObj.sort(numbers);
        System.out.println(sortAlgorithm);
        return item;
    }
}
