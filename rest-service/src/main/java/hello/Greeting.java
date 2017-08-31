package hello;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Greeting {
    private final long id;
    private final String content;
    private final Boolean debug;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.debug = true;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Boolean getDebug() {
        return debug;
    }
}
