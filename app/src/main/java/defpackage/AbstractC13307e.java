package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13307e extends AbstractC6959e implements ListenableFuture {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final boolean f26535e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final AbstractC0421e f26536e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public volatile C9503e f26539e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public volatile Object f26540e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public volatile C9563e f26541e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final Object f26538e = new Object();

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C8209e f26537e = new C8209e(2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [eًٜؑ] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    static {
        boolean z;
        Object obj;
        Throwable th;
        Throwable th2;
        ?? r0;
        Object obj2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f26535e = z;
        String property = System.getProperty("java.runtime.name", BuildConfig.FLAVOR);
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                obj2 = new Object();
            } catch (Error | Exception e) {
                try {
                    obj = new Object();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    obj = new Object();
                }
                th = th3;
                th2 = e;
                r0 = obj;
            }
        } else {
            try {
                obj2 = new Object();
            } catch (NoClassDefFoundError unused2) {
                obj2 = new Object();
            }
        }
        th = null;
        th2 = null;
        r0 = obj2;
        f26536e = r0;
        if (th != null) {
            C8209e c8209e = f26537e;
            Logger metrica = c8209e.metrica();
            Level level = Level.SEVERE;
            metrica.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            c8209e.metrica().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void advert(C9503e c9503e) {
        c9503e.ad = null;
        while (true) {
            C9503e c9503e2 = this.f26539e;
            if (c9503e2 != C9503e.metrica) {
                C9503e c9503e3 = null;
                while (c9503e2 != null) {
                    C9503e c9503e4 = c9503e2.vip;
                    if (c9503e2.ad != null) {
                        c9503e3 = c9503e2;
                    } else if (c9503e3 != null) {
                        c9503e3.vip = c9503e4;
                        if (c9503e3.ad == null) {
                            break;
                        }
                    } else if (!f26536e.advert(this, c9503e2, c9503e4)) {
                        break;
                    }
                    c9503e2 = c9503e4;
                }
                return;
            }
            return;
        }
    }
}
