package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* renamed from: eِۢٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12056e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f24161e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f24162e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24163e;

    public C12056e(C16929e c16929e, C0764e c0764e, C14056e c14056e) {
        this.f24163e = 7;
        this.f24162e = c0764e;
        this.f24161e = c14056e;
    }

    public /* synthetic */ C12056e(Object obj, Object obj2, int i) {
        this.f24163e = i;
        this.f24162e = obj;
        this.f24161e = obj2;
    }

    public /* synthetic */ C12056e(Object obj, Object obj2, boolean z, int i) {
        this.f24163e = i;
        this.f24161e = obj;
        this.f24162e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [eِۥؗ] */
    /* JADX WARN: Type inference failed for: r12v23, types: [eِۥؗ] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v7, types: [eؚٜٛ, eَۧۚ, eٔۛؖ] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object, eؕٛؓ] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Collection mo2427goto;
        ArrayList arrayList;
        String ad;
        C15199e c15199e;
        boolean z;
        C5538e license;
        C11064e c11064e;
        ArrayList arrayList2;
        List list;
        ?? r13;
        Object obj;
        ?? r12;
        C6571e c6571e;
        List list2;
        C12092e c12092e;
        int i = this.f24163e;
        List list3 = C13664e.f27089e;
        int i2 = 3;
        boolean z2 = false;
        Object obj2 = this.f24162e;
        Object obj3 = this.f24161e;
        switch (i) {
            case 0:
                C6613e c6613e = (C6613e) obj3;
                ArrayList arrayList3 = new ArrayList();
                for (InterfaceC9905e interfaceC9905e : (List) obj2) {
                    c6613e.getClass();
                    AbstractC1186e vip = AbstractC10653e.vip((AbstractC1186e) interfaceC9905e);
                    if (vip != null) {
                        arrayList3.add(vip);
                    }
                }
                return arrayList3;
            case 1:
                C6557e.f13492e.getClass();
                return AbstractC1596e.appmetrica(new C5266e(C6272e.appmetrica, new C3411e(2, this)), C6557e.f13491e, ((AbstractC17288e) obj3).mo1459goto(), Collections.EMPTY_LIST, false);
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj2).getCanonicalName());
                AbstractC13480e.m3610while(((Map) obj3).entrySet(), sb, ", ", "(", ")", C11633e.f23358e, 48);
                return sb.toString();
            case 3:
                C17046e c17046e = (C17046e) obj2;
                Activity activity = c17046e.f10582e;
                EnumC15845e enumC15845e = (EnumC15845e) obj3;
                String str = enumC15845e.f31268e;
                C17874e c17874e = new C17874e(c17046e, enumC15845e, i2);
                int i3 = C17046e.f33386e;
                AbstractC16519e.vip((AppActivity) activity, new C1247e(c17874e, c17046e, str, (InterfaceC5083e) null, 9));
                c17046e.purchase();
                return Unit.INSTANCE;
            case 4:
                C8006e c8006e = (C8006e) obj2;
                String str2 = ((MainArtist) obj3).ad;
                if (str2 != null) {
                    c8006e.m2514goto(new C5522e(str2));
                }
                return Unit.INSTANCE;
            case 5:
                File file = AbstractC9001e.ad;
                CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj2;
                LinkedHashMap linkedHashMap = AbstractC9001e.vip;
                String str3 = customCatalogBlockItem.license;
                if (linkedHashMap.containsKey(str3)) {
                    linkedHashMap.remove(str3);
                } else {
                    linkedHashMap.put(str3, customCatalogBlockItem.ad);
                }
                File file2 = AbstractC9001e.ad;
                Set entrySet = linkedHashMap.entrySet();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : entrySet) {
                    Map.Entry entry = (Map.Entry) obj4;
                    if (((CharSequence) entry.getKey()).length() > 0 && ((CharSequence) entry.getValue()).length() > 0) {
                        arrayList4.add(obj4);
                    }
                }
                AbstractC1641e.admob(file2, AbstractC13480e.m3608try(arrayList4, "\n", null, null, new C4526e(7), 30));
                VKXApplication vKXApplication = VKXApplication.f36528e;
                AbstractC6232e.billing(C5642e.ad, vKXApplication != null ? vKXApplication : null);
                ((C5016e) obj3).f10699e.setValue(AbstractC13480e.m3575continue(AbstractC9001e.vip.keySet()));
                return Unit.INSTANCE;
            case 6:
                C1963e c1963e = (C1963e) obj2;
                String str4 = (String) ((C6571e) obj3).f13544e;
                C8130e m739transient = c1963e.m739transient();
                String ad2 = AbstractC0852e.ad();
                C5977e c5977e = c1963e.f5161e;
                m739transient.getClass();
                C2580e license2 = m739transient.license(new C16471e(m739transient, c5977e), AbstractC1346e.class.getName());
                m739transient.adcel(str4);
                C9321e ad3 = C0381e.ad();
                ad3.ad = new C0912e(m739transient, ad2, str4, license2);
                ad3.appmetrica = 1226;
                C0560e appmetrica = m739transient.appmetrica(1, ad3.ad());
                C0642e c0642e = new C0642e(m739transient, str4);
                appmetrica.getClass();
                appmetrica.license(AbstractC10468e.ad, c0642e);
                c1963e.m735import(C8504e.ad);
                return Unit.INSTANCE;
            case 7:
                C0764e c0764e = (C0764e) obj2;
                InterfaceC16132e interfaceC16132e = c0764e.f3119e;
                c0764e.setValue(C5267e.vip((C5267e) interfaceC16132e.getValue(), false, false, 0, 0, AbstractC13480e.m3576default(((C5267e) interfaceC16132e.getValue()).f11346e, (C14056e) obj3), 47));
                return Unit.INSTANCE;
            case 8:
                C11980e c11980e = (C11980e) obj2;
                return C7985e.vip(((C17241e) c11980e.f23950e).admob, (C11243e) c11980e.f23951e.getValue(), ((InterfaceC17815e) obj3).getAnnotations());
            case 9:
                C11980e c11980e2 = (C11980e) obj2;
                return C7985e.vip(((C17241e) c11980e2.f23950e).admob, (C11243e) c11980e2.f23951e.getValue(), (InterfaceC2460e) obj3);
            case 10:
                C13793e c13793e = ((C2702e) obj2).admob;
                return new C3618e(AbstractC6532e.isVip(c13793e.ad, c13793e.vip, AbstractC5616e.metrica.ad(((Number) ((Function0) obj3).invoke()).floatValue())));
            case 11:
                C10208e c10208e = (C10208e) obj2;
                String str5 = (String) obj3;
                AbstractC15529e abstractC15529e = c10208e.f20187e;
                String str6 = c10208e.f20184e;
                abstractC15529e.getClass();
                if (str5.equals("<init>")) {
                    mo2427goto = AbstractC13480e.m3575continue(abstractC15529e.mo2429interface());
                    arrayList = new ArrayList();
                    for (Object obj5 : mo2427goto) {
                        InterfaceC11788e interfaceC11788e = (InterfaceC11788e) obj5;
                        if (interfaceC11788e.mo2281e() && AbstractC17093e.metrica(interfaceC11788e.mo1351switch())) {
                            String ad4 = AbstractC4591e.metrica(interfaceC11788e).ad();
                            if (!AbstractC6507e.pro(ad4, "constructor-impl", false) || !AbstractC6507e.amazon(ad4, ")V", false)) {
                                throw new IllegalArgumentException(("Invalid signature of " + interfaceC11788e + ": " + ad4).toString());
                            }
                            ad = AbstractC5304e.m1853catch(ad4, "V") + AbstractC13133e.vip(AbstractC2876e.purchase(interfaceC11788e.mo1351switch()).vip());
                        } else {
                            ad = AbstractC4591e.metrica(interfaceC11788e).ad();
                        }
                        if (AbstractC7890e.billing(ad, str6)) {
                            arrayList.add(obj5);
                        }
                    }
                } else {
                    mo2427goto = abstractC15529e.mo2427goto(C0520e.appmetrica(str5));
                    arrayList = new ArrayList();
                    for (Object obj6 : mo2427goto) {
                        if (AbstractC7890e.billing(AbstractC4591e.metrica((InterfaceC16528e) obj6).ad(), str6)) {
                            arrayList.add(obj6);
                        }
                    }
                }
                if (arrayList.size() == 1) {
                    return (InterfaceC16528e) AbstractC13480e.m3590instanceof(arrayList);
                }
                String m3608try = AbstractC13480e.m3608try(mo2427goto, "\n", null, null, C7247e.f14814e, 30);
                StringBuilder tapsense = AbstractC17861e.tapsense("Function '", str5, "' (JVM signature: ", str6, ") not resolved in ");
                tapsense.append(abstractC15529e);
                tapsense.append(':');
                tapsense.append(m3608try.length() == 0 ? " no members found" : "\n".concat(m3608try));
                throw new Error(tapsense.toString());
            case 12:
                C12011e c12011e = (C12011e) obj2;
                Function0 function0 = (Function0) obj3;
                List mopub = c12011e.f24023e.mopub();
                if (mopub.isEmpty()) {
                    return list3;
                }
                ArrayList arrayList5 = new ArrayList(AbstractC0746e.subscription(mopub, 10));
                int i4 = 0;
                for (Object obj7 : mopub) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC6874e.Signature();
                        throw null;
                    }
                    AbstractC16232e abstractC16232e = (AbstractC16232e) obj7;
                    if (function0 == null) {
                        c15199e = null;
                        z = false;
                    } else {
                        z = false;
                        c15199e = new C15199e(new C7663e(c12011e, 1), i4, false ? 1 : 0);
                    }
                    if (abstractC16232e.metrica()) {
                        license = C5538e.metrica;
                    } else {
                        C12011e c12011e2 = new C12011e(abstractC16232e.vip(), c15199e, z);
                        int m2467class = AbstractC8703e.m2467class(abstractC16232e.ad());
                        if (m2467class == 0) {
                            C5538e c5538e = C5538e.metrica;
                            license = AbstractC16704e.license(c12011e2);
                        } else if (m2467class == 1) {
                            license = new C5538e(2, c12011e2);
                        } else {
                            if (m2467class != 2) {
                                throw new C14803e(10);
                            }
                            license = new C5538e(3, c12011e2);
                        }
                        arrayList5.add(license);
                        i4 = i5;
                    }
                    arrayList5.add(license);
                    i4 = i5;
                }
                return arrayList5;
            case 13:
                C7025e c7025e = (C7025e) obj2;
                return AbstractC13480e.m3575continue(((InterfaceC18372e) ((C18277e) c7025e.f14371e.f10517e).appmetrica).vip(c7025e.f14373e, (C13754e) obj3));
            case 14:
                C10032e c10032e = (C10032e) obj2;
                c10032e.f19833e.invoke((C6064e) obj3);
                c10032e.purchase();
                return Unit.INSTANCE;
            case 15:
                final C1922e c1922e = (C1922e) obj2;
                final C10620e c10620e = (C10620e) obj3;
                final int i6 = 0;
                final int i7 = 1;
                new C11683e(R.string.eq3_preset_menu, AbstractC6874e.startapp(new C3662e(R.drawable.ic_edit_outline_28, c1922e.pro().getString(R.string.eq3_preset_menu_action_rename), new Function1() { // from class: eُؒۧ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        switch (i6) {
                            case 0:
                                c1922e.f5117e.setValue(c10620e);
                                return Unit.INSTANCE;
                            default:
                                c1922e.f5116e.setValue(c10620e);
                                return Unit.INSTANCE;
                        }
                    }
                }), new C3662e(R.drawable.ic_delete_outline_android_28, c1922e.pro().getString(R.string.eq3_preset_menu_action_delete), new Function1() { // from class: eُؒۧ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        switch (i7) {
                            case 0:
                                c1922e.f5117e.setValue(c10620e);
                                return Unit.INSTANCE;
                            default:
                                c1922e.f5116e.setValue(c10620e);
                                return Unit.INSTANCE;
                        }
                    }
                }))).signatures(c1922e.pro());
                return Unit.INSTANCE;
            case 16:
                ((C16161e) obj2).pro().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((EnumC3562e) obj3).f8033e)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                StringBuilder sb2 = new StringBuilder();
                C3637e c3637e = (C3637e) obj2;
                sb2.append(c3637e.vip);
                sb2.append('_');
                sb2.append(c3637e.ad);
                AbstractC18406e.purchase(new C13029e(new String[]{sb2.toString()}), new C17877e(15, (C17399e) obj3));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C15587e c15587e = new C15587e();
                Iterator it = ((AbstractC14957e) obj3).mo337finally().iterator();
                while (it.hasNext()) {
                    c15587e.add(((InterfaceC16528e) it.next()).remoteconfig((C4542e) obj2));
                }
                return c15587e;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C10142e c10142e = (C10142e) obj3;
                C14177e c14177e = (C14177e) obj2;
                try {
                    if (!c14177e.ad(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                    } while (c14177e.ad(false, this));
                    c10142e.ad(1, 9, null);
                } catch (IOException e) {
                    c10142e.ad(2, 2, e);
                } catch (Throwable th) {
                    c10142e.ad(3, 3, null);
                    AbstractC10220e.vip(c14177e);
                    throw th;
                }
                AbstractC10220e.vip(c14177e);
                return Unit.INSTANCE;
            case 20:
                C8004e c8004e = (C8004e) obj2;
                AbstractC16519e.vip((AppActivity) c8004e.pro(), new C6626e((C11048e) obj3, c8004e, null, 22));
                return Unit.INSTANCE;
            case 21:
                ((InterfaceC3314e) obj3).setValue((C11048e) obj2);
                return Unit.INSTANCE;
            case 22:
                return ((C17241e) ((C11980e) obj2).f23950e).loadAd.amazon().adcel(((C14698e) obj3).ad).mo1458e();
            case 23:
                C6272e c6272e = (C6272e) obj3;
                InterfaceC5334e interfaceC5334e = ((C3942e) obj2).ad;
                C0394e c0394e = ((C14887e) interfaceC5334e.mo1886e(C3942e.appmetrica)).f29502e;
                InterfaceC8614e interfaceC8614e = C14887e.f29497e[0];
                List list4 = (List) c0394e.invoke();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj8 : list4) {
                    if (obj8 instanceof C4718e) {
                        arrayList6.add(obj8);
                    }
                }
                C13726e c13726e = new C13726e((InterfaceC15498e) AbstractC13480e.m3591interface(arrayList6), C3942e.purchase, 4, 2, Collections.singletonList(interfaceC5334e.amazon().appmetrica()), c6272e);
                c13726e.mopub(new AbstractC18103e(c6272e, c13726e), C3295e.f7451e, null);
                return c13726e;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C9608e c9608e = (C9608e) obj2;
                return new C18214e(c9608e.advert(), (C6272e) obj3, new C3411e(27, c9608e));
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C18214e c18214e = (C18214e) obj2;
                C16113e c16113e = c18214e.license().ad;
                C3942e.metrica.getClass();
                return AbstractC1284e.purchase(c16113e, C3942e.billing, new C11980e((C6272e) obj3, c18214e.license().ad)).mo1458e();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C10184e c10184e = (C10184e) obj2;
                C11980e c11980e3 = c10184e.f20140e;
                C17241e c17241e = (C17241e) c11980e3.f23950e;
                return new C10184e(new C11980e(new C17241e(c17241e.ad, c17241e.vip, c17241e.metrica, c17241e.license, c17241e.appmetrica, c17241e.purchase, c17241e.yandex, c17241e.startapp, c17241e.adcel, c17241e.mopub, c17241e.advert, c17241e.smaato, c17241e.amazon, c17241e.loadAd, c17241e.Signature, c17241e.admob, c17241e.subscription, c17241e.remoteconfig, c17241e.pro, c17241e.signatures, c17241e.tapsense, c17241e.isVip), (InterfaceC10383e) c11980e3.f23949e, (InterfaceC3477e) c11980e3.f23951e), c10184e.mo1351switch(), c10184e.f20147e, (InterfaceC5052e) obj3);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C8404e c8404e = (C8404e) obj3;
                InterfaceC4077e advert = ((AbstractC1186e) obj2).loadAd().advert();
                if (!(advert instanceof InterfaceC5052e)) {
                    throw new Error("Supertype not a class: " + advert);
                }
                Class yandex = AbstractC5965e.yandex((InterfaceC5052e) advert);
                if (yandex == null) {
                    throw new Error("Unsupported superclass of " + c8404e + ": " + advert);
                }
                Class cls = c8404e.f17185e;
                if (AbstractC7890e.billing(cls.getSuperclass(), yandex)) {
                    return cls.getGenericSuperclass();
                }
                int firebase = AbstractC1660e.firebase(yandex, cls.getInterfaces());
                if (firebase >= 0) {
                    return cls.getGenericInterfaces()[firebase];
                }
                throw new Error("No superclass of " + c8404e + " in Java reflection for " + advert);
            default:
                C12092e c12092e2 = (C12092e) obj2;
                C11980e c11980e4 = (C11980e) obj3;
                C11064e c11064e2 = C4590e.f9885e;
                C17070e c17070e = c12092e2.loadAd;
                C11980e c11980e5 = c12092e2.vip;
                InterfaceC5052e interfaceC5052e = c12092e2.amazon;
                List Signature = AbstractC7762e.Signature(new C2167e(AbstractC7762e.adcel(AbstractC1660e.billing(c17070e.ad.getDeclaredConstructors()), C5064e.f10888e), C3026e.f7095e));
                ArrayList arrayList7 = new ArrayList(Signature.size());
                Iterator it2 = Signature.iterator();
                while (it2.hasNext()) {
                    C11378e c11378e = (C11378e) it2.next();
                    C10687e m2903e = C10687e.m2903e(interfaceC5052e, AbstractC8495e.adcel(c11980e5, c11378e), z2, ((C17241e) c11980e5.f23950e).adcel.pro(c11378e));
                    C11980e vip2 = AbstractC8787e.vip(c11980e5, m2903e, c11378e, interfaceC5052e.mo1221e().size(), c11980e5.f23951e);
                    Constructor constructor = c11378e.ad;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    if (genericParameterTypes.length == 0) {
                        list2 = list3;
                        c12092e = c12092e2;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() == null || Modifier.isStatic(declaringClass.getModifiers())) {
                            list2 = list3;
                        } else {
                            list2 = list3;
                            genericParameterTypes = (Type[]) AbstractC1660e.pro(1, genericParameterTypes.length, genericParameterTypes);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        c12092e = c12092e2;
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) AbstractC1660e.pro(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
                        }
                        list3 = c11378e.metrica(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    C13486e signatures = AbstractC12654e.signatures(vip2, m2903e, list3);
                    List mo1221e = interfaceC5052e.mo1221e();
                    ArrayList typeParameters = c11378e.getTypeParameters();
                    Iterator it3 = it2;
                    ArrayList arrayList8 = new ArrayList(AbstractC0746e.subscription(typeParameters, 10));
                    Iterator it4 = typeParameters.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(((InterfaceC10383e) vip2.f23949e).license((C0317e) it4.next()));
                    }
                    m2903e.m2285e(signatures.vip, AbstractC2194e.license(c11378e.appmetrica()), AbstractC13480e.m3584final(mo1221e, arrayList8));
                    m2903e.mo2906e(false);
                    m2903e.mo2907e(signatures.metrica);
                    m2903e.m3894e(interfaceC5052e.mo1458e());
                    ((C17241e) vip2.f23950e).billing.getClass();
                    arrayList7.add(m2903e);
                    list3 = list2;
                    it2 = it3;
                    c12092e2 = c12092e;
                    z2 = false;
                }
                C12092e c12092e3 = c12092e2;
                boolean billing = c17070e.billing();
                Class cls2 = c17070e.ad;
                if (billing) {
                    C10687e m2903e2 = C10687e.m2903e(interfaceC5052e, c11064e2, true, ((C17241e) c11980e5.f23950e).adcel.pro(c17070e));
                    ArrayList purchase = c17070e.purchase();
                    ArrayList arrayList9 = new ArrayList(purchase.size());
                    C9265e purchase2 = AbstractC10510e.purchase(2, false, null, 6);
                    Iterator it5 = purchase.iterator();
                    int i8 = 0;
                    while (it5.hasNext()) {
                        C13313e c13313e = (C13313e) it5.next();
                        AbstractC1186e m4538e = ((C18478e) c11980e5.f23948e).m4538e(c13313e.purchase(), purchase2);
                        C0520e vip3 = c13313e.vip();
                        ((C17241e) c11980e5.f23950e).adcel.getClass();
                        C11064e c11064e3 = c11064e2;
                        ArrayList arrayList10 = arrayList7;
                        C10687e c10687e = m2903e2;
                        arrayList9.add(new C13043e(c10687e, null, i8, c11064e3, vip3, m4538e, false, false, false, null, new C10253e(c13313e)));
                        arrayList7 = arrayList10;
                        c11064e2 = c11064e3;
                        m2903e2 = c10687e;
                        i8++;
                        purchase2 = purchase2;
                    }
                    C7283e c7283e = m2903e2;
                    c11064e = c11064e2;
                    arrayList2 = arrayList7;
                    c7283e.mo2907e(false);
                    C8268e advert2 = interfaceC5052e.advert();
                    if (advert2.equals(AbstractC16978e.vip)) {
                        advert2 = AbstractC16978e.metrica;
                    }
                    c7283e.m2287e(arrayList9, advert2);
                    c7283e.mo2906e(false);
                    c7283e.m3894e(interfaceC5052e.mo1458e());
                    int i9 = 2;
                    String vip4 = AbstractC5209e.vip(c7283e, 2);
                    if (!arrayList2.isEmpty()) {
                        Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            if (!AbstractC7890e.billing(AbstractC5209e.vip((C7283e) it6.next(), i9), vip4)) {
                                i9 = 2;
                            }
                        }
                    }
                    arrayList2.add(c7283e);
                    ((C17241e) c11980e4.f23950e).billing.getClass();
                } else {
                    c11064e = c11064e2;
                    arrayList2 = arrayList7;
                }
                ((C10990e) ((C17241e) c11980e4.f23950e).inmobi).getClass();
                C11672e c11672e = ((C17241e) c11980e4.f23950e).subscription;
                if (arrayList2.isEmpty()) {
                    boolean isAnnotation = cls2.isAnnotation();
                    if (!cls2.isInterface()) {
                        c17070e.getClass();
                    }
                    if (isAnnotation) {
                        C17241e c17241e2 = (C17241e) c11980e5.f23950e;
                        C18478e c18478e = (C18478e) c11980e5.f23948e;
                        ?? m2903e3 = C10687e.m2903e(interfaceC5052e, c11064e, true, c17241e2.adcel.pro(c17070e));
                        if (isAnnotation) {
                            List metrica = c17070e.metrica();
                            r13 = new ArrayList(metrica.size());
                            C9265e purchase3 = AbstractC10510e.purchase(2, true, null, 6);
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            for (Object obj9 : metrica) {
                                if (AbstractC7890e.billing(((C6185e) obj9).vip(), AbstractC15262e.vip)) {
                                    arrayList11.add(obj9);
                                } else {
                                    arrayList12.add(obj9);
                                }
                            }
                            arrayList11.size();
                            C6185e c6185e = (C6185e) AbstractC13480e.m3604this(arrayList11);
                            if (c6185e != null) {
                                AbstractC16397e purchase4 = c6185e.purchase();
                                if (purchase4 instanceof C12860e) {
                                    C12860e c12860e = (C12860e) purchase4;
                                    c6571e = new C6571e(c18478e.m4537e(c12860e, purchase3, true), c18478e.m4538e(c12860e.vip, purchase3));
                                } else {
                                    c6571e = new C6571e(c18478e.m4538e(purchase4, purchase3), null);
                                }
                                ?? r122 = c12092e3;
                                r122.tapsense(r13, m2903e3, 0, c6185e, (AbstractC1186e) c6571e.f13544e, (AbstractC1186e) c6571e.f13543e);
                                r12 = r122;
                            } else {
                                r12 = c12092e3;
                            }
                            int i10 = c6185e != null ? 1 : 0;
                            Iterator it7 = arrayList12.iterator();
                            int i11 = 0;
                            while (it7.hasNext()) {
                                C6185e c6185e2 = (C6185e) it7.next();
                                r12.tapsense(r13, m2903e3, i11 + i10, c6185e2, c18478e.m4538e(c6185e2.purchase(), purchase3), null);
                                i11++;
                            }
                        } else {
                            r13 = Collections.EMPTY_LIST;
                        }
                        m2903e3.mo2907e(false);
                        C8268e advert3 = interfaceC5052e.advert();
                        if (advert3.equals(AbstractC16978e.vip)) {
                            advert3 = AbstractC16978e.metrica;
                        }
                        m2903e3.m2287e(r13, advert3);
                        m2903e3.mo2906e(true);
                        m2903e3.m3894e(interfaceC5052e.mo1458e());
                        ((C17241e) c11980e5.f23950e).billing.getClass();
                        obj = m2903e3;
                    } else {
                        obj = null;
                    }
                    list = AbstractC6874e.adcel(obj);
                } else {
                    list = arrayList2;
                }
                return AbstractC13480e.m3575continue(c11672e.smaato(c11980e4, list));
        }
    }
}
