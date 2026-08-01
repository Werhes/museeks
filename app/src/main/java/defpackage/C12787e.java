package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ۠ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12787e {
    public static final C12575e metrica = new C12575e(26);
    public final C10377e ad;
    public final AtomicReference vip = new AtomicReference(null);

    public C12787e(C10377e c10377e) {
        this.ad = c10377e;
        c10377e.ad(new C0211e(19, this));
    }

    public final C12575e ad(String str) {
        C12787e c12787e = (C12787e) this.vip.get();
        return c12787e == null ? metrica : c12787e.ad(str);
    }

    public final void license(String str, long j, C10579e c10579e) {
        String Signature = AbstractC17861e.Signature("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", Signature, null);
        }
        this.ad.ad(new C1121e(str, j, c10579e));
    }

    public final boolean metrica(String str) {
        C12787e c12787e = (C12787e) this.vip.get();
        return c12787e != null && c12787e.metrica(str);
    }

    public final boolean vip() {
        C12787e c12787e = (C12787e) this.vip.get();
        return c12787e != null && c12787e.vip();
    }
}
