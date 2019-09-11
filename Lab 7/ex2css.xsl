<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
<body bgcolor="purple">
  <h2 align="center" style="color:blue font-family:helvetica">Car Catalog</h2>
  <table border="1" align="center">
    <tr bgcolor="green">
      <th style="text-align:left font-size:300%">Year</th>
      <th style="text-align:left font-size:300%">Make</th>
	  <th style="text-align:left font-size:300%">Model</th>
	  <th style="text-align:left font-size:300%">Color</th>
	  <th style="text-align:left font-size:300%">Engine Cylinder</th>
	  <th style="text-align:left font-size:300%">Engine Fuel</th>
	  <th style="text-align:left font-size:300%">Door</th>
	  <th style="text-align:left font-size:300%">Transmission</th>
	  <th style="text-align:left font-size:300%">Radio</th>
	  <th style="text-align:left font-size:300%">AC</th>
	  <th style="text-align:left font-size:300%">PWindow</th>
	  <th style="text-align:left font-size:300%">PSteering</th>
	  <th style="text-align:left font-size:300%">PBrakes</th>
    </tr>
    <xsl:for-each select="car_catalog/car">
    <tr>
      <td><xsl:value-of select="year"/></td>
      <td><xsl:value-of select="make"/></td>
	  <td><xsl:value-of select="model"/></td>
	  <td><xsl:value-of select="color"/></td>
	  <td><xsl:value-of select="engine/number_of_cylinders"/></td>
	  <td><xsl:value-of select="engine/fuel_system"/></td>
	  <td><xsl:value-of select="number_of_doors"/></td>
	  <td><xsl:value-of select="transmission_type"/></td>
	  <td><xsl:value-of select="accessories/@radio"/></td>
	  <td><xsl:value-of select="accessories/@air_conditioning"/></td>
	  <td><xsl:value-of select="accessories/@power_windows"/></td>
	  <td><xsl:value-of select="accessories/@power_steering"/></td>
	  <td><xsl:value-of select="accessories/@power_brakes"/></td>
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>