package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٛ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10377e implements InterfaceC7970e {
    public InterfaceC13824e ad;
    public volatile InterfaceC7970e vip;
    public static final C15945e metrica = new C15945e(16);
    public static final C11176e license = new C11176e(6);

    public C10377e(C15945e c15945e, InterfaceC7970e interfaceC7970e) {
        this.ad = c15945e;
        this.vip = interfaceC7970e;
    }

    public final void ad(InterfaceC13824e interfaceC13824e) {
        InterfaceC7970e interfaceC7970e;
        InterfaceC7970e interfaceC7970e2;
        InterfaceC7970e interfaceC7970e3 = this.vip;
        C11176e c11176e = license;
        if (interfaceC7970e3 != c11176e) {
            interfaceC13824e.yandex(interfaceC7970e3);
            return;
        }
        synchronized (this) {
            interfaceC7970e = this.vip;
            if (interfaceC7970e != c11176e) {
                interfaceC7970e2 = interfaceC7970e;
            } else {
                this.ad = new C18070e(this.ad, interfaceC13824e, 16);
                interfaceC7970e2 = null;
            }
        }
        if (interfaceC7970e2 != null) {
            interfaceC13824e.yandex(interfaceC7970e);
        }
    }

    @Override // defpackage.InterfaceC7970e
    public final Object get() {
        return this.vip.get();
    }
}
