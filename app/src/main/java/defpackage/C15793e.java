package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۡۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15793e implements Iterable, InterfaceC16555e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C15793e f31108e = new C15793e(new String[0]);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String[] f31109e;

    public C15793e(String[] strArr) {
        this.f31109e = strArr;
    }

    public final String adcel(int i) {
        String str = (String) AbstractC1660e.crashlytics((i * 2) + 1, this.f31109e);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(AbstractC8647e.applovin("value[", i, ']'));
    }

    public final List advert(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(billing(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(adcel(i));
            }
        }
        List unmodifiableList = arrayList != null ? DesugarCollections.unmodifiableList(arrayList) : null;
        return unmodifiableList == null ? C13664e.f27089e : unmodifiableList;
    }

    public final String appmetrica(String str) {
        String[] strArr = this.f31109e;
        int length = strArr.length - 2;
        int license = AbstractC4340e.license(length, 0, -2);
        if (license > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == license) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String billing(int i) {
        String str = (String) AbstractC1660e.crashlytics(i * 2, this.f31109e);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(AbstractC8647e.applovin("name[", i, ']'));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15793e) {
            return Arrays.equals(this.f31109e, ((C15793e) obj).f31109e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f31109e);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C6571e[] c6571eArr = new C6571e[size];
        for (int i = 0; i < size; i++) {
            c6571eArr[i] = new C6571e(billing(i), adcel(i));
        }
        return new C1630e(1, c6571eArr);
    }

    public final int size() {
        return this.f31109e.length / 2;
    }

    public final TreeMap startapp() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String lowerCase = billing(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(adcel(i));
        }
        return treeMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String billing = billing(i);
            String adcel = adcel(i);
            sb.append(billing);
            sb.append(": ");
            if (AbstractC10220e.mopub(billing)) {
                adcel = "██";
            }
            sb.append(adcel);
            sb.append("\n");
        }
        return sb.toString();
    }

    public final C15783e yandex() {
        C15783e c15783e = new C15783e(0);
        AbstractC13480e.isPro(c15783e.ad, this.f31109e);
        return c15783e;
    }
}
