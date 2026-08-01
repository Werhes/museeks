package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C5759e {
    public final AbstractC14213e ad;
    public final float[] license;
    public final AbstractC14213e metrica;
    public final AbstractC14213e vip;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5759e(defpackage.AbstractC14213e r9, defpackage.AbstractC14213e r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.vip
            long r2 = defpackage.AbstractC16096e.ad
            boolean r0 = defpackage.AbstractC16096e.ad(r0, r2)
            if (r0 == 0) goto Lf
            eٓۙۧ r0 = defpackage.AbstractC16852e.vip(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.vip
            boolean r1 = defpackage.AbstractC16096e.ad(r4, r2)
            if (r1 == 0) goto L1d
            eٓۙۧ r1 = defpackage.AbstractC16852e.vip(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            if (r11 != r4) goto L69
            long r5 = r9.vip
            boolean r11 = defpackage.AbstractC16096e.ad(r5, r2)
            long r5 = r10.vip
            boolean r2 = defpackage.AbstractC16096e.ad(r5, r2)
            if (r11 == 0) goto L32
            if (r2 == 0) goto L32
            goto L69
        L32:
            if (r11 != 0) goto L36
            if (r2 == 0) goto L69
        L36:
            if (r11 == 0) goto L39
            goto L3a
        L39:
            r9 = r10
        L3a:
            eٕٓٛ r9 = (defpackage.C14093e) r9
            eْؗؑ r9 = r9.license
            float[] r3 = defpackage.AbstractC15365e.appmetrica
            if (r11 == 0) goto L47
            float[] r11 = r9.ad()
            goto L48
        L47:
            r11 = r3
        L48:
            if (r2 == 0) goto L4e
            float[] r3 = r9.ad()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r5 = r3[r9]
            float r2 = r2 / r5
            r5 = 1
            r6 = r11[r5]
            r7 = r3[r5]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r3 = r3[r7]
            float r11 = r11 / r3
            float[] r3 = new float[r4]
            r3[r9] = r2
            r3[r5] = r6
            r3[r7] = r11
            goto L6a
        L69:
            r3 = 0
        L6a:
            r8.<init>(r10, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5759e.<init>(eٓۙۧ, eٓۙۧ, int):void");
    }

    public C5759e(AbstractC14213e abstractC14213e, AbstractC14213e abstractC14213e2, AbstractC14213e abstractC14213e3, float[] fArr) {
        this.ad = abstractC14213e;
        this.vip = abstractC14213e2;
        this.metrica = abstractC14213e3;
        this.license = fArr;
    }

    public long ad(long j) {
        float yandex = C3618e.yandex(j);
        float billing = C3618e.billing(j);
        float appmetrica = C3618e.appmetrica(j);
        float license = C3618e.license(j);
        AbstractC14213e abstractC14213e = this.vip;
        long license2 = abstractC14213e.license(yandex, billing, appmetrica);
        float intBitsToFloat = Float.intBitsToFloat((int) (license2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (license2 & 4294967295L));
        float appmetrica2 = abstractC14213e.appmetrica(yandex, billing, appmetrica);
        float[] fArr = this.license;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            appmetrica2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.metrica.purchase(f, f2, appmetrica2, license, this.ad);
    }
}
