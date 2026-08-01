package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14737e {
    public static final Object ad = AbstractC10064e.purchase(new C6571e("PACKAGE", EnumSet.noneOf(EnumC1865e.class)), new C6571e("TYPE", EnumSet.of(EnumC1865e.f4960e, EnumC1865e.f4967e)), new C6571e("ANNOTATION_TYPE", EnumSet.of(EnumC1865e.f4974e)), new C6571e("TYPE_PARAMETER", EnumSet.of(EnumC1865e.f4957e)), new C6571e("FIELD", EnumSet.of(EnumC1865e.f4978e)), new C6571e("LOCAL_VARIABLE", EnumSet.of(EnumC1865e.f4969e)), new C6571e("PARAMETER", EnumSet.of(EnumC1865e.f4976e)), new C6571e("CONSTRUCTOR", EnumSet.of(EnumC1865e.f4961e)), new C6571e("METHOD", EnumSet.of(EnumC1865e.f4970e, EnumC1865e.f4959e, EnumC1865e.f4958e)), new C6571e("TYPE_USE", EnumSet.of(EnumC1865e.f4963e)));
    public static final Object vip = AbstractC10064e.purchase(new C6571e("RUNTIME", EnumC16708e.f32765e), new C6571e("CLASS", EnumC16708e.f32763e), new C6571e("SOURCE", EnumC16708e.f32762e));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public static C16938e ad(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C16910e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) ad.get(C0520e.appmetrica(((C16910e) it.next()).vip.name()).vip());
            if (iterable == null) {
                iterable = C3295e.f7451e;
            }
            AbstractC13480e.inmobi(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            EnumC1865e enumC1865e = (EnumC1865e) it2.next();
            C12816e c12816e = AbstractC0206e.signatures;
            arrayList3.add(new C8259e(new C11709e(c12816e.vip(), c12816e.ad.billing()), C0520e.appmetrica(enumC1865e.name())));
        }
        return new C16938e(arrayList3, C7247e.f14821e);
    }
}
