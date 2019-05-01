package com.example.activitycloud.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @program: activitycloud
 * @description:
 * @author: 管庆增
 * @create: 2019-04-28 18:47
 **/
@Entity
public class Dictionary {
    private String id;
    private String dictionaryCode;
    private String dictionaryName;
    private String parentCode;
    private String description;

    @Id
    @Column(name = "id", nullable = false, length = 64)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dictionary_code", nullable = true, length = 64)
    public String getDictionaryCode() {
        return dictionaryCode;
    }

    public void setDictionaryCode(String dictionaryCode) {
        this.dictionaryCode = dictionaryCode;
    }

    @Basic
    @Column(name = "dictionary_name", nullable = true, length = 1024)
    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    @Basic
    @Column(name = "parent_code", nullable = true, length = 64)
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 64)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dictionary that = (Dictionary) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dictionaryCode != null ? !dictionaryCode.equals(that.dictionaryCode) : that.dictionaryCode != null)
            return false;
        if (dictionaryName != null ? !dictionaryName.equals(that.dictionaryName) : that.dictionaryName != null)
            return false;
        if (parentCode != null ? !parentCode.equals(that.parentCode) : that.parentCode != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dictionaryCode != null ? dictionaryCode.hashCode() : 0);
        result = 31 * result + (dictionaryName != null ? dictionaryName.hashCode() : 0);
        result = 31 * result + (parentCode != null ? parentCode.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
