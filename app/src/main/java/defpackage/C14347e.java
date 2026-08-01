package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14347e {
    public long Signature;
    public final C14386e ad;
    public int adcel;
    public long admob;
    public long advert;
    public long amazon;
    public Surface appmetrica;
    public float billing;
    public boolean license;
    public long loadAd;
    public AbstractC17090e metrica;
    public long mopub;
    public float purchase;
    public long remoteconfig;
    public long smaato;
    public float startapp;
    public long subscription;
    public final Context vip;
    public float yandex;

    /* JADX WARN: Type inference failed for: r3v1, types: [eٓۦٟ, java.lang.Object] */
    public C14347e(Context context) {
        this.vip = context;
        ?? obj = new Object();
        obj.f28459e = new C13137e();
        obj.f28456e = new C13137e();
        obj.f28458e = -9223372036854775807L;
        this.ad = obj;
        this.purchase = -1.0f;
        this.startapp = 1.0f;
        this.adcel = 0;
    }

    public final void ad() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.appmetrica) == null || this.adcel == Integer.MIN_VALUE || this.yandex == 0.0f || !surface.isValid()) {
            return;
        }
        this.yandex = 0.0f;
        AbstractC5096e.isVip(this.appmetrica, 0.0f);
    }

    public final void license(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.appmetrica) == null || this.adcel == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.license) {
            float f2 = this.billing;
            if (f2 != -1.0f) {
                f = f2 * this.startapp;
                if (z && this.yandex == f) {
                    return;
                }
                this.yandex = f;
                AbstractC5096e.isVip(this.appmetrica, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.yandex = f;
        AbstractC5096e.isVip(this.appmetrica, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void metrica() {
        /*
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L99
            android.view.Surface r0 = r9.appmetrica
            if (r0 != 0) goto Lc
            goto L99
        Lc:
            eٓۦٟ r0 = r9.ad
            java.lang.Object r2 = r0.f28459e
            eٌْؐ r2 = (defpackage.C13137e) r2
            boolean r2 = r2.ad()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.f28459e
            eٌْؐ r2 = (defpackage.C13137e) r2
            boolean r2 = r2.ad()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.f28459e
            eٌْؐ r2 = (defpackage.C13137e) r2
            long r4 = r2.appmetrica
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L31
            goto L34
        L31:
            long r6 = r2.purchase
            long r6 = r6 / r4
        L34:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L41
        L3d:
            r2 = r3
            goto L41
        L3f:
            float r2 = r9.purchase
        L41:
            float r4 = r9.billing
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L48
            goto L99
        L48:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L8c
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L8c
            java.lang.Object r1 = r0.f28459e
            eٌْؐ r1 = (defpackage.C13137e) r1
            boolean r1 = r1.ad()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r0.f28459e
            eٌْؐ r1 = (defpackage.C13137e) r1
            boolean r1 = r1.ad()
            if (r1 == 0) goto L6b
            java.lang.Object r0 = r0.f28459e
            eٌْؐ r0 = (defpackage.C13137e) r0
            long r0 = r0.purchase
            goto L70
        L6b:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L70:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L7d
            r0 = 1036831949(0x3dcccccd, float:0.1)
            goto L7f
        L7d:
            r0 = 1065353216(0x3f800000, float:1.0)
        L7f:
            float r1 = r9.billing
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L99
            goto L93
        L8c:
            if (r5 == 0) goto L8f
            goto L93
        L8f:
            int r0 = r0.f28460e
            if (r0 < r1) goto L99
        L93:
            r9.billing = r2
            r0 = 0
            r9.license(r0)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14347e.metrica():void");
    }

    public final void vip() {
        this.smaato = 0L;
        this.admob = -1L;
        this.amazon = -1L;
        this.mopub = 0L;
        this.advert = 0L;
    }
}
