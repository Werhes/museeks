package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9321e {
    public InterfaceC17847e ad;
    public int appmetrica;
    public C1032e[] license;
    public boolean metrica;
    public boolean vip;

    public final C0381e ad() {
        boolean z = true;
        AbstractC9528e.metrica(this.ad != null, "execute parameter required");
        if (!this.metrica) {
            C1032e[] c1032eArr = this.license;
            if (c1032eArr != null && (c1032eArr.length) != 0) {
                for (C1032e c1032e : c1032eArr) {
                    if (c1032e.f3492e) {
                    }
                }
                this.vip = z;
            }
            z = false;
            this.vip = z;
        }
        return new C0381e(this, this.license, this.vip, this.appmetrica);
    }
}
