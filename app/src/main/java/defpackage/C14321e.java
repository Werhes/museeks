package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eُٓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14321e implements InterfaceC4243e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f28321e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public SecureRandom f28322e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f28323e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public AbstractC14548e f28324e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final BigInteger f28318e = BigInteger.valueOf(0);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final BigInteger f28320e = BigInteger.valueOf(1);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f28319e = BigInteger.valueOf(2);

    @Override // defpackage.InterfaceC4243e
    public final int getInputBlockSize() {
        return this.f28321e ? (this.f28323e - 1) / 8 : ((this.f28323e + 7) / 8) * 2;
    }

    @Override // defpackage.InterfaceC4243e
    public final int getOutputBlockSize() {
        return this.f28321e ? ((this.f28323e + 7) / 8) * 2 : (this.f28323e - 1) / 8;
    }

    @Override // defpackage.InterfaceC4243e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        SecureRandom vip;
        if (interfaceC3894e instanceof C12219e) {
            C12219e c12219e = (C12219e) interfaceC3894e;
            this.f28324e = (AbstractC14548e) c12219e.f24537e;
            vip = c12219e.f24538e;
        } else {
            this.f28324e = (AbstractC14548e) interfaceC3894e;
            vip = AbstractC9915e.vip();
        }
        this.f28322e = vip;
        this.f28321e = z;
        this.f28323e = this.f28324e.f28756e.f4438e.bitLength();
        if (z) {
            if (!(this.f28324e instanceof C1348e)) {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else if (!(this.f28324e instanceof C1457e)) {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
        AbstractC0259e.vip(this.f28324e.f28756e.f4438e);
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC4243e
    public final byte[] processBlock(byte[] bArr, int i, int i2) {
        BigInteger metrica;
        if (this.f28324e == null) {
            throw new IllegalStateException("ElGamal engine not initialised");
        }
        if (i2 > (this.f28321e ? (this.f28323e + 6) / 8 : getInputBlockSize())) {
            throw new RuntimeException("input too large for ElGamal cipher.\n");
        }
        AbstractC14548e abstractC14548e = this.f28324e;
        BigInteger bigInteger = abstractC14548e.f28756e.f4438e;
        if (abstractC14548e instanceof C1457e) {
            int i3 = i2 / 2;
            byte[] bArr2 = new byte[i3];
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            System.arraycopy(bArr, i + i3, bArr3, 0, i3);
            BigInteger mod = new BigInteger(1, bArr2).modPow(bigInteger.subtract(f28320e).subtract(((C1457e) this.f28324e).f4295e), bigInteger).multiply(new BigInteger(1, bArr3)).mod(bigInteger);
            BigInteger bigInteger2 = AbstractC5907e.ad;
            byte[] byteArray = mod.toByteArray();
            if (byteArray[0] != 0 || byteArray.length == 1) {
                return byteArray;
            }
            int length = byteArray.length - 1;
            byte[] bArr4 = new byte[length];
            System.arraycopy(byteArray, 1, bArr4, 0, length);
            return bArr4;
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr5 = new byte[i2];
            System.arraycopy(bArr, i, bArr5, 0, i2);
            bArr = bArr5;
        }
        BigInteger bigInteger3 = new BigInteger(1, bArr);
        if (bigInteger3.compareTo(bigInteger) >= 0) {
            throw new RuntimeException("input too large for ElGamal cipher.\n");
        }
        C1348e c1348e = (C1348e) this.f28324e;
        int bitLength = bigInteger.bitLength();
        while (true) {
            metrica = AbstractC5907e.metrica(bitLength, this.f28322e);
            if (!metrica.equals(f28318e) && metrica.compareTo(bigInteger.subtract(f28319e)) <= 0) {
                break;
            }
        }
        BigInteger modPow = this.f28324e.f28756e.f4439e.modPow(metrica, bigInteger);
        BigInteger mod2 = bigInteger3.multiply(c1348e.f4144e.modPow(metrica, bigInteger)).mod(bigInteger);
        byte[] byteArray2 = modPow.toByteArray();
        byte[] byteArray3 = mod2.toByteArray();
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr6 = new byte[outputBlockSize];
        int i4 = outputBlockSize / 2;
        if (byteArray2.length > i4) {
            System.arraycopy(byteArray2, 1, bArr6, i4 - (byteArray2.length - 1), byteArray2.length - 1);
        } else {
            System.arraycopy(byteArray2, 0, bArr6, i4 - byteArray2.length, byteArray2.length);
        }
        if (byteArray3.length > i4) {
            System.arraycopy(byteArray3, 1, bArr6, outputBlockSize - (byteArray3.length - 1), byteArray3.length - 1);
            return bArr6;
        }
        System.arraycopy(byteArray3, 0, bArr6, outputBlockSize - byteArray3.length, byteArray3.length);
        return bArr6;
    }
}
