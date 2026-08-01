package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15655e {
    public final C1615e ad = AbstractC9180e.metrica(C14477e.appmetrica);
    public final LinkedHashSet adcel;
    public boolean advert;
    public boolean amazon;
    public final C12718e appmetrica;
    public int billing;
    public final C12718e license;
    public final C14688e metrica;
    public final LinkedHashSet mopub;
    public AbstractC13388e purchase;
    public boolean smaato;
    public final LinkedHashSet startapp;
    public final C1615e vip;
    public AbstractC10766e yandex;

    public C15655e() {
        C1615e metrica = AbstractC9180e.metrica(new C16957e());
        this.vip = metrica;
        this.metrica = new C14688e(metrica);
        this.license = new C12718e();
        this.appmetrica = new C12718e();
        this.startapp = new LinkedHashSet();
        this.adcel = new LinkedHashSet();
        this.mopub = new LinkedHashSet();
    }

    public final void ad(C11106e c11106e, AbstractC10766e abstractC10766e, int i) {
        if (abstractC10766e.ad == null) {
            (i != 0 ? i != 1 ? this.startapp : this.adcel : this.mopub).add(abstractC10766e);
            abstractC10766e.ad = c11106e;
            abstractC10766e.vip(i != 0 ? i != 1 ? this.amazon : this.advert : this.smaato);
            return;
        }
        throw new IllegalArgumentException(("Input '" + abstractC10766e + "' is already added to dispatcher " + abstractC10766e.ad + '.').toString());
    }

    public final AbstractC13388e metrica(int i) {
        Object obj;
        Object obj2;
        C12718e c12718e = this.appmetrica;
        C12718e c12718e2 = this.license;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = c12718e2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AbstractC13388e) obj).vip) {
                    break;
                }
            }
            AbstractC13388e abstractC13388e = (AbstractC13388e) obj;
            if (abstractC13388e != null) {
                return abstractC13388e;
            }
            Iterator it2 = c12718e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((AbstractC13388e) next).vip) {
                    obj3 = next;
                    break;
                }
            }
            return (AbstractC13388e) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = c12718e2.iterator();
            while (it3.hasNext()) {
                ((AbstractC13388e) it3.next()).getClass();
            }
            Iterator it4 = c12718e.iterator();
            while (it4.hasNext()) {
                ((AbstractC13388e) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = c12718e2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((AbstractC13388e) obj2).vip) {
                break;
            }
        }
        AbstractC13388e abstractC13388e2 = (AbstractC13388e) obj2;
        if (abstractC13388e2 != null) {
            return abstractC13388e2;
        }
        Iterator it6 = c12718e.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((AbstractC13388e) next2).vip) {
                obj3 = next2;
                break;
            }
        }
        return (AbstractC13388e) obj3;
    }

    public final void vip() {
        boolean z;
        boolean z2;
        C16957e c16957e;
        C12718e c12718e = this.license;
        if (c12718e == null || !c12718e.isEmpty()) {
            Iterator it = c12718e.iterator();
            while (it.hasNext()) {
                if (((AbstractC13388e) it.next()).vip) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        C12718e c12718e2 = this.appmetrica;
        if (c12718e2 == null || !c12718e2.isEmpty()) {
            Iterator it2 = c12718e2.iterator();
            while (it2.hasNext()) {
                if (((AbstractC13388e) it2.next()).vip) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.smaato != z;
        boolean z5 = this.advert != z2;
        boolean z6 = this.amazon != z3;
        LinkedHashSet linkedHashSet = this.mopub;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((AbstractC10766e) it3.next()).vip(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.adcel;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((AbstractC10766e) it4.next()).vip(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.startapp;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((AbstractC10766e) it5.next()).vip(z3);
            }
        }
        this.smaato = z;
        this.advert = z2;
        this.amazon = z3;
        AbstractC13388e abstractC13388e = this.purchase;
        if (abstractC13388e == null) {
            abstractC13388e = metrica(0);
        }
        AbstractC13388e abstractC13388e2 = this.purchase;
        if (abstractC13388e2 == null) {
            abstractC13388e2 = metrica(0);
        }
        if (AbstractC7890e.billing(abstractC13388e2, abstractC13388e)) {
            if (abstractC13388e2 == null) {
                c16957e = new C16957e();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = c12718e.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((AbstractC13388e) it6.next()).vip;
                }
                Iterator<E> it7 = c12718e2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((AbstractC13388e) it7.next()).vip;
                }
                AbstractC7255e abstractC7255e = abstractC13388e2.ad;
                C1169e license = AbstractC6874e.license();
                AbstractC13480e.inmobi(license, arrayList);
                license.add(abstractC7255e);
                AbstractC13480e.inmobi(license, C13664e.f27089e);
                c16957e = new C16957e(arrayList.size(), AbstractC6874e.metrica(license));
            }
            C1615e c1615e = this.vip;
            if (AbstractC7890e.billing((C16957e) c1615e.getValue(), c16957e)) {
                return;
            }
            c1615e.smaato(null, c16957e);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((AbstractC10766e) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((AbstractC10766e) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((AbstractC10766e) it10.next()).getClass();
            }
        }
    }
}
