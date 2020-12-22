/*
 * Copyright (c) 2020 Daylam Tayari <daylam@tayari.gg>
 *
 * This library is free software. You can redistribute it and/or modify it under the terms of the GNU General Public License version 3 as published by the Free Software Foundation.
 * This program is distributed in the that it will be use, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package TwitchRecover.Core.Downloader;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
public class DownloadTest {
    public static void main(String[] args) {
        //String url="https://dqrpb9wgowsf5.cloudfront.net/47790eb74a12af7b255d_asmongold_40954680830_1607967138/chunked/index-dvr.m3u8";
        String url="https://clips-media-assets2.twitch.tv/AT-cm%7C964060174.mp4";
        String fp="D:\\Downloads\\download-test\\testing123";
        try{
            Download.download(url, fp);
        }
        catch(Exception e){
            System.out.println("ERROR");
        }
    }
}
