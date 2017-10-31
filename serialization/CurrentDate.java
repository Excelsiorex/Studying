package serialization;

import java.io.Serializable;
import java.util.Date;

public class CurrentDate implements Serializable {
    private Date date;
    private transient Thread thread;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    CurrentDate(Date date) {
        this.date = date;
        this.thread = Thread.currentThread();
    }


    @Override
    public String toString() {
        return "CurrentDate{" +
                "date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CurrentDate date1 = (CurrentDate) o;

        return date.equals(date1.date);
    }

    @Override
    public int hashCode() {
        return date.hashCode();
    }
}
