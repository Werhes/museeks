package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: eؑؑؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0016e implements InterfaceC4243e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final BigInteger f1152e = BigInteger.valueOf(1);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public SecureRandom f1153e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C7362e f1154e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16722e f1155e = new C16722e(9, false);

    @Override // defpackage.InterfaceC4243e
    public final int getInputBlockSize() {
        return this.f1155e.yandex();
    }

    @Override // defpackage.InterfaceC4243e
    public final int getOutputBlockSize() {
        return this.f1155e.startapp();
    }

    @Override // defpackage.InterfaceC4243e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        SecureRandom secureRandom;
        InterfaceC3894e interfaceC3894e2;
        if (interfaceC3894e instanceof C12219e) {
            C12219e c12219e = (C12219e) interfaceC3894e;
            secureRandom = c12219e.f24538e;
            interfaceC3894e = c12219e.f24537e;
        } else {
            secureRandom = null;
        }
        boolean z2 = interfaceC3894e instanceof C12219e;
        C16722e c16722e = this.f1155e;
        if (z2) {
            c16722e.getClass();
            interfaceC3894e2 = ((C12219e) interfaceC3894e).f24537e;
        } else {
            interfaceC3894e2 = interfaceC3894e;
        }
        c16722e.f32781e = z;
        C7362e c7362e = (C7362e) interfaceC3894e2;
        c16722e.f32780e = c7362e;
        AbstractC0259e.vip(c7362e.f15093e);
        boolean z3 = ((C7362e) c16722e.f32780e).f18083e;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
        C7362e c7362e2 = (C7362e) interfaceC3894e;
        this.f1154e = c7362e2;
        this.f1153e = c7362e2 instanceof C16043e ? secureRandom == null ? AbstractC9915e.vip() : secureRandom : null;
    }

    @Override // defpackage.InterfaceC4243e
    public final byte[] processBlock(byte[] bArr, int i, int i2) {
        BigInteger tapsense;
        byte[] bArr2;
        C16043e c16043e;
        BigInteger bigInteger;
        if (this.f1154e == null) {
            throw new IllegalStateException("RSA engine not initialised");
        }
        C16722e c16722e = this.f1155e;
        if (i2 > c16722e.yandex() + 1) {
            throw new RuntimeException("input too large for RSA cipher.");
        }
        if (i2 == c16722e.yandex() + 1 && !c16722e.f32781e) {
            throw new RuntimeException("input too large for RSA cipher.");
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr3 = new byte[i2];
            System.arraycopy(bArr, i, bArr3, 0, i2);
            bArr = bArr3;
        }
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        if (bigInteger2.compareTo(((C7362e) c16722e.f32780e).f15093e) >= 0) {
            throw new RuntimeException("input too large for RSA cipher.");
        }
        C7362e c7362e = this.f1154e;
        if (!(c7362e instanceof C16043e) || (bigInteger = (c16043e = (C16043e) c7362e).f31606e) == null) {
            tapsense = c16722e.tapsense(bigInteger2);
        } else {
            BigInteger bigInteger3 = c16043e.f15093e;
            BigInteger bigInteger4 = f1152e;
            BigInteger license = AbstractC5907e.license(bigInteger4, bigInteger3.subtract(bigInteger4), this.f1153e);
            tapsense = AbstractC5907e.startapp(bigInteger3, license).multiply(c16722e.tapsense(license.modPow(bigInteger, bigInteger3).multiply(bigInteger2).mod(bigInteger3))).mod(bigInteger3);
        }
        c16722e.getClass();
        byte[] byteArray = tapsense.toByteArray();
        if (!c16722e.f32781e) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                bArr2 = new byte[length];
                System.arraycopy(byteArray, 1, bArr2, 0, length);
            } else {
                int length2 = byteArray.length;
                bArr2 = new byte[length2];
                System.arraycopy(byteArray, 0, bArr2, 0, length2);
            }
            Arrays.fill(byteArray, (byte) 0);
            return bArr2;
        }
        if (byteArray[0] == 0 && byteArray.length > c16722e.startapp()) {
            int length3 = byteArray.length - 1;
            byte[] bArr4 = new byte[length3];
            System.arraycopy(byteArray, 1, bArr4, 0, length3);
            return bArr4;
        }
        if (byteArray.length >= c16722e.startapp()) {
            return byteArray;
        }
        int startapp = c16722e.startapp();
        byte[] bArr5 = new byte[startapp];
        System.arraycopy(byteArray, 0, bArr5, startapp - byteArray.length, byteArray.length);
        return bArr5;
    }
}
