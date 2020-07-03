package com.example.ea_system.bean;

import java.util.ArrayList;
import java.util.List;

public class Graduate_Resume_JobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Graduate_Resume_JobExample() {
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

        public Criteria andResumeidIsNull() {
            addCriterion("resumeId is null");
            return (Criteria) this;
        }

        public Criteria andResumeidIsNotNull() {
            addCriterion("resumeId is not null");
            return (Criteria) this;
        }

        public Criteria andResumeidEqualTo(Integer value) {
            addCriterion("resumeId =", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotEqualTo(Integer value) {
            addCriterion("resumeId <>", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThan(Integer value) {
            addCriterion("resumeId >", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resumeId >=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThan(Integer value) {
            addCriterion("resumeId <", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThanOrEqualTo(Integer value) {
            addCriterion("resumeId <=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidIn(List<Integer> values) {
            addCriterion("resumeId in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotIn(List<Integer> values) {
            addCriterion("resumeId not in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidBetween(Integer value1, Integer value2) {
            addCriterion("resumeId between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotBetween(Integer value1, Integer value2) {
            addCriterion("resumeId not between", value1, value2, "resumeid");
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

        public Criteria andJobidIsNull() {
            addCriterion("jobId is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobId is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(Integer value) {
            addCriterion("jobId =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(Integer value) {
            addCriterion("jobId <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(Integer value) {
            addCriterion("jobId >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobId >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(Integer value) {
            addCriterion("jobId <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(Integer value) {
            addCriterion("jobId <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<Integer> values) {
            addCriterion("jobId in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<Integer> values) {
            addCriterion("jobId not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(Integer value1, Integer value2) {
            addCriterion("jobId between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(Integer value1, Integer value2) {
            addCriterion("jobId not between", value1, value2, "jobid");
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