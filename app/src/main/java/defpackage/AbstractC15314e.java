package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15314e {
    public static final String ad = C5401e.crashlytics("WrkDbPathHelper");
    public static final String[] vip = {"-journal", "-shm", "-wal"};

    public static void ad(Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            String str = ad;
            C5401e.loadAd().smaato(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            hashMap.put(databasePath, file);
            for (String str2 : vip) {
                hashMap.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        C5401e.loadAd().firebase(str, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    C5401e.loadAd().smaato(str, file2.renameTo(file3) ? String.format("Migrated %s to %s", file2, file3) : String.format("Renaming %s to %s failed", file2, file3), new Throwable[0]);
                }
            }
        }
    }
}
