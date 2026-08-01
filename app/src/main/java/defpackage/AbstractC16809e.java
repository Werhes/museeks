package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16809e {
    public static final int ad;

    static {
        Object c12763e;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            c12763e = property != null ? AbstractC6507e.signatures(property) : null;
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        Integer num = (Integer) (c12763e instanceof C12763e ? null : c12763e);
        ad = num != null ? num.intValue() : 2097152;
    }
}
