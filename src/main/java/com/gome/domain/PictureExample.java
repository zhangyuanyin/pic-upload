package com.gome.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PictureExample {
    /**
     * picture
     */
    protected String orderByClause;

    /**
     * picture
     */
    protected boolean distinct;

    /**
     * picture
     */
    protected List<Criteria> oredCriteria;

    public PictureExample() {
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
     * picture 2018-05-10
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
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

        public Criteria andOennerIsNull() {
            addCriterion("OENNER is null");
            return (Criteria) this;
        }

        public Criteria andOennerIsNotNull() {
            addCriterion("OENNER is not null");
            return (Criteria) this;
        }

        public Criteria andOennerEqualTo(String value) {
            addCriterion("OENNER =", value, "oenner");
            return (Criteria) this;
        }

        public Criteria andOennerNotEqualTo(String value) {
            addCriterion("OENNER <>", value, "oenner");
            return (Criteria) this;
        }

        public Criteria andOennerGreaterThan(String value) {
            addCriterion("OENNER >", value, "oenner");
            return (Criteria) this;
        }

        public Criteria andOennerGreaterThanOrEqualTo(String value) {
            addCriterion("OENNER >=", value, "oenner");
            return (Criteria) this;
        }

        public Criteria andOennerLessThan(String value) {
            addCriterion("OENNER <", value, "oenner");
            return (Criteria) this;
        }

        public Criteria andOennerLessThanOrEqualTo(String value) {
            addCriterion("OENNER <=", value, "oenner");
            return (Criteria) this;
        }

        public Criteria andOennerLike(String value) {
            addCriterion("OENNER like", value, "oenner");
            return (Criteria) this;
        }

        public Criteria andOennerNotLike(String value) {
            addCriterion("OENNER not like", value, "oenner");
            return (Criteria) this;
        }

        public Criteria andOennerIn(List<String> values) {
            addCriterion("OENNER in", values, "oenner");
            return (Criteria) this;
        }

        public Criteria andOennerNotIn(List<String> values) {
            addCriterion("OENNER not in", values, "oenner");
            return (Criteria) this;
        }

        public Criteria andOennerBetween(String value1, String value2) {
            addCriterion("OENNER between", value1, value2, "oenner");
            return (Criteria) this;
        }

        public Criteria andOennerNotBetween(String value1, String value2) {
            addCriterion("OENNER not between", value1, value2, "oenner");
            return (Criteria) this;
        }

        public Criteria andIdTpyeIsNull() {
            addCriterion("ID_TPYE is null");
            return (Criteria) this;
        }

        public Criteria andIdTpyeIsNotNull() {
            addCriterion("ID_TPYE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTpyeEqualTo(String value) {
            addCriterion("ID_TPYE =", value, "idTpye");
            return (Criteria) this;
        }

        public Criteria andIdTpyeNotEqualTo(String value) {
            addCriterion("ID_TPYE <>", value, "idTpye");
            return (Criteria) this;
        }

        public Criteria andIdTpyeGreaterThan(String value) {
            addCriterion("ID_TPYE >", value, "idTpye");
            return (Criteria) this;
        }

        public Criteria andIdTpyeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TPYE >=", value, "idTpye");
            return (Criteria) this;
        }

        public Criteria andIdTpyeLessThan(String value) {
            addCriterion("ID_TPYE <", value, "idTpye");
            return (Criteria) this;
        }

        public Criteria andIdTpyeLessThanOrEqualTo(String value) {
            addCriterion("ID_TPYE <=", value, "idTpye");
            return (Criteria) this;
        }

        public Criteria andIdTpyeLike(String value) {
            addCriterion("ID_TPYE like", value, "idTpye");
            return (Criteria) this;
        }

        public Criteria andIdTpyeNotLike(String value) {
            addCriterion("ID_TPYE not like", value, "idTpye");
            return (Criteria) this;
        }

        public Criteria andIdTpyeIn(List<String> values) {
            addCriterion("ID_TPYE in", values, "idTpye");
            return (Criteria) this;
        }

        public Criteria andIdTpyeNotIn(List<String> values) {
            addCriterion("ID_TPYE not in", values, "idTpye");
            return (Criteria) this;
        }

        public Criteria andIdTpyeBetween(String value1, String value2) {
            addCriterion("ID_TPYE between", value1, value2, "idTpye");
            return (Criteria) this;
        }

        public Criteria andIdTpyeNotBetween(String value1, String value2) {
            addCriterion("ID_TPYE not between", value1, value2, "idTpye");
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

        public Criteria andOutNoIsNull() {
            addCriterion("OUT_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutNoIsNotNull() {
            addCriterion("OUT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutNoEqualTo(String value) {
            addCriterion("OUT_NO =", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoNotEqualTo(String value) {
            addCriterion("OUT_NO <>", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoGreaterThan(String value) {
            addCriterion("OUT_NO >", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_NO >=", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoLessThan(String value) {
            addCriterion("OUT_NO <", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_NO <=", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoLike(String value) {
            addCriterion("OUT_NO like", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoNotLike(String value) {
            addCriterion("OUT_NO not like", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoIn(List<String> values) {
            addCriterion("OUT_NO in", values, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoNotIn(List<String> values) {
            addCriterion("OUT_NO not in", values, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoBetween(String value1, String value2) {
            addCriterion("OUT_NO between", value1, value2, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoNotBetween(String value1, String value2) {
            addCriterion("OUT_NO not between", value1, value2, "outNo");
            return (Criteria) this;
        }

        public Criteria andBranchidIsNull() {
            addCriterion("BRANCHID is null");
            return (Criteria) this;
        }

        public Criteria andBranchidIsNotNull() {
            addCriterion("BRANCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBranchidEqualTo(String value) {
            addCriterion("BRANCHID =", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotEqualTo(String value) {
            addCriterion("BRANCHID <>", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidGreaterThan(String value) {
            addCriterion("BRANCHID >", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCHID >=", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidLessThan(String value) {
            addCriterion("BRANCHID <", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidLessThanOrEqualTo(String value) {
            addCriterion("BRANCHID <=", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidLike(String value) {
            addCriterion("BRANCHID like", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotLike(String value) {
            addCriterion("BRANCHID not like", value, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidIn(List<String> values) {
            addCriterion("BRANCHID in", values, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotIn(List<String> values) {
            addCriterion("BRANCHID not in", values, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidBetween(String value1, String value2) {
            addCriterion("BRANCHID between", value1, value2, "branchid");
            return (Criteria) this;
        }

        public Criteria andBranchidNotBetween(String value1, String value2) {
            addCriterion("BRANCHID not between", value1, value2, "branchid");
            return (Criteria) this;
        }

        public Criteria andImgnameIsNull() {
            addCriterion("IMGNAME is null");
            return (Criteria) this;
        }

        public Criteria andImgnameIsNotNull() {
            addCriterion("IMGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andImgnameEqualTo(String value) {
            addCriterion("IMGNAME =", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameNotEqualTo(String value) {
            addCriterion("IMGNAME <>", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameGreaterThan(String value) {
            addCriterion("IMGNAME >", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameGreaterThanOrEqualTo(String value) {
            addCriterion("IMGNAME >=", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameLessThan(String value) {
            addCriterion("IMGNAME <", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameLessThanOrEqualTo(String value) {
            addCriterion("IMGNAME <=", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameLike(String value) {
            addCriterion("IMGNAME like", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameNotLike(String value) {
            addCriterion("IMGNAME not like", value, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameIn(List<String> values) {
            addCriterion("IMGNAME in", values, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameNotIn(List<String> values) {
            addCriterion("IMGNAME not in", values, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameBetween(String value1, String value2) {
            addCriterion("IMGNAME between", value1, value2, "imgname");
            return (Criteria) this;
        }

        public Criteria andImgnameNotBetween(String value1, String value2) {
            addCriterion("IMGNAME not between", value1, value2, "imgname");
            return (Criteria) this;
        }

        public Criteria andSavenameIsNull() {
            addCriterion("SAVENAME is null");
            return (Criteria) this;
        }

        public Criteria andSavenameIsNotNull() {
            addCriterion("SAVENAME is not null");
            return (Criteria) this;
        }

        public Criteria andSavenameEqualTo(String value) {
            addCriterion("SAVENAME =", value, "savename");
            return (Criteria) this;
        }

        public Criteria andSavenameNotEqualTo(String value) {
            addCriterion("SAVENAME <>", value, "savename");
            return (Criteria) this;
        }

        public Criteria andSavenameGreaterThan(String value) {
            addCriterion("SAVENAME >", value, "savename");
            return (Criteria) this;
        }

        public Criteria andSavenameGreaterThanOrEqualTo(String value) {
            addCriterion("SAVENAME >=", value, "savename");
            return (Criteria) this;
        }

        public Criteria andSavenameLessThan(String value) {
            addCriterion("SAVENAME <", value, "savename");
            return (Criteria) this;
        }

        public Criteria andSavenameLessThanOrEqualTo(String value) {
            addCriterion("SAVENAME <=", value, "savename");
            return (Criteria) this;
        }

        public Criteria andSavenameLike(String value) {
            addCriterion("SAVENAME like", value, "savename");
            return (Criteria) this;
        }

        public Criteria andSavenameNotLike(String value) {
            addCriterion("SAVENAME not like", value, "savename");
            return (Criteria) this;
        }

        public Criteria andSavenameIn(List<String> values) {
            addCriterion("SAVENAME in", values, "savename");
            return (Criteria) this;
        }

        public Criteria andSavenameNotIn(List<String> values) {
            addCriterion("SAVENAME not in", values, "savename");
            return (Criteria) this;
        }

        public Criteria andSavenameBetween(String value1, String value2) {
            addCriterion("SAVENAME between", value1, value2, "savename");
            return (Criteria) this;
        }

        public Criteria andSavenameNotBetween(String value1, String value2) {
            addCriterion("SAVENAME not between", value1, value2, "savename");
            return (Criteria) this;
        }

        public Criteria andSortsidIsNull() {
            addCriterion("SORTSID is null");
            return (Criteria) this;
        }

        public Criteria andSortsidIsNotNull() {
            addCriterion("SORTSID is not null");
            return (Criteria) this;
        }

        public Criteria andSortsidEqualTo(Long value) {
            addCriterion("SORTSID =", value, "sortsid");
            return (Criteria) this;
        }

        public Criteria andSortsidNotEqualTo(Long value) {
            addCriterion("SORTSID <>", value, "sortsid");
            return (Criteria) this;
        }

        public Criteria andSortsidGreaterThan(Long value) {
            addCriterion("SORTSID >", value, "sortsid");
            return (Criteria) this;
        }

        public Criteria andSortsidGreaterThanOrEqualTo(Long value) {
            addCriterion("SORTSID >=", value, "sortsid");
            return (Criteria) this;
        }

        public Criteria andSortsidLessThan(Long value) {
            addCriterion("SORTSID <", value, "sortsid");
            return (Criteria) this;
        }

        public Criteria andSortsidLessThanOrEqualTo(Long value) {
            addCriterion("SORTSID <=", value, "sortsid");
            return (Criteria) this;
        }

        public Criteria andSortsidIn(List<Long> values) {
            addCriterion("SORTSID in", values, "sortsid");
            return (Criteria) this;
        }

        public Criteria andSortsidNotIn(List<Long> values) {
            addCriterion("SORTSID not in", values, "sortsid");
            return (Criteria) this;
        }

        public Criteria andSortsidBetween(Long value1, Long value2) {
            addCriterion("SORTSID between", value1, value2, "sortsid");
            return (Criteria) this;
        }

        public Criteria andSortsidNotBetween(Long value1, Long value2) {
            addCriterion("SORTSID not between", value1, value2, "sortsid");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortIsNull() {
            addCriterion("GENEEIC_SORT is null");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortIsNotNull() {
            addCriterion("GENEEIC_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortEqualTo(String value) {
            addCriterion("GENEEIC_SORT =", value, "geneeicSort");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortNotEqualTo(String value) {
            addCriterion("GENEEIC_SORT <>", value, "geneeicSort");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortGreaterThan(String value) {
            addCriterion("GENEEIC_SORT >", value, "geneeicSort");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortGreaterThanOrEqualTo(String value) {
            addCriterion("GENEEIC_SORT >=", value, "geneeicSort");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortLessThan(String value) {
            addCriterion("GENEEIC_SORT <", value, "geneeicSort");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortLessThanOrEqualTo(String value) {
            addCriterion("GENEEIC_SORT <=", value, "geneeicSort");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortLike(String value) {
            addCriterion("GENEEIC_SORT like", value, "geneeicSort");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortNotLike(String value) {
            addCriterion("GENEEIC_SORT not like", value, "geneeicSort");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortIn(List<String> values) {
            addCriterion("GENEEIC_SORT in", values, "geneeicSort");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortNotIn(List<String> values) {
            addCriterion("GENEEIC_SORT not in", values, "geneeicSort");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortBetween(String value1, String value2) {
            addCriterion("GENEEIC_SORT between", value1, value2, "geneeicSort");
            return (Criteria) this;
        }

        public Criteria andGeneeicSortNotBetween(String value1, String value2) {
            addCriterion("GENEEIC_SORT not between", value1, value2, "geneeicSort");
            return (Criteria) this;
        }

        public Criteria andMediumSortIsNull() {
            addCriterion("MEDIUM_SORT is null");
            return (Criteria) this;
        }

        public Criteria andMediumSortIsNotNull() {
            addCriterion("MEDIUM_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andMediumSortEqualTo(String value) {
            addCriterion("MEDIUM_SORT =", value, "mediumSort");
            return (Criteria) this;
        }

        public Criteria andMediumSortNotEqualTo(String value) {
            addCriterion("MEDIUM_SORT <>", value, "mediumSort");
            return (Criteria) this;
        }

        public Criteria andMediumSortGreaterThan(String value) {
            addCriterion("MEDIUM_SORT >", value, "mediumSort");
            return (Criteria) this;
        }

        public Criteria andMediumSortGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIUM_SORT >=", value, "mediumSort");
            return (Criteria) this;
        }

        public Criteria andMediumSortLessThan(String value) {
            addCriterion("MEDIUM_SORT <", value, "mediumSort");
            return (Criteria) this;
        }

        public Criteria andMediumSortLessThanOrEqualTo(String value) {
            addCriterion("MEDIUM_SORT <=", value, "mediumSort");
            return (Criteria) this;
        }

        public Criteria andMediumSortLike(String value) {
            addCriterion("MEDIUM_SORT like", value, "mediumSort");
            return (Criteria) this;
        }

        public Criteria andMediumSortNotLike(String value) {
            addCriterion("MEDIUM_SORT not like", value, "mediumSort");
            return (Criteria) this;
        }

        public Criteria andMediumSortIn(List<String> values) {
            addCriterion("MEDIUM_SORT in", values, "mediumSort");
            return (Criteria) this;
        }

        public Criteria andMediumSortNotIn(List<String> values) {
            addCriterion("MEDIUM_SORT not in", values, "mediumSort");
            return (Criteria) this;
        }

        public Criteria andMediumSortBetween(String value1, String value2) {
            addCriterion("MEDIUM_SORT between", value1, value2, "mediumSort");
            return (Criteria) this;
        }

        public Criteria andMediumSortNotBetween(String value1, String value2) {
            addCriterion("MEDIUM_SORT not between", value1, value2, "mediumSort");
            return (Criteria) this;
        }

        public Criteria andSubclassSortIsNull() {
            addCriterion("SUBCLASS_SORT is null");
            return (Criteria) this;
        }

        public Criteria andSubclassSortIsNotNull() {
            addCriterion("SUBCLASS_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSubclassSortEqualTo(String value) {
            addCriterion("SUBCLASS_SORT =", value, "subclassSort");
            return (Criteria) this;
        }

        public Criteria andSubclassSortNotEqualTo(String value) {
            addCriterion("SUBCLASS_SORT <>", value, "subclassSort");
            return (Criteria) this;
        }

        public Criteria andSubclassSortGreaterThan(String value) {
            addCriterion("SUBCLASS_SORT >", value, "subclassSort");
            return (Criteria) this;
        }

        public Criteria andSubclassSortGreaterThanOrEqualTo(String value) {
            addCriterion("SUBCLASS_SORT >=", value, "subclassSort");
            return (Criteria) this;
        }

        public Criteria andSubclassSortLessThan(String value) {
            addCriterion("SUBCLASS_SORT <", value, "subclassSort");
            return (Criteria) this;
        }

        public Criteria andSubclassSortLessThanOrEqualTo(String value) {
            addCriterion("SUBCLASS_SORT <=", value, "subclassSort");
            return (Criteria) this;
        }

        public Criteria andSubclassSortLike(String value) {
            addCriterion("SUBCLASS_SORT like", value, "subclassSort");
            return (Criteria) this;
        }

        public Criteria andSubclassSortNotLike(String value) {
            addCriterion("SUBCLASS_SORT not like", value, "subclassSort");
            return (Criteria) this;
        }

        public Criteria andSubclassSortIn(List<String> values) {
            addCriterion("SUBCLASS_SORT in", values, "subclassSort");
            return (Criteria) this;
        }

        public Criteria andSubclassSortNotIn(List<String> values) {
            addCriterion("SUBCLASS_SORT not in", values, "subclassSort");
            return (Criteria) this;
        }

        public Criteria andSubclassSortBetween(String value1, String value2) {
            addCriterion("SUBCLASS_SORT between", value1, value2, "subclassSort");
            return (Criteria) this;
        }

        public Criteria andSubclassSortNotBetween(String value1, String value2) {
            addCriterion("SUBCLASS_SORT not between", value1, value2, "subclassSort");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("UPTIME is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("UPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Date value) {
            addCriterion("UPTIME =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Date value) {
            addCriterion("UPTIME <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Date value) {
            addCriterion("UPTIME >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPTIME >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Date value) {
            addCriterion("UPTIME <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Date value) {
            addCriterion("UPTIME <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<Date> values) {
            addCriterion("UPTIME in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<Date> values) {
            addCriterion("UPTIME not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Date value1, Date value2) {
            addCriterion("UPTIME between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Date value1, Date value2) {
            addCriterion("UPTIME not between", value1, value2, "uptime");
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

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNull() {
            addCriterion("SYS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNotNull() {
            addCriterion("SYS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSysNameEqualTo(String value) {
            addCriterion("SYS_NAME =", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotEqualTo(String value) {
            addCriterion("SYS_NAME <>", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThan(String value) {
            addCriterion("SYS_NAME >", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_NAME >=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThan(String value) {
            addCriterion("SYS_NAME <", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_NAME <=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLike(String value) {
            addCriterion("SYS_NAME like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotLike(String value) {
            addCriterion("SYS_NAME not like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameIn(List<String> values) {
            addCriterion("SYS_NAME in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotIn(List<String> values) {
            addCriterion("SYS_NAME not in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameBetween(String value1, String value2) {
            addCriterion("SYS_NAME between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotBetween(String value1, String value2) {
            addCriterion("SYS_NAME not between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltIsNull() {
            addCriterion("IF_PATCH_BOLT is null");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltIsNotNull() {
            addCriterion("IF_PATCH_BOLT is not null");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltEqualTo(String value) {
            addCriterion("IF_PATCH_BOLT =", value, "ifPatchBolt");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltNotEqualTo(String value) {
            addCriterion("IF_PATCH_BOLT <>", value, "ifPatchBolt");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltGreaterThan(String value) {
            addCriterion("IF_PATCH_BOLT >", value, "ifPatchBolt");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltGreaterThanOrEqualTo(String value) {
            addCriterion("IF_PATCH_BOLT >=", value, "ifPatchBolt");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltLessThan(String value) {
            addCriterion("IF_PATCH_BOLT <", value, "ifPatchBolt");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltLessThanOrEqualTo(String value) {
            addCriterion("IF_PATCH_BOLT <=", value, "ifPatchBolt");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltLike(String value) {
            addCriterion("IF_PATCH_BOLT like", value, "ifPatchBolt");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltNotLike(String value) {
            addCriterion("IF_PATCH_BOLT not like", value, "ifPatchBolt");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltIn(List<String> values) {
            addCriterion("IF_PATCH_BOLT in", values, "ifPatchBolt");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltNotIn(List<String> values) {
            addCriterion("IF_PATCH_BOLT not in", values, "ifPatchBolt");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltBetween(String value1, String value2) {
            addCriterion("IF_PATCH_BOLT between", value1, value2, "ifPatchBolt");
            return (Criteria) this;
        }

        public Criteria andIfPatchBoltNotBetween(String value1, String value2) {
            addCriterion("IF_PATCH_BOLT not between", value1, value2, "ifPatchBolt");
            return (Criteria) this;
        }

        public Criteria andIfWasteIsNull() {
            addCriterion("IF_WASTE is null");
            return (Criteria) this;
        }

        public Criteria andIfWasteIsNotNull() {
            addCriterion("IF_WASTE is not null");
            return (Criteria) this;
        }

        public Criteria andIfWasteEqualTo(String value) {
            addCriterion("IF_WASTE =", value, "ifWaste");
            return (Criteria) this;
        }

        public Criteria andIfWasteNotEqualTo(String value) {
            addCriterion("IF_WASTE <>", value, "ifWaste");
            return (Criteria) this;
        }

        public Criteria andIfWasteGreaterThan(String value) {
            addCriterion("IF_WASTE >", value, "ifWaste");
            return (Criteria) this;
        }

        public Criteria andIfWasteGreaterThanOrEqualTo(String value) {
            addCriterion("IF_WASTE >=", value, "ifWaste");
            return (Criteria) this;
        }

        public Criteria andIfWasteLessThan(String value) {
            addCriterion("IF_WASTE <", value, "ifWaste");
            return (Criteria) this;
        }

        public Criteria andIfWasteLessThanOrEqualTo(String value) {
            addCriterion("IF_WASTE <=", value, "ifWaste");
            return (Criteria) this;
        }

        public Criteria andIfWasteLike(String value) {
            addCriterion("IF_WASTE like", value, "ifWaste");
            return (Criteria) this;
        }

        public Criteria andIfWasteNotLike(String value) {
            addCriterion("IF_WASTE not like", value, "ifWaste");
            return (Criteria) this;
        }

        public Criteria andIfWasteIn(List<String> values) {
            addCriterion("IF_WASTE in", values, "ifWaste");
            return (Criteria) this;
        }

        public Criteria andIfWasteNotIn(List<String> values) {
            addCriterion("IF_WASTE not in", values, "ifWaste");
            return (Criteria) this;
        }

        public Criteria andIfWasteBetween(String value1, String value2) {
            addCriterion("IF_WASTE between", value1, value2, "ifWaste");
            return (Criteria) this;
        }

        public Criteria andIfWasteNotBetween(String value1, String value2) {
            addCriterion("IF_WASTE not between", value1, value2, "ifWaste");
            return (Criteria) this;
        }

        public Criteria andPicFlagIsNull() {
            addCriterion("PIC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPicFlagIsNotNull() {
            addCriterion("PIC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPicFlagEqualTo(String value) {
            addCriterion("PIC_FLAG =", value, "picFlag");
            return (Criteria) this;
        }

        public Criteria andPicFlagNotEqualTo(String value) {
            addCriterion("PIC_FLAG <>", value, "picFlag");
            return (Criteria) this;
        }

        public Criteria andPicFlagGreaterThan(String value) {
            addCriterion("PIC_FLAG >", value, "picFlag");
            return (Criteria) this;
        }

        public Criteria andPicFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_FLAG >=", value, "picFlag");
            return (Criteria) this;
        }

        public Criteria andPicFlagLessThan(String value) {
            addCriterion("PIC_FLAG <", value, "picFlag");
            return (Criteria) this;
        }

        public Criteria andPicFlagLessThanOrEqualTo(String value) {
            addCriterion("PIC_FLAG <=", value, "picFlag");
            return (Criteria) this;
        }

        public Criteria andPicFlagLike(String value) {
            addCriterion("PIC_FLAG like", value, "picFlag");
            return (Criteria) this;
        }

        public Criteria andPicFlagNotLike(String value) {
            addCriterion("PIC_FLAG not like", value, "picFlag");
            return (Criteria) this;
        }

        public Criteria andPicFlagIn(List<String> values) {
            addCriterion("PIC_FLAG in", values, "picFlag");
            return (Criteria) this;
        }

        public Criteria andPicFlagNotIn(List<String> values) {
            addCriterion("PIC_FLAG not in", values, "picFlag");
            return (Criteria) this;
        }

        public Criteria andPicFlagBetween(String value1, String value2) {
            addCriterion("PIC_FLAG between", value1, value2, "picFlag");
            return (Criteria) this;
        }

        public Criteria andPicFlagNotBetween(String value1, String value2) {
            addCriterion("PIC_FLAG not between", value1, value2, "picFlag");
            return (Criteria) this;
        }

        public Criteria andKIdIsNull() {
            addCriterion("K_ID is null");
            return (Criteria) this;
        }

        public Criteria andKIdIsNotNull() {
            addCriterion("K_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKIdEqualTo(String value) {
            addCriterion("K_ID =", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotEqualTo(String value) {
            addCriterion("K_ID <>", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdGreaterThan(String value) {
            addCriterion("K_ID >", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdGreaterThanOrEqualTo(String value) {
            addCriterion("K_ID >=", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdLessThan(String value) {
            addCriterion("K_ID <", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdLessThanOrEqualTo(String value) {
            addCriterion("K_ID <=", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdLike(String value) {
            addCriterion("K_ID like", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotLike(String value) {
            addCriterion("K_ID not like", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdIn(List<String> values) {
            addCriterion("K_ID in", values, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotIn(List<String> values) {
            addCriterion("K_ID not in", values, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdBetween(String value1, String value2) {
            addCriterion("K_ID between", value1, value2, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotBetween(String value1, String value2) {
            addCriterion("K_ID not between", value1, value2, "kId");
            return (Criteria) this;
        }

        public Criteria andIsSmallIsNull() {
            addCriterion("IS_SMALL is null");
            return (Criteria) this;
        }

        public Criteria andIsSmallIsNotNull() {
            addCriterion("IS_SMALL is not null");
            return (Criteria) this;
        }

        public Criteria andIsSmallEqualTo(String value) {
            addCriterion("IS_SMALL =", value, "isSmall");
            return (Criteria) this;
        }

        public Criteria andIsSmallNotEqualTo(String value) {
            addCriterion("IS_SMALL <>", value, "isSmall");
            return (Criteria) this;
        }

        public Criteria andIsSmallGreaterThan(String value) {
            addCriterion("IS_SMALL >", value, "isSmall");
            return (Criteria) this;
        }

        public Criteria andIsSmallGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SMALL >=", value, "isSmall");
            return (Criteria) this;
        }

        public Criteria andIsSmallLessThan(String value) {
            addCriterion("IS_SMALL <", value, "isSmall");
            return (Criteria) this;
        }

        public Criteria andIsSmallLessThanOrEqualTo(String value) {
            addCriterion("IS_SMALL <=", value, "isSmall");
            return (Criteria) this;
        }

        public Criteria andIsSmallLike(String value) {
            addCriterion("IS_SMALL like", value, "isSmall");
            return (Criteria) this;
        }

        public Criteria andIsSmallNotLike(String value) {
            addCriterion("IS_SMALL not like", value, "isSmall");
            return (Criteria) this;
        }

        public Criteria andIsSmallIn(List<String> values) {
            addCriterion("IS_SMALL in", values, "isSmall");
            return (Criteria) this;
        }

        public Criteria andIsSmallNotIn(List<String> values) {
            addCriterion("IS_SMALL not in", values, "isSmall");
            return (Criteria) this;
        }

        public Criteria andIsSmallBetween(String value1, String value2) {
            addCriterion("IS_SMALL between", value1, value2, "isSmall");
            return (Criteria) this;
        }

        public Criteria andIsSmallNotBetween(String value1, String value2) {
            addCriterion("IS_SMALL not between", value1, value2, "isSmall");
            return (Criteria) this;
        }
    }

    /**
     * picture
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * picture 2018-05-10
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