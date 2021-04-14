package quotes;

import java.util.Objects;

public class JsonFileLines {

    String author;
    String text;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonFileLines that = (JsonFileLines) o;
        return Objects.equals(author, that.author) && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, text);
    }

    @Override
    public String toString() {
        return "JsonFileLines{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
