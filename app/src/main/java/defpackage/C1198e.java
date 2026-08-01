package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؒۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1198e {
    public static final C1198e license;
    public static final C1198e metrica;
    public final long ad;
    public final long vip;

    static {
        C1198e c1198e = new C1198e(0L, 0L);
        new C1198e(Long.MAX_VALUE, Long.MAX_VALUE);
        metrica = new C1198e(Long.MAX_VALUE, 0L);
        new C1198e(0L, Long.MAX_VALUE);
        license = c1198e;
    }

    public C1198e(long j, long j2) {
        AbstractC2301e.billing(j >= 0);
        AbstractC2301e.billing(j2 >= 0);
        this.ad = j;
        this.vip = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ad(long r17, long r19, long r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            long r3 = r0.ad
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            long r8 = r0.vip
            if (r7 != 0) goto L13
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 != 0) goto L13
            return r1
        L13:
            java.lang.String r7 = defpackage.AbstractC9413e.ad
            long r10 = r1 - r3
            long r3 = r3 ^ r1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 1
            r7 = 0
            if (r3 < 0) goto L20
            r3 = r4
            goto L21
        L20:
            r3 = r7
        L21:
            long r12 = r1 ^ r10
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 < 0) goto L29
            r5 = r4
            goto L2a
        L29:
            r5 = r7
        L2a:
            r3 = r3 | r5
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L34
            r12 = r10
            goto L3c
        L34:
            r3 = 63
            long r12 = r10 >>> r3
            r14 = 1
            long r12 = r12 ^ r14
            long r12 = r12 + r5
        L3c:
            r14 = -9223372036854775808
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 != 0) goto L46
            int r3 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r3 != 0) goto L4e
        L46:
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 != 0) goto L4f
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 == 0) goto L4f
        L4e:
            r12 = r14
        L4f:
            long r5 = defpackage.AbstractC9413e.ad(r1, r8)
            int r3 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r3 > 0) goto L5d
            int r3 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r3 > 0) goto L5d
            r3 = r4
            goto L5e
        L5d:
            r3 = r7
        L5e:
            int r8 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r8 > 0) goto L67
            int r5 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))
            if (r5 > 0) goto L67
            goto L68
        L67:
            r4 = r7
        L68:
            if (r3 == 0) goto L7d
            if (r4 == 0) goto L7d
            long r3 = r19 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r21 - r1
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L82
            goto L7f
        L7d:
            if (r3 == 0) goto L80
        L7f:
            return r19
        L80:
            if (r4 == 0) goto L83
        L82:
            return r21
        L83:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1198e.ad(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1198e.class == obj.getClass()) {
            C1198e c1198e = (C1198e) obj;
            if (this.ad == c1198e.ad && this.vip == c1198e.vip) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.ad) * 31) + ((int) this.vip);
    }
}
