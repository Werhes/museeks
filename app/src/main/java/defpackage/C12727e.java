package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12727e implements InterfaceC18147e {
    public final InterfaceC18147e ad;
    public InterfaceC10625e billing;
    public boolean startapp;
    public final InterfaceC7854e vip;
    public C16975e yandex;
    public int license = 0;
    public int appmetrica = 0;
    public byte[] purchase = AbstractC9413e.vip;
    public final C1292e metrica = new C1292e();

    public C12727e(InterfaceC18147e interfaceC18147e, InterfaceC7854e interfaceC7854e) {
        this.ad = interfaceC18147e;
        this.vip = interfaceC7854e;
    }

    @Override // defpackage.InterfaceC18147e
    public final void ad(long j, int i, int i2, int i3, C17737e c17737e) {
        if (this.billing == null) {
            this.ad.ad(j, i, i2, i3, c17737e);
            return;
        }
        AbstractC2301e.yandex(c17737e == null, "DRM on subtitles is not supported");
        int i4 = (this.appmetrica - i3) - i2;
        try {
            this.billing.mo825transient(this.purchase, i4, i2, C14033e.metrica, new C13790e(this, j, i));
        } catch (RuntimeException e) {
            if (!this.startapp) {
                throw e;
            }
            AbstractC2803e.amazon("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.license = i5;
        if (i5 == this.appmetrica) {
            this.license = 0;
            this.appmetrica = 0;
        }
    }

    @Override // defpackage.InterfaceC18147e
    public final void appmetrica(int i, C1292e c1292e) {
        vip(c1292e, i, 0);
    }

    @Override // defpackage.InterfaceC18147e
    public final void billing(C16975e c16975e) {
        c16975e.loadAd.getClass();
        String str = c16975e.loadAd;
        AbstractC2301e.billing(AbstractC8542e.yandex(str) == 3);
        boolean equals = c16975e.equals(this.yandex);
        InterfaceC7854e interfaceC7854e = this.vip;
        if (!equals) {
            this.yandex = c16975e;
            this.billing = interfaceC7854e.mopub(c16975e) ? interfaceC7854e.remoteconfig(c16975e) : null;
        }
        InterfaceC10625e interfaceC10625e = this.billing;
        InterfaceC18147e interfaceC18147e = this.ad;
        if (interfaceC10625e == null) {
            interfaceC18147e.billing(c16975e);
            return;
        }
        C11445e ad = c16975e.ad();
        ad.amazon = AbstractC8542e.amazon("application/x-media3-cues");
        ad.adcel = str;
        ad.remoteconfig = Long.MAX_VALUE;
        ad.f23025throw = interfaceC7854e.inmobi(c16975e);
        AbstractC8647e.firebase(ad, interfaceC18147e);
    }

    @Override // defpackage.InterfaceC18147e
    public final /* synthetic */ void license(long j) {
    }

    @Override // defpackage.InterfaceC18147e
    public final int metrica(InterfaceC15672e interfaceC15672e, int i, boolean z) {
        if (this.billing == null) {
            return this.ad.metrica(interfaceC15672e, i, z);
        }
        yandex(i);
        int read = interfaceC15672e.read(this.purchase, this.appmetrica, i);
        if (read != -1) {
            this.appmetrica += read;
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.InterfaceC18147e
    public final int purchase(InterfaceC15672e interfaceC15672e, int i, boolean z) {
        return metrica(interfaceC15672e, i, z);
    }

    @Override // defpackage.InterfaceC18147e
    public final void vip(C1292e c1292e, int i, int i2) {
        if (this.billing == null) {
            this.ad.vip(c1292e, i, i2);
            return;
        }
        yandex(i);
        c1292e.mopub(this.appmetrica, i, this.purchase);
        this.appmetrica += i;
    }

    public final void yandex(int i) {
        int length = this.purchase.length;
        int i2 = this.appmetrica;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.license;
        int max = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.purchase;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.license, bArr2, 0, i3);
        this.license = 0;
        this.appmetrica = i3;
        this.purchase = bArr2;
    }
}
