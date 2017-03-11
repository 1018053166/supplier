
package com.supplier.common.util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 验证码生成工具
 * @author LinQ
 *
 */
public class ValidCodeTools {
	/** 验证码图片的宽度 */
	private static final int width = 140;
	/** 验证码图片的高度 */
	private static final int height = 40;
	/** 验证码字符个数 */
	private static final int codeCount = 4;
	// 字符间距
	private static final int x = width / (codeCount + 1);
	// 字体高度
	private static final int fontHeight = height - 2;
	private static final int codeY = height - 4;

	private static final char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
			'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
			'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	
	/**
	 * 生成图片验证码
	 * @return
	 */
	public static Map<String,Object> genValidCode(){
		// 定义图像buffer
		BufferedImage buffImg = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics2D g = buffImg.createGraphics();

		// 创建一个随机数生成器类
		Random random = new Random();

		// 将图像填充为白色
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width, height);

		// 创建字体，字体的大小应该根据图片的高度来定。
		Font font = new Font("Fixedsys", Font.PLAIN | Font.BOLD, fontHeight);
		// 设置字体。
		g.setFont(font);

		// 画边框。
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, width - 1, height - 1);

		// 随机产生160条干扰线，使图象中的认证码不易被其它程序探测到。
		g.setColor(Color.pink);
		for (int i = 0; i < 160; i++) {
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int xl = random.nextInt(12);
			int yl = random.nextInt(12);
			g.drawLine(x, y, x + xl, y + yl);
		}

		// randomCode用于保存随机产生的验证码，以便用户登录后进行验证。
		StringBuffer randomCode = new StringBuffer();
		int red = 0, green = 0, blue = 0;

		// 随机产生codeCount数字的验证码。
		for (int i = 0; i < codeCount; i++) {
			// 得到随机产生的验证码数字。
			String strRand = String.valueOf(codeSequence[random.nextInt(36)]);
			// 产生随机的颜色分量来构造颜色值，这样输出的每位数字的颜色值都将不同。
			red = 20+random.nextInt(110);
			green = 20+random.nextInt(110);
			blue = 20+random.nextInt(110);

			// 用随机产生的颜色将验证码绘制到图像中。
			g.setColor(new Color(red, green, blue));
			g.drawString(strRand, (i + 1) * x - 6, codeY);

			// 将产生的四个随机数组合在一起。
			randomCode.append(strRand);
		}
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("randomCode", randomCode);
		resultMap.put("buffImg", buffImg);
		
		return resultMap;
	}
}
