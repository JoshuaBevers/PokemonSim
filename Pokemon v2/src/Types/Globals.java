package Types;

import java.util.Arrays;

/**
 * Created by Ramna on 3/27/2016.
 */
public class Globals {
    public enum types {
        NORMAL(0),
        FIRE(1),
        WATER(2),
        GRASS(3),
        attacking(99),
        defending(100);

        private int value;

        private types(int value) {
            this.value = value;
        }

        public static class advantages {
            private static double[][] advantages;

            public static double get(types attacking, types defending) {
                if (advantages == null) {
                    setUpAdvantages();
                }
                return advantages[attacking.value][defending.value];
            }

            public static void setUpAdvantages() {
                advantages = new double[4][4];

                for (double[] d : advantages) {
                    Arrays.fill(d, 1);
                }

                advantages[FIRE.value][WATER.value] = .5;
                advantages[FIRE.value][GRASS.value] = 2;

                advantages[WATER.value][FIRE.value] = 2;
                advantages[WATER.value][GRASS.value] = .5;

                advantages[GRASS.value][WATER.value] = 2;
                advantages[GRASS.value][FIRE.value] = .5;

            }

        }
    }
}
