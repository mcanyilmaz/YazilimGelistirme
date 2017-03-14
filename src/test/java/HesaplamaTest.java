/**
 * Created by kavbillab on 14.03.2017.
 */

import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class HesaplamaTest {

    @Test
    public void bolmeIslemi(){

        Hesaplama hesaplama = new Hesaplama();

        int sonuc = hesaplama.Bolme(10,5);
        assertTrue(sonuc == 2);


    }

}
