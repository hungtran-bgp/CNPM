public class queueDelay {
        final int small = 0;
        final int normal = 1;
        final int large = 2;
        final int infinite = 3;
        final int wrongI = -1;
        public int dQueue(double R, double L, double a) {
            if (R > 800000 || L > 5000 || a > 200 || R <= 0 || L < 0 || a < 0) {
                return wrongI;
            }
            double delay = ( L * a ) / R;
            delay = Math.ceil(delay * 100) / 100;
            if (delay <= 0.15) {
                return small;
            }
            if (delay > 0.15 && delay < 0.80 ) {
                return normal;
            }
            if (delay < 1.00 && delay >= 0.8) {
                return large;
            }
            return infinite;
        }
}
