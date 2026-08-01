package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۢۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12834e implements Closeable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C2599e f25655e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؗٔۙ, eِٖۢ, java.lang.Object] */
    static {
        ?? obj = new Object();
        C0193e c0193e = C0193e.f1409e;
        c0193e.pro(obj, c0193e.license());
        f25655e = new C2599e(null, c0193e.f1412e.length, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final byte[] ad() {
        long license = license();
        if (license > 2147483647L) {
            throw new IOException(AbstractC0869e.isVip(license, "Cannot buffer entire body for content length: "));
        }
        InterfaceC4895e mo1012e = mo1012e();
        byte[] th = null;
        try {
            byte[] mo1688interface = mo1012e.mo1688interface();
            try {
                mo1012e.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = mo1688interface;
        } catch (Throwable th3) {
            th = th3;
            if (mo1012e != null) {
                try {
                    mo1012e.close();
                } catch (Throwable th4) {
                    AbstractC13362e.license(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (license == -1 || license == length) {
            return th;
        }
        throw new IOException("Content-Length (" + license + ") and stream length (" + length + ") disagree");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final String advert() {
        Charset charset;
        InterfaceC4895e mo1012e = mo1012e();
        String th = null;
        try {
            C14133e purchase = purchase();
            if (purchase == null || (charset = C14133e.ad(purchase)) == null) {
                charset = AbstractC5508e.ad;
            }
            String mo1686import = mo1012e.mo1686import(AbstractC16286e.purchase(mo1012e, charset));
            try {
                mo1012e.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = mo1686import;
        } catch (Throwable th3) {
            th = th3;
            if (mo1012e != null) {
                try {
                    mo1012e.close();
                } catch (Throwable th4) {
                    AbstractC13362e.license(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC10220e.vip(mo1012e());
    }

    /* renamed from: eؘؕۥ */
    public abstract InterfaceC4895e mo1012e();

    public abstract long license();

    public abstract C14133e purchase();
}
