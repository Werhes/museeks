package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eََؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9960e {
    public static final C13507e ad;
    public static final Map appmetrica;
    public static final C17594e license;
    public static final C13780e metrica;
    public static final Map purchase;
    public static final C10221e vip;

    static {
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.AesSivKey");
        ad = new C13507e(C14664e.class, new C0663e(17));
        vip = new C10221e(metrica2, new C0663e(18));
        metrica = new C13780e(C12892e.class, new C0663e(19));
        license = new C17594e(metrica2, new C0663e(20));
        HashMap hashMap = new HashMap();
        C8776e c8776e = C8776e.license;
        EnumC3021e enumC3021e = EnumC3021e.RAW;
        hashMap.put(c8776e, enumC3021e);
        C8776e c8776e2 = C8776e.vip;
        EnumC3021e enumC3021e2 = EnumC3021e.TINK;
        hashMap.put(c8776e2, enumC3021e2);
        C8776e c8776e3 = C8776e.metrica;
        EnumC3021e enumC3021e3 = EnumC3021e.CRUNCHY;
        hashMap.put(c8776e3, enumC3021e3);
        appmetrica = DesugarCollections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(EnumC3021e.class);
        enumMap.put((EnumMap) enumC3021e, (EnumC3021e) c8776e);
        enumMap.put((EnumMap) enumC3021e2, (EnumC3021e) c8776e2);
        enumMap.put((EnumMap) enumC3021e3, (EnumC3021e) c8776e3);
        enumMap.put((EnumMap) EnumC3021e.LEGACY, (EnumC3021e) c8776e3);
        purchase = DesugarCollections.unmodifiableMap(enumMap);
    }

    public static EnumC3021e ad(C8776e c8776e) {
        Map map = appmetrica;
        if (map.containsKey(c8776e)) {
            return (EnumC3021e) map.get(c8776e);
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c8776e);
    }

    public static C8776e vip(EnumC3021e enumC3021e) {
        Map map = purchase;
        if (map.containsKey(enumC3021e)) {
            return (C8776e) map.get(enumC3021e);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3021e.vip());
    }
}
