package com.company.february_01_2022;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

    /* This class fulfills the requirements for the challenge in the link below
        https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem
    */
public class OrganizingBalls {

    public static String organizingContainers(List<List<Integer>> container) {
        int[] rowSums = new int[container.size()];
        int[] columnSums = new int[container.size()];

        for (int row = 0; row < container.size(); row++) {
            List<Integer> currentRow = container.get(row);
            for (int col = 0; col < currentRow.size(); col++) {
                int currentCell = currentRow.get(col);
                rowSums[row] += currentCell;
                columnSums[col] += currentCell;
            }
        }
        Arrays.sort(rowSums);
        Arrays.sort(columnSums);


        return Arrays.equals(rowSums, columnSums) ? "Possible" : "Impossible";

    }


    public static void main(String[] args) {
        //Test comment
    }

}
