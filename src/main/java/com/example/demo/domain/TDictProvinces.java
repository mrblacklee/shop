package com.example.demo.domain;

public class TDictProvinces {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict_provinces.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict_provinces.province_code
     *
     * @mbg.generated
     */
    private String provinceCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict_provinces.province_name
     *
     * @mbg.generated
     */
    private String provinceName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict_provinces.id
     *
     * @return the value of t_dict_provinces.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict_provinces.id
     *
     * @param id the value for t_dict_provinces.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict_provinces.province_code
     *
     * @return the value of t_dict_provinces.province_code
     *
     * @mbg.generated
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict_provinces.province_code
     *
     * @param provinceCode the value for t_dict_provinces.province_code
     *
     * @mbg.generated
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict_provinces.province_name
     *
     * @return the value of t_dict_provinces.province_name
     *
     * @mbg.generated
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict_provinces.province_name
     *
     * @param provinceName the value for t_dict_provinces.province_name
     *
     * @mbg.generated
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }
}