package subway.domain;

import java.util.HashSet;
import java.util.Set;

public class StationRelationRepository {

    private Set<StationRelation> relationMap = new HashSet<>();

    private class StationRelation{
        private final String leftStation;
        private final String rightStation;
        private final int time;
        private final int distance;

        public StationRelation(String leftStation, String rightStation, int time, int distance) {
            this.leftStation = leftStation;
            this.rightStation = rightStation;
            this.time = time;
            this.distance = distance;
        }
    }
}
