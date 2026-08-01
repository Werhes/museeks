package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;

/* renamed from: eَٛٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10373e implements AlgorithmParameterSpec {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C10373e f20490e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C10373e f20491e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C10373e f20492e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final HashMap f20493e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C10373e f20494e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C10373e f20495e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C10373e f20496e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f20497e;

    static {
        C10373e c10373e = new C10373e("ML-DSA-44");
        f20492e = c10373e;
        C10373e c10373e2 = new C10373e("ML-DSA-65");
        f20491e = c10373e2;
        C10373e c10373e3 = new C10373e("ML-DSA-87");
        f20494e = c10373e3;
        C10373e c10373e4 = new C10373e("ML-DSA-44-WITH-SHA512");
        f20490e = c10373e4;
        C10373e c10373e5 = new C10373e("ML-DSA-65-WITH-SHA512");
        f20496e = c10373e5;
        C10373e c10373e6 = new C10373e("ML-DSA-87-WITH-SHA512");
        f20495e = c10373e6;
        HashMap hashMap = new HashMap();
        f20493e = hashMap;
        hashMap.put("ml-dsa-44", c10373e);
        hashMap.put("ml-dsa-65", c10373e2);
        hashMap.put("ml-dsa-87", c10373e3);
        hashMap.put("ml-dsa-44-with-sha512", c10373e4);
        hashMap.put("ml-dsa-65-with-sha512", c10373e5);
        hashMap.put("ml-dsa-87-with-sha512", c10373e6);
    }

    public C10373e(String str) {
        this.f20497e = str;
    }

    public static C10373e ad(String str) {
        if (str == null) {
            throw new NullPointerException("name cannot be null");
        }
        C10373e c10373e = (C10373e) f20493e.get(AbstractC1433e.license(str));
        if (c10373e != null) {
            return c10373e;
        }
        throw new IllegalArgumentException("unknown parameter name: ".concat(str));
    }
}
