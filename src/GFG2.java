/*
Third Largest number
*/
class GfG2
{
    int thirdLargest(int a[], int n)
    {
        int temp;
        // Your code here
        if(n < 3)
            return -1;
        for (int i = 0; i < n; i ++) {
            for(int j = i + 1; j < n ; j ++) {
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a[2];
    }
}
