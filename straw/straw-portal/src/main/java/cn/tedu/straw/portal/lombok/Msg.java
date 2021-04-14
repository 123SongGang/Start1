package cn.tedu.straw.portal.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

//一个实体类上添加@Data注解
//默认情况下会自动生成get\set\无参构造\toString\equals\hashCode方法

@Data
public class Msg implements Serializable {
    private Integer id;
    private String title;
    private String content;

}
