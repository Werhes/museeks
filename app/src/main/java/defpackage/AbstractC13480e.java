package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* renamed from: eْۚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13480e extends AbstractC5167e {
    /* renamed from: abstract, reason: not valid java name */
    public static Object m3569abstract(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static boolean ads(Iterable iterable, Object obj) {
        int i;
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    AbstractC6874e.Signature();
                    throw null;
                }
                if (AbstractC7890e.billing(obj, next)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            i = ((List) iterable).indexOf(obj);
        }
        return i >= 0;
    }

    public static ArrayList applovin(int i, List list) {
        AbstractC9180e.license(i, i);
        if (!(list instanceof RandomAccess) || !AbstractC0869e.premium(list)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            Iterator license = !it.hasNext() ? C15897e.f31334e : AbstractC16342e.license(new C9113e(i, i, it, null));
            while (license.hasNext()) {
                arrayList.add((List) license.next());
            }
            return arrayList;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    /* renamed from: break, reason: not valid java name */
    public static Object m3570break(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC6874e.billing(list));
    }

    /* renamed from: case, reason: not valid java name */
    public static ArrayList m3571case(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return m3572catch(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        inmobi(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: catch, reason: not valid java name */
    public static ArrayList m3572catch(Object obj, Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: class, reason: not valid java name */
    public static Object m3573class(Iterable iterable) {
        if (iterable instanceof List) {
            return m3591interface((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: const, reason: not valid java name */
    public static final void m3574const(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* renamed from: continue, reason: not valid java name */
    public static List m3575continue(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return AbstractC6874e.advert(m3583e(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C13664e.f27089e;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List crashlytics(List list) {
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return m3602switch(list, size);
    }

    /* renamed from: default, reason: not valid java name */
    public static ArrayList m3576default(List list, Object obj) {
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && AbstractC7890e.billing(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* renamed from: else, reason: not valid java name */
    public static List m3577else(Iterable iterable, Comparator comparator) {
        if (!(iterable instanceof Collection)) {
            List m3583e = m3583e(iterable);
            AbstractC5167e.signatures(comparator, m3583e);
            return m3583e;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m3575continue(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    /* renamed from: extends, reason: not valid java name */
    public static LinkedHashSet m3578extends(Iterable iterable, Iterable iterable2) {
        Collection m3575continue = iterable2 instanceof Collection ? (Collection) iterable2 : m3575continue(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (m3575continue.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public static ArrayList m3579e(Iterable iterable, List list) {
        Iterator it = list.iterator();
        Iterator it2 = iterable.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC0746e.subscription(list, 10), AbstractC0746e.subscription(iterable, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C6571e(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public static C8950e m3580e(List list) {
        return new C8950e(1, new C10479e(7, list));
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public static Set m3581e(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m3574const(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public static Set m3582e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC10064e.appmetrica(collection.size()));
                m3574const(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m3574const(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : Collections.singleton(linkedHashSet2.iterator().next());
            }
        }
        return C3295e.f7451e;
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public static final List m3583e(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m3574const(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: final, reason: not valid java name */
    public static ArrayList m3584final(Collection collection, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            inmobi(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* renamed from: finally, reason: not valid java name */
    public static byte[] m3585finally(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static ArrayList firebase(Collection collection) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: for, reason: not valid java name */
    public static int[] m3586for(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: goto, reason: not valid java name */
    public static Object m3587goto(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: implements, reason: not valid java name */
    public static ArrayList m3588implements(Iterable iterable, Iterable iterable2) {
        if (iterable instanceof Collection) {
            return m3584final((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        inmobi(arrayList, iterable);
        inmobi(arrayList, iterable2);
        return arrayList;
    }

    /* renamed from: import, reason: not valid java name */
    public static Object m3589import(Iterable iterable) {
        if (iterable instanceof List) {
            return m3590instanceof((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static void inmobi(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* renamed from: instanceof, reason: not valid java name */
    public static Object m3590instanceof(List list) {
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* renamed from: interface, reason: not valid java name */
    public static Object m3591interface(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static void isPro(List list, Object[] objArr) {
        list.addAll(Arrays.asList(objArr));
    }

    public static final int isVip(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder premium = AbstractC4653e.premium("Position index ", i, " must be in range [");
        premium.append(new C11241e(0, list.size(), 1));
        premium.append("].");
        throw new IndexOutOfBoundsException(premium.toString());
    }

    /* renamed from: native, reason: not valid java name */
    public static Object m3592native(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: new, reason: not valid java name */
    public static void m3593new(List list, Function1 function1) {
        int billing;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC16555e) && !(list instanceof InterfaceC12555e)) {
                AbstractC9476e.admob(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) function1.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int billing2 = AbstractC6874e.billing(list);
        int i = 0;
        if (billing2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == billing2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (billing = AbstractC6874e.billing(list))) {
            return;
        }
        while (true) {
            list.remove(billing);
            if (billing == i) {
                return;
            } else {
                billing--;
            }
        }
    }

    /* renamed from: package, reason: not valid java name */
    public static Object m3594package(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(AbstractC6874e.billing(abstractList));
    }

    public static List premium(Iterable iterable) {
        return m3575continue(m3581e(iterable));
    }

    /* renamed from: private, reason: not valid java name */
    public static Object m3595private(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC6874e.billing(list));
    }

    /* renamed from: protected, reason: not valid java name */
    public static Object m3596protected(Iterable iterable) {
        if (iterable instanceof List) {
            return m3570break((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: public, reason: not valid java name */
    public static long[] m3597public(AbstractList abstractList) {
        long[] jArr = new long[abstractList.size()];
        Iterator it = abstractList.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: return, reason: not valid java name */
    public static List m3598return(AbstractCollection abstractCollection) {
        if (abstractCollection.size() <= 1) {
            return m3575continue(abstractCollection);
        }
        Object[] array = abstractCollection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(array);
    }

    /* renamed from: static, reason: not valid java name */
    public static Object m3599static(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public static void m3600strictfp(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        list.remove(0);
    }

    public static List subs(int i, List list) {
        ArrayList arrayList;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return m3575continue(list);
        }
        if (AbstractC0869e.premium(list)) {
            int size = list.size() - i;
            if (size <= 0) {
                return C13664e.f27089e;
            }
            if (size == 1) {
                return Collections.singletonList(m3596protected(list));
            }
            arrayList = new ArrayList(size);
            if (AbstractC0869e.premium(list)) {
                if (list instanceof RandomAccess) {
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = list.listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : list) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return AbstractC6874e.advert(arrayList);
    }

    /* renamed from: super, reason: not valid java name */
    public static Object m3601super(ArrayList arrayList) {
        AbstractC5427e abstractC5427e = AbstractC15440e.f30517e;
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return arrayList.get(AbstractC15440e.f30517e.adcel(arrayList.size()));
    }

    /* renamed from: switch, reason: not valid java name */
    public static List m3602switch(Iterable iterable, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return C13664e.f27089e;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return m3575continue(iterable);
            }
            if (i == 1) {
                return Collections.singletonList(m3573class(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return AbstractC6874e.advert(arrayList);
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static Object m3603synchronized(List list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final int tapsense(int i, List list) {
        if (i >= 0 && i <= AbstractC6874e.billing(list)) {
            return AbstractC6874e.billing(list) - i;
        }
        StringBuilder premium = AbstractC4653e.premium("Element index ", i, " must be in range [");
        premium.append(new C11241e(0, AbstractC6874e.billing(list), 1));
        premium.append("].");
        throw new IndexOutOfBoundsException(premium.toString());
    }

    /* renamed from: this, reason: not valid java name */
    public static Object m3604this(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: throw, reason: not valid java name */
    public static final void m3605throw(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Function1 function1) {
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                AbstractC17540e.vip(appendable, obj, function1);
            }
        }
        if (i >= 0 && i2 > i) {
            appendable.append("...");
        }
        appendable.append(charSequence3);
    }

    /* renamed from: throws, reason: not valid java name */
    public static List m3606throws(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return C13664e.f27089e;
        }
        int size = list.size();
        if (i >= size) {
            return m3575continue(list);
        }
        if (i == 1) {
            return Collections.singletonList(m3570break(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* renamed from: transient, reason: not valid java name */
    public static List m3607transient(Collection collection) {
        if ((collection instanceof Collection) && collection.size() <= 1) {
            return m3575continue(collection);
        }
        List m3583e = m3583e(collection);
        Collections.reverse(m3583e);
        return m3583e;
    }

    /* renamed from: try, reason: not valid java name */
    public static String m3608try(Iterable iterable, CharSequence charSequence, String str, String str2, Function1 function1, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? BuildConfig.FLAVOR : str;
        String str4 = (i & 4) != 0 ? BuildConfig.FLAVOR : str2;
        int i2 = (i & 8) != 0 ? -1 : 5;
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        m3605throw(iterable, sb, charSequence2, str3, str4, i2, function1);
        return sb.toString();
    }

    /* renamed from: volatile, reason: not valid java name */
    public static float[] m3609volatile(List list) {
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    /* renamed from: while, reason: not valid java name */
    public static /* synthetic */ void m3610while(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? BuildConfig.FLAVOR : str2;
        String str6 = (i & 8) != 0 ? BuildConfig.FLAVOR : str3;
        if ((i & 64) != 0) {
            function1 = null;
        }
        m3605throw(iterable, appendable, str4, str5, str6, -1, function1);
    }
}
