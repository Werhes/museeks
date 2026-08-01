package defpackage;

/* renamed from: eِۙۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11963e extends AbstractC9027e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f23938e;

    public C11963e(int i, byte[] bArr) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.f23938e = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11963e(byte[] bArr) {
        this(0, bArr);
        if (bArr.length != 32) {
            throw new IllegalArgumentException("'buf' must have length 32");
        }
    }
}
