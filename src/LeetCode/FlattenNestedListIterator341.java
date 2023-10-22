package LeetCode;

import java.util.*;

public class FlattenNestedListIterator341 {
    public FlattenNestedListIterator341() {
    }


    public interface NestedInteger {
        public boolean isInteger();

        public Integer getInteger();

        public List<NestedInteger> getList();
    }

    /**
     * // This is the interface that allows for creating nested lists.
     * // You should not implement it, or speculate about its implementation
     * public interface NestedInteger {
     * <p>
     * // @return true if this NestedInteger holds a single integer, rather than a nested list.
     * public boolean isInteger();
     * <p>
     * // @return the single integer that this NestedInteger holds, if it holds a single integer
     * // Return null if this NestedInteger holds a nested list
     * public Integer getInteger();
     * <p>
     * // @return the nested list that this NestedInteger holds, if it holds a nested list
     * // Return empty list if this NestedInteger holds a single integer
     * public List<NestedInteger> getList();
     * }
     */
    public static class NestedIterator implements Iterator<Integer> {
        private ArrayList<Integer> flatArrayList;
        private int currentIndex;


        public NestedIterator(List<NestedInteger> nestedList) {
            currentIndex = 0;
            this.flatArrayList = new ArrayList<>();
            for (NestedInteger tmp : nestedList) {
                flattenList(tmp);
            }

        }

        public void flattenList(NestedInteger nestedInteger) {
            if (nestedInteger.isInteger()) {
                flatArrayList.add(nestedInteger.getInteger());
            } else {
                for (NestedInteger tmp : nestedInteger.getList()) {
                    flattenList(tmp);
                }
            }

        }

        @Override
        public Integer next() {
            Integer tmp = flatArrayList.get(currentIndex);
            currentIndex++;
            return tmp;

        }

        @Override
        public boolean hasNext() {
            return currentIndex < flatArrayList.size();
        }


    }

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
}
