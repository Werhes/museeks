package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11800e {
    public final C7838e ad;
    public final C0583e billing;
    public final C1586e metrica;
    public final C12328e startapp;
    public final C18478e vip;
    public final C0583e yandex;
    public InterfaceC1686e license = C14611e.ad;
    public final C12328e appmetrica = new C12328e();
    public final C12328e purchase = new C12328e();

    public C11800e(C7838e c7838e, C18478e c18478e, C1586e c1586e) {
        this.ad = c7838e;
        this.vip = c18478e;
        this.metrica = c1586e;
        long[] jArr = AbstractC12981e.ad;
        this.billing = new C0583e();
        this.yandex = new C0583e();
        this.startapp = new C12328e();
    }

    public final void ad(String str, List list, boolean z) {
        AbstractC16049e abstractC16049e;
        String ad;
        vip(list);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C14609e) it.next()).vip.getAd());
        }
        C12328e c12328e = this.appmetrica;
        if (z) {
            c12328e.metrica(arrayList);
        } else {
            C14609e adcel = adcel(str);
            Integer valueOf = (adcel == null || (abstractC16049e = adcel.vip) == null || (ad = abstractC16049e.getAd()) == null) ? null : Integer.valueOf(c12328e.startapp(ad));
            int intValue = (valueOf != null ? valueOf.intValue() : 0) + 1;
            int i = c12328e.vip;
            if (intValue > i) {
                intValue = i;
            }
            c12328e.license(intValue, arrayList);
        }
        billing();
    }

    public final C14609e adcel(String str) {
        if (str == null) {
            return null;
        }
        return (C14609e) this.billing.billing(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d8 A[LOOP:0: B:11:0x00d2->B:13:0x00d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f0 A[LOOP:1: B:16:0x00ee->B:17:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0103 A[LOOP:2: B:20:0x0101->B:21:0x0103, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0131 A[LOOP:3: B:25:0x012b->B:27:0x0131, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable advert(java.lang.String r9, defpackage.AbstractC10731e r10) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11800e.advert(java.lang.String, eُؑ۠):java.io.Serializable");
    }

    public final ArrayList appmetrica() {
        C8794e appmetrica = this.appmetrica.appmetrica();
        ArrayList arrayList = new ArrayList();
        Iterator it = appmetrica.iterator();
        while (true) {
            C15986e c15986e = (C15986e) it;
            if (!c15986e.hasNext()) {
                return arrayList;
            }
            C14609e startapp = startapp((String) c15986e.next());
            if (startapp != null) {
                arrayList.add(startapp);
            }
        }
    }

    public final void billing() {
        C15420e c15420e = AbstractC6731e.ad;
        AbstractC5336e.purchase(this.ad, ExecutorC3603e.f8134e, 0, new C15238e(this, null, 3), 2);
    }

    public final List license() {
        InterfaceC9093e adcel = AbstractC7762e.adcel(new C1356e(1, this.appmetrica.appmetrica()), new C0638e(1, this.yandex, C0583e.class, "containsKey", "containsKey(Ljava/lang/Object;)Z", 0, 0, 15));
        return AbstractC7762e.Signature(adcel instanceof InterfaceC8108e ? ((InterfaceC8108e) adcel).take() : new C15809e(adcel));
    }

    public final void metrica() {
        this.appmetrica.purchase();
        this.billing.ad();
        this.yandex.ad();
        this.startapp.purchase();
        this.purchase.purchase();
        this.license = C14611e.ad;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eٖؑۡ, eُۙۨ] */
    public final C6571e mopub(String str) {
        C0583e c0583e = this.billing;
        C14609e c14609e = (C14609e) c0583e.billing(str);
        C12328e c12328e = this.purchase;
        if (c14609e == null) {
            c14609e = (C14609e) c0583e.billing(c12328e.billing());
        }
        int startapp = c12328e.startapp(c14609e.vip.getAd());
        C12328e c12328e2 = this.appmetrica;
        c12328e2.purchase();
        c12328e2.vip(c12328e);
        c12328e.purchase();
        int license = AbstractC3062e.license(startapp + 1, new C11241e(0, c12328e2.vip, 1));
        if (c12328e2.adcel() || startapp == -1) {
            return null;
        }
        List subList = c12328e2.appmetrica().subList(0, startapp);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C9783e) subList).iterator();
        while (it.hasNext()) {
            C14609e startapp2 = startapp((String) it.next());
            if (startapp2 != null) {
                arrayList.add(startapp2);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AbstractC1798e.vip((C14609e) it2.next()));
        }
        List subList2 = c12328e2.appmetrica().subList(license, c12328e2.vip);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = ((C9783e) subList2).iterator();
        while (it3.hasNext()) {
            C14609e startapp3 = startapp((String) it3.next());
            if (startapp3 != null) {
                arrayList3.add(startapp3);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(AbstractC1798e.vip((C14609e) it4.next()));
        }
        return new C6571e(arrayList2, arrayList4);
    }

    public final List purchase() {
        C8794e appmetrica = this.startapp.appmetrica();
        ArrayList arrayList = new ArrayList();
        Iterator it = appmetrica.iterator();
        while (true) {
            C15986e c15986e = (C15986e) it;
            if (!c15986e.hasNext()) {
                return AbstractC13480e.premium(arrayList);
            }
            C14609e c14609e = (C14609e) this.billing.billing((String) c15986e.next());
            if (c14609e != null) {
                arrayList.add(c14609e);
            }
        }
    }

    public final void smaato(List list, Map map) {
        metrica();
        C0583e c0583e = this.billing;
        c0583e.ad();
        C14609e c14609e = C14609e.metrica;
        Iterator it = C17138e.appmetrica(map.values()).iterator();
        while (it.hasNext()) {
            C14609e c14609e2 = (C14609e) it.next();
            c0583e.amazon(c14609e2.ad, c14609e2);
            this.yandex.amazon(c14609e2.vip.getAd(), c14609e2.ad);
        }
        C12328e c12328e = this.appmetrica;
        c12328e.purchase();
        this.purchase.purchase();
        c12328e.metrica(list);
        billing();
    }

    public final C14609e startapp(String str) {
        String str2;
        if (str == null || (str2 = (String) this.yandex.billing(str)) == null) {
            return null;
        }
        return (C14609e) this.billing.billing(str2);
    }

    public final void vip(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14609e c14609e = (C14609e) it.next();
            this.billing.amazon(c14609e.ad, c14609e);
            this.yandex.amazon(c14609e.vip.getAd(), c14609e.ad);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؑۡ, eُۙۨ] */
    public final C14609e yandex(Integer num) {
        if (num == null) {
            return null;
        }
        C12328e c12328e = this.startapp;
        if (new C11241e(0, c12328e.vip - 1, 1).appmetrica(num.intValue())) {
            return adcel((String) c12328e.yandex(num.intValue()));
        }
        return null;
    }
}
