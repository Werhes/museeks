package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۧۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2255e {
    public final C3605e ad;
    public int adcel;
    public long advert;
    public int[] amazon;
    public final long appmetrica;
    public int billing;
    public final int license;
    public final int metrica;
    public int mopub;
    public int purchase;
    public long[] smaato;
    public int startapp;
    public final InterfaceC18147e vip;
    public int yandex;

    public C2255e(int i, C3605e c3605e, InterfaceC18147e interfaceC18147e) {
        int i2 = c3605e.license;
        this.ad = c3605e;
        int vip = c3605e.vip();
        boolean z = true;
        if (vip != 1 && vip != 2) {
            z = false;
        }
        AbstractC2301e.billing(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.metrica = (vip == 2 ? 1667497984 : 1651965952) | i3;
        long j = c3605e.vip * 1000000;
        long j2 = c3605e.metrica;
        String str = AbstractC9413e.ad;
        this.appmetrica = AbstractC9413e.m2555import(i2, j, j2, RoundingMode.DOWN);
        this.vip = interfaceC18147e;
        this.license = vip == 2 ? i3 | 1650720768 : -1;
        this.advert = -1L;
        this.smaato = new long[AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE];
        this.amazon = new int[AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE];
        this.purchase = i2;
    }

    public final C7278e ad(int i) {
        return new C7278e(((this.appmetrica * 1) / this.purchase) * this.amazon[i], this.smaato[i]);
    }

    public final C13178e vip(long j) {
        if (this.mopub == 0) {
            C7278e c7278e = new C7278e(0L, this.advert);
            return new C13178e(c7278e, c7278e);
        }
        int i = (int) (j / ((this.appmetrica * 1) / this.purchase));
        int appmetrica = AbstractC9413e.appmetrica(this.amazon, i, true, true);
        if (this.amazon[appmetrica] == i) {
            C7278e ad = ad(appmetrica);
            return new C13178e(ad, ad);
        }
        C7278e ad2 = ad(appmetrica);
        int i2 = appmetrica + 1;
        return i2 < this.smaato.length ? new C13178e(ad2, ad(i2)) : new C13178e(ad2, ad2);
    }
}
