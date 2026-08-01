package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؑؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3059e extends AbstractC13870e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C2128e f7113e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C15037e f7114e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C15037e f7115e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C13119e f7116e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C0993e f7117e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C0993e f7118e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public InterfaceC8079e f7119e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public Function0 f7120e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C15037e f7121e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public C9703e f7122e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public long f7123e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C18351e f7124e;

    public C3059e(C13119e c13119e, C15037e c15037e, C15037e c15037e2, C15037e c15037e3, C18351e c18351e, C2128e c2128e, Function0 function0, C9703e c9703e) {
        super(1);
        this.f7116e = c13119e;
        this.f7115e = c15037e;
        this.f7114e = c15037e2;
        this.f7121e = c15037e3;
        this.f7124e = c18351e;
        this.f7113e = c2128e;
        this.f7120e = function0;
        this.f7122e = c9703e;
        this.f7123e = AbstractC2999e.ad;
        AbstractC2278e.vip(0, 0, 0, 0, 15);
        this.f7117e = new C0993e(this, 0);
        this.f7118e = new C0993e(this, 1);
    }

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public final InterfaceC8079e m1229e() {
        InterfaceC8079e interfaceC8079e;
        InterfaceC8079e interfaceC8079e2;
        if (this.f7116e.purchase().vip(EnumC10292e.f20311e, EnumC10292e.f20309e)) {
            C4980e c4980e = this.f7124e.ad.metrica;
            if (c4980e != null && (interfaceC8079e2 = c4980e.ad) != null) {
                return interfaceC8079e2;
            }
            C4980e c4980e2 = this.f7113e.ad.metrica;
            if (c4980e2 != null) {
                return c4980e2.ad;
            }
            return null;
        }
        C4980e c4980e3 = this.f7113e.ad.metrica;
        if (c4980e3 != null && (interfaceC8079e = c4980e3.ad) != null) {
            return interfaceC8079e;
        }
        C4980e c4980e4 = this.f7124e.ad.metrica;
        if (c4980e4 != null) {
            return c4980e4.ad;
        }
        return null;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        this.f7123e = AbstractC2999e.ad;
    }

    @Override // defpackage.AbstractC13870e, defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        C13220e c13220e;
        long j2;
        long j3;
        if (this.f7116e.metrica() == this.f7116e.license.getValue()) {
            this.f7119e = null;
        } else if (this.f7119e == null) {
            InterfaceC8079e m1229e = m1229e();
            if (m1229e == null) {
                m1229e = C5438e.f11676e;
            }
            this.f7119e = m1229e;
        }
        boolean mo398transient = interfaceC13158e.mo398transient();
        C9139e c9139e = C9139e.f18290e;
        if (mo398transient) {
            AbstractC2832e admob = interfaceC16719e.admob(j);
            long j4 = (admob.f6806e << 32) | (admob.f6804e & 4294967295L);
            this.f7123e = j4;
            return interfaceC13158e.ads((int) (j4 >> 32), (int) (4294967295L & j4), c9139e, new C8684e(admob, 3));
        }
        if (!((Boolean) this.f7120e.invoke()).booleanValue()) {
            AbstractC2832e admob2 = interfaceC16719e.admob(j);
            return interfaceC13158e.ads(admob2.f6806e, admob2.f6804e, c9139e, new C8684e(admob2, 4));
        }
        C9703e c9703e = this.f7122e;
        C15037e c15037e = c9703e.ad;
        C15037e c15037e2 = c9703e.vip;
        C13119e c13119e = c9703e.metrica;
        C18351e c18351e = c9703e.license;
        C5761e c5761e = c18351e.ad;
        C2128e c2128e = c9703e.appmetrica;
        C15037e c15037e3 = c9703e.purchase;
        C2919e ad = c15037e != null ? c15037e.ad(new C15020e(c18351e, c2128e, 0), new C15020e(c18351e, c2128e, 1)) : null;
        C2919e ad2 = c15037e2 != null ? c15037e2.ad(new C15020e(c18351e, c2128e, 2), new C15020e(c18351e, c2128e, 3)) : null;
        if (c13119e.metrica() == EnumC10292e.f20311e) {
            C12395e c12395e = c5761e.license;
            if (c12395e != null) {
                c13220e = new C13220e(c12395e.vip);
            } else {
                C12395e c12395e2 = c2128e.ad.license;
                if (c12395e2 != null) {
                    c13220e = new C13220e(c12395e2.vip);
                }
                c13220e = null;
            }
        } else {
            C12395e c12395e3 = c2128e.ad.license;
            if (c12395e3 != null) {
                c13220e = new C13220e(c12395e3.vip);
            } else {
                C12395e c12395e4 = c5761e.license;
                if (c12395e4 != null) {
                    c13220e = new C13220e(c12395e4.vip);
                }
                c13220e = null;
            }
        }
        C7314e c7314e = new C7314e(5, ad, ad2, c15037e3 != null ? c15037e3.ad(C5430e.f11650e, new C7314e(6, c13220e, c18351e, c2128e)) : null);
        AbstractC2832e admob3 = interfaceC16719e.admob(j);
        long j5 = (admob3.f6806e << 32) | (admob3.f6804e & 4294967295L);
        long j6 = !C12729e.vip(this.f7123e, AbstractC2999e.ad) ? this.f7123e : j5;
        C15037e c15037e4 = this.f7115e;
        C2919e ad3 = c15037e4 != null ? c15037e4.ad(this.f7117e, new C17725e(this, j6, 0)) : null;
        if (ad3 != null) {
            j5 = ((C12729e) ad3.getValue()).ad;
        }
        long license = AbstractC2278e.license(j, j5);
        C15037e c15037e5 = this.f7114e;
        long j7 = c15037e5 != null ? ((C11490e) c15037e5.ad(C8082e.f16398e, new C17725e(this, j6, 1)).getValue()).ad : 0L;
        C15037e c15037e6 = this.f7121e;
        if (c15037e6 != null) {
            j2 = 4294967295L;
            j3 = ((C11490e) c15037e6.ad(this.f7118e, new C17725e(this, j6, 2)).getValue()).ad;
        } else {
            j2 = 4294967295L;
            j3 = 0;
        }
        InterfaceC8079e interfaceC8079e = this.f7119e;
        return interfaceC13158e.ads((int) (license >> 32), (int) (license & j2), c9139e, new C7388e(admob3, C11490e.license(interfaceC8079e != null ? interfaceC8079e.ad(j6, license, EnumC7792e.f15794e) : 0L, j3), j7, c7314e));
    }
}
