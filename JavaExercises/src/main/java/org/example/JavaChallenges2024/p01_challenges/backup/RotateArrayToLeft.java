package org.example.JavaChallenges2024.p01_challenges.backup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    rotate 3 to left
    {4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3}

 */
public class RotateArrayToLeft {

    public int[] rotateArray(int[] arr, int movs) {

        int[] newArray = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            int newPosition = i - movs;
            if (newPosition < 0) {
                newPosition = arr.length + newPosition;
            }
            newArray[newPosition] = arr[i];
            System.out.println("New position: " + newPosition);

        }
        System.out.println(Arrays.toString(newArray));

        return  newArray;
    }

    public List<Integer> rotateList1(List<Integer> listValues, int movs) {

        List<Integer> newList = new ArrayList<>(listValues.size());
        for (int i = 0; i < listValues.size(); i++) {
            newList.add(0);
        }

        for (int i = listValues.size()-1; i >= 0; i--) {
            int newPosition = i - movs;
            if (newPosition < 0) {
                newPosition = listValues.size() + newPosition;
            }
            System.out.println("New position: " + newPosition);
            newList.set(newPosition, listValues.get(i));
        }
        return newList;

    }

    public List<Integer> rotateList(List<Integer> listValues, int movs) {

        List<Integer> newList = new ArrayList<>(listValues.size());

        for (int i = 0; i < listValues.size(); i++) {
            int oldPosition = i + movs;
            if (oldPosition > listValues.size()-1) {
                oldPosition = oldPosition - listValues.size();
            }
            System.out.println("New position: " + oldPosition);
            newList.add(i, listValues.get(oldPosition));
        }
        return newList;

    }
}
