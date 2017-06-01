package daily.solve.sum.subsets;

import org.junit.Assert;
import org.junit.Test;

public class SumSubsetsTest {

	private SumSubsets sumSubets = new SumSubsets();

	@Test
	public void test() {
		Assert.assertEquals("[[1,4],[2,3],[5]]", sumSubets.sumSubsets(new int[] { 1, 2, 3, 4, 5 }, 5).toString().replace(" ", ""));
		Assert.assertEquals("[[1,2,2],[1,4],[2,3],[5]]", sumSubets.sumSubsets(new int[] { 1, 2, 2, 3, 4, 5 }, 5).toString().replace(" ", ""));
		Assert.assertEquals("[[1,1,2,5],[1,2,6],[1,8],[2,2,5]]", sumSubets.sumSubsets(new int[] { 1, 1, 2, 2, 2, 5, 5, 6, 8, 8 }, 9).toString().replace(" ", ""));
		Assert.assertEquals("[[1,1,2,4,4,4,7,13],[1,1,2,4,4,4,20],[1,1,2,4,4,9,15],[1,1,2,4,9,19],[1,1,2,4,13,15],[1,1,2,7,9,16],[1,1,2,13,19],[1,1,2,16,16],[1,1,4,4,4,7,15],[1,1,4,4,4,9,13],[1,1,4,4,7,19],[1,1,4,4,13,13],[1,1,4,15,15],[1,1,9,9,16],[1,1,15,19],[1,2,4,4,7,9,9],[1,2,4,4,9,16],[1,2,4,7,9,13],[1,2,4,9,20],[1,2,4,13,16],[1,2,7,13,13],[1,2,9,9,15],[1,2,13,20],[1,4,4,4,7,16],[1,4,4,7,20],[1,4,7,9,15],[1,4,9,9,13],[1,4,15,16],[1,7,9,19],[1,7,13,15],[1,9,13,13],[1,15,20],[1,16,19],[2,4,4,4,7,15],[2,4,4,4,9,13],[2,4,4,7,19],[2,4,4,13,13],[2,4,15,15],[2,9,9,16],[2,15,19],[4,4,4,9,15],[4,4,9,19],[4,4,13,15],[4,7,9,16],[4,13,19],[4,16,16],[7,9,20],[7,13,16],[16,20]]", sumSubets.sumSubsets(new int[] { 1, 1, 2, 4, 4, 4, 7, 9, 9, 13, 13, 13, 15, 15, 16, 16, 16, 19, 19, 20 }, 36).toString().replace(" ", ""));	
	}

}
