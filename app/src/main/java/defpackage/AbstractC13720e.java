package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: eٓؒۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13720e {
    public static final Hashtable ad;
    public static final Hashtable metrica;
    public static final Hashtable vip;

    static {
        C7664e c7664e = new C7664e(9);
        C7664e c7664e2 = new C7664e(14);
        C7664e c7664e3 = new C7664e(15);
        C7664e c7664e4 = new C7664e(16);
        C7664e c7664e5 = new C7664e(17);
        C7664e c7664e6 = new C7664e(18);
        C7664e c7664e7 = new C7664e(19);
        C7664e c7664e8 = new C7664e(20);
        C7664e c7664e9 = new C7664e(21);
        C12374e c12374e = new C12374e(29);
        C7664e c7664e10 = new C7664e(0);
        C7664e c7664e11 = new C7664e(1);
        C7664e c7664e12 = new C7664e(2);
        C7664e c7664e13 = new C7664e(3);
        C7664e c7664e14 = new C7664e(4);
        C7664e c7664e15 = new C7664e(5);
        C7664e c7664e16 = new C7664e(6);
        C7664e c7664e17 = new C7664e(7);
        C7664e c7664e18 = new C7664e(8);
        C7664e c7664e19 = new C7664e(10);
        C7664e c7664e20 = new C7664e(11);
        C7664e c7664e21 = new C7664e(12);
        C7664e c7664e22 = new C7664e(13);
        ad = new Hashtable();
        vip = new Hashtable();
        metrica = new Hashtable();
        metrica("prime192v1", InterfaceC16631e.f32617e, c7664e);
        metrica("prime192v2", InterfaceC16631e.f32659e, c7664e2);
        metrica("prime192v3", InterfaceC16631e.f32649e, c7664e3);
        metrica("prime239v1", InterfaceC16631e.f32650e, c7664e4);
        metrica("prime239v2", InterfaceC16631e.f32616e, c7664e5);
        metrica("prime239v3", InterfaceC16631e.f32622e, c7664e6);
        metrica("prime256v1", InterfaceC16631e.f32645e, c7664e7);
        metrica("c2pnb163v1", InterfaceC16631e.f32652e, c7664e8);
        metrica("c2pnb163v2", InterfaceC16631e.f32636e, c7664e9);
        metrica("c2pnb163v3", InterfaceC16631e.f32638e, c12374e);
        metrica("c2pnb176w1", InterfaceC16631e.f32625e, c7664e10);
        metrica("c2tnb191v1", InterfaceC16631e.f32628e, c7664e11);
        metrica("c2tnb191v2", InterfaceC16631e.f32631e, c7664e12);
        metrica("c2tnb191v3", InterfaceC16631e.f32643e, c7664e13);
        metrica("c2pnb208w1", InterfaceC16631e.f32657e, c7664e14);
        metrica("c2tnb239v1", InterfaceC16631e.f32647e, c7664e15);
        metrica("c2tnb239v2", InterfaceC16631e.f32620e, c7664e16);
        metrica("c2tnb239v3", InterfaceC16631e.f32619e, c7664e17);
        metrica("c2pnb272w1", InterfaceC16631e.f32618e, c7664e18);
        metrica("c2pnb304w1", InterfaceC16631e.f32642e, c7664e19);
        metrica("c2tnb359v1", InterfaceC16631e.f32658e, c7664e20);
        metrica("c2pnb368w1", InterfaceC16631e.f32656e, c7664e21);
        metrica("c2tnb431r1", InterfaceC16631e.f32624e, c7664e22);
    }

    public static BigInteger ad(String str) {
        return new BigInteger(1, AbstractC7240e.metrica(str));
    }

    public static void metrica(String str, Ctry ctry, AbstractC4068e abstractC4068e) {
        ad.put(str, ctry);
        metrica.put(ctry, str);
        vip.put(ctry, abstractC4068e);
    }

    public static C1324e vip(AbstractC0362e abstractC0362e, String str) {
        C1324e c1324e = new C1324e(abstractC0362e, AbstractC7240e.metrica(str));
        AbstractC0903e.vip(c1324e.loadAd());
        return c1324e;
    }
}
