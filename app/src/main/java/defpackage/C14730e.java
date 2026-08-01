package defpackage;

import java.security.spec.EncodedKeySpec;

/* renamed from: eٕٔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14730e extends EncodedKeySpec {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f29142e;

    public C14730e(byte[] bArr) {
        super(bArr);
        String str;
        byte b = bArr[0];
        if (b == 48) {
            str = "ASN.1";
        } else {
            if (b != 111) {
                throw new IllegalArgumentException("unknown byte encoding");
            }
            str = "OpenSSH";
        }
        this.f29142e = str;
    }

    @Override // java.security.spec.EncodedKeySpec
    public final String getFormat() {
        return this.f29142e;
    }
}
