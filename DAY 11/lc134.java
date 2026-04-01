public class lc134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gassum=0,costsum=0,tot=0;
        int start=0;
        if(gas.length != cost.length) return -1;
        for(int i=0;i<gas.length;i++){
            gassum += gas[i];
            costsum += cost[i];
            tot += gas[i]-cost[i];
            if(tot < 0){
                start = i+1;
                tot = 0;
            }
        }
        return (gassum >= costsum)?start:-1;
    }
}
