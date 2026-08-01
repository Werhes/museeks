package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: eؕۤۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3732e implements applovin {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f8313e = 0;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9482e f8314e;

    public C3732e(C9482e c9482e) {
        this.f8314e = c9482e;
    }

    @Override // defpackage.applovin
    public final int adcel() {
        return this.f8313e;
    }

    @Override // defpackage.InterfaceC5145e
    public final Cdefault advert() {
        return isPro.subs(this.f8314e.license());
    }

    @Override // defpackage.subs
    public final Cdefault billing() {
        try {
            return advert();
        } catch (IOException e) {
            throw new Cabstract(AbstractC8703e.admob(e, new StringBuilder("IOException converting stream to byte array: ")), e, 0);
        }
    }

    @Override // defpackage.applovin
    public final InputStream startapp() {
        C9482e c9482e = this.f8314e;
        int i = c9482e.f18832e;
        if (i < 1) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int read = c9482e.read();
        this.f8313e = read;
        if (read > 0) {
            if (i < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (read > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
        }
        return c9482e;
    }
}
