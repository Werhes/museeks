package defpackage;

import org.conscrypt.PSKKeyManager;

/* renamed from: eُٗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11035e extends AbstractC0821e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f21858e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f21859e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final byte[] f21860e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f21861e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final byte[] f21862e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final byte[] f21863e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f21864e;

    public C11035e(C0838e c0838e, byte[] bArr, C17060e c17060e) {
        super((Object) c0838e, true);
        int i;
        char c;
        int i2;
        int i3 = c0838e.ad;
        new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        int i4 = 96;
        if (i3 != 2) {
            i = 5;
            if (i3 == 3) {
                i2 = 6;
                i4 = 128;
            } else {
                if (i3 != 5) {
                    throw new IllegalArgumentException(AbstractC1634e.smaato("The mode ", i3, "is not supported by Crystals Dilithium!"));
                }
                i2 = 8;
                i = 7;
            }
            c = 0;
        } else {
            i = 4;
            c = 0;
            i2 = 4;
        }
        new C16253e(128);
        new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        if (c != 0 && c != 0) {
            throw new RuntimeException("Wrong Dilithium Gamma1!");
        }
        this.f21859e = AbstractC12442e.admob(0, 32, bArr);
        this.f21861e = AbstractC12442e.admob(32, 64, bArr);
        this.f21858e = AbstractC12442e.admob(64, 128, bArr);
        int i5 = (i * i4) + 128;
        this.f21864e = AbstractC12442e.admob(128, i5, bArr);
        int i6 = (i4 * i2) + i5;
        this.f21863e = AbstractC12442e.admob(i5, i6, bArr);
        this.f21860e = AbstractC12442e.admob(i6, (i2 * 416) + i6, bArr);
        if (c17060e != null) {
            this.f21862e = AbstractC12442e.license(c17060e.f33399e);
        } else {
            this.f21862e = null;
        }
    }

    public C11035e(C0838e c0838e, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super((Object) c0838e, true);
        this.f21859e = AbstractC12442e.license(bArr);
        this.f21861e = AbstractC12442e.license(bArr2);
        this.f21858e = AbstractC12442e.license(bArr3);
        this.f21864e = AbstractC12442e.license(bArr4);
        this.f21863e = AbstractC12442e.license(bArr5);
        this.f21860e = AbstractC12442e.license(bArr6);
        this.f21862e = AbstractC12442e.license(bArr7);
    }

    public final byte[] getEncoded() {
        return AbstractC12442e.smaato(new byte[][]{this.f21859e, this.f21861e, this.f21858e, this.f21864e, this.f21863e, this.f21860e});
    }
}
