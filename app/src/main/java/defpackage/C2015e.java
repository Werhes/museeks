package defpackage;

import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2015e implements InterfaceC18147e {
    public static final C16975e billing;
    public static final C16975e purchase;
    public final InterfaceC18147e ad;
    public int appmetrica;
    public byte[] license;
    public C16975e metrica;
    public final C16975e vip;

    static {
        C11445e c11445e = new C11445e();
        c11445e.amazon = AbstractC8542e.amazon("application/id3");
        purchase = new C16975e(c11445e);
        C11445e c11445e2 = new C11445e();
        c11445e2.amazon = AbstractC8542e.amazon("application/x-emsg");
        billing = new C16975e(c11445e2);
    }

    public C2015e(InterfaceC18147e interfaceC18147e, int i) {
        this.ad = interfaceC18147e;
        if (i == 1) {
            this.vip = purchase;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC1786e.admob(i, "Unknown metadataType: "));
            }
            this.vip = billing;
        }
        this.license = new byte[0];
        this.appmetrica = 0;
    }

    @Override // defpackage.InterfaceC18147e
    public final void ad(long j, int i, int i2, int i3, C17737e c17737e) {
        this.metrica.getClass();
        int i4 = this.appmetrica - i3;
        C1292e c1292e = new C1292e(Arrays.copyOfRange(this.license, i4 - i2, i4));
        byte[] bArr = this.license;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.appmetrica = i3;
        String str = this.metrica.loadAd;
        C16975e c16975e = this.vip;
        String str2 = c16975e.loadAd;
        String str3 = c16975e.loadAd;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.metrica.loadAd)) {
                AbstractC2803e.smaato("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.metrica.loadAd);
                return;
            }
            C15382e amazon = C14757e.amazon(c1292e);
            C16975e ad = amazon.ad();
            if (ad == null || !Objects.equals(str3, ad.loadAd)) {
                AbstractC2803e.smaato("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + amazon.ad());
                return;
            }
            byte[] metrica = amazon.metrica();
            metrica.getClass();
            c1292e = new C1292e(metrica);
        }
        int ad2 = c1292e.ad();
        InterfaceC18147e interfaceC18147e = this.ad;
        interfaceC18147e.appmetrica(ad2, c1292e);
        interfaceC18147e.ad(j, i, ad2, 0, c17737e);
    }

    @Override // defpackage.InterfaceC18147e
    public final void appmetrica(int i, C1292e c1292e) {
        vip(c1292e, i, 0);
    }

    @Override // defpackage.InterfaceC18147e
    public final void billing(C16975e c16975e) {
        this.metrica = c16975e;
        this.ad.billing(this.vip);
    }

    @Override // defpackage.InterfaceC18147e
    public final /* synthetic */ void license(long j) {
    }

    @Override // defpackage.InterfaceC18147e
    public final int metrica(InterfaceC15672e interfaceC15672e, int i, boolean z) {
        int i2 = this.appmetrica + i;
        byte[] bArr = this.license;
        if (bArr.length < i2) {
            this.license = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int read = interfaceC15672e.read(this.license, this.appmetrica, i);
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
        int i3 = this.appmetrica + i;
        byte[] bArr = this.license;
        if (bArr.length < i3) {
            this.license = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        c1292e.mopub(this.appmetrica, i, this.license);
        this.appmetrica += i;
    }
}
