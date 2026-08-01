package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5476e implements InterfaceC2537e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f11757e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AutoCloseable f11758e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11759e;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.AutoCloseable] */
    public C5476e(InterfaceC6079e interfaceC6079e) {
        this.f11759e = 1;
        this.f11757e = interfaceC6079e;
        this.f11758e = new Object();
    }

    public C5476e(InputStream inputStream, C1930e c1930e) {
        this.f11759e = 0;
        this.f11758e = inputStream;
        this.f11757e = c1930e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f11759e) {
            case 0:
                ((InputStream) this.f11758e).close();
                return;
            default:
                ((InterfaceC6079e) this.f11757e).close();
                return;
        }
    }

    @Override // defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        switch (this.f11759e) {
            case 0:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount < 0: ").toString());
                }
                try {
                    ((C1930e) this.f11757e).purchase();
                    C16592e m4130implements = c16151e.m4130implements(1);
                    int read = ((InputStream) this.f11758e).read(m4130implements.ad, m4130implements.metrica, (int) Math.min(j, 8192 - m4130implements.metrica));
                    if (read == -1) {
                        if (m4130implements.vip == m4130implements.metrica) {
                            c16151e.f31732e = m4130implements.ad();
                            AbstractC11279e.ad(m4130implements);
                        }
                        return -1L;
                    }
                    m4130implements.metrica += read;
                    long j2 = read;
                    c16151e.f31731e += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (AbstractC17793e.ad(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            default:
                C12402e c12402e = (C12402e) this.f11758e;
                long mo805this = ((InterfaceC6079e) this.f11757e).mo805this(c12402e, j);
                if (mo805this == -1) {
                    return -1L;
                }
                long j3 = mo805this;
                while (j3 > 0) {
                    if (c12402e.yandex()) {
                        throw new IllegalArgumentException("Buffer is empty");
                    }
                    C0378e c0378e = c12402e.f24834e;
                    byte[] bArr = c0378e.ad;
                    int i = c0378e.vip;
                    int i2 = c0378e.metrica - i;
                    c16151e.write(bArr, i, i2);
                    if (i2 != 0) {
                        if (i2 < 0) {
                            throw new IllegalStateException("Returned negative read bytes count");
                        }
                        if (i2 > c0378e.vip()) {
                            throw new IllegalStateException("Returned too many bytes");
                        }
                        c12402e.skip(i2);
                    }
                    j3 -= i2;
                }
                return mo805this;
        }
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        switch (this.f11759e) {
            case 0:
                return (C1930e) this.f11757e;
            default:
                return C1930e.license;
        }
    }

    public String toString() {
        switch (this.f11759e) {
            case 0:
                return "source(" + ((InputStream) this.f11758e) + ')';
            default:
                return super.toString();
        }
    }
}
