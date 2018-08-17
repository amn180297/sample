<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add/Delete Coupons</title>
</head>
<body>
	<form action="/addcoupon" method="post">
		<center>
			<table>
				<tr>
					<td>CouponId:</td>
					<td><input type="text" name="coupon_id"
						placeholder="Enter Coupon ID" required="required" /></td>
				</tr>
				<tr>
					<td>Discount %:</td>
					<td><input type="number" name="discount"
						placeholder="Enter Discount percentage" required="required" /></td>
				</tr>
				<tr>
					<td>Validity(In Days):</td>
					<td><input type="text" name="validity"
						placeholder="Enter Validity in Days" required="required" /></td>
				</tr>
				<tr>
					<td>Number Of Transaction:</td>
					<td><input type="text" name="no_of_transaction"
						placeholder="Enter Number Of transaction" required="required" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" name="save" value="Generate Coupon" /></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>