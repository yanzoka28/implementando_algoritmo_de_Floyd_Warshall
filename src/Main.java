void main() {

    int INF = FloydWarshallAlgorithm.getInf();

    int[][] graph = {
            {0,   5,   INF, 10},
            {5,   0,   3,   INF},
            {INF, 3,   0,   1},
            {10,  INF, 1,   0}
    };


    FloydWarshallAlgorithm floydWarshall = new FloydWarshallAlgorithm();

    floydWarshall.executar(graph);
}

