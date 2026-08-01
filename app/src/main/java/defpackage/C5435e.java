package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5435e implements InterfaceC7224e {
    public final InterfaceC10540e ad;
    public final C15723e appmetrica;
    public final InterfaceC1722e license;
    public final C16722e metrica;
    public final C13391e vip;

    public C5435e(InterfaceC10540e interfaceC10540e, C13391e c13391e, C16722e c16722e, InterfaceC1722e interfaceC1722e) {
        this.ad = interfaceC10540e;
        this.vip = c13391e == null ? new C13391e((C8633e) null) : c13391e;
        if (c16722e == null) {
            c16722e = new C16722e(4);
            if (interfaceC10540e.getState() == EnumC10668e.f21012e) {
                c16722e.billing();
            } else {
                interfaceC10540e.smaato(new C5934e(3, c16722e));
            }
        }
        this.metrica = c16722e;
        this.license = interfaceC1722e == null ? new C4850e() : interfaceC1722e;
        this.appmetrica = C15723e.f30973e;
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC1722e appmetrica() {
        return this.license;
    }

    @Override // defpackage.InterfaceC7224e
    public final C13391e license() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC7224e
    public final C16722e metrica() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC7224e
    public final C15723e purchase() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC10540e vip() {
        return this.ad;
    }
}
