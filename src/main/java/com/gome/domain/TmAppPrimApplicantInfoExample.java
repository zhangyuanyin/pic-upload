package com.gome.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmAppPrimApplicantInfoExample {
    /**
     * tm_app_prim_applicant_info
     */
    protected String orderByClause;

    /**
     * tm_app_prim_applicant_info
     */
    protected boolean distinct;

    /**
     * tm_app_prim_applicant_info
     */
    protected List<Criteria> oredCriteria;

    public TmAppPrimApplicantInfoExample() {
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

    /**
     * tm_app_prim_applicant_info 2018-05-16
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrgIsNull() {
            addCriterion("ORG is null");
            return (Criteria) this;
        }

        public Criteria andOrgIsNotNull() {
            addCriterion("ORG is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEqualTo(String value) {
            addCriterion("ORG =", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotEqualTo(String value) {
            addCriterion("ORG <>", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThan(String value) {
            addCriterion("ORG >", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThanOrEqualTo(String value) {
            addCriterion("ORG >=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThan(String value) {
            addCriterion("ORG <", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThanOrEqualTo(String value) {
            addCriterion("ORG <=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLike(String value) {
            addCriterion("ORG like", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotLike(String value) {
            addCriterion("ORG not like", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgIn(List<String> values) {
            addCriterion("ORG in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotIn(List<String> values) {
            addCriterion("ORG not in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgBetween(String value1, String value2) {
            addCriterion("ORG between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotBetween(String value1, String value2) {
            addCriterion("ORG not between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andAppNoIsNull() {
            addCriterion("APP_NO is null");
            return (Criteria) this;
        }

        public Criteria andAppNoIsNotNull() {
            addCriterion("APP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAppNoEqualTo(String value) {
            addCriterion("APP_NO =", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoNotEqualTo(String value) {
            addCriterion("APP_NO <>", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoGreaterThan(String value) {
            addCriterion("APP_NO >", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoGreaterThanOrEqualTo(String value) {
            addCriterion("APP_NO >=", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoLessThan(String value) {
            addCriterion("APP_NO <", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoLessThanOrEqualTo(String value) {
            addCriterion("APP_NO <=", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoLike(String value) {
            addCriterion("APP_NO like", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoNotLike(String value) {
            addCriterion("APP_NO not like", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoIn(List<String> values) {
            addCriterion("APP_NO in", values, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoNotIn(List<String> values) {
            addCriterion("APP_NO not in", values, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoBetween(String value1, String value2) {
            addCriterion("APP_NO between", value1, value2, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoNotBetween(String value1, String value2) {
            addCriterion("APP_NO not between", value1, value2, "appNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdLastDateIsNull() {
            addCriterion("ID_LAST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andIdLastDateIsNotNull() {
            addCriterion("ID_LAST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andIdLastDateEqualTo(String value) {
            addCriterion("ID_LAST_DATE =", value, "idLastDate");
            return (Criteria) this;
        }

        public Criteria andIdLastDateNotEqualTo(String value) {
            addCriterion("ID_LAST_DATE <>", value, "idLastDate");
            return (Criteria) this;
        }

        public Criteria andIdLastDateGreaterThan(String value) {
            addCriterion("ID_LAST_DATE >", value, "idLastDate");
            return (Criteria) this;
        }

        public Criteria andIdLastDateGreaterThanOrEqualTo(String value) {
            addCriterion("ID_LAST_DATE >=", value, "idLastDate");
            return (Criteria) this;
        }

        public Criteria andIdLastDateLessThan(String value) {
            addCriterion("ID_LAST_DATE <", value, "idLastDate");
            return (Criteria) this;
        }

        public Criteria andIdLastDateLessThanOrEqualTo(String value) {
            addCriterion("ID_LAST_DATE <=", value, "idLastDate");
            return (Criteria) this;
        }

        public Criteria andIdLastDateLike(String value) {
            addCriterion("ID_LAST_DATE like", value, "idLastDate");
            return (Criteria) this;
        }

        public Criteria andIdLastDateNotLike(String value) {
            addCriterion("ID_LAST_DATE not like", value, "idLastDate");
            return (Criteria) this;
        }

        public Criteria andIdLastDateIn(List<String> values) {
            addCriterion("ID_LAST_DATE in", values, "idLastDate");
            return (Criteria) this;
        }

        public Criteria andIdLastDateNotIn(List<String> values) {
            addCriterion("ID_LAST_DATE not in", values, "idLastDate");
            return (Criteria) this;
        }

        public Criteria andIdLastDateBetween(String value1, String value2) {
            addCriterion("ID_LAST_DATE between", value1, value2, "idLastDate");
            return (Criteria) this;
        }

        public Criteria andIdLastDateNotBetween(String value1, String value2) {
            addCriterion("ID_LAST_DATE not between", value1, value2, "idLastDate");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveIsNull() {
            addCriterion("ID_LONG_EFFECTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveIsNotNull() {
            addCriterion("ID_LONG_EFFECTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveEqualTo(String value) {
            addCriterion("ID_LONG_EFFECTIVE =", value, "idLongEffective");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveNotEqualTo(String value) {
            addCriterion("ID_LONG_EFFECTIVE <>", value, "idLongEffective");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveGreaterThan(String value) {
            addCriterion("ID_LONG_EFFECTIVE >", value, "idLongEffective");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveGreaterThanOrEqualTo(String value) {
            addCriterion("ID_LONG_EFFECTIVE >=", value, "idLongEffective");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveLessThan(String value) {
            addCriterion("ID_LONG_EFFECTIVE <", value, "idLongEffective");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveLessThanOrEqualTo(String value) {
            addCriterion("ID_LONG_EFFECTIVE <=", value, "idLongEffective");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveLike(String value) {
            addCriterion("ID_LONG_EFFECTIVE like", value, "idLongEffective");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveNotLike(String value) {
            addCriterion("ID_LONG_EFFECTIVE not like", value, "idLongEffective");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveIn(List<String> values) {
            addCriterion("ID_LONG_EFFECTIVE in", values, "idLongEffective");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveNotIn(List<String> values) {
            addCriterion("ID_LONG_EFFECTIVE not in", values, "idLongEffective");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveBetween(String value1, String value2) {
            addCriterion("ID_LONG_EFFECTIVE between", value1, value2, "idLongEffective");
            return (Criteria) this;
        }

        public Criteria andIdLongEffectiveNotBetween(String value1, String value2) {
            addCriterion("ID_LONG_EFFECTIVE not between", value1, value2, "idLongEffective");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNull() {
            addCriterion("CELLPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNotNull() {
            addCriterion("CELLPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCellphoneEqualTo(String value) {
            addCriterion("CELLPHONE =", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotEqualTo(String value) {
            addCriterion("CELLPHONE <>", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThan(String value) {
            addCriterion("CELLPHONE >", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CELLPHONE >=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThan(String value) {
            addCriterion("CELLPHONE <", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThanOrEqualTo(String value) {
            addCriterion("CELLPHONE <=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLike(String value) {
            addCriterion("CELLPHONE like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotLike(String value) {
            addCriterion("CELLPHONE not like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneIn(List<String> values) {
            addCriterion("CELLPHONE in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotIn(List<String> values) {
            addCriterion("CELLPHONE not in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneBetween(String value1, String value2) {
            addCriterion("CELLPHONE between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotBetween(String value1, String value2) {
            addCriterion("CELLPHONE not between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIsNull() {
            addCriterion("MONTH_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIsNotNull() {
            addCriterion("MONTH_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeEqualTo(BigDecimal value) {
            addCriterion("MONTH_INCOME =", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotEqualTo(BigDecimal value) {
            addCriterion("MONTH_INCOME <>", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeGreaterThan(BigDecimal value) {
            addCriterion("MONTH_INCOME >", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTH_INCOME >=", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLessThan(BigDecimal value) {
            addCriterion("MONTH_INCOME <", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTH_INCOME <=", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIn(List<BigDecimal> values) {
            addCriterion("MONTH_INCOME in", values, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotIn(List<BigDecimal> values) {
            addCriterion("MONTH_INCOME not in", values, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTH_INCOME between", value1, value2, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTH_INCOME not between", value1, value2, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeIsNull() {
            addCriterion("OTHER_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeIsNotNull() {
            addCriterion("OTHER_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeEqualTo(BigDecimal value) {
            addCriterion("OTHER_INCOME =", value, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeNotEqualTo(BigDecimal value) {
            addCriterion("OTHER_INCOME <>", value, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeGreaterThan(BigDecimal value) {
            addCriterion("OTHER_INCOME >", value, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_INCOME >=", value, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeLessThan(BigDecimal value) {
            addCriterion("OTHER_INCOME <", value, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_INCOME <=", value, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeIn(List<BigDecimal> values) {
            addCriterion("OTHER_INCOME in", values, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeNotIn(List<BigDecimal> values) {
            addCriterion("OTHER_INCOME not in", values, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_INCOME between", value1, value2, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andOtherIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_INCOME not between", value1, value2, "otherIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeIsNull() {
            addCriterion("YEAR_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andYearIncomeIsNotNull() {
            addCriterion("YEAR_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andYearIncomeEqualTo(BigDecimal value) {
            addCriterion("YEAR_INCOME =", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeNotEqualTo(BigDecimal value) {
            addCriterion("YEAR_INCOME <>", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeGreaterThan(BigDecimal value) {
            addCriterion("YEAR_INCOME >", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEAR_INCOME >=", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeLessThan(BigDecimal value) {
            addCriterion("YEAR_INCOME <", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEAR_INCOME <=", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeIn(List<BigDecimal> values) {
            addCriterion("YEAR_INCOME in", values, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeNotIn(List<BigDecimal> values) {
            addCriterion("YEAR_INCOME not in", values, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEAR_INCOME between", value1, value2, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEAR_INCOME not between", value1, value2, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andOtherLoanIsNull() {
            addCriterion("OTHER_LOAN is null");
            return (Criteria) this;
        }

        public Criteria andOtherLoanIsNotNull() {
            addCriterion("OTHER_LOAN is not null");
            return (Criteria) this;
        }

        public Criteria andOtherLoanEqualTo(BigDecimal value) {
            addCriterion("OTHER_LOAN =", value, "otherLoan");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNotEqualTo(BigDecimal value) {
            addCriterion("OTHER_LOAN <>", value, "otherLoan");
            return (Criteria) this;
        }

        public Criteria andOtherLoanGreaterThan(BigDecimal value) {
            addCriterion("OTHER_LOAN >", value, "otherLoan");
            return (Criteria) this;
        }

        public Criteria andOtherLoanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_LOAN >=", value, "otherLoan");
            return (Criteria) this;
        }

        public Criteria andOtherLoanLessThan(BigDecimal value) {
            addCriterion("OTHER_LOAN <", value, "otherLoan");
            return (Criteria) this;
        }

        public Criteria andOtherLoanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_LOAN <=", value, "otherLoan");
            return (Criteria) this;
        }

        public Criteria andOtherLoanIn(List<BigDecimal> values) {
            addCriterion("OTHER_LOAN in", values, "otherLoan");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNotIn(List<BigDecimal> values) {
            addCriterion("OTHER_LOAN not in", values, "otherLoan");
            return (Criteria) this;
        }

        public Criteria andOtherLoanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_LOAN between", value1, value2, "otherLoan");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_LOAN not between", value1, value2, "otherLoan");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("BANK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("BANK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("BANK_CODE =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("BANK_CODE <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("BANK_CODE >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CODE >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("BANK_CODE <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("BANK_CODE <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("BANK_CODE like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("BANK_CODE not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("BANK_CODE in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("BANK_CODE not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("BANK_CODE between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("BANK_CODE not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNull() {
            addCriterion("BANK_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNotNull() {
            addCriterion("BANK_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoEqualTo(String value) {
            addCriterion("BANK_CARD_NO =", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotEqualTo(String value) {
            addCriterion("BANK_CARD_NO <>", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThan(String value) {
            addCriterion("BANK_CARD_NO >", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NO >=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThan(String value) {
            addCriterion("BANK_CARD_NO <", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NO <=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLike(String value) {
            addCriterion("BANK_CARD_NO like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotLike(String value) {
            addCriterion("BANK_CARD_NO not like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIn(List<String> values) {
            addCriterion("BANK_CARD_NO in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotIn(List<String> values) {
            addCriterion("BANK_CARD_NO not in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NO between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NO not between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeIsNull() {
            addCriterion("BANK_PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeIsNotNull() {
            addCriterion("BANK_PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeEqualTo(String value) {
            addCriterion("BANK_PROVINCE_CODE =", value, "bankProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeNotEqualTo(String value) {
            addCriterion("BANK_PROVINCE_CODE <>", value, "bankProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeGreaterThan(String value) {
            addCriterion("BANK_PROVINCE_CODE >", value, "bankProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_PROVINCE_CODE >=", value, "bankProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeLessThan(String value) {
            addCriterion("BANK_PROVINCE_CODE <", value, "bankProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("BANK_PROVINCE_CODE <=", value, "bankProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeLike(String value) {
            addCriterion("BANK_PROVINCE_CODE like", value, "bankProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeNotLike(String value) {
            addCriterion("BANK_PROVINCE_CODE not like", value, "bankProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeIn(List<String> values) {
            addCriterion("BANK_PROVINCE_CODE in", values, "bankProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeNotIn(List<String> values) {
            addCriterion("BANK_PROVINCE_CODE not in", values, "bankProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeBetween(String value1, String value2) {
            addCriterion("BANK_PROVINCE_CODE between", value1, value2, "bankProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("BANK_PROVINCE_CODE not between", value1, value2, "bankProvinceCode");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameIsNull() {
            addCriterion("BANK_PROVINCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameIsNotNull() {
            addCriterion("BANK_PROVINCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameEqualTo(String value) {
            addCriterion("BANK_PROVINCE_NAME =", value, "bankProvinceName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameNotEqualTo(String value) {
            addCriterion("BANK_PROVINCE_NAME <>", value, "bankProvinceName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameGreaterThan(String value) {
            addCriterion("BANK_PROVINCE_NAME >", value, "bankProvinceName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_PROVINCE_NAME >=", value, "bankProvinceName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameLessThan(String value) {
            addCriterion("BANK_PROVINCE_NAME <", value, "bankProvinceName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_PROVINCE_NAME <=", value, "bankProvinceName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameLike(String value) {
            addCriterion("BANK_PROVINCE_NAME like", value, "bankProvinceName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameNotLike(String value) {
            addCriterion("BANK_PROVINCE_NAME not like", value, "bankProvinceName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameIn(List<String> values) {
            addCriterion("BANK_PROVINCE_NAME in", values, "bankProvinceName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameNotIn(List<String> values) {
            addCriterion("BANK_PROVINCE_NAME not in", values, "bankProvinceName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameBetween(String value1, String value2) {
            addCriterion("BANK_PROVINCE_NAME between", value1, value2, "bankProvinceName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNameNotBetween(String value1, String value2) {
            addCriterion("BANK_PROVINCE_NAME not between", value1, value2, "bankProvinceName");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeIsNull() {
            addCriterion("BANK_CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeIsNotNull() {
            addCriterion("BANK_CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeEqualTo(String value) {
            addCriterion("BANK_CITY_CODE =", value, "bankCityCode");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeNotEqualTo(String value) {
            addCriterion("BANK_CITY_CODE <>", value, "bankCityCode");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeGreaterThan(String value) {
            addCriterion("BANK_CITY_CODE >", value, "bankCityCode");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CITY_CODE >=", value, "bankCityCode");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeLessThan(String value) {
            addCriterion("BANK_CITY_CODE <", value, "bankCityCode");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeLessThanOrEqualTo(String value) {
            addCriterion("BANK_CITY_CODE <=", value, "bankCityCode");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeLike(String value) {
            addCriterion("BANK_CITY_CODE like", value, "bankCityCode");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeNotLike(String value) {
            addCriterion("BANK_CITY_CODE not like", value, "bankCityCode");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeIn(List<String> values) {
            addCriterion("BANK_CITY_CODE in", values, "bankCityCode");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeNotIn(List<String> values) {
            addCriterion("BANK_CITY_CODE not in", values, "bankCityCode");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeBetween(String value1, String value2) {
            addCriterion("BANK_CITY_CODE between", value1, value2, "bankCityCode");
            return (Criteria) this;
        }

        public Criteria andBankCityCodeNotBetween(String value1, String value2) {
            addCriterion("BANK_CITY_CODE not between", value1, value2, "bankCityCode");
            return (Criteria) this;
        }

        public Criteria andBankCityNameIsNull() {
            addCriterion("BANK_CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankCityNameIsNotNull() {
            addCriterion("BANK_CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankCityNameEqualTo(String value) {
            addCriterion("BANK_CITY_NAME =", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameNotEqualTo(String value) {
            addCriterion("BANK_CITY_NAME <>", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameGreaterThan(String value) {
            addCriterion("BANK_CITY_NAME >", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CITY_NAME >=", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameLessThan(String value) {
            addCriterion("BANK_CITY_NAME <", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_CITY_NAME <=", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameLike(String value) {
            addCriterion("BANK_CITY_NAME like", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameNotLike(String value) {
            addCriterion("BANK_CITY_NAME not like", value, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameIn(List<String> values) {
            addCriterion("BANK_CITY_NAME in", values, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameNotIn(List<String> values) {
            addCriterion("BANK_CITY_NAME not in", values, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameBetween(String value1, String value2) {
            addCriterion("BANK_CITY_NAME between", value1, value2, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andBankCityNameNotBetween(String value1, String value2) {
            addCriterion("BANK_CITY_NAME not between", value1, value2, "bankCityName");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNull() {
            addCriterion("HOME_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNotNull() {
            addCriterion("HOME_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneEqualTo(String value) {
            addCriterion("HOME_PHONE =", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotEqualTo(String value) {
            addCriterion("HOME_PHONE <>", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThan(String value) {
            addCriterion("HOME_PHONE >", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_PHONE >=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThan(String value) {
            addCriterion("HOME_PHONE <", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThanOrEqualTo(String value) {
            addCriterion("HOME_PHONE <=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLike(String value) {
            addCriterion("HOME_PHONE like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotLike(String value) {
            addCriterion("HOME_PHONE not like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIn(List<String> values) {
            addCriterion("HOME_PHONE in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotIn(List<String> values) {
            addCriterion("HOME_PHONE not in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneBetween(String value1, String value2) {
            addCriterion("HOME_PHONE between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotBetween(String value1, String value2) {
            addCriterion("HOME_PHONE not between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAbodeStateIsNull() {
            addCriterion("ABODE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAbodeStateIsNotNull() {
            addCriterion("ABODE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAbodeStateEqualTo(String value) {
            addCriterion("ABODE_STATE =", value, "abodeState");
            return (Criteria) this;
        }

        public Criteria andAbodeStateNotEqualTo(String value) {
            addCriterion("ABODE_STATE <>", value, "abodeState");
            return (Criteria) this;
        }

        public Criteria andAbodeStateGreaterThan(String value) {
            addCriterion("ABODE_STATE >", value, "abodeState");
            return (Criteria) this;
        }

        public Criteria andAbodeStateGreaterThanOrEqualTo(String value) {
            addCriterion("ABODE_STATE >=", value, "abodeState");
            return (Criteria) this;
        }

        public Criteria andAbodeStateLessThan(String value) {
            addCriterion("ABODE_STATE <", value, "abodeState");
            return (Criteria) this;
        }

        public Criteria andAbodeStateLessThanOrEqualTo(String value) {
            addCriterion("ABODE_STATE <=", value, "abodeState");
            return (Criteria) this;
        }

        public Criteria andAbodeStateLike(String value) {
            addCriterion("ABODE_STATE like", value, "abodeState");
            return (Criteria) this;
        }

        public Criteria andAbodeStateNotLike(String value) {
            addCriterion("ABODE_STATE not like", value, "abodeState");
            return (Criteria) this;
        }

        public Criteria andAbodeStateIn(List<String> values) {
            addCriterion("ABODE_STATE in", values, "abodeState");
            return (Criteria) this;
        }

        public Criteria andAbodeStateNotIn(List<String> values) {
            addCriterion("ABODE_STATE not in", values, "abodeState");
            return (Criteria) this;
        }

        public Criteria andAbodeStateBetween(String value1, String value2) {
            addCriterion("ABODE_STATE between", value1, value2, "abodeState");
            return (Criteria) this;
        }

        public Criteria andAbodeStateNotBetween(String value1, String value2) {
            addCriterion("ABODE_STATE not between", value1, value2, "abodeState");
            return (Criteria) this;
        }

        public Criteria andAbodeCityIsNull() {
            addCriterion("ABODE_CITY is null");
            return (Criteria) this;
        }

        public Criteria andAbodeCityIsNotNull() {
            addCriterion("ABODE_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andAbodeCityEqualTo(String value) {
            addCriterion("ABODE_CITY =", value, "abodeCity");
            return (Criteria) this;
        }

        public Criteria andAbodeCityNotEqualTo(String value) {
            addCriterion("ABODE_CITY <>", value, "abodeCity");
            return (Criteria) this;
        }

        public Criteria andAbodeCityGreaterThan(String value) {
            addCriterion("ABODE_CITY >", value, "abodeCity");
            return (Criteria) this;
        }

        public Criteria andAbodeCityGreaterThanOrEqualTo(String value) {
            addCriterion("ABODE_CITY >=", value, "abodeCity");
            return (Criteria) this;
        }

        public Criteria andAbodeCityLessThan(String value) {
            addCriterion("ABODE_CITY <", value, "abodeCity");
            return (Criteria) this;
        }

        public Criteria andAbodeCityLessThanOrEqualTo(String value) {
            addCriterion("ABODE_CITY <=", value, "abodeCity");
            return (Criteria) this;
        }

        public Criteria andAbodeCityLike(String value) {
            addCriterion("ABODE_CITY like", value, "abodeCity");
            return (Criteria) this;
        }

        public Criteria andAbodeCityNotLike(String value) {
            addCriterion("ABODE_CITY not like", value, "abodeCity");
            return (Criteria) this;
        }

        public Criteria andAbodeCityIn(List<String> values) {
            addCriterion("ABODE_CITY in", values, "abodeCity");
            return (Criteria) this;
        }

        public Criteria andAbodeCityNotIn(List<String> values) {
            addCriterion("ABODE_CITY not in", values, "abodeCity");
            return (Criteria) this;
        }

        public Criteria andAbodeCityBetween(String value1, String value2) {
            addCriterion("ABODE_CITY between", value1, value2, "abodeCity");
            return (Criteria) this;
        }

        public Criteria andAbodeCityNotBetween(String value1, String value2) {
            addCriterion("ABODE_CITY not between", value1, value2, "abodeCity");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneIsNull() {
            addCriterion("ABODE_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneIsNotNull() {
            addCriterion("ABODE_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneEqualTo(String value) {
            addCriterion("ABODE_ZONE =", value, "abodeZone");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneNotEqualTo(String value) {
            addCriterion("ABODE_ZONE <>", value, "abodeZone");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneGreaterThan(String value) {
            addCriterion("ABODE_ZONE >", value, "abodeZone");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneGreaterThanOrEqualTo(String value) {
            addCriterion("ABODE_ZONE >=", value, "abodeZone");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneLessThan(String value) {
            addCriterion("ABODE_ZONE <", value, "abodeZone");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneLessThanOrEqualTo(String value) {
            addCriterion("ABODE_ZONE <=", value, "abodeZone");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneLike(String value) {
            addCriterion("ABODE_ZONE like", value, "abodeZone");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneNotLike(String value) {
            addCriterion("ABODE_ZONE not like", value, "abodeZone");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneIn(List<String> values) {
            addCriterion("ABODE_ZONE in", values, "abodeZone");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneNotIn(List<String> values) {
            addCriterion("ABODE_ZONE not in", values, "abodeZone");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneBetween(String value1, String value2) {
            addCriterion("ABODE_ZONE between", value1, value2, "abodeZone");
            return (Criteria) this;
        }

        public Criteria andAbodeZoneNotBetween(String value1, String value2) {
            addCriterion("ABODE_ZONE not between", value1, value2, "abodeZone");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailIsNull() {
            addCriterion("ABODE_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailIsNotNull() {
            addCriterion("ABODE_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailEqualTo(String value) {
            addCriterion("ABODE_DETAIL =", value, "abodeDetail");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailNotEqualTo(String value) {
            addCriterion("ABODE_DETAIL <>", value, "abodeDetail");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailGreaterThan(String value) {
            addCriterion("ABODE_DETAIL >", value, "abodeDetail");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailGreaterThanOrEqualTo(String value) {
            addCriterion("ABODE_DETAIL >=", value, "abodeDetail");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailLessThan(String value) {
            addCriterion("ABODE_DETAIL <", value, "abodeDetail");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailLessThanOrEqualTo(String value) {
            addCriterion("ABODE_DETAIL <=", value, "abodeDetail");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailLike(String value) {
            addCriterion("ABODE_DETAIL like", value, "abodeDetail");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailNotLike(String value) {
            addCriterion("ABODE_DETAIL not like", value, "abodeDetail");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailIn(List<String> values) {
            addCriterion("ABODE_DETAIL in", values, "abodeDetail");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailNotIn(List<String> values) {
            addCriterion("ABODE_DETAIL not in", values, "abodeDetail");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailBetween(String value1, String value2) {
            addCriterion("ABODE_DETAIL between", value1, value2, "abodeDetail");
            return (Criteria) this;
        }

        public Criteria andAbodeDetailNotBetween(String value1, String value2) {
            addCriterion("ABODE_DETAIL not between", value1, value2, "abodeDetail");
            return (Criteria) this;
        }

        public Criteria andQualificationIsNull() {
            addCriterion("QUALIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andQualificationIsNotNull() {
            addCriterion("QUALIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationEqualTo(String value) {
            addCriterion("QUALIFICATION =", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotEqualTo(String value) {
            addCriterion("QUALIFICATION <>", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationGreaterThan(String value) {
            addCriterion("QUALIFICATION >", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationGreaterThanOrEqualTo(String value) {
            addCriterion("QUALIFICATION >=", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationLessThan(String value) {
            addCriterion("QUALIFICATION <", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationLessThanOrEqualTo(String value) {
            addCriterion("QUALIFICATION <=", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationLike(String value) {
            addCriterion("QUALIFICATION like", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotLike(String value) {
            addCriterion("QUALIFICATION not like", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationIn(List<String> values) {
            addCriterion("QUALIFICATION in", values, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotIn(List<String> values) {
            addCriterion("QUALIFICATION not in", values, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationBetween(String value1, String value2) {
            addCriterion("QUALIFICATION between", value1, value2, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotBetween(String value1, String value2) {
            addCriterion("QUALIFICATION not between", value1, value2, "qualification");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityIsNull() {
            addCriterion("SOCIAL_IDENTITY is null");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityIsNotNull() {
            addCriterion("SOCIAL_IDENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityEqualTo(String value) {
            addCriterion("SOCIAL_IDENTITY =", value, "socialIdentity");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityNotEqualTo(String value) {
            addCriterion("SOCIAL_IDENTITY <>", value, "socialIdentity");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityGreaterThan(String value) {
            addCriterion("SOCIAL_IDENTITY >", value, "socialIdentity");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIAL_IDENTITY >=", value, "socialIdentity");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityLessThan(String value) {
            addCriterion("SOCIAL_IDENTITY <", value, "socialIdentity");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityLessThanOrEqualTo(String value) {
            addCriterion("SOCIAL_IDENTITY <=", value, "socialIdentity");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityLike(String value) {
            addCriterion("SOCIAL_IDENTITY like", value, "socialIdentity");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityNotLike(String value) {
            addCriterion("SOCIAL_IDENTITY not like", value, "socialIdentity");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityIn(List<String> values) {
            addCriterion("SOCIAL_IDENTITY in", values, "socialIdentity");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityNotIn(List<String> values) {
            addCriterion("SOCIAL_IDENTITY not in", values, "socialIdentity");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityBetween(String value1, String value2) {
            addCriterion("SOCIAL_IDENTITY between", value1, value2, "socialIdentity");
            return (Criteria) this;
        }

        public Criteria andSocialIdentityNotBetween(String value1, String value2) {
            addCriterion("SOCIAL_IDENTITY not between", value1, value2, "socialIdentity");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromIsNull() {
            addCriterion("WORK_STAND_FROM is null");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromIsNotNull() {
            addCriterion("WORK_STAND_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromEqualTo(String value) {
            addCriterion("WORK_STAND_FROM =", value, "workStandFrom");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromNotEqualTo(String value) {
            addCriterion("WORK_STAND_FROM <>", value, "workStandFrom");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromGreaterThan(String value) {
            addCriterion("WORK_STAND_FROM >", value, "workStandFrom");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_STAND_FROM >=", value, "workStandFrom");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromLessThan(String value) {
            addCriterion("WORK_STAND_FROM <", value, "workStandFrom");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromLessThanOrEqualTo(String value) {
            addCriterion("WORK_STAND_FROM <=", value, "workStandFrom");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromLike(String value) {
            addCriterion("WORK_STAND_FROM like", value, "workStandFrom");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromNotLike(String value) {
            addCriterion("WORK_STAND_FROM not like", value, "workStandFrom");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromIn(List<String> values) {
            addCriterion("WORK_STAND_FROM in", values, "workStandFrom");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromNotIn(List<String> values) {
            addCriterion("WORK_STAND_FROM not in", values, "workStandFrom");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromBetween(String value1, String value2) {
            addCriterion("WORK_STAND_FROM between", value1, value2, "workStandFrom");
            return (Criteria) this;
        }

        public Criteria andWorkStandFromNotBetween(String value1, String value2) {
            addCriterion("WORK_STAND_FROM not between", value1, value2, "workStandFrom");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingIsNull() {
            addCriterion("LENGTH_OF_SCHOOLING is null");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingIsNotNull() {
            addCriterion("LENGTH_OF_SCHOOLING is not null");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingEqualTo(String value) {
            addCriterion("LENGTH_OF_SCHOOLING =", value, "lengthOfSchooling");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingNotEqualTo(String value) {
            addCriterion("LENGTH_OF_SCHOOLING <>", value, "lengthOfSchooling");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingGreaterThan(String value) {
            addCriterion("LENGTH_OF_SCHOOLING >", value, "lengthOfSchooling");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingGreaterThanOrEqualTo(String value) {
            addCriterion("LENGTH_OF_SCHOOLING >=", value, "lengthOfSchooling");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingLessThan(String value) {
            addCriterion("LENGTH_OF_SCHOOLING <", value, "lengthOfSchooling");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingLessThanOrEqualTo(String value) {
            addCriterion("LENGTH_OF_SCHOOLING <=", value, "lengthOfSchooling");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingLike(String value) {
            addCriterion("LENGTH_OF_SCHOOLING like", value, "lengthOfSchooling");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingNotLike(String value) {
            addCriterion("LENGTH_OF_SCHOOLING not like", value, "lengthOfSchooling");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingIn(List<String> values) {
            addCriterion("LENGTH_OF_SCHOOLING in", values, "lengthOfSchooling");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingNotIn(List<String> values) {
            addCriterion("LENGTH_OF_SCHOOLING not in", values, "lengthOfSchooling");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingBetween(String value1, String value2) {
            addCriterion("LENGTH_OF_SCHOOLING between", value1, value2, "lengthOfSchooling");
            return (Criteria) this;
        }

        public Criteria andLengthOfSchoolingNotBetween(String value1, String value2) {
            addCriterion("LENGTH_OF_SCHOOLING not between", value1, value2, "lengthOfSchooling");
            return (Criteria) this;
        }

        public Criteria andYearsOfWorkIsNull() {
            addCriterion("YEARS_OF_WORK is null");
            return (Criteria) this;
        }

        public Criteria andYearsOfWorkIsNotNull() {
            addCriterion("YEARS_OF_WORK is not null");
            return (Criteria) this;
        }

        public Criteria andYearsOfWorkEqualTo(Short value) {
            addCriterion("YEARS_OF_WORK =", value, "yearsOfWork");
            return (Criteria) this;
        }

        public Criteria andYearsOfWorkNotEqualTo(Short value) {
            addCriterion("YEARS_OF_WORK <>", value, "yearsOfWork");
            return (Criteria) this;
        }

        public Criteria andYearsOfWorkGreaterThan(Short value) {
            addCriterion("YEARS_OF_WORK >", value, "yearsOfWork");
            return (Criteria) this;
        }

        public Criteria andYearsOfWorkGreaterThanOrEqualTo(Short value) {
            addCriterion("YEARS_OF_WORK >=", value, "yearsOfWork");
            return (Criteria) this;
        }

        public Criteria andYearsOfWorkLessThan(Short value) {
            addCriterion("YEARS_OF_WORK <", value, "yearsOfWork");
            return (Criteria) this;
        }

        public Criteria andYearsOfWorkLessThanOrEqualTo(Short value) {
            addCriterion("YEARS_OF_WORK <=", value, "yearsOfWork");
            return (Criteria) this;
        }

        public Criteria andYearsOfWorkIn(List<Short> values) {
            addCriterion("YEARS_OF_WORK in", values, "yearsOfWork");
            return (Criteria) this;
        }

        public Criteria andYearsOfWorkNotIn(List<Short> values) {
            addCriterion("YEARS_OF_WORK not in", values, "yearsOfWork");
            return (Criteria) this;
        }

        public Criteria andYearsOfWorkBetween(Short value1, Short value2) {
            addCriterion("YEARS_OF_WORK between", value1, value2, "yearsOfWork");
            return (Criteria) this;
        }

        public Criteria andYearsOfWorkNotBetween(Short value1, Short value2) {
            addCriterion("YEARS_OF_WORK not between", value1, value2, "yearsOfWork");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromIsNull() {
            addCriterion("EMP_STAND_FROM is null");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromIsNotNull() {
            addCriterion("EMP_STAND_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromEqualTo(String value) {
            addCriterion("EMP_STAND_FROM =", value, "empStandFrom");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromNotEqualTo(String value) {
            addCriterion("EMP_STAND_FROM <>", value, "empStandFrom");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromGreaterThan(String value) {
            addCriterion("EMP_STAND_FROM >", value, "empStandFrom");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_STAND_FROM >=", value, "empStandFrom");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromLessThan(String value) {
            addCriterion("EMP_STAND_FROM <", value, "empStandFrom");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromLessThanOrEqualTo(String value) {
            addCriterion("EMP_STAND_FROM <=", value, "empStandFrom");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromLike(String value) {
            addCriterion("EMP_STAND_FROM like", value, "empStandFrom");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromNotLike(String value) {
            addCriterion("EMP_STAND_FROM not like", value, "empStandFrom");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromIn(List<String> values) {
            addCriterion("EMP_STAND_FROM in", values, "empStandFrom");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromNotIn(List<String> values) {
            addCriterion("EMP_STAND_FROM not in", values, "empStandFrom");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromBetween(String value1, String value2) {
            addCriterion("EMP_STAND_FROM between", value1, value2, "empStandFrom");
            return (Criteria) this;
        }

        public Criteria andEmpStandFromNotBetween(String value1, String value2) {
            addCriterion("EMP_STAND_FROM not between", value1, value2, "empStandFrom");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("UNIT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("UNIT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("UNIT_NAME =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("UNIT_NAME <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("UNIT_NAME >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_NAME >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("UNIT_NAME <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("UNIT_NAME <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("UNIT_NAME like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("UNIT_NAME not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("UNIT_NAME in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("UNIT_NAME not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("UNIT_NAME between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("UNIT_NAME not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIsNull() {
            addCriterion("EMP_DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIsNotNull() {
            addCriterion("EMP_DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentEqualTo(String value) {
            addCriterion("EMP_DEPARTMENT =", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentNotEqualTo(String value) {
            addCriterion("EMP_DEPARTMENT <>", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentGreaterThan(String value) {
            addCriterion("EMP_DEPARTMENT >", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_DEPARTMENT >=", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentLessThan(String value) {
            addCriterion("EMP_DEPARTMENT <", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentLessThanOrEqualTo(String value) {
            addCriterion("EMP_DEPARTMENT <=", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentLike(String value) {
            addCriterion("EMP_DEPARTMENT like", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentNotLike(String value) {
            addCriterion("EMP_DEPARTMENT not like", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIn(List<String> values) {
            addCriterion("EMP_DEPARTMENT in", values, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentNotIn(List<String> values) {
            addCriterion("EMP_DEPARTMENT not in", values, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentBetween(String value1, String value2) {
            addCriterion("EMP_DEPARTMENT between", value1, value2, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentNotBetween(String value1, String value2) {
            addCriterion("EMP_DEPARTMENT not between", value1, value2, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpPostIsNull() {
            addCriterion("EMP_POST is null");
            return (Criteria) this;
        }

        public Criteria andEmpPostIsNotNull() {
            addCriterion("EMP_POST is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPostEqualTo(String value) {
            addCriterion("EMP_POST =", value, "empPost");
            return (Criteria) this;
        }

        public Criteria andEmpPostNotEqualTo(String value) {
            addCriterion("EMP_POST <>", value, "empPost");
            return (Criteria) this;
        }

        public Criteria andEmpPostGreaterThan(String value) {
            addCriterion("EMP_POST >", value, "empPost");
            return (Criteria) this;
        }

        public Criteria andEmpPostGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_POST >=", value, "empPost");
            return (Criteria) this;
        }

        public Criteria andEmpPostLessThan(String value) {
            addCriterion("EMP_POST <", value, "empPost");
            return (Criteria) this;
        }

        public Criteria andEmpPostLessThanOrEqualTo(String value) {
            addCriterion("EMP_POST <=", value, "empPost");
            return (Criteria) this;
        }

        public Criteria andEmpPostLike(String value) {
            addCriterion("EMP_POST like", value, "empPost");
            return (Criteria) this;
        }

        public Criteria andEmpPostNotLike(String value) {
            addCriterion("EMP_POST not like", value, "empPost");
            return (Criteria) this;
        }

        public Criteria andEmpPostIn(List<String> values) {
            addCriterion("EMP_POST in", values, "empPost");
            return (Criteria) this;
        }

        public Criteria andEmpPostNotIn(List<String> values) {
            addCriterion("EMP_POST not in", values, "empPost");
            return (Criteria) this;
        }

        public Criteria andEmpPostBetween(String value1, String value2) {
            addCriterion("EMP_POST between", value1, value2, "empPost");
            return (Criteria) this;
        }

        public Criteria andEmpPostNotBetween(String value1, String value2) {
            addCriterion("EMP_POST not between", value1, value2, "empPost");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIsNull() {
            addCriterion("EMP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIsNotNull() {
            addCriterion("EMP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEmpTypeEqualTo(String value) {
            addCriterion("EMP_TYPE =", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeNotEqualTo(String value) {
            addCriterion("EMP_TYPE <>", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeGreaterThan(String value) {
            addCriterion("EMP_TYPE >", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_TYPE >=", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeLessThan(String value) {
            addCriterion("EMP_TYPE <", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeLessThanOrEqualTo(String value) {
            addCriterion("EMP_TYPE <=", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeLike(String value) {
            addCriterion("EMP_TYPE like", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeNotLike(String value) {
            addCriterion("EMP_TYPE not like", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIn(List<String> values) {
            addCriterion("EMP_TYPE in", values, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeNotIn(List<String> values) {
            addCriterion("EMP_TYPE not in", values, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeBetween(String value1, String value2) {
            addCriterion("EMP_TYPE between", value1, value2, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeNotBetween(String value1, String value2) {
            addCriterion("EMP_TYPE not between", value1, value2, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpStructureIsNull() {
            addCriterion("EMP_STRUCTURE is null");
            return (Criteria) this;
        }

        public Criteria andEmpStructureIsNotNull() {
            addCriterion("EMP_STRUCTURE is not null");
            return (Criteria) this;
        }

        public Criteria andEmpStructureEqualTo(String value) {
            addCriterion("EMP_STRUCTURE =", value, "empStructure");
            return (Criteria) this;
        }

        public Criteria andEmpStructureNotEqualTo(String value) {
            addCriterion("EMP_STRUCTURE <>", value, "empStructure");
            return (Criteria) this;
        }

        public Criteria andEmpStructureGreaterThan(String value) {
            addCriterion("EMP_STRUCTURE >", value, "empStructure");
            return (Criteria) this;
        }

        public Criteria andEmpStructureGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_STRUCTURE >=", value, "empStructure");
            return (Criteria) this;
        }

        public Criteria andEmpStructureLessThan(String value) {
            addCriterion("EMP_STRUCTURE <", value, "empStructure");
            return (Criteria) this;
        }

        public Criteria andEmpStructureLessThanOrEqualTo(String value) {
            addCriterion("EMP_STRUCTURE <=", value, "empStructure");
            return (Criteria) this;
        }

        public Criteria andEmpStructureLike(String value) {
            addCriterion("EMP_STRUCTURE like", value, "empStructure");
            return (Criteria) this;
        }

        public Criteria andEmpStructureNotLike(String value) {
            addCriterion("EMP_STRUCTURE not like", value, "empStructure");
            return (Criteria) this;
        }

        public Criteria andEmpStructureIn(List<String> values) {
            addCriterion("EMP_STRUCTURE in", values, "empStructure");
            return (Criteria) this;
        }

        public Criteria andEmpStructureNotIn(List<String> values) {
            addCriterion("EMP_STRUCTURE not in", values, "empStructure");
            return (Criteria) this;
        }

        public Criteria andEmpStructureBetween(String value1, String value2) {
            addCriterion("EMP_STRUCTURE between", value1, value2, "empStructure");
            return (Criteria) this;
        }

        public Criteria andEmpStructureNotBetween(String value1, String value2) {
            addCriterion("EMP_STRUCTURE not between", value1, value2, "empStructure");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNull() {
            addCriterion("EMP_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNotNull() {
            addCriterion("EMP_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneEqualTo(String value) {
            addCriterion("EMP_PHONE =", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotEqualTo(String value) {
            addCriterion("EMP_PHONE <>", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThan(String value) {
            addCriterion("EMP_PHONE >", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_PHONE >=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThan(String value) {
            addCriterion("EMP_PHONE <", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThanOrEqualTo(String value) {
            addCriterion("EMP_PHONE <=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLike(String value) {
            addCriterion("EMP_PHONE like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotLike(String value) {
            addCriterion("EMP_PHONE not like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIn(List<String> values) {
            addCriterion("EMP_PHONE in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotIn(List<String> values) {
            addCriterion("EMP_PHONE not in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneBetween(String value1, String value2) {
            addCriterion("EMP_PHONE between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotBetween(String value1, String value2) {
            addCriterion("EMP_PHONE not between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumIsNull() {
            addCriterion("EMP_PHONE_EXT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumIsNotNull() {
            addCriterion("EMP_PHONE_EXT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumEqualTo(String value) {
            addCriterion("EMP_PHONE_EXT_NUM =", value, "empPhoneExtNum");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumNotEqualTo(String value) {
            addCriterion("EMP_PHONE_EXT_NUM <>", value, "empPhoneExtNum");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumGreaterThan(String value) {
            addCriterion("EMP_PHONE_EXT_NUM >", value, "empPhoneExtNum");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_PHONE_EXT_NUM >=", value, "empPhoneExtNum");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumLessThan(String value) {
            addCriterion("EMP_PHONE_EXT_NUM <", value, "empPhoneExtNum");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumLessThanOrEqualTo(String value) {
            addCriterion("EMP_PHONE_EXT_NUM <=", value, "empPhoneExtNum");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumLike(String value) {
            addCriterion("EMP_PHONE_EXT_NUM like", value, "empPhoneExtNum");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumNotLike(String value) {
            addCriterion("EMP_PHONE_EXT_NUM not like", value, "empPhoneExtNum");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumIn(List<String> values) {
            addCriterion("EMP_PHONE_EXT_NUM in", values, "empPhoneExtNum");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumNotIn(List<String> values) {
            addCriterion("EMP_PHONE_EXT_NUM not in", values, "empPhoneExtNum");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumBetween(String value1, String value2) {
            addCriterion("EMP_PHONE_EXT_NUM between", value1, value2, "empPhoneExtNum");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneExtNumNotBetween(String value1, String value2) {
            addCriterion("EMP_PHONE_EXT_NUM not between", value1, value2, "empPhoneExtNum");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceIsNull() {
            addCriterion("EMP_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceIsNotNull() {
            addCriterion("EMP_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceEqualTo(String value) {
            addCriterion("EMP_PROVINCE =", value, "empProvince");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceNotEqualTo(String value) {
            addCriterion("EMP_PROVINCE <>", value, "empProvince");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceGreaterThan(String value) {
            addCriterion("EMP_PROVINCE >", value, "empProvince");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_PROVINCE >=", value, "empProvince");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceLessThan(String value) {
            addCriterion("EMP_PROVINCE <", value, "empProvince");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceLessThanOrEqualTo(String value) {
            addCriterion("EMP_PROVINCE <=", value, "empProvince");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceLike(String value) {
            addCriterion("EMP_PROVINCE like", value, "empProvince");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceNotLike(String value) {
            addCriterion("EMP_PROVINCE not like", value, "empProvince");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceIn(List<String> values) {
            addCriterion("EMP_PROVINCE in", values, "empProvince");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceNotIn(List<String> values) {
            addCriterion("EMP_PROVINCE not in", values, "empProvince");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceBetween(String value1, String value2) {
            addCriterion("EMP_PROVINCE between", value1, value2, "empProvince");
            return (Criteria) this;
        }

        public Criteria andEmpProvinceNotBetween(String value1, String value2) {
            addCriterion("EMP_PROVINCE not between", value1, value2, "empProvince");
            return (Criteria) this;
        }

        public Criteria andEmpCityIsNull() {
            addCriterion("EMP_CITY is null");
            return (Criteria) this;
        }

        public Criteria andEmpCityIsNotNull() {
            addCriterion("EMP_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCityEqualTo(String value) {
            addCriterion("EMP_CITY =", value, "empCity");
            return (Criteria) this;
        }

        public Criteria andEmpCityNotEqualTo(String value) {
            addCriterion("EMP_CITY <>", value, "empCity");
            return (Criteria) this;
        }

        public Criteria andEmpCityGreaterThan(String value) {
            addCriterion("EMP_CITY >", value, "empCity");
            return (Criteria) this;
        }

        public Criteria andEmpCityGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_CITY >=", value, "empCity");
            return (Criteria) this;
        }

        public Criteria andEmpCityLessThan(String value) {
            addCriterion("EMP_CITY <", value, "empCity");
            return (Criteria) this;
        }

        public Criteria andEmpCityLessThanOrEqualTo(String value) {
            addCriterion("EMP_CITY <=", value, "empCity");
            return (Criteria) this;
        }

        public Criteria andEmpCityLike(String value) {
            addCriterion("EMP_CITY like", value, "empCity");
            return (Criteria) this;
        }

        public Criteria andEmpCityNotLike(String value) {
            addCriterion("EMP_CITY not like", value, "empCity");
            return (Criteria) this;
        }

        public Criteria andEmpCityIn(List<String> values) {
            addCriterion("EMP_CITY in", values, "empCity");
            return (Criteria) this;
        }

        public Criteria andEmpCityNotIn(List<String> values) {
            addCriterion("EMP_CITY not in", values, "empCity");
            return (Criteria) this;
        }

        public Criteria andEmpCityBetween(String value1, String value2) {
            addCriterion("EMP_CITY between", value1, value2, "empCity");
            return (Criteria) this;
        }

        public Criteria andEmpCityNotBetween(String value1, String value2) {
            addCriterion("EMP_CITY not between", value1, value2, "empCity");
            return (Criteria) this;
        }

        public Criteria andEmpZoneIsNull() {
            addCriterion("EMP_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andEmpZoneIsNotNull() {
            addCriterion("EMP_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andEmpZoneEqualTo(String value) {
            addCriterion("EMP_ZONE =", value, "empZone");
            return (Criteria) this;
        }

        public Criteria andEmpZoneNotEqualTo(String value) {
            addCriterion("EMP_ZONE <>", value, "empZone");
            return (Criteria) this;
        }

        public Criteria andEmpZoneGreaterThan(String value) {
            addCriterion("EMP_ZONE >", value, "empZone");
            return (Criteria) this;
        }

        public Criteria andEmpZoneGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_ZONE >=", value, "empZone");
            return (Criteria) this;
        }

        public Criteria andEmpZoneLessThan(String value) {
            addCriterion("EMP_ZONE <", value, "empZone");
            return (Criteria) this;
        }

        public Criteria andEmpZoneLessThanOrEqualTo(String value) {
            addCriterion("EMP_ZONE <=", value, "empZone");
            return (Criteria) this;
        }

        public Criteria andEmpZoneLike(String value) {
            addCriterion("EMP_ZONE like", value, "empZone");
            return (Criteria) this;
        }

        public Criteria andEmpZoneNotLike(String value) {
            addCriterion("EMP_ZONE not like", value, "empZone");
            return (Criteria) this;
        }

        public Criteria andEmpZoneIn(List<String> values) {
            addCriterion("EMP_ZONE in", values, "empZone");
            return (Criteria) this;
        }

        public Criteria andEmpZoneNotIn(List<String> values) {
            addCriterion("EMP_ZONE not in", values, "empZone");
            return (Criteria) this;
        }

        public Criteria andEmpZoneBetween(String value1, String value2) {
            addCriterion("EMP_ZONE between", value1, value2, "empZone");
            return (Criteria) this;
        }

        public Criteria andEmpZoneNotBetween(String value1, String value2) {
            addCriterion("EMP_ZONE not between", value1, value2, "empZone");
            return (Criteria) this;
        }

        public Criteria andEmpAddIsNull() {
            addCriterion("EMP_ADD is null");
            return (Criteria) this;
        }

        public Criteria andEmpAddIsNotNull() {
            addCriterion("EMP_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAddEqualTo(String value) {
            addCriterion("EMP_ADD =", value, "empAdd");
            return (Criteria) this;
        }

        public Criteria andEmpAddNotEqualTo(String value) {
            addCriterion("EMP_ADD <>", value, "empAdd");
            return (Criteria) this;
        }

        public Criteria andEmpAddGreaterThan(String value) {
            addCriterion("EMP_ADD >", value, "empAdd");
            return (Criteria) this;
        }

        public Criteria andEmpAddGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_ADD >=", value, "empAdd");
            return (Criteria) this;
        }

        public Criteria andEmpAddLessThan(String value) {
            addCriterion("EMP_ADD <", value, "empAdd");
            return (Criteria) this;
        }

        public Criteria andEmpAddLessThanOrEqualTo(String value) {
            addCriterion("EMP_ADD <=", value, "empAdd");
            return (Criteria) this;
        }

        public Criteria andEmpAddLike(String value) {
            addCriterion("EMP_ADD like", value, "empAdd");
            return (Criteria) this;
        }

        public Criteria andEmpAddNotLike(String value) {
            addCriterion("EMP_ADD not like", value, "empAdd");
            return (Criteria) this;
        }

        public Criteria andEmpAddIn(List<String> values) {
            addCriterion("EMP_ADD in", values, "empAdd");
            return (Criteria) this;
        }

        public Criteria andEmpAddNotIn(List<String> values) {
            addCriterion("EMP_ADD not in", values, "empAdd");
            return (Criteria) this;
        }

        public Criteria andEmpAddBetween(String value1, String value2) {
            addCriterion("EMP_ADD between", value1, value2, "empAdd");
            return (Criteria) this;
        }

        public Criteria andEmpAddNotBetween(String value1, String value2) {
            addCriterion("EMP_ADD not between", value1, value2, "empAdd");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("MARITAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("MARITAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("MARITAL_STATUS =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("MARITAL_STATUS <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("MARITAL_STATUS >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("MARITAL_STATUS <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("MARITAL_STATUS like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("MARITAL_STATUS not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("MARITAL_STATUS in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("MARITAL_STATUS not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andHouseConditionIsNull() {
            addCriterion("HOUSE_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andHouseConditionIsNotNull() {
            addCriterion("HOUSE_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andHouseConditionEqualTo(String value) {
            addCriterion("HOUSE_CONDITION =", value, "houseCondition");
            return (Criteria) this;
        }

        public Criteria andHouseConditionNotEqualTo(String value) {
            addCriterion("HOUSE_CONDITION <>", value, "houseCondition");
            return (Criteria) this;
        }

        public Criteria andHouseConditionGreaterThan(String value) {
            addCriterion("HOUSE_CONDITION >", value, "houseCondition");
            return (Criteria) this;
        }

        public Criteria andHouseConditionGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSE_CONDITION >=", value, "houseCondition");
            return (Criteria) this;
        }

        public Criteria andHouseConditionLessThan(String value) {
            addCriterion("HOUSE_CONDITION <", value, "houseCondition");
            return (Criteria) this;
        }

        public Criteria andHouseConditionLessThanOrEqualTo(String value) {
            addCriterion("HOUSE_CONDITION <=", value, "houseCondition");
            return (Criteria) this;
        }

        public Criteria andHouseConditionLike(String value) {
            addCriterion("HOUSE_CONDITION like", value, "houseCondition");
            return (Criteria) this;
        }

        public Criteria andHouseConditionNotLike(String value) {
            addCriterion("HOUSE_CONDITION not like", value, "houseCondition");
            return (Criteria) this;
        }

        public Criteria andHouseConditionIn(List<String> values) {
            addCriterion("HOUSE_CONDITION in", values, "houseCondition");
            return (Criteria) this;
        }

        public Criteria andHouseConditionNotIn(List<String> values) {
            addCriterion("HOUSE_CONDITION not in", values, "houseCondition");
            return (Criteria) this;
        }

        public Criteria andHouseConditionBetween(String value1, String value2) {
            addCriterion("HOUSE_CONDITION between", value1, value2, "houseCondition");
            return (Criteria) this;
        }

        public Criteria andHouseConditionNotBetween(String value1, String value2) {
            addCriterion("HOUSE_CONDITION not between", value1, value2, "houseCondition");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserIsNull() {
            addCriterion("LST_UPD_USER is null");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserIsNotNull() {
            addCriterion("LST_UPD_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserEqualTo(String value) {
            addCriterion("LST_UPD_USER =", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserNotEqualTo(String value) {
            addCriterion("LST_UPD_USER <>", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserGreaterThan(String value) {
            addCriterion("LST_UPD_USER >", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserGreaterThanOrEqualTo(String value) {
            addCriterion("LST_UPD_USER >=", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserLessThan(String value) {
            addCriterion("LST_UPD_USER <", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserLessThanOrEqualTo(String value) {
            addCriterion("LST_UPD_USER <=", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserLike(String value) {
            addCriterion("LST_UPD_USER like", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserNotLike(String value) {
            addCriterion("LST_UPD_USER not like", value, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserIn(List<String> values) {
            addCriterion("LST_UPD_USER in", values, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserNotIn(List<String> values) {
            addCriterion("LST_UPD_USER not in", values, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserBetween(String value1, String value2) {
            addCriterion("LST_UPD_USER between", value1, value2, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdUserNotBetween(String value1, String value2) {
            addCriterion("LST_UPD_USER not between", value1, value2, "lstUpdUser");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeIsNull() {
            addCriterion("LST_UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeIsNotNull() {
            addCriterion("LST_UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeEqualTo(Date value) {
            addCriterion("LST_UPD_TIME =", value, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeNotEqualTo(Date value) {
            addCriterion("LST_UPD_TIME <>", value, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeGreaterThan(Date value) {
            addCriterion("LST_UPD_TIME >", value, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LST_UPD_TIME >=", value, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeLessThan(Date value) {
            addCriterion("LST_UPD_TIME <", value, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("LST_UPD_TIME <=", value, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeIn(List<Date> values) {
            addCriterion("LST_UPD_TIME in", values, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeNotIn(List<Date> values) {
            addCriterion("LST_UPD_TIME not in", values, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeBetween(Date value1, Date value2) {
            addCriterion("LST_UPD_TIME between", value1, value2, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andLstUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("LST_UPD_TIME not between", value1, value2, "lstUpdTime");
            return (Criteria) this;
        }

        public Criteria andJpaVersionIsNull() {
            addCriterion("JPA_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andJpaVersionIsNotNull() {
            addCriterion("JPA_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andJpaVersionEqualTo(Integer value) {
            addCriterion("JPA_VERSION =", value, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionNotEqualTo(Integer value) {
            addCriterion("JPA_VERSION <>", value, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionGreaterThan(Integer value) {
            addCriterion("JPA_VERSION >", value, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("JPA_VERSION >=", value, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionLessThan(Integer value) {
            addCriterion("JPA_VERSION <", value, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionLessThanOrEqualTo(Integer value) {
            addCriterion("JPA_VERSION <=", value, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionIn(List<Integer> values) {
            addCriterion("JPA_VERSION in", values, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionNotIn(List<Integer> values) {
            addCriterion("JPA_VERSION not in", values, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionBetween(Integer value1, Integer value2) {
            addCriterion("JPA_VERSION between", value1, value2, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andJpaVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("JPA_VERSION not between", value1, value2, "jpaVersion");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutIsNull() {
            addCriterion("IPHOE_BREAKOUT is null");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutIsNotNull() {
            addCriterion("IPHOE_BREAKOUT is not null");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutEqualTo(String value) {
            addCriterion("IPHOE_BREAKOUT =", value, "iphoeBreakout");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutNotEqualTo(String value) {
            addCriterion("IPHOE_BREAKOUT <>", value, "iphoeBreakout");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutGreaterThan(String value) {
            addCriterion("IPHOE_BREAKOUT >", value, "iphoeBreakout");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutGreaterThanOrEqualTo(String value) {
            addCriterion("IPHOE_BREAKOUT >=", value, "iphoeBreakout");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutLessThan(String value) {
            addCriterion("IPHOE_BREAKOUT <", value, "iphoeBreakout");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutLessThanOrEqualTo(String value) {
            addCriterion("IPHOE_BREAKOUT <=", value, "iphoeBreakout");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutLike(String value) {
            addCriterion("IPHOE_BREAKOUT like", value, "iphoeBreakout");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutNotLike(String value) {
            addCriterion("IPHOE_BREAKOUT not like", value, "iphoeBreakout");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutIn(List<String> values) {
            addCriterion("IPHOE_BREAKOUT in", values, "iphoeBreakout");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutNotIn(List<String> values) {
            addCriterion("IPHOE_BREAKOUT not in", values, "iphoeBreakout");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutBetween(String value1, String value2) {
            addCriterion("IPHOE_BREAKOUT between", value1, value2, "iphoeBreakout");
            return (Criteria) this;
        }

        public Criteria andIphoeBreakoutNotBetween(String value1, String value2) {
            addCriterion("IPHOE_BREAKOUT not between", value1, value2, "iphoeBreakout");
            return (Criteria) this;
        }

        public Criteria andApplyAddressIsNull() {
            addCriterion("APPLY_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andApplyAddressIsNotNull() {
            addCriterion("APPLY_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAddressEqualTo(String value) {
            addCriterion("APPLY_ADDRESS =", value, "applyAddress");
            return (Criteria) this;
        }

        public Criteria andApplyAddressNotEqualTo(String value) {
            addCriterion("APPLY_ADDRESS <>", value, "applyAddress");
            return (Criteria) this;
        }

        public Criteria andApplyAddressGreaterThan(String value) {
            addCriterion("APPLY_ADDRESS >", value, "applyAddress");
            return (Criteria) this;
        }

        public Criteria andApplyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_ADDRESS >=", value, "applyAddress");
            return (Criteria) this;
        }

        public Criteria andApplyAddressLessThan(String value) {
            addCriterion("APPLY_ADDRESS <", value, "applyAddress");
            return (Criteria) this;
        }

        public Criteria andApplyAddressLessThanOrEqualTo(String value) {
            addCriterion("APPLY_ADDRESS <=", value, "applyAddress");
            return (Criteria) this;
        }

        public Criteria andApplyAddressLike(String value) {
            addCriterion("APPLY_ADDRESS like", value, "applyAddress");
            return (Criteria) this;
        }

        public Criteria andApplyAddressNotLike(String value) {
            addCriterion("APPLY_ADDRESS not like", value, "applyAddress");
            return (Criteria) this;
        }

        public Criteria andApplyAddressIn(List<String> values) {
            addCriterion("APPLY_ADDRESS in", values, "applyAddress");
            return (Criteria) this;
        }

        public Criteria andApplyAddressNotIn(List<String> values) {
            addCriterion("APPLY_ADDRESS not in", values, "applyAddress");
            return (Criteria) this;
        }

        public Criteria andApplyAddressBetween(String value1, String value2) {
            addCriterion("APPLY_ADDRESS between", value1, value2, "applyAddress");
            return (Criteria) this;
        }

        public Criteria andApplyAddressNotBetween(String value1, String value2) {
            addCriterion("APPLY_ADDRESS not between", value1, value2, "applyAddress");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNull() {
            addCriterion("GRADUATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNotNull() {
            addCriterion("GRADUATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeEqualTo(Date value) {
            addCriterion("GRADUATION_TIME =", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotEqualTo(Date value) {
            addCriterion("GRADUATION_TIME <>", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThan(Date value) {
            addCriterion("GRADUATION_TIME >", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GRADUATION_TIME >=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThan(Date value) {
            addCriterion("GRADUATION_TIME <", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThanOrEqualTo(Date value) {
            addCriterion("GRADUATION_TIME <=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIn(List<Date> values) {
            addCriterion("GRADUATION_TIME in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotIn(List<Date> values) {
            addCriterion("GRADUATION_TIME not in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeBetween(Date value1, Date value2) {
            addCriterion("GRADUATION_TIME between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotBetween(Date value1, Date value2) {
            addCriterion("GRADUATION_TIME not between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Short value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Short value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Short value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Short value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Short value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Short> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Short> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Short value1, Short value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Short value1, Short value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberIsNull() {
            addCriterion("BANK_RESERVE_PHONE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberIsNotNull() {
            addCriterion("BANK_RESERVE_PHONE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberEqualTo(String value) {
            addCriterion("BANK_RESERVE_PHONE_NUMBER =", value, "bankReservePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberNotEqualTo(String value) {
            addCriterion("BANK_RESERVE_PHONE_NUMBER <>", value, "bankReservePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberGreaterThan(String value) {
            addCriterion("BANK_RESERVE_PHONE_NUMBER >", value, "bankReservePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_RESERVE_PHONE_NUMBER >=", value, "bankReservePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberLessThan(String value) {
            addCriterion("BANK_RESERVE_PHONE_NUMBER <", value, "bankReservePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("BANK_RESERVE_PHONE_NUMBER <=", value, "bankReservePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberLike(String value) {
            addCriterion("BANK_RESERVE_PHONE_NUMBER like", value, "bankReservePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberNotLike(String value) {
            addCriterion("BANK_RESERVE_PHONE_NUMBER not like", value, "bankReservePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberIn(List<String> values) {
            addCriterion("BANK_RESERVE_PHONE_NUMBER in", values, "bankReservePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberNotIn(List<String> values) {
            addCriterion("BANK_RESERVE_PHONE_NUMBER not in", values, "bankReservePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberBetween(String value1, String value2) {
            addCriterion("BANK_RESERVE_PHONE_NUMBER between", value1, value2, "bankReservePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andBankReservePhoneNumberNotBetween(String value1, String value2) {
            addCriterion("BANK_RESERVE_PHONE_NUMBER not between", value1, value2, "bankReservePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoanDaysIsNull() {
            addCriterion("LOAN_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andLoanDaysIsNotNull() {
            addCriterion("LOAN_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDaysEqualTo(String value) {
            addCriterion("LOAN_DAYS =", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysNotEqualTo(String value) {
            addCriterion("LOAN_DAYS <>", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysGreaterThan(String value) {
            addCriterion("LOAN_DAYS >", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_DAYS >=", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysLessThan(String value) {
            addCriterion("LOAN_DAYS <", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysLessThanOrEqualTo(String value) {
            addCriterion("LOAN_DAYS <=", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysLike(String value) {
            addCriterion("LOAN_DAYS like", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysNotLike(String value) {
            addCriterion("LOAN_DAYS not like", value, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysIn(List<String> values) {
            addCriterion("LOAN_DAYS in", values, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysNotIn(List<String> values) {
            addCriterion("LOAN_DAYS not in", values, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysBetween(String value1, String value2) {
            addCriterion("LOAN_DAYS between", value1, value2, "loanDays");
            return (Criteria) this;
        }

        public Criteria andLoanDaysNotBetween(String value1, String value2) {
            addCriterion("LOAN_DAYS not between", value1, value2, "loanDays");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoIsNull() {
            addCriterion("CREDIT_CARDNO is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoIsNotNull() {
            addCriterion("CREDIT_CARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoEqualTo(String value) {
            addCriterion("CREDIT_CARDNO =", value, "creditCardno");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoNotEqualTo(String value) {
            addCriterion("CREDIT_CARDNO <>", value, "creditCardno");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoGreaterThan(String value) {
            addCriterion("CREDIT_CARDNO >", value, "creditCardno");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_CARDNO >=", value, "creditCardno");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoLessThan(String value) {
            addCriterion("CREDIT_CARDNO <", value, "creditCardno");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_CARDNO <=", value, "creditCardno");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoLike(String value) {
            addCriterion("CREDIT_CARDNO like", value, "creditCardno");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoNotLike(String value) {
            addCriterion("CREDIT_CARDNO not like", value, "creditCardno");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoIn(List<String> values) {
            addCriterion("CREDIT_CARDNO in", values, "creditCardno");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoNotIn(List<String> values) {
            addCriterion("CREDIT_CARDNO not in", values, "creditCardno");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoBetween(String value1, String value2) {
            addCriterion("CREDIT_CARDNO between", value1, value2, "creditCardno");
            return (Criteria) this;
        }

        public Criteria andCreditCardnoNotBetween(String value1, String value2) {
            addCriterion("CREDIT_CARDNO not between", value1, value2, "creditCardno");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeIsNull() {
            addCriterion("COMMISSIONER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeIsNotNull() {
            addCriterion("COMMISSIONER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeEqualTo(String value) {
            addCriterion("COMMISSIONER_CODE =", value, "commissionerCode");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeNotEqualTo(String value) {
            addCriterion("COMMISSIONER_CODE <>", value, "commissionerCode");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeGreaterThan(String value) {
            addCriterion("COMMISSIONER_CODE >", value, "commissionerCode");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMMISSIONER_CODE >=", value, "commissionerCode");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeLessThan(String value) {
            addCriterion("COMMISSIONER_CODE <", value, "commissionerCode");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeLessThanOrEqualTo(String value) {
            addCriterion("COMMISSIONER_CODE <=", value, "commissionerCode");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeLike(String value) {
            addCriterion("COMMISSIONER_CODE like", value, "commissionerCode");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeNotLike(String value) {
            addCriterion("COMMISSIONER_CODE not like", value, "commissionerCode");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeIn(List<String> values) {
            addCriterion("COMMISSIONER_CODE in", values, "commissionerCode");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeNotIn(List<String> values) {
            addCriterion("COMMISSIONER_CODE not in", values, "commissionerCode");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeBetween(String value1, String value2) {
            addCriterion("COMMISSIONER_CODE between", value1, value2, "commissionerCode");
            return (Criteria) this;
        }

        public Criteria andCommissionerCodeNotBetween(String value1, String value2) {
            addCriterion("COMMISSIONER_CODE not between", value1, value2, "commissionerCode");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordIsNull() {
            addCriterion("AUTHENTICATION_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordIsNotNull() {
            addCriterion("AUTHENTICATION_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordEqualTo(String value) {
            addCriterion("AUTHENTICATION_PASSWORD =", value, "authenticationPassword");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordNotEqualTo(String value) {
            addCriterion("AUTHENTICATION_PASSWORD <>", value, "authenticationPassword");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordGreaterThan(String value) {
            addCriterion("AUTHENTICATION_PASSWORD >", value, "authenticationPassword");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHENTICATION_PASSWORD >=", value, "authenticationPassword");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordLessThan(String value) {
            addCriterion("AUTHENTICATION_PASSWORD <", value, "authenticationPassword");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordLessThanOrEqualTo(String value) {
            addCriterion("AUTHENTICATION_PASSWORD <=", value, "authenticationPassword");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordLike(String value) {
            addCriterion("AUTHENTICATION_PASSWORD like", value, "authenticationPassword");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordNotLike(String value) {
            addCriterion("AUTHENTICATION_PASSWORD not like", value, "authenticationPassword");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordIn(List<String> values) {
            addCriterion("AUTHENTICATION_PASSWORD in", values, "authenticationPassword");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordNotIn(List<String> values) {
            addCriterion("AUTHENTICATION_PASSWORD not in", values, "authenticationPassword");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordBetween(String value1, String value2) {
            addCriterion("AUTHENTICATION_PASSWORD between", value1, value2, "authenticationPassword");
            return (Criteria) this;
        }

        public Criteria andAuthenticationPasswordNotBetween(String value1, String value2) {
            addCriterion("AUTHENTICATION_PASSWORD not between", value1, value2, "authenticationPassword");
            return (Criteria) this;
        }

        public Criteria andFingerprintingIsNull() {
            addCriterion("FINGERPRINTING is null");
            return (Criteria) this;
        }

        public Criteria andFingerprintingIsNotNull() {
            addCriterion("FINGERPRINTING is not null");
            return (Criteria) this;
        }

        public Criteria andFingerprintingEqualTo(String value) {
            addCriterion("FINGERPRINTING =", value, "fingerprinting");
            return (Criteria) this;
        }

        public Criteria andFingerprintingNotEqualTo(String value) {
            addCriterion("FINGERPRINTING <>", value, "fingerprinting");
            return (Criteria) this;
        }

        public Criteria andFingerprintingGreaterThan(String value) {
            addCriterion("FINGERPRINTING >", value, "fingerprinting");
            return (Criteria) this;
        }

        public Criteria andFingerprintingGreaterThanOrEqualTo(String value) {
            addCriterion("FINGERPRINTING >=", value, "fingerprinting");
            return (Criteria) this;
        }

        public Criteria andFingerprintingLessThan(String value) {
            addCriterion("FINGERPRINTING <", value, "fingerprinting");
            return (Criteria) this;
        }

        public Criteria andFingerprintingLessThanOrEqualTo(String value) {
            addCriterion("FINGERPRINTING <=", value, "fingerprinting");
            return (Criteria) this;
        }

        public Criteria andFingerprintingLike(String value) {
            addCriterion("FINGERPRINTING like", value, "fingerprinting");
            return (Criteria) this;
        }

        public Criteria andFingerprintingNotLike(String value) {
            addCriterion("FINGERPRINTING not like", value, "fingerprinting");
            return (Criteria) this;
        }

        public Criteria andFingerprintingIn(List<String> values) {
            addCriterion("FINGERPRINTING in", values, "fingerprinting");
            return (Criteria) this;
        }

        public Criteria andFingerprintingNotIn(List<String> values) {
            addCriterion("FINGERPRINTING not in", values, "fingerprinting");
            return (Criteria) this;
        }

        public Criteria andFingerprintingBetween(String value1, String value2) {
            addCriterion("FINGERPRINTING between", value1, value2, "fingerprinting");
            return (Criteria) this;
        }

        public Criteria andFingerprintingNotBetween(String value1, String value2) {
            addCriterion("FINGERPRINTING not between", value1, value2, "fingerprinting");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("DEVICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("DEVICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("DEVICE_TYPE =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("DEVICE_TYPE <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("DEVICE_TYPE >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_TYPE >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("DEVICE_TYPE <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_TYPE <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("DEVICE_TYPE like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("DEVICE_TYPE not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("DEVICE_TYPE in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("DEVICE_TYPE not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("DEVICE_TYPE between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("DEVICE_TYPE not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("LOCATION like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("LOCATION not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressIsNull() {
            addCriterion("RESIDENCE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressIsNotNull() {
            addCriterion("RESIDENCE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressEqualTo(String value) {
            addCriterion("RESIDENCE_ADDRESS =", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressNotEqualTo(String value) {
            addCriterion("RESIDENCE_ADDRESS <>", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressGreaterThan(String value) {
            addCriterion("RESIDENCE_ADDRESS >", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_ADDRESS >=", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressLessThan(String value) {
            addCriterion("RESIDENCE_ADDRESS <", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_ADDRESS <=", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressLike(String value) {
            addCriterion("RESIDENCE_ADDRESS like", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressNotLike(String value) {
            addCriterion("RESIDENCE_ADDRESS not like", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressIn(List<String> values) {
            addCriterion("RESIDENCE_ADDRESS in", values, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressNotIn(List<String> values) {
            addCriterion("RESIDENCE_ADDRESS not in", values, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressBetween(String value1, String value2) {
            addCriterion("RESIDENCE_ADDRESS between", value1, value2, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_ADDRESS not between", value1, value2, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIsNull() {
            addCriterion("CARRIER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIsNotNull() {
            addCriterion("CARRIER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeEqualTo(String value) {
            addCriterion("CARRIER_TYPE =", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeNotEqualTo(String value) {
            addCriterion("CARRIER_TYPE <>", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeGreaterThan(String value) {
            addCriterion("CARRIER_TYPE >", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARRIER_TYPE >=", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeLessThan(String value) {
            addCriterion("CARRIER_TYPE <", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeLessThanOrEqualTo(String value) {
            addCriterion("CARRIER_TYPE <=", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeLike(String value) {
            addCriterion("CARRIER_TYPE like", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeNotLike(String value) {
            addCriterion("CARRIER_TYPE not like", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIn(List<String> values) {
            addCriterion("CARRIER_TYPE in", values, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeNotIn(List<String> values) {
            addCriterion("CARRIER_TYPE not in", values, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeBetween(String value1, String value2) {
            addCriterion("CARRIER_TYPE between", value1, value2, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeNotBetween(String value1, String value2) {
            addCriterion("CARRIER_TYPE not between", value1, value2, "carrierType");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeIsNull() {
            addCriterion("STORE_RISKERCODE is null");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeIsNotNull() {
            addCriterion("STORE_RISKERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeEqualTo(String value) {
            addCriterion("STORE_RISKERCODE =", value, "storeRiskercode");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeNotEqualTo(String value) {
            addCriterion("STORE_RISKERCODE <>", value, "storeRiskercode");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeGreaterThan(String value) {
            addCriterion("STORE_RISKERCODE >", value, "storeRiskercode");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_RISKERCODE >=", value, "storeRiskercode");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeLessThan(String value) {
            addCriterion("STORE_RISKERCODE <", value, "storeRiskercode");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeLessThanOrEqualTo(String value) {
            addCriterion("STORE_RISKERCODE <=", value, "storeRiskercode");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeLike(String value) {
            addCriterion("STORE_RISKERCODE like", value, "storeRiskercode");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeNotLike(String value) {
            addCriterion("STORE_RISKERCODE not like", value, "storeRiskercode");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeIn(List<String> values) {
            addCriterion("STORE_RISKERCODE in", values, "storeRiskercode");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeNotIn(List<String> values) {
            addCriterion("STORE_RISKERCODE not in", values, "storeRiskercode");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeBetween(String value1, String value2) {
            addCriterion("STORE_RISKERCODE between", value1, value2, "storeRiskercode");
            return (Criteria) this;
        }

        public Criteria andStoreRiskercodeNotBetween(String value1, String value2) {
            addCriterion("STORE_RISKERCODE not between", value1, value2, "storeRiskercode");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingIsNull() {
            addCriterion("STORE_RISKFINGERPRINTING is null");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingIsNotNull() {
            addCriterion("STORE_RISKFINGERPRINTING is not null");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingEqualTo(String value) {
            addCriterion("STORE_RISKFINGERPRINTING =", value, "storeRiskfingerprinting");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingNotEqualTo(String value) {
            addCriterion("STORE_RISKFINGERPRINTING <>", value, "storeRiskfingerprinting");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingGreaterThan(String value) {
            addCriterion("STORE_RISKFINGERPRINTING >", value, "storeRiskfingerprinting");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_RISKFINGERPRINTING >=", value, "storeRiskfingerprinting");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingLessThan(String value) {
            addCriterion("STORE_RISKFINGERPRINTING <", value, "storeRiskfingerprinting");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingLessThanOrEqualTo(String value) {
            addCriterion("STORE_RISKFINGERPRINTING <=", value, "storeRiskfingerprinting");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingLike(String value) {
            addCriterion("STORE_RISKFINGERPRINTING like", value, "storeRiskfingerprinting");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingNotLike(String value) {
            addCriterion("STORE_RISKFINGERPRINTING not like", value, "storeRiskfingerprinting");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingIn(List<String> values) {
            addCriterion("STORE_RISKFINGERPRINTING in", values, "storeRiskfingerprinting");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingNotIn(List<String> values) {
            addCriterion("STORE_RISKFINGERPRINTING not in", values, "storeRiskfingerprinting");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingBetween(String value1, String value2) {
            addCriterion("STORE_RISKFINGERPRINTING between", value1, value2, "storeRiskfingerprinting");
            return (Criteria) this;
        }

        public Criteria andStoreRiskfingerprintingNotBetween(String value1, String value2) {
            addCriterion("STORE_RISKFINGERPRINTING not between", value1, value2, "storeRiskfingerprinting");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationIsNull() {
            addCriterion("STORE_RISKLOCATION is null");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationIsNotNull() {
            addCriterion("STORE_RISKLOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationEqualTo(String value) {
            addCriterion("STORE_RISKLOCATION =", value, "storeRisklocation");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationNotEqualTo(String value) {
            addCriterion("STORE_RISKLOCATION <>", value, "storeRisklocation");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationGreaterThan(String value) {
            addCriterion("STORE_RISKLOCATION >", value, "storeRisklocation");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_RISKLOCATION >=", value, "storeRisklocation");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationLessThan(String value) {
            addCriterion("STORE_RISKLOCATION <", value, "storeRisklocation");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationLessThanOrEqualTo(String value) {
            addCriterion("STORE_RISKLOCATION <=", value, "storeRisklocation");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationLike(String value) {
            addCriterion("STORE_RISKLOCATION like", value, "storeRisklocation");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationNotLike(String value) {
            addCriterion("STORE_RISKLOCATION not like", value, "storeRisklocation");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationIn(List<String> values) {
            addCriterion("STORE_RISKLOCATION in", values, "storeRisklocation");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationNotIn(List<String> values) {
            addCriterion("STORE_RISKLOCATION not in", values, "storeRisklocation");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationBetween(String value1, String value2) {
            addCriterion("STORE_RISKLOCATION between", value1, value2, "storeRisklocation");
            return (Criteria) this;
        }

        public Criteria andStoreRisklocationNotBetween(String value1, String value2) {
            addCriterion("STORE_RISKLOCATION not between", value1, value2, "storeRisklocation");
            return (Criteria) this;
        }

        public Criteria andStoreOrgIsNull() {
            addCriterion("STORE_ORG is null");
            return (Criteria) this;
        }

        public Criteria andStoreOrgIsNotNull() {
            addCriterion("STORE_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andStoreOrgEqualTo(String value) {
            addCriterion("STORE_ORG =", value, "storeOrg");
            return (Criteria) this;
        }

        public Criteria andStoreOrgNotEqualTo(String value) {
            addCriterion("STORE_ORG <>", value, "storeOrg");
            return (Criteria) this;
        }

        public Criteria andStoreOrgGreaterThan(String value) {
            addCriterion("STORE_ORG >", value, "storeOrg");
            return (Criteria) this;
        }

        public Criteria andStoreOrgGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_ORG >=", value, "storeOrg");
            return (Criteria) this;
        }

        public Criteria andStoreOrgLessThan(String value) {
            addCriterion("STORE_ORG <", value, "storeOrg");
            return (Criteria) this;
        }

        public Criteria andStoreOrgLessThanOrEqualTo(String value) {
            addCriterion("STORE_ORG <=", value, "storeOrg");
            return (Criteria) this;
        }

        public Criteria andStoreOrgLike(String value) {
            addCriterion("STORE_ORG like", value, "storeOrg");
            return (Criteria) this;
        }

        public Criteria andStoreOrgNotLike(String value) {
            addCriterion("STORE_ORG not like", value, "storeOrg");
            return (Criteria) this;
        }

        public Criteria andStoreOrgIn(List<String> values) {
            addCriterion("STORE_ORG in", values, "storeOrg");
            return (Criteria) this;
        }

        public Criteria andStoreOrgNotIn(List<String> values) {
            addCriterion("STORE_ORG not in", values, "storeOrg");
            return (Criteria) this;
        }

        public Criteria andStoreOrgBetween(String value1, String value2) {
            addCriterion("STORE_ORG between", value1, value2, "storeOrg");
            return (Criteria) this;
        }

        public Criteria andStoreOrgNotBetween(String value1, String value2) {
            addCriterion("STORE_ORG not between", value1, value2, "storeOrg");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNull() {
            addCriterion("RISK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNotNull() {
            addCriterion("RISK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelEqualTo(String value) {
            addCriterion("RISK_LEVEL =", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotEqualTo(String value) {
            addCriterion("RISK_LEVEL <>", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThan(String value) {
            addCriterion("RISK_LEVEL >", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_LEVEL >=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThan(String value) {
            addCriterion("RISK_LEVEL <", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThanOrEqualTo(String value) {
            addCriterion("RISK_LEVEL <=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLike(String value) {
            addCriterion("RISK_LEVEL like", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotLike(String value) {
            addCriterion("RISK_LEVEL not like", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIn(List<String> values) {
            addCriterion("RISK_LEVEL in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotIn(List<String> values) {
            addCriterion("RISK_LEVEL not in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelBetween(String value1, String value2) {
            addCriterion("RISK_LEVEL between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotBetween(String value1, String value2) {
            addCriterion("RISK_LEVEL not between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreIsNull() {
            addCriterion("ZHIMA_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreIsNotNull() {
            addCriterion("ZHIMA_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreEqualTo(String value) {
            addCriterion("ZHIMA_SCORE =", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotEqualTo(String value) {
            addCriterion("ZHIMA_SCORE <>", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreGreaterThan(String value) {
            addCriterion("ZHIMA_SCORE >", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIMA_SCORE >=", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreLessThan(String value) {
            addCriterion("ZHIMA_SCORE <", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreLessThanOrEqualTo(String value) {
            addCriterion("ZHIMA_SCORE <=", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreLike(String value) {
            addCriterion("ZHIMA_SCORE like", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotLike(String value) {
            addCriterion("ZHIMA_SCORE not like", value, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreIn(List<String> values) {
            addCriterion("ZHIMA_SCORE in", values, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotIn(List<String> values) {
            addCriterion("ZHIMA_SCORE not in", values, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreBetween(String value1, String value2) {
            addCriterion("ZHIMA_SCORE between", value1, value2, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andZhimaScoreNotBetween(String value1, String value2) {
            addCriterion("ZHIMA_SCORE not between", value1, value2, "zhimaScore");
            return (Criteria) this;
        }

        public Criteria andDeviceIpIsNull() {
            addCriterion("DEVICE_IP is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIpIsNotNull() {
            addCriterion("DEVICE_IP is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIpEqualTo(String value) {
            addCriterion("DEVICE_IP =", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotEqualTo(String value) {
            addCriterion("DEVICE_IP <>", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpGreaterThan(String value) {
            addCriterion("DEVICE_IP >", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_IP >=", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpLessThan(String value) {
            addCriterion("DEVICE_IP <", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_IP <=", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpLike(String value) {
            addCriterion("DEVICE_IP like", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotLike(String value) {
            addCriterion("DEVICE_IP not like", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpIn(List<String> values) {
            addCriterion("DEVICE_IP in", values, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotIn(List<String> values) {
            addCriterion("DEVICE_IP not in", values, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpBetween(String value1, String value2) {
            addCriterion("DEVICE_IP between", value1, value2, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotBetween(String value1, String value2) {
            addCriterion("DEVICE_IP not between", value1, value2, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateIsNull() {
            addCriterion("APPLY_ADRESS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateIsNotNull() {
            addCriterion("APPLY_ADRESS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateEqualTo(String value) {
            addCriterion("APPLY_ADRESS_STATE =", value, "applyAdressState");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateNotEqualTo(String value) {
            addCriterion("APPLY_ADRESS_STATE <>", value, "applyAdressState");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateGreaterThan(String value) {
            addCriterion("APPLY_ADRESS_STATE >", value, "applyAdressState");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_ADRESS_STATE >=", value, "applyAdressState");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateLessThan(String value) {
            addCriterion("APPLY_ADRESS_STATE <", value, "applyAdressState");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateLessThanOrEqualTo(String value) {
            addCriterion("APPLY_ADRESS_STATE <=", value, "applyAdressState");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateLike(String value) {
            addCriterion("APPLY_ADRESS_STATE like", value, "applyAdressState");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateNotLike(String value) {
            addCriterion("APPLY_ADRESS_STATE not like", value, "applyAdressState");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateIn(List<String> values) {
            addCriterion("APPLY_ADRESS_STATE in", values, "applyAdressState");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateNotIn(List<String> values) {
            addCriterion("APPLY_ADRESS_STATE not in", values, "applyAdressState");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateBetween(String value1, String value2) {
            addCriterion("APPLY_ADRESS_STATE between", value1, value2, "applyAdressState");
            return (Criteria) this;
        }

        public Criteria andApplyAdressStateNotBetween(String value1, String value2) {
            addCriterion("APPLY_ADRESS_STATE not between", value1, value2, "applyAdressState");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityIsNull() {
            addCriterion("APPLY_ADRESS_CITY is null");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityIsNotNull() {
            addCriterion("APPLY_ADRESS_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityEqualTo(String value) {
            addCriterion("APPLY_ADRESS_CITY =", value, "applyAdressCity");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityNotEqualTo(String value) {
            addCriterion("APPLY_ADRESS_CITY <>", value, "applyAdressCity");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityGreaterThan(String value) {
            addCriterion("APPLY_ADRESS_CITY >", value, "applyAdressCity");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_ADRESS_CITY >=", value, "applyAdressCity");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityLessThan(String value) {
            addCriterion("APPLY_ADRESS_CITY <", value, "applyAdressCity");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityLessThanOrEqualTo(String value) {
            addCriterion("APPLY_ADRESS_CITY <=", value, "applyAdressCity");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityLike(String value) {
            addCriterion("APPLY_ADRESS_CITY like", value, "applyAdressCity");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityNotLike(String value) {
            addCriterion("APPLY_ADRESS_CITY not like", value, "applyAdressCity");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityIn(List<String> values) {
            addCriterion("APPLY_ADRESS_CITY in", values, "applyAdressCity");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityNotIn(List<String> values) {
            addCriterion("APPLY_ADRESS_CITY not in", values, "applyAdressCity");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityBetween(String value1, String value2) {
            addCriterion("APPLY_ADRESS_CITY between", value1, value2, "applyAdressCity");
            return (Criteria) this;
        }

        public Criteria andApplyAdressCityNotBetween(String value1, String value2) {
            addCriterion("APPLY_ADRESS_CITY not between", value1, value2, "applyAdressCity");
            return (Criteria) this;
        }

        public Criteria andContactsCuntIsNull() {
            addCriterion("CONTACTS_CUNT is null");
            return (Criteria) this;
        }

        public Criteria andContactsCuntIsNotNull() {
            addCriterion("CONTACTS_CUNT is not null");
            return (Criteria) this;
        }

        public Criteria andContactsCuntEqualTo(String value) {
            addCriterion("CONTACTS_CUNT =", value, "contactsCunt");
            return (Criteria) this;
        }

        public Criteria andContactsCuntNotEqualTo(String value) {
            addCriterion("CONTACTS_CUNT <>", value, "contactsCunt");
            return (Criteria) this;
        }

        public Criteria andContactsCuntGreaterThan(String value) {
            addCriterion("CONTACTS_CUNT >", value, "contactsCunt");
            return (Criteria) this;
        }

        public Criteria andContactsCuntGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS_CUNT >=", value, "contactsCunt");
            return (Criteria) this;
        }

        public Criteria andContactsCuntLessThan(String value) {
            addCriterion("CONTACTS_CUNT <", value, "contactsCunt");
            return (Criteria) this;
        }

        public Criteria andContactsCuntLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS_CUNT <=", value, "contactsCunt");
            return (Criteria) this;
        }

        public Criteria andContactsCuntLike(String value) {
            addCriterion("CONTACTS_CUNT like", value, "contactsCunt");
            return (Criteria) this;
        }

        public Criteria andContactsCuntNotLike(String value) {
            addCriterion("CONTACTS_CUNT not like", value, "contactsCunt");
            return (Criteria) this;
        }

        public Criteria andContactsCuntIn(List<String> values) {
            addCriterion("CONTACTS_CUNT in", values, "contactsCunt");
            return (Criteria) this;
        }

        public Criteria andContactsCuntNotIn(List<String> values) {
            addCriterion("CONTACTS_CUNT not in", values, "contactsCunt");
            return (Criteria) this;
        }

        public Criteria andContactsCuntBetween(String value1, String value2) {
            addCriterion("CONTACTS_CUNT between", value1, value2, "contactsCunt");
            return (Criteria) this;
        }

        public Criteria andContactsCuntNotBetween(String value1, String value2) {
            addCriterion("CONTACTS_CUNT not between", value1, value2, "contactsCunt");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateIsNull() {
            addCriterion("IDCARD_ADDRESS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateIsNotNull() {
            addCriterion("IDCARD_ADDRESS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateEqualTo(String value) {
            addCriterion("IDCARD_ADDRESS_STATE =", value, "idcardAddressState");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateNotEqualTo(String value) {
            addCriterion("IDCARD_ADDRESS_STATE <>", value, "idcardAddressState");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateGreaterThan(String value) {
            addCriterion("IDCARD_ADDRESS_STATE >", value, "idcardAddressState");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD_ADDRESS_STATE >=", value, "idcardAddressState");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateLessThan(String value) {
            addCriterion("IDCARD_ADDRESS_STATE <", value, "idcardAddressState");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateLessThanOrEqualTo(String value) {
            addCriterion("IDCARD_ADDRESS_STATE <=", value, "idcardAddressState");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateLike(String value) {
            addCriterion("IDCARD_ADDRESS_STATE like", value, "idcardAddressState");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateNotLike(String value) {
            addCriterion("IDCARD_ADDRESS_STATE not like", value, "idcardAddressState");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateIn(List<String> values) {
            addCriterion("IDCARD_ADDRESS_STATE in", values, "idcardAddressState");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateNotIn(List<String> values) {
            addCriterion("IDCARD_ADDRESS_STATE not in", values, "idcardAddressState");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateBetween(String value1, String value2) {
            addCriterion("IDCARD_ADDRESS_STATE between", value1, value2, "idcardAddressState");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressStateNotBetween(String value1, String value2) {
            addCriterion("IDCARD_ADDRESS_STATE not between", value1, value2, "idcardAddressState");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIsNull() {
            addCriterion("DISCOUNT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIsNotNull() {
            addCriterion("DISCOUNT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeEqualTo(String value) {
            addCriterion("DISCOUNT_CODE =", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotEqualTo(String value) {
            addCriterion("DISCOUNT_CODE <>", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeGreaterThan(String value) {
            addCriterion("DISCOUNT_CODE >", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_CODE >=", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLessThan(String value) {
            addCriterion("DISCOUNT_CODE <", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_CODE <=", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLike(String value) {
            addCriterion("DISCOUNT_CODE like", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotLike(String value) {
            addCriterion("DISCOUNT_CODE not like", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIn(List<String> values) {
            addCriterion("DISCOUNT_CODE in", values, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotIn(List<String> values) {
            addCriterion("DISCOUNT_CODE not in", values, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeBetween(String value1, String value2) {
            addCriterion("DISCOUNT_CODE between", value1, value2, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT_CODE not between", value1, value2, "discountCode");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityIsNull() {
            addCriterion("IDCARD_ADDRESS_CITY is null");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityIsNotNull() {
            addCriterion("IDCARD_ADDRESS_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityEqualTo(String value) {
            addCriterion("IDCARD_ADDRESS_CITY =", value, "idcardAddressCity");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityNotEqualTo(String value) {
            addCriterion("IDCARD_ADDRESS_CITY <>", value, "idcardAddressCity");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityGreaterThan(String value) {
            addCriterion("IDCARD_ADDRESS_CITY >", value, "idcardAddressCity");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD_ADDRESS_CITY >=", value, "idcardAddressCity");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityLessThan(String value) {
            addCriterion("IDCARD_ADDRESS_CITY <", value, "idcardAddressCity");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityLessThanOrEqualTo(String value) {
            addCriterion("IDCARD_ADDRESS_CITY <=", value, "idcardAddressCity");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityLike(String value) {
            addCriterion("IDCARD_ADDRESS_CITY like", value, "idcardAddressCity");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityNotLike(String value) {
            addCriterion("IDCARD_ADDRESS_CITY not like", value, "idcardAddressCity");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityIn(List<String> values) {
            addCriterion("IDCARD_ADDRESS_CITY in", values, "idcardAddressCity");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityNotIn(List<String> values) {
            addCriterion("IDCARD_ADDRESS_CITY not in", values, "idcardAddressCity");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityBetween(String value1, String value2) {
            addCriterion("IDCARD_ADDRESS_CITY between", value1, value2, "idcardAddressCity");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressCityNotBetween(String value1, String value2) {
            addCriterion("IDCARD_ADDRESS_CITY not between", value1, value2, "idcardAddressCity");
            return (Criteria) this;
        }

        public Criteria andWifiSsidIsNull() {
            addCriterion("WIFI_SSID is null");
            return (Criteria) this;
        }

        public Criteria andWifiSsidIsNotNull() {
            addCriterion("WIFI_SSID is not null");
            return (Criteria) this;
        }

        public Criteria andWifiSsidEqualTo(String value) {
            addCriterion("WIFI_SSID =", value, "wifiSsid");
            return (Criteria) this;
        }

        public Criteria andWifiSsidNotEqualTo(String value) {
            addCriterion("WIFI_SSID <>", value, "wifiSsid");
            return (Criteria) this;
        }

        public Criteria andWifiSsidGreaterThan(String value) {
            addCriterion("WIFI_SSID >", value, "wifiSsid");
            return (Criteria) this;
        }

        public Criteria andWifiSsidGreaterThanOrEqualTo(String value) {
            addCriterion("WIFI_SSID >=", value, "wifiSsid");
            return (Criteria) this;
        }

        public Criteria andWifiSsidLessThan(String value) {
            addCriterion("WIFI_SSID <", value, "wifiSsid");
            return (Criteria) this;
        }

        public Criteria andWifiSsidLessThanOrEqualTo(String value) {
            addCriterion("WIFI_SSID <=", value, "wifiSsid");
            return (Criteria) this;
        }

        public Criteria andWifiSsidLike(String value) {
            addCriterion("WIFI_SSID like", value, "wifiSsid");
            return (Criteria) this;
        }

        public Criteria andWifiSsidNotLike(String value) {
            addCriterion("WIFI_SSID not like", value, "wifiSsid");
            return (Criteria) this;
        }

        public Criteria andWifiSsidIn(List<String> values) {
            addCriterion("WIFI_SSID in", values, "wifiSsid");
            return (Criteria) this;
        }

        public Criteria andWifiSsidNotIn(List<String> values) {
            addCriterion("WIFI_SSID not in", values, "wifiSsid");
            return (Criteria) this;
        }

        public Criteria andWifiSsidBetween(String value1, String value2) {
            addCriterion("WIFI_SSID between", value1, value2, "wifiSsid");
            return (Criteria) this;
        }

        public Criteria andWifiSsidNotBetween(String value1, String value2) {
            addCriterion("WIFI_SSID not between", value1, value2, "wifiSsid");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIsNull() {
            addCriterion("GRADUATED_SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIsNotNull() {
            addCriterion("GRADUATED_SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolEqualTo(String value) {
            addCriterion("GRADUATED_SCHOOL =", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotEqualTo(String value) {
            addCriterion("GRADUATED_SCHOOL <>", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolGreaterThan(String value) {
            addCriterion("GRADUATED_SCHOOL >", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATED_SCHOOL >=", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLessThan(String value) {
            addCriterion("GRADUATED_SCHOOL <", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLessThanOrEqualTo(String value) {
            addCriterion("GRADUATED_SCHOOL <=", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLike(String value) {
            addCriterion("GRADUATED_SCHOOL like", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotLike(String value) {
            addCriterion("GRADUATED_SCHOOL not like", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIn(List<String> values) {
            addCriterion("GRADUATED_SCHOOL in", values, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotIn(List<String> values) {
            addCriterion("GRADUATED_SCHOOL not in", values, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolBetween(String value1, String value2) {
            addCriterion("GRADUATED_SCHOOL between", value1, value2, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotBetween(String value1, String value2) {
            addCriterion("GRADUATED_SCHOOL not between", value1, value2, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andStoreStateIsNull() {
            addCriterion("STORE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStoreStateIsNotNull() {
            addCriterion("STORE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStateEqualTo(String value) {
            addCriterion("STORE_STATE =", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotEqualTo(String value) {
            addCriterion("STORE_STATE <>", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateGreaterThan(String value) {
            addCriterion("STORE_STATE >", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_STATE >=", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLessThan(String value) {
            addCriterion("STORE_STATE <", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLessThanOrEqualTo(String value) {
            addCriterion("STORE_STATE <=", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLike(String value) {
            addCriterion("STORE_STATE like", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotLike(String value) {
            addCriterion("STORE_STATE not like", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateIn(List<String> values) {
            addCriterion("STORE_STATE in", values, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotIn(List<String> values) {
            addCriterion("STORE_STATE not in", values, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateBetween(String value1, String value2) {
            addCriterion("STORE_STATE between", value1, value2, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotBetween(String value1, String value2) {
            addCriterion("STORE_STATE not between", value1, value2, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreCityIsNull() {
            addCriterion("STORE_CITY is null");
            return (Criteria) this;
        }

        public Criteria andStoreCityIsNotNull() {
            addCriterion("STORE_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCityEqualTo(String value) {
            addCriterion("STORE_CITY =", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityNotEqualTo(String value) {
            addCriterion("STORE_CITY <>", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityGreaterThan(String value) {
            addCriterion("STORE_CITY >", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_CITY >=", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityLessThan(String value) {
            addCriterion("STORE_CITY <", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityLessThanOrEqualTo(String value) {
            addCriterion("STORE_CITY <=", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityLike(String value) {
            addCriterion("STORE_CITY like", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityNotLike(String value) {
            addCriterion("STORE_CITY not like", value, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityIn(List<String> values) {
            addCriterion("STORE_CITY in", values, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityNotIn(List<String> values) {
            addCriterion("STORE_CITY not in", values, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityBetween(String value1, String value2) {
            addCriterion("STORE_CITY between", value1, value2, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreCityNotBetween(String value1, String value2) {
            addCriterion("STORE_CITY not between", value1, value2, "storeCity");
            return (Criteria) this;
        }

        public Criteria andStoreZoneIsNull() {
            addCriterion("STORE_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andStoreZoneIsNotNull() {
            addCriterion("STORE_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreZoneEqualTo(String value) {
            addCriterion("STORE_ZONE =", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneNotEqualTo(String value) {
            addCriterion("STORE_ZONE <>", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneGreaterThan(String value) {
            addCriterion("STORE_ZONE >", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_ZONE >=", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneLessThan(String value) {
            addCriterion("STORE_ZONE <", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneLessThanOrEqualTo(String value) {
            addCriterion("STORE_ZONE <=", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneLike(String value) {
            addCriterion("STORE_ZONE like", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneNotLike(String value) {
            addCriterion("STORE_ZONE not like", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneIn(List<String> values) {
            addCriterion("STORE_ZONE in", values, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneNotIn(List<String> values) {
            addCriterion("STORE_ZONE not in", values, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneBetween(String value1, String value2) {
            addCriterion("STORE_ZONE between", value1, value2, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneNotBetween(String value1, String value2) {
            addCriterion("STORE_ZONE not between", value1, value2, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreDetailIsNull() {
            addCriterion("STORE_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andStoreDetailIsNotNull() {
            addCriterion("STORE_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDetailEqualTo(String value) {
            addCriterion("STORE_DETAIL =", value, "storeDetail");
            return (Criteria) this;
        }

        public Criteria andStoreDetailNotEqualTo(String value) {
            addCriterion("STORE_DETAIL <>", value, "storeDetail");
            return (Criteria) this;
        }

        public Criteria andStoreDetailGreaterThan(String value) {
            addCriterion("STORE_DETAIL >", value, "storeDetail");
            return (Criteria) this;
        }

        public Criteria andStoreDetailGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_DETAIL >=", value, "storeDetail");
            return (Criteria) this;
        }

        public Criteria andStoreDetailLessThan(String value) {
            addCriterion("STORE_DETAIL <", value, "storeDetail");
            return (Criteria) this;
        }

        public Criteria andStoreDetailLessThanOrEqualTo(String value) {
            addCriterion("STORE_DETAIL <=", value, "storeDetail");
            return (Criteria) this;
        }

        public Criteria andStoreDetailLike(String value) {
            addCriterion("STORE_DETAIL like", value, "storeDetail");
            return (Criteria) this;
        }

        public Criteria andStoreDetailNotLike(String value) {
            addCriterion("STORE_DETAIL not like", value, "storeDetail");
            return (Criteria) this;
        }

        public Criteria andStoreDetailIn(List<String> values) {
            addCriterion("STORE_DETAIL in", values, "storeDetail");
            return (Criteria) this;
        }

        public Criteria andStoreDetailNotIn(List<String> values) {
            addCriterion("STORE_DETAIL not in", values, "storeDetail");
            return (Criteria) this;
        }

        public Criteria andStoreDetailBetween(String value1, String value2) {
            addCriterion("STORE_DETAIL between", value1, value2, "storeDetail");
            return (Criteria) this;
        }

        public Criteria andStoreDetailNotBetween(String value1, String value2) {
            addCriterion("STORE_DETAIL not between", value1, value2, "storeDetail");
            return (Criteria) this;
        }

        public Criteria andResidenceStateIsNull() {
            addCriterion("RESIDENCE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andResidenceStateIsNotNull() {
            addCriterion("RESIDENCE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceStateEqualTo(String value) {
            addCriterion("RESIDENCE_STATE =", value, "residenceState");
            return (Criteria) this;
        }

        public Criteria andResidenceStateNotEqualTo(String value) {
            addCriterion("RESIDENCE_STATE <>", value, "residenceState");
            return (Criteria) this;
        }

        public Criteria andResidenceStateGreaterThan(String value) {
            addCriterion("RESIDENCE_STATE >", value, "residenceState");
            return (Criteria) this;
        }

        public Criteria andResidenceStateGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_STATE >=", value, "residenceState");
            return (Criteria) this;
        }

        public Criteria andResidenceStateLessThan(String value) {
            addCriterion("RESIDENCE_STATE <", value, "residenceState");
            return (Criteria) this;
        }

        public Criteria andResidenceStateLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_STATE <=", value, "residenceState");
            return (Criteria) this;
        }

        public Criteria andResidenceStateLike(String value) {
            addCriterion("RESIDENCE_STATE like", value, "residenceState");
            return (Criteria) this;
        }

        public Criteria andResidenceStateNotLike(String value) {
            addCriterion("RESIDENCE_STATE not like", value, "residenceState");
            return (Criteria) this;
        }

        public Criteria andResidenceStateIn(List<String> values) {
            addCriterion("RESIDENCE_STATE in", values, "residenceState");
            return (Criteria) this;
        }

        public Criteria andResidenceStateNotIn(List<String> values) {
            addCriterion("RESIDENCE_STATE not in", values, "residenceState");
            return (Criteria) this;
        }

        public Criteria andResidenceStateBetween(String value1, String value2) {
            addCriterion("RESIDENCE_STATE between", value1, value2, "residenceState");
            return (Criteria) this;
        }

        public Criteria andResidenceStateNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_STATE not between", value1, value2, "residenceState");
            return (Criteria) this;
        }

        public Criteria andResidenceCityIsNull() {
            addCriterion("RESIDENCE_CITY is null");
            return (Criteria) this;
        }

        public Criteria andResidenceCityIsNotNull() {
            addCriterion("RESIDENCE_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceCityEqualTo(String value) {
            addCriterion("RESIDENCE_CITY =", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityNotEqualTo(String value) {
            addCriterion("RESIDENCE_CITY <>", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityGreaterThan(String value) {
            addCriterion("RESIDENCE_CITY >", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_CITY >=", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityLessThan(String value) {
            addCriterion("RESIDENCE_CITY <", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_CITY <=", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityLike(String value) {
            addCriterion("RESIDENCE_CITY like", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityNotLike(String value) {
            addCriterion("RESIDENCE_CITY not like", value, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityIn(List<String> values) {
            addCriterion("RESIDENCE_CITY in", values, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityNotIn(List<String> values) {
            addCriterion("RESIDENCE_CITY not in", values, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityBetween(String value1, String value2) {
            addCriterion("RESIDENCE_CITY between", value1, value2, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceCityNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_CITY not between", value1, value2, "residenceCity");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneIsNull() {
            addCriterion("RESIDENCE_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneIsNotNull() {
            addCriterion("RESIDENCE_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneEqualTo(String value) {
            addCriterion("RESIDENCE_ZONE =", value, "residenceZone");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneNotEqualTo(String value) {
            addCriterion("RESIDENCE_ZONE <>", value, "residenceZone");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneGreaterThan(String value) {
            addCriterion("RESIDENCE_ZONE >", value, "residenceZone");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_ZONE >=", value, "residenceZone");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneLessThan(String value) {
            addCriterion("RESIDENCE_ZONE <", value, "residenceZone");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_ZONE <=", value, "residenceZone");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneLike(String value) {
            addCriterion("RESIDENCE_ZONE like", value, "residenceZone");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneNotLike(String value) {
            addCriterion("RESIDENCE_ZONE not like", value, "residenceZone");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneIn(List<String> values) {
            addCriterion("RESIDENCE_ZONE in", values, "residenceZone");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneNotIn(List<String> values) {
            addCriterion("RESIDENCE_ZONE not in", values, "residenceZone");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneBetween(String value1, String value2) {
            addCriterion("RESIDENCE_ZONE between", value1, value2, "residenceZone");
            return (Criteria) this;
        }

        public Criteria andResidenceZoneNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_ZONE not between", value1, value2, "residenceZone");
            return (Criteria) this;
        }

        public Criteria andStoreLocationIsNull() {
            addCriterion("STORE_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andStoreLocationIsNotNull() {
            addCriterion("STORE_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLocationEqualTo(String value) {
            addCriterion("STORE_LOCATION =", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationNotEqualTo(String value) {
            addCriterion("STORE_LOCATION <>", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationGreaterThan(String value) {
            addCriterion("STORE_LOCATION >", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_LOCATION >=", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationLessThan(String value) {
            addCriterion("STORE_LOCATION <", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationLessThanOrEqualTo(String value) {
            addCriterion("STORE_LOCATION <=", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationLike(String value) {
            addCriterion("STORE_LOCATION like", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationNotLike(String value) {
            addCriterion("STORE_LOCATION not like", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationIn(List<String> values) {
            addCriterion("STORE_LOCATION in", values, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationNotIn(List<String> values) {
            addCriterion("STORE_LOCATION not in", values, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationBetween(String value1, String value2) {
            addCriterion("STORE_LOCATION between", value1, value2, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationNotBetween(String value1, String value2) {
            addCriterion("STORE_LOCATION not between", value1, value2, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneIsNull() {
            addCriterion("APPLY_ADDRESS_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneIsNotNull() {
            addCriterion("APPLY_ADDRESS_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneEqualTo(String value) {
            addCriterion("APPLY_ADDRESS_ZONE =", value, "applyAddressZone");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneNotEqualTo(String value) {
            addCriterion("APPLY_ADDRESS_ZONE <>", value, "applyAddressZone");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneGreaterThan(String value) {
            addCriterion("APPLY_ADDRESS_ZONE >", value, "applyAddressZone");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_ADDRESS_ZONE >=", value, "applyAddressZone");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneLessThan(String value) {
            addCriterion("APPLY_ADDRESS_ZONE <", value, "applyAddressZone");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneLessThanOrEqualTo(String value) {
            addCriterion("APPLY_ADDRESS_ZONE <=", value, "applyAddressZone");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneLike(String value) {
            addCriterion("APPLY_ADDRESS_ZONE like", value, "applyAddressZone");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneNotLike(String value) {
            addCriterion("APPLY_ADDRESS_ZONE not like", value, "applyAddressZone");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneIn(List<String> values) {
            addCriterion("APPLY_ADDRESS_ZONE in", values, "applyAddressZone");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneNotIn(List<String> values) {
            addCriterion("APPLY_ADDRESS_ZONE not in", values, "applyAddressZone");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneBetween(String value1, String value2) {
            addCriterion("APPLY_ADDRESS_ZONE between", value1, value2, "applyAddressZone");
            return (Criteria) this;
        }

        public Criteria andApplyAddressZoneNotBetween(String value1, String value2) {
            addCriterion("APPLY_ADDRESS_ZONE not between", value1, value2, "applyAddressZone");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("STORE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("STORE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("STORE_NAME =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("STORE_NAME <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("STORE_NAME >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_NAME >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("STORE_NAME <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("STORE_NAME <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("STORE_NAME like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("STORE_NAME not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("STORE_NAME in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("STORE_NAME not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("STORE_NAME between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("STORE_NAME not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddIsNull() {
            addCriterion("ID_AREA_ADD is null");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddIsNotNull() {
            addCriterion("ID_AREA_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddEqualTo(String value) {
            addCriterion("ID_AREA_ADD =", value, "idAreaAdd");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddNotEqualTo(String value) {
            addCriterion("ID_AREA_ADD <>", value, "idAreaAdd");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddGreaterThan(String value) {
            addCriterion("ID_AREA_ADD >", value, "idAreaAdd");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddGreaterThanOrEqualTo(String value) {
            addCriterion("ID_AREA_ADD >=", value, "idAreaAdd");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddLessThan(String value) {
            addCriterion("ID_AREA_ADD <", value, "idAreaAdd");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddLessThanOrEqualTo(String value) {
            addCriterion("ID_AREA_ADD <=", value, "idAreaAdd");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddLike(String value) {
            addCriterion("ID_AREA_ADD like", value, "idAreaAdd");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddNotLike(String value) {
            addCriterion("ID_AREA_ADD not like", value, "idAreaAdd");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddIn(List<String> values) {
            addCriterion("ID_AREA_ADD in", values, "idAreaAdd");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddNotIn(List<String> values) {
            addCriterion("ID_AREA_ADD not in", values, "idAreaAdd");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddBetween(String value1, String value2) {
            addCriterion("ID_AREA_ADD between", value1, value2, "idAreaAdd");
            return (Criteria) this;
        }

        public Criteria andIdAreaAddNotBetween(String value1, String value2) {
            addCriterion("ID_AREA_ADD not between", value1, value2, "idAreaAdd");
            return (Criteria) this;
        }

        public Criteria andIdAreaIsNull() {
            addCriterion("ID_AREA is null");
            return (Criteria) this;
        }

        public Criteria andIdAreaIsNotNull() {
            addCriterion("ID_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andIdAreaEqualTo(String value) {
            addCriterion("ID_AREA =", value, "idArea");
            return (Criteria) this;
        }

        public Criteria andIdAreaNotEqualTo(String value) {
            addCriterion("ID_AREA <>", value, "idArea");
            return (Criteria) this;
        }

        public Criteria andIdAreaGreaterThan(String value) {
            addCriterion("ID_AREA >", value, "idArea");
            return (Criteria) this;
        }

        public Criteria andIdAreaGreaterThanOrEqualTo(String value) {
            addCriterion("ID_AREA >=", value, "idArea");
            return (Criteria) this;
        }

        public Criteria andIdAreaLessThan(String value) {
            addCriterion("ID_AREA <", value, "idArea");
            return (Criteria) this;
        }

        public Criteria andIdAreaLessThanOrEqualTo(String value) {
            addCriterion("ID_AREA <=", value, "idArea");
            return (Criteria) this;
        }

        public Criteria andIdAreaLike(String value) {
            addCriterion("ID_AREA like", value, "idArea");
            return (Criteria) this;
        }

        public Criteria andIdAreaNotLike(String value) {
            addCriterion("ID_AREA not like", value, "idArea");
            return (Criteria) this;
        }

        public Criteria andIdAreaIn(List<String> values) {
            addCriterion("ID_AREA in", values, "idArea");
            return (Criteria) this;
        }

        public Criteria andIdAreaNotIn(List<String> values) {
            addCriterion("ID_AREA not in", values, "idArea");
            return (Criteria) this;
        }

        public Criteria andIdAreaBetween(String value1, String value2) {
            addCriterion("ID_AREA between", value1, value2, "idArea");
            return (Criteria) this;
        }

        public Criteria andIdAreaNotBetween(String value1, String value2) {
            addCriterion("ID_AREA not between", value1, value2, "idArea");
            return (Criteria) this;
        }

        public Criteria andGpsStateIsNull() {
            addCriterion("GPS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andGpsStateIsNotNull() {
            addCriterion("GPS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andGpsStateEqualTo(String value) {
            addCriterion("GPS_STATE =", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateNotEqualTo(String value) {
            addCriterion("GPS_STATE <>", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateGreaterThan(String value) {
            addCriterion("GPS_STATE >", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateGreaterThanOrEqualTo(String value) {
            addCriterion("GPS_STATE >=", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateLessThan(String value) {
            addCriterion("GPS_STATE <", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateLessThanOrEqualTo(String value) {
            addCriterion("GPS_STATE <=", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateLike(String value) {
            addCriterion("GPS_STATE like", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateNotLike(String value) {
            addCriterion("GPS_STATE not like", value, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateIn(List<String> values) {
            addCriterion("GPS_STATE in", values, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateNotIn(List<String> values) {
            addCriterion("GPS_STATE not in", values, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateBetween(String value1, String value2) {
            addCriterion("GPS_STATE between", value1, value2, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsStateNotBetween(String value1, String value2) {
            addCriterion("GPS_STATE not between", value1, value2, "gpsState");
            return (Criteria) this;
        }

        public Criteria andGpsCityIsNull() {
            addCriterion("GPS_CITY is null");
            return (Criteria) this;
        }

        public Criteria andGpsCityIsNotNull() {
            addCriterion("GPS_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andGpsCityEqualTo(String value) {
            addCriterion("GPS_CITY =", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityNotEqualTo(String value) {
            addCriterion("GPS_CITY <>", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityGreaterThan(String value) {
            addCriterion("GPS_CITY >", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityGreaterThanOrEqualTo(String value) {
            addCriterion("GPS_CITY >=", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityLessThan(String value) {
            addCriterion("GPS_CITY <", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityLessThanOrEqualTo(String value) {
            addCriterion("GPS_CITY <=", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityLike(String value) {
            addCriterion("GPS_CITY like", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityNotLike(String value) {
            addCriterion("GPS_CITY not like", value, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityIn(List<String> values) {
            addCriterion("GPS_CITY in", values, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityNotIn(List<String> values) {
            addCriterion("GPS_CITY not in", values, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityBetween(String value1, String value2) {
            addCriterion("GPS_CITY between", value1, value2, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andGpsCityNotBetween(String value1, String value2) {
            addCriterion("GPS_CITY not between", value1, value2, "gpsCity");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoIsNull() {
            addCriterion("CREDIT_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoIsNotNull() {
            addCriterion("CREDIT_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoEqualTo(String value) {
            addCriterion("CREDIT_CARD_NO =", value, "creditCardNo");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoNotEqualTo(String value) {
            addCriterion("CREDIT_CARD_NO <>", value, "creditCardNo");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoGreaterThan(String value) {
            addCriterion("CREDIT_CARD_NO >", value, "creditCardNo");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_CARD_NO >=", value, "creditCardNo");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoLessThan(String value) {
            addCriterion("CREDIT_CARD_NO <", value, "creditCardNo");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_CARD_NO <=", value, "creditCardNo");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoLike(String value) {
            addCriterion("CREDIT_CARD_NO like", value, "creditCardNo");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoNotLike(String value) {
            addCriterion("CREDIT_CARD_NO not like", value, "creditCardNo");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoIn(List<String> values) {
            addCriterion("CREDIT_CARD_NO in", values, "creditCardNo");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoNotIn(List<String> values) {
            addCriterion("CREDIT_CARD_NO not in", values, "creditCardNo");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoBetween(String value1, String value2) {
            addCriterion("CREDIT_CARD_NO between", value1, value2, "creditCardNo");
            return (Criteria) this;
        }

        public Criteria andCreditCardNoNotBetween(String value1, String value2) {
            addCriterion("CREDIT_CARD_NO not between", value1, value2, "creditCardNo");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1IsNull() {
            addCriterion("CREDIT_CARD_NO1 is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1IsNotNull() {
            addCriterion("CREDIT_CARD_NO1 is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1EqualTo(String value) {
            addCriterion("CREDIT_CARD_NO1 =", value, "creditCardNo1");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1NotEqualTo(String value) {
            addCriterion("CREDIT_CARD_NO1 <>", value, "creditCardNo1");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1GreaterThan(String value) {
            addCriterion("CREDIT_CARD_NO1 >", value, "creditCardNo1");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1GreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_CARD_NO1 >=", value, "creditCardNo1");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1LessThan(String value) {
            addCriterion("CREDIT_CARD_NO1 <", value, "creditCardNo1");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1LessThanOrEqualTo(String value) {
            addCriterion("CREDIT_CARD_NO1 <=", value, "creditCardNo1");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1Like(String value) {
            addCriterion("CREDIT_CARD_NO1 like", value, "creditCardNo1");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1NotLike(String value) {
            addCriterion("CREDIT_CARD_NO1 not like", value, "creditCardNo1");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1In(List<String> values) {
            addCriterion("CREDIT_CARD_NO1 in", values, "creditCardNo1");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1NotIn(List<String> values) {
            addCriterion("CREDIT_CARD_NO1 not in", values, "creditCardNo1");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1Between(String value1, String value2) {
            addCriterion("CREDIT_CARD_NO1 between", value1, value2, "creditCardNo1");
            return (Criteria) this;
        }

        public Criteria andCreditCardNo1NotBetween(String value1, String value2) {
            addCriterion("CREDIT_CARD_NO1 not between", value1, value2, "creditCardNo1");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoIsNull() {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO is null");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoIsNotNull() {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoEqualTo(String value) {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO =", value, "tmAppPrimApplicantInfo");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoNotEqualTo(String value) {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO <>", value, "tmAppPrimApplicantInfo");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoGreaterThan(String value) {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO >", value, "tmAppPrimApplicantInfo");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoGreaterThanOrEqualTo(String value) {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO >=", value, "tmAppPrimApplicantInfo");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoLessThan(String value) {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO <", value, "tmAppPrimApplicantInfo");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoLessThanOrEqualTo(String value) {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO <=", value, "tmAppPrimApplicantInfo");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoLike(String value) {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO like", value, "tmAppPrimApplicantInfo");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoNotLike(String value) {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO not like", value, "tmAppPrimApplicantInfo");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoIn(List<String> values) {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO in", values, "tmAppPrimApplicantInfo");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoNotIn(List<String> values) {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO not in", values, "tmAppPrimApplicantInfo");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoBetween(String value1, String value2) {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO between", value1, value2, "tmAppPrimApplicantInfo");
            return (Criteria) this;
        }

        public Criteria andTmAppPrimApplicantInfoNotBetween(String value1, String value2) {
            addCriterion("TM_APP_PRIM_APPLICANT_INFO not between", value1, value2, "tmAppPrimApplicantInfo");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeIsNull() {
            addCriterion("JUDGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeIsNotNull() {
            addCriterion("JUDGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeEqualTo(String value) {
            addCriterion("JUDGE_TYPE =", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeNotEqualTo(String value) {
            addCriterion("JUDGE_TYPE <>", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeGreaterThan(String value) {
            addCriterion("JUDGE_TYPE >", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("JUDGE_TYPE >=", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeLessThan(String value) {
            addCriterion("JUDGE_TYPE <", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeLessThanOrEqualTo(String value) {
            addCriterion("JUDGE_TYPE <=", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeLike(String value) {
            addCriterion("JUDGE_TYPE like", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeNotLike(String value) {
            addCriterion("JUDGE_TYPE not like", value, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeIn(List<String> values) {
            addCriterion("JUDGE_TYPE in", values, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeNotIn(List<String> values) {
            addCriterion("JUDGE_TYPE not in", values, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeBetween(String value1, String value2) {
            addCriterion("JUDGE_TYPE between", value1, value2, "judgeType");
            return (Criteria) this;
        }

        public Criteria andJudgeTypeNotBetween(String value1, String value2) {
            addCriterion("JUDGE_TYPE not between", value1, value2, "judgeType");
            return (Criteria) this;
        }

        public Criteria andXgRemarkIsNull() {
            addCriterion("XG_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andXgRemarkIsNotNull() {
            addCriterion("XG_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andXgRemarkEqualTo(String value) {
            addCriterion("XG_REMARK =", value, "xgRemark");
            return (Criteria) this;
        }

        public Criteria andXgRemarkNotEqualTo(String value) {
            addCriterion("XG_REMARK <>", value, "xgRemark");
            return (Criteria) this;
        }

        public Criteria andXgRemarkGreaterThan(String value) {
            addCriterion("XG_REMARK >", value, "xgRemark");
            return (Criteria) this;
        }

        public Criteria andXgRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("XG_REMARK >=", value, "xgRemark");
            return (Criteria) this;
        }

        public Criteria andXgRemarkLessThan(String value) {
            addCriterion("XG_REMARK <", value, "xgRemark");
            return (Criteria) this;
        }

        public Criteria andXgRemarkLessThanOrEqualTo(String value) {
            addCriterion("XG_REMARK <=", value, "xgRemark");
            return (Criteria) this;
        }

        public Criteria andXgRemarkLike(String value) {
            addCriterion("XG_REMARK like", value, "xgRemark");
            return (Criteria) this;
        }

        public Criteria andXgRemarkNotLike(String value) {
            addCriterion("XG_REMARK not like", value, "xgRemark");
            return (Criteria) this;
        }

        public Criteria andXgRemarkIn(List<String> values) {
            addCriterion("XG_REMARK in", values, "xgRemark");
            return (Criteria) this;
        }

        public Criteria andXgRemarkNotIn(List<String> values) {
            addCriterion("XG_REMARK not in", values, "xgRemark");
            return (Criteria) this;
        }

        public Criteria andXgRemarkBetween(String value1, String value2) {
            addCriterion("XG_REMARK between", value1, value2, "xgRemark");
            return (Criteria) this;
        }

        public Criteria andXgRemarkNotBetween(String value1, String value2) {
            addCriterion("XG_REMARK not between", value1, value2, "xgRemark");
            return (Criteria) this;
        }

        public Criteria andIsMonitorIsNull() {
            addCriterion("IS_MONITOR is null");
            return (Criteria) this;
        }

        public Criteria andIsMonitorIsNotNull() {
            addCriterion("IS_MONITOR is not null");
            return (Criteria) this;
        }

        public Criteria andIsMonitorEqualTo(String value) {
            addCriterion("IS_MONITOR =", value, "isMonitor");
            return (Criteria) this;
        }

        public Criteria andIsMonitorNotEqualTo(String value) {
            addCriterion("IS_MONITOR <>", value, "isMonitor");
            return (Criteria) this;
        }

        public Criteria andIsMonitorGreaterThan(String value) {
            addCriterion("IS_MONITOR >", value, "isMonitor");
            return (Criteria) this;
        }

        public Criteria andIsMonitorGreaterThanOrEqualTo(String value) {
            addCriterion("IS_MONITOR >=", value, "isMonitor");
            return (Criteria) this;
        }

        public Criteria andIsMonitorLessThan(String value) {
            addCriterion("IS_MONITOR <", value, "isMonitor");
            return (Criteria) this;
        }

        public Criteria andIsMonitorLessThanOrEqualTo(String value) {
            addCriterion("IS_MONITOR <=", value, "isMonitor");
            return (Criteria) this;
        }

        public Criteria andIsMonitorLike(String value) {
            addCriterion("IS_MONITOR like", value, "isMonitor");
            return (Criteria) this;
        }

        public Criteria andIsMonitorNotLike(String value) {
            addCriterion("IS_MONITOR not like", value, "isMonitor");
            return (Criteria) this;
        }

        public Criteria andIsMonitorIn(List<String> values) {
            addCriterion("IS_MONITOR in", values, "isMonitor");
            return (Criteria) this;
        }

        public Criteria andIsMonitorNotIn(List<String> values) {
            addCriterion("IS_MONITOR not in", values, "isMonitor");
            return (Criteria) this;
        }

        public Criteria andIsMonitorBetween(String value1, String value2) {
            addCriterion("IS_MONITOR between", value1, value2, "isMonitor");
            return (Criteria) this;
        }

        public Criteria andIsMonitorNotBetween(String value1, String value2) {
            addCriterion("IS_MONITOR not between", value1, value2, "isMonitor");
            return (Criteria) this;
        }

        public Criteria andCreditUserIsNull() {
            addCriterion("CREDIT_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreditUserIsNotNull() {
            addCriterion("CREDIT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreditUserEqualTo(String value) {
            addCriterion("CREDIT_USER =", value, "creditUser");
            return (Criteria) this;
        }

        public Criteria andCreditUserNotEqualTo(String value) {
            addCriterion("CREDIT_USER <>", value, "creditUser");
            return (Criteria) this;
        }

        public Criteria andCreditUserGreaterThan(String value) {
            addCriterion("CREDIT_USER >", value, "creditUser");
            return (Criteria) this;
        }

        public Criteria andCreditUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_USER >=", value, "creditUser");
            return (Criteria) this;
        }

        public Criteria andCreditUserLessThan(String value) {
            addCriterion("CREDIT_USER <", value, "creditUser");
            return (Criteria) this;
        }

        public Criteria andCreditUserLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_USER <=", value, "creditUser");
            return (Criteria) this;
        }

        public Criteria andCreditUserLike(String value) {
            addCriterion("CREDIT_USER like", value, "creditUser");
            return (Criteria) this;
        }

        public Criteria andCreditUserNotLike(String value) {
            addCriterion("CREDIT_USER not like", value, "creditUser");
            return (Criteria) this;
        }

        public Criteria andCreditUserIn(List<String> values) {
            addCriterion("CREDIT_USER in", values, "creditUser");
            return (Criteria) this;
        }

        public Criteria andCreditUserNotIn(List<String> values) {
            addCriterion("CREDIT_USER not in", values, "creditUser");
            return (Criteria) this;
        }

        public Criteria andCreditUserBetween(String value1, String value2) {
            addCriterion("CREDIT_USER between", value1, value2, "creditUser");
            return (Criteria) this;
        }

        public Criteria andCreditUserNotBetween(String value1, String value2) {
            addCriterion("CREDIT_USER not between", value1, value2, "creditUser");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeIsNull() {
            addCriterion("GPS_LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeIsNotNull() {
            addCriterion("GPS_LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeEqualTo(String value) {
            addCriterion("GPS_LONGITUDE =", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeNotEqualTo(String value) {
            addCriterion("GPS_LONGITUDE <>", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeGreaterThan(String value) {
            addCriterion("GPS_LONGITUDE >", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("GPS_LONGITUDE >=", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeLessThan(String value) {
            addCriterion("GPS_LONGITUDE <", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeLessThanOrEqualTo(String value) {
            addCriterion("GPS_LONGITUDE <=", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeLike(String value) {
            addCriterion("GPS_LONGITUDE like", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeNotLike(String value) {
            addCriterion("GPS_LONGITUDE not like", value, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeIn(List<String> values) {
            addCriterion("GPS_LONGITUDE in", values, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeNotIn(List<String> values) {
            addCriterion("GPS_LONGITUDE not in", values, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeBetween(String value1, String value2) {
            addCriterion("GPS_LONGITUDE between", value1, value2, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLongitudeNotBetween(String value1, String value2) {
            addCriterion("GPS_LONGITUDE not between", value1, value2, "gpsLongitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeIsNull() {
            addCriterion("GPS_LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeIsNotNull() {
            addCriterion("GPS_LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeEqualTo(String value) {
            addCriterion("GPS_LATITUDE =", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeNotEqualTo(String value) {
            addCriterion("GPS_LATITUDE <>", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeGreaterThan(String value) {
            addCriterion("GPS_LATITUDE >", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("GPS_LATITUDE >=", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeLessThan(String value) {
            addCriterion("GPS_LATITUDE <", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeLessThanOrEqualTo(String value) {
            addCriterion("GPS_LATITUDE <=", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeLike(String value) {
            addCriterion("GPS_LATITUDE like", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeNotLike(String value) {
            addCriterion("GPS_LATITUDE not like", value, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeIn(List<String> values) {
            addCriterion("GPS_LATITUDE in", values, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeNotIn(List<String> values) {
            addCriterion("GPS_LATITUDE not in", values, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeBetween(String value1, String value2) {
            addCriterion("GPS_LATITUDE between", value1, value2, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andGpsLatitudeNotBetween(String value1, String value2) {
            addCriterion("GPS_LATITUDE not between", value1, value2, "gpsLatitude");
            return (Criteria) this;
        }

        public Criteria andPhoneRootIsNull() {
            addCriterion("PHONE_ROOT is null");
            return (Criteria) this;
        }

        public Criteria andPhoneRootIsNotNull() {
            addCriterion("PHONE_ROOT is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneRootEqualTo(String value) {
            addCriterion("PHONE_ROOT =", value, "phoneRoot");
            return (Criteria) this;
        }

        public Criteria andPhoneRootNotEqualTo(String value) {
            addCriterion("PHONE_ROOT <>", value, "phoneRoot");
            return (Criteria) this;
        }

        public Criteria andPhoneRootGreaterThan(String value) {
            addCriterion("PHONE_ROOT >", value, "phoneRoot");
            return (Criteria) this;
        }

        public Criteria andPhoneRootGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_ROOT >=", value, "phoneRoot");
            return (Criteria) this;
        }

        public Criteria andPhoneRootLessThan(String value) {
            addCriterion("PHONE_ROOT <", value, "phoneRoot");
            return (Criteria) this;
        }

        public Criteria andPhoneRootLessThanOrEqualTo(String value) {
            addCriterion("PHONE_ROOT <=", value, "phoneRoot");
            return (Criteria) this;
        }

        public Criteria andPhoneRootLike(String value) {
            addCriterion("PHONE_ROOT like", value, "phoneRoot");
            return (Criteria) this;
        }

        public Criteria andPhoneRootNotLike(String value) {
            addCriterion("PHONE_ROOT not like", value, "phoneRoot");
            return (Criteria) this;
        }

        public Criteria andPhoneRootIn(List<String> values) {
            addCriterion("PHONE_ROOT in", values, "phoneRoot");
            return (Criteria) this;
        }

        public Criteria andPhoneRootNotIn(List<String> values) {
            addCriterion("PHONE_ROOT not in", values, "phoneRoot");
            return (Criteria) this;
        }

        public Criteria andPhoneRootBetween(String value1, String value2) {
            addCriterion("PHONE_ROOT between", value1, value2, "phoneRoot");
            return (Criteria) this;
        }

        public Criteria andPhoneRootNotBetween(String value1, String value2) {
            addCriterion("PHONE_ROOT not between", value1, value2, "phoneRoot");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceIsNull() {
            addCriterion("LENGTH_OF_RESIDENCE is null");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceIsNotNull() {
            addCriterion("LENGTH_OF_RESIDENCE is not null");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceEqualTo(String value) {
            addCriterion("LENGTH_OF_RESIDENCE =", value, "lengthOfResidence");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceNotEqualTo(String value) {
            addCriterion("LENGTH_OF_RESIDENCE <>", value, "lengthOfResidence");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceGreaterThan(String value) {
            addCriterion("LENGTH_OF_RESIDENCE >", value, "lengthOfResidence");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("LENGTH_OF_RESIDENCE >=", value, "lengthOfResidence");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceLessThan(String value) {
            addCriterion("LENGTH_OF_RESIDENCE <", value, "lengthOfResidence");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceLessThanOrEqualTo(String value) {
            addCriterion("LENGTH_OF_RESIDENCE <=", value, "lengthOfResidence");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceLike(String value) {
            addCriterion("LENGTH_OF_RESIDENCE like", value, "lengthOfResidence");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceNotLike(String value) {
            addCriterion("LENGTH_OF_RESIDENCE not like", value, "lengthOfResidence");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceIn(List<String> values) {
            addCriterion("LENGTH_OF_RESIDENCE in", values, "lengthOfResidence");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceNotIn(List<String> values) {
            addCriterion("LENGTH_OF_RESIDENCE not in", values, "lengthOfResidence");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceBetween(String value1, String value2) {
            addCriterion("LENGTH_OF_RESIDENCE between", value1, value2, "lengthOfResidence");
            return (Criteria) this;
        }

        public Criteria andLengthOfResidenceNotBetween(String value1, String value2) {
            addCriterion("LENGTH_OF_RESIDENCE not between", value1, value2, "lengthOfResidence");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormIsNull() {
            addCriterion("SALARY_PAY_FORM is null");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormIsNotNull() {
            addCriterion("SALARY_PAY_FORM is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormEqualTo(String value) {
            addCriterion("SALARY_PAY_FORM =", value, "salaryPayForm");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormNotEqualTo(String value) {
            addCriterion("SALARY_PAY_FORM <>", value, "salaryPayForm");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormGreaterThan(String value) {
            addCriterion("SALARY_PAY_FORM >", value, "salaryPayForm");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormGreaterThanOrEqualTo(String value) {
            addCriterion("SALARY_PAY_FORM >=", value, "salaryPayForm");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormLessThan(String value) {
            addCriterion("SALARY_PAY_FORM <", value, "salaryPayForm");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormLessThanOrEqualTo(String value) {
            addCriterion("SALARY_PAY_FORM <=", value, "salaryPayForm");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormLike(String value) {
            addCriterion("SALARY_PAY_FORM like", value, "salaryPayForm");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormNotLike(String value) {
            addCriterion("SALARY_PAY_FORM not like", value, "salaryPayForm");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormIn(List<String> values) {
            addCriterion("SALARY_PAY_FORM in", values, "salaryPayForm");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormNotIn(List<String> values) {
            addCriterion("SALARY_PAY_FORM not in", values, "salaryPayForm");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormBetween(String value1, String value2) {
            addCriterion("SALARY_PAY_FORM between", value1, value2, "salaryPayForm");
            return (Criteria) this;
        }

        public Criteria andSalaryPayFormNotBetween(String value1, String value2) {
            addCriterion("SALARY_PAY_FORM not between", value1, value2, "salaryPayForm");
            return (Criteria) this;
        }

        public Criteria andIsRenhangIsNull() {
            addCriterion("IS_RENHANG is null");
            return (Criteria) this;
        }

        public Criteria andIsRenhangIsNotNull() {
            addCriterion("IS_RENHANG is not null");
            return (Criteria) this;
        }

        public Criteria andIsRenhangEqualTo(String value) {
            addCriterion("IS_RENHANG =", value, "isRenhang");
            return (Criteria) this;
        }

        public Criteria andIsRenhangNotEqualTo(String value) {
            addCriterion("IS_RENHANG <>", value, "isRenhang");
            return (Criteria) this;
        }

        public Criteria andIsRenhangGreaterThan(String value) {
            addCriterion("IS_RENHANG >", value, "isRenhang");
            return (Criteria) this;
        }

        public Criteria andIsRenhangGreaterThanOrEqualTo(String value) {
            addCriterion("IS_RENHANG >=", value, "isRenhang");
            return (Criteria) this;
        }

        public Criteria andIsRenhangLessThan(String value) {
            addCriterion("IS_RENHANG <", value, "isRenhang");
            return (Criteria) this;
        }

        public Criteria andIsRenhangLessThanOrEqualTo(String value) {
            addCriterion("IS_RENHANG <=", value, "isRenhang");
            return (Criteria) this;
        }

        public Criteria andIsRenhangLike(String value) {
            addCriterion("IS_RENHANG like", value, "isRenhang");
            return (Criteria) this;
        }

        public Criteria andIsRenhangNotLike(String value) {
            addCriterion("IS_RENHANG not like", value, "isRenhang");
            return (Criteria) this;
        }

        public Criteria andIsRenhangIn(List<String> values) {
            addCriterion("IS_RENHANG in", values, "isRenhang");
            return (Criteria) this;
        }

        public Criteria andIsRenhangNotIn(List<String> values) {
            addCriterion("IS_RENHANG not in", values, "isRenhang");
            return (Criteria) this;
        }

        public Criteria andIsRenhangBetween(String value1, String value2) {
            addCriterion("IS_RENHANG between", value1, value2, "isRenhang");
            return (Criteria) this;
        }

        public Criteria andIsRenhangNotBetween(String value1, String value2) {
            addCriterion("IS_RENHANG not between", value1, value2, "isRenhang");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameIsNull() {
            addCriterion("CREDIT_BANK_CARD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameIsNotNull() {
            addCriterion("CREDIT_BANK_CARD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameEqualTo(String value) {
            addCriterion("CREDIT_BANK_CARD_NAME =", value, "creditBankCardName");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameNotEqualTo(String value) {
            addCriterion("CREDIT_BANK_CARD_NAME <>", value, "creditBankCardName");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameGreaterThan(String value) {
            addCriterion("CREDIT_BANK_CARD_NAME >", value, "creditBankCardName");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_BANK_CARD_NAME >=", value, "creditBankCardName");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameLessThan(String value) {
            addCriterion("CREDIT_BANK_CARD_NAME <", value, "creditBankCardName");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_BANK_CARD_NAME <=", value, "creditBankCardName");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameLike(String value) {
            addCriterion("CREDIT_BANK_CARD_NAME like", value, "creditBankCardName");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameNotLike(String value) {
            addCriterion("CREDIT_BANK_CARD_NAME not like", value, "creditBankCardName");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameIn(List<String> values) {
            addCriterion("CREDIT_BANK_CARD_NAME in", values, "creditBankCardName");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameNotIn(List<String> values) {
            addCriterion("CREDIT_BANK_CARD_NAME not in", values, "creditBankCardName");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameBetween(String value1, String value2) {
            addCriterion("CREDIT_BANK_CARD_NAME between", value1, value2, "creditBankCardName");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardNameNotBetween(String value1, String value2) {
            addCriterion("CREDIT_BANK_CARD_NAME not between", value1, value2, "creditBankCardName");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeIsNull() {
            addCriterion("CREDIT_BANK_CARD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeIsNotNull() {
            addCriterion("CREDIT_BANK_CARD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeEqualTo(String value) {
            addCriterion("CREDIT_BANK_CARD_CODE =", value, "creditBankCardCode");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeNotEqualTo(String value) {
            addCriterion("CREDIT_BANK_CARD_CODE <>", value, "creditBankCardCode");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeGreaterThan(String value) {
            addCriterion("CREDIT_BANK_CARD_CODE >", value, "creditBankCardCode");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_BANK_CARD_CODE >=", value, "creditBankCardCode");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeLessThan(String value) {
            addCriterion("CREDIT_BANK_CARD_CODE <", value, "creditBankCardCode");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_BANK_CARD_CODE <=", value, "creditBankCardCode");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeLike(String value) {
            addCriterion("CREDIT_BANK_CARD_CODE like", value, "creditBankCardCode");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeNotLike(String value) {
            addCriterion("CREDIT_BANK_CARD_CODE not like", value, "creditBankCardCode");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeIn(List<String> values) {
            addCriterion("CREDIT_BANK_CARD_CODE in", values, "creditBankCardCode");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeNotIn(List<String> values) {
            addCriterion("CREDIT_BANK_CARD_CODE not in", values, "creditBankCardCode");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeBetween(String value1, String value2) {
            addCriterion("CREDIT_BANK_CARD_CODE between", value1, value2, "creditBankCardCode");
            return (Criteria) this;
        }

        public Criteria andCreditBankCardCodeNotBetween(String value1, String value2) {
            addCriterion("CREDIT_BANK_CARD_CODE not between", value1, value2, "creditBankCardCode");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileIsNull() {
            addCriterion("CREDIT_CARD_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileIsNotNull() {
            addCriterion("CREDIT_CARD_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileEqualTo(String value) {
            addCriterion("CREDIT_CARD_MOBILE =", value, "creditCardMobile");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileNotEqualTo(String value) {
            addCriterion("CREDIT_CARD_MOBILE <>", value, "creditCardMobile");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileGreaterThan(String value) {
            addCriterion("CREDIT_CARD_MOBILE >", value, "creditCardMobile");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_CARD_MOBILE >=", value, "creditCardMobile");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileLessThan(String value) {
            addCriterion("CREDIT_CARD_MOBILE <", value, "creditCardMobile");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_CARD_MOBILE <=", value, "creditCardMobile");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileLike(String value) {
            addCriterion("CREDIT_CARD_MOBILE like", value, "creditCardMobile");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileNotLike(String value) {
            addCriterion("CREDIT_CARD_MOBILE not like", value, "creditCardMobile");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileIn(List<String> values) {
            addCriterion("CREDIT_CARD_MOBILE in", values, "creditCardMobile");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileNotIn(List<String> values) {
            addCriterion("CREDIT_CARD_MOBILE not in", values, "creditCardMobile");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileBetween(String value1, String value2) {
            addCriterion("CREDIT_CARD_MOBILE between", value1, value2, "creditCardMobile");
            return (Criteria) this;
        }

        public Criteria andCreditCardMobileNotBetween(String value1, String value2) {
            addCriterion("CREDIT_CARD_MOBILE not between", value1, value2, "creditCardMobile");
            return (Criteria) this;
        }

        public Criteria andProductRateIsNull() {
            addCriterion("PRODUCT_RATE is null");
            return (Criteria) this;
        }

        public Criteria andProductRateIsNotNull() {
            addCriterion("PRODUCT_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andProductRateEqualTo(String value) {
            addCriterion("PRODUCT_RATE =", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateNotEqualTo(String value) {
            addCriterion("PRODUCT_RATE <>", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateGreaterThan(String value) {
            addCriterion("PRODUCT_RATE >", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_RATE >=", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateLessThan(String value) {
            addCriterion("PRODUCT_RATE <", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_RATE <=", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateLike(String value) {
            addCriterion("PRODUCT_RATE like", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateNotLike(String value) {
            addCriterion("PRODUCT_RATE not like", value, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateIn(List<String> values) {
            addCriterion("PRODUCT_RATE in", values, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateNotIn(List<String> values) {
            addCriterion("PRODUCT_RATE not in", values, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateBetween(String value1, String value2) {
            addCriterion("PRODUCT_RATE between", value1, value2, "productRate");
            return (Criteria) this;
        }

        public Criteria andProductRateNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_RATE not between", value1, value2, "productRate");
            return (Criteria) this;
        }
    }

    /**
     * tm_app_prim_applicant_info
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tm_app_prim_applicant_info 2018-05-16
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