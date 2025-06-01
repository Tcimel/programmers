import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length * 5;

		int time = 0;
		LinkedList<String> cache = new LinkedList<>();
		for (String city : cities){
			city = city.toLowerCase();

			if(cache.contains(city)){
				time += 1;
				cache.remove(city);
			}else{
				time += 5;
				if(cache.size() >= cacheSize){
					cache.poll();
				}
			}
			cache.offer(city);
		}
		return time;
    }
}