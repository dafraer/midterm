package midterm.kamil_nuriev_1.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String studentName = "Kamil Nuriev";

    public String toString() {
        String result = "";

        result = "Fantasy Object: studentName= " + studentName;
        return result;
    }

    @Override
    public String getJustice1() {
        return "Justice1";
    }

    @Override
    public String getTopology2() {
        return "Topology2";
    }

    @Override
    public String methodMicroscope3(String argHelmet5) {
        return "Helmet:" + argHelmet5;
    }

    @Override
    public List<String> methodDisease4(String argThermodynamics6) {
        List<String> Disease = new ArrayList<>();
        Disease.add(argThermodynamics6);
        return Disease;
    }
}
