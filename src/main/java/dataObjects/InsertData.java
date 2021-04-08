package dataObjects;



import java.sql.*;


public class InsertData extends DataProvider {

    SignInData signInData = new SignInData();



    public static int insertCandidate(String firstName, String lastName, String phone, String password,
                                      String address, String email, String city, String state, String zip) {




        // for insert a new candidate
        ResultSet rs = null;
        int candidateId = 0;

        String sql = " insert into [test].[dbo].[users]\n" +
                "(firstName,lastName,phone,password,address,email,city,state,zip)\n" +
                "  values(?,?,?,?,?,?,?,?,?)";




        try (Connection conn = DatabaseConn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {




            // set parameters for statement


            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, phone);
            pstmt.setString(4, password);
            pstmt.setString(5, address);
            pstmt.setString(6, email);
            pstmt.setString(7, city);
            pstmt.setString(8, state);
            pstmt.setString(9, zip);




            int rowAffected = pstmt.executeUpdate();
            if (rowAffected == 1) {
                // get id
                rs = pstmt.getGeneratedKeys();
                if (rs.next())
                    candidateId = rs.getInt(1);



            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }


        return candidateId;

    }

    ResultSet rset;

    int id2 = insertCandidate(signInData.firstName, signInData.firstName, signInData.phone, signInData.password,
            signInData.address_1, signInData.email, signInData.city, signInData.state, signInData.zip);


    Connection conn;

    {
        try {
            conn = DatabaseConn.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    Statement stmt;
    {
        try {
            stmt = conn.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

        String strSelect = "SELECT TOP 1 * FROM [test].[dbo].[users] ORDER BY ID DESC";
        {
            try {
                rset = stmt.executeQuery(strSelect);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }









    static String firstName_2;
    {
        try {
            rset.next();
            firstName_2 = rset.getString("firstName");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
   static String email_2;
    {
        try {

            email_2 = rset.getString("email");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    static String lastname_2;
    {
        try {
            lastname_2 = rset.getString("lastName");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    static String password_2;
    {
        try {
            password_2 = rset.getString("password");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    static String phone_2;
    {
        try {
            phone_2 = rset.getString("phone");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    static String state_2;
    {
        try {
            state_2 = rset.getString("state");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    static String address_2;
    {
        try {
            address_2 = rset.getString("address");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    static String city_2;
    {
        try {
            city_2 = rset.getString("city");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    static String zip_2;

    {
        try {
            zip_2 = rset.getString("zip");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static String getFirstName_2() {
        return firstName_2;
    }

    public static String getEmail_2() {
        return email_2;
    }

    public static String getLastname_2() {
        return lastname_2;
    }

    public static String getPassword_2() {
        return password_2;
    }

    public static String getPhone_2() {
        return phone_2;
    }

    public static String getState_2() {
        return state_2;
    }

    public static String getAddress_2() {
        return address_2;
    }

    public static String getCity_2() {
        return city_2;
    }

    public static String getZip_2() {
        return zip_2;
    }


}
