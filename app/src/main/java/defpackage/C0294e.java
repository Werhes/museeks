package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C0294e {
    public final C6847e license;
    public C0511e ad = null;
    public float vip = 0.0f;
    public final ArrayList metrica = new ArrayList();
    public boolean appmetrica = false;

    public C0294e(C0909e c0909e) {
        this.license = new C6847e(this, c0909e);
    }

    public final void ad(C17677e c17677e, int i) {
        this.license.billing(c17677e.adcel(i), 1.0f);
        this.license.billing(c17677e.adcel(i), -1.0f);
    }

    public boolean appmetrica() {
        return this.ad == null && this.vip == 0.0f && this.license.license() == 0;
    }

    public final void billing(C0511e c0511e) {
        C0511e c0511e2 = this.ad;
        if (c0511e2 != null) {
            this.license.billing(c0511e2, -1.0f);
            this.ad.f2614e = -1;
            this.ad = null;
        }
        float yandex = this.license.yandex(c0511e, true) * (-1.0f);
        this.ad = c0511e;
        if (yandex == 1.0f) {
            return;
        }
        this.vip /= yandex;
        C6847e c6847e = this.license;
        int i = c6847e.yandex;
        for (int i2 = 0; i != -1 && i2 < c6847e.ad; i2++) {
            float[] fArr = c6847e.billing;
            fArr[i] = fArr[i] / yandex;
            i = c6847e.purchase[i];
        }
    }

    public C0511e license(boolean[] zArr) {
        return purchase(zArr, null);
    }

    public final void metrica(C0511e c0511e, C0511e c0511e2, C0511e c0511e3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.vip = i;
        }
        if (z) {
            this.license.billing(c0511e, 1.0f);
            this.license.billing(c0511e2, -1.0f);
            this.license.billing(c0511e3, 1.0f);
        } else {
            this.license.billing(c0511e, -1.0f);
            this.license.billing(c0511e2, 1.0f);
            this.license.billing(c0511e3, -1.0f);
        }
    }

    public final C0511e purchase(boolean[] zArr, C0511e c0511e) {
        int i;
        int license = this.license.license();
        C0511e c0511e2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < license; i2++) {
            float purchase = this.license.purchase(i2);
            if (purchase < 0.0f) {
                C0511e appmetrica = this.license.appmetrica(i2);
                if ((zArr == null || !zArr[appmetrica.f2616e]) && appmetrica != c0511e && (((i = appmetrica.f2613e) == 3 || i == 4) && purchase < f)) {
                    f = purchase;
                    c0511e2 = appmetrica;
                }
            }
        }
        return c0511e2;
    }

    public void startapp(C17677e c17677e, C0294e c0294e, boolean z) {
        C6847e c6847e = this.license;
        c6847e.getClass();
        float metrica = c6847e.metrica(c0294e.ad);
        c6847e.yandex(c0294e.ad, z);
        C6847e c6847e2 = c0294e.license;
        int license = c6847e2.license();
        for (int i = 0; i < license; i++) {
            C0511e appmetrica = c6847e2.appmetrica(i);
            c6847e.ad(appmetrica, c6847e2.metrica(appmetrica) * metrica, z);
        }
        this.vip = (c0294e.vip * metrica) + this.vip;
        if (z) {
            c0294e.ad.vip(this);
        }
        if (this.ad == null || this.license.license() != 0) {
            return;
        }
        this.appmetrica = true;
        c17677e.vip = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            eؑۗۨ r0 = r10.ad
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            eؑۗۨ r1 = r10.ad
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = defpackage.AbstractC10257e.adcel(r0, r1)
            float r1 = r10.vip
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = defpackage.AbstractC8703e.inmobi(r0)
            float r1 = r10.vip
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            eؚؚؑ r5 = r10.license
            int r5 = r5.license()
        L3c:
            if (r3 >= r5) goto L9c
            eؚؚؑ r6 = r10.license
            eؑۗۨ r6 = r6.appmetrica(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            eؚؚؑ r7 = r10.license
            float r7 = r7.purchase(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = defpackage.AbstractC10257e.adcel(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = defpackage.AbstractC10257e.adcel(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = defpackage.AbstractC10257e.adcel(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = defpackage.AbstractC10257e.adcel(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = defpackage.AbstractC10257e.adcel(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0294e.toString():java.lang.String");
    }

    public final void vip(C0511e c0511e, C0511e c0511e2, C0511e c0511e3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.vip = i;
        }
        if (z) {
            this.license.billing(c0511e, 1.0f);
            this.license.billing(c0511e2, -1.0f);
            this.license.billing(c0511e3, -1.0f);
        } else {
            this.license.billing(c0511e, -1.0f);
            this.license.billing(c0511e2, 1.0f);
            this.license.billing(c0511e3, 1.0f);
        }
    }

    public final void yandex(C17677e c17677e, C0511e c0511e, boolean z) {
        if (c0511e.f2623e) {
            float metrica = this.license.metrica(c0511e);
            this.vip = (c0511e.f2612e * metrica) + this.vip;
            this.license.yandex(c0511e, z);
            if (z) {
                c0511e.vip(this);
            }
            if (this.license.license() == 0) {
                this.appmetrica = true;
                c17677e.vip = true;
            }
        }
    }
}
