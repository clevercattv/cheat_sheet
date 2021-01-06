package com.clevercattv.ship.counter;

public class ShipsCounter {
    static int[][] ships = {
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0,},
            {0, 1, 0, 0, 0, 0, 0, 1, 0, 0,},
            {0, 1, 0, 1, 1, 0, 0, 0, 0, 0,},
            {0, 1, 0, 1, 1, 1, 0, 1, 1, 1,},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {1, 1, 1, 1, 0, 1, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {1, 1, 0, 0, 0, 0, 0, 1, 0, 0,},
            {1, 1, 0, 0, 0, 0, 0, 0, 0, 1,}
    };

    public static void main(String[] args) {
        int count = new ShipsCounter()
                .countShips(ships);

        System.out.println(count);
    }

    int countShips(int[][] field) {
        int count = 0;
        for (int y = 0; y < field.length; y++) {
            boolean isLastLeftCellShip = false;
            boolean isLastTopCellShip = false;
            for (int x = 0; x < field[y].length; x++) {
                if (field[y][x] == 0) {
                    isLastLeftCellShip = false;
                    isLastTopCellShip = false;
                    continue;
                }
                if (y > 0 && field[y - 1][x] == 1) {
                    // decrease count if ship like :
                    // 0 1
                    // 1 1 - there at the first column we get counter increase
                    if (!isLastTopCellShip && isLastLeftCellShip) {
                        --count;
                    }
                    isLastTopCellShip = true;
                    isLastLeftCellShip = true;
                    continue;
                }
                if (isLastLeftCellShip) {
                    continue;
                }

                isLastLeftCellShip = true;
                ++count;
            }
        }
        return count;
    }

}
