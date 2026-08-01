package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;

/* renamed from: eٍّؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9236e implements AlgorithmParameterSpec {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final HashMap f18433e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C9236e f18434e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C9236e f18435e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C9236e f18436e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f18437e;

    static {
        C9236e c9236e = new C9236e("ML-KEM-512");
        f18435e = c9236e;
        C9236e c9236e2 = new C9236e("ML-KEM-768");
        f18434e = c9236e2;
        C9236e c9236e3 = new C9236e("ML-KEM-1024");
        f18436e = c9236e3;
        HashMap hashMap = new HashMap();
        f18433e = hashMap;
        hashMap.put("ml-kem-512", c9236e);
        hashMap.put("ml-kem-768", c9236e2);
        hashMap.put("ml-kem-1024", c9236e3);
        hashMap.put("kyber512", c9236e);
        hashMap.put("kyber768", c9236e2);
        hashMap.put("kyber1024", c9236e3);
    }

    public C9236e(String str) {
        this.f18437e = str;
    }

    public static C9236e ad(String str) {
        C9236e c9236e = (C9236e) f18433e.get(AbstractC1433e.license(str));
        if (c9236e != null) {
            return c9236e;
        }
        throw new IllegalArgumentException("unknown parameter name: ".concat(str));
    }
}
