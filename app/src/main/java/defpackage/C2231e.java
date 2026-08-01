package defpackage;

/* renamed from: eؓۦٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2231e extends C6130e {

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public byte[] f5689e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final byte[] f5686e = {34, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final byte[] f5685e = {34, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final byte[] f5687e = {35, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final byte[] f5688e = {35, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    public static int loadAd(byte b, byte b2, byte b3, byte b4) {
        return ((b & 255) << 23) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    @Override // defpackage.C6130e, defpackage.InterfaceC0554e
    public InterfaceC0554e ad() {
        return new C6130e(this);
    }

    @Override // defpackage.C6130e
    public final int advert() {
        return 625;
    }

    @Override // defpackage.C6130e
    public final void amazon(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("A key of 32 bytes is needed");
        }
        if (bArr2 == null || bArr2.length != 25) {
            throw new IllegalArgumentException("An IV of 25 bytes is needed");
        }
        iArr[0] = loadAd(bArr[0], this.f5689e[0], bArr[21], bArr[16]);
        iArr[1] = loadAd(bArr[1], this.f5689e[1], bArr[22], bArr[17]);
        iArr[2] = loadAd(bArr[2], this.f5689e[2], bArr[23], bArr[18]);
        iArr[3] = loadAd(bArr[3], this.f5689e[3], bArr[24], bArr[19]);
        iArr[4] = loadAd(bArr[4], this.f5689e[4], bArr[25], bArr[20]);
        iArr[5] = loadAd(bArr2[0], (byte) (this.f5689e[5] | (bArr2[17] & 63)), bArr[5], bArr[26]);
        iArr[6] = loadAd(bArr2[1], (byte) (this.f5689e[6] | (bArr2[18] & 63)), bArr[6], bArr[27]);
        iArr[7] = loadAd(bArr2[10], (byte) (this.f5689e[7] | (bArr2[19] & 63)), bArr[7], bArr2[2]);
        iArr[8] = loadAd(bArr[8], (byte) (this.f5689e[8] | (bArr2[20] & 63)), bArr2[3], bArr2[11]);
        iArr[9] = loadAd(bArr[9], (byte) ((bArr2[21] & 63) | this.f5689e[9]), bArr2[12], bArr2[4]);
        iArr[10] = loadAd(bArr2[5], (byte) (this.f5689e[10] | (bArr2[22] & 63)), bArr[10], bArr[28]);
        iArr[11] = loadAd(bArr[11], (byte) (this.f5689e[11] | (bArr2[23] & 63)), bArr2[6], bArr2[13]);
        iArr[12] = loadAd(bArr[12], (byte) (this.f5689e[12] | (bArr2[24] & 63)), bArr2[7], bArr2[14]);
        iArr[13] = loadAd(bArr[13], this.f5689e[13], bArr2[15], bArr2[8]);
        iArr[14] = loadAd(bArr[14], (byte) (this.f5689e[14] | ((bArr[31] >>> 4) & 15)), bArr2[16], bArr2[9]);
        iArr[15] = loadAd(bArr[15], (byte) (this.f5689e[15] | (bArr[31] & 15)), bArr[30], bArr[29]);
    }

    @Override // defpackage.C6130e, defpackage.InterfaceC14556e
    public final String getAlgorithmName() {
        return "Zuc-256";
    }

    @Override // defpackage.C6130e, defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        super.vip(interfaceC0554e);
        this.f5689e = ((C2231e) interfaceC0554e).f5689e;
    }
}
