package playerInfo;

public class Player {
   private String name;
   private int score;
   public Player(String name, int score) {
      this.name = name;
      this.score=score;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return name;
   }

   public int getScore() {
      return score;
   }

   public void setScore(int score) {
      this.score = score;
   }
}
