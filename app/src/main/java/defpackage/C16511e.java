package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;

/* renamed from: eٖۜؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16511e implements AlgorithmParameterSpec {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final HashMap f32326e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public byte[] f32327e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public byte[] f32328e;

    static {
        HashMap hashMap = new HashMap();
        f32326e = hashMap;
        hashMap.put(InterfaceC6859e.billing, "E-A");
        hashMap.put(InterfaceC6859e.yandex, "E-B");
        hashMap.put(InterfaceC6859e.startapp, "E-C");
        hashMap.put(InterfaceC6859e.adcel, "E-D");
        hashMap.put(InterfaceC13429e.subscription, "Param-Z");
    }

    public C16511e(Ctry ctry, byte[] bArr) {
        String str = (String) f32326e.get(ctry);
        if (str == null) {
            throw new IllegalArgumentException(AbstractC4653e.inmobi("unknown OID: ", ctry));
        }
        this.f32328e = null;
        this.f32327e = null;
        this.f32327e = C15460e.license(str);
        this.f32328e = AbstractC12442e.license(bArr);
    }
}
