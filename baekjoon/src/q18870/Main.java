package q18870;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 입력 배열과 그 복사본을 준비
        int[] arr = new int[num];
        int[] sortedArr = new int[num];
        
        // 입력 값을 배열과 복사본에 저장
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sortedArr[i] = arr[i];
        }

        // 복사본을 정렬
        Arrays.sort(sortedArr);

        // 값의 인덱스를 맵에 저장
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 0;
        for (int i = 0; i < num; i++) {
            // 이미 나온 값은 건너뜀
            if (!rankMap.containsKey(sortedArr[i])) {
                rankMap.put(sortedArr[i], rank++);
            }
        }

        // 결과 출력
        for (int i = 0; i < num; i++) {
            bw.write(rankMap.get(arr[i]) + " ");
        }

        bw.flush();
    }
}
