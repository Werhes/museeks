package defpackage;

import java.util.HashMap;
import org.conscrypt.PSKKeyManager;

/* renamed from: eَؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7171e {
    public static final HashMap ad;
    public static final HashMap vip;

    static {
        HashMap hashMap = new HashMap();
        ad = hashMap;
        HashMap hashMap2 = new HashMap();
        vip = hashMap2;
        Ctry ctry = InterfaceC0760e.ad;
        hashMap.put("SHA-256", ctry);
        Ctry ctry2 = InterfaceC0760e.metrica;
        hashMap.put("SHA-512", ctry2);
        Ctry ctry3 = InterfaceC0760e.mopub;
        hashMap.put("SHAKE128", ctry3);
        Ctry ctry4 = InterfaceC0760e.advert;
        hashMap.put("SHAKE256", ctry4);
        hashMap2.put(ctry, "SHA-256");
        hashMap2.put(ctry2, "SHA-512");
        hashMap2.put(ctry3, "SHAKE128");
        hashMap2.put(ctry4, "SHAKE256");
    }

    public static InterfaceC0293e ad(Ctry ctry) {
        if (ctry.isVip(InterfaceC0760e.ad)) {
            return new C7952e();
        }
        if (ctry.isVip(InterfaceC0760e.metrica)) {
            return new C15708e();
        }
        if (ctry.isVip(InterfaceC0760e.mopub)) {
            return new C16253e(128);
        }
        if (ctry.isVip(InterfaceC0760e.advert)) {
            return new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        throw new IllegalArgumentException(AbstractC4653e.inmobi("unrecognized digest OID: ", ctry));
    }

    public static Ctry vip(String str) {
        Ctry ctry = (Ctry) ad.get(str);
        if (ctry != null) {
            return ctry;
        }
        throw new IllegalArgumentException(AbstractC17861e.Signature("unrecognized digest name: ", str));
    }
}
