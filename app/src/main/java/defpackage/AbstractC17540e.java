package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17540e {
    public static final C1032e appmetrica;
    public static final C1032e[] billing;
    public static final C1032e license;
    public static final C1032e purchase;
    public static final C2892e ad = new C2892e(1806309936, false, new C2916e(11));
    public static final C2892e vip = new C2892e(670771249, false, new C2916e(12));
    public static final C2892e metrica = new C2892e(-1808077471, false, new C2916e(13));

    static {
        C1032e c1032e = new C1032e(-1, 1L, "commit_to_configuration_v2_api", true);
        license = c1032e;
        C1032e c1032e2 = new C1032e(-1, 1L, "get_serving_version_api", true);
        C1032e c1032e3 = new C1032e(-1, 1L, "get_experiment_tokens_api", true);
        C1032e c1032e4 = new C1032e(-1, 2L, "register_flag_update_listener_api", true);
        appmetrica = c1032e4;
        C1032e c1032e5 = new C1032e(-1, 1L, "sync_after_api", true);
        C1032e c1032e6 = new C1032e(-1, 1L, "sync_after_for_application_api", true);
        C1032e c1032e7 = new C1032e(-1, 1L, "set_app_wide_properties_api", true);
        C1032e c1032e8 = new C1032e(-1, 1L, "set_runtime_properties_api", true);
        C1032e c1032e9 = new C1032e(-1, 1L, "get_storage_info_api", true);
        purchase = c1032e9;
        billing = new C1032e[]{c1032e, c1032e2, c1032e3, c1032e4, c1032e5, c1032e6, c1032e7, c1032e8, c1032e9};
    }

    public static final void ad(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public static String appmetrica(String str) {
        if (AbstractC5304e.m1866native("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List m1870protected = AbstractC5304e.m1870protected(str);
        int length = str.length();
        m1870protected.size();
        int billing2 = AbstractC6874e.billing(m1870protected);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : m1870protected) {
            int i2 = i + 1;
            String str2 = null;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            String str3 = (String) obj;
            if ((i != 0 && i != billing2) || !AbstractC5304e.m1866native(str3)) {
                int length2 = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!AbstractC15211e.license(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && str3.startsWith("|", i3)) {
                    str2 = str3.substring("|".length() + i3);
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC13480e.m3610while(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String license(String str) {
        int i;
        Comparable comparable;
        List m1870protected = AbstractC5304e.m1870protected(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m1870protected) {
            if (!AbstractC5304e.m1866native((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (!AbstractC15211e.license(str2.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        m1870protected.size();
        int billing2 = AbstractC6874e.billing(m1870protected);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : m1870protected) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            String str3 = (String) obj2;
            String applovin = ((i == 0 || i == billing2) && AbstractC5304e.m1866native(str3)) ? null : AbstractC5304e.applovin(intValue, str3);
            if (applovin != null) {
                arrayList3.add(applovin);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length2);
        AbstractC13480e.m3610while(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static final HashSet metrica(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set license2 = ((InterfaceC8528e) it.next()).license();
            if (license2 == null) {
                return null;
            }
            AbstractC13480e.inmobi(hashSet, license2);
        }
        return hashSet;
    }

    public static void vip(Appendable appendable, Object obj, Function1 function1) {
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
