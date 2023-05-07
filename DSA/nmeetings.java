import java.util.*;

class meetings{
    int start;
    int end;
    int pos;

    meetings(int start, int end, int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class meetingComparator implements Comparator<meetings>{

    @Override
    public int compare(meetings o1, meetings o2){
        if(o1.end < o2.end){
            return -1;
        }
        else if(o1.end > o2.end){
            return 1;
        }
        else if(o1.pos<o2.pos){
            return -1;
        }
        else{
            return 1;
        }
    }

}

public class nmeetings{
     static void maxMeetings(int[] start, int[] end){

        ArrayList<meetings> meet = new ArrayList<>();
        for(int i=0;i<start.length;i++){
            meet.add(new meetings(start[i],end[i],i+1));
        }
        
        meetingComparator mc = new meetingComparator();
        Collections.sort(meet,mc);
        
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for(int i=1;i<start.length;i++){
            if(meet.get(i).start>limit){
                answer.add(meet.get(i).pos);
                limit = meet.get(i).end;
            }
        }

        System.out.println("Order of performing meetings: ");
        for(int i=0;i<answer.size();i++){
            System.out.print(answer.get(i)+" ");
        }
     }

     public static void main(String args[]){
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,5,7,9,9};
        maxMeetings(start, end);
     }
}