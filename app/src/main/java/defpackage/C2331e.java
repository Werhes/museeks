package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2331e implements InterfaceC6079e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f5849e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5850e;

    public /* synthetic */ C2331e(int i, Object obj) {
        this.f5850e = i;
        this.f5849e = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f5850e) {
            case 0:
                AbstractC2223e.ad((InterfaceC13033e) this.f5849e);
                return;
            default:
                ((InputStream) this.f5849e).close();
                return;
        }
    }

    @Override // defpackage.InterfaceC6079e
    /* renamed from: this, reason: not valid java name */
    public final long mo805this(C12402e c12402e, long j) {
        switch (this.f5850e) {
            case 0:
                InterfaceC13033e interfaceC13033e = (InterfaceC13033e) this.f5849e;
                if (interfaceC13033e.billing().yandex()) {
                    AbstractC5336e.yandex(C2693e.f6576e, new C15238e(this, null, 10));
                }
                if (interfaceC13033e.billing().yandex()) {
                    return -1L;
                }
                return interfaceC13033e.billing().mo805this(c12402e, j);
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(AbstractC1634e.mopub(j, "byteCount (", ") < 0").toString());
                }
                boolean z = false;
                try {
                    C0378e subs = c12402e.subs(1);
                    long read = ((InputStream) this.f5849e).read(subs.ad, subs.metrica, (int) Math.min(j, r4.length - r5));
                    int i = read == -1 ? 0 : (int) read;
                    if (i == 1) {
                        subs.metrica += i;
                        c12402e.f24832e += i;
                    } else {
                        if (i < 0 || i > subs.ad()) {
                            throw new IllegalStateException(("Invalid number of bytes written: " + i + ". Should be in 0.." + subs.ad()).toString());
                        }
                        if (i != 0) {
                            subs.metrica += i;
                            c12402e.f24832e += i;
                        } else if (AbstractC10432e.license(subs)) {
                            c12402e.Signature();
                        }
                    }
                    return read;
                } catch (AssertionError e) {
                    if (e.getCause() != null) {
                        String message = e.getMessage();
                        if (message != null ? AbstractC5304e.inmobi(message, "getsockname failed", false) : false) {
                            z = true;
                        }
                    }
                    if (z) {
                        throw new IOException(e);
                    }
                    throw e;
                }
        }
    }

    public String toString() {
        switch (this.f5850e) {
            case 1:
                return "RawSource(" + ((InputStream) this.f5849e) + ')';
            default:
                return super.toString();
        }
    }
}
