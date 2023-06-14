package ch.noseryoung.blj.test;

import ch.noseryoung.blj.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SokobanTests {
    
    @Test
    public void moveUp_PlayerMovesUp(){
        var board = new Game(new int[][]{
                {0, 0, 0},
                {0, 2, 0},
                {0, 0, 0}
        });
        board.moveUp();
        assertEquals(0, board.getField()[1][1]);
        assertEquals(2, board.getField()[0][1]);

    }

    @Test
    public void moveUp_PlayerCantMoveUP_Wall(){
        var board = new Game(new int[][]{
                {1, 1, 1},
                {1, 2, 1},
                {1, 1, 1}
        });
        board.moveUp();
        assertEquals(2, board.getField()[1][1]);
    }

    @Test
    public void moveUp_PlayerMoveUP_ToGoalPos(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 4, 0, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveUp();
        assertEquals(0, board.getField()[3][2]);
        assertEquals(2, board.getField()[2][2]);
    }

    @Test
    public void moveUp_PlayerMoveUP_FromGoalPos(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 4, 0, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveUp();
        assertEquals(0, board.getField()[3][2]);
        assertEquals(2, board.getField()[2][2]);
        board.moveUp();
        assertEquals(4, board.getField()[2][2]);
    }

    @Test
    public void moveUp_PlayerMoveUP_1xBox(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveUp();
        assertEquals(0, board.getField()[3][2]);
        assertEquals(2, board.getField()[2][2]);
        assertEquals(3, board.getField()[1][2]);
    }

    @Test
    public void moveUp_PlayerMoveUP_2xBox(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveUp();
        assertEquals(2, board.getField()[3][2]);
        assertEquals(3, board.getField()[2][2]);
        assertEquals(3, board.getField()[1][2]);
    }

    @Test
    public void moveUp_PlayerMoveUP_1Box_1Wall(){
        var board = new Game(new int[][]{
                {0, 0, 1, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveUp();
        assertEquals(2, board.getField()[2][2]);
        assertEquals(3, board.getField()[1][2]);
        assertEquals(1, board.getField()[0][2]);
    }

    @Test
    public void moveUp_PlayerMoveUP_1Box_GoalPos(){
        var board = new Game(new int[][]{
                {0, 0, 4, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveUp();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[1][2]);
        assertEquals(3, board.getField()[0][2]);
    }

    @Test
    public void moveDown_PlayerMovesDown(){
        var board = new Game(new int[][]{
                {0, 0, 0},
                {0, 2, 0},
                {0, 0, 0}
        });
        board.moveDown();
        assertEquals(0, board.getField()[1][1]);
        assertEquals(2, board.getField()[2][1]);

    }

    @Test
    public void moveDown_PlayerCantMoveDown_Wall(){
        var board = new Game(new int[][]{
                {1, 1, 1},
                {1, 2, 1},
                {1, 1, 1}
        });
        board.moveDown();
        assertEquals(2, board.getField()[1][1]);
    }

    @Test
    public void moveDown_PlayerMoveDown_ToGoalPos(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 4, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveDown();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[3][2]);
    }

    @Test
    public void moveDown_PlayerMoveDown_FromGoalPos(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 4, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveDown();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[3][2]);
        board.moveDown();
        assertEquals(4, board.getField()[3][2]);
    }

    @Test
    public void moveDown_PlayerMoveDown_1Box(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveDown();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[3][2]);
        assertEquals(3, board.getField()[4][2]);
    }

    @Test
    public void moveDown_PlayerMoveDown_2xBox(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveDown();
        assertEquals(2, board.getField()[1][2]);
        assertEquals(3, board.getField()[2][2]);
        assertEquals(3, board.getField()[3][2]);
    }

    @Test
    public void moveDown_PlayerMoveDown_1Box_1Wall(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 1, 0, 0}
        });
        board.moveDown();
        assertEquals(2, board.getField()[2][2]);
        assertEquals(3, board.getField()[3][2]);
        assertEquals(1, board.getField()[4][2]);
    }

    @Test
    public void moveDown_PlayerMoveDown_1Box_GoalPos(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 4, 0, 0}
        });
        board.moveDown();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[3][2]);
        assertEquals(3, board.getField()[4][2]);
    }

    @Test
    public void moveLeft_PlayerMovesLeft(){
        var board = new Game(new int[][]{
                {0, 0, 0},
                {0, 2, 0},
                {0, 0, 0}
        });
        board.moveLeft();
        assertEquals(0, board.getField()[1][1]);
        assertEquals(2, board.getField()[1][0]);

    }

    @Test
    public void moveLeft_PlayerCantMoveLeft_Wall(){
        var board = new Game(new int[][]{
                {1, 1, 1},
                {1, 2, 1},
                {1, 1, 1}
        });
        board.moveLeft();
        assertEquals(2, board.getField()[1][1]);
    }

    @Test
    public void moveLeft_PlayerMoveLeft_ToGoalPos(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 4, 2, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveLeft();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[2][1]);
    }

    @Test
    public void moveLeft_PlayerMoveLeft_FromGoalPos(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 4, 2, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveLeft();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[2][1]);
        board.moveLeft();
        assertEquals(4, board.getField()[2][1]);
    }

    @Test
    public void moveLeft_PlayerMoveLeft_1Box(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 3, 2, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveLeft();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[2][1]);
        assertEquals(3, board.getField()[2][0]);
    }

    @Test
    public void moveLeft_PlayerMoveLeft_2xBox(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 3, 3, 2, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveLeft();
        assertEquals(2, board.getField()[1][3]);
        assertEquals(3, board.getField()[1][2]);
        assertEquals(3, board.getField()[1][1]);
    }

    @Test
    public void moveLeft_PlayerMoveLeft_1Box_1Wall(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 3, 2, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveLeft();
        assertEquals(2, board.getField()[2][2]);
        assertEquals(3, board.getField()[2][1]);
        assertEquals(1, board.getField()[2][0]);
    }

    @Test
    public void moveLeft_PlayerMoveLeft_1Box_GoalPos(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {4, 3, 2, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveLeft();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[2][1]);
        assertEquals(3, board.getField()[2][0]);
    }

    @Test
    public void moveRight_PlayerMovesRight(){
        var board = new Game(new int[][]{
                {0, 0, 0},
                {0, 2, 0},
                {0, 0, 0}
        });
        board.moveRight();
        assertEquals(0, board.getField()[1][1]);
        assertEquals(2, board.getField()[1][2]);

    }

    @Test
    public void moveRight_PlayerCantMoveRight_Wall(){
        var board = new Game(new int[][]{
                {1, 1, 1},
                {1, 2, 1},
                {1, 1, 1}
        });
        board.moveRight();
        assertEquals(2, board.getField()[1][1]);
    }

    @Test
    public void moveRight_PlayerMoveRight_ToGoalPos(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 2, 4, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveRight();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[2][3]);
    }

    @Test
    public void moveRight_PlayerMoveRight_FromGoalPos(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 2, 4, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveRight();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[2][3]);
        board.moveRight();
        assertEquals(4, board.getField()[2][3]);
    }

    @Test
    public void moveRight_PlayerMoveRight_1Box(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 2, 3, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveRight();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[2][3]);
        assertEquals(3, board.getField()[2][4]);
    }

    @Test
    public void moveRight_PlayerMoveRight_2xBox(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 2, 3, 3, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveRight();
        assertEquals(2, board.getField()[1][1]);
        assertEquals(3, board.getField()[1][2]);
        assertEquals(3, board.getField()[1][3]);
    }

    @Test
    public void moveRight_PlayerMoveRight_1Box_1Wall(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 2, 3, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveRight();
        assertEquals(2, board.getField()[2][2]);
        assertEquals(3, board.getField()[2][3]);
        assertEquals(1, board.getField()[2][4]);
    }

    @Test
    public void moveRight_PlayerMoveRight_1Box_GoalPos(){
        var board = new Game(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 2, 3, 4},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
        board.moveRight();
        assertEquals(0, board.getField()[2][2]);
        assertEquals(2, board.getField()[2][3]);
        assertEquals(3, board.getField()[2][4]);
    }

}
