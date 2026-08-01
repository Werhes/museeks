package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11976e implements InterfaceC16719e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f23941e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC16719e f23942e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f23943e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23944e;

    public /* synthetic */ C11976e(InterfaceC16719e interfaceC16719e, int i, int i2, int i3) {
        this.f23944e = i3;
        this.f23942e = interfaceC16719e;
        this.f23941e = i;
        this.f23943e = i2;
    }

    @Override // defpackage.InterfaceC16719e
    public final AbstractC2832e admob(long j) {
        switch (this.f23944e) {
            case 0:
                int i = this.f23943e;
                int i2 = this.f23941e;
                InterfaceC16719e interfaceC16719e = this.f23942e;
                if (i == 1) {
                    return new C0652e(i2 == 2 ? interfaceC16719e.loadAd(C5602e.billing(j)) : interfaceC16719e.smaato(C5602e.billing(j)), C5602e.metrica(j) ? C5602e.billing(j) : 32767, 0);
                }
                return new C0652e(C5602e.license(j) ? C5602e.yandex(j) : 32767, i2 == 2 ? interfaceC16719e.metrica(C5602e.yandex(j)) : interfaceC16719e.mo2529while(C5602e.yandex(j)), 0);
            case 1:
                int i3 = this.f23943e;
                int i4 = this.f23941e;
                InterfaceC16719e interfaceC16719e2 = this.f23942e;
                if (i3 == 1) {
                    return new C0652e(i4 == 2 ? interfaceC16719e2.loadAd(C5602e.billing(j)) : interfaceC16719e2.smaato(C5602e.billing(j)), C5602e.metrica(j) ? C5602e.billing(j) : 32767, 1);
                }
                return new C0652e(C5602e.license(j) ? C5602e.yandex(j) : 32767, i4 == 2 ? interfaceC16719e2.metrica(C5602e.yandex(j)) : interfaceC16719e2.mo2529while(C5602e.yandex(j)), 1);
            default:
                int i5 = this.f23943e;
                int i6 = this.f23941e;
                InterfaceC16719e interfaceC16719e3 = this.f23942e;
                if (i5 == 1) {
                    return new C0652e(i6 == 2 ? interfaceC16719e3.loadAd(C5602e.billing(j)) : interfaceC16719e3.smaato(C5602e.billing(j)), C5602e.metrica(j) ? C5602e.billing(j) : 32767, 2);
                }
                return new C0652e(C5602e.license(j) ? C5602e.yandex(j) : 32767, i6 == 2 ? interfaceC16719e3.metrica(C5602e.yandex(j)) : interfaceC16719e3.mo2529while(C5602e.yandex(j)), 2);
        }
    }

    @Override // defpackage.InterfaceC16719e
    public final int loadAd(int i) {
        switch (this.f23944e) {
            case 0:
                return this.f23942e.loadAd(i);
            case 1:
                return this.f23942e.loadAd(i);
            default:
                return this.f23942e.loadAd(i);
        }
    }

    @Override // defpackage.InterfaceC16719e
    public final int metrica(int i) {
        switch (this.f23944e) {
            case 0:
                return this.f23942e.metrica(i);
            case 1:
                return this.f23942e.metrica(i);
            default:
                return this.f23942e.metrica(i);
        }
    }

    @Override // defpackage.InterfaceC16719e
    public final Object signatures() {
        switch (this.f23944e) {
            case 0:
                return this.f23942e.signatures();
            case 1:
                return this.f23942e.signatures();
            default:
                return this.f23942e.signatures();
        }
    }

    @Override // defpackage.InterfaceC16719e
    public final int smaato(int i) {
        switch (this.f23944e) {
            case 0:
                return this.f23942e.smaato(i);
            case 1:
                return this.f23942e.smaato(i);
            default:
                return this.f23942e.smaato(i);
        }
    }

    @Override // defpackage.InterfaceC16719e
    /* renamed from: while */
    public final int mo2529while(int i) {
        switch (this.f23944e) {
            case 0:
                return this.f23942e.mo2529while(i);
            case 1:
                return this.f23942e.mo2529while(i);
            default:
                return this.f23942e.mo2529while(i);
        }
    }
}
