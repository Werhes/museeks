package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: eۣٓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14333e extends InputStream {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InputStream f28356e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public applovin f28359e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Csuper f28360e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f28358e = true;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f28357e = 0;

    public C14333e(Csuper csuper) {
        this.f28360e = csuper;
    }

    public final applovin ad() {
        Csuper csuper = this.f28360e;
        int read = ((AbstractC9907e) csuper.f36469e).read();
        subs m4644goto = read < 0 ? null : csuper.m4644goto(read);
        if (m4644goto == null) {
            return null;
        }
        if (m4644goto instanceof applovin) {
            if (this.f28357e == 0) {
                return (applovin) m4644goto;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + m4644goto.getClass());
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f28356e == null) {
            if (this.f28358e) {
                applovin ad = ad();
                this.f28359e = ad;
                if (ad != null) {
                    this.f28358e = false;
                    this.f28356e = ad.startapp();
                }
            }
            return -1;
        }
        while (true) {
            int read = this.f28356e.read();
            if (read >= 0) {
                return read;
            }
            this.f28357e = this.f28359e.adcel();
            applovin ad2 = ad();
            this.f28359e = ad2;
            if (ad2 == null) {
                this.f28356e = null;
                return -1;
            }
            this.f28356e = ad2.startapp();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (this.f28356e == null) {
            if (!this.f28358e) {
                return -1;
            }
            applovin ad = ad();
            this.f28359e = ad;
            if (ad == null) {
                return -1;
            }
            this.f28358e = false;
            this.f28356e = ad.startapp();
        }
        while (true) {
            int read = this.f28356e.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.f28357e = this.f28359e.adcel();
                applovin ad2 = ad();
                this.f28359e = ad2;
                if (ad2 == null) {
                    this.f28356e = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f28356e = ad2.startapp();
            }
        }
    }
}
