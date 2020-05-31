package task1;

public class context {
    private characters characterStrategy;

    public context (characters characterStrategy){
        this.characterStrategy = characterStrategy;
    }

    public characters getCharacterStrategy() {
        return characterStrategy;
    }

    public void setCharacterStrategy(characters characterStrategy) {
        this.characterStrategy = characterStrategy;
    }

    public void demo(){
        this.characterStrategy.execute();
    }
}
