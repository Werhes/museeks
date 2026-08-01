package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11062e implements Closeable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C10675e f21948e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C18511e f21949e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eَۧ] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r0;
        try {
            Class.forName("java.nio.file.Files");
            r0 = new Object();
        } catch (ClassNotFoundException unused) {
            r0 = new Object();
        }
        f21949e = r0;
        String str = C10675e.f21023e;
        f21948e = C10215e.license(System.getProperty("java.io.tmpdir"), false);
        new C17345e(C17345e.class.getClassLoader());
    }

    public final void Signature(C10675e c10675e) {
        C4300e license = AbstractC16342e.license(new license(this, c10675e, null, 0));
        while (license.hasNext()) {
            loadAd((C10675e) license.next(), false);
        }
    }

    public abstract InterfaceC0274e ad(C10675e c10675e);

    public abstract List ads(C10675e c10675e);

    public abstract void advert(C10675e c10675e);

    /* renamed from: break */
    public abstract InterfaceC0274e mo1914break(C10675e c10675e, boolean z);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final C15308e crashlytics(C10675e c10675e) {
        C15308e mo1917goto = mo1917goto(c10675e);
        if (mo1917goto != null) {
            return mo1917goto;
        }
        throw new FileNotFoundException("no such file: " + c10675e);
    }

    /* renamed from: extends */
    public abstract C0058e mo1916extends(C10675e c10675e);

    /* renamed from: goto */
    public abstract C15308e mo1917goto(C10675e c10675e);

    /* renamed from: implements */
    public abstract InterfaceC2537e mo1918implements(C10675e c10675e);

    public abstract List inmobi(C10675e c10675e);

    public final boolean isVip(C10675e c10675e) {
        return mo1917goto(c10675e) != null;
    }

    public abstract void license(C10675e c10675e, C10675e c10675e2);

    public abstract void loadAd(C10675e c10675e, boolean z);

    /* renamed from: protected */
    public abstract C0058e mo1919protected(C10675e c10675e);

    public final void purchase(C10675e c10675e) {
        C12718e c12718e = new C12718e();
        while (c10675e != null && !isVip(c10675e)) {
            c12718e.addFirst(c10675e);
            c10675e = c10675e.metrica();
        }
        Iterator<E> it = c12718e.iterator();
        while (it.hasNext()) {
            advert((C10675e) it.next());
        }
    }

    public InterfaceC9093e subs(C10675e c10675e) {
        return new C1356e(new appmetrica(c10675e, this, null));
    }
}
