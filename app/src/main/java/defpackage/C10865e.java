package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: eُؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10865e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC12141e f21526e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21527e;

    public /* synthetic */ C10865e(AbstractC12141e abstractC12141e, int i) {
        this.f21527e = i;
        this.f21526e = abstractC12141e;
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, eؕٛؓ] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Type[] lowerBounds;
        C6571e c6571e;
        Collection collection;
        int i;
        int i2 = this.f21527e;
        Type type = null;
        r5 = false;
        boolean z = false;
        int i3 = 1;
        AbstractC12141e abstractC12141e = this.f21526e;
        switch (i2) {
            case 0:
                return AbstractC5965e.vip(abstractC12141e.isPro());
            case 1:
                if (abstractC12141e.tapsense()) {
                    Object m3569abstract = AbstractC13480e.m3569abstract(abstractC12141e.vip().ad());
                    ParameterizedType parameterizedType = m3569abstract instanceof ParameterizedType ? (ParameterizedType) m3569abstract : null;
                    if (AbstractC7890e.billing(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC5083e.class)) {
                        Object m676try = AbstractC1660e.m676try(parameterizedType.getActualTypeArguments());
                        WildcardType wildcardType = m676try instanceof WildcardType ? (WildcardType) m676try : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) AbstractC1660e.applovin(lowerBounds);
                        }
                    }
                }
                return type == null ? abstractC12141e.vip().inmobi() : type;
            case 2:
                ArrayList arrayList = new ArrayList();
                InterfaceC0390e isPro = abstractC12141e.isPro();
                C12816e c12816e = AbstractC5965e.ad;
                C16169e mo1727e = isPro.mo329e() != null ? ((InterfaceC5052e) isPro.mo1351switch()).mo1727e() : null;
                if (mo1727e != null) {
                    arrayList.add(new C2299e(abstractC12141e, arrayList.size(), 1, new C1473e(mo1727e, 0)));
                }
                InterfaceC0390e isPro2 = abstractC12141e.isPro();
                if (isPro2 instanceof C0530e) {
                    C0530e c0530e = (C0530e) isPro2;
                    c6571e = new C6571e(c0530e.f2676e, c0530e.f2678e.f19592e);
                } else if (isPro2 instanceof C11580e) {
                    C11580e c11580e = (C11580e) isPro2;
                    c6571e = new C6571e(c11580e.f23255e, c11580e.f23257e.f34262e);
                } else {
                    if (isPro2 instanceof InterfaceC3833e) {
                        InterfaceC2188e m4030e = ((AbstractC15855e) ((InterfaceC3833e) isPro2)).m4030e();
                        C11580e c11580e2 = m4030e instanceof C11580e ? (C11580e) m4030e : null;
                        if (c11580e2 != null) {
                            c6571e = new C6571e(c11580e2.f23255e, c11580e2.f23257e.f34262e);
                        }
                    }
                    c6571e = null;
                }
                if (c6571e == null) {
                    collection = C13664e.f27089e;
                } else {
                    InterfaceC11824e interfaceC11824e = (InterfaceC11824e) c6571e.f13544e;
                    List list = (List) c6571e.f13543e;
                    List mo2242e = isPro2.mo2242e();
                    ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(mo2242e, 10));
                    int i4 = 0;
                    for (Object obj : mo2242e) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC6874e.Signature();
                            throw null;
                        }
                        C16169e c16169e = (C16169e) obj;
                        arrayList2.add(new C13043e(isPro2, null, i4, c16169e.getAnnotations(), C0520e.license(interfaceC11824e.getString(((C10067e) list.get(i4)).f19880e)), c16169e.ad(), false, false, false, null, InterfaceC3054e.f7112e));
                        i4 = i5;
                    }
                    collection = arrayList2;
                }
                int size = collection.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList.add(new C2299e(abstractC12141e, arrayList.size(), 2, new C15199e(collection, i6, 2)));
                }
                C16169e mo327e = abstractC12141e.isPro().mo327e();
                if (mo327e != null) {
                    arrayList.add(new C2299e(abstractC12141e, arrayList.size(), 3, new C1473e(mo327e, 1)));
                }
                return arrayList;
            case 3:
                InterfaceC0390e isPro3 = abstractC12141e.isPro();
                ArrayList arrayList3 = new ArrayList();
                if (!AbstractC13467e.vip(abstractC12141e)) {
                    arrayList3.addAll((List) abstractC12141e.f24426e.invoke());
                }
                int size2 = isPro3.mo330e().size();
                for (int i7 = 0; i7 < size2; i7++) {
                    arrayList3.add(new C2299e(abstractC12141e, arrayList3.size(), 4, new C15199e(isPro3, i7, i3)));
                }
                if (abstractC12141e.crashlytics() && (isPro3 instanceof InterfaceC18168e) && arrayList3.size() > 1) {
                    AbstractC5167e.signatures(new C11021e(20), arrayList3);
                }
                arrayList3.trimToSize();
                return arrayList3;
            case 4:
                return new C12011e(abstractC12141e.isPro().inmobi(), new C10865e(abstractC12141e, i3), false);
            case 5:
                List typeParameters = abstractC12141e.isPro().getTypeParameters();
                ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new C17936e(abstractC12141e, (InterfaceC16046e) it.next()));
                }
                return arrayList4;
            case 6:
                List<InterfaceC8960e> parameters = abstractC12141e.getParameters();
                int size3 = (abstractC12141e.tapsense() ? 1 : 0) + parameters.size();
                if (((Boolean) abstractC12141e.f24427e.getValue()).booleanValue()) {
                    i = 0;
                    for (InterfaceC8960e interfaceC8960e : parameters) {
                        i += ((C2299e) interfaceC8960e).f5813e == 4 ? abstractC12141e.subs(interfaceC8960e) : 0;
                    }
                } else if (parameters.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it2 = parameters.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (((C2299e) ((InterfaceC8960e) it2.next())).f5813e == 4 && (i = i + 1) < 0) {
                            AbstractC6874e.loadAd();
                            throw null;
                        }
                    }
                }
                int i8 = (i + 31) / 32;
                Object[] objArr = new Object[size3 + i8 + 1];
                Iterator it3 = parameters.iterator();
                while (it3.hasNext()) {
                    C2299e c2299e = (C2299e) ((InterfaceC8960e) it3.next());
                    boolean amazon = c2299e.amazon();
                    int i9 = c2299e.f5814e;
                    if (amazon) {
                        C12011e advert = c2299e.advert();
                        C12816e c12816e2 = AbstractC5965e.ad;
                        InterfaceC0861e isVip = advert.isVip();
                        C8404e c8404e = isVip instanceof C8404e ? (C8404e) isVip : null;
                        if (c8404e != null) {
                            C10444e m2426final = c8404e.m2426final();
                            if ((m2426final != null ? m2426final.f20622e : null) != null) {
                            }
                        }
                        objArr[i9] = AbstractC5965e.metrica(AbstractC9546e.smaato(c2299e.advert()));
                    }
                    if (c2299e.admob()) {
                        objArr[i9] = AbstractC12141e.admob(c2299e.advert());
                    }
                }
                for (int i10 = 0; i10 < i8; i10++) {
                    objArr[size3 + i10] = 0;
                }
                return objArr;
            default:
                List parameters2 = abstractC12141e.getParameters();
                if (!parameters2.isEmpty()) {
                    Iterator it4 = parameters2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (AbstractC5965e.appmetrica(((C2299e) ((InterfaceC8960e) it4.next())).advert())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
