
class Sol {
    public static int search(int n, int arr[]) {

        int maxVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        int[] freq = new int[maxVal + 1];


        for (int i = 0; i < arr.length; i++) {

            freq[arr[i]]++;
        }


        for (int k = 0; k <= maxVal; k++) {
            if (freq[k] == 1) {
                return k;
            }
        }

        return -1;
    }
}
