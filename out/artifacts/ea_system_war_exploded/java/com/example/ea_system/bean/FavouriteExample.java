package com.example.ea_system.bean;

import java.util.ArrayList;
import java.util.List;

public class FavouriteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FavouriteExample() {
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

        public Criteria andFavouriteidIsNull() {
            addCriterion("favouriteId is null");
            return (Criteria) this;
        }

        public Criteria andFavouriteidIsNotNull() {
            addCriterion("favouriteId is not null");
            return (Criteria) this;
        }

        public Criteria andFavouriteidEqualTo(Integer value) {
            addCriterion("favouriteId =", value, "favouriteid");
            return (Criteria) this;
        }

        public Criteria andFavouriteidNotEqualTo(Integer value) {
            addCriterion("favouriteId <>", value, "favouriteid");
            return (Criteria) this;
        }

        public Criteria andFavouriteidGreaterThan(Integer value) {
            addCriterion("favouriteId >", value, "favouriteid");
            return (Criteria) this;
        }

        public Criteria andFavouriteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("favouriteId >=", value, "favouriteid");
            return (Criteria) this;
        }

        public Criteria andFavouriteidLessThan(Integer value) {
            addCriterion("favouriteId <", value, "favouriteid");
            return (Criteria) this;
        }

        public Criteria andFavouriteidLessThanOrEqualTo(Integer value) {
            addCriterion("favouriteId <=", value, "favouriteid");
            return (Criteria) this;
        }

        public Criteria andFavouriteidIn(List<Integer> values) {
            addCriterion("favouriteId in", values, "favouriteid");
            return (Criteria) this;
        }

        public Criteria andFavouriteidNotIn(List<Integer> values) {
            addCriterion("favouriteId not in", values, "favouriteid");
            return (Criteria) this;
        }

        public Criteria andFavouriteidBetween(Integer value1, Integer value2) {
            addCriterion("favouriteId between", value1, value2, "favouriteid");
            return (Criteria) this;
        }

        public Criteria andFavouriteidNotBetween(Integer value1, Integer value2) {
            addCriterion("favouriteId not between", value1, value2, "favouriteid");
            return (Criteria) this;
        }

        public Criteria andGraduateidIsNull() {
            addCriterion("graduateId is null");
            return (Criteria) this;
        }

        public Criteria andGraduateidIsNotNull() {
            addCriterion("graduateId is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateidEqualTo(Integer value) {
            addCriterion("graduateId =", value, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidNotEqualTo(Integer value) {
            addCriterion("graduateId <>", value, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidGreaterThan(Integer value) {
            addCriterion("graduateId >", value, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("graduateId >=", value, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidLessThan(Integer value) {
            addCriterion("graduateId <", value, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidLessThanOrEqualTo(Integer value) {
            addCriterion("graduateId <=", value, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidIn(List<Integer> values) {
            addCriterion("graduateId in", values, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidNotIn(List<Integer> values) {
            addCriterion("graduateId not in", values, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidBetween(Integer value1, Integer value2) {
            addCriterion("graduateId between", value1, value2, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidNotBetween(Integer value1, Integer value2) {
            addCriterion("graduateId not between", value1, value2, "graduateid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCheckIsNull() {
            addCriterion("check is null");
            return (Criteria) this;
        }

        public Criteria andCheckIsNotNull() {
            addCriterion("check is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEqualTo(Byte value) {
            addCriterion("check =", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotEqualTo(Byte value) {
            addCriterion("check <>", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckGreaterThan(Byte value) {
            addCriterion("check >", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("check >=", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLessThan(Byte value) {
            addCriterion("check <", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLessThanOrEqualTo(Byte value) {
            addCriterion("check <=", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckIn(List<Byte> values) {
            addCriterion("check in", values, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotIn(List<Byte> values) {
            addCriterion("check not in", values, "check");
            return (Criteria) this;
        }

        public Criteria andCheckBetween(Byte value1, Byte value2) {
            addCriterion("check between", value1, value2, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotBetween(Byte value1, Byte value2) {
            addCriterion("check not between", value1, value2, "check");
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