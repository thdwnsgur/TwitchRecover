/*
 * Copyright (c) 2020 Daylam Tayari <daylam@tayari.gg>
 *
 * This library is free software. You can redistribute it and/or modify it under the terms of the GNU General Public License version 3 as published by the Free Software Foundation.
 * This program is distributed in the that it will be use, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

/*
 * @author Daylam Tayari https://github.com/daylamtayari
 * @version 2.0
 * Github project home page: https://github.com/TwitchRecover
 * Twitch Recover repository: https://github.com/TwitchRecover/TwitchRecover
 */

package TwitchRecover.Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Clips class which handles everything related to
 * clips directly from the GUI and CLI packages.
 */
public class Clips {
    public static void dCU(String url, String fp) throws IOException {

    }

    /**
     * This method gets the MP4 URL of a clip
     * from a Twitch clip that is still up
     * (located at clips.twitch.tv/).
     * @param url       String value representing the Twitch clip URL.
     * @return String   Clip MP4 URL.
     */
    private static String getTCU(String url) throws IOException{
        if(!url.contains("clips.twitch.tv/:")) {
            throw new IOException();
        }
        URL u = new URL(url);
        HttpURLConnection con = (HttpURLConnection) u.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String readLine=null;
            while((readLine=br.readLine()) !=null){
                if(readLine.contains("<video") && readLine.contains("src=")){
                    String u1=readLine.substring(readLine.indexOf("src")+6);
                    return u1.substring(0, u1.indexOf(">")-1);
                }
            }
        }
        throw new IOException();
    }
}
