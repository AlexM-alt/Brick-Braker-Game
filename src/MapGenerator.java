import java.awt.*;

public class MapGenerator {
    public int map[][];
    public int bricWidth;
    public int bricHight;
    public MapGenerator(int row, int col){
        map = new int[row][col];
        for (int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                map[i][j] = 1;
            }
        }

        bricWidth = 540/col;
        bricHight = 150/row;
    }

    public void draw(Graphics2D g){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] > 0){
                    g.setColor( Color.white );
                    g.fillRect( j * bricWidth + 80, i * bricHight + 50, bricWidth, bricHight );

                    g.setStroke( new BasicStroke(3) );
                    g.setColor( Color.BLACK );
                    g.drawRect( j * bricWidth + 80, i * bricHight + 50, bricWidth, bricHight );

            }
        }
            }
    }

    public void setBrickValue(int value, int row, int col){
        map[row][col] = value;
    }
}
