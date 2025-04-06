package src;

public class State {
    private String name;
    private boolean isInitialState;
    private boolean isFinalState;

    public State(String name) {
        this.setName(name);
        this.setInitialState(false);
        this.setFinalState(false);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInitialState() {
        return isInitialState;
    }

    public void setInitialState(boolean initialState) {
        isInitialState = initialState;
    }

    public boolean isFinalState() {
        return isFinalState;
    }

    public void setFinalState(boolean finalState) {
        isFinalState = finalState;
    }
    public void printState() {
        System.out.println("State: "+name);
        if(isInitialState){
            System.out.println("This is the initial state");
        }
        if(isFinalState){
            System.out.println("This is the final state");
        }
    }
}
