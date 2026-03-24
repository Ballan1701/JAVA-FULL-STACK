public class lc1041 {
    public boolean isRobotBounded(String instructions) {
    int x=0;
    int y=0;
    int dir = 0;
    for(char ch:instructions.toCharArray())
    {
        if(ch == 'G')
        {
            if(dir == 0) y++; //NORTH
            else if(dir == 1) x++;//EAST
            else if(dir == 2) y--;//SOUTH
            else x--; //WEST
        }
        else if(ch == 'L')
        {
            dir = (dir+3)%4; // TO MOVE DIRECTION BY LEFT BY ANTI-CLOCK WISE TAKES 3 STEPS 
        }
        else if(ch == 'R')
        {
            dir = (dir+1)%4;
        }
    }

    if(dir != 0) return true;
    return (x==0 && y==0)?true:false;
    }
}

/*
               N(0)
                ^
                |
                |
    W(3) <--------------> E(1)
                |
                |
                v
                S(2)


class Solution {
    public boolean isRobotBounded(String instructions) {
        int x=0,y=0;
        
        char dir='N';
        for(char ch:instructions.toCharArray()){
            if(ch=='G'){
              if(dir=='N'){
                y=y+1;
              }
               if(dir=='S'){
                y=y-1;
              }
              if(dir=='E'){
                x=x+1;
              }
              if(dir=='W'){
                x=x-1;
              }             
            }

            else if(ch=='R'){
                switch(dir){
                    case 'N':
                       dir='E'; break;
                     case 'S':
                       dir='W'; break;
                     case 'E':
                       dir='S'; break;
                     case 'W':
                       dir='N'; break;
                }
            }
            else{
                switch(dir){
                    case 'N':
                       dir='W'; break;
                     case 'S':
                       dir='E'; break;
                     case 'E':
                       dir='N'; break;
                     case 'W':
                       dir='S'; break;
                }  
            }
        }
        if(dir!='N')
            return true;

        return x==0&&y==0?true:false;
    }
}
*/
