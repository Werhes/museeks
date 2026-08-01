package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ۠ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17320e extends AbstractC6126e implements InterfaceC17453e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public InterfaceC6256e f33992e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C0398e f33993e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C2547e f33994e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public C15860e f33995e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C7911e f33996e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public C16174e f33997e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public C6260e f33998e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public boolean f33999e;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public static void m4303e(C7911e c7911e, String str, boolean z) {
        if (z) {
            C11410e c11410e = c7911e.appmetrica;
            C11840e c11840e = c7911e.tapsense;
            if (c11410e == null) {
                int length = str.length();
                c11840e.invoke(new C0398e(AbstractC9262e.metrica(length, length), 4, str));
            } else {
                C0398e Signature = c7911e.license.Signature(AbstractC6874e.startapp(new Object(), new C6155e(str, 1)));
                c11410e.ad(null, Signature);
                c11840e.invoke(Signature);
            }
        }
    }

    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        C10566e c10566e = this.f33993e.ad;
        InterfaceC8614e[] interfaceC8614eArr = AbstractC14594e.ad;
        C16591e c16591e = AbstractC9058e.f18134class;
        InterfaceC8614e[] interfaceC8614eArr2 = AbstractC14594e.ad;
        InterfaceC8614e interfaceC8614e = interfaceC8614eArr2[18];
        interfaceC15671e.appmetrica(c16591e, c10566e);
        C10566e c10566e2 = this.f33994e.ad;
        C16591e c16591e2 = AbstractC9058e.f18139interface;
        InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr2[19];
        interfaceC15671e.appmetrica(c16591e2, c10566e2);
        long j = this.f33993e.vip;
        C16591e c16591e3 = AbstractC9058e.f18137goto;
        InterfaceC8614e interfaceC8614e3 = interfaceC8614eArr2[20];
        interfaceC15671e.appmetrica(c16591e3, new C12347e(j));
        AbstractC14594e.purchase(interfaceC15671e, C14914e.f29583e);
        C13333e smaato = AbstractC11815e.smaato(this.f33993e.ad);
        if (smaato != null) {
            AbstractC14594e.startapp(interfaceC15671e, smaato);
        }
        AbstractC14594e.license(interfaceC15671e, new C16543e(this, 0));
        int i = this.f33997e.license;
        if (i == 6) {
            InterfaceC5371e.ad.getClass();
            AbstractC14594e.yandex(interfaceC15671e, C8155e.license);
        } else if (i == 7 || i == 8) {
            InterfaceC5371e.ad.getClass();
            AbstractC14594e.yandex(interfaceC15671e, C8155e.metrica);
        } else if (i == 4) {
            InterfaceC5371e.ad.getClass();
            AbstractC14594e.yandex(interfaceC15671e, C8155e.appmetrica);
        }
        if (!this.f33999e) {
            AbstractC14594e.ad(interfaceC15671e);
        }
        boolean z = this.f33999e;
        C16591e c16591e4 = AbstractC9058e.f18132abstract;
        InterfaceC8614e interfaceC8614e4 = interfaceC8614eArr2[28];
        interfaceC15671e.appmetrica(c16591e4, Boolean.valueOf(z));
        AbstractC14594e.vip(interfaceC15671e, new C16543e(this, 1));
        int i2 = 2;
        if (z) {
            interfaceC15671e.appmetrica(AbstractC10789e.mopub, new C10591e(null, new C16543e(this, i2)));
            interfaceC15671e.appmetrica(AbstractC10789e.loadAd, new C10591e(null, new C16543e(this, interfaceC15671e)));
        }
        interfaceC15671e.appmetrica(AbstractC10789e.adcel, new C10591e(null, new C6599e(21, this)));
        AbstractC14594e.appmetrica(interfaceC15671e, this.f33997e.appmetrica, new C7147e(this, 6));
        AbstractC14594e.metrica(interfaceC15671e, new C7147e(this, 7));
        interfaceC15671e.appmetrica(AbstractC10789e.metrica, new C10591e(null, new C7147e(this, 1)));
        if (!C12347e.license(this.f33993e.vip)) {
            interfaceC15671e.appmetrica(AbstractC10789e.admob, new C10591e(null, new C7147e(this, 2)));
            if (this.f33999e) {
                interfaceC15671e.appmetrica(AbstractC10789e.subscription, new C10591e(null, new C7147e(this, 3)));
            }
        }
        if (this.f33999e) {
            interfaceC15671e.appmetrica(AbstractC10789e.remoteconfig, new C10591e(null, new C7147e(this, 5)));
        }
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: eؒۖۗ */
    public final boolean mo359e() {
        return true;
    }

    @Override // defpackage.InterfaceC17453e
    public final /* synthetic */ boolean smaato() {
        return true;
    }
}
