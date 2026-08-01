package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11168e implements InterfaceC2460e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f22426e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC16902e f22427e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C8286e f22428e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11980e f22429e;

    public C11168e(C11980e c11980e, InterfaceC16902e interfaceC16902e, boolean z) {
        this.f22429e = c11980e;
        this.f22427e = interfaceC16902e;
        this.f22426e = z;
        this.f22428e = ((C6272e) ((C17241e) c11980e.f23950e).ad).metrica(new C17877e(20, this));
    }

    @Override // defpackage.InterfaceC2460e
    public final boolean amazon(C12816e c12816e) {
        return license(c12816e) != null;
    }

    @Override // defpackage.InterfaceC2460e
    public final boolean isEmpty() {
        return this.f22427e.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C8522e c8522e;
        InterfaceC16902e interfaceC16902e = this.f22427e;
        C2167e c2167e = new C2167e(new C1356e(1, interfaceC16902e.getAnnotations()), this.f22428e);
        C0520e c0520e = AbstractC16244e.ad;
        InterfaceC9093e billing = AbstractC1660e.billing(new InterfaceC9093e[]{c2167e, new C6209e(1, AbstractC16244e.ad(AbstractC0206e.smaato, interfaceC16902e, this.f22429e))});
        C7983e c7983e = new C7983e(12);
        if (billing instanceof C2167e) {
            C2167e c2167e2 = (C2167e) billing;
            c8522e = new C8522e(c2167e2.ad, c2167e2.vip, c7983e);
        } else {
            c8522e = new C8522e(billing, new C3114e(27), c7983e);
        }
        return new C10649e(AbstractC7762e.adcel(c8522e, new C7983e(14)));
    }

    @Override // defpackage.InterfaceC2460e
    public final InterfaceC16566e license(C12816e c12816e) {
        InterfaceC16566e interfaceC16566e;
        InterfaceC16902e interfaceC16902e = this.f22427e;
        C2430e license = interfaceC16902e.license(c12816e);
        if (license != null && (interfaceC16566e = (InterfaceC16566e) this.f22428e.invoke(license)) != null) {
            return interfaceC16566e;
        }
        C0520e c0520e = AbstractC16244e.ad;
        return AbstractC16244e.ad(c12816e, interfaceC16902e, this.f22429e);
    }
}
