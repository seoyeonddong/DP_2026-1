package hw.ch11;

import java.util.ArrayList;
import java.util.List;

public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public List<Entry> search(String keyword) {
        List<Entry> result = new ArrayList<>();
        // 자신의 이름에 keyword가 포함되면 자신을 담음 
        if (name.contains(keyword)) {
            result.add(this);
        }
        return result;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    @Override
    protected String getFullName(String prefix) {
        return prefix + "/" + name;
    }
}