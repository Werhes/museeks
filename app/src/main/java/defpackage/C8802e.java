package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٛ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8802e {
    public static final String adcel;
    public static final String advert;
    public static final String billing;
    public static final String mopub;
    public static final String startapp;
    public static final String yandex;
    public final int ad;
    public final C11753e appmetrica;
    public final int license;
    public final Object metrica;
    public final C4960e purchase;
    public final long vip;

    static {
        String str = AbstractC9413e.ad;
        billing = Integer.toString(0, 36);
        yandex = Integer.toString(1, 36);
        startapp = Integer.toString(2, 36);
        adcel = Integer.toString(3, 36);
        mopub = Integer.toString(4, 36);
        advert = Integer.toString(5, 36);
    }

    public C8802e(int i, long j, C11753e c11753e, C4960e c4960e, Object obj, int i2) {
        this.ad = i;
        this.vip = j;
        this.appmetrica = c11753e;
        this.purchase = c4960e;
        this.metrica = obj;
        this.license = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C8802e ad(int r10, android.os.Bundle r11) {
        /*
            java.lang.String r0 = defpackage.C8802e.billing
            r1 = 0
            int r3 = r11.getInt(r0, r1)
            java.lang.String r0 = defpackage.C8802e.yandex
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r11.getLong(r0, r4)
            java.lang.String r0 = defpackage.C8802e.startapp
            android.os.Bundle r0 = r11.getBundle(r0)
            r2 = 0
            if (r0 != 0) goto L1c
            r6 = r2
            goto L21
        L1c:
            eِۣٔ r0 = defpackage.C11753e.ad(r0)
            r6 = r0
        L21:
            java.lang.String r0 = defpackage.C8802e.advert
            android.os.Bundle r0 = r11.getBundle(r0)
            if (r0 == 0) goto L2f
            eؗ٘ۘ r0 = defpackage.C4960e.ad(r0)
        L2d:
            r7 = r0
            goto L38
        L2f:
            if (r3 == 0) goto L37
            eؗ٘ۘ r0 = new eؗ٘ۘ
            r0.<init>(r3)
            goto L2d
        L37:
            r7 = r2
        L38:
            java.lang.String r0 = defpackage.C8802e.mopub
            int r9 = r11.getInt(r0)
            r0 = 1
            if (r9 == r0) goto L7f
            java.lang.String r0 = defpackage.C8802e.adcel
            r8 = 2
            if (r9 == r8) goto L81
            r8 = 3
            if (r9 == r8) goto L53
            r10 = 4
            if (r9 != r10) goto L4d
            goto L7f
        L4d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L53:
            android.os.IBinder r11 = r11.getBinder(r0)
            if (r11 != 0) goto L5a
            goto L7f
        L5a:
            e٘ؑٔ r11 = defpackage.BinderC7421e.ad(r11)
            eْٗۤ r0 = defpackage.AbstractC17475e.Signature()
        L62:
            int r2 = r11.size()
            if (r1 >= r2) goto L7b
            java.lang.Object r2 = r11.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r2.getClass()
            eِؓٝ r2 = defpackage.C1962e.ad(r10, r2)
            r0.metrica(r2)
            int r1 = r1 + 1
            goto L62
        L7b:
            eؒۢۗ r2 = r0.billing()
        L7f:
            r8 = r2
            goto L8d
        L81:
            android.os.Bundle r11 = r11.getBundle(r0)
            if (r11 != 0) goto L88
            goto L7f
        L88:
            eِؓٝ r2 = defpackage.C1962e.ad(r10, r11)
            goto L7f
        L8d:
            eٌٛ٘ r2 = new eٌٛ٘
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8802e.ad(int, android.os.Bundle):eٌٛ٘");
    }

    public static void license(C1962e c1962e) {
        AbstractC2301e.yandex(!TextUtils.isEmpty(c1962e.ad), "mediaId must not be empty");
        C12053e c12053e = c1962e.license;
        AbstractC2301e.yandex(c12053e.subscription != null, "mediaMetadata must specify isBrowsable");
        AbstractC2301e.yandex(c12053e.remoteconfig != null, "mediaMetadata must specify isPlayable");
    }

    public static C8802e metrica(List list, C11753e c11753e) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            license((C1962e) it.next());
        }
        return new C8802e(0, SystemClock.elapsedRealtime(), c11753e, null, AbstractC17475e.remoteconfig(list), 3);
    }

    public static C8802e vip(int i) {
        C4960e c4960e = new C4960e("no error message provided", i, Bundle.EMPTY);
        return new C8802e(c4960e.ad, SystemClock.elapsedRealtime(), null, c4960e, null, 4);
    }
}
