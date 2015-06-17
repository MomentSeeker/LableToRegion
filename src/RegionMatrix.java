import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichaochen on 15/6/17.
 */
public class RegionMatrix {

    public static List <Region> matrix= new ArrayList<Region> ();

    public static void setupMatrix(){
        /* loop each mask file, to generate region Matrix*/

        List <Region> regions = Region.parseMaskFile("imageMask-file");
        Region.importImageLable("imageLabel-file", regions);
        Region.importFeature("feature-histogram-file", regions);
        matrix.addAll(regions);


}
    public static void analyzeLableToRegion()    {

    }

}
