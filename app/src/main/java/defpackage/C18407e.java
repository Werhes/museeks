package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۠ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18407e {
    public final InterfaceC18147e ad;
    public final C16975e adcel;
    public C13936e appmetrica;
    public int billing;
    public C5085e license;
    public int purchase;
    public boolean smaato;
    public int startapp;
    public int yandex;
    public final C3301e vip = new C3301e();
    public final C1292e metrica = new C1292e();
    public final C1292e mopub = new C1292e(1);
    public final C1292e advert = new C1292e();

    public C18407e(InterfaceC18147e interfaceC18147e, C5085e c5085e, C13936e c13936e, C16975e c16975e) {
        this.ad = interfaceC18147e;
        this.license = c5085e;
        this.appmetrica = c13936e;
        this.adcel = c16975e;
        this.license = c5085e;
        this.appmetrica = c13936e;
        interfaceC18147e.billing(c16975e);
        appmetrica();
    }

    public final int ad() {
        int i = !this.smaato ? this.license.billing[this.purchase] : this.vip.adcel[this.purchase] ? 1 : 0;
        return vip() != null ? i | 1073741824 : i;
    }

    public final void appmetrica() {
        C3301e c3301e = this.vip;
        c3301e.license = 0;
        c3301e.Signature = 0L;
        c3301e.admob = false;
        c3301e.mopub = false;
        c3301e.loadAd = false;
        c3301e.smaato = null;
        this.purchase = 0;
        this.yandex = 0;
        this.billing = 0;
        this.startapp = 0;
        this.smaato = false;
    }

    public final int license(int i, int i2) {
        C1292e c1292e;
        C18274e vip = vip();
        if (vip == null) {
            return 0;
        }
        int i3 = vip.license;
        C3301e c3301e = this.vip;
        if (i3 != 0) {
            c1292e = c3301e.amazon;
        } else {
            byte[] bArr = vip.appmetrica;
            String str = AbstractC9413e.ad;
            int length = bArr.length;
            C1292e c1292e2 = this.advert;
            c1292e2.m570throw(length, bArr);
            i3 = bArr.length;
            c1292e = c1292e2;
        }
        boolean z = c3301e.mopub && c3301e.advert[this.purchase];
        boolean z2 = z || i2 != 0;
        C1292e c1292e3 = this.mopub;
        c1292e3.ad[0] = (byte) ((z2 ? 128 : 0) | i3);
        c1292e3.m571try(0);
        InterfaceC18147e interfaceC18147e = this.ad;
        interfaceC18147e.vip(c1292e3, 1, 1);
        interfaceC18147e.vip(c1292e, i3, 1);
        if (!z2) {
            return i3 + 1;
        }
        C1292e c1292e4 = this.metrica;
        if (!z) {
            c1292e4.m564extends(8);
            byte[] bArr2 = c1292e4.ad;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            interfaceC18147e.vip(c1292e4, 8, 1);
            return i3 + 9;
        }
        C1292e c1292e5 = c3301e.amazon;
        int m565goto = c1292e5.m565goto();
        c1292e5.m568protected(-2);
        int i4 = (m565goto * 6) + 2;
        if (i2 != 0) {
            c1292e4.m564extends(i4);
            byte[] bArr3 = c1292e4.ad;
            c1292e5.mopub(0, i4, bArr3);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & 255);
            bArr3[3] = (byte) (i5 & 255);
        } else {
            c1292e4 = c1292e5;
        }
        interfaceC18147e.vip(c1292e4, i4, 1);
        return i3 + 1 + i4;
    }

    public final boolean metrica() {
        this.purchase++;
        if (!this.smaato) {
            return false;
        }
        int i = this.billing + 1;
        this.billing = i;
        int[] iArr = this.vip.billing;
        int i2 = this.yandex;
        if (i != iArr[i2]) {
            return true;
        }
        this.yandex = i2 + 1;
        this.billing = 0;
        return false;
    }

    public final C18274e vip() {
        if (!this.smaato) {
            return null;
        }
        C3301e c3301e = this.vip;
        C13936e c13936e = c3301e.ad;
        String str = AbstractC9413e.ad;
        int i = c13936e.ad;
        C18274e c18274e = c3301e.smaato;
        if (c18274e == null) {
            c18274e = this.license.ad.advert[i];
        }
        if (c18274e == null || !c18274e.ad) {
            return null;
        }
        return c18274e;
    }
}
