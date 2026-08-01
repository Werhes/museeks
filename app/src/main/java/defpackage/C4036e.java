package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4036e {
    public final InterfaceC2661e Signature;
    public final C13713e ad;
    public final int adcel;
    public final C8303e admob;
    public final int advert;
    public final boolean amazon;
    public final long appmetrica;
    public final C14856e billing;
    public final C0085e license;
    public final List loadAd;
    public final C11842e metrica;
    public final int mopub;
    public final boolean purchase;
    public final int remoteconfig;
    public final InterfaceC18435e smaato;
    public final long startapp;
    public final Csuper subscription;
    public final Object vip;
    public final int yandex;

    public C4036e(C13713e c13713e, List list, C11842e c11842e, C0085e c0085e, long j, boolean z, C14856e c14856e, int i, long j2, int i2, int i3, int i4, InterfaceC18435e interfaceC18435e, boolean z2, List list2, InterfaceC2661e interfaceC2661e) {
        this.ad = c13713e;
        this.vip = list;
        this.metrica = c11842e;
        this.license = c0085e;
        this.appmetrica = j;
        this.purchase = z;
        this.billing = c14856e;
        this.yandex = i;
        this.startapp = j2;
        this.adcel = i2;
        this.mopub = i3;
        this.advert = i4;
        this.smaato = interfaceC18435e;
        this.amazon = z2;
        this.loadAd = list2;
        this.Signature = interfaceC2661e;
        this.admob = new C8303e(this, z, c11842e, c14856e, c0085e);
        this.subscription = c13713e.appmetrica;
        this.remoteconfig = c0085e.vip.length;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final List ad() {
        return this.vip;
    }

    public final long vip(C11842e c11842e, int i, int i2) {
        boolean m351interface = c11842e.vip.vip.m351interface(i);
        int i3 = m351interface ? this.remoteconfig : 1;
        if (m351interface) {
            i2 = 0;
        }
        return ((i3 + i2) & 4294967295L) | (i2 << 32);
    }
}
