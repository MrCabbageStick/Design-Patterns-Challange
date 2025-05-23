package dev.mrcabbagestick;

public interface Observer<T> {
    void update(T notifier);
}
