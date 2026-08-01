package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٛۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18214e implements InterfaceC0020e, InterfaceC2684e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC8614e[] f35655e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C1159e f35656e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC10226e f35657e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0394e f35658e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0394e f35659e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC5334e f35660e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C1159e f35661e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C0394e f35662e;

    static {
        C12156e c12156e = new C12156e(C18214e.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        f35655e = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(C18214e.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, c12232e), AbstractC4653e.tapsense(C18214e.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, c12232e)};
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r10v3, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r10v6, types: [eٖؑٚ, eٖۥٌ] */
    public C18214e(C16113e c16113e, C6272e c6272e, C3411e c3411e) {
        this.f35660e = c16113e;
        this.f35658e = new C16622e(c6272e, c3411e);
        C13726e c13726e = new C13726e(new C11918e(c16113e, new C12816e("java.io"), 1), C0520e.appmetrica("Serializable"), 4, 2, Collections.singletonList(new C6012e(c6272e, new C10565e(this, 1))), c6272e);
        c13726e.mopub(C9494e.vip, C3295e.f7451e, null);
        this.f35657e = c13726e.mo1458e();
        this.f35659e = new C16622e(c6272e, new C12056e(this, c6272e, 25));
        this.f35656e = new C1159e(c6272e, new ConcurrentHashMap(3, 1.0f, 2), new C3801e(1), 0);
        this.f35662e = new C16622e(c6272e, new C10565e(this, 0));
        this.f35661e = c6272e.vip(new C17877e(19, this));
    }

    @Override // defpackage.InterfaceC2684e
    public final boolean ad(InterfaceC5052e interfaceC5052e, C0530e c0530e) {
        C10184e vip = vip(interfaceC5052e);
        if (vip == null || !c0530e.getAnnotations().amazon(AbstractC0493e.ad)) {
            return true;
        }
        license().getClass();
        String vip2 = AbstractC5209e.vip(c0530e, 3);
        Collection ad = vip.mopub().ad(c0530e.getName(), EnumC2192e.f5578e);
        if ((ad instanceof Collection) && ad.isEmpty()) {
            return false;
        }
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            if (AbstractC7890e.billing(AbstractC5209e.vip((C1117e) it.next(), 3), vip2)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC0020e
    /* renamed from: extends */
    public final Collection mo202extends(InterfaceC5052e interfaceC5052e) {
        Set set;
        license().getClass();
        C10184e vip = vip(interfaceC5052e);
        if (vip == null || (set = vip.mopub().vip()) == null) {
            set = C3295e.f7451e;
        }
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, java.io.Serializable] */
    @Override // defpackage.InterfaceC0020e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection isPro(defpackage.C0520e r20, defpackage.InterfaceC5052e r21) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18214e.isPro(eؑۘٛ, eؗٞؓ):java.util.Collection");
    }

    public final C6499e license() {
        InterfaceC8614e interfaceC8614e = f35655e[0];
        return (C6499e) this.f35658e.invoke();
    }

    @Override // defpackage.InterfaceC0020e
    public final Collection metrica(InterfaceC5052e interfaceC5052e) {
        int i = AbstractC2876e.ad;
        C13579e purchase = AbstractC14300e.purchase(interfaceC5052e);
        LinkedHashSet linkedHashSet = C17405e.ad;
        C13579e c13579e = AbstractC0206e.billing;
        boolean equals = purchase.equals(c13579e);
        boolean z = false;
        AbstractC10226e abstractC10226e = this.f35657e;
        if (!equals) {
            HashMap hashMap = AbstractC0206e.f1447return;
            if (hashMap.get(purchase) == null) {
                if (purchase.equals(c13579e) || hashMap.get(purchase) != null) {
                    z = true;
                } else {
                    String str = C0696e.ad;
                    C11709e billing = C0696e.billing(purchase);
                    if (billing != null) {
                        try {
                            z = Serializable.class.isAssignableFrom(Class.forName(billing.ad().ad.ad));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return z ? Collections.singletonList(abstractC10226e) : C13664e.f27089e;
            }
        }
        InterfaceC8614e interfaceC8614e = f35655e[1];
        return AbstractC6874e.startapp((AbstractC10226e) this.f35659e.invoke(), abstractC10226e);
    }

    @Override // defpackage.InterfaceC0020e
    /* renamed from: protected */
    public final Collection mo203protected(InterfaceC5052e interfaceC5052e) {
        InterfaceC5052e admob;
        C17354e c17354e = C17354e.f34038e;
        if (interfaceC5052e.mo1724e() == 1) {
            license().getClass();
            C10184e vip = vip(interfaceC5052e);
            if (vip != null && (admob = C11047e.admob(AbstractC2876e.billing(vip), C7776e.purchase)) != null) {
                C4542e c4542e = new C4542e(AbstractC8230e.metrica(admob, vip));
                List list = (List) vip.f20144e.admob.invoke();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    C13579e c13579e = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    C7283e c7283e = (C7283e) next;
                    C7283e c7283e2 = c7283e;
                    if (c7283e2.advert().ad.f5193e) {
                        Collection mo1732throw = admob.mo1732throw();
                        if (!(mo1732throw instanceof Collection) || !mo1732throw.isEmpty()) {
                            Iterator it2 = mo1732throw.iterator();
                            while (it2.hasNext()) {
                                if (C14514e.adcel((C7283e) it2.next(), c7283e.remoteconfig(c4542e)) == 1) {
                                    break;
                                }
                            }
                        }
                        if (c7283e2.mo330e().size() == 1) {
                            InterfaceC4077e advert = ((C13043e) AbstractC13480e.m3590instanceof(c7283e2.mo330e())).ad().loadAd().advert();
                            if (advert != null) {
                                int i = AbstractC2876e.ad;
                                c13579e = AbstractC14300e.purchase(advert);
                            }
                            int i2 = AbstractC2876e.ad;
                            if (AbstractC7890e.billing(c13579e, AbstractC14300e.purchase(interfaceC5052e))) {
                            }
                        }
                        if (!AbstractC13270e.subs(c7283e)) {
                            LinkedHashSet linkedHashSet = C17405e.purchase;
                            String vip2 = AbstractC5209e.vip(c7283e, 3);
                            String str = C0696e.ad;
                            C11709e billing = C0696e.billing(AbstractC2876e.billing(vip).ad);
                            if (!linkedHashSet.contains((billing != null ? C1553e.appmetrica(billing) : AbstractC9164e.license(vip, c17354e)) + '.' + vip2)) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C7283e c7283e3 = (C7283e) it3.next();
                    C7283e c7283e4 = c7283e3;
                    c7283e4.getClass();
                    C15704e m3897e = c7283e4.m3897e(C4542e.vip);
                    m3897e.f30932e = interfaceC5052e;
                    m3897e.remoteconfig(interfaceC5052e.mo1458e());
                    m3897e.f30934e = true;
                    AbstractC3370e purchase = c4542e.purchase();
                    if (purchase == null) {
                        C15704e.vip(37);
                        throw null;
                    }
                    m3897e.f30944e = purchase;
                    LinkedHashSet linkedHashSet2 = C17405e.billing;
                    String vip3 = AbstractC5209e.vip(c7283e3, 3);
                    String str2 = C0696e.ad;
                    C11709e billing2 = C0696e.billing(AbstractC2876e.billing(vip).ad);
                    if (!linkedHashSet2.contains((billing2 != null ? C1553e.appmetrica(billing2) : AbstractC9164e.license(vip, c17354e)) + '.' + vip3)) {
                        InterfaceC8614e interfaceC8614e = f35655e[2];
                        m3897e.loadAd((InterfaceC2460e) this.f35662e.invoke());
                    }
                    arrayList2.add((C7283e) m3897e.f30943e.mo2772e(m3897e));
                }
                return arrayList2;
            }
        }
        return C13664e.f27089e;
    }

    public final C10184e vip(InterfaceC5052e interfaceC5052e) {
        C12816e ad;
        if (interfaceC5052e == null) {
            AbstractC13270e.ad(108);
            throw null;
        }
        if (!AbstractC13270e.vip(interfaceC5052e, AbstractC0206e.ad) && AbstractC13270e.m3539this(interfaceC5052e)) {
            int i = AbstractC2876e.ad;
            C13579e purchase = AbstractC14300e.purchase(interfaceC5052e);
            if (purchase.license()) {
                String str = C0696e.ad;
                C11709e billing = C0696e.billing(purchase);
                if (billing != null && (ad = billing.ad()) != null) {
                    InterfaceC5052e billing2 = AbstractC8797e.billing(license().ad, ad);
                    if (billing2 instanceof C10184e) {
                        return (C10184e) billing2;
                    }
                }
            }
        }
        return null;
    }
}
