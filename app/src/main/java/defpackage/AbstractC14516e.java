package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eٔؖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14516e {
    public static final Map ad;

    static {
        HashMap hashMap = new HashMap();
        AbstractC13501e.smaato(13004, hashMap, "RIPEMD128", 12748, "RIPEMD160");
        AbstractC13501e.smaato(13260, hashMap, "SHA-1", 14540, "SHA-224");
        AbstractC13501e.smaato(13516, hashMap, "SHA-256", 14028, "SHA-384");
        AbstractC13501e.smaato(13772, hashMap, "SHA-512", 14796, "SHA-512/224");
        AbstractC13501e.smaato(15052, hashMap, "SHA-512/256", 14284, "Whirlpool");
        ad = DesugarCollections.unmodifiableMap(hashMap);
    }
}
