class Solution {
    public int distMoney(int money, int children) {
        if (money < children) return -1;
        for (int k = children; k >= 0; k--) {
            int leftMoney = money - (k * 8);
            int leftChildren = children - k;
            if (leftMoney < 0) continue;
            if (leftChildren == 0) {
                if (leftMoney == 0) return k;
            } else {
                if (leftMoney >= leftChildren && !(leftChildren == 1 && leftMoney == 4)) return k;
            }
        }
        return -1;
    }
}