package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4854e extends AbstractC9404e implements InterfaceC13853e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1622e f10321e;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0015, code lost:
    
        if (r0 == null) goto L5;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4854e(defpackage.C1622e r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Content type "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " is not supported"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L19
        L17:
            java.lang.String r0 = "Content-Type header is required"
        L19:
            r2.<init>(r0)
            r2.f10321e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4854e.<init>(eٜؓؗ):void");
    }

    @Override // defpackage.InterfaceC13853e
    public final Throwable ad() {
        C4854e c4854e = new C4854e(this.f10321e);
        c4854e.initCause(this);
        return c4854e;
    }
}
