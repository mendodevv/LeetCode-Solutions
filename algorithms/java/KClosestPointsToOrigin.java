class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>
        ((a, b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]));

        int[][] output = new int[k][2];

        for(int i = 0; i <= points.length - 1; i++){
            minHeap.offer(points[i]);
        }

        for(int i = 0; i < k; i++) {
            output[i] = minHeap.poll();
        }
        return output;
    }
}
