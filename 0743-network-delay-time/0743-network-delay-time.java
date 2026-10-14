class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<int[]>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] edge : times) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            list.get(u).add(new int[] { v, w });
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;

        pq.add(new int[] { 0, k });

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int dist = curr[0];
            int node = curr[1];

            // if (dista > dist[node])
            //     continue;
            relax(node, distance, list, pq);
        }

        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                return -1;
            }
            maxTime = Math.max(maxTime, distance[i]);
        }
        return maxTime;
    }

    public void relax(int node, int distance[], List<List<int[]>> list, PriorityQueue<int[]> pq) {
        for (int[] edge : list.get(node)) {
            int v = edge[0];
            int w = edge[1];

            if (distance[node] + w < distance[v]) {
                distance[v] = distance[node] + w;
                pq.add(new int[] { distance[v], v });
            }
        }
    }
}