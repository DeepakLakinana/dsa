package strings;

public class shortestpath {
    public static int shortest_distance(String str){ 
        int x =0,y=0;
        for(int i=0;i<str.length();i++){ 
            if(str.charAt(i)=='N'){ 
                y++;
            }
            else if(str.charAt(i)=='S'){ 
                y--;
            }
            else if(str.charAt(i)=='E'){ 
                x++;
            }
            else if(str.charAt(i)=='W'){ 
                x++;
            }
            else{ 
                System.out.println("not valid");
                return 0;
            }
        }
        int x2 = (int)Math.pow(x, 2);
        int y2 = (int)Math.pow(y,2);
        return (int)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("The shortest distance is =" + shortest_distance(str));
    }
}
