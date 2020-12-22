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

import TwitchRecover.Core.Enums.Quality;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import java.util.ArrayList;

/**
 * This class handles all of the
 * API calls and retrievals.
 */
public class API {
    private static ArrayList<String> feeds=new ArrayList<String>();         //ArrayList which holds all of the feed links.
    private static ArrayList<Quality> qualities=new ArrayList<Quality>();   //Arraylist which holds the quality of corresponding feeds.
    protected static void getLiveFeeds(String channel){
        feeds.clear();
        qualities.clear();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet request=new HttpGet()
    }

    private static String[][] getTokens()
}