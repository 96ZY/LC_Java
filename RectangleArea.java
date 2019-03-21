//math problem
//just the solution part
class SolutionofLeetCode223 {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		if (A > C || B > D || E > G || F > H) {
			return 0;
		}

		int area1 = (C - A) * (D - B);
		// System.out.println("area1="+area1);
		int area2 = (G - E) * (H - F);
		// System.out.println("area2="+area2);

		if (E >= C || G <= A || H <= B || F >= D) {
			return area1 + area2;
		}

		if (A == C || B == D || E == G || F == H) {
			return area1 + area2;
		}
		int w[] = new int[] { A, E, C, G };
		int h[] = new int[] { B, D, F, H };
		Arrays.sort(w);
		// System.out.println("w[2]="+w[2]+"w[1]="+w[1]);
		Arrays.sort(h);
		// System.out.println("h[2]="+h[2]+"h[1]="+h[1]);
		int width = w[2] - w[1];
		int hight = h[2] - h[1];

		return area1 + area2 - width * hight;
		/*
		 * if(E<C&&E>A){ if(H<=B||F>=D){ return 0; }
		 * 
		 * }
		 */

	}
}
