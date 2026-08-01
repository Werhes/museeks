package defpackage;

import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؐۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8404e extends AbstractC15529e implements InterfaceC7227e, InterfaceC8448e, InterfaceC10269e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final HashSet f17183e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f17184e = AbstractC18039e.appmetrica(2, new C9765e(this, 0));

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Class f17185e;

    static {
        LinkedHashSet linkedHashSet = AbstractC13894e.ad;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((C11709e) it.next()).ad().ad.toString());
        }
        f17183e = hashSet;
    }

    public C8404e(Class cls) {
        this.f17185e = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x001a A[SYNTHETIC] */
    /* renamed from: abstract, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m2421abstract(defpackage.C8404e r7, defpackage.InterfaceC8528e r8, int r9) {
        /*
            r7.getClass()
            eٍۦٛ r0 = new eٍۦٛ
            r1 = 0
            r0.<init>(r7, r1)
            r7 = 3
            r1 = 0
            java.util.Collection r7 = defpackage.AbstractC6261e.vip(r8, r1, r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L1a:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r7.next()
            eِٕٖ r2 = (defpackage.InterfaceC15498e) r2
            boolean r3 = r2 instanceof defpackage.InterfaceC0390e
            if (r3 == 0) goto L56
            r3 = r2
            eؑٚؐ r3 = (defpackage.InterfaceC0390e) r3
            eًؙۡ r4 = r3.advert()
            eًؙۡ r5 = defpackage.AbstractC6050e.yandex
            boolean r4 = defpackage.AbstractC7890e.billing(r4, r5)
            if (r4 != 0) goto L56
            if (r9 == 0) goto L55
            int r3 = r3.mo334e()
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L46
            r3 = r6
            goto L47
        L46:
            r3 = r5
        L47:
            if (r9 != r6) goto L4a
            r5 = r6
        L4a:
            if (r3 != r5) goto L56
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.mo758e(r0, r3)
            eِۧۡ r2 = (defpackage.AbstractC12141e) r2
            goto L57
        L55:
            throw r1
        L56:
            r2 = r1
        L57:
            if (r2 == 0) goto L1a
            r8.add(r2)
            goto L1a
        L5d:
            java.util.List r7 = defpackage.AbstractC13480e.m3575continue(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8404e.m2421abstract(eٌؐۘ, eٌؘؙ, int):java.util.List");
    }

    /* renamed from: default, reason: not valid java name */
    public static C13726e m2422default(C11709e c11709e, C14723e c14723e) {
        C18277e c18277e = c14723e.ad;
        C11918e c11918e = new C11918e((InterfaceC5334e) c18277e.vip, c11709e.ad, 0);
        C0520e purchase = c11709e.purchase();
        List singletonList = Collections.singletonList(((InterfaceC5334e) c18277e.vip).amazon().mopub("Any").mo1458e());
        C6272e c6272e = (C6272e) c18277e.ad;
        C13726e c13726e = new C13726e(c11918e, purchase, 1, 1, singletonList, c6272e);
        c13726e.mopub(new AbstractC18103e(c6272e, c13726e), C3295e.f7451e, null);
        return c13726e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC7227e
    public final List ad() {
        C13475e c13475e = ((C10448e) this.f17184e.getValue()).advert;
        InterfaceC8614e interfaceC8614e = C10448e.signatures[8];
        return (List) c13475e.invoke();
    }

    @Override // defpackage.InterfaceC7227e
    public final boolean applovin(Object obj) {
        Map map = AbstractC2677e.license;
        Class cls = this.f17185e;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return AbstractC9476e.adcel(num.intValue(), obj);
        }
        Class cls2 = (Class) AbstractC2677e.metrica.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    /* renamed from: case, reason: not valid java name */
    public final EnumC7649e m2423case() {
        EnumC7649e ad;
        C10444e m2426final = m2426final();
        if (m2426final != null && (ad = AbstractC8781e.ad(m2426final)) != null) {
            return ad;
        }
        Class cls = this.f17185e;
        return cls.isAnnotation() ? EnumC7649e.f15534e : cls.isInterface() ? EnumC7649e.f15527e : cls.isEnum() ? EnumC7649e.f15531e : cls.getSuperclass().isEnum() ? EnumC7649e.f15526e : EnumC7649e.f15529e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    /* renamed from: catch, reason: not valid java name */
    public final InterfaceC5052e m2424catch() {
        return ((C10448e) this.f17184e.getValue()).ad();
    }

    @Override // defpackage.InterfaceC7227e
    public final boolean equals(Object obj) {
        return (obj instanceof C8404e) && AbstractC14437e.purchase(this).equals(AbstractC14437e.purchase((InterfaceC7227e) obj));
    }

    @Override // defpackage.AbstractC15529e
    /* renamed from: extends, reason: not valid java name */
    public final Collection mo2425extends(C0520e c0520e) {
        InterfaceC8528e mo483e = m2424catch().mo1458e().mo483e();
        EnumC2192e enumC2192e = EnumC2192e.f5574e;
        return AbstractC13480e.m3584final(mo483e.purchase(c0520e, enumC2192e), m2424catch().mo1719e().purchase(c0520e, enumC2192e));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    /* renamed from: final, reason: not valid java name */
    public final C10444e m2426final() {
        return ((C10448e) this.f17184e.getValue()).vip();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC7227e
    public final List getTypeParameters() {
        C13475e c13475e = ((C10448e) this.f17184e.getValue()).adcel;
        InterfaceC8614e interfaceC8614e = C10448e.signatures[6];
        return (List) c13475e.invoke();
    }

    @Override // defpackage.AbstractC15529e
    /* renamed from: goto, reason: not valid java name */
    public final Collection mo2427goto(C0520e c0520e) {
        InterfaceC8528e mo483e = m2424catch().mo1458e().mo483e();
        EnumC2192e enumC2192e = EnumC2192e.f5574e;
        return AbstractC13480e.m3584final(mo483e.ad(c0520e, enumC2192e), m2424catch().mo1719e().ad(c0520e, enumC2192e));
    }

    @Override // defpackage.InterfaceC7227e
    public final int hashCode() {
        return AbstractC14437e.purchase(this).hashCode();
    }

    /* renamed from: implements, reason: not valid java name */
    public final C11709e m2428implements() {
        EnumC3702e license;
        C11709e c11709e = AbstractC4591e.ad;
        Class cls = this.f17185e;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            license = componentType.isPrimitive() ? EnumC8790e.vip(componentType.getSimpleName()).license() : null;
            if (license != null) {
                return new C11709e(AbstractC4972e.mopub, license.f8286e);
            }
            C12816e startapp = AbstractC0206e.billing.startapp();
            return new C11709e(startapp.vip(), startapp.ad.billing());
        }
        if (cls.equals(Void.TYPE)) {
            return AbstractC4591e.ad;
        }
        license = cls.isPrimitive() ? EnumC8790e.vip(cls.getSimpleName()).license() : null;
        if (license != null) {
            return new C11709e(AbstractC4972e.mopub, license.f8288e);
        }
        C11709e ad = AbstractC2677e.ad(cls);
        if (!ad.metrica) {
            String str = C0696e.ad;
            C11709e c11709e2 = (C11709e) C0696e.yandex.get(ad.ad().ad);
            if (c11709e2 != null) {
                return c11709e2;
            }
        }
        return ad;
    }

    @Override // defpackage.InterfaceC7227e
    /* renamed from: instanceof */
    public final boolean mo2269instanceof() {
        C10444e m2426final = m2426final();
        if (m2426final == null) {
            Class cls = this.f17185e;
            return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        }
        Csuper csuper = AbstractC8781e.appmetrica;
        InterfaceC8614e interfaceC8614e = AbstractC8781e.ad[10];
        return csuper.m4647interface(m2426final);
    }

    @Override // defpackage.AbstractC15529e
    /* renamed from: interface, reason: not valid java name */
    public final Collection mo2429interface() {
        InterfaceC5052e m2424catch = m2424catch();
        return (m2424catch.mo1724e() == 2 || m2424catch.mo1724e() == 6) ? C13664e.f27089e : m2424catch.mo1732throw();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC7227e
    public final String license() {
        C13475e c13475e = ((C10448e) this.f17184e.getValue()).purchase;
        InterfaceC8614e interfaceC8614e = C10448e.signatures[3];
        return (String) c13475e.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC7227e
    public final Object loadAd() {
        return ((C10448e) this.f17184e.getValue()).startapp.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC7227e
    public final String mopub() {
        C13475e c13475e = ((C10448e) this.f17184e.getValue()).appmetrica;
        InterfaceC8614e interfaceC8614e = C10448e.signatures[2];
        return (String) c13475e.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC7227e
    public final Collection premium() {
        C13475e c13475e = ((C10448e) this.f17184e.getValue()).remoteconfig;
        InterfaceC8614e interfaceC8614e = C10448e.signatures[17];
        return (Collection) c13475e.invoke();
    }

    @Override // defpackage.InterfaceC7227e
    /* renamed from: private */
    public final boolean mo2270private() {
        C10444e m2426final = m2426final();
        if (m2426final == null) {
            return false;
        }
        Csuper csuper = AbstractC8781e.purchase;
        InterfaceC8614e interfaceC8614e = AbstractC8781e.ad[14];
        return csuper.m4647interface(m2426final);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC7227e
    public final Collection purchase() {
        C13475e c13475e = ((C10448e) this.f17184e.getValue()).yandex;
        InterfaceC8614e interfaceC8614e = C10448e.signatures[5];
        return (Collection) c13475e.invoke();
    }

    @Override // defpackage.InterfaceC18155e
    public final Class subs() {
        return this.f17185e;
    }

    @Override // defpackage.InterfaceC7227e
    public final boolean subscription() {
        C10444e m2426final = m2426final();
        return (m2426final != null ? AbstractC8781e.ad(m2426final) : null) == EnumC7649e.f15530e;
    }

    @Override // defpackage.AbstractC15529e
    /* renamed from: this, reason: not valid java name */
    public final InterfaceC2188e mo2430this(int i) {
        C17485e c17485e;
        Class<?> declaringClass;
        Class cls = this.f17185e;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((C8404e) AbstractC3820e.ad.vip(declaringClass)).mo2430this(i);
        }
        InterfaceC5052e m2424catch = m2424catch();
        C7025e c7025e = m2424catch instanceof C7025e ? (C7025e) m2424catch : null;
        if (c7025e == null || (c17485e = (C17485e) AbstractC0863e.purchase(c7025e.f14369e, AbstractC5745e.yandex, i)) == null) {
            return null;
        }
        C4956e c4956e = c7025e.f14371e;
        return (InterfaceC2188e) AbstractC5965e.license(this.f17185e, c17485e, (InterfaceC11824e) c4956e.f10513e, (C17221e) c4956e.f10515e, c7025e.f14385e, C5983e.f12611e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC7227e
    /* renamed from: throw */
    public final Collection mo2271throw() {
        C13475e c13475e = ((C10448e) this.f17184e.getValue()).billing;
        InterfaceC8614e interfaceC8614e = C10448e.signatures[4];
        return (Collection) c13475e.invoke();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        C11709e m2428implements = m2428implements();
        C12816e c12816e = m2428implements.ad;
        String applovin = c12816e.ad.metrica() ? BuildConfig.FLAVOR : AbstractC4653e.applovin(new StringBuilder(), c12816e.ad.ad, '.');
        sb.append(applovin + m2428implements.vip.ad.ad.replace('.', '$'));
        return sb.toString();
    }
}
