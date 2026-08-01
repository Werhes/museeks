package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؑٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0426e {
    public static final C2892e ad = new C2892e(571083779, false, new C14123e(21));
    public static final C2892e vip = new C2892e(-536693875, false, new C14123e(22));

    public static final int ad(int i, int i2, C17096e c17096e, long j, C14980e c14980e) {
        if (c14980e == null) {
            return AbstractC7150e.yandex(i, i2);
        }
        int compare = c17096e.purchase.compare(Long.valueOf(c14980e.metrica), Long.valueOf(j));
        if (compare < 0) {
            return 1;
        }
        return compare > 0 ? 3 : 2;
    }

    public static boolean appmetrica(InterfaceC5876e interfaceC5876e, InterfaceC14822e interfaceC14822e, InterfaceC14822e interfaceC14822e2) {
        int i;
        if (interfaceC5876e.purchase(interfaceC14822e) == interfaceC5876e.purchase(interfaceC14822e2) && interfaceC5876e.mo1260e(interfaceC14822e) == interfaceC5876e.mo1260e(interfaceC14822e2) && interfaceC5876e.mo1233abstract(interfaceC14822e) == interfaceC5876e.mo1233abstract(interfaceC14822e2) && interfaceC5876e.mo1277return(interfaceC5876e.mo1272native(interfaceC14822e), interfaceC5876e.mo1272native(interfaceC14822e2))) {
            if (interfaceC5876e.mo1278static(interfaceC14822e, interfaceC14822e2)) {
                return true;
            }
            int purchase = interfaceC5876e.purchase(interfaceC14822e);
            for (0; i < purchase; i + 1) {
                InterfaceC0023e mo1255e = interfaceC5876e.mo1255e(interfaceC14822e, i);
                InterfaceC0023e mo1255e2 = interfaceC5876e.mo1255e(interfaceC14822e2, i);
                i = (interfaceC5876e.adcel(mo1255e) == interfaceC5876e.adcel(mo1255e2) && (interfaceC5876e.adcel(mo1255e) || (interfaceC5876e.advert(mo1255e) == interfaceC5876e.advert(mo1255e2) && purchase(interfaceC5876e, interfaceC5876e.remoteconfig(mo1255e), interfaceC5876e.remoteconfig(mo1255e2))))) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static final long license(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : C3618e.vip(C3618e.license(j) * f, j);
    }

    public static C6511e metrica(String str) {
        Ctry purchase = AbstractC7899e.purchase(str);
        C9300e license = purchase == null ? null : AbstractC7899e.license(purchase);
        if (license == null) {
            try {
                license = AbstractC7899e.license(new Ctry(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        if (license != null) {
            return new C6511e(str, license.f18531e.f34438e, license.f18530e.loadAd(), license.f18532e, license.f18529e, license.Signature());
        }
        return null;
    }

    public static boolean purchase(InterfaceC5876e interfaceC5876e, InterfaceC9905e interfaceC9905e, InterfaceC9905e interfaceC9905e2) {
        if (interfaceC9905e == interfaceC9905e2) {
            return true;
        }
        InterfaceC14822e mo1239continue = interfaceC5876e.mo1239continue(interfaceC9905e);
        InterfaceC14822e mo1239continue2 = interfaceC5876e.mo1239continue(interfaceC9905e2);
        if (mo1239continue != null && mo1239continue2 != null) {
            return appmetrica(interfaceC5876e, mo1239continue, mo1239continue2);
        }
        InterfaceC13215e mo1265finally = interfaceC5876e.mo1265finally(interfaceC9905e);
        InterfaceC13215e mo1265finally2 = interfaceC5876e.mo1265finally(interfaceC9905e2);
        return mo1265finally != null && mo1265finally2 != null && appmetrica(interfaceC5876e, interfaceC5876e.admob(mo1265finally), interfaceC5876e.admob(mo1265finally2)) && appmetrica(interfaceC5876e, interfaceC5876e.Signature(mo1265finally), interfaceC5876e.Signature(mo1265finally2));
    }

    public static final int vip(long j, C12476e c12476e) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        C12890e c12890e = c12476e.vip;
        return intBitsToFloat >= c12890e.appmetrica ? c12476e.ad.ad.f20850e.length() : c12890e.billing(j);
    }
}
