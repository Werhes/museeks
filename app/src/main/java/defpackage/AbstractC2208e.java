package defpackage;

import java.util.Hashtable;

/* renamed from: eؓۤۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2208e {
    public static final Hashtable ad = new Hashtable();
    public static final Hashtable vip = new Hashtable();

    static {
        ad("B-571", InterfaceC14612e.f28822class);
        ad("B-409", InterfaceC14612e.crashlytics);
        ad("B-283", InterfaceC14612e.amazon);
        ad("B-233", InterfaceC14612e.pro);
        ad("B-163", InterfaceC14612e.advert);
        ad("K-571", InterfaceC14612e.firebase);
        ad("K-409", InterfaceC14612e.subs);
        ad("K-283", InterfaceC14612e.smaato);
        ad("K-233", InterfaceC14612e.remoteconfig);
        ad("K-163", InterfaceC14612e.vip);
        ad("P-521", InterfaceC14612e.premium);
        ad("P-384", InterfaceC14612e.ads);
        ad("P-256", InterfaceC14612e.f28825goto);
        ad("P-224", InterfaceC14612e.applovin);
        ad("P-192", InterfaceC14612e.f28827interface);
    }

    public static void ad(String str, Ctry ctry) {
        ad.put(str, ctry);
        vip.put(ctry, str);
    }

    public static C9300e vip(Ctry ctry) {
        AbstractC4068e abstractC4068e;
        if (!vip.containsKey(ctry) || (abstractC4068e = (AbstractC4068e) AbstractC5335e.vip.get(ctry)) == null) {
            return null;
        }
        return abstractC4068e.license();
    }
}
