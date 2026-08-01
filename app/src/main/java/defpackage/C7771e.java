package defpackage;

/* renamed from: eًؘۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7771e extends AbstractC2206e implements InterfaceC2227e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f15750e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int[] f15752e = null;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int[] f15753e = null;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int[] f15751e = null;

    public C7771e() {
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        return "DESede";
    }

    @Override // defpackage.InterfaceC2227e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        if (!(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to DESede init - ", interfaceC3894e));
        }
        byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
        if (bArr.length != 24 && bArr.length != 16) {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.f15750e = z;
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, 8);
        this.f15752e = license(z, bArr2);
        byte[] bArr3 = new byte[8];
        System.arraycopy(bArr, 8, bArr3, 0, 8);
        this.f15753e = license(!z, bArr3);
        if (bArr.length == 24) {
            byte[] bArr4 = new byte[8];
            System.arraycopy(bArr, 16, bArr4, 0, 8);
            this.f15751e = license(z, bArr4);
        } else {
            this.f15751e = this.f15752e;
        }
        if (interfaceC3894e instanceof EnumC0300e) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC2227e
    public final int isPro() {
        return 8;
    }

    @Override // defpackage.InterfaceC2227e
    public final void reset() {
    }

    @Override // defpackage.InterfaceC2227e
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f15752e;
        if (iArr == null) {
            throw new IllegalStateException("DESede engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        byte[] bArr3 = new byte[8];
        if (this.f15750e) {
            metrica(iArr, bArr, i, bArr3, 0);
            metrica(this.f15753e, bArr3, 0, bArr3, 0);
            metrica(this.f15751e, bArr3, 0, bArr2, i2);
            return 8;
        }
        metrica(this.f15751e, bArr, i, bArr3, 0);
        metrica(this.f15753e, bArr3, 0, bArr3, 0);
        metrica(this.f15752e, bArr3, 0, bArr2, i2);
        return 8;
    }
}
