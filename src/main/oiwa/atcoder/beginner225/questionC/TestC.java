package oiwa.atcoder.beginner225.questionC;

import oiwa.atcoder.util.Case;
import oiwa.atcoder.util.TesterV10;

public class TestC {
	public static void main(String[] args) {
		new TesterV10(Main.class, new Case[] {
				
				new Case(true,
						"2 3\r\n"
						+ "1 2 3\r\n"
						+ "8 9 10\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(true,
						"2 1\r\n"
						+ "1\r\n"
						+ "2\r\n"
						+ "",
						"No\r\n"
						+ ""),
				new Case(true,
						"10 4\r\n"
						+ "1346 1347 1348 1349\r\n"
						+ "1353 1354 1355 1356\r\n"
						+ "1360 1361 1362 1363\r\n"
						+ "1367 1368 1369 1370\r\n"
						+ "1374 1375 1376 1377\r\n"
						+ "1381 1382 1383 1384\r\n"
						+ "1388 1389 1390 1391\r\n"
						+ "1395 1396 1397 1398\r\n"
						+ "1402 1403 1404 1405\r\n"
						+ "1409 1410 1411 1412\r\n"
						+ "",
						"Yes\r\n"
						+ ""),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
				new Case(false,
						"",
						""),
		});
	}
}
