class MedianFinder {
private PriorityQueue<Integer> maxheap;
  private PriorityQueue<Integer> minheap;  
    public MedianFinder()
    {
        maxheap=new PriorityQueue<>((a, b) -> b - a);
        minheap=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxheap.add(num);
        if(maxheap.size()>minheap.size()+1)
        {
            minheap.add(maxheap.poll());
        }
        if(!minheap.isEmpty() && maxheap.peek()>minheap.peek())
        {
            maxheap.add(minheap.poll());
             minheap.add(maxheap.poll());
        }
        
    }
    
    public double findMedian() {
        if(maxheap.size()>minheap.size())
        {
            return maxheap.peek();
        }
        else
        {
            return (maxheap.peek() + minheap.peek()) / 2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */