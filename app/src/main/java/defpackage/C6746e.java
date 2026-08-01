package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6746e implements InterfaceC11824e {
    public static final List license;
    public final String[] ad;
    public final ArrayList metrica;
    public final Set vip;

    static {
        String m3608try = AbstractC13480e.m3608try(AbstractC6874e.startapp('k', 'o', 't', 'l', 'i', 'n'), BuildConfig.FLAVOR, null, null, null, 62);
        List startapp = AbstractC6874e.startapp(AbstractC10257e.adcel(m3608try, "/Any"), AbstractC10257e.adcel(m3608try, "/Nothing"), AbstractC10257e.adcel(m3608try, "/Unit"), AbstractC10257e.adcel(m3608try, "/Throwable"), AbstractC10257e.adcel(m3608try, "/Number"), AbstractC10257e.adcel(m3608try, "/Byte"), AbstractC10257e.adcel(m3608try, "/Double"), AbstractC10257e.adcel(m3608try, "/Float"), AbstractC10257e.adcel(m3608try, "/Int"), AbstractC10257e.adcel(m3608try, "/Long"), AbstractC10257e.adcel(m3608try, "/Short"), AbstractC10257e.adcel(m3608try, "/Boolean"), AbstractC10257e.adcel(m3608try, "/Char"), AbstractC10257e.adcel(m3608try, "/CharSequence"), AbstractC10257e.adcel(m3608try, "/String"), AbstractC10257e.adcel(m3608try, "/Comparable"), AbstractC10257e.adcel(m3608try, "/Enum"), AbstractC10257e.adcel(m3608try, "/Array"), AbstractC10257e.adcel(m3608try, "/ByteArray"), AbstractC10257e.adcel(m3608try, "/DoubleArray"), AbstractC10257e.adcel(m3608try, "/FloatArray"), AbstractC10257e.adcel(m3608try, "/IntArray"), AbstractC10257e.adcel(m3608try, "/LongArray"), AbstractC10257e.adcel(m3608try, "/ShortArray"), AbstractC10257e.adcel(m3608try, "/BooleanArray"), AbstractC10257e.adcel(m3608try, "/CharArray"), AbstractC10257e.adcel(m3608try, "/Cloneable"), AbstractC10257e.adcel(m3608try, "/Annotation"), AbstractC10257e.adcel(m3608try, "/collections/Iterable"), AbstractC10257e.adcel(m3608try, "/collections/MutableIterable"), AbstractC10257e.adcel(m3608try, "/collections/Collection"), AbstractC10257e.adcel(m3608try, "/collections/MutableCollection"), AbstractC10257e.adcel(m3608try, "/collections/List"), AbstractC10257e.adcel(m3608try, "/collections/MutableList"), AbstractC10257e.adcel(m3608try, "/collections/Set"), AbstractC10257e.adcel(m3608try, "/collections/MutableSet"), AbstractC10257e.adcel(m3608try, "/collections/Map"), AbstractC10257e.adcel(m3608try, "/collections/MutableMap"), AbstractC10257e.adcel(m3608try, "/collections/Map.Entry"), AbstractC10257e.adcel(m3608try, "/collections/MutableMap.MutableEntry"), AbstractC10257e.adcel(m3608try, "/collections/Iterator"), AbstractC10257e.adcel(m3608try, "/collections/MutableIterator"), AbstractC10257e.adcel(m3608try, "/collections/ListIterator"), AbstractC10257e.adcel(m3608try, "/collections/MutableListIterator"));
        license = startapp;
        C8950e m3580e = AbstractC13480e.m3580e(startapp);
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(m3580e, 10));
        if (appmetrica < 16) {
            appmetrica = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica);
        Iterator it = m3580e.iterator();
        while (true) {
            C2320e c2320e = (C2320e) it;
            if (!c2320e.f5836e.hasNext()) {
                return;
            }
            C9817e c9817e = (C9817e) c2320e.next();
            linkedHashMap.put((String) c9817e.vip, Integer.valueOf(c9817e.ad));
        }
    }

    public C6746e(C12499e c12499e, String[] strArr) {
        List list = c12499e.f25034e;
        Set m3582e = list.isEmpty() ? C3295e.f7451e : AbstractC13480e.m3582e(list);
        List<C8726e> list2 = c12499e.f25035e;
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (C8726e c8726e : list2) {
            int i = c8726e.f17606e;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(c8726e);
            }
        }
        arrayList.trimToSize();
        this.ad = strArr;
        this.vip = m3582e;
        this.metrica = arrayList;
    }

    @Override // defpackage.InterfaceC11824e
    public final String ad(int i) {
        return getString(i);
    }

    @Override // defpackage.InterfaceC11824e
    public final String getString(int i) {
        String str;
        C8726e c8726e = (C8726e) this.metrica.get(i);
        int i2 = c8726e.f17608e;
        if ((i2 & 4) == 4) {
            Object obj = c8726e.f17604e;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                AbstractC6732e abstractC6732e = (AbstractC6732e) obj;
                String tapsense = abstractC6732e.tapsense();
                if (abstractC6732e.smaato()) {
                    c8726e.f17604e = tapsense;
                }
                str = tapsense;
            }
        } else {
            if ((i2 & 2) == 2) {
                List list = license;
                int size = list.size();
                int i3 = c8726e.f17611e;
                if (i3 >= 0 && i3 < size) {
                    str = (String) list.get(i3);
                }
            }
            str = this.ad[i];
        }
        if (c8726e.f17614e.size() >= 2) {
            List list2 = c8726e.f17614e;
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= str.length()) {
                str = str.substring(num.intValue(), num2.intValue());
            }
        }
        if (c8726e.f17612e.size() >= 2) {
            List list3 = c8726e.f17612e;
            str = str.replace((char) ((Integer) list3.get(0)).intValue(), (char) ((Integer) list3.get(1)).intValue());
        }
        EnumC15990e enumC15990e = c8726e.f17615e;
        if (enumC15990e == null) {
            enumC15990e = EnumC15990e.NONE;
        }
        int ordinal = enumC15990e.ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal == 1) {
            return str.replace('$', '.');
        }
        if (ordinal != 2) {
            throw new C14803e(10);
        }
        if (str.length() >= 2) {
            str = AbstractC5087e.m1752this(1, 1, str);
        }
        return str.replace('$', '.');
    }

    @Override // defpackage.InterfaceC11824e
    public final boolean vip(int i) {
        return this.vip.contains(Integer.valueOf(i));
    }
}
