package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface MMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
