package se.iths.hacker;

public record Vault(int password) {

    public boolean isCorrectPassword(int guess) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        return this.password == guess;
    }
}
