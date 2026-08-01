package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٞؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3514e extends IllegalStateException {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f7939e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f7940e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3514e(int r3, int r4) {
        /*
            r2 = this;
            java.lang.String r0 = " ms"
            if (r3 == 0) goto L32
            r1 = 1
            if (r3 == r1) goto L2b
            r1 = 2
            if (r3 == r1) goto L24
            r1 = 3
            if (r3 == r1) goto L1d
            r1 = 4
            if (r3 != r1) goto L17
            java.lang.String r1 = "Player stuck suppressed for "
            java.lang.String r0 = defpackage.AbstractC1634e.smaato(r1, r4, r0)
            goto L38
        L17:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L1d:
            java.lang.String r1 = "Player stuck playing without ending for "
            java.lang.String r0 = defpackage.AbstractC1634e.smaato(r1, r4, r0)
            goto L38
        L24:
            java.lang.String r1 = "Player stuck playing with no progress for "
            java.lang.String r0 = defpackage.AbstractC1634e.smaato(r1, r4, r0)
            goto L38
        L2b:
            java.lang.String r1 = "Player stuck buffering with no progress for "
            java.lang.String r0 = defpackage.AbstractC1634e.smaato(r1, r4, r0)
            goto L38
        L32:
            java.lang.String r1 = "Player stuck buffering and not loading for "
            java.lang.String r0 = defpackage.AbstractC1634e.smaato(r1, r4, r0)
        L38:
            r2.<init>(r0)
            r2.f7940e = r3
            r2.f7939e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3514e.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3514e.class != obj.getClass()) {
            return false;
        }
        C3514e c3514e = (C3514e) obj;
        return this.f7940e == c3514e.f7940e && this.f7939e == c3514e.f7939e;
    }

    public final int hashCode() {
        return ((527 + this.f7940e) * 31) + this.f7939e;
    }
}
