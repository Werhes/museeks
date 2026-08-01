package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8204e {
    public static final C14155e ad;

    static {
        C14155e c14155e;
        try {
            SystemClock.elapsedRealtimeNanos();
            c14155e = new C14155e(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            c14155e = new C14155e(1);
        }
        ad = c14155e;
    }
}
