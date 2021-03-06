/*******************************************************************************
 * This code is distributed under GPL v2 licence.
 * 
 * This code is provided solely "as is". 
 * There is no warranty or other guarantee of fitness of this code.
 * The author disclaims all responsibility and liability 
 * with respect to this code's usage
 * or its effect upon hardware or computer systems.
 * 
 * author: Huu-Nghia Nguyen
 * email : nhnghia@me.com
 ******************************************************************************/
/**
 * Apr 5, 2012 5:29:06 PM
 * @author nhnghia
 */
package fr.lri.schora.chorD.testCase;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

import fr.lri.schora.chorD.ChorD;
import fr.lri.schora.chorD.parser.*;
import fr.lri.schora.util.parser.ParserException;
public class ChorReaderTest {

	/**
	 * Test method for {@link fr.lri.schora.chorD.parser.ChorReader#ChorReader(java.io.InputStream)}.
	 */
	@Test
	public void testChorReaderInputStream() {
		//String str = "(skip ; [true] |>   (request[a,d]!x | request[a,c]?y) ; [x >y] * (response[a,d].x)) [> cancel[d,a]!resone";
		String str = "Request[c,s].x_1 ; [x_1+2 >= 5] |> LivrExp[s,c] + [x_1 <5] |> Livraison[s,c]\n ! <x>";
		StringReader f = new StringReader(str);
		ChorReader parser = new ChorReader(f);
		{
			try {
				ChorD chor = parser.start();
				System.out.println(chor.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	@Test
	public void TestChorReader() throws IOException, ParserException{
		String str = fr.lri.schora.util.File.readFile("bin/fr/lri/schora/chorD/testCase/comache.cor");
		ChorD chor = ChorD.parser(str);
		System.out.println(chor.toString());
	}

}
