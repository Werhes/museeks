package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16201e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public float f31818e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public float f31819e;

    @Override // defpackage.InterfaceC17303e
    public final int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        int loadAd = interfaceC16719e.loadAd(i);
        int ad = !Float.isNaN(this.f31818e) ? AbstractC4653e.ad(abstractC9292e, this.f31818e) : 0;
        return loadAd < ad ? ad : loadAd;
    }

    @Override // defpackage.InterfaceC17303e
    public final int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        int mo2529while = interfaceC16719e.mo2529while(i);
        int ad = !Float.isNaN(this.f31819e) ? AbstractC4653e.ad(abstractC9292e, this.f31819e) : 0;
        return mo2529while < ad ? ad : mo2529while;
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        int adcel;
        int startapp;
        if (Float.isNaN(this.f31818e) || C5602e.adcel(j) != 0) {
            adcel = C5602e.adcel(j);
        } else {
            int mo493e = interfaceC13158e.mo493e(this.f31818e);
            adcel = C5602e.yandex(j);
            if (mo493e < 0) {
                mo493e = 0;
            }
            if (mo493e <= adcel) {
                adcel = mo493e;
            }
        }
        int yandex = C5602e.yandex(j);
        if (Float.isNaN(this.f31819e) || C5602e.startapp(j) != 0) {
            startapp = C5602e.startapp(j);
        } else {
            int mo493e2 = interfaceC13158e.mo493e(this.f31819e);
            startapp = C5602e.billing(j);
            int i = mo493e2 >= 0 ? mo493e2 : 0;
            if (i <= startapp) {
                startapp = i;
            }
        }
        AbstractC2832e admob = interfaceC16719e.admob(AbstractC2278e.ad(adcel, yandex, startapp, C5602e.billing(j)));
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C4889e(admob, 19));
    }

    @Override // defpackage.InterfaceC17303e
    public final int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        int metrica = interfaceC16719e.metrica(i);
        int ad = !Float.isNaN(this.f31819e) ? AbstractC4653e.ad(abstractC9292e, this.f31819e) : 0;
        return metrica < ad ? ad : metrica;
    }

    @Override // defpackage.InterfaceC17303e
    public final int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        int smaato = interfaceC16719e.smaato(i);
        int ad = !Float.isNaN(this.f31818e) ? AbstractC4653e.ad(abstractC9292e, this.f31818e) : 0;
        return smaato < ad ? ad : smaato;
    }
}
