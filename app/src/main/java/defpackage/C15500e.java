package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15500e extends IllegalStateException implements InterfaceC13853e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f30618e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f30619e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C15500e(long r3, long r5) {
        /*
            r2 = this;
            java.lang.String r0 = "Body.size is too small. Body: "
            java.lang.String r1 = ", Content-Length: "
            java.lang.StringBuilder r0 = defpackage.AbstractC1786e.inmobi(r5, r0, r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.f30619e = r3
            r2.f30618e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15500e.<init>(long, long):void");
    }

    @Override // defpackage.InterfaceC13853e
    public final Throwable ad() {
        C15500e c15500e = new C15500e(this.f30619e, this.f30618e);
        c15500e.initCause(this);
        return c15500e;
    }
}
