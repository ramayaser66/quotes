package quotes;

import java.util.Objects;

public class RecentQuotes {
    String author;
    String text;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecentQuotes quotes = (RecentQuotes) o;
        return Objects.equals(author, quotes.author) && Objects.equals(text, quotes.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, text);
    }

    @Override
    public String toString() {
        return "RecentQuotes{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
