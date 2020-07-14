package com.example.ea_system.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andJobnameIsNull() {
            addCriterion("jobName is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("jobName is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("jobName =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("jobName <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("jobName >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("jobName >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("jobName <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("jobName <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("jobName like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("jobName not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("jobName in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("jobName not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("jobName between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("jobName not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNull() {
            addCriterion("requirement is null");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNotNull() {
            addCriterion("requirement is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementEqualTo(String value) {
            addCriterion("requirement =", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotEqualTo(String value) {
            addCriterion("requirement <>", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThan(String value) {
            addCriterion("requirement >", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("requirement >=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThan(String value) {
            addCriterion("requirement <", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThanOrEqualTo(String value) {
            addCriterion("requirement <=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLike(String value) {
            addCriterion("requirement like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotLike(String value) {
            addCriterion("requirement not like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementIn(List<String> values) {
            addCriterion("requirement in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotIn(List<String> values) {
            addCriterion("requirement not in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementBetween(String value1, String value2) {
            addCriterion("requirement between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotBetween(String value1, String value2) {
            addCriterion("requirement not between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Double value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Double value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Double value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Double value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Double value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Double> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Double> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Double value1, Double value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Double value1, Double value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andOtherpayIsNull() {
            addCriterion("otherPay is null");
            return (Criteria) this;
        }

        public Criteria andOtherpayIsNotNull() {
            addCriterion("otherPay is not null");
            return (Criteria) this;
        }

        public Criteria andOtherpayEqualTo(String value) {
            addCriterion("otherPay =", value, "otherpay");
            return (Criteria) this;
        }

        public Criteria andOtherpayNotEqualTo(String value) {
            addCriterion("otherPay <>", value, "otherpay");
            return (Criteria) this;
        }

        public Criteria andOtherpayGreaterThan(String value) {
            addCriterion("otherPay >", value, "otherpay");
            return (Criteria) this;
        }

        public Criteria andOtherpayGreaterThanOrEqualTo(String value) {
            addCriterion("otherPay >=", value, "otherpay");
            return (Criteria) this;
        }

        public Criteria andOtherpayLessThan(String value) {
            addCriterion("otherPay <", value, "otherpay");
            return (Criteria) this;
        }

        public Criteria andOtherpayLessThanOrEqualTo(String value) {
            addCriterion("otherPay <=", value, "otherpay");
            return (Criteria) this;
        }

        public Criteria andOtherpayLike(String value) {
            addCriterion("otherPay like", value, "otherpay");
            return (Criteria) this;
        }

        public Criteria andOtherpayNotLike(String value) {
            addCriterion("otherPay not like", value, "otherpay");
            return (Criteria) this;
        }

        public Criteria andOtherpayIn(List<String> values) {
            addCriterion("otherPay in", values, "otherpay");
            return (Criteria) this;
        }

        public Criteria andOtherpayNotIn(List<String> values) {
            addCriterion("otherPay not in", values, "otherpay");
            return (Criteria) this;
        }

        public Criteria andOtherpayBetween(String value1, String value2) {
            addCriterion("otherPay between", value1, value2, "otherpay");
            return (Criteria) this;
        }

        public Criteria andOtherpayNotBetween(String value1, String value2) {
            addCriterion("otherPay not between", value1, value2, "otherpay");
            return (Criteria) this;
        }

        public Criteria andClosedateIsNull() {
            addCriterion("closeDate is null");
            return (Criteria) this;
        }

        public Criteria andClosedateIsNotNull() {
            addCriterion("closeDate is not null");
            return (Criteria) this;
        }

        public Criteria andClosedateEqualTo(Date value) {
            addCriterionForJDBCDate("closeDate =", value, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("closeDate <>", value, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateGreaterThan(Date value) {
            addCriterionForJDBCDate("closeDate >", value, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("closeDate >=", value, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateLessThan(Date value) {
            addCriterionForJDBCDate("closeDate <", value, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("closeDate <=", value, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateIn(List<Date> values) {
            addCriterionForJDBCDate("closeDate in", values, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("closeDate not in", values, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("closeDate between", value1, value2, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("closeDate not between", value1, value2, "closedate");
            return (Criteria) this;
        }

        public Criteria andDescribedIsNull() {
            addCriterion("described is null");
            return (Criteria) this;
        }

        public Criteria andDescribedIsNotNull() {
            addCriterion("described is not null");
            return (Criteria) this;
        }

        public Criteria andDescribedEqualTo(String value) {
            addCriterion("described =", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedNotEqualTo(String value) {
            addCriterion("described <>", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedGreaterThan(String value) {
            addCriterion("described >", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedGreaterThanOrEqualTo(String value) {
            addCriterion("described >=", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedLessThan(String value) {
            addCriterion("described <", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedLessThanOrEqualTo(String value) {
            addCriterion("described <=", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedLike(String value) {
            addCriterion("described like", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedNotLike(String value) {
            addCriterion("described not like", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedIn(List<String> values) {
            addCriterion("described in", values, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedNotIn(List<String> values) {
            addCriterion("described not in", values, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedBetween(String value1, String value2) {
            addCriterion("described between", value1, value2, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedNotBetween(String value1, String value2) {
            addCriterion("described not between", value1, value2, "described");
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