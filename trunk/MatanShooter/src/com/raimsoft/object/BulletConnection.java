package com.raimsoft.object;

import com.raimsoft.util.FPoint;

public class BulletConnection
{
	public FPoint pStart;
	public FPoint pConnect[];

	public boolean bDrag= false;
	public int ConnectionNum= 0;

	public BulletConnection()
	{
		this.pStart = new FPoint();
		this.pConnect[6] = new FPoint();
	}

	/**
	 * 밖으로 나갈 수 있는 경우의 수를 조사한다.
	 * @param BulletNum1 : 시작포인트에 연결된 Bullet의 번호
	 * @param BulletNum2 : 끝포인트에 연결된 Bullet의 번호
	 * @return 나갈 경우 : ture, 나가지 않을 경우 : false
	 */
	public boolean OutCombination(int BulletNum1, int BulletNum2)
	{
		switch(BulletNum1)
		{
		case 0:
			if (BulletNum2==4 || BulletNum2==6 || BulletNum2==7)
				return true;
			return false;
		case 1:
			if (BulletNum2==3 || BulletNum2==4 || BulletNum2==5 || BulletNum2==6 || BulletNum2==7)
				return true;
			return false;
		case 2:
			if (BulletNum2==3 || BulletNum2==5 || BulletNum2==6)
				return true;
			return false;
		case 3:
			if (BulletNum2==1 || BulletNum2==2 || BulletNum2==4 || BulletNum2==6 || BulletNum2==7)
				return true;
			return false;
		case 4:
			if (BulletNum2==0 || BulletNum2==1 || BulletNum2==3 || BulletNum2==5 || BulletNum2==6)
				return true;
			return false;
		case 5:
			if (BulletNum2==1 || BulletNum2==2 || BulletNum2==4)
				return true;
			return false;
		case 6:
			if (BulletNum2==0 || BulletNum2==1 || BulletNum2==2 || BulletNum2==3 || BulletNum2==4)
				return true;
			return false;
		case 7:
			if (BulletNum2==0 || BulletNum2==1 || BulletNum2==3)
				return true;
			return false;
		default:
			return false;
		}
	}
}
