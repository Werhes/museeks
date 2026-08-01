package defpackage;

/* renamed from: eٍؑۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0719e extends AbstractC9027e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f3013e;

    public C0719e(int i, byte[] bArr) {
        super(false);
        byte[] bArr2 = new byte[56];
        this.f3013e = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 56);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0719e(byte[] bArr) {
        this(0, bArr);
        if (bArr.length != 56) {
            throw new IllegalArgumentException("'buf' must have length 56");
        }
    }
}
