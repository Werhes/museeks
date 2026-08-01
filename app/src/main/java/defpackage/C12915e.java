package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۧۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12915e implements InterfaceC7998e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f25779e;

    static {
        new AtomicInteger();
    }

    @Override // defpackage.InterfaceC7998e
    public final Object ad(C11467e c11467e) {
        if (this.f25779e) {
            if (((AbstractC17475e) c11467e.f23070e).isEmpty()) {
                return ((InterfaceC1312e) c11467e.f23072e).metrica((Uri) c11467e.f23071e);
            }
            throw new IOException("Short circuit would skip transforms.");
        }
        Closeable isPro = AbstractC17181e.isPro(c11467e);
        try {
            if (!(isPro instanceof InterfaceC0489e)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File ad = ((InterfaceC0489e) isPro).ad();
            if (isPro != null) {
                isPro.close();
            }
            return ad;
        } catch (Throwable th) {
            if (isPro != null) {
                try {
                    isPro.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
