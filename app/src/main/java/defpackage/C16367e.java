package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16367e extends AbstractC3839e {
    public final int license;
    public final /* synthetic */ int metrica = 1;

    public C16367e() {
        super("must have exactly 2 value parameters", 1);
        this.license = 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16367e(int r3) {
        /*
            r2 = this;
            r0 = 0
            r2.metrica = r0
            java.lang.String r0 = "must have at least "
            java.lang.String r1 = " value parameter"
            java.lang.StringBuilder r0 = defpackage.AbstractC4653e.premium(r0, r3, r1)
            r1 = 1
            if (r3 <= r1) goto L11
            java.lang.String r1 = "s"
            goto L13
        L11:
            java.lang.String r1 = ""
        L13:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            r2.<init>(r0, r1)
            r2.license = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16367e.<init>(int):void");
    }

    @Override // defpackage.InterfaceC16897e
    public final boolean metrica(C0782e c0782e) {
        switch (this.metrica) {
            case 0:
                return c0782e.mo330e().size() >= this.license;
            default:
                return c0782e.mo330e().size() == this.license;
        }
    }
}
