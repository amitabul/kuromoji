package com.atilika.kuromoji.util;

public class EunjeondicFormatter implements Formatter {
    public EunjeondicFormatter() {
    }

    /*
      * IPADIC features
      *
      * 0	- surface
      * 1	- left cost
      * 2	- right cost
      * 3	- word cost
      * 4-9	- pos
      * 
      * 10	- base form
      * 11	- reading
      * 12	- pronounciation
      *
      * EunjeonDic features
      *
      * 0	- surface
      * 1	- left cost
      * 2	- right cost
      * 3	- word cost
      * 
      * 4 - pos
      * 5 - support(T/F)
      * 
      * 6 - reading
      * 
      * 7 - Type
      * 8 - start pos
      * 9 - end pos
      * 10 - description
      * 11 - indexed description
      */

    public String[] formatEntry(String[] features) {
        String[] eunjeonDicFeatures = new String[16];

        for (int i = 0; i <= 3; i++) {
            eunjeonDicFeatures[i] = features[i];
        }

        // TODO: when Inflect, rewirte pos
        // pos
        for (int i = 4; i <= 5; i++) {
            eunjeonDicFeatures[i] = features[i];
        }

        // base form
        // TODO: when coming verb, to do.
        eunjeonDicFeatures[10] = "";

        eunjeonDicFeatures[11] = features[6];
        eunjeonDicFeatures[12] = features[6];

        // type
        eunjeonDicFeatures[13] = features[7];
        
        // description
        eunjeonDicFeatures[14] = features[10];
        eunjeonDicFeatures[15] = features[11];
        
        return eunjeonDicFeatures;
    }
}
