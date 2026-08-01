package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؑۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4585e implements InterfaceC13397e {
    public final C1292e ad;
    public boolean adcel;
    public long advert;
    public long amazon;
    public final String appmetrica;
    public String billing;
    public final int license;
    public final String metrica;
    public boolean mopub;
    public InterfaceC18147e purchase;
    public int smaato;
    public int startapp;
    public final C10177e vip;
    public int yandex = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [eََ, java.lang.Object] */
    public C4585e(String str, int i, String str2) {
        C1292e c1292e = new C1292e(4);
        this.ad = c1292e;
        c1292e.ad[0] = -1;
        this.vip = new Object();
        this.amazon = -9223372036854775807L;
        this.metrica = str;
        this.license = i;
        this.appmetrica = str2;
    }

    @Override // defpackage.InterfaceC13397e
    public final void ad(C1292e c1292e) {
        this.purchase.getClass();
        while (c1292e.ad() > 0) {
            int i = this.yandex;
            C1292e c1292e2 = this.ad;
            if (i == 0) {
                byte[] bArr = c1292e.ad;
                int i2 = c1292e.vip;
                int i3 = c1292e.metrica;
                while (true) {
                    if (i2 >= i3) {
                        c1292e.m571try(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.mopub && (b & 224) == 224;
                    this.mopub = z;
                    if (z2) {
                        c1292e.m571try(i2 + 1);
                        this.mopub = false;
                        c1292e2.ad[1] = bArr[i2];
                        this.startapp = 2;
                        this.yandex = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int min = Math.min(c1292e.ad(), 4 - this.startapp);
                c1292e.mopub(this.startapp, min, c1292e2.ad);
                int i4 = this.startapp + min;
                this.startapp = i4;
                if (i4 >= 4) {
                    c1292e2.m571try(0);
                    int smaato = c1292e2.smaato();
                    C10177e c10177e = this.vip;
                    if (c10177e.ad(smaato)) {
                        this.smaato = c10177e.vip;
                        if (!this.adcel) {
                            this.advert = (c10177e.purchase * 1000000) / c10177e.metrica;
                            C11445e c11445e = new C11445e();
                            c11445e.ad = this.billing;
                            c11445e.smaato = AbstractC8542e.amazon(this.appmetrica);
                            c11445e.amazon = AbstractC8542e.amazon((String) c10177e.billing);
                            c11445e.loadAd = 4096;
                            c11445e.f23018class = c10177e.license;
                            c11445e.f23021interface = c10177e.metrica;
                            c11445e.license = this.metrica;
                            c11445e.purchase = this.license;
                            this.purchase.billing(new C16975e(c11445e));
                            this.adcel = true;
                        }
                        c1292e2.m571try(0);
                        this.purchase.appmetrica(4, c1292e2);
                        this.yandex = 2;
                    } else {
                        this.startapp = 0;
                        this.yandex = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(c1292e.ad(), this.smaato - this.startapp);
                this.purchase.appmetrica(min2, c1292e);
                int i5 = this.startapp + min2;
                this.startapp = i5;
                if (i5 >= this.smaato) {
                    AbstractC2301e.subscription(this.amazon != -9223372036854775807L);
                    this.purchase.ad(this.amazon, 1, this.smaato, 0, null);
                    this.amazon += this.advert;
                    this.startapp = 0;
                    this.yandex = 0;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void appmetrica(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        c18316e.ad();
        c18316e.vip();
        this.billing = c18316e.appmetrica;
        c18316e.vip();
        this.purchase = interfaceC5483e.Signature(c18316e.license, 1);
    }

    @Override // defpackage.InterfaceC13397e
    public final void license(int i, long j) {
        this.amazon = j;
    }

    @Override // defpackage.InterfaceC13397e
    public final void metrica(boolean z) {
    }

    @Override // defpackage.InterfaceC13397e
    public final void vip() {
        this.yandex = 0;
        this.startapp = 0;
        this.mopub = false;
        this.amazon = -9223372036854775807L;
    }
}
