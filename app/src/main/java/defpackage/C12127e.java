package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۧؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12127e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f24291e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public float f24292e;

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        int adcel;
        int yandex;
        int billing;
        int i;
        if (!C5602e.license(j) || this.f24291e == 1) {
            adcel = C5602e.adcel(j);
            yandex = C5602e.yandex(j);
        } else {
            int round = Math.round(C5602e.yandex(j) * this.f24292e);
            int adcel2 = C5602e.adcel(j);
            adcel = C5602e.yandex(j);
            if (round < adcel2) {
                round = adcel2;
            }
            if (round <= adcel) {
                adcel = round;
            }
            yandex = adcel;
        }
        if (!C5602e.metrica(j) || this.f24291e == 2) {
            int startapp = C5602e.startapp(j);
            billing = C5602e.billing(j);
            i = startapp;
        } else {
            int round2 = Math.round(C5602e.billing(j) * this.f24292e);
            int startapp2 = C5602e.startapp(j);
            i = C5602e.billing(j);
            if (round2 < startapp2) {
                round2 = startapp2;
            }
            if (round2 <= i) {
                i = round2;
            }
            billing = i;
        }
        AbstractC2832e admob = interfaceC16719e.admob(AbstractC2278e.ad(adcel, yandex, i, billing));
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C4889e(admob, 5));
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }
}
