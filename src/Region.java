import java.util.*;

/**
 * Created by lichaochen on 15/6/13.
 */
public class Region {

    int image_id;
    int region_id;

    /* weight: region size percentage in image */
    double weightInImage;

    /* final label ID, after label selection using label histogram*/
    int label_id;

    /*feature histogram*/
    List feature = new ArrayList<Double>();

    /*Label Histogram, structure <label_id, counter>, used for label propagation phase*/
    Map <Integer, Integer> label_histogram = new HashMap<Integer, Integer>();


    public Region(){
    }

    public Region (int image_id, int region_id, double weightInImage){
        this.image_id = image_id;
        this.region_id = region_id;
        this.weightInImage = weightInImage;
    }

    /*parse image mask file, to generate Regions of that image
      populate regions with image_id, region_id, weighInImage,
      those can be obtained from mask file */
    public static List<Region> parseMaskFile(String maskFile){

        /*demo code*/
            List <Region> regions = new ArrayList<Region>();
            Region r1 = new Region();
            Region r2 = new Region();
            regions.add(r1);
            regions.add(r2);
            return regions;

    }

    /*parse feature histogram file, populate feature according to the file*/
    public static void importFeature (String featureFile,  List<Region> regions){


    }

    /*parse image label file, populate initial label histogram of each regions in the image*/
    public static void importImageLable(String labelFile,  List<Region> regions){


    }


    public int getImage_id() {
        return image_id;
    }

    public int getRegion_id() {
        return region_id;
    }

    public double getWeightInImage() {
        return weightInImage;
    }

    public int getLabel_id() {
        return label_id;
    }




    public static void main(String args[]){
        Region r1 =  new Region(1, 4, 0.3);
        System.out.println(r1.image_id);
    }

}
