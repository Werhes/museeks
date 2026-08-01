package defpackage;

import java.security.spec.AlgorithmParameterSpec;

/* renamed from: eْٟٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13349e implements AlgorithmParameterSpec {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f26601e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f26602e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f26603e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f26604e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f26605e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f26606e;

    public C13349e(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, boolean z) {
        if (bArr != null) {
            byte[] bArr4 = new byte[bArr.length];
            this.f26605e = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        } else {
            this.f26605e = null;
        }
        if (bArr2 != null) {
            byte[] bArr5 = new byte[bArr2.length];
            this.f26603e = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        } else {
            this.f26603e = null;
        }
        this.f26602e = i;
        this.f26604e = i2;
        this.f26601e = AbstractC12442e.license(bArr3);
        this.f26606e = z;
    }
}
