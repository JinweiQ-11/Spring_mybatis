/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/22 16:10
 * @description：
 * @modified By：
 * @version: $
 */
public class Acount {
    private String username;

    @Override
    public String toString() {
        return "Acount{" +
                "username='" + username + '\'' +
                ", money=" + money +
                '}';
    }

    private long money;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}
