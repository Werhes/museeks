package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eٖٟۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16410e implements InterfaceC8251e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final BigInteger f32224e = BigInteger.valueOf(0);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public SecureRandom f32225e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public BigInteger f32226e;

    @Override // defpackage.InterfaceC8251e
    public final boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC8251e
    public final BigInteger billing() {
        int bitLength = this.f32226e.bitLength();
        while (true) {
            BigInteger metrica = AbstractC5907e.metrica(bitLength, this.f32225e);
            if (!metrica.equals(f32224e) && metrica.compareTo(this.f32226e) < 0) {
                return metrica;
            }
        }
    }

    @Override // defpackage.InterfaceC8251e
    /* renamed from: interface */
    public final void mo2393interface(BigInteger bigInteger, SecureRandom secureRandom) {
        this.f32226e = bigInteger;
        this.f32225e = secureRandom;
    }

    @Override // defpackage.InterfaceC8251e
    /* renamed from: this */
    public final void mo2394this(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }
}
