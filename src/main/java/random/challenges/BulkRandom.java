package random.challenges;

import labels.PopUp;
import labels.RandomPopUp;

@RandomPopUp
public class BulkRandom {
    public static void main(String[] args) {
        //isMatch (compare 2 arrays)
        System.out.println(isMatch(new int[]{1, 2}, new int[]{1, 3}));
    }

    //TODO make it so the message inside annotation can display the contents of the methods and the challenge it self
    @PopUp()
    public static boolean isMatch(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
