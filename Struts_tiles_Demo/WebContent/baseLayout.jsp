<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <table border="1" align="center" width="400px;">
            <tr>
                <td height="30" colspan="2">
                   
                    <tiles:insertAttribute name="myHeader"></tiles:insertAttribute>
                </td>
            </tr>
            <tr>
                <td>
                   <tiles:insertAttribute name="myBody"></tiles:insertAttribute>
                </td>
            </tr>
            <tr>
                <td>
                    
                    <tiles:insertAttribute name="myFooter"></tiles:insertAttribute>
                </td>
            </tr>
        </table>