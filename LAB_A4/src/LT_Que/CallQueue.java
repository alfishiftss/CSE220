package LT_Que;

//YOU NEED TO ONLY WRITE THE FOLLOWING METHODS
// enqueueCall()
// dequeueCall()
// displayQueue()
// Inside of these methods you need to utilize the objects of LinkedListQueue class
// vipQueue and regularQueue objects are already created for you
class CallQueue {

    private LinkedListQueue vipQueue;
    // VIP queue
    private LinkedListQueue regularQueue;
    // Regular queue

    //DO NOT CHANGE THIS CONSTRUCTOR
    public CallQueue() {
        this.vipQueue = new LinkedListQueue();
        this.regularQueue = new LinkedListQueue();
    }

    //You have to write this method
    public void enqueueCall(int customerId, boolean isVip) {
         if(isVip ){
             vipQueue.enqueue(customerId);

         }else{
             regularQueue.enqueue(customerId);
         }
    }

    //You have to write this method
    public void dequeueCall() {
        if(!vipQueue.isEmpty()){
            vipQueue.dequeue();
        }else if(!regularQueue.isEmpty()){
            regularQueue.dequeue();
        }
    }

    //You have to write this method
    public void displayQueue() {

          while(!vipQueue.isEmpty()){
              System.out.println("these are vips");
          }
          while( !regularQueue.isEmpty()){
              System.out.println("these are regulars");
          }
    }

}
