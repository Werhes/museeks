package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘ۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7232e extends AbstractC1412e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C0317e f14759e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C11980e f14760e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7232e(defpackage.C11980e r11, defpackage.C0317e r12, int r13, defpackage.InterfaceC7573e r14) {
        /*
            r10 = this;
            java.lang.Object r0 = r11.f23950e
            eٗۙۨ r0 = (defpackage.C17241e) r0
            eِْؗ r2 = r0.ad
            eُّٟ r4 = new eُّٟ
            r1 = 0
            r4.<init>(r11, r12, r1)
            java.lang.reflect.TypeVariable r1 = r12.ad
            java.lang.String r1 = r1.getName()
            eؑۘٛ r5 = defpackage.C0520e.appmetrica(r1)
            r7 = 0
            eٍؗۘ r9 = r0.smaato
            r6 = 1
            r1 = r10
            r8 = r13
            r3 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.f14760e = r11
            r1.f14759e = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7232e.<init>(eِۚۘ, eٕؑؕ, int, eؚؚۤ):void");
    }

    @Override // defpackage.AbstractC17288e
    /* renamed from: eٖٕٚ */
    public final List mo609e() {
        Type[] bounds = this.f14759e.ad.getBounds();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C13652e(type));
        }
        C13652e c13652e = (C13652e) AbstractC13480e.m3603synchronized(arrayList);
        List list = arrayList;
        if (AbstractC7890e.billing(c13652e != null ? c13652e.ad : null, Object.class)) {
            list = C13664e.f27089e;
        }
        boolean isEmpty = list.isEmpty();
        C11980e c11980e = this.f14760e;
        if (isEmpty) {
            return Collections.singletonList(AbstractC1596e.ad(((C17241e) c11980e.f23950e).loadAd.amazon().appmetrica(), ((C17241e) c11980e.f23950e).loadAd.amazon().loadAd()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C18478e) c11980e.f23948e).m4538e((C13652e) it.next(), AbstractC10510e.purchase(2, false, this, 3)));
        }
        return arrayList2;
    }

    @Override // defpackage.AbstractC17288e
    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final List mo2272e(List list) {
        C11672e c11672e;
        AbstractC1186e abstractC1186e;
        AbstractC1186e mopub;
        C11980e c11980e = this.f14760e;
        C11672e c11672e2 = ((C17241e) c11980e.f23950e).subscription;
        c11672e2.getClass();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1186e abstractC1186e2 = (AbstractC1186e) it.next();
            if (AbstractC11957e.metrica(abstractC1186e2, C15146e.f29972e, null)) {
                c11672e = c11672e2;
                abstractC1186e = abstractC1186e2;
            } else {
                c11672e = c11672e2;
                abstractC1186e = abstractC1186e2;
                mopub = c11672e.mopub(new C6613e((InterfaceC15633e) this, false, c11980e, EnumC13937e.TYPE_PARAMETER_BOUNDS, false), abstractC1186e, C13664e.f27089e, null, false);
                if (mopub != null) {
                    arrayList.add(mopub);
                    c11672e2 = c11672e;
                }
            }
            mopub = abstractC1186e;
            arrayList.add(mopub);
            c11672e2 = c11672e;
        }
        return arrayList;
    }
}
