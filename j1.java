class j1{
    public static void main(String[] args)
    {
        int arr[]= {1,2,3};
        int sol=0;
        int n =3;
            if(arr[0]>arr[1])
            {
                sol= arr[0];
            }
            else{
                for(int i=1 ; i<n-1; i++)
                    {
                        if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])
                            {
                                sol=arr[i];
                            }
                        else
                        {
                            sol=arr[n-1];
                        }
                    }
                }
                System.out.println(sol);
            }
}