package defpackage;

import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090e implements InterfaceC13397e {
    public final C0912e ad;
    public long advert;
    public boolean appmetrica;
    public C5345e license;
    public InterfaceC18147e metrica;
    public String vip;
    public final boolean[] purchase = new boolean[3];
    public final C6981e billing = new C6981e(32);
    public final C6981e yandex = new C6981e(33);
    public final C6981e startapp = new C6981e(34);
    public final C6981e adcel = new C6981e(39);
    public final C6981e mopub = new C6981e(40);
    public long smaato = -9223372036854775807L;
    public final C1292e amazon = new C1292e();

    public C0090e(C0912e c0912e) {
        this.ad = c0912e;
    }

    @Override // defpackage.InterfaceC13397e
    public final void ad(C1292e c1292e) {
        int i;
        this.metrica.getClass();
        String str = AbstractC9413e.ad;
        while (c1292e.ad() > 0) {
            int i2 = c1292e.vip;
            int i3 = c1292e.metrica;
            byte[] bArr = c1292e.ad;
            this.advert += c1292e.ad();
            this.metrica.appmetrica(c1292e.ad(), c1292e);
            while (i2 < i3) {
                int appmetrica = AbstractC17595e.appmetrica(bArr, i2, i3, this.purchase);
                if (appmetrica == i3) {
                    billing(i2, i3, bArr);
                    return;
                }
                int i4 = (bArr[appmetrica + 3] & 126) >> 1;
                if (appmetrica <= 0 || bArr[appmetrica - 1] != 0) {
                    i = 3;
                } else {
                    appmetrica--;
                    i = 4;
                }
                int i5 = appmetrica;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    billing(i2, i5, bArr);
                }
                int i8 = i3 - i5;
                long j = this.advert - i8;
                purchase(i8, i7 < 0 ? -i7 : 0, j, this.smaato);
                yandex(i8, i4, j, this.smaato);
                i2 = i5 + i6;
            }
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void appmetrica(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        c18316e.ad();
        c18316e.vip();
        this.vip = c18316e.appmetrica;
        c18316e.vip();
        InterfaceC18147e Signature = interfaceC5483e.Signature(c18316e.license, 2);
        this.metrica = Signature;
        this.license = new C5345e(Signature);
        this.ad.metrica(interfaceC5483e, c18316e);
    }

    public final void billing(int i, int i2, byte[] bArr) {
        C5345e c5345e = this.license;
        if (c5345e.purchase) {
            int i3 = c5345e.license;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                c5345e.billing = (bArr[i4] & 128) != 0;
                c5345e.purchase = false;
            } else {
                c5345e.license = (i2 - i) + i3;
            }
        }
        if (!this.appmetrica) {
            this.billing.ad(i, i2, bArr);
            this.yandex.ad(i, i2, bArr);
            this.startapp.ad(i, i2, bArr);
        }
        this.adcel.ad(i, i2, bArr);
        this.mopub.ad(i, i2, bArr);
    }

    @Override // defpackage.InterfaceC13397e
    public final void license(int i, long j) {
        this.smaato = j;
    }

    @Override // defpackage.InterfaceC13397e
    public final void metrica(boolean z) {
        this.metrica.getClass();
        String str = AbstractC9413e.ad;
        if (z) {
            ((C17790e) this.ad.f3333e).adcel(0);
            purchase(0, 0, this.advert, this.smaato);
            yandex(0, 48, this.advert, this.smaato);
        }
    }

    public final void purchase(int i, int i2, long j, long j2) {
        C17790e c17790e = (C17790e) this.ad.f3333e;
        C5345e c5345e = this.license;
        boolean z = this.appmetrica;
        if (c5345e.adcel && c5345e.billing) {
            c5345e.smaato = c5345e.metrica;
            c5345e.adcel = false;
        } else if (c5345e.yandex || c5345e.billing) {
            if (z && c5345e.startapp) {
                c5345e.ad(i + ((int) (j - c5345e.vip)));
            }
            c5345e.mopub = c5345e.vip;
            c5345e.advert = c5345e.appmetrica;
            c5345e.smaato = c5345e.metrica;
            c5345e.startapp = true;
        }
        if (!this.appmetrica) {
            C6981e c6981e = this.billing;
            c6981e.appmetrica(i2);
            C6981e c6981e2 = this.yandex;
            c6981e2.appmetrica(i2);
            C6981e c6981e3 = this.startapp;
            c6981e3.appmetrica(i2);
            if (c6981e.appmetrica && c6981e2.appmetrica && c6981e3.appmetrica) {
                String str = this.vip;
                int i3 = c6981e.metrica;
                byte[] bArr = new byte[c6981e2.metrica + i3 + c6981e3.metrica];
                System.arraycopy((byte[]) c6981e.purchase, 0, bArr, 0, i3);
                System.arraycopy((byte[]) c6981e2.purchase, 0, bArr, c6981e.metrica, c6981e2.metrica);
                System.arraycopy((byte[]) c6981e3.purchase, 0, bArr, c6981e.metrica + c6981e2.metrica, c6981e3.metrica);
                C11996e amazon = AbstractC17595e.amazon((byte[]) c6981e2.purchase, 3, c6981e2.metrica, null);
                C17049e c17049e = amazon.vip;
                String ad = c17049e != null ? AbstractC13612e.ad(c17049e.ad, c17049e.vip, c17049e.metrica, c17049e.license, c17049e.appmetrica, c17049e.purchase) : null;
                C11445e c11445e = new C11445e();
                c11445e.ad = str;
                c11445e.smaato = AbstractC8542e.amazon("video/mp2t");
                c11445e.amazon = AbstractC8542e.amazon("video/hevc");
                c11445e.adcel = ad;
                c11445e.signatures = amazon.appmetrica;
                c11445e.tapsense = amazon.purchase;
                c11445e.isVip = amazon.billing;
                c11445e.inmobi = amazon.yandex;
                c11445e.crashlytics = new C14754e(amazon.mopub, amazon.advert, amazon.smaato, null, amazon.metrica + 8, amazon.license + 8);
                c11445e.ads = amazon.startapp;
                c11445e.Signature = amazon.adcel;
                c11445e.firebase = amazon.ad + 1;
                c11445e.admob = Collections.singletonList(bArr);
                C16975e c16975e = new C16975e(c11445e);
                this.metrica.billing(c16975e);
                int i4 = c16975e.admob;
                AbstractC2301e.subscription(i4 != -1);
                c17790e.m4435try(i4);
                this.appmetrica = true;
            }
        }
        C6981e c6981e4 = this.adcel;
        boolean appmetrica = c6981e4.appmetrica(i2);
        C1292e c1292e = this.amazon;
        if (appmetrica) {
            c1292e.m570throw(AbstractC17595e.subscription(c6981e4.metrica, (byte[]) c6981e4.purchase), (byte[]) c6981e4.purchase);
            c1292e.m568protected(5);
            c17790e.ad(j2, c1292e);
        }
        C6981e c6981e5 = this.mopub;
        if (c6981e5.appmetrica(i2)) {
            c1292e.m570throw(AbstractC17595e.subscription(c6981e5.metrica, (byte[]) c6981e5.purchase), (byte[]) c6981e5.purchase);
            c1292e.m568protected(5);
            c17790e.ad(j2, c1292e);
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void vip() {
        this.advert = 0L;
        this.smaato = -9223372036854775807L;
        AbstractC17595e.license(this.purchase);
        this.billing.billing();
        this.yandex.billing();
        this.startapp.billing();
        this.adcel.billing();
        this.mopub.billing();
        ((C17790e) this.ad.f3333e).adcel(0);
        C5345e c5345e = this.license;
        if (c5345e != null) {
            c5345e.purchase = false;
            c5345e.billing = false;
            c5345e.yandex = false;
            c5345e.startapp = false;
            c5345e.adcel = false;
        }
    }

    public final void yandex(int i, int i2, long j, long j2) {
        C5345e c5345e = this.license;
        boolean z = this.appmetrica;
        c5345e.billing = false;
        c5345e.yandex = false;
        c5345e.appmetrica = j2;
        c5345e.license = 0;
        c5345e.vip = j;
        if (i2 >= 32 && i2 != 40) {
            if (c5345e.startapp && !c5345e.adcel) {
                if (z) {
                    c5345e.ad(i);
                }
                c5345e.startapp = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                c5345e.yandex = !c5345e.adcel;
                c5345e.adcel = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        c5345e.metrica = z2;
        c5345e.purchase = z2 || i2 <= 9;
        if (!this.appmetrica) {
            this.billing.yandex(i2);
            this.yandex.yandex(i2);
            this.startapp.yandex(i2);
        }
        this.adcel.yandex(i2);
        this.mopub.yandex(i2);
    }
}
