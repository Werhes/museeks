package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0179e {
    public static volatile C2123e appmetrica;
    public static volatile C2123e license;
    public static final C2892e ad = new C2892e(-232446787, false, new C2916e(23));
    public static final C2892e vip = new C2892e(-1709790445, false, new C16015e(23));
    public static final Object metrica = new Object();

    public static C13797e ad(C13797e c13797e) {
        double rint = Math.rint(c13797e.vip);
        return (((90.0d > rint ? 1 : (90.0d == rint ? 0 : -1)) <= 0 && (rint > 111.0d ? 1 : (rint == 111.0d ? 0 : -1)) <= 0) && ((Math.rint(c13797e.metrica) > 16.0d ? 1 : (Math.rint(c13797e.metrica) == 16.0d ? 0 : -1)) > 0) && (Math.rint(c13797e.license) < 65.0d)) ? new C13797e(AbstractC5190e.adcel(c13797e.vip, c13797e.metrica, 70.0d)) : c13797e;
    }

    public static void license() {
        synchronized (metrica) {
        }
    }

    public static final boolean metrica(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(ActivityManager.class);
        if (activityManager == null) {
            return false;
        }
        if (activityManager.isLowRamDevice()) {
            return true;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem <= 2147483648L;
    }

    public static final void vip(C8005e c8005e, InterfaceC7823e interfaceC7823e) {
        int hashCode = C2590e.ad.hashCode();
        if ((c8005e.f16244e.f32452e.metrica.purchase() & 4) == 0) {
            c8005e.f16207e++;
            return;
        }
        int i = c8005e.f16207e;
        int i2 = hashCode ^ i;
        int i3 = c8005e.f16241e;
        C8005e c8005e2 = AbstractC10428e.ad;
        c8005e.f16241e = Integer.rotateLeft(i3, 3) ^ i2;
        C12452e c12452e = c8005e.f16195e;
        if (c12452e == null) {
            c12452e = new C12452e();
            c8005e.f16195e = c12452e;
        }
        c12452e.ad(i);
        c8005e.f16207e = 0;
        interfaceC7823e.ad(c8005e);
        c8005e.f16207e = c12452e.appmetrica(c12452e.vip - 1) + 1;
        c8005e.f16241e = Integer.rotateRight(c8005e.f16241e ^ i2, 3);
    }
}
