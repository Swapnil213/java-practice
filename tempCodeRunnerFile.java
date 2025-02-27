for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= 0; j--) {
                sol[j][i] = arr[arr1][arr2++];
            }
            arr1++;
            arr2 = 0;
        }