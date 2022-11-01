package no.ssb.ppi.charts;

import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import java.text.NumberFormat;

import com.fame.timeiq.tools.charts.beans.FameChart;
import com.fame.timeiq.tools.charts.beans.ChartPane;
import com.fame.timeiq.tools.charts.beans.LineAttributes;
import com.fame.timeiq.tools.charts.beans.TextAttributes;

public class ChartFormat {

	public LineAttributes lineattr1, lineattr2, lineattr3, lineattr4;
	public Color lightgray;
	public Font font10, font12, font14,font16;
	public TextAttributes largeText, mediumText, smallText, smallText1, smallText2;
	public NumberFormat nFormat;
	public ChartPane chartpane1;

	public ChartFormat(){
		// Format chart labels and lines
        Paint black = new Color(0, 0, 0);
        lightgray = new Color(238, 238, 238 );
        font10 = new Font("Verdana", Font.PLAIN, 10);
        font12 = new Font("Verdana", Font.BOLD, 12);
        font14 = new Font("Verdana", Font.PLAIN, 14);
        font16 = new Font("Verdana", Font.BOLD, 16);
        //Border grayBorder = BorderFactory.createLineBorder(Color.darkGray);
        largeText = new TextAttributes(font14, (Paint)Color.yellow);
        mediumText = new TextAttributes(font12, (Paint)Color.black);
        smallText = new TextAttributes(font10, black);       
        smallText1 = new TextAttributes(font14, black);
        smallText2 = new TextAttributes(font12, black);       
        lineattr1 = new LineAttributes((Paint)Color.red);
        lineattr2 = new LineAttributes((Paint)Color.blue);
        lineattr3 = new LineAttributes((Paint)Color.cyan);
        lineattr4 = new LineAttributes((Paint)Color.black);
        
        nFormat = NumberFormat.getInstance();
        nFormat.setMinimumFractionDigits(0);
        nFormat.setMaximumFractionDigits(2);      
		
	}
}
