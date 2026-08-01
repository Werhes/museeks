package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eٔۥٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15082e implements Key, PrivateKey {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Cfinal f29863e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C0901e f29864e;

    public final boolean equals(Object obj) {
        if (obj instanceof C15082e) {
            return Arrays.equals(AbstractC12442e.yandex(this.f29864e.f3302e), AbstractC12442e.yandex(((C15082e) obj).f29864e.f3302e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1358e.license(this.f29864e, this.f29863e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        short[] yandex = AbstractC12442e.yandex(this.f29864e.f3302e);
        if (yandex == null) {
            return 0;
        }
        int length = yandex.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (yandex[length] & 255);
        }
    }
}
