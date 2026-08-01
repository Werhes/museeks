package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16783e implements InterfaceC0665e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C2243e f32883e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC10540e f32884e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32885e;

    public /* synthetic */ C16783e(InterfaceC10540e interfaceC10540e, C2243e c2243e, int i) {
        this.f32885e = i;
        this.f32884e = interfaceC10540e;
        this.f32883e = c2243e;
    }

    private final void adcel() {
    }

    private final void advert() {
    }

    private final void amazon() {
    }

    private final void appmetrica() {
    }

    private final void billing() {
    }

    private final void mopub() {
    }

    private final void purchase() {
    }

    private final void smaato() {
    }

    private final void startapp() {
    }

    private final void yandex() {
    }

    @Override // defpackage.InterfaceC0665e
    public final void ad() {
        int i = this.f32885e;
    }

    @Override // defpackage.InterfaceC0665e
    public final void license() {
        int i = this.f32885e;
    }

    @Override // defpackage.InterfaceC0665e
    public final void metrica() {
        int i = this.f32885e;
    }

    @Override // defpackage.InterfaceC0665e
    public final void onCreate() {
        List list;
        List list2;
        switch (this.f32885e) {
            case 0:
                C2243e c2243e = this.f32883e;
                C9424e c9424e = c2243e.license;
                this.f32884e.startapp(this);
                C13614e appmetrica = AbstractC7291e.appmetrica((C6594e) AbstractC1831e.vip().purchase);
                if (((appmetrica == null || (list2 = appmetrica.vip) == null) ? 0 : list2.size()) > 1) {
                    AbstractC14966e.metrica(c9424e, C15146e.f29962e);
                    return;
                }
                C13614e appmetrica2 = AbstractC7291e.appmetrica((C6594e) AbstractC1831e.vip().purchase);
                if (((appmetrica2 == null || (list = appmetrica2.vip) == null) ? 0 : list.size()) != 0) {
                    C18479e c18479e = (C18479e) AbstractC1831e.vip().billing;
                    C18479e.Companion.getClass();
                    if (AbstractC7890e.billing(c18479e, C18479e.advert)) {
                        return;
                    }
                    long j = ((C18479e) AbstractC1831e.vip().billing).ad;
                    AbstractC14966e.metrica(c9424e, new C2091e(28));
                    AbstractC5336e.purchase(c2243e.vip, null, 0, new C7977e(j, c2243e, (InterfaceC5083e) null, 7), 3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void onDestroy() {
        int i = this.f32885e;
    }

    @Override // defpackage.InterfaceC0665e
    public final void vip() {
        switch (this.f32885e) {
            case 0:
                return;
            default:
                this.f32884e.startapp(this);
                C18464e c18464e = this.f32883e.metrica;
                c18464e.f36192e = AbstractC5336e.purchase((C14826e) c18464e.f36191e, null, 0, new C15686e(c18464e, null, 1), 3);
                return;
        }
    }
}
