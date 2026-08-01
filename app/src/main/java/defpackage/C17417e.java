package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۦٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17417e implements InterfaceC7351e {
    public final String ad;
    public final ArrayList metrica;
    public final C7725e vip;

    public C17417e(String str, C7725e c7725e) {
        this.ad = str;
        this.vip = c7725e;
        C1169e license = AbstractC6874e.license();
        AbstractC15203e.vip(license, c7725e);
        C1169e metrica = AbstractC6874e.metrica(license);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(metrica, 10));
        ListIterator listIterator = metrica.listIterator(0);
        while (true) {
            C11045e c11045e = (C11045e) listIterator;
            if (!c11045e.hasNext()) {
                break;
            } else {
                arrayList.add(((InterfaceC4024e) c11045e.next()).metrica());
            }
        }
        List<AbstractC17230e> premium = AbstractC13480e.premium(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(premium, 10));
        for (AbstractC17230e abstractC17230e : premium) {
            Object vip = abstractC17230e.vip();
            if (vip == null) {
                throw new IllegalArgumentException(("The field '" + abstractC17230e.metrica() + "' does not define a default value").toString());
            }
            arrayList2.add(new C14409e(abstractC17230e.ad(), vip));
        }
        this.metrica = arrayList2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [eّٓۥ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [eّٓۥ, java.lang.Object] */
    @Override // defpackage.InterfaceC14232e
    public final C12469e ad() {
        C12469e ad = this.vip.ad();
        ArrayList arrayList = this.metrica;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14409e c14409e = (C14409e) it.next();
            arrayList2.add(new C18253e(c14409e.vip, new C11476e(1, c14409e.ad, C17681e.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0, 0, 9)));
        }
        boolean isEmpty = arrayList2.isEmpty();
        InterfaceC10471e interfaceC10471e = C14378e.ad;
        InterfaceC10471e c14412e = isEmpty ? interfaceC10471e : arrayList2.size() == 1 ? (InterfaceC10471e) AbstractC13480e.m3590instanceof(arrayList2) : new C14412e(arrayList2);
        if (c14412e instanceof C14378e) {
            return new Object();
        }
        AbstractC6874e.startapp(new C6571e(new C11476e(1, c14412e, InterfaceC10471e.class, "test", "test(Ljava/lang/Object;)Z", 0, 0, 10), new Object()), new C6571e(new C11476e(1, interfaceC10471e, C14378e.class, "test", "test(Ljava/lang/Object;)Z", 0, 0, 11), ad));
        return new Object();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17417e)) {
            return false;
        }
        C17417e c17417e = (C17417e) obj;
        return this.ad.equals(c17417e.ad) && this.vip.equals(c17417e.vip);
    }

    public final int hashCode() {
        return this.vip.ad.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.ad + ", " + this.vip + ')';
    }

    @Override // defpackage.InterfaceC14232e
    public final C6195e vip() {
        C6195e vip = this.vip.vip();
        C6195e vip2 = new C11629e(this.ad).vip();
        boolean isEmpty = this.metrica.isEmpty();
        C13664e c13664e = C13664e.f27089e;
        return new C6195e(c13664e, AbstractC6874e.startapp(vip, AbstractC16155e.vip(AbstractC6874e.startapp(vip2, new C6195e(isEmpty ? c13664e : Collections.singletonList(new C14795e(new C6846e(17, this))), c13664e)))));
    }
}
