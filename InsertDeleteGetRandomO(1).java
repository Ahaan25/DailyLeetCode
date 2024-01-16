class RandomizedSet {
    private Set<Integer> set;
    public RandomizedSet() {
        set=new HashSet<>();
    }

    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }
        set.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int min=0;
        int max=set.size()-1;
        int random=(int)(Math.random()*(max-min+1));
        return (int)(set.toArray()[random]);
    }
}
