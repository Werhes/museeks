package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3225e implements InterfaceC8848e {
    public final int Signature;
    public final int ad;
    public final long adcel;
    public final int admob;
    public final Object advert;
    public final long amazon;
    public final C14544e appmetrica;
    public final int billing;
    public final int[] isVip;
    public final InterfaceC3886e license;
    public int loadAd;
    public final boolean metrica;
    public final Object mopub;
    public int pro = RecyclerView.UNDEFINED_DURATION;
    public final EnumC7792e purchase;
    public boolean remoteconfig;
    public int signatures;
    public final C2245e smaato;
    public final int startapp;
    public final int subscription;
    public int tapsense;
    public final List vip;
    public final int yandex;

    public C3225e(int i, List list, boolean z, InterfaceC3886e interfaceC3886e, C14544e c14544e, EnumC7792e enumC7792e, int i2, int i3, int i4, long j, Object obj, Object obj2, C2245e c2245e, long j2) {
        this.ad = i;
        this.vip = list;
        this.metrica = z;
        this.license = interfaceC3886e;
        this.appmetrica = c14544e;
        this.purchase = enumC7792e;
        this.billing = i2;
        this.yandex = i3;
        this.startapp = i4;
        this.adcel = j;
        this.mopub = obj;
        this.advert = obj2;
        this.smaato = c2245e;
        this.amazon = j2;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2832e abstractC2832e = (AbstractC2832e) list.get(i7);
            boolean z2 = this.metrica;
            i5 += z2 ? abstractC2832e.f6804e : abstractC2832e.f6806e;
            i6 = Math.max(i6, !z2 ? abstractC2832e.f6804e : abstractC2832e.f6806e);
        }
        this.Signature = i5;
        int i8 = i5 + this.startapp;
        this.admob = i8 >= 0 ? i8 : 0;
        this.subscription = i6;
        this.isVip = new int[this.vip.size() * 2];
    }

    public final int ad(long j) {
        return (int) (this.metrica ? j & 4294967295L : j >> 32);
    }

    @Override // defpackage.InterfaceC8848e
    public final long adcel() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC8848e
    public final void advert() {
        this.remoteconfig = true;
    }

    @Override // defpackage.InterfaceC8848e
    public final int amazon() {
        return 0;
    }

    @Override // defpackage.InterfaceC8848e
    public final int billing() {
        return this.admob;
    }

    @Override // defpackage.InterfaceC8848e
    public final int getIndex() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC8848e
    public final Object getKey() {
        return this.mopub;
    }

    public final void license(int i, int i2, int i3) {
        int i4;
        this.loadAd = i;
        boolean z = this.metrica;
        this.pro = z ? i3 : i2;
        List list = this.vip;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC2832e abstractC2832e = (AbstractC2832e) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.isVip;
            if (z) {
                InterfaceC3886e interfaceC3886e = this.license;
                if (interfaceC3886e == null) {
                    throw AbstractC5087e.m1749interface("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = interfaceC3886e.ad(abstractC2832e.f6806e, i2, this.purchase);
                iArr[i6 + 1] = i;
                i4 = abstractC2832e.f6804e;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                C14544e c14544e = this.appmetrica;
                if (c14544e == null) {
                    throw AbstractC5087e.m1749interface("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = c14544e.ad(abstractC2832e.f6804e, i3);
                i4 = abstractC2832e.f6806e;
            }
            i += i4;
        }
        this.signatures = -this.billing;
        this.tapsense = this.pro + this.yandex;
    }

    public final void metrica(AbstractC3698e abstractC3698e, boolean z) {
        C16446e c16446e;
        if (this.pro == Integer.MIN_VALUE) {
            AbstractC8889e.ad("position() should be called first");
        }
        List list = this.vip;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC2832e abstractC2832e = (AbstractC2832e) list.get(i);
            int i2 = this.signatures;
            boolean z2 = this.metrica;
            int i3 = i2 - (z2 ? abstractC2832e.f6804e : abstractC2832e.f6806e);
            int i4 = this.tapsense;
            long smaato = smaato(i);
            C0110e vip = this.smaato.vip(i, this.mopub);
            if (vip != null) {
                if (z) {
                    vip.subscription = smaato;
                } else {
                    if (!C11490e.vip(vip.subscription, C0110e.remoteconfig)) {
                        smaato = vip.subscription;
                    }
                    long license = C11490e.license(smaato, ((C11490e) vip.admob.getValue()).ad);
                    if ((ad(smaato) <= i3 && ad(license) <= i3) || (ad(smaato) >= i4 && ad(license) >= i4)) {
                        vip.vip();
                    }
                    smaato = license;
                }
                c16446e = vip.amazon;
            } else {
                c16446e = null;
            }
            long license2 = C11490e.license(smaato, this.adcel);
            if (!z && vip != null) {
                vip.smaato = license2;
            }
            if (z2) {
                if (c16446e != null) {
                    abstractC3698e.getClass();
                    AbstractC3698e.ad(abstractC3698e, abstractC2832e);
                    abstractC2832e.mo1207case(C11490e.license(license2, abstractC2832e.f6802e), 0.0f, c16446e);
                } else {
                    AbstractC3698e.admob(abstractC3698e, abstractC2832e, license2);
                }
            } else if (c16446e != null) {
                AbstractC3698e.loadAd(abstractC3698e, abstractC2832e, license2, c16446e);
            } else {
                AbstractC3698e.amazon(abstractC3698e, abstractC2832e, license2);
            }
        }
    }

    @Override // defpackage.InterfaceC8848e
    public final boolean mopub() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC8848e
    public final void purchase(int i, int i2, int i3, int i4) {
        license(i, i3, i4);
    }

    @Override // defpackage.InterfaceC8848e
    public final long smaato(int i) {
        if (i == 0 && this.vip.size() == 0) {
            if (this.metrica) {
                return (4294967295L & this.loadAd) | (0 << 32);
            }
            return (4294967295L & 0) | (this.loadAd << 32);
        }
        int[] iArr = this.isVip;
        return (4294967295L & iArr[r7 + 1]) | (iArr[i * 2] << 32);
    }

    @Override // defpackage.InterfaceC8848e
    public final Object startapp(int i) {
        return ((AbstractC2832e) this.vip.get(i)).signatures();
    }

    @Override // defpackage.InterfaceC8848e
    public final int vip() {
        return this.vip.size();
    }

    @Override // defpackage.InterfaceC8848e
    public final int yandex() {
        return 1;
    }
}
