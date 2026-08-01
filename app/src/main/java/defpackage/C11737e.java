package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11737e {
    public final /* synthetic */ int ad;
    public boolean appmetrica;
    public long billing;
    public boolean license;
    public final C1292e metrica;
    public boolean purchase;
    public long startapp;
    public final C8010e vip;
    public long yandex;

    public C11737e(int i) {
        this.ad = i;
        switch (i) {
            case 1:
                this.vip = new C8010e(0L);
                this.billing = -9223372036854775807L;
                this.yandex = -9223372036854775807L;
                this.startapp = -9223372036854775807L;
                this.metrica = new C1292e();
                return;
            default:
                this.vip = new C8010e(0L);
                this.billing = -9223372036854775807L;
                this.yandex = -9223372036854775807L;
                this.startapp = -9223372036854775807L;
                this.metrica = new C1292e();
                return;
        }
    }

    public static long metrica(C1292e c1292e) {
        int i = c1292e.vip;
        if (c1292e.ad() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c1292e.mopub(0, 9, bArr);
        c1292e.m571try(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int vip(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void ad(InterfaceC2283e interfaceC2283e) {
        switch (this.ad) {
            case 0:
                byte[] bArr = AbstractC9413e.vip;
                C1292e c1292e = this.metrica;
                c1292e.getClass();
                c1292e.m570throw(bArr.length, bArr);
                this.license = true;
                interfaceC2283e.smaato();
                return;
            default:
                byte[] bArr2 = AbstractC9413e.vip;
                C1292e c1292e2 = this.metrica;
                c1292e2.getClass();
                c1292e2.m570throw(bArr2.length, bArr2);
                this.license = true;
                interfaceC2283e.smaato();
                return;
        }
    }
}
