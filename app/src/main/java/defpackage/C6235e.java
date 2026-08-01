package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: eؘؙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6235e extends InputStream {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public InputStream f13035e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f13036e = true;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Csuper f13037e;

    public C6235e(Csuper csuper) {
        this.f13037e = csuper;
    }

    public final Cbreak ad() {
        Csuper csuper = this.f13037e;
        int read = ((AbstractC9907e) csuper.f36469e).read();
        subs m4644goto = read < 0 ? null : csuper.m4644goto(read);
        if (m4644goto == null) {
            return null;
        }
        if (m4644goto instanceof Cbreak) {
            return (Cbreak) m4644goto;
        }
        throw new IOException("unknown object encountered: " + m4644goto.getClass());
    }

    @Override // java.io.InputStream
    public final int read() {
        Cbreak ad;
        if (this.f13035e == null) {
            if (!this.f13036e || (ad = ad()) == null) {
                return -1;
            }
            this.f13036e = false;
            this.f13035e = ad.appmetrica();
        }
        while (true) {
            int read = this.f13035e.read();
            if (read >= 0) {
                return read;
            }
            Cbreak ad2 = ad();
            if (ad2 == null) {
                this.f13035e = null;
                return -1;
            }
            this.f13035e = ad2.appmetrica();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        Cbreak ad;
        int i3 = 0;
        if (this.f13035e == null) {
            if (!this.f13036e || (ad = ad()) == null) {
                return -1;
            }
            this.f13036e = false;
            this.f13035e = ad.appmetrica();
        }
        while (true) {
            int read = this.f13035e.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                Cbreak ad2 = ad();
                if (ad2 == null) {
                    this.f13035e = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f13035e = ad2.appmetrica();
            }
        }
    }
}
