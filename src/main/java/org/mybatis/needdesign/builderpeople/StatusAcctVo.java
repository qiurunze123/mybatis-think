package org.mybatis.needdesign.builderpeople;

/**
 * @author qiurunze
 * 账户冻结/解冻 参数
 */
public class StatusAcctVo {

    private Integer userId;

    private Integer accountId;

    /**
     * 打开表示
     */
    private String operFlag;

    /**
     * 冻结标识
     */
    private String frozenFlag;

    /**
     * 账户状态
     */
    private Boolean isEnabled;

    public static class Builder {
        private Integer userId;

        private Integer accountId;

        private String operFlag;

        private String frozenFlag;

        private Boolean isEnabled;

        public Builder(){

        }
        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public Builder accountId(Integer accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder operFlag(String operFlag) {
            this.operFlag = operFlag;
            return this;
        }

        public Builder frozenFlag(String frozenFlag) {
            this.frozenFlag = frozenFlag;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public StatusAcctVo build() {
            return new StatusAcctVo(this);
        }
    }

    private StatusAcctVo(Builder builder) {
        userId = builder.userId;
        accountId = builder.accountId;
        operFlag = builder.operFlag;
        frozenFlag = builder.frozenFlag;
        isEnabled = builder.isEnabled;
    }


    public Integer getUserId() {
        return userId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public String getOperFlag() {
        return operFlag;
    }

    public String getFrozenFlag() {
        return frozenFlag;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    @Override
    public String toString() {
        return "StatusAcctVo{" +
                "userId=" + userId +
                ", accountId=" + accountId +
                ", operFlag='" + operFlag + '\'' +
                ", frozenFlag='" + frozenFlag + '\'' +
                ", isEnabled=" + isEnabled +
                '}';
    }

    public static void main(String[] args) {
        StatusAcctVo p2pCommonVo = new Builder().accountId(2).build();
        System.out.println(p2pCommonVo.toString());
        System.out.println(p2pCommonVo.getAccountId());
    }
}
