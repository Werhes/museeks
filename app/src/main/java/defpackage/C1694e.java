package defpackage;

import java.security.SecureRandom;

/* renamed from: eٌؓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1694e extends AbstractC9027e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C5249e f4624e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f4625e;

    public C1694e(int i, byte[] bArr) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.f4625e = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 32);
    }

    public C1694e(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.f4625e = bArr;
        if (bArr.length != 32) {
            throw new IllegalArgumentException("k");
        }
        secureRandom.nextBytes(bArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1694e(byte[] bArr) {
        this(0, bArr);
        if (bArr.length != 32) {
            throw new IllegalArgumentException("'buf' must have length 32");
        }
    }

    public final C5249e ad() {
        C5249e c5249e;
        synchronized (this.f4625e) {
            try {
                if (this.f4624e == null) {
                    this.f4624e = new C5249e(AbstractC6286e.license(this.f4625e));
                }
                c5249e = this.f4624e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5249e;
    }
}
