package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920e implements InterfaceC1272e {
    public static final byte[] pro;
    public static final byte[] remoteconfig;
    public boolean Signature;
    public InterfaceC5483e adcel;
    public InterfaceC18147e advert;
    public boolean amazon;
    public int appmetrica;
    public long license;
    public long loadAd;
    public boolean metrica;
    public InterfaceC18147e mopub;
    public int purchase;
    public InterfaceC6347e smaato;
    public long startapp;
    public final C6891e vip;
    public int yandex;
    public static final int[] admob = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] subscription = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public final byte[] ad = new byte[1];
    public int billing = -1;

    static {
        String str = AbstractC9413e.ad;
        Charset charset = StandardCharsets.UTF_8;
        remoteconfig = "#!AMR\n".getBytes(charset);
        pro = "#!AMR-WB\n".getBytes(charset);
    }

    public C0920e() {
        C6891e c6891e = new C6891e();
        this.vip = c6891e;
        this.advert = c6891e;
    }

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    public final int billing(InterfaceC2283e interfaceC2283e) {
        boolean z;
        interfaceC2283e.smaato();
        byte[] bArr = this.ad;
        interfaceC2283e.ad(0, 1, bArr);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw C15125e.ad(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.metrica) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? subscription[i] : admob[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.metrica ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C15125e.ad(null, sb.toString());
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        this.license = 0L;
        this.appmetrica = 0;
        this.purchase = 0;
        this.loadAd = j2;
        InterfaceC6347e interfaceC6347e = this.smaato;
        if (!(interfaceC6347e instanceof C1873e)) {
            if (j == 0 || !(interfaceC6347e instanceof C11368e)) {
                this.startapp = 0L;
                return;
            } else {
                this.startapp = (Math.max(0L, j - ((C11368e) interfaceC6347e).vip) * 8000000) / r7.appmetrica;
                return;
            }
        }
        C1873e c1873e = (C1873e) interfaceC6347e;
        C12214e c12214e = c1873e.vip;
        long license = c12214e.vip == 0 ? -9223372036854775807L : c12214e.license(AbstractC9413e.metrica(c1873e.ad, j));
        this.startapp = license;
        if (Math.abs(this.loadAd - license) < 20000) {
            return;
        }
        this.amazon = true;
        this.advert = this.vip;
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        return yandex(interfaceC2283e);
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.adcel = interfaceC5483e;
        InterfaceC18147e Signature = interfaceC5483e.Signature(0, 1);
        this.mopub = Signature;
        this.advert = Signature;
        interfaceC5483e.mopub();
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.InterfaceC2283e r18, defpackage.C14829e r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0920e.vip(eَؔؐ, eٜٔؓ):int");
    }

    public final boolean yandex(InterfaceC2283e interfaceC2283e) {
        interfaceC2283e.smaato();
        byte[] bArr = remoteconfig;
        byte[] bArr2 = new byte[bArr.length];
        interfaceC2283e.ad(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.metrica = false;
            interfaceC2283e.amazon(bArr.length);
            return true;
        }
        interfaceC2283e.smaato();
        byte[] bArr3 = pro;
        byte[] bArr4 = new byte[bArr3.length];
        interfaceC2283e.ad(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.metrica = true;
        interfaceC2283e.amazon(bArr3.length);
        return true;
    }
}
