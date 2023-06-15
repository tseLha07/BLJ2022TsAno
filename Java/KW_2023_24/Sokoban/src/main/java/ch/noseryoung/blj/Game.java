package ch.noseryoung.blj;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Game {

    private int[][] gameField;
    private Point personPosition;
    private List<Point> goalPos;

    public Game() {
        this(new int[][] {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
                { 1, 4, 4, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1 },
                { 1, 4, 4, 0, 0, 1, 0, 3, 0, 0, 3, 0, 0, 1 },
                { 1, 4, 4, 0, 0, 1, 3, 1, 1, 1, 1, 0, 0, 1 },
                { 1, 4, 4, 0, 0, 0, 0, 2, 0, 1, 1, 0, 0, 1 },
                { 1, 4, 4, 0, 0, 1, 0, 1, 0, 0, 3, 0, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 0, 1, 1, 3, 0, 3, 0, 1 },
                { 0, 0, 1, 0, 3, 0, 0, 3, 0, 3, 0, 3, 0, 1 },
                { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 },
                { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        });
    }

    public Game(int[][] board){
        gameField = board;
        elementsPos();
    }

    public void elementsPos(){
        goalPos = new ArrayList<>();
        for(int col = 0; col < gameField.length; col++){
            for(int row = 0; row < gameField.length; row++){
                switch (gameField[col][row]) {
                    case 2 -> {
                        personPosition = new Point(col, row);
                    }
                    case 4 -> goalPos.add(new Point(col, row));
                }
            }
        }
    }

    public void checkGoalPos(){
        for(Point goalPosition : goalPos){
            if(gameField[goalPosition.x][goalPosition.y] == 0){
                gameField[goalPosition.x][goalPosition.y] = 4;
            }
        }
    }

    public boolean winState(){
        int counter = 0;
        for(Point goalPosition : goalPos){
            if(gameField[goalPosition.x][goalPosition.y] == 3){
                counter++;
                if(counter == goalPos.size()){
                    System.out.println("Yay! You Won!");
                    //System.exit(0);
                }
            }
        }return true;
    }

    public void moveUp() {
        try {
            if (gameField[personPosition.x - 1][personPosition.y] == 3 && gameField[personPosition.x - 2][personPosition.y] == 1) {
                gameField[personPosition.x][personPosition.y] = 2;
                System.out.println("Cannot go UP anymore");
            } else if (gameField[personPosition.x - 1][personPosition.y] == 3 && gameField[personPosition.x - 2][personPosition.y] == 3) {
                gameField[personPosition.x][personPosition.y] = 2;
                System.out.println("Cannot go UP anymore");
            } else if (gameField[personPosition.x - 1][personPosition.y] != 1 && gameField[personPosition.x - 1][personPosition.y] != 3) {
                gameField[personPosition.x][personPosition.y] = 0;
                personPosition.x--;
                gameField[personPosition.x][personPosition.y] = 2;
                System.out.println("UP");
            } else if (gameField[personPosition.x - 1][personPosition.y] != 1 && gameField[personPosition.x - 1][personPosition.y] == 3) {
                gameField[personPosition.x][personPosition.y] = 0;
                personPosition.x--;
                gameField[personPosition.x][personPosition.y] = 2;
                gameField[personPosition.x - 1][personPosition.y] = 3;
                System.out.println("UP");
            } else {
                System.out.println("Cannot go UP anymore");
            }
            checkGoalPos();
            winState();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e + ", There is no way else to go!");
        }
    }

    public void moveDown() {
        try {
            if (gameField[personPosition.x + 1][personPosition.y] == 3 && gameField[personPosition.x + 2][personPosition.y] == 1) {
                gameField[personPosition.x][personPosition.y] = 2;
                System.out.println("Cannot go DOWN anymore");
            } else if (gameField[personPosition.x + 1][personPosition.y] == 3 && gameField[personPosition.x + 2][personPosition.y] == 3) {
                gameField[personPosition.x][personPosition.y] = 2;
                System.out.println("Cannot go DOWN anymore");
            } else if (gameField[personPosition.x + 1][personPosition.y] != 1 && gameField[personPosition.x + 1][personPosition.y] != 3) {
                gameField[personPosition.x][personPosition.y] = 0;
                personPosition.x++;
                gameField[personPosition.x][personPosition.y] = 2;
                System.out.println("DOWN");
            } else if (gameField[personPosition.x + 1][personPosition.y] != 1 && gameField[personPosition.x + 1][personPosition.y] == 3) {
                gameField[personPosition.x][personPosition.y] = 0;
                personPosition.x++;
                gameField[personPosition.x][personPosition.y] = 2;
                gameField[personPosition.x + 1][personPosition.y] = 3;
                System.out.println("DOWN");
            } else {
                System.out.println("Cannot go DOWN anymore");
            }
            checkGoalPos();
            winState();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e + ", There is no way else to go!");
        }
    }

    public void moveLeft() {
        boolean isGreen = true;
        int oldX = personPosition.x;
        int oldY = personPosition.y;
        try {
            if (gameField[personPosition.x][personPosition.y - 1] == 3 && gameField[personPosition.x][personPosition.y - 2] == 1) {
                gameField[personPosition.x][personPosition.y] = 2;
                System.out.println("Cannot go LEFT anymore");
            } else if (gameField[personPosition.x][personPosition.y - 1] == 3 && gameField[personPosition.x][personPosition.y - 2] == 3) {
                gameField[personPosition.x][personPosition.y] = 2;
                System.out.println("Cannot go LEFT anymore");
            } else if (gameField[personPosition.x][personPosition.y - 1] != 1 && gameField[personPosition.x][personPosition.y - 1] != 3) {
                gameField[personPosition.x][personPosition.y] = 0;
                personPosition.y--;
                gameField[personPosition.x][personPosition.y] = 2;
                System.out.println("LEFT");
            } else if (gameField[personPosition.x][personPosition.y - 1] != 1 && gameField[personPosition.x][personPosition.y - 1] == 3) {
                gameField[personPosition.x][personPosition.y] = 0;
                personPosition.y--;
                gameField[personPosition.x][personPosition.y] = 2;
                gameField[personPosition.x][personPosition.y - 1] = 3;
                System.out.println("LEFT");
            } else {
                System.out.println("Cannot go LEFT anymore");
            }
            checkGoalPos();
            winState();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e + ", There is no way else to go!");
        }
    }

    public void moveRight() {
        try {
            if (gameField[personPosition.x][personPosition.y + 1] == 3 && gameField[personPosition.x][personPosition.y + 2] == 1) {
                gameField[personPosition.x][personPosition.y] = 2;
                System.out.println("Cannot go RIGHT anymore");
            } else if (gameField[personPosition.x][personPosition.y + 1] == 3 && gameField[personPosition.x][personPosition.y + 2] == 3) {
                gameField[personPosition.x][personPosition.y] = 2;
                System.out.println("Cannot go RIGHT anymore");
            } else if (gameField[personPosition.x][personPosition.y + 1] != 1 && gameField[personPosition.x][personPosition.y + 1] != 3) {
                gameField[personPosition.x][personPosition.y] = 0;
                personPosition.y++;
                gameField[personPosition.x][personPosition.y] = 2;
                System.out.println("RIGHT");
            } else if (gameField[personPosition.x][personPosition.y + 1] != 1 && gameField[personPosition.x][personPosition.y + 1] == 3) {
                gameField[personPosition.x][personPosition.y] = 0;
                personPosition.y++;
                gameField[personPosition.x][personPosition.y] = 2;
                gameField[personPosition.x][personPosition.y + 1] = 3;
                System.out.println("RIGHT");
            } else {
                System.out.println("Cannot go RIGHT anymore");
            }
            checkGoalPos();
            winState();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e + ", There is no way else to go!");
        }
    }

    public void escAction() {
        System.out.println("ESC");
        System.exit(0);
    }

    public void restartAction() {
        System.out.println("Restart");
        restartAction();
    }


    public int[][] getField() {
        return gameField;
    }

    public int getColCount() {
        return gameField.length;
    }

    public int getRowCount() {
        return gameField[0].length;
    }
}

