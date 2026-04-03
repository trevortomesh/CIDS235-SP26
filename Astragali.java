//package astragalus;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Simulates an astragalus (knucklebone) die.
 *
 * Usage:
 *   Astragali dice = new Astragali();
 *   int side = dice.roll();
 *
 * Default probabilities are based on Koerper's experimental table:
 *   broad face A = 38.7%
 *   broad face B = 36.7%
 *   narrow face C = 13.1%
 *   narrow face D = 11.5%
 *
 * This implementation maps those four probabilities onto the traditional
 * face values 1, 3, 4, and 6. Since the literature is clearer about
 * "broad vs. narrow" than about a single universally standardized
 * value-to-geometry mapping across all traditions, this class uses:
 *
 *   4 -> 38.7%   (broad)
 *   3 -> 36.7%   (broad)
 *   1 -> 13.1%   (narrow)
 *   6 -> 11.5%   (narrow)
 *
 * If you want a different assignment of 1/6 or 3/4 to the two narrow/broad
 * faces, just swap the return values in roll().
 */
public class Astragali {

    // Cumulative thresholds
    private static final double P4 = 0.387;                  // broad face
    private static final double P3 = P4 + 0.367;             // broad face
    private static final double P1 = P3 + 0.131;             // narrow face
    // Remaining probability goes to 6: 0.115

    /**
     * Roll the astragalus once.
     *
     * @return one of the traditional astragalus values: 1, 3, 4, or 6
     */
    public int roll() {
        double r = ThreadLocalRandom.current().nextDouble();

        if (r < P4) {
            return 4;
        } else if (r < P3) {
            return 3;
        } else if (r < P1) {
            return 1;
        } else {
            return 6;
        }
    }
}
