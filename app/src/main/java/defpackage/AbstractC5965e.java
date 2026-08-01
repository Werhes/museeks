package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5965e {
    public static final C12816e ad = new C12816e("kotlin.jvm.JvmStatic");
    public static final String vip;

    static {
        StringBuilder sb = new StringBuilder();
        C2597e c2597e = C2597e.metrica;
        sb.append(c2597e.ad.ad.ad);
        sb.append('.');
        sb.append(c2597e.vip);
        vip = sb.toString();
    }

    public static final InterfaceC8826e ad(InterfaceC15954e interfaceC15954e) {
        if (interfaceC15954e instanceof InterfaceC8826e) {
            return (InterfaceC8826e) interfaceC15954e;
        }
        if (!(interfaceC15954e instanceof AbstractC3160e)) {
            return null;
        }
        InterfaceC15954e adcel = ((AbstractC3160e) interfaceC15954e).adcel();
        if (adcel instanceof InterfaceC8826e) {
            return (InterfaceC8826e) adcel;
        }
        return null;
    }

    public static final List adcel(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((InterfaceC18155e) AbstractC14437e.appmetrica((Annotation) it.next())).subs().getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        Class subs = ((InterfaceC18155e) AbstractC14437e.appmetrica(annotation)).subs();
                        AbstractC13480e.inmobi(arrayList2, (!subs.getSimpleName().equals("Container") || subs.getAnnotation(InterfaceC8472e.class) == null) ? Collections.singletonList(annotation) : Arrays.asList((Annotation[]) subs.getDeclaredMethod("value", null).invoke(annotation, null)));
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final boolean appmetrica(C12011e c12011e) {
        InterfaceC0861e isVip = c12011e.isVip();
        C8404e c8404e = isVip instanceof C8404e ? (C8404e) isVip : null;
        if (c8404e == null || !c8404e.mo2270private()) {
            return false;
        }
        C10444e m2426final = c8404e.m2426final();
        return (m2426final != null ? m2426final.f20622e : null) == null;
    }

    public static final Annotation billing(InterfaceC16566e interfaceC16566e) {
        InterfaceC5052e license = AbstractC2876e.license(interfaceC16566e);
        Class yandex = license != null ? yandex(license) : null;
        if (yandex == null) {
            yandex = null;
        }
        if (yandex == null) {
            return null;
        }
        Set<Map.Entry> entrySet = interfaceC16566e.advert().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            C0520e c0520e = (C0520e) entry.getKey();
            Object startapp = startapp((AbstractC13656e) entry.getValue(), yandex.getClassLoader());
            C6571e c6571e = startapp != null ? new C6571e(c0520e.vip(), startapp) : null;
            if (c6571e != null) {
                arrayList.add(c6571e);
            }
        }
        return (Annotation) AbstractC6401e.yandex(yandex, AbstractC10064e.mopub(arrayList));
    }

    public static final InterfaceC6647e license(Class cls, AbstractC0641e abstractC0641e, InterfaceC11824e interfaceC11824e, C17221e c17221e, AbstractC8470e abstractC8470e, Function2 function2) {
        List list;
        C14723e ad2 = AbstractC14743e.ad(cls);
        if (abstractC0641e instanceof C9920e) {
            list = ((C9920e) abstractC0641e).f19600e;
        } else {
            if (!(abstractC0641e instanceof C17485e)) {
                throw new IllegalStateException(("Unsupported message: " + abstractC0641e).toString());
            }
            list = ((C17485e) abstractC0641e).f34275e;
        }
        List list2 = list;
        C18277e c18277e = ad2.ad;
        return (InterfaceC6647e) function2.invoke(new C9864e(new C4956e(c18277e, interfaceC11824e, (InterfaceC5334e) c18277e.vip, c17221e, C5311e.vip, abstractC8470e, null, null, list2)), abstractC0641e);
    }

    public static final Object metrica(Type type) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (cls.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (cls.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (cls.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (cls.equals(Integer.TYPE)) {
            return 0;
        }
        if (cls.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (cls.equals(Long.TYPE)) {
            return 0L;
        }
        if (cls.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (cls.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final Class purchase(ClassLoader classLoader, C11709e c11709e, int i) {
        C13579e c13579e = c11709e.ad().ad;
        Integer signatures = AbstractC6507e.signatures(AbstractC5304e.m1872static(c13579e.ad, vip));
        if (signatures != null) {
            int intValue = signatures.intValue();
            C7692e c7692e = C7692e.metrica;
            return purchase(classLoader, new C11709e(c7692e.ad, c7692e.ad(intValue + 1)), i);
        }
        String str = C0696e.ad;
        C11709e billing = C0696e.billing(c13579e);
        if (billing == null) {
            billing = c11709e;
        }
        if (!billing.equals(c11709e)) {
            classLoader = AbstractC2677e.license(Unit.class);
        }
        String str2 = billing.ad.ad.ad;
        String str3 = billing.vip.ad.ad;
        if (AbstractC7890e.billing(str2, "kotlin")) {
            switch (str3.hashCode()) {
                case -901856463:
                    if (str3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str2.length() > 0) {
            sb.append(str2.concat("."));
        }
        sb.append(str3.replace('.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        return AbstractC15365e.license(classLoader, sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object startapp(AbstractC13656e abstractC13656e, ClassLoader classLoader) {
        AbstractC1186e abstractC1186e;
        Class purchase;
        if (abstractC13656e instanceof C16621e) {
            return billing((InterfaceC16566e) ((C16621e) abstractC13656e).ad);
        }
        int i = 0;
        if (abstractC13656e instanceof C16938e) {
            C16938e c16938e = (C16938e) abstractC13656e;
            C7270e c7270e = c16938e instanceof C7270e ? (C7270e) c16938e : null;
            if (c7270e != null && (abstractC1186e = c7270e.metrica) != null) {
                Object obj = c16938e.ad;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(startapp((AbstractC13656e) it.next(), classLoader));
                }
                C0520e c0520e = AbstractC13270e.appmetrica;
                InterfaceC4077e advert = abstractC1186e.loadAd().advert();
                EnumC3702e subscription = advert == null ? null : AbstractC13270e.subscription(advert);
                switch (subscription == null ? -1 : AbstractC1522e.ad[subscription.ordinal()]) {
                    case -1:
                        if (!AbstractC13270e.isPro(abstractC1186e)) {
                            throw new IllegalStateException(("Not an array type: " + abstractC1186e).toString());
                        }
                        AbstractC1186e vip2 = ((AbstractC16232e) AbstractC13480e.m3590instanceof(abstractC1186e.mopub())).vip();
                        InterfaceC4077e advert2 = vip2.loadAd().advert();
                        InterfaceC5052e interfaceC5052e = advert2 instanceof InterfaceC5052e ? (InterfaceC5052e) advert2 : null;
                        if (interfaceC5052e == null) {
                            throw new IllegalStateException(("Not a class type: " + vip2).toString());
                        }
                        if (AbstractC13270e.m3538interface(vip2)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                strArr[i] = arrayList.get(i);
                                i++;
                            }
                            return strArr;
                        }
                        if (AbstractC13270e.vip(interfaceC5052e, AbstractC0206e.f1429abstract)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                clsArr[i] = arrayList.get(i);
                                i++;
                            }
                            return clsArr;
                        }
                        C11709e purchase2 = AbstractC2876e.purchase(interfaceC5052e);
                        if (purchase2 != null && (purchase = purchase(classLoader, purchase2, 0)) != null) {
                            Object[] objArr = (Object[]) Array.newInstance((Class<?>) purchase, ((List) obj).size());
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new C14803e(10);
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            cArr[i] = ((Character) arrayList.get(i)).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            bArr[i] = ((Byte) arrayList.get(i)).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            sArr[i] = ((Short) arrayList.get(i)).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            iArr[i] = ((Integer) arrayList.get(i)).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            fArr[i] = ((Float) arrayList.get(i)).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            jArr[i] = ((Long) arrayList.get(i)).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (abstractC13656e instanceof C8259e) {
            C6571e c6571e = (C6571e) ((C8259e) abstractC13656e).ad;
            C11709e c11709e = (C11709e) c6571e.f13544e;
            C0520e c0520e2 = (C0520e) c6571e.f13543e;
            Class purchase3 = purchase(classLoader, c11709e, 0);
            if (purchase3 != null) {
                return Enum.valueOf(purchase3, c0520e2.vip());
            }
        } else {
            if (!(abstractC13656e instanceof C5644e)) {
                if ((abstractC13656e instanceof C15873e) || (abstractC13656e instanceof C12928e)) {
                    return null;
                }
                return abstractC13656e.vip();
            }
            AbstractC4488e abstractC4488e = (AbstractC4488e) ((C5644e) abstractC13656e).ad;
            if (abstractC4488e instanceof C1646e) {
                C5302e c5302e = ((C1646e) abstractC4488e).ad;
                return purchase(classLoader, c5302e.ad, c5302e.vip);
            }
            if (!(abstractC4488e instanceof C16637e)) {
                throw new C14803e(10);
            }
            InterfaceC4077e advert3 = ((C16637e) abstractC4488e).ad.loadAd().advert();
            InterfaceC5052e interfaceC5052e2 = advert3 instanceof InterfaceC5052e ? (InterfaceC5052e) advert3 : null;
            if (interfaceC5052e2 != null) {
                return yandex(interfaceC5052e2);
            }
        }
        return null;
    }

    public static final List vip(InterfaceC15633e interfaceC15633e) {
        Annotation billing;
        InterfaceC2460e<InterfaceC16566e> annotations = interfaceC15633e.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC16566e interfaceC16566e : annotations) {
            InterfaceC3054e adcel = interfaceC16566e.adcel();
            if (adcel instanceof C0515e) {
                billing = ((C0515e) adcel).f2628e;
            } else if (adcel instanceof C10253e) {
                AbstractC18469e abstractC18469e = ((C10253e) adcel).f20269e;
                C2430e c2430e = abstractC18469e instanceof C2430e ? (C2430e) abstractC18469e : null;
                billing = c2430e != null ? c2430e.ad : null;
            } else {
                billing = billing(interfaceC16566e);
            }
            if (billing != null) {
                arrayList.add(billing);
            }
        }
        return adcel(arrayList);
    }

    public static final Class yandex(InterfaceC5052e interfaceC5052e) {
        InterfaceC3054e adcel = interfaceC5052e.adcel();
        if (adcel instanceof C16835e) {
            return ((C16835e) adcel).f32984e.ad;
        }
        if (adcel instanceof C10253e) {
            return ((C17070e) ((C10253e) adcel).f20269e).ad;
        }
        C11709e purchase = AbstractC2876e.purchase(interfaceC5052e);
        if (purchase == null) {
            return null;
        }
        return purchase(AbstractC2677e.license(interfaceC5052e.getClass()), purchase, 0);
    }
}
