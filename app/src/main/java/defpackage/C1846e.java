package defpackage;

/* renamed from: eَٖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1846e implements InterfaceC2227e, InterfaceC2868e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final byte[] f4939e = {Byte.MIN_VALUE, 27, 54, 108, -40, -85, 77, -102, 47, 94, -68, 99, -58, -105, 53, 106, -44};

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f4940e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f4941e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f4942e;

    public C1846e() {
        this.f4940e = new int[4];
        this.f4942e = false;
    }

    public C1846e(AbstractC9932e abstractC9932e, boolean z, boolean z2) {
        this.f4940e = abstractC9932e;
        this.f4942e = z;
        this.f4941e = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eؘٙٗ, eؙٓۧ] */
    /* JADX WARN: Type inference failed for: r4v4, types: [eؘٙٗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.InterfaceC2868e
    public InterfaceC6396e appmetrica(InterfaceC6396e interfaceC6396e) {
        AbstractC9932e abstractC9932e = (AbstractC9932e) this.f4940e;
        ?? r4 = interfaceC6396e instanceof C5713e ? (C5713e) interfaceC6396e : 0;
        if (r4 == 0) {
            r4 = new Object();
            r4.ad = false;
            r4.vip = false;
            r4.metrica = false;
        }
        if (!r4.ad) {
            if (!r4.vip) {
                if (!this.f4942e && !abstractC9932e.subscription()) {
                    r4.ad = true;
                    return r4;
                }
                r4.vip = true;
            }
            if (this.f4941e && !r4.metrica) {
                if (!abstractC9932e.remoteconfig()) {
                    r4.ad = true;
                    return r4;
                }
                r4.metrica = true;
            }
        }
        return r4;
    }

    @Override // defpackage.InterfaceC2227e
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // defpackage.InterfaceC2227e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        int[] iArr = (int[]) this.f4940e;
        if (!(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to Noekeon init - ", interfaceC3894e));
        }
        byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key length not 128 bits.");
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            iArr[i2] = AbstractC3628e.metrica(i, bArr);
            i += 4;
        }
        if (!z) {
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            int i7 = i3 ^ i5;
            int rotateLeft = i7 ^ (Integer.rotateLeft(i7, 8) ^ Integer.rotateLeft(i7, 24));
            int i8 = i4 ^ i6;
            int rotateLeft2 = (Integer.rotateLeft(i8, 8) ^ Integer.rotateLeft(i8, 24)) ^ i8;
            iArr[0] = i3 ^ rotateLeft2;
            iArr[1] = i4 ^ rotateLeft;
            iArr[2] = i5 ^ rotateLeft2;
            iArr[3] = i6 ^ rotateLeft;
        }
        this.f4941e = z;
        this.f4942e = true;
        if (interfaceC3894e instanceof EnumC0300e) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC2227e
    public int isPro() {
        return 16;
    }

    @Override // defpackage.InterfaceC2227e
    public void reset() {
    }

    @Override // defpackage.InterfaceC2227e
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int[] iArr = (int[]) this.f4940e;
        if (!this.f4942e) {
            throw new IllegalStateException("Noekeon not initialised");
        }
        if (i > bArr.length - 16) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 > bArr2.length - 16) {
            throw new RuntimeException("output buffer too short");
        }
        boolean z = this.f4941e;
        byte[] bArr3 = f4939e;
        int i3 = 0;
        int i4 = 24;
        if (z) {
            int metrica = AbstractC3628e.metrica(i, bArr);
            int metrica2 = AbstractC3628e.metrica(i + 4, bArr);
            int metrica3 = AbstractC3628e.metrica(i + 8, bArr);
            int metrica4 = AbstractC3628e.metrica(i + 12, bArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            while (true) {
                int i9 = (bArr3[i3] & 255) ^ metrica;
                int i10 = i9 ^ metrica3;
                int rotateLeft = i10 ^ (Integer.rotateLeft(i10, 8) ^ Integer.rotateLeft(i10, 24));
                int i11 = metrica2 ^ i6;
                int i12 = metrica3 ^ i7;
                int i13 = metrica4 ^ i8;
                int i14 = i11 ^ i13;
                int rotateLeft2 = i14 ^ (Integer.rotateLeft(i14, 8) ^ Integer.rotateLeft(i14, 24));
                int i15 = (i9 ^ i5) ^ rotateLeft2;
                int i16 = i11 ^ rotateLeft;
                int i17 = i12 ^ rotateLeft2;
                int i18 = i13 ^ rotateLeft;
                int i19 = i3 + 1;
                if (i19 > 16) {
                    AbstractC3628e.billing(i15, i2, bArr2);
                    AbstractC3628e.billing(i16, i2 + 4, bArr2);
                    AbstractC3628e.billing(i17, i2 + 8, bArr2);
                    AbstractC3628e.billing(i18, i2 + 12, bArr2);
                    return 16;
                }
                int rotateLeft3 = Integer.rotateLeft(i16, 1);
                int rotateLeft4 = Integer.rotateLeft(i17, 5);
                int rotateLeft5 = Integer.rotateLeft(i18, 2);
                int i20 = rotateLeft3 ^ (rotateLeft5 | rotateLeft4);
                int i21 = ~i20;
                int i22 = i15 ^ (rotateLeft4 & i21);
                int i23 = (rotateLeft4 ^ (i21 ^ rotateLeft5)) ^ i22;
                int i24 = i20 ^ (i22 | i23);
                int i25 = rotateLeft5 ^ (i23 & i24);
                int rotateLeft6 = Integer.rotateLeft(i24, 31);
                i3 = i19;
                metrica3 = Integer.rotateLeft(i23, 27);
                metrica2 = rotateLeft6;
                metrica = i25;
                metrica4 = Integer.rotateLeft(i22, 30);
            }
        } else {
            int metrica5 = AbstractC3628e.metrica(i, bArr);
            int metrica6 = AbstractC3628e.metrica(i + 4, bArr);
            int metrica7 = AbstractC3628e.metrica(i + 8, bArr);
            int metrica8 = AbstractC3628e.metrica(i + 12, bArr);
            int i26 = iArr[0];
            int i27 = iArr[1];
            int i28 = iArr[2];
            int i29 = iArr[3];
            int i30 = 16;
            while (true) {
                int i31 = metrica5 ^ metrica7;
                int rotateLeft7 = i31 ^ (Integer.rotateLeft(i31, 8) ^ Integer.rotateLeft(i31, i4));
                int i32 = metrica6 ^ i27;
                int i33 = metrica8 ^ i29;
                int i34 = i32 ^ i33;
                int rotateLeft8 = i34 ^ (Integer.rotateLeft(i34, 8) ^ Integer.rotateLeft(i34, i4));
                int i35 = i32 ^ rotateLeft7;
                int i36 = (metrica7 ^ i28) ^ rotateLeft8;
                int i37 = i33 ^ rotateLeft7;
                int i38 = ((metrica5 ^ i26) ^ rotateLeft8) ^ (bArr3[i30] & 255);
                i30--;
                if (i30 < 0) {
                    AbstractC3628e.billing(i38, i2, bArr2);
                    AbstractC3628e.billing(i35, i2 + 4, bArr2);
                    AbstractC3628e.billing(i36, i2 + 8, bArr2);
                    AbstractC3628e.billing(i37, i2 + 12, bArr2);
                    return 16;
                }
                int rotateLeft9 = Integer.rotateLeft(i35, 1);
                int rotateLeft10 = Integer.rotateLeft(i36, 5);
                int rotateLeft11 = Integer.rotateLeft(i37, 2);
                int i39 = rotateLeft9 ^ (rotateLeft11 | rotateLeft10);
                int i40 = ~i39;
                int i41 = i38 ^ (rotateLeft10 & i40);
                int i42 = (rotateLeft10 ^ (i40 ^ rotateLeft11)) ^ i41;
                int i43 = i39 ^ (i41 | i42);
                int i44 = rotateLeft11 ^ (i42 & i43);
                int rotateLeft12 = Integer.rotateLeft(i43, 31);
                int rotateLeft13 = Integer.rotateLeft(i42, 27);
                int rotateLeft14 = Integer.rotateLeft(i41, 30);
                metrica5 = i44;
                metrica8 = rotateLeft14;
                i4 = 24;
                metrica7 = rotateLeft13;
                metrica6 = rotateLeft12;
            }
        }
    }
}
