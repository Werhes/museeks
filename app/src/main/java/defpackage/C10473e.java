package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10473e {
    public final long ad;
    public final long appmetrica;
    public final C14794e billing;
    public final long license;
    public final long metrica;
    public final float[] purchase;
    public final long vip;

    public C10473e(long j, long j2, long j3, long j4, long j5, float[] fArr, C14794e c14794e) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = j4;
        this.appmetrica = j5;
        this.purchase = fArr;
        this.billing = c14794e;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L5
            goto L65
        L5:
            r1 = 0
            if (r7 == 0) goto L66
            java.lang.Class<eٍَۘ> r2 = defpackage.C10473e.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L11
            goto L66
        L11:
            eٍَۘ r7 = (defpackage.C10473e) r7
            long r2 = r6.ad
            long r4 = r7.ad
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1c
            goto L66
        L1c:
            long r2 = r6.vip
            long r4 = r7.vip
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L25
            goto L66
        L25:
            long r2 = r6.appmetrica
            long r4 = r7.appmetrica
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2e
            goto L66
        L2e:
            long r2 = r6.metrica
            long r4 = r7.metrica
            boolean r2 = defpackage.C11490e.vip(r2, r4)
            if (r2 != 0) goto L39
            goto L66
        L39:
            long r2 = r6.license
            long r4 = r7.license
            boolean r2 = defpackage.C11490e.vip(r2, r4)
            if (r2 != 0) goto L44
            goto L66
        L44:
            float[] r2 = r7.purchase
            float[] r3 = r6.purchase
            if (r3 != 0) goto L50
            if (r2 != 0) goto L4e
            r2 = r0
            goto L57
        L4e:
            r2 = r1
            goto L57
        L50:
            if (r2 != 0) goto L53
            goto L4e
        L53:
            boolean r2 = r3.equals(r2)
        L57:
            if (r2 != 0) goto L5a
            goto L66
        L5a:
            eٕٔٙ r2 = r6.billing
            eٕٔٙ r7 = r7.billing
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L65
            goto L66
        L65:
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10473e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.appmetrica;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.metrica;
        int i3 = (((int) (j4 ^ (j4 >>> 32))) + i2) * 31;
        long j5 = this.license;
        int i4 = (((int) (j5 ^ (j5 >>> 32))) + i3) * 31;
        float[] fArr = this.purchase;
        return this.billing.hashCode() + ((i4 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
