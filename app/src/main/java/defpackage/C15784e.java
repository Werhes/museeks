package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15784e implements InterfaceC2209e {
    public InterfaceC7189e ad = C17043e.ad;
    public int appmetrica = 1;
    public Float license;
    public C9688e metrica;
    public InterfaceC1306e vip;

    @Override // defpackage.InterfaceC2209e
    public final InterfaceC2209e ad() {
        C15784e c15784e = new C15784e();
        c15784e.ad = this.ad;
        c15784e.vip = this.vip;
        c15784e.metrica = this.metrica;
        c15784e.license = this.license;
        c15784e.appmetrica = this.appmetrica;
        return c15784e;
    }

    @Override // defpackage.InterfaceC2209e
    public final void metrica(InterfaceC7189e interfaceC7189e) {
        this.ad = interfaceC7189e;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.ad + ", provider=" + this.vip + ", colorFilterParams=" + this.metrica + ", alpha=" + this.license + ", contentScale=" + ((Object) C6604e.ad(this.appmetrica)) + ')';
    }

    @Override // defpackage.InterfaceC2209e
    public final InterfaceC7189e vip() {
        return this.ad;
    }
}
