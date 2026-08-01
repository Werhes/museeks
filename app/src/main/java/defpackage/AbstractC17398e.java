package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: eٗۥٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17398e {
    public static final Hashtable ad;
    public static final Hashtable metrica;
    public static final Hashtable vip;

    static {
        C3133e c3133e = new C3133e(10);
        C3133e c3133e2 = new C3133e(11);
        ad = new Hashtable();
        vip = new Hashtable();
        metrica = new Hashtable();
        vip("wapip192v1", InterfaceC4366e.vip, c3133e2);
        vip("wapi192v1", InterfaceC4366e.metrica, c3133e2);
        vip("sm2p256v1", InterfaceC4366e.ad, c3133e);
    }

    public static BigInteger ad(String str) {
        return new BigInteger(1, AbstractC7240e.metrica(str));
    }

    public static void vip(String str, Ctry ctry, AbstractC4068e abstractC4068e) {
        ad.put(AbstractC1433e.license(str), ctry);
        metrica.put(ctry, str);
        vip.put(ctry, abstractC4068e);
    }
}
