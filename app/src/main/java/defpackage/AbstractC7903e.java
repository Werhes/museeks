package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7903e {
    public static final C12816e ad;
    public static final C11709e vip;

    static {
        C12816e c12816e = new C12816e("kotlin.jvm.JvmField");
        ad = c12816e;
        C9616e.Signature(c12816e);
        C9616e.Signature(new C12816e("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        vip = C9616e.advert("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String ad(String str) {
        if (vip(str)) {
            return str;
        }
        return "get" + AbstractC6022e.metrica(str);
    }

    public static final boolean vip(String str) {
        if (AbstractC6507e.pro(str, "is", false) && str.length() != 2) {
            char charAt = str.charAt(2);
            if (AbstractC7890e.yandex(97, charAt) > 0 || AbstractC7890e.yandex(charAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
