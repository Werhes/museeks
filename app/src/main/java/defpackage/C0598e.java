package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ۠ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598e extends AbstractC11254e implements InterfaceC11455e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC11455e f2809e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f2810e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ int f2811e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f2812e;

    public /* synthetic */ C0598e() {
    }

    public C0598e(C15279e c15279e) {
        this.f2810e = c15279e;
    }

    @Override // defpackage.AbstractC11254e
    public final void Signature() {
        switch (this.f2811e) {
            case 0:
                AbstractC13965e abstractC13965e = (AbstractC13965e) ((C0211e) this.f2810e).f1457e;
                amazon();
                abstractC13965e.vip.add(this);
                return;
            default:
                ((C15279e) this.f2810e).amazon(this);
                return;
        }
    }

    @Override // defpackage.InterfaceC11455e
    public final long adcel(int i) {
        InterfaceC11455e interfaceC11455e = this.f2809e;
        interfaceC11455e.getClass();
        return interfaceC11455e.adcel(i) + this.f2812e;
    }

    @Override // defpackage.InterfaceC11455e
    public final List advert(long j) {
        InterfaceC11455e interfaceC11455e = this.f2809e;
        interfaceC11455e.getClass();
        return interfaceC11455e.advert(j - this.f2812e);
    }

    @Override // defpackage.AbstractC11254e
    public final void amazon() {
        this.f19062e = 0;
        this.f22622e = 0L;
        this.f22623e = false;
        this.f2809e = null;
    }

    @Override // defpackage.InterfaceC11455e
    public final int loadAd() {
        InterfaceC11455e interfaceC11455e = this.f2809e;
        interfaceC11455e.getClass();
        return interfaceC11455e.loadAd();
    }

    @Override // defpackage.InterfaceC11455e
    public final int purchase(long j) {
        InterfaceC11455e interfaceC11455e = this.f2809e;
        interfaceC11455e.getClass();
        return interfaceC11455e.purchase(j - this.f2812e);
    }
}
