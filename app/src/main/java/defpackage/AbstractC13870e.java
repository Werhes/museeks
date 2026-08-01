package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13870e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27480e;

    public /* synthetic */ AbstractC13870e(int i) {
        this.f27480e = i;
    }

    public int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        switch (this.f27480e) {
            case 0:
                return interfaceC16719e.loadAd(i);
            default:
                return interfaceC16719e.loadAd(i);
        }
    }

    public int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        switch (this.f27480e) {
            case 0:
                return interfaceC16719e.mo2529while(i);
            default:
                return interfaceC16719e.mo2529while(i);
        }
    }

    /* renamed from: eؒٚۨ */
    public abstract boolean mo2292e();

    /* renamed from: eٌٔٗ */
    public abstract long mo2293e(InterfaceC16719e interfaceC16719e, long j);

    public InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        long mo2293e = mo2293e(interfaceC16719e, j);
        if (mo2292e()) {
            mo2293e = AbstractC2278e.appmetrica(j, mo2293e);
        }
        AbstractC2832e admob = interfaceC16719e.admob(mo2293e);
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C4889e(admob, 7));
    }

    public int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        switch (this.f27480e) {
            case 0:
                return interfaceC16719e.metrica(i);
            default:
                return interfaceC16719e.metrica(i);
        }
    }

    public int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        switch (this.f27480e) {
            case 0:
                return interfaceC16719e.smaato(i);
            default:
                return interfaceC16719e.smaato(i);
        }
    }
}
