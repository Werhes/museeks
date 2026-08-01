package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؙْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6369e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f13228e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Set f13229e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f13230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6369e(Set set, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f13228e = i;
        this.f13229e = set;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f13228e) {
            case 0:
                C6369e c6369e = new C6369e(this.f13229e, interfaceC5083e, 0);
                c6369e.f13230e = obj;
                return c6369e;
            default:
                C6369e c6369e2 = new C6369e(this.f13229e, interfaceC5083e, 1);
                c6369e2.f13230e = obj;
                return c6369e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C0044e c0044e = (C0044e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f13228e) {
            case 0:
                return ((C6369e) advert(interfaceC5083e, c0044e)).loadAd(Unit.INSTANCE);
            default:
                return ((C6369e) advert(interfaceC5083e, c0044e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f13228e) {
            case 0:
                AbstractC2003e.purchase(obj);
                C0044e c0044e = (C0044e) this.f13230e;
                Set set = (Set) c0044e.metrica(C1890e.billing);
                if (set == null) {
                    return c0044e;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (!this.f13229e.contains((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return c0044e;
                }
                C0044e appmetrica = c0044e.appmetrica();
                appmetrica.license(C1890e.billing, AbstractC4511e.smaato(set, arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C11951e vip = C5749e.vip(C1890e.license, (String) it.next());
                    appmetrica.vip();
                    appmetrica.ad.remove(vip);
                }
                return appmetrica.purchase();
            default:
                C0044e c0044e2 = (C0044e) this.f13230e;
                AbstractC2003e.purchase(obj);
                Set keySet = c0044e2.ad().keySet();
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(keySet, 10));
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C11951e) it2.next()).ad);
                }
                LinkedHashSet linkedHashSet = AbstractC10999e.ad;
                boolean z = true;
                Set set2 = this.f13229e;
                if (set2 != linkedHashSet) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        Iterator it3 = set3.iterator();
                        while (it3.hasNext()) {
                            if (!arrayList2.contains((String) it3.next())) {
                            }
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
