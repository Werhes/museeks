package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۘۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15680e implements InterfaceC17119e {
    public final InterfaceC17119e ad;
    public final C16437e vip;

    public C15680e(InterfaceC17119e interfaceC17119e, C16437e c16437e) {
        this.ad = interfaceC17119e;
        this.vip = c16437e;
    }

    @Override // defpackage.InterfaceC17119e
    public final int Signature(int i) {
        return this.ad.Signature(i);
    }

    public final boolean ad(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15680e) {
            return this.ad.equals(((C15680e) obj).ad);
        }
        return false;
    }

    @Override // defpackage.InterfaceC17119e
    public final C16437e adcel() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC17119e
    public final int admob(long j, List list) {
        return this.ad.admob(j, list);
    }

    @Override // defpackage.InterfaceC17119e
    public final boolean advert(long j, AbstractC15951e abstractC15951e, List list) {
        return this.ad.advert(j, abstractC15951e, list);
    }

    @Override // defpackage.InterfaceC17119e
    public final C16975e amazon(int i) {
        return this.vip.license[this.ad.Signature(i)];
    }

    @Override // defpackage.InterfaceC17119e
    public final int applovin(int i) {
        return this.ad.applovin(i);
    }

    @Override // defpackage.InterfaceC17119e
    public final void billing() {
        this.ad.billing();
    }

    public final boolean equals(Object obj) {
        if (ad(obj) && (obj instanceof C15680e)) {
            return this.vip.equals(((C15680e) obj).vip);
        }
        return false;
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC17119e
    public final void inmobi() {
        this.ad.inmobi();
    }

    @Override // defpackage.InterfaceC17119e
    public final void isPro() {
        this.ad.isPro();
    }

    @Override // defpackage.InterfaceC17119e
    public final Object isVip() {
        return this.ad.isVip();
    }

    @Override // defpackage.InterfaceC17119e
    public final int length() {
        return this.ad.length();
    }

    @Override // defpackage.InterfaceC17119e
    public final void loadAd() {
        this.ad.loadAd();
    }

    @Override // defpackage.InterfaceC17119e
    public final int mopub() {
        return this.ad.mopub();
    }

    @Override // defpackage.InterfaceC17119e
    public final int pro() {
        return this.ad.pro();
    }

    @Override // defpackage.InterfaceC17119e
    public final C16975e remoteconfig() {
        return this.vip.license[this.ad.subscription()];
    }

    @Override // defpackage.InterfaceC17119e
    public final boolean signatures(int i, long j) {
        return this.ad.signatures(i, j);
    }

    @Override // defpackage.InterfaceC17119e
    public final void smaato(boolean z) {
        this.ad.smaato(z);
    }

    @Override // defpackage.InterfaceC17119e
    public final void startapp(long j, long j2, long j3, List list, InterfaceC14651e[] interfaceC14651eArr) {
        this.ad.startapp(j, j2, j3, list, interfaceC14651eArr);
    }

    @Override // defpackage.InterfaceC17119e
    public final int subscription() {
        return this.ad.subscription();
    }

    @Override // defpackage.InterfaceC17119e
    public final void tapsense(float f) {
        this.ad.tapsense(f);
    }

    @Override // defpackage.InterfaceC17119e
    public final boolean yandex(int i, long j) {
        return this.ad.yandex(i, j);
    }
}
