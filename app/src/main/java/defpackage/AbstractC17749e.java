package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17749e {
    public static final boolean ad;
    public static final boolean vip;

    static {
        Object c12763e;
        Object c12763e2;
        try {
            c12763e = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        if (c12763e instanceof C12763e) {
            c12763e = null;
        }
        String str = (String) c12763e;
        boolean z = false;
        ad = str != null && Boolean.parseBoolean(str);
        try {
            c12763e2 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th2) {
            c12763e2 = new C12763e(th2);
        }
        String str2 = (String) (c12763e2 instanceof C12763e ? null : c12763e2);
        if (str2 != null && Boolean.parseBoolean(str2)) {
            z = true;
        }
        vip = z;
    }
}
