package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1773e implements InterfaceC2141e {
    public final C17214e ad;
    public final C6325e appmetrica;
    public final C13974e license;
    public final C5891e metrica;
    public final C10739e purchase;
    public final C15473e vip;

    public C1773e(C17214e c17214e, C15473e c15473e) {
        C5891e c5891e = AbstractC4593e.ad;
        C13974e c13974e = new C13974e(AbstractC4593e.vip);
        C6325e c6325e = new C6325e((byte) 0, 21);
        this.ad = c17214e;
        this.vip = c15473e;
        this.metrica = c5891e;
        this.license = c13974e;
        this.appmetrica = c6325e;
        this.purchase = new C10739e(26, this);
    }

    public final InterfaceC1966e ad(C6522e c6522e) {
        C5891e c5891e = this.metrica;
        C9041e c9041e = new C9041e(this, c6522e, 16);
        synchronized (((C14595e) c5891e.f12440e)) {
            InterfaceC1966e interfaceC1966e = (InterfaceC1966e) ((C4662e) c5891e.f12439e).vip(c6522e);
            if (interfaceC1966e != null) {
                if (interfaceC1966e.ad()) {
                    return interfaceC1966e;
                }
            }
            try {
                InterfaceC1966e interfaceC1966e2 = (InterfaceC1966e) c9041e.invoke(new C13942e(c5891e, c6522e, 7));
                synchronized (((C14595e) c5891e.f12440e)) {
                    try {
                        if (((C4662e) c5891e.f12439e).vip(c6522e) == null && interfaceC1966e2.ad()) {
                            ((C4662e) c5891e.f12439e).metrica(c6522e, interfaceC1966e2);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC1966e2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final InterfaceC1966e vip(AbstractC16845e abstractC16845e, C1812e c1812e, int i, int i2) {
        C15473e c15473e = this.vip;
        c15473e.getClass();
        int i3 = c15473e.ad;
        C1812e c1812e2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? c1812e : new C1812e(AbstractC3062e.metrica(c1812e.f4894e + i3, 1, 1000));
        this.ad.getClass();
        return ad(new C6522e(abstractC16845e, c1812e2, i, i2, null));
    }
}
