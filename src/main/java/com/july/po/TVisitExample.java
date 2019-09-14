package com.july.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TVisitExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public TVisitExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andUseragentIsNull() {
            addCriterion("userAgent is null");
            return (Criteria) this;
        }

        public Criteria andUseragentIsNotNull() {
            addCriterion("userAgent is not null");
            return (Criteria) this;
        }

        public Criteria andUseragentEqualTo(String value) {
            addCriterion("userAgent =", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentNotEqualTo(String value) {
            addCriterion("userAgent <>", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentGreaterThan(String value) {
            addCriterion("userAgent >", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentGreaterThanOrEqualTo(String value) {
            addCriterion("userAgent >=", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentLessThan(String value) {
            addCriterion("userAgent <", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentLessThanOrEqualTo(String value) {
            addCriterion("userAgent <=", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentLike(String value) {
            addCriterion("userAgent like", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentNotLike(String value) {
            addCriterion("userAgent not like", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentIn(List<String> values) {
            addCriterion("userAgent in", values, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentNotIn(List<String> values) {
            addCriterion("userAgent not in", values, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentBetween(String value1, String value2) {
            addCriterion("userAgent between", value1, value2, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentNotBetween(String value1, String value2) {
            addCriterion("userAgent not between", value1, value2, "useragent");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeIsNull() {
            addCriterion("browserType is null");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeIsNotNull() {
            addCriterion("browserType is not null");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeEqualTo(String value) {
            addCriterion("browserType =", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeNotEqualTo(String value) {
            addCriterion("browserType <>", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeGreaterThan(String value) {
            addCriterion("browserType >", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeGreaterThanOrEqualTo(String value) {
            addCriterion("browserType >=", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeLessThan(String value) {
            addCriterion("browserType <", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeLessThanOrEqualTo(String value) {
            addCriterion("browserType <=", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeLike(String value) {
            addCriterion("browserType like", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeNotLike(String value) {
            addCriterion("browserType not like", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeIn(List<String> values) {
            addCriterion("browserType in", values, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeNotIn(List<String> values) {
            addCriterion("browserType not in", values, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeBetween(String value1, String value2) {
            addCriterion("browserType between", value1, value2, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeNotBetween(String value1, String value2) {
            addCriterion("browserType not between", value1, value2, "browsertype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeIsNull() {
            addCriterion("platformType is null");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeIsNotNull() {
            addCriterion("platformType is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeEqualTo(String value) {
            addCriterion("platformType =", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotEqualTo(String value) {
            addCriterion("platformType <>", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeGreaterThan(String value) {
            addCriterion("platformType >", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeGreaterThanOrEqualTo(String value) {
            addCriterion("platformType >=", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeLessThan(String value) {
            addCriterion("platformType <", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeLessThanOrEqualTo(String value) {
            addCriterion("platformType <=", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeLike(String value) {
            addCriterion("platformType like", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotLike(String value) {
            addCriterion("platformType not like", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeIn(List<String> values) {
            addCriterion("platformType in", values, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotIn(List<String> values) {
            addCriterion("platformType not in", values, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeBetween(String value1, String value2) {
            addCriterion("platformType between", value1, value2, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotBetween(String value1, String value2) {
            addCriterion("platformType not between", value1, value2, "platformtype");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_visit
     *
     * @mbg.generated do_not_delete_during_merge Fri Sep 13 16:38:56 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_visit
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}