public class Hangman {
    private int version = 0;

    public Hangman(){
        version = (int) ((Math.random()*3)+1);
        if (version == 1){
            
        } else if (version == 2){
            
        } else if (version == 3){
             
        }
    }

    public int getVersion(){
        return version;
    }






}
