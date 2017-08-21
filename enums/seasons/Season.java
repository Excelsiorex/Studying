package enums.seasons;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    private static final List<Season> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));

    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random(System.currentTimeMillis());

    static Season randomSeason() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
