
package week4hmw2;

public class GameManager implements GameService{

    @Override
    public void add(Game game) {
        System.out.println(game.getName() + " oyunu sisteme eklendi. ");
    }

    
     
}
