class MedianFinder {

    PriorityQueue<Integer> left;//max heap
    PriorityQueue<Integer> right;
    public MedianFinder() {
        left=new PriorityQueue<>(Collections.reverseOrder());
        right=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        left.add(num);
        right.add(left.remove());

        while(right.size()>left.size()){
            left.add(right.remove());
        }
    }
    
    public double findMedian() {
        if(left.size()>right.size()){
            return left.peek();
        }
        return (left.peek()+right.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

//  class MedianFinder {

//     ArrayList<Integer> list;

//     public MedianFinder() {
//         list=new ArrayList<>();
//     }
    
//     public void addNum(int num) {
//         int idx=findpos(list,num);
//         list.add(idx,num);
//     }
//     private int findpos(ArrayList<Integer> list,int num){
//         int left=0;
//         int right=list.size()-1;
//         while(left<=right){
//             int mid=left+(right-left)/2;
//             if(list.get(mid)<num){
//                 left=mid+1;
//             }else{
//                 right=mid-1;
//             }
//         }
//         return left;
//     }
    
//     public double findMedian() {
        
//         int n=list.size();
//         if(n%2==1) return list.get(n/2);
//         return (list.get(n/2)+list.get(n/2-1))/2.0;
//     }
// }

