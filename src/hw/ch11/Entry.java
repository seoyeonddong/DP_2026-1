package hw.ch11;

import java.util.List;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    // search 추상 메소드 추가 
    public abstract List<Entry> search(String keyword);

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    // 전체 경로를 가져오는 메소드
    public String getFullName() {
        return getFullName("");
    }

    protected abstract String getFullName(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}