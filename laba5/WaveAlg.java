import java.util.ArrayList;
class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

}
public class WaveAlg {
    public static void main(String[] args){
        int[][] map = new int[][]{
            {0,0,0,0,1,0,0,0,0,0},
            {0,1,0,0,0,1,1,0,0,0},
            {0,1,0,0,0,0,0,1,0,0},
            {0,0,0,1,0,1,0,0,0,0},
            {0,0,0,1,0,0,0,1,0,0},
            {0,0,0,1,1,0,0,0,0,0},
            {0,0,1,0,0,0,0,1,1,0},
            {0,0,0,0,0,1,0,0,1,0},
            {0,1,1,0,0,0,0,1,1,0},
            {0,1,0,0,0,0,0,0,1,0},
        };
        for (int i=0;i<map.length;i++){
            for (int j=0;j<map[i].length;j++){
                map[i][j] = -1*map[i][j]-1;
            }
        }
        print(map);
        findPath(1, 1, 9, 9, map);
    }
    private static void print(int[][] map){
        for (int i=0;i<map.length;i++){
            for (int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static ArrayList<Point> findPath(int x, int y,int tx, int ty, int[][] map){
        ArrayList<Point> wave = new ArrayList<>();
        if(map[y][x]!=1 || map[ty][tx]==-1){
            System.out.println("Стоит стенка");
            return wave;
        }
        ArrayList<Point> oldWave = new ArrayList<>();
        int count = 0;
        map[y][x] = count;
        wave.add(new Point(x,y));
        int[] dx = new int[]{0,0,-1,1};
        int[] dy = new int[]{-1,1,0,0};
        boolean isExist = false;
        out:
        while(!wave.isEmpty()){
            count++;
            for(Point p: wave){
                for (int i=0; i<dx.length;i++){
                    int cx = p.getX() + dx[i];
                    int cy = p.getY() + dy[i];
                    if(cx>=0 && cy>=0 && cy<map.length && cx< map[0].length){
                        if(map[cy][cx] == -1){
                            map[cy][cx] = count;
                            oldWave.add(new Point(cx, cy));
                            if (cx==tx && cy ==ty){
                                isExist = true;
                                break out;
                            }
                        }
                    }
                }
            }
            wave = new ArrayList<>(oldWave);
            oldWave.clear();
        }
        print(map);
        //////////////////
        wave.clear();
        if (!isExist){
            System.out.println("Нет пути");
            return wave;
        }
        wave.add(new Point(tx,ty));
        while(map[ty][tx]!=0 ){
            for (int i=0; i<dx.length;i++){
                    int cx = tx + dx[i];
                    int cy = ty + dy[i];
                    if(cx>=0 && cy>0 && cy<map.length && cx< map[0].length){
                        if(map[ty][tx]-1== map[cy][cx]){
                            tx = cx;
                            ty = cy;
                            wave.add(new Point(cx,cy));
                        }
                    }
                }
            }
        for(Point p: wave){
            System.out.println(p.getX() +", " +p.getY());
            map[p.getY()][p.getX()]=0;
        }
        print(map);
        return null;
    }
}