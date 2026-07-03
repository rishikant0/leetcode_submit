class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length;

        List<List<Pair>> adj = new ArrayList<> ();
        for (int i=0; i<n; i++) {
            adj.add(new ArrayList<>());
        }

        int left = Integer.MAX_VALUE;
        int right = 0;

        for (int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            int cost = edge[2];
            if (online[v] && online[u]) {
                adj.get(u).add(new Pair(v, cost));
                left = Math.min(left, cost);
                right = Math.max(right, cost);
            }
        }

        if (!check(adj, n, left, k)) {
            return -1;
        }

        while (left <= right) {
            int mid = left + (right-left)/2;

            if (check(adj, n, mid, k)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;

    }

    public boolean check (List<List<Pair>> adj, int n, int minEdgeCost, long k) {
        long[] cost = new long[n];
        Arrays.fill(cost, Long.MAX_VALUE);

        PriorityQueue<State> pq = new PriorityQueue<>(
            Comparator.comparingLong(a -> a.cost));

        cost[0] = 0;
        pq.offer(new State(0, 0));

        while (!pq.isEmpty()) {
            State curr = pq.poll();
            long totalCost = curr.cost;
            int u = curr.node;
            
            if (totalCost > k) return false;
            if (u == n-1) return true;

            if (totalCost > cost[u]) continue;

            for (Pair next: adj.get(u)) {
                int v = next.node;
                int w = next.cost;

                if (w < minEdgeCost) continue;

                if (cost[v] > cost[u] + w) {
                    cost[v] = cost[u] + w;
                    pq.offer(new State(v, cost[v]));
                }
            }
        }
        return false;
    }

    static class Pair {
        int node;
        int cost;

        Pair (int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    static class State {
        int node;
        long cost;

        State (int node, long cost) {
            this.node = node;
            this.cost = cost;
        }
    }
}