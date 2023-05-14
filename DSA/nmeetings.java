import java.util.*;

class meeting {
    int start, pos, end;

    meeting(int start, int pos, int end) {
        this.start = start;
        this.pos = pos;
        this.end = end;
    }
}

class meetingComparator implements Comparator<meeting> {

    @Override
    public int compare(meeting a, meeting b) {

        if (a.end < b.end)
            return -1;
        else if (a.end > b.end)
            return 1;
        else if (a.pos < b.pos)
            return -1;

        return 1;
    }
}

public class nmeetings {
    public static void meetings(int n, int start[], int end[]) {

        ArrayList<meeting> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            al.add(new meeting(start[i], i + 1, end[i]));
        }
        Collections.sort(al, new meetingComparator());

        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(al.get(0).pos);
        int limit = al.get(0).end;

        for (int i = 1; i < start.length; i++) {
            if (al.get(i).start > limit) {
                limit = al.get(i).end;
                answer.add(al.get(i).pos);
            }
        }

        System.out.println("Maximum no. of meetings possible: ");
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }

    }

    public static void main(String[] args) {
        int n = 6;
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 5, 7, 9, 9 };

        meetings(n, start, end);
    }
}