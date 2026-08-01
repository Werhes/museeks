package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10437e extends AbstractC7722e {
    public static final /* synthetic */ int Signature = 0;
    public final C17070e amazon;
    public final C10184e loadAd;

    public C10437e(C11980e c11980e, C17070e c17070e, C10184e c10184e) {
        super(c11980e, null);
        this.amazon = c17070e;
        this.loadAd = c10184e;
    }

    public static InterfaceC2188e tapsense(InterfaceC2188e interfaceC2188e) {
        if (interfaceC2188e.mo334e() != 2) {
            return interfaceC2188e;
        }
        Collection mo337finally = interfaceC2188e.mo337finally();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(mo337finally, 10));
        Iterator it = mo337finally.iterator();
        while (it.hasNext()) {
            arrayList.add(tapsense((InterfaceC2188e) it.next()));
        }
        return (InterfaceC2188e) AbstractC13480e.m3590instanceof(AbstractC13480e.premium(arrayList));
    }

    @Override // defpackage.AbstractC12654e
    public final void adcel(C0520e c0520e, ArrayList arrayList) {
        ((C10990e) ((C17241e) this.vip.f23950e).inmobi).getClass();
    }

    @Override // defpackage.AbstractC12654e
    public final InterfaceC15498e admob() {
        return this.loadAd;
    }

    @Override // defpackage.AbstractC7722e, defpackage.AbstractC12654e
    public final void amazon(C0520e c0520e, ArrayList arrayList) {
        ArrayList arrayList2;
        C0520e c0520e2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C17877e c17877e = new C17877e(22, c0520e);
        C10184e c10184e = this.loadAd;
        AbstractC10075e.license(Collections.singletonList(c10184e), C6114e.f12861e, new C1628e(c10184e, linkedHashSet, c17877e));
        boolean isEmpty = arrayList.isEmpty();
        C11980e c11980e = this.vip;
        if (isEmpty) {
            C0520e c0520e3 = c0520e;
            arrayList2 = arrayList;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                InterfaceC2188e tapsense = tapsense((InterfaceC2188e) obj);
                Object obj2 = linkedHashMap.get(tapsense);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(tapsense, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                C17241e c17241e = (C17241e) c11980e.f23950e;
                C0520e c0520e4 = c0520e3;
                AbstractC13480e.inmobi(arrayList3, AbstractC8913e.adcel(c0520e4, collection, arrayList2, this.loadAd, c17241e.purchase, ((C0399e) c17241e.signatures).metrica));
                c0520e3 = c0520e4;
            }
            c0520e2 = c0520e3;
            arrayList2.addAll(arrayList3);
        } else {
            C17241e c17241e2 = (C17241e) c11980e.f23950e;
            arrayList2 = arrayList;
            arrayList2.addAll(AbstractC8913e.adcel(c0520e, linkedHashSet, arrayList, this.loadAd, c17241e2.purchase, ((C0399e) c17241e2.signatures).metrica));
            c0520e2 = c0520e;
        }
        if (this.amazon.ad.isEnum() && c0520e2.equals(AbstractC4972e.vip)) {
            AbstractC9386e.vip(arrayList2, AbstractC7518e.appmetrica(c10184e));
        }
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        return null;
    }

    @Override // defpackage.AbstractC12654e
    public final Set loadAd() {
        Set m3581e = AbstractC13480e.m3581e(((InterfaceC16359e) this.appmetrica.invoke()).purchase());
        C8865e c8865e = C8865e.f17795e;
        C10184e c10184e = this.loadAd;
        AbstractC10075e.license(Collections.singletonList(c10184e), C6114e.f12861e, new C1628e(c10184e, m3581e, c8865e));
        if (this.amazon.ad.isEnum()) {
            m3581e.add(AbstractC4972e.vip);
        }
        return m3581e;
    }

    @Override // defpackage.AbstractC12654e
    public final InterfaceC16359e mopub() {
        return new C14969e(this.amazon, C8865e.f17818e);
    }

    @Override // defpackage.AbstractC12654e
    public final void smaato(LinkedHashSet linkedHashSet, C0520e c0520e) {
        Collection m3582e;
        C10184e c10184e = this.loadAd;
        C10437e license = AbstractC16619e.license(c10184e);
        if (license == null) {
            m3582e = C3295e.f7451e;
        } else {
            m3582e = AbstractC13480e.m3582e(!license.vip().contains(c0520e) ? C13664e.f27089e : (Collection) license.yandex.invoke(c0520e));
        }
        Collection collection = m3582e;
        C17241e c17241e = (C17241e) this.vip.f23950e;
        linkedHashSet.addAll(AbstractC8913e.adcel(c0520e, collection, linkedHashSet, this.loadAd, c17241e.purchase, ((C0399e) c17241e.signatures).metrica));
        if (this.amazon.ad.isEnum()) {
            if (c0520e.equals(AbstractC4972e.metrica)) {
                linkedHashSet.add(AbstractC7518e.purchase(c10184e));
            } else if (c0520e.equals(AbstractC4972e.ad)) {
                linkedHashSet.add(AbstractC7518e.billing(c10184e));
            }
        }
    }

    @Override // defpackage.AbstractC12654e
    public final Set startapp(C4942e c4942e, C8865e c8865e) {
        Set m3581e = AbstractC13480e.m3581e(((InterfaceC16359e) this.appmetrica.invoke()).ad());
        C10437e license = AbstractC16619e.license(this.loadAd);
        Set vip = license != null ? license.vip() : null;
        if (vip == null) {
            vip = C3295e.f7451e;
        }
        m3581e.addAll(vip);
        if (this.amazon.ad.isEnum()) {
            m3581e.addAll(AbstractC6874e.startapp(AbstractC4972e.metrica, AbstractC4972e.ad));
        }
        ((C10990e) ((C17241e) this.vip.f23950e).inmobi).getClass();
        m3581e.addAll(new ArrayList());
        return m3581e;
    }

    @Override // defpackage.AbstractC12654e
    public final Set yandex(C4942e c4942e, Function1 function1) {
        return C3295e.f7451e;
    }
}
