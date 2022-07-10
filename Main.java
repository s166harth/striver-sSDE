import java.util.PriorityQueue;

class KthLargest {
    int k;
    PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(k);
        for(int i=0;i<nums.length;i++)
        {
            add(nums[i]);
        }

    }
    
    public int add(int val) {
        if(pq.size()<k)
        {
            pq.add(val);
        }
        else
        {
            pq.add(val);
            pq.poll();
        }
        return pq.peek();
    }
}
