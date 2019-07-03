package cn.wss.bs.tools;

import cn.wss.bs.entity.Classroom;
import cn.wss.bs.entity.Seat;
import cn.wss.bs.entity.TeachBuilding;
import cn.wss.bs.entity.User;
import com.csvreader.CsvReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class CSVResolver {
    /*
    * 解析教学楼信息CSV文件
    * CSV格式为：id,name,content,str
    * */
    public final static List<TeachBuilding> getTeachingBuildings(String path, char separator, String charSet){
        List<TeachBuilding> list = new ArrayList<TeachBuilding>();
        try {
            CsvReader csvReader = new CsvReader(path, separator, Charset.forName(charSet));
            csvReader.readRecord();
            while(csvReader.readRecord()){
                TeachBuilding tb = new TeachBuilding(csvReader.get(0), csvReader.get(1),csvReader.get(2),csvReader.get(3));
                list.add(tb);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    /*
     * 解析教室信息CSV文件
     * CSV格式为：id,tbid,seatNum,name,content,flag,str
     * */
    public final static List<Classroom> getClassrooms(String path, char separator, String charSet){
        List<Classroom> list = new ArrayList<Classroom>();
        try {
            CsvReader csvReader = new CsvReader(path, separator, Charset.forName(charSet));
            csvReader.readRecord();
            while(csvReader.readRecord()){
                Classroom classroom = new Classroom(csvReader.get(0), csvReader.get(1), Integer.parseInt(csvReader.get(2)), csvReader.get(3), csvReader.get(4), Integer.parseInt(csvReader.get(5)), csvReader.get(6));
                list.add(classroom);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    /*
     * 解析座位信息CSV文件
     * CSV格式为：id,crid,tbid,content,state,str
     * */
    public final static List<Seat> getSeats(String path, char separator, String charSet){
        List<Seat> list = new ArrayList<Seat>();
        try {
            CsvReader csvReader = new CsvReader(path, separator, Charset.forName(charSet));
            csvReader.readRecord();
            while(csvReader.readRecord()){
                Seat seat = new Seat(csvReader.get(0), csvReader.get(1), csvReader.get(2), csvReader.get(3), Integer.parseInt(csvReader.get(4)), csvReader.get(5));
                list.add(seat);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    /*
     * 解析用户信息CSV文件
     * CSV格式为：id,name,password,authority
     * */
    public final static List<User> getUsers(String path, char separator, String charSet){
        List<User> list = new ArrayList<User>();
        try {
            CsvReader csvReader = new CsvReader(path, separator, Charset.forName(charSet));
            csvReader.readRecord();
            while(csvReader.readRecord()){
                User user = new User(csvReader.get(0), csvReader.get(1),csvReader.get(2),Integer.parseInt(csvReader.get(3)));
                list.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
