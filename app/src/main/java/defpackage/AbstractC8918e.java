package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8918e {
    public final String ad;

    public /* synthetic */ AbstractC8918e(String str) {
        this.ad = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC8918e(java.lang.String r2, boolean r3) {
        /*
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            if (r3 == 0) goto L12
            java.lang.String r2 = "DESC"
            goto L14
        L12:
            java.lang.String r2 = "ASC"
        L14:
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8918e.<init>(java.lang.String, boolean):void");
    }

    public abstract boolean ad(Level level);

    public void metrica(RuntimeException runtimeException, C6713e c6713e) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract void vip(C6713e c6713e);
}
