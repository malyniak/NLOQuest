package services;

import java.util.Objects;

public abstract class Answer {
    public static final String ACCEPT="accept";
    public static final String REJECT="reject";
    private String result;

    public Answer(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return Objects.equals(result, answer.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
}
