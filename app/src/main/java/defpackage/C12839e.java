package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّّۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12839e extends AbstractC17953e {
    @Override // defpackage.AbstractC17953e
    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public final int mo3408e(String str, String str2, InterfaceC5075e interfaceC5075e, InterfaceC10808e interfaceC10808e) {
        String mo4378apply = interfaceC10808e.mo4378apply(str);
        String mo4378apply2 = interfaceC10808e.mo4378apply(str2);
        HashSet hashSet = new HashSet(Arrays.asList(mo4378apply.split("\\s+")));
        HashSet hashSet2 = new HashSet(Arrays.asList(mo4378apply2.split("\\s+")));
        HashSet hashSet3 = new HashSet(hashSet);
        hashSet3.retainAll(hashSet2);
        HashSet hashSet4 = new HashSet(hashSet);
        hashSet4.removeAll(hashSet2);
        HashSet hashSet5 = new HashSet(hashSet2);
        hashSet5.removeAll(hashSet);
        String trim = AbstractC17751e.metrica(new ArrayList(hashSet3)).trim();
        StringBuilder isPro = AbstractC8703e.isPro(trim, " ");
        isPro.append(AbstractC17751e.metrica(new ArrayList(hashSet4)));
        String trim2 = isPro.toString().trim();
        StringBuilder isPro2 = AbstractC8703e.isPro(trim, " ");
        isPro2.append(AbstractC17751e.metrica(new ArrayList(hashSet5)));
        String trim3 = isPro2.toString().trim();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(interfaceC5075e.mo2359e(trim, trim2)));
        arrayList.add(Integer.valueOf(interfaceC5075e.mo2359e(trim, trim3)));
        arrayList.add(Integer.valueOf(interfaceC5075e.mo2359e(trim2, trim3)));
        return ((Integer) Collections.max(arrayList)).intValue();
    }
}
