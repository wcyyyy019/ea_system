package com.example.ea_system.bean;

import java.util.ArrayList;
import java.util.List;

public class CheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPersonalinformationIsNull() {
            addCriterion("personalInformation is null");
            return (Criteria) this;
        }

        public Criteria andPersonalinformationIsNotNull() {
            addCriterion("personalInformation is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalinformationEqualTo(Byte value) {
            addCriterion("personalInformation =", value, "personalinformation");
            return (Criteria) this;
        }

        public Criteria andPersonalinformationNotEqualTo(Byte value) {
            addCriterion("personalInformation <>", value, "personalinformation");
            return (Criteria) this;
        }

        public Criteria andPersonalinformationGreaterThan(Byte value) {
            addCriterion("personalInformation >", value, "personalinformation");
            return (Criteria) this;
        }

        public Criteria andPersonalinformationGreaterThanOrEqualTo(Byte value) {
            addCriterion("personalInformation >=", value, "personalinformation");
            return (Criteria) this;
        }

        public Criteria andPersonalinformationLessThan(Byte value) {
            addCriterion("personalInformation <", value, "personalinformation");
            return (Criteria) this;
        }

        public Criteria andPersonalinformationLessThanOrEqualTo(Byte value) {
            addCriterion("personalInformation <=", value, "personalinformation");
            return (Criteria) this;
        }

        public Criteria andPersonalinformationIn(List<Byte> values) {
            addCriterion("personalInformation in", values, "personalinformation");
            return (Criteria) this;
        }

        public Criteria andPersonalinformationNotIn(List<Byte> values) {
            addCriterion("personalInformation not in", values, "personalinformation");
            return (Criteria) this;
        }

        public Criteria andPersonalinformationBetween(Byte value1, Byte value2) {
            addCriterion("personalInformation between", value1, value2, "personalinformation");
            return (Criteria) this;
        }

        public Criteria andPersonalinformationNotBetween(Byte value1, Byte value2) {
            addCriterion("personalInformation not between", value1, value2, "personalinformation");
            return (Criteria) this;
        }

        public Criteria andBanIsNull() {
            addCriterion("ban is null");
            return (Criteria) this;
        }

        public Criteria andBanIsNotNull() {
            addCriterion("ban is not null");
            return (Criteria) this;
        }

        public Criteria andBanEqualTo(Byte value) {
            addCriterion("ban =", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanNotEqualTo(Byte value) {
            addCriterion("ban <>", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanGreaterThan(Byte value) {
            addCriterion("ban >", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanGreaterThanOrEqualTo(Byte value) {
            addCriterion("ban >=", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanLessThan(Byte value) {
            addCriterion("ban <", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanLessThanOrEqualTo(Byte value) {
            addCriterion("ban <=", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanIn(List<Byte> values) {
            addCriterion("ban in", values, "ban");
            return (Criteria) this;
        }

        public Criteria andBanNotIn(List<Byte> values) {
            addCriterion("ban not in", values, "ban");
            return (Criteria) this;
        }

        public Criteria andBanBetween(Byte value1, Byte value2) {
            addCriterion("ban between", value1, value2, "ban");
            return (Criteria) this;
        }

        public Criteria andBanNotBetween(Byte value1, Byte value2) {
            addCriterion("ban not between", value1, value2, "ban");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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