package defpackage;

import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۣٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11360e {
    public static String[] ad() {
        ArrayList arrayList = new ArrayList();
        VKXApplication.Companion companion = VKXApplication.f36531e;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        for (File file : vKXApplication.getExternalFilesDirs(null)) {
            if (file != null) {
                String path = file.getPath();
                if (Environment.isExternalStorageRemovable(file)) {
                    arrayList.add(path);
                }
            }
        }
        if (arrayList.isEmpty()) {
            String str = BuildConfig.FLAVOR;
            try {
                Process start = new ProcessBuilder(new String[0]).command("mount | grep /dev/block/vold").redirectErrorStream(true).start();
                start.waitFor();
                InputStream inputStream = start.getInputStream();
                byte[] bArr = new byte[1024];
                while (inputStream.read(bArr) != -1) {
                    str = str + new String(bArr);
                }
                inputStream.close();
            } catch (Exception e) {
                if (!(e instanceof IOException)) {
                    e.printStackTrace();
                }
            }
            if (!str.trim().isEmpty()) {
                for (String str2 : str.split("\n")) {
                    arrayList.add(str2.split(" ")[2]);
                }
            }
        }
        int i = 0;
        while (i < arrayList.size()) {
            if (!((String) arrayList.get(i)).split("/Android")[0].toLowerCase().matches(".*[0-9a-f]{4}[-][0-9a-f]{4}")) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        String[] strArr = new String[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            strArr[i2] = (String) arrayList.get(i2);
        }
        return strArr;
    }
}
