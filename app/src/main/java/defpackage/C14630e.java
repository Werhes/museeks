package defpackage;

import java.security.spec.EncodedKeySpec;

/* renamed from: eٍٔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14630e extends EncodedKeySpec {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final String[] f28866e = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f28867e;

    public C14630e(byte[] bArr) {
        super(bArr);
        int i = (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) + 4;
        if (i >= bArr.length) {
            throw new IllegalArgumentException("invalid public key blob: type field longer than blob");
        }
        String ad = AbstractC1433e.ad(AbstractC12442e.admob(4, i, bArr));
        this.f28867e = ad;
        if (ad.startsWith("ecdsa")) {
            return;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (f28866e[i2].equals(this.f28867e)) {
                return;
            }
        }
        throw new IllegalArgumentException("unrecognised public key type " + this.f28867e);
    }

    @Override // java.security.spec.EncodedKeySpec
    public final String getFormat() {
        return "OpenSSH";
    }
}
