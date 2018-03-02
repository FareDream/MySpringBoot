MyBatis注解
=
* 使用@Param例如（此方法适用于一对一传值）：
  ```
  @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
  int insert(@Param("name") String name, @Param("age") Integer age);
  ```
  * 其中@Param中定义的name对应了SQL中的#{name}  age对应了SQL中的#{age}
* 使用Map对象进行传值
  ```
    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);
    ·····
    Map<String, Object> map = new HashMap<>();
    map.put("name", "CCC");
    map.put("age", 40);
    userMapper.insertByMap(map);
  ```
  * 其中value中#{name}传入的是map中key为name的值#{age}传入的是map中key为age的值
* 使用对象传值
  ```
    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insertByUser(User user);
  ```
  * #{name}, #{age}分别对应的是User对象中的name和age属性
* 增删改查
  ```
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Update("UPDATE user SET age=#{age} WHERE name=#{name}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Long id);
  ```
@Result注解@Result是最简单的映射，指定@Resul将基本数据库表字段，装配到实体类属性的映射。
  * 注解属性：
    * column 数据库的列名
    * Property需要装配的属性名
    * one  需要使用的@One注解（@Result（one=@One）（）））
    * many  需要使用的@Many注解（@Result（many=@many）（）））
  
    
