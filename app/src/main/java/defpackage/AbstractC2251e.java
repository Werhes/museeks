package defpackage;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۧۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2251e {
    public static final C2443e ad = new C2443e("CLOSED", 2);

    public static final Class Signature(AbstractC1186e abstractC1186e) {
        AbstractC10226e billing;
        Class loadAd = loadAd(abstractC1186e.loadAd().advert());
        if (loadAd == null) {
            return null;
        }
        if (AbstractC11957e.appmetrica(abstractC1186e) && ((billing = AbstractC17093e.billing(abstractC1186e)) == null || AbstractC11957e.appmetrica(billing) || AbstractC13270e.m3536class(billing))) {
            return null;
        }
        return loadAd;
    }

    public static final Object ad(Object obj, InterfaceC0390e interfaceC0390e) {
        AbstractC1186e billing;
        Class Signature;
        Method yandex;
        return (((interfaceC0390e instanceof InterfaceC2188e) && AbstractC17093e.license((InterfaceC8185e) interfaceC0390e)) || (billing = billing(interfaceC0390e)) == null || (Signature = Signature(billing)) == null || (yandex = yandex(Signature, interfaceC0390e)) == null) ? obj : yandex.invoke(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final ArrayList adcel(AbstractC10226e abstractC10226e) {
        ?? singletonList;
        if (!AbstractC17093e.purchase(abstractC10226e)) {
            return null;
        }
        InterfaceC5052e interfaceC5052e = (InterfaceC5052e) abstractC10226e.loadAd().advert();
        int i = AbstractC2876e.ad;
        Object mo1728e = interfaceC5052e != null ? interfaceC5052e.mo1728e() : null;
        ArrayList arrayList = (mo1728e instanceof C0940e ? (C0940e) mo1728e : null).ad;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6571e c6571e = (C6571e) it.next();
            C0520e c0520e = (C0520e) c6571e.f13544e;
            ArrayList adcel = adcel((AbstractC10226e) c6571e.f13543e);
            if (adcel != null) {
                singletonList = new ArrayList(AbstractC0746e.subscription(adcel, 10));
                Iterator it2 = adcel.iterator();
                while (it2.hasNext()) {
                    singletonList.add(c0520e.metrica() + '-' + ((String) it2.next()));
                }
            } else {
                singletonList = Collections.singletonList(c0520e.metrica());
            }
            AbstractC13480e.inmobi(arrayList2, singletonList);
        }
        return arrayList2;
    }

    public static String admob(int i, String str) {
        if (str != null && i >= 0) {
            return str.length() > i ? str.substring(0, i) : str;
        }
        return null;
    }

    public static boolean advert(String str) {
        if (str.length() < 3 || str.length() != 3) {
            return false;
        }
        C16582e yandex = C16582e.yandex();
        if (yandex.purchase == null) {
            synchronized (yandex) {
                try {
                    if (yandex.purchase == null) {
                        yandex.purchase = C16582e.advert();
                    }
                } finally {
                }
            }
        }
        return yandex.purchase.containsKey(str);
    }

    public static String amazon(String str) {
        if (str == null) {
            return null;
        }
        char[] cArr = new char[str.length()];
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) != '-') {
                cArr[i] = str.charAt(i2);
                i++;
            }
        }
        return new String(cArr, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if ((r0 != null ? defpackage.AbstractC17093e.vip(r0) : false) == true) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        if ((r0 != null ? defpackage.AbstractC17093e.appmetrica(r0) : false) == true) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.InterfaceC9739e appmetrica(defpackage.InterfaceC0390e r3, defpackage.InterfaceC9739e r4, boolean r5) {
        /*
            boolean r0 = defpackage.AbstractC17093e.ad(r3)
            if (r0 != 0) goto La0
            java.util.List r0 = r3.mo2242e()
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L12
            goto L3a
        L12:
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            eُْٖ r1 = (defpackage.C16169e) r1
            eٜؒؒ r1 = r1.ad()
            eٜؗ٘ r1 = r1.loadAd()
            eْؖٝ r1 = r1.advert()
            if (r1 == 0) goto L35
            boolean r1 = defpackage.AbstractC17093e.appmetrica(r1)
            goto L36
        L35:
            r1 = r2
        L36:
            if (r1 == 0) goto L16
            goto La0
        L3a:
            java.util.List r0 = r3.mo330e()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L45
            goto L6e
        L45:
            java.util.Iterator r0 = r0.iterator()
        L49:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r0.next()
            eْؖؕ r1 = (defpackage.C13043e) r1
            eٖؑ٘ r1 = (defpackage.AbstractC0338e) r1
            eٜؒؒ r1 = r1.ad()
            eٜؗ٘ r1 = r1.loadAd()
            eْؖٝ r1 = r1.advert()
            if (r1 == 0) goto L6a
            boolean r1 = defpackage.AbstractC17093e.appmetrica(r1)
            goto L6b
        L6a:
            r1 = r2
        L6b:
            if (r1 == 0) goto L49
            goto La0
        L6e:
            eٜؒؒ r0 = r3.inmobi()
            r1 = 1
            if (r0 == 0) goto L88
            eٜؗ٘ r0 = r0.loadAd()
            eْؖٝ r0 = r0.advert()
            if (r0 == 0) goto L84
            boolean r0 = defpackage.AbstractC17093e.vip(r0)
            goto L85
        L84:
            r0 = r2
        L85:
            if (r0 != r1) goto L88
            goto La0
        L88:
            eٜؒؒ r0 = billing(r3)
            if (r0 == 0) goto L9f
            eٜؗ٘ r0 = r0.loadAd()
            eْؖٝ r0 = r0.advert()
            if (r0 == 0) goto L9c
            boolean r2 = defpackage.AbstractC17093e.appmetrica(r0)
        L9c:
            if (r2 != r1) goto L9f
            goto La0
        L9f:
            return r4
        La0:
            eُٜ۟ r0 = new eُٜ۟
            r0.<init>(r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2251e.appmetrica(eؑٚؐ, eٍۚۖ, boolean):eٍۚۖ");
    }

    public static final AbstractC1186e billing(InterfaceC0390e interfaceC0390e) {
        C16169e mo327e = interfaceC0390e.mo327e();
        C16169e mo329e = interfaceC0390e.mo329e();
        if (mo327e != null) {
            return mo327e.ad();
        }
        if (mo329e != null) {
            if (interfaceC0390e instanceof InterfaceC11788e) {
                return mo329e.ad();
            }
            InterfaceC15498e mo1351switch = interfaceC0390e.mo1351switch();
            InterfaceC5052e interfaceC5052e = mo1351switch instanceof InterfaceC5052e ? (InterfaceC5052e) mo1351switch : null;
            if (interfaceC5052e != null) {
                return interfaceC5052e.mo1458e();
            }
        }
        return null;
    }

    public static AbstractC9027e license(byte[] bArr) {
        BigInteger firebase;
        BigInteger bigInteger;
        C16833e c16833e;
        if (bArr == null) {
            throw new IllegalArgumentException("privateKeyInfoData array null");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("privateKeyInfoData array empty");
        }
        C7179e loadAd = C7179e.loadAd(Cdefault.inmobi(bArr));
        if (loadAd == null) {
            throw new IllegalArgumentException("keyInfo argument null");
        }
        Cprotected cprotected = loadAd.f14671e;
        C16527e c16527e = loadAd.f14672e;
        Ctry ctry = c16527e.f32408e;
        subs subsVar = c16527e.f32407e;
        if (ctry.isVip(InterfaceC5051e.f10833protected) || ctry.isVip(InterfaceC5051e.f10838super) || ctry.isVip(InterfaceC2796e.f6746e)) {
            C10897e loadAd2 = C10897e.loadAd(loadAd.admob());
            return new C16043e(loadAd2.f21569e, loadAd2.f21567e, loadAd2.f21571e, loadAd2.f21566e, loadAd2.f21575e, loadAd2.f21574e, loadAd2.f21570e, loadAd2.f21572e, false);
        }
        if (ctry.isVip(InterfaceC5051e.f10829instanceof)) {
            C3204e loadAd3 = C3204e.loadAd(subsVar);
            Cthis cthis = (Cthis) loadAd.admob();
            BigInteger Signature = loadAd3.Signature();
            return new C4025e(cthis.firebase(), new C3236e(Signature != null ? Signature.intValue() : 0, loadAd3.f7322e.crashlytics(), loadAd3.f7321e.crashlytics()));
        }
        if (ctry.isVip(InterfaceC12598e.startapp)) {
            C15292e loadAd4 = C15292e.loadAd(subsVar);
            return new C1457e(((Cthis) loadAd.admob()).firebase(), new C1559e(0, loadAd4.f30215e.crashlytics(), loadAd4.f30214e.crashlytics()));
        }
        C12573e c12573e = null;
        C6818e c6818e = null;
        if (ctry.isVip(InterfaceC16631e.f32637e)) {
            Cthis cthis2 = (Cthis) loadAd.admob();
            if (subsVar != null) {
                C17676e loadAd5 = C17676e.loadAd(subsVar.billing());
                c6818e = new C6818e(loadAd5.f34641e.crashlytics(), loadAd5.f34640e.crashlytics(), loadAd5.f34639e.crashlytics());
            }
            return new C3592e(cthis2.firebase(), c6818e);
        }
        if (ctry.isVip(InterfaceC16631e.f32653e)) {
            C8101e loadAd6 = C8101e.loadAd(loadAd.admob());
            Cdefault cdefault = C14004e.loadAd(subsVar.billing()).f27736e;
            if (cdefault instanceof Ctry) {
                Ctry m4669interface = Ctry.m4669interface(cdefault);
                AbstractC4068e abstractC4068e = (AbstractC4068e) AbstractC11301e.metrica.get(m4669interface);
                C9300e license = abstractC4068e != null ? abstractC4068e.license() : null;
                if (license == null) {
                    license = AbstractC16377e.appmetrica(m4669interface);
                }
                c16833e = new C17494e(m4669interface, license);
            } else {
                c16833e = new C16833e(C9300e.loadAd(cdefault));
            }
            return new C6988e(loadAd6.Signature(), c16833e);
        }
        if (ctry.isVip(InterfaceC16800e.ad)) {
            return 32 == cprotected.f36449e.length ? new C0445e(loadAd.Signature().f36449e) : new C0445e(Cprotected.subs(loadAd.admob()).f36449e);
        }
        if (ctry.isVip(InterfaceC16800e.vip)) {
            return 56 == cprotected.f36449e.length ? new C14061e(loadAd.Signature().f36449e) : new C14061e(Cprotected.subs(loadAd.admob()).f36449e);
        }
        if (ctry.isVip(InterfaceC16800e.metrica)) {
            return new C1694e(Cprotected.subs(loadAd.admob()).f36449e);
        }
        if (ctry.isVip(InterfaceC16800e.license)) {
            return new C17565e(Cprotected.subs(loadAd.admob()).f36449e);
        }
        if (!ctry.isVip(InterfaceC6859e.advert) && !ctry.isVip(InterfaceC13429e.purchase) && !ctry.isVip(InterfaceC13429e.appmetrica)) {
            throw new RuntimeException("algorithm identifier in private key not recognised");
        }
        C17984e loadAd7 = C17984e.loadAd(subsVar);
        Cdefault billing = subsVar.billing();
        if ((billing instanceof Ccatch) && (Ccatch.m168class(billing).size() == 2 || Ccatch.m168class(billing).size() == 3)) {
            Ctry ctry2 = loadAd7.f35279e;
            c12573e = new C12573e(new C17494e(ctry2, AbstractC7899e.license(ctry2)), ctry2, loadAd7.f35278e, loadAd7.f35277e);
            int length = cprotected.f36449e.length;
            if (length == 32 || length == 64) {
                bigInteger = new BigInteger(1, AbstractC12442e.subs(loadAd.Signature().f36449e));
            } else {
                Cdefault admob = loadAd.admob();
                if (admob instanceof Cthis) {
                    firebase = Cthis.subs(admob).crashlytics();
                } else {
                    bigInteger = new BigInteger(1, AbstractC12442e.subs(Cprotected.subs(admob).f36449e));
                }
            }
            firebase = bigInteger;
        } else {
            Cdefault cdefault2 = C14004e.loadAd(subsVar).f27736e;
            if (cdefault2 instanceof Ctry) {
                Ctry m4669interface2 = Ctry.m4669interface(cdefault2);
                c12573e = new C12573e(new C17494e(m4669interface2, AbstractC16377e.appmetrica(m4669interface2)), loadAd7.f35279e, loadAd7.f35278e, loadAd7.f35277e);
            } else if (!(cdefault2 instanceof Cnative)) {
                c12573e = new C12573e(new C17494e(ctry, C9300e.loadAd(cdefault2)), loadAd7.f35279e, loadAd7.f35278e, loadAd7.f35277e);
            }
            Cdefault admob2 = loadAd.admob();
            firebase = admob2 instanceof Cthis ? Cthis.subs(admob2).firebase() : C8101e.loadAd(admob2).Signature();
        }
        return new C6988e(firebase, new C12573e(c12573e, loadAd7.f35279e, loadAd7.f35278e, loadAd7.f35277e));
    }

    public static final Class loadAd(InterfaceC15498e interfaceC15498e) {
        if (!(interfaceC15498e instanceof InterfaceC5052e) || !AbstractC17093e.vip(interfaceC15498e)) {
            return null;
        }
        InterfaceC5052e interfaceC5052e = (InterfaceC5052e) interfaceC15498e;
        Class yandex = AbstractC5965e.yandex(interfaceC5052e);
        if (yandex != null) {
            return yandex;
        }
        throw new Error("Class object for the class " + interfaceC5052e.getName() + " cannot be found (classId=" + AbstractC2876e.purchase((InterfaceC4077e) interfaceC15498e) + ')');
    }

    public static String metrica(String str) {
        if (str.length() < 4 || !C11673e.yandex().billing(str)) {
            return null;
        }
        if (C16582e.startapp().billing(str)) {
            return str;
        }
        return (String) AbstractC14953e.metrica.get(str.substring(0, 4));
    }

    public static long mopub(Object obj) {
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        throw new IllegalArgumentException("Unsupported value class: ".concat(obj.getClass().getName()));
    }

    public static final Object purchase(AbstractC12466e abstractC12466e, long j, Function2 function2) {
        while (true) {
            if (abstractC12466e.f24956e >= j && !abstractC12466e.license()) {
                return abstractC12466e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC4874e.f10345e;
            Object obj = atomicReferenceFieldUpdater.get(abstractC12466e);
            C2443e c2443e = ad;
            if (obj == c2443e) {
                return c2443e;
            }
            AbstractC12466e abstractC12466e2 = (AbstractC12466e) ((AbstractC4874e) obj);
            if (abstractC12466e2 == null) {
                abstractC12466e2 = (AbstractC12466e) function2.invoke(Long.valueOf(abstractC12466e.f24956e + 1), abstractC12466e);
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC12466e, null, abstractC12466e2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC12466e) != null) {
                        break;
                    }
                }
                if (abstractC12466e.license()) {
                    abstractC12466e.appmetrica();
                }
            }
            abstractC12466e = abstractC12466e2;
        }
    }

    public static final void smaato(InterfaceC17430e interfaceC17430e, Function1 function1) {
        C12402e metrica = interfaceC17430e.metrica();
        if (metrica.yandex()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        C0378e c0378e = metrica.f24834e;
        byte[] bArr = c0378e.ad;
        int i = c0378e.vip;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, c0378e.metrica - i);
        function1.invoke(wrap);
        int position = wrap.position() - i;
        if (position != 0) {
            if (position < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (position > c0378e.vip()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            metrica.skip(position);
        }
    }

    public static final ArrayList startapp(AbstractC10226e abstractC10226e) {
        ArrayList adcel = adcel(AbstractC14430e.vip(abstractC10226e));
        if (adcel == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(adcel, 10));
        Iterator it = adcel.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        Class yandex = AbstractC5965e.yandex((InterfaceC5052e) abstractC10226e.loadAd().advert());
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(yandex.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    public static String vip(String str) {
        String ad2;
        if (str.length() < 3 || (ad2 = AbstractC14953e.ad(str.substring(0, 3))) == null) {
            return null;
        }
        String str2 = (String) AbstractC14953e.metrica.get(ad2);
        if (str2 != null) {
            return str2;
        }
        if (C16582e.startapp().billing(ad2)) {
            return ad2;
        }
        return null;
    }

    public static final Method yandex(Class cls, InterfaceC0390e interfaceC0390e) {
        try {
            return cls.getDeclaredMethod("unbox-impl", null);
        } catch (NoSuchMethodException unused) {
            throw new Error("No unbox method found in inline class: " + cls + " (calling " + interfaceC0390e + ')');
        }
    }
}
