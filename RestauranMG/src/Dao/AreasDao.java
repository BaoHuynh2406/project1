
package Dao;

import Entity.Areas;
import Utils.jdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AreasDao extends RestauranDao<Areas, Integer>{
    final String INSERT_SQL = "INSERT INTO Areas (AreaName) VALUES (?)";
    final String UPDATE_ALL = "UPDATE Areas SET AreaName = ? WHERE ID_Area = ?";
    final String DELETE_SQL = "DELETE FROM Areas WHERE ID_Area = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM Areas";
    final String SELECT_BY_ID_SQL = "SELECT * FROM Areas WHERE ID_Area = ?";
    @Override
    public void insert(Areas entity) {
        jdbc.update(INSERT_SQL,
                entity.getAreaName());
    }

    @Override
    public void update(Areas entity) {
        jdbc.update(UPDATE_ALL,
                entity.getID_Area(),
                entity.getAreaName());
    }

    public int getTableCount(Integer id){
        try {
            String sql = "select COUNT(Tables.ID_Area) as Num from Areas "
                    + "inner join Tables on Areas.ID_Area = Tables.ID_Area "
                    + "where Areas.ID_Area = ? "
                    + "GROUP by Areas.ID_Area ";
            ResultSet r = jdbc.query(sql, id);
        if(r.next()) return r.getInt("Num");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
        return 0;
    }
    
    public void delete(Integer id) {
        jdbc.update(DELETE_SQL, id);
    }

    @Override
    public List<Areas> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    public Areas selectById(Integer id) {
        List<Areas> list = selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Areas> selectBySql(String sql, Object... args) {
        List<Areas> list = new ArrayList<>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            while(rs.next()) {
                Areas entity = new Areas();
                entity.setID_Area(rs.getInt("ID_Area"));
                entity.setAreaName(rs.getString("AreaName"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return  list;
    }

   
    
}
