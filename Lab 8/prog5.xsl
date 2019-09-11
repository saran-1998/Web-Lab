<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
<body bgcolor="purple">
  <h2 align="center" style="color:blue font-family:helvetica">Hospital Patient History</h2>
  <table border="1" align="center">
    <tr bgcolor="green">
      <th style="text-align:left font-size:300%">FName</th>
      <th style="text-align:left font-size:300%">MName</th>
      <th style="text-align:left font-size:300%">LName</th>
      <th style="text-align:left font-size:300%">Sex</th>
	  <th style="text-align:left font-size:300%">Room-number</th>
	  <th style="text-align:left font-size:300%">Age</th>
	  <th style="text-align:left font-size:300%">Social Security Number</th>
	  <th style="text-align:left font-size:300%">SIC:ID</th>
	  <th style="text-align:left font-size:300%">SIC:GrpID</th>
	  <th style="text-align:left font-size:300%">SIC:Phone</th>
	  <th style="text-align:left font-size:300%">SIC:Address</th>
	  <th style="text-align:left font-size:300%">SIC:ID</th>
	  <th style="text-align:left font-size:300%">SIC:GrpID</th>
	  <th style="text-align:left font-size:300%">SIC:Phone</th>
	  <th style="text-align:left font-size:300%">SIC:Address</th>
    </tr>
    <xsl:for-each select="hospital/patient">
    <tr>
      <td><xsl:value-of select="name/@firstname"/></td>
      <td><xsl:value-of select="name/@middlename"/></td>
	  <td><xsl:value-of select="name/@lastname"/></td>
	  <td><xsl:value-of select="sex"/></td>
	  <td><xsl:value-of select="room-number"/></td>
	  <td><xsl:value-of select="age"/></td>
	  <td><xsl:value-of select="social-security-number"/></td>
	  <td><xsl:value-of select="primary-insurance-company/id"/></td>
	  <td><xsl:value-of select="primary-insurance-company/group-id"/></td>
	  <td><xsl:value-of select="primary-insurance-company/phone"/></td>
	  <td><xsl:value-of select="primary-insurance-company/address"/></td>
      <td><xsl:value-of select="secondary-insurance-company/id"/></td>
	  <td><xsl:value-of select="secondary-insurance-company/group-id"/></td>
	  <td><xsl:value-of select="secondary-insurance-company/phone"/></td>
	  <td><xsl:value-of select="secondary-insurance-company/address"/></td>
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
