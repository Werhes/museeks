package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7293e {
    public static final String ad = C5401e.crashlytics("WakeLocks");
    public static final WeakHashMap vip = new WeakHashMap();

    public static PowerManager.WakeLock ad(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, concat);
        WeakHashMap weakHashMap = vip;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, concat);
        }
        return newWakeLock;
    }
}
