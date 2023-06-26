import java.util.*;

public class Main {
//    private static int[] getArr() {
//        int arr[] = new int[20];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100);
//        }
//        return arr;
//    }

//    private static int[][] getArr() {
//        int arr[][] = new int[20][20];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (int) (Math.random() * 100);
//            }
//
//        }
//        return arr;
//    }

//    private static Integer[] getArr() {
//        Integer arr[] = new Integer[20];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100);
//        }
//        Arrays.sort(arr, Collections.reverseOrder());
//        return arr;
//    }

//    private static int[] getArr() {
//        int arr[] = new int[20];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100);
//        }
//        return arr;
//    }

    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("KanD");
//        list.add("Khanh");
//        list.add("Binh");
//        System.out.println(list.indexOf("Hung"));


//        BT1 :
//        int[] arr = getArr();
//        System.out.println(findMax1(arr));

//        BT2:
//        int[] arr = getArr();
//        System.out.println(findMax2(arr));

//        BT3:
//        int[][] arr = getArr();
//        System.out.println("Nhap so ban muon tim kiem trong danh sach");
//        int choice = new Scanner(System.in).nextInt();
//        search(arr, choice);

//        BT4:
//        int[] arr = getArr();
//        System.out.println(findMax1(arr));

//        BT5:
//        int[] arr = getArr();
//        System.out.println(findMax2(arr));

//        BT6:
//        Integer[] arr = getArr();
//        System.out.println("Nhap so ma ban muon tim kiem");
//        int number = new Scanner(System.in).nextInt();
//        int result = binarySearch(arr, 0, arr.length - 1, number);
//        if (result == -1) {
//            System.out.println("Số " + number + " không có trong mảng.");
//        } else {
//            System.out.println("Số " + number + " được tìm thấy tại vị trí " + result + ".");
//        }

//       BT7 :
//        String[] stringArr = {"May", "Dap", "Dinh", "Thon"};
//        System.out.println("Nhập chuỗi mà bạn muốn tìm kiếm:");
//        try (Scanner scanner = new Scanner(System.in)) {
//            String text = scanner.next();
//            for (int i = 0; i < stringArr.length; i++) {
//                if (stringArr[i].equalsIgnoreCase(text)) {
//                    System.out.println("Chuỗi '" + text + "' được tìm thấy.");
//                    break;
//                }
//            }
//        }

//        BT8
//        System.out.println("Nhap min");
//        int min = new Scanner(System.in).nextInt();
//        System.out.println("Nhap max");
//        int max = new Scanner(System.in).nextInt();
//        int[] arr = getArr();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (min < arr[i] && arr[i] < max) {
//                list.add(arr[i]);
//            }
//        }
//        for (Integer number : list) {
//            System.out.print(number + " ");
//        }

//        BT9
//        System.out.println("Nhap min");
//        int min = new Scanner(System.in).nextInt();
//        System.out.println("Nhap max");
//        int max = new Scanner(System.in).nextInt();
//        Integer[] arr = getArr();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > min) {
//                list.add(arr[i]);
//                break;
//            }
//        }
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] < max) {
//                list.add(arr[i]);
//                break;
//            }
//        }
//        for (int number : list) {
//            System.out.println(number);
//        }\

//        BT10:
//        GIong bai 9

//        BT13:
//        String text = new Scanner(System.in).nextLine();
//        String result = String.valueOf(text.charAt(0));
//        char lastChar = text.charAt(0); // Lưu ký tự trước đó
//        for (int i = 1; i < text.length(); i++) {
//            if (text.charAt(i) > lastChar) {
//                result += text.charAt(i);
//                lastChar = text.charAt(i); // Cập nhật ký tự trước đó
//            }
//        }
//        System.out.println(result);

//        BT14:
//        Tim kiem nhi phan

//        BT15:
        String text = new Scanner(System.in).nextLine();
        Map<String, Integer> result = new HashMap<>();
        int count = 0;
        char lastChar = text.charAt(0);
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) > lastChar) {
//                result.get() += text.charAt(i);
                lastChar = text.charAt(i);
                count += 1;
                continue;
            }
            String temp = "";

        }

    }


    public static int findMax1(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMax2(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }

    public static boolean search(int[][] arr, int choice) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == choice) {
                    System.out.println(i + "." + j);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("Ko tim thay so thoa man");
            return false;
        } else {
            return true;
        }

    }

    public static int binarySearch(Integer[] arr, int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, low, mid - 1, value);
            return binarySearch(arr, mid + 1, high, value);
        }
        return -1;
    }

}
