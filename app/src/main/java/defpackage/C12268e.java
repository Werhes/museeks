package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12268e implements InterfaceC2227e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f24606e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f24607e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f24608e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f24609e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f24610e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f24611e;

    public C12268e(int i, int i2, int i3, boolean z, boolean z2, int i4) {
        this.f24610e = i;
        this.f24608e = i2;
        this.f24607e = i3;
        this.f24606e = z;
        this.f24611e = z2;
        this.f24609e = i4;
    }

    public static int ad(int i, byte[] bArr) {
        int i2 = ((bArr[i + 1] & 255) << 16) | (bArr[i] << 24);
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    public static void vip(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    @Override // defpackage.InterfaceC2227e
    public String getAlgorithmName() {
        return "TEA";
    }

    @Override // defpackage.InterfaceC2227e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        if (!(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to TEA init - ", interfaceC3894e));
        }
        this.f24611e = z;
        this.f24606e = true;
        byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        this.f24610e = ad(0, bArr);
        this.f24608e = ad(4, bArr);
        this.f24607e = ad(8, bArr);
        this.f24609e = ad(12, bArr);
        if (interfaceC3894e instanceof EnumC0300e) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC2227e
    public int isPro() {
        return 8;
    }

    @Override // defpackage.InterfaceC2227e
    public void reset() {
    }

    @Override // defpackage.InterfaceC2227e
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (!this.f24606e) {
            throw new IllegalStateException("TEA not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        int i3 = 0;
        if (this.f24611e) {
            int ad = ad(i, bArr);
            int ad2 = ad(i + 4, bArr);
            int i4 = 0;
            while (i3 != 32) {
                i4 -= 1640531527;
                ad += (((ad2 << 4) + this.f24610e) ^ (ad2 + i4)) ^ ((ad2 >>> 5) + this.f24608e);
                ad2 += (((ad << 4) + this.f24607e) ^ (ad + i4)) ^ ((ad >>> 5) + this.f24609e);
                i3++;
            }
            vip(ad, i2, bArr2);
            vip(ad2, i2 + 4, bArr2);
            return 8;
        }
        int ad3 = ad(i, bArr);
        int ad4 = ad(i + 4, bArr);
        int i5 = -957401312;
        while (i3 != 32) {
            ad4 -= (((ad3 << 4) + this.f24607e) ^ (ad3 + i5)) ^ ((ad3 >>> 5) + this.f24609e);
            ad3 -= (((ad4 << 4) + this.f24610e) ^ (ad4 + i5)) ^ ((ad4 >>> 5) + this.f24608e);
            i5 += 1640531527;
            i3++;
        }
        vip(ad3, i2, bArr2);
        vip(ad4, i2 + 4, bArr2);
        return 8;
    }
}
