package src;

public class Transition {
    private State currentState;
    private char symbol;
    private State nextState;

    public Transition(State currentState, State nextState, char symbol) {
        this.currentState = currentState;
        this.nextState = nextState;
        this.symbol = symbol;
    }
    public State getCurrentState() {
        return currentState;
    }
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
    public State getNextState() {
        return nextState;
    }
    public void setNextState(State nextState) {
        this.nextState = nextState;
    }
    public char getSymbol() {
        return symbol;
    }
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

}
