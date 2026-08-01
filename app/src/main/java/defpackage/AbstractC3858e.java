package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3858e {
    public static final ThreadLocal ad = new ThreadLocal();

    public static AbstractC11092e ad() {
        ThreadLocal threadLocal = ad;
        AbstractC11092e abstractC11092e = (AbstractC11092e) threadLocal.get();
        if (abstractC11092e != null) {
            return abstractC11092e;
        }
        C14353e c14353e = new C14353e(Thread.currentThread());
        threadLocal.set(c14353e);
        return c14353e;
    }
}
