//USE BFS
//Just the solution part
class SolutionofLeetCode127 {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> dict = new HashSet<>();
		for (String word : wordList) {
			dict.add(word);
		}

		if (beginWord.equals(endWord)) {
			return 1;
		}

		HashSet<String> hash = new HashSet<String>();
		Queue<String> queue = new LinkedList<String>();
		queue.offer(beginWord);
		hash.add(beginWord);

		int length = 1;
		while (!queue.isEmpty()) {
			length++;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				String word = queue.poll();
				for (String nextWord : getNextWords(word, dict)) {
					if (hash.contains(nextWord)) {
						continue;
					}
					if (nextWord.equals(endWord)) {
						return length;
					}

					hash.add(nextWord);
					queue.offer(nextWord);
				}
			}
		}

		return 0;
	}

	private String replace(String s, int index, char c) {
		char[] chars = s.toCharArray();
		chars[index] = c;
		return new String(chars);
	}

	private ArrayList<String> getNextWords(String word, Set<String> dict) {
		ArrayList<String> nextWords = new ArrayList<String>();
		for (char c = 'a'; c <= 'z'; c++) {
			for (int i = 0; i < word.length(); i++) {
				if (c == word.charAt(i)) {
					continue;
				}
				String nextWord = replace(word, i, c);
				if (dict.contains(nextWord)) {
					nextWords.add(nextWord);
				}
			}
		}

		return nextWords;
	}
}


// version: LeetCode by jiuzhangsuanfa
public class Solution {
    public int ladderLength(String start, String end, List<String> wordList) {
        Set<String> dict = new HashSet<>();
        for (String word : wordList) {    //将wordList中的单词加入dict
            dict.add(word);
        }
        
        if (start.equals(end)) {
            return 1;
        }
        
        HashSet<String> hash = new HashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.offer(start);
        hash.add(start);
        
        int length = 1;
        while (!queue.isEmpty()) {			//开始bfs
            length++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {		//枚举当前步数队列的情况
                String word = queue.poll();
                for (String nextWord: getNextWords(word, dict)) {
                    if (hash.contains(nextWord)) {
                        continue;
                    }
                    if (nextWord.equals(end)) {
                        return length;
                    }
                    
                    hash.add(nextWord);				//存入新单词
                    queue.offer(nextWord);
                }
            }
        }
        
        return 0;
    }

    // replace character of a string at given index to a given character
    // return a new string
    private String replace(String s, int index, char c) {
        char[] chars = s.toCharArray();
        chars[index] = c;
        return new String(chars);
    }
    
    // get connections with given word.
    // for example, given word = 'hot', dict = {'hot', 'hit', 'hog'}
    // it will return ['hit', 'hog']
    private ArrayList<String> getNextWords(String word, Set<String> dict) {
        ArrayList<String> nextWords = new ArrayList<String>();
        for (char c = 'a'; c <= 'z'; c++) {					//枚举替换字母
            for (int i = 0; i < word.length(); i++) {		//枚举替换位置
                if (c == word.charAt(i)) {
                    continue;
                }
                String nextWord = replace(word, i, c);
                if (dict.contains(nextWord)) {				//如果dict中包含新单词，存入nextWords
                    nextWords.add(nextWord);
                }
            }
        }
        return nextWords;									//构造当前单词的全部下一步方案
    }
}
