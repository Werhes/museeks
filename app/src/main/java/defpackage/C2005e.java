package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2005e {
    public C10566e ad;
    public InterfaceC14388e adcel;
    public long admob;
    public C18464e advert;
    public C12476e amazon;
    public int appmetrica;
    public List billing;
    public boolean license;
    public int metrica;
    public C1839e mopub;
    public int purchase;
    public EnumC7792e smaato;
    public InterfaceC2141e vip;
    public C7666e yandex;
    public long startapp = AbstractC9795e.ad;
    public int loadAd = -1;
    public int Signature = -1;

    public C2005e(C10566e c10566e, C1839e c1839e, InterfaceC2141e interfaceC2141e, int i, boolean z, int i2, int i3, List list) {
        this.ad = c10566e;
        this.vip = interfaceC2141e;
        this.metrica = i;
        this.license = z;
        this.appmetrica = i2;
        this.purchase = i3;
        this.billing = list;
        this.mopub = c1839e;
    }

    public final int ad(int i, EnumC7792e enumC7792e) {
        int i2 = this.loadAd;
        int i3 = this.Signature;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long ad = AbstractC2278e.ad(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.purchase > 1) {
            C7666e mopub = AbstractC7844e.mopub(this.yandex, enumC7792e, this.mopub, this.adcel, this.vip);
            this.yandex = mopub;
            ad = mopub.ad(this.purchase, ad);
        }
        int billing = AbstractC7861e.billing(vip(ad, enumC7792e).appmetrica);
        int startapp = C5602e.startapp(ad);
        if (billing < startapp) {
            billing = startapp;
        }
        this.loadAd = i;
        this.Signature = billing;
        return billing;
    }

    public final C18464e appmetrica(EnumC7792e enumC7792e) {
        C18464e c18464e = this.advert;
        if (c18464e == null || enumC7792e != this.smaato || c18464e.vip()) {
            this.smaato = enumC7792e;
            C10566e c10566e = this.ad;
            C1839e license = AbstractC15890e.license(this.mopub, enumC7792e);
            InterfaceC14388e interfaceC14388e = this.adcel;
            InterfaceC2141e interfaceC2141e = this.vip;
            List list = this.billing;
            if (list == null) {
                list = C13664e.f27089e;
            }
            c18464e = new C18464e(c10566e, license, list, interfaceC14388e, interfaceC2141e);
        }
        this.advert = c18464e;
        return c18464e;
    }

    public final void license(InterfaceC14388e interfaceC14388e) {
        long j;
        InterfaceC14388e interfaceC14388e2 = this.adcel;
        if (interfaceC14388e != null) {
            int i = AbstractC9795e.vip;
            j = AbstractC9795e.ad(interfaceC14388e.vip(), interfaceC14388e.mo499package());
        } else {
            j = AbstractC9795e.ad;
        }
        if (interfaceC14388e2 == null) {
            this.adcel = interfaceC14388e;
            this.startapp = j;
        } else if (interfaceC14388e == null || this.startapp != j) {
            this.adcel = interfaceC14388e;
            this.startapp = j;
            this.admob = (this.admob << 2) | 1;
            this.advert = null;
            this.amazon = null;
            this.Signature = -1;
            this.loadAd = -1;
        }
    }

    public final boolean metrica(long j, EnumC7792e enumC7792e) {
        this.admob = (this.admob << 2) | 3;
        if (this.purchase > 1) {
            C7666e mopub = AbstractC7844e.mopub(this.yandex, enumC7792e, this.mopub, this.adcel, this.vip);
            this.yandex = mopub;
            j = mopub.ad(this.purchase, j);
        }
        C12476e c12476e = this.amazon;
        if (c12476e != null) {
            C12890e c12890e = c12476e.vip;
            C0676e c0676e = c12476e.ad;
            if (!c12890e.ad.vip()) {
                EnumC7792e enumC7792e2 = c0676e.yandex;
                long j2 = c0676e.adcel;
                if (enumC7792e == enumC7792e2 && (C5602e.vip(j, j2) || (C5602e.yandex(j) == C5602e.yandex(j2) && C5602e.adcel(j) == C5602e.adcel(j2) && C5602e.billing(j) >= c12890e.appmetrica && !c12890e.metrica))) {
                    if (C5602e.vip(j, this.amazon.ad.adcel)) {
                        return false;
                    }
                    this.amazon = purchase(enumC7792e, j, this.amazon.vip);
                    return true;
                }
            }
        }
        this.amazon = purchase(enumC7792e, j, vip(j, enumC7792e));
        return true;
    }

    public final C12476e purchase(EnumC7792e enumC7792e, long j, C12890e c12890e) {
        float min = Math.min(c12890e.ad.mo2750extends(), c12890e.license);
        C10566e c10566e = this.ad;
        C1839e c1839e = this.mopub;
        List list = this.billing;
        if (list == null) {
            list = C13664e.f27089e;
        }
        return new C12476e(new C0676e(c10566e, c1839e, list, this.appmetrica, this.license, this.metrica, this.adcel, enumC7792e, this.vip, j), c12890e, AbstractC2278e.license(j, (AbstractC7861e.billing(min) << 32) | (AbstractC7861e.billing(c12890e.appmetrica) & 4294967295L)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        sb.append(this.amazon != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) AbstractC9795e.vip(this.startapp));
        sb.append(", history=");
        sb.append(this.admob);
        sb.append(", constraints=");
        C12476e c12476e = this.amazon;
        sb.append(c12476e != null ? new C5602e(c12476e.ad.adcel) : "null");
        sb.append(')');
        return sb.toString();
    }

    public final C12890e vip(long j, EnumC7792e enumC7792e) {
        C18464e appmetrica = appmetrica(enumC7792e);
        long vip = AbstractC3415e.vip(appmetrica.mo2750extends(), this.metrica, j, this.license);
        boolean z = this.license;
        int i = this.metrica;
        int i2 = this.appmetrica;
        return new C12890e(appmetrica, vip, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }
}
