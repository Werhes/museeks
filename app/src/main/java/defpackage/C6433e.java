package defpackage;

import j$.util.Objects;

/* renamed from: eؙٖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6433e implements InterfaceC11306e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f13318e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f13319e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f13320e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f13321e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f13322e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f13323e;

    public C6433e(InterfaceC2227e interfaceC2227e) {
        this(interfaceC2227e, (interfaceC2227e.isPro() * 8) / 2, null);
    }

    public C6433e(InterfaceC2227e interfaceC2227e, int i, C0136e c0136e) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.f13318e = new C8011e(interfaceC2227e);
        this.f13323e = c0136e;
        this.f13320e = i / 8;
        this.f13319e = new byte[interfaceC2227e.isPro()];
        this.f13321e = new byte[interfaceC2227e.isPro()];
        this.f13322e = 0;
    }

    public C6433e(C16975e c16975e, C16975e c16975e2, int i, int i2, C11816e c11816e, C11681e c11681e) {
        this.f13319e = c16975e;
        this.f13321e = c16975e2;
        this.f13322e = i;
        this.f13320e = i2;
        this.f13318e = c11816e;
        this.f13323e = c11681e;
    }

    public static boolean ad(C6433e c6433e) {
        return Objects.equals(((C16975e) c6433e.f13319e).loadAd, "audio/raw");
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = (byte[]) this.f13319e;
        byte[] bArr3 = (byte[]) this.f13321e;
        C8011e c8011e = (C8011e) this.f13318e;
        int isPro = c8011e.f16252e.isPro();
        InterfaceC14454e interfaceC14454e = (InterfaceC14454e) this.f13323e;
        if (interfaceC14454e == null) {
            while (true) {
                int i2 = this.f13322e;
                if (i2 >= isPro) {
                    break;
                }
                bArr3[i2] = 0;
                this.f13322e = i2 + 1;
            }
        } else {
            if (this.f13322e == isPro) {
                c8011e.tapsense(0, 0, bArr3, bArr2);
                this.f13322e = 0;
            }
            interfaceC14454e.loadAd(this.f13322e, bArr3);
        }
        c8011e.tapsense(0, 0, bArr3, bArr2);
        int i3 = this.f13320e;
        System.arraycopy(bArr2, 0, bArr, 0, i3);
        reset();
        return i3;
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        return ((C8011e) this.f13318e).getAlgorithmName();
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return this.f13320e;
    }

    @Override // defpackage.InterfaceC11306e
    public void init(InterfaceC3894e interfaceC3894e) {
        reset();
        ((C8011e) this.f13318e).init(true, interfaceC3894e);
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f13321e;
            if (i >= bArr.length) {
                this.f13322e = 0;
                ((C8011e) this.f13318e).reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte b) {
        int i = this.f13322e;
        byte[] bArr = (byte[]) this.f13321e;
        if (i == bArr.length) {
            ((C8011e) this.f13318e).tapsense(0, 0, bArr, (byte[]) this.f13319e);
            this.f13322e = 0;
        }
        int i2 = this.f13322e;
        this.f13322e = i2 + 1;
        bArr[i2] = b;
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = (byte[]) this.f13319e;
        byte[] bArr3 = (byte[]) this.f13321e;
        C8011e c8011e = (C8011e) this.f13318e;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int isPro = c8011e.f16252e.isPro();
        int i3 = this.f13322e;
        int i4 = isPro - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, bArr3, i3, i4);
            c8011e.tapsense(0, 0, bArr3, bArr2);
            this.f13322e = 0;
            i2 -= i4;
            i += i4;
            while (i2 > isPro) {
                c8011e.tapsense(i, 0, bArr, bArr2);
                i2 -= isPro;
                i += isPro;
            }
        }
        System.arraycopy(bArr, i, bArr3, this.f13322e, i2);
        this.f13322e += i2;
    }
}
