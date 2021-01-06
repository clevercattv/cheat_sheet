# TASK

Using Core Java count ships. (all neighboring units are considered as a one ship)

### Code 

```java
public class ShipsCounter {
    static int[][] ships = {
            { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, },
            { 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, },
            { 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, },
            { 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, },
            { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
            { 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
            { 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, },
            { 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, }
    };

    public static void main(String[] args) {
        int count = 0;

        // count ships here

        System.out.println(count);
    }
}
```

