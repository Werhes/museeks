package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1860e extends AbstractC4362e {
    public final /* synthetic */ C7025e adcel;
    public final C13520e billing;
    public final C0394e startapp;
    public final C0394e yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v2, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [eٖؑٚ, eٖۥٌ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1860e(defpackage.C7025e r9, defpackage.C13520e r10) {
        /*
            r8 = this;
            r8.adcel = r9
            eؗ٘ٔ r1 = r9.f14371e
            eٟؓۦ r9 = r9.f14369e
            java.util.List r2 = r9.f5269e
            java.util.List r3 = r9.f5265e
            java.util.List r4 = r9.f5281e
            java.util.List r9 = r9.f5276e
            java.lang.Object r0 = r1.f10513e
            eِٚ r0 = (defpackage.InterfaceC11824e) r0
            java.lang.Object r5 = r1.f10517e
            r6 = r5
            eٟٓ r6 = (defpackage.C18277e) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.AbstractC0746e.subscription(r9, r7)
            r5.<init>(r7)
            java.util.Iterator r9 = r9.iterator()
        L26:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L3e
            java.lang.Object r7 = r9.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            eؑۘٛ r7 = defpackage.AbstractC17487e.metrica(r0, r7)
            r5.add(r7)
            goto L26
        L3e:
            eؕٗؗ r9 = new eؕٗؗ
            r0 = 0
            r9.<init>(r0, r5)
            r0 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0.billing = r10
            java.lang.Object r9 = r6.ad
            eًؙۡ r9 = (defpackage.C6272e) r9
            eّٓ۠ r10 = new eّٓ۠
            r1 = 0
            r10.<init>(r8, r1)
            r9.getClass()
            eٖؑٚ r1 = new eٖؑٚ
            r1.<init>(r9, r10)
            r0.yandex = r1
            java.lang.Object r9 = r6.ad
            eًؙۡ r9 = (defpackage.C6272e) r9
            eّٓ۠ r10 = new eّٓ۠
            r1 = 1
            r10.<init>(r8, r1)
            r9.getClass()
            eٖؑٚ r1 = new eٖؑٚ
            r1.<init>(r9, r10)
            r0.startapp = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1860e.<init>(eٌٍؚ, eْۜٚ):void");
    }

    @Override // defpackage.AbstractC4362e
    public final Set Signature() {
        List ad = this.adcel.f14374e.ad();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            AbstractC13480e.inmobi(linkedHashSet, ((AbstractC1186e) it.next()).mo483e().billing());
        }
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC4362e, defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        Object obj = this.vip.f10517e;
        return super.ad(c0520e, enumC2192e);
    }

    @Override // defpackage.AbstractC4362e
    public final void adcel(C0520e c0520e, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.startapp.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC1186e) it.next()).mo483e().ad(c0520e, EnumC2192e.f5573e));
        }
        C4956e c4956e = this.vip;
        arrayList.addAll(((InterfaceC0020e) ((C18277e) c4956e.f10517e).smaato).isPro(c0520e, this.adcel));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C0399e) ((InterfaceC9477e) ((C18277e) c4956e.f10517e).Signature)).metrica.yandex(c0520e, arrayList2, arrayList3, this.adcel, new C7161e(arrayList, 0));
    }

    @Override // defpackage.AbstractC4362e
    public final C11709e advert(C0520e c0520e) {
        return this.adcel.f14379e.license(c0520e);
    }

    @Override // defpackage.AbstractC4362e
    public final Set amazon() {
        List ad = this.adcel.f14374e.ad();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            Set license = ((AbstractC1186e) it.next()).mo483e().license();
            if (license == null) {
                return null;
            }
            AbstractC13480e.inmobi(linkedHashSet, license);
        }
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC4362e, defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        InterfaceC5052e interfaceC5052e;
        Object obj = this.vip.f10517e;
        C11467e c11467e = this.adcel.f14378e;
        return (c11467e == null || (interfaceC5052e = (InterfaceC5052e) ((C8286e) c11467e.f23070e).invoke(c0520e)) == null) ? super.appmetrica(c0520e, enumC2192e) : interfaceC5052e;
    }

    @Override // defpackage.AbstractC4362e
    public final Set loadAd() {
        C7025e c7025e = this.adcel;
        List ad = c7025e.f14374e.ad();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            AbstractC13480e.inmobi(linkedHashSet, ((AbstractC1186e) it.next()).mo483e().vip());
        }
        linkedHashSet.addAll(((InterfaceC0020e) ((C18277e) this.vip.f10517e).smaato).mo202extends(c7025e));
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final Collection metrica(C4942e c4942e, Function1 function1) {
        return (Collection) this.yandex.invoke();
    }

    @Override // defpackage.AbstractC4362e
    public final void mopub(C0520e c0520e, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.startapp.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC1186e) it.next()).mo483e().purchase(c0520e, EnumC2192e.f5573e));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C0399e) ((InterfaceC9477e) ((C18277e) this.vip.f10517e).Signature)).metrica.yandex(c0520e, arrayList2, arrayList3, this.adcel, new C7161e(arrayList, 0));
    }

    @Override // defpackage.AbstractC4362e, defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        Object obj = this.vip.f10517e;
        return super.purchase(c0520e, enumC2192e);
    }

    @Override // defpackage.AbstractC4362e
    public final boolean subscription(C0530e c0530e) {
        return ((InterfaceC2684e) ((C18277e) this.vip.f10517e).amazon).ad(this.adcel, c0530e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [eْۨٝ] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    @Override // defpackage.AbstractC4362e
    public final void yandex(ArrayList arrayList) {
        ?? r2;
        C11467e c11467e = this.adcel.f14378e;
        if (c11467e != null) {
            Set keySet = ((LinkedHashMap) c11467e.f23072e).keySet();
            r2 = new ArrayList();
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                InterfaceC5052e interfaceC5052e = (InterfaceC5052e) ((C8286e) c11467e.f23070e).invoke((C0520e) it.next());
                if (interfaceC5052e != null) {
                    r2.add(interfaceC5052e);
                }
            }
        } else {
            r2 = 0;
        }
        if (r2 == 0) {
            r2 = C13664e.f27089e;
        }
        arrayList.addAll(r2);
    }
}
