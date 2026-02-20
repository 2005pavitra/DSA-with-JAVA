package SegmentTrees;

import javax.swing.text.Segment;

public class SegmentTree {
    int[] tree;
    int n;

    public SegmentTree(int[] arr){
        n = arr.length;
        tree = new int[4*n];
        build(arr, 0, 0, n-1);
    }

    private void build(int[] arr, int node, int start, int end){
        if(start == end){
            tree[node]= arr[start];
            return;
        }

        int mid = (start+end)/2;
        build(arr, 2*node+1, start, mid);
        build(arr, 2*node+2, mid+1, end);

        tree[node] = tree[2*node+1]+tree[2*node+2];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        SegmentTree seg = new SegmentTree(arr);


    }

}
