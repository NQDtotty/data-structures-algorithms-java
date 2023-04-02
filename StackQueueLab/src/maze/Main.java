/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maze;

/**
 *
 * @author NQDtotty
 */
public class Main {
    
    public static void main(String[] args){
        String filename = "maze01.txt";
        Maze_V2 maze = new Maze_V2 ('E', 'M', '0', '1');
        maze.loadFromFile(filename);
        maze.print();
        maze.solve();
        if(maze.succeeded){
            System.out.println("Result path: ");
            System.out.println(maze.getPath());
        }
        else System.out.println("Failed!");
    }
    
}
