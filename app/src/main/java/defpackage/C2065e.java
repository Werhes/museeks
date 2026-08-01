package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۙۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2065e implements InterfaceC10361e {
    public final Class ad;
    public final AbstractC13345e appmetrica;
    public final List license;
    public final List metrica;
    public final String vip;

    public C2065e(Class cls, String str, List list, List list2, AbstractC13345e abstractC13345e) {
        this.ad = cls;
        this.vip = str;
        this.metrica = list;
        this.license = list2;
        this.appmetrica = abstractC13345e;
    }

    @Override // defpackage.InterfaceC10361e
    public final AbstractC13345e ad(Type type, Set set, C14172e c14172e) {
        if (AbstractC18453e.appmetrica(type) != this.ad || !set.isEmpty()) {
            return null;
        }
        List list = this.license;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(c14172e.ad((Type) list.get(i)));
        }
        return new C15078e(this.vip, this.metrica, this.license, arrayList, this.appmetrica).license();
    }

    public final C2065e metrica(Class cls, String str) {
        List list = this.metrica;
        if (list.contains(str)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.license);
        arrayList2.add(cls);
        return new C2065e(this.ad, this.vip, arrayList, arrayList2, this.appmetrica);
    }

    public final C2065e vip(Object obj) {
        C1883e c1883e = new C1883e(this, obj);
        return new C2065e(this.ad, this.vip, this.metrica, this.license, c1883e);
    }
}
