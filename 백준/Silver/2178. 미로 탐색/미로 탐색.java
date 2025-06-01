import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        bfsMazeProblem();
    }
    
    public static void bfsMazeProblem(){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();

		int[][] maze = new int[N][M];
		boolean[][] visited = new boolean[N][M];

		for(int i = 0; i < N; i++){
			String line = sc.nextLine();
			for(int j = 0; j < M; j++){
				maze[i][j] = line.charAt(j) - '0';
			}
		}

		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{0,0});
		visited[0][0] = true;

		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		// ex) x+dx[0], y+dy[0] → 위로 이동

		while(!queue.isEmpty()){
			int[] now = queue.poll();
			int x = now[0];
			int y = now[1];

			for(int d = 0; d < 4; d++){ // 현재 위치 기중 4방향(상,하,좌,우) 이동 가능한 곳 찾기
				int nx = x + dx[d];
				int ny = y + dy[d];

				if(nx >= 0 && ny >= 0 && nx < N && ny < M){
					if(maze[nx][ny] == 1 && !visited[nx][ny]){
						queue.offer(new int[]{nx, ny});
						visited[nx][ny] = true;
						maze[nx][ny] = maze[x][y] + 1;
					}
				}
			}
		}
		System.out.println(maze[N-1][M-1]);
	}
}