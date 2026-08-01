package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؐ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4560e {
    public static final String[] ad = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final C8821e vip;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [eٌٜۧ] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    static {
        ?? obj;
        int i = 0;
        while (true) {
            if (i >= 2) {
                obj = new Object();
                break;
            }
            obj = 0;
            try {
                obj = (C8821e) Class.forName(ad[i]).asSubclass(C8821e.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (obj != 0) {
                break;
            } else {
                i++;
            }
        }
        vip = obj;
    }
}
