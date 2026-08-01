package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1596e {
    public static final AbstractC15728e ad(AbstractC10226e abstractC10226e, AbstractC10226e abstractC10226e2) {
        return abstractC10226e.equals(abstractC10226e2) ? abstractC10226e : new AbstractC14773e(abstractC10226e, abstractC10226e2);
    }

    public static String adcel(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC0258e.purchase("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC0258e.purchase("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i2, "negative size: "));
    }

    public static final AbstractC10226e appmetrica(InterfaceC8528e interfaceC8528e, C6557e c6557e, InterfaceC5021e interfaceC5021e, List list, boolean z) {
        C10703e c10703e = new C10703e(interfaceC5021e, list, z, interfaceC8528e, new C11452e(interfaceC8528e, c6557e, interfaceC5021e, list, z));
        return c6557e.isEmpty() ? c10703e : new C13369e(c10703e, c6557e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static final int billing(String str) {
        switch (str.hashCode()) {
            case -1568706863:
                if (str.equals("solarized")) {
                    return R.string.themes_category_solarized;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case -1480249367:
                if (str.equals("community")) {
                    return R.string.themes_category_community;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case -1130647735:
                if (str.equals("adwaita")) {
                    return R.string.themes_category_adwaita;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case 3789:
                if (str.equals("wd")) {
                    return R.string.themes_category_wd;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case 104461:
                if (str.equals("ios")) {
                    return R.string.themes_category_ios;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case 116238:
                if (str.equals("uwp")) {
                    return R.string.themes_category_uwp;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case 118797:
                if (str.equals("xmb")) {
                    return R.string.themes_category_xmb;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case 3075958:
                if (str.equals("dark")) {
                    return R.string.themes_category_dark;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case 3387315:
                if (str.equals("nord")) {
                    return R.string.themes_category_nord;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case 102970646:
                if (str.equals("light")) {
                    return R.string.themes_category_light;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case 112257890:
                if (str.equals("vk_me")) {
                    return R.string.themes_category_vk_me;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case 298986879:
                if (str.equals("gruvbox")) {
                    return R.string.themes_category_gruvbox;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case 1131700897:
                if (str.equals("android_q")) {
                    return R.string.themes_category_q;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            case 1544803905:
                if (str.equals("default")) {
                    return R.string.themes_category_default;
                }
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
            default:
                throw new IllegalStateException(("ThemeCatalog2 id -> res not defined for id " + str + '?').toString());
        }
    }

    public static AbstractC10226e license(C6557e c6557e, InterfaceC5021e interfaceC5021e, List list, boolean z) {
        InterfaceC8528e appmetrica;
        AbstractC17645e abstractC17645e;
        InterfaceC8528e license;
        InterfaceC8528e purchase;
        if (c6557e.isEmpty() && list.isEmpty() && !z && interfaceC5021e.advert() != null) {
            return interfaceC5021e.advert().mo1458e();
        }
        InterfaceC4077e advert = interfaceC5021e.advert();
        if (advert instanceof InterfaceC16046e) {
            appmetrica = ((InterfaceC16046e) advert).mo1458e().mo483e();
        } else if (advert instanceof InterfaceC5052e) {
            int i = AbstractC2876e.ad;
            AbstractC2876e.yandex(AbstractC14300e.metrica(advert));
            boolean isEmpty = list.isEmpty();
            C13520e c13520e = C13520e.ad;
            if (isEmpty) {
                InterfaceC5052e interfaceC5052e = (InterfaceC5052e) advert;
                abstractC17645e = interfaceC5052e instanceof AbstractC17645e ? (AbstractC17645e) interfaceC5052e : null;
                appmetrica = (abstractC17645e == null || (purchase = abstractC17645e.purchase(c13520e)) == null) ? interfaceC5052e.mo1726e() : purchase;
            } else {
                InterfaceC5052e interfaceC5052e2 = (InterfaceC5052e) advert;
                AbstractC3370e tapsense = AbstractC16257e.vip.tapsense(interfaceC5021e, list);
                abstractC17645e = interfaceC5052e2 instanceof AbstractC17645e ? (AbstractC17645e) interfaceC5052e2 : null;
                appmetrica = (abstractC17645e == null || (license = abstractC17645e.license(tapsense, c13520e)) == null) ? interfaceC5052e2.mo1721e(tapsense) : license;
            }
        } else if (advert instanceof InterfaceC9794e) {
            appmetrica = C18139e.ad(4, true, ((AbstractC2214e) ((InterfaceC9794e) advert)).getName().f2667e);
        } else {
            if (!(interfaceC5021e instanceof C14376e)) {
                throw new IllegalStateException("Unsupported classifier: " + advert + " for constructor: " + interfaceC5021e);
            }
            appmetrica = AbstractC3628e.appmetrica("member scope for intersection type", ((C14376e) interfaceC5021e).f28431e);
        }
        return purchase(c6557e, interfaceC5021e, list, z, appmetrica, new C11452e(c6557e, interfaceC5021e, list, z));
    }

    public static InterfaceC12864e metrica(InterfaceC12864e interfaceC12864e, AbstractC10727e abstractC10727e, InterfaceC8079e interfaceC8079e, InterfaceC2872e interfaceC2872e, float f, C2815e c2815e, int i) {
        if ((i & 4) != 0) {
            interfaceC8079e = C5438e.f11700e;
        }
        InterfaceC8079e interfaceC8079e2 = interfaceC8079e;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return interfaceC12864e.premium(new C16265e(abstractC10727e, interfaceC8079e2, interfaceC2872e, f, c2815e));
    }

    public static final AbstractC10226e purchase(C6557e c6557e, InterfaceC5021e interfaceC5021e, List list, boolean z, InterfaceC8528e interfaceC8528e, Function1 function1) {
        C10703e c10703e = new C10703e(interfaceC5021e, list, z, interfaceC8528e, function1);
        return c6557e.isEmpty() ? c10703e : new C13369e(c10703e, c6557e);
    }

    public static void startapp(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? adcel(i, i3, "start index") : (i2 < 0 || i2 > i3) ? adcel(i2, i3, "end index") : AbstractC0258e.purchase("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static final Bundle vip(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(AbstractC5087e.m1746extends("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static void yandex(int i, int i2) {
        String purchase;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                purchase = AbstractC0258e.purchase("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(i2, "negative size: "));
                }
                purchase = AbstractC0258e.purchase("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(purchase);
        }
    }
}
