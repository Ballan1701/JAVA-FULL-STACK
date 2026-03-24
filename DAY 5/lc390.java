public class lc390 {
    public int lastRemaining(int n) {
        int head =1;
        int diff =1;
        int remain = n;
        boolean left = true;
        while(remain > 1){
        if(left || (remain%2 == 1))
        {
            head = head+diff;
        }
        remain = remain/2;
        diff = 2*diff;
        left = !left;
        }
        return head;
    }
}


/*
1.start -> change only if (l->r) or odd no of elements
2.At the end of loop remaining elements become half
3.step become 2x at the end of loop
4.l->r become r->l at the end of loop
5. return start
*/
