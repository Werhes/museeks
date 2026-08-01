package defpackage;

import io.realm.kotlin.internal.interop.realm_query_arg_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12546e {
    public static C10122e ad;

    public static final void ad(C2892e c2892e, C2892e c2892e2, Function2 function2, long j, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(1541076188);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(c2892e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c2892e2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.appmetrica(j) ? 2048 : 1024;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            AbstractC1101e.ad(AbstractC8703e.loadAd(j, AbstractC15705e.ad), AbstractC16653e.license(1615845788, new C11581e(c2892e, c2892e2, function2), c13770e), c13770e, 56);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4939e(c2892e, c2892e2, function2, j, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public static realm_value_t adcel(C15816e c15816e, Object obj) {
        if (obj == null) {
            return c15816e.m4024try();
        }
        ?? r0 = AbstractC6503e.ad;
        Class<?> cls = obj.getClass();
        C12232e c12232e = AbstractC3820e.ad;
        AbstractC8441e abstractC8441e = (AbstractC8441e) r0.get(c12232e.vip(cls));
        if (abstractC8441e != null) {
            return abstractC8441e.metrica(c15816e, obj);
        }
        throw new IllegalArgumentException("Cannot use object '" + obj + "' of type '" + c12232e.vip(obj.getClass()).mopub() + "' as primary key argument");
    }

    public static final C10675e appmetrica(CachedPlaylist cachedPlaylist) {
        return AbstractC4224e.purchase(cachedPlaylist.m4707throw() ? 1 : 5, cachedPlaylist.m4683class());
    }

    public static final C10675e billing(CachedTrack cachedTrack) {
        return AbstractC4224e.startapp(cachedTrack.firebase() ? 3 : 1, cachedTrack.m4723for());
    }

    public static C10896e license(C15816e c15816e, Object[] objArr) {
        Throwable th;
        int i;
        realm_query_arg_t realm_query_arg_tVar;
        boolean z;
        Object c6203e;
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i2 = 0;
        while (true) {
            Throwable th2 = null;
            if (i2 >= length) {
                C0444e c0444e = (C0444e) c15816e.f31190e;
                int size = arrayList.size();
                int i3 = AbstractC6026e.ad;
                long new_queryArgArray = realmcJNI.new_queryArgArray(size);
                realm_query_arg_t realm_query_arg_tVar2 = new_queryArgArray == 0 ? null : new realm_query_arg_t(new_queryArgArray, false);
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        Throwable th3 = th2;
                        AbstractC6874e.Signature();
                        throw th3;
                    }
                    InterfaceC13628e interfaceC13628e = (InterfaceC13628e) next;
                    realm_query_arg_t realm_query_arg_tVar3 = new realm_query_arg_t(realmcJNI.new_realm_query_arg_t(), true);
                    if (interfaceC13628e instanceof C9900e) {
                        C9900e c9900e = (C9900e) interfaceC13628e;
                        C13572e c13572e = c9900e.ad;
                        th = th2;
                        i = i5;
                        realmcJNI.realm_query_arg_t_nb_args_set(realm_query_arg_tVar3.ad, realm_query_arg_tVar3, c13572e.f26879e);
                        realmcJNI.realm_query_arg_t_is_list_set(realm_query_arg_tVar3.ad, realm_query_arg_tVar3, true);
                        realm_value_t realm_value_tVar = (realm_value_t) c13572e.f26878e;
                        realmcJNI.realm_query_arg_t_arg_set(realm_query_arg_tVar3.ad, realm_query_arg_tVar3, realm_value_t.vip(realm_value_tVar), realm_value_tVar);
                        realm_query_arg_tVar = realm_query_arg_tVar3;
                        ((LinkedHashSet) c0444e.f2491e).add(c9900e);
                        z = false;
                    } else {
                        th = th2;
                        i = i5;
                        realm_query_arg_tVar = realm_query_arg_tVar3;
                        if (!(interfaceC13628e instanceof C6203e)) {
                            throw new C14803e(10);
                        }
                        realmcJNI.realm_query_arg_t_nb_args_set(realm_query_arg_tVar.ad, realm_query_arg_tVar, 1L);
                        z = false;
                        realmcJNI.realm_query_arg_t_is_list_set(realm_query_arg_tVar.ad, realm_query_arg_tVar, false);
                        realm_value_t realm_value_tVar2 = ((C6203e) interfaceC13628e).ad;
                        realmcJNI.realm_query_arg_t_arg_set(realm_query_arg_tVar.ad, realm_query_arg_tVar, realm_value_t.vip(realm_value_tVar2), realm_value_tVar2);
                    }
                    realmcJNI.queryArgArray_setitem(realm_query_arg_t.ad(realm_query_arg_tVar2), realm_query_arg_tVar2, i4, realm_query_arg_tVar.ad, realm_query_arg_tVar);
                    arrayList2.add(Unit.INSTANCE);
                    i4 = i;
                    th2 = th;
                }
                C10896e c10896e = new C10896e(arrayList.size(), realm_query_arg_tVar2);
                ((LinkedHashSet) c0444e.f2491e).add(c10896e);
                return c10896e;
            }
            Object obj = objArr[i2];
            int i6 = 18;
            if (obj instanceof Collection) {
                int size2 = ((Collection) obj).size();
                C13572e c13572e2 = new C13572e(size2, AbstractC6026e.metrica(size2), i6);
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(iterable, 10));
                int i7 = 0;
                for (Object obj2 : iterable) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        AbstractC6874e.Signature();
                        throw null;
                    }
                    realm_value_t mopub = mopub(c15816e, obj2);
                    realm_value_t realm_value_tVar3 = (realm_value_t) c13572e2.f26878e;
                    int i9 = AbstractC6026e.ad;
                    realmcJNI.valueArray_setitem(realm_value_t.vip(realm_value_tVar3), realm_value_tVar3, i7, realm_value_t.vip(mopub), mopub);
                    arrayList3.add(Unit.INSTANCE);
                    i7 = i8;
                }
                c6203e = new C9900e(c13572e2);
            } else if (obj instanceof Iterable) {
                List Signature = AbstractC7762e.Signature(AbstractC7762e.billing(((Iterable) obj).iterator()));
                int size3 = Signature.size();
                C13572e c13572e3 = new C13572e(size3, AbstractC6026e.metrica(size3), i6);
                ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(Signature, 10));
                int i10 = 0;
                for (Object obj3 : Signature) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC6874e.Signature();
                        throw null;
                    }
                    realm_value_t mopub2 = mopub(c15816e, obj3);
                    realm_value_t realm_value_tVar4 = (realm_value_t) c13572e3.f26878e;
                    int i12 = AbstractC6026e.ad;
                    realmcJNI.valueArray_setitem(realm_value_t.vip(realm_value_tVar4), realm_value_tVar4, i10, realm_value_t.vip(mopub2), mopub2);
                    arrayList4.add(Unit.INSTANCE);
                    i10 = i11;
                }
                c6203e = new C9900e(c13572e3);
            } else {
                c6203e = new C6203e(mopub(c15816e, obj));
            }
            arrayList.add(c6203e);
            i2++;
        }
    }

    public static final C6571e metrica(C14133e c14133e) {
        Charset charset = AbstractC5508e.ad;
        Charset ad2 = C14133e.ad(c14133e);
        if (ad2 == null) {
            try {
                c14133e = AbstractC1266e.vip(c14133e + "; charset=utf-8");
            } catch (IllegalArgumentException unused) {
                c14133e = null;
            }
        } else {
            charset = ad2;
        }
        return new C6571e(charset, c14133e);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    public static realm_value_t mopub(C15816e c15816e, Object obj) {
        C12575e c12575e = C12575e.f25237e;
        if (obj == null) {
            return c15816e.m4024try();
        }
        try {
            if (obj instanceof InterfaceC17544e) {
                C13655e f36708e = ((InterfaceC10518e) ((InterfaceC14287e) obj)).getF36708e();
                r4 = f36708e != null ? f36708e : null;
                if (r4 != null) {
                    return c15816e.m4012break(r4);
                }
                throw new IllegalArgumentException("Cannot lookup unmanaged objects in realm");
            }
            if (!(obj instanceof InterfaceC5045e)) {
                ?? r0 = AbstractC6503e.ad;
                Class<?> cls = obj.getClass();
                C12232e c12232e = AbstractC3820e.ad;
                AbstractC8441e abstractC8441e = (AbstractC8441e) r0.get(c12232e.vip(cls));
                if (abstractC8441e != null) {
                    return abstractC8441e.metrica(c15816e, obj);
                }
                throw new IllegalArgumentException("Cannot convert primitive type '" + obj + "' of type '" + c12232e.vip(obj.getClass()).mopub() + "' as query argument");
            }
            InterfaceC5045e interfaceC5045e = (InterfaceC5045e) obj;
            switch (AbstractC8703e.m2467class(((C8648e) interfaceC5045e).ad)) {
                case 10:
                    InterfaceC14287e startapp = ((C8648e) interfaceC5045e).startapp(AbstractC3820e.ad.vip(InterfaceC14287e.class));
                    if (startapp != null) {
                        C13655e f36708e2 = ((InterfaceC10518e) startapp).getF36708e();
                        r4 = f36708e2 != null ? f36708e2 : null;
                        if (r4 == null) {
                            throw new IllegalArgumentException("Cannot lookup unmanaged objects in realm");
                        }
                    }
                    return c15816e.m4012break(r4);
                case 11:
                case 12:
                    throw new IllegalArgumentException("Cannot pass unmanaged collections as input argument");
                default:
                    switch (AbstractC8703e.m2467class(((C8648e) interfaceC5045e).ad)) {
                        case 0:
                            return c15816e.m4025while(Long.valueOf(((C8648e) interfaceC5045e).purchase()));
                        case 1:
                            return c15816e.adcel(Boolean.valueOf(((C8648e) interfaceC5045e).ad()));
                        case 2:
                            return c15816e.m4015default(((C8648e) interfaceC5045e).mopub());
                        case 3:
                            return c15816e.advert(((C8648e) interfaceC5045e).vip());
                        case 4:
                            return c15816e.m4019implements((C2577e) ((C8648e) interfaceC5045e).yandex());
                        case 5:
                            return c15816e.firebase(Float.valueOf(((C8648e) interfaceC5045e).appmetrica()));
                        case 6:
                            return c15816e.applovin(Double.valueOf(((C8648e) interfaceC5045e).license()));
                        case 7:
                            return c15816e.inmobi(((C8648e) interfaceC5045e).metrica());
                        case 8:
                            return c12575e.applovin(((C8648e) interfaceC5045e).billing().yandex());
                        case 9:
                            return c12575e.m3368interface(((C7588e) ((C8648e) interfaceC5045e).adcel()).ad);
                        default:
                            throw new UnsupportedOperationException("If you want to convert a 'RealmAny' instance containing an object to a 'RealmValue' use 'realmAnyToRealmValue' (when working with 'RealmQuery') or 'realmAnyToRealmValueWithObjectImport' (when using an accessor).");
                    }
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC17861e.Signature("Invalid query argument: ", e.getMessage()), e);
        }
    }

    public static final C10675e purchase(CachedTrack cachedTrack) {
        String adcel;
        if (!cachedTrack.crashlytics()) {
            return null;
        }
        if (cachedTrack.subs()) {
            return AbstractC4224e.purchase(3, cachedTrack.m4723for());
        }
        if (cachedTrack.m4740this()) {
            return AbstractC4224e.purchase(2, cachedTrack.m4723for());
        }
        CachedAlbum ad2 = cachedTrack.ad();
        if (ad2 == null || (adcel = ad2.adcel()) == null) {
            return null;
        }
        return AbstractC4224e.purchase(4, adcel);
    }

    public static InterfaceC12864e startapp(InterfaceC12864e interfaceC12864e, float f, float f2, float f3, float f4, InterfaceC16154e interfaceC16154e, boolean z, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 32) != 0 ? 0.0f : f4;
        float f9 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? -15.0f : 0.0f;
        long j = C13220e.vip;
        InterfaceC16154e interfaceC16154e2 = (i & 2048) != 0 ? AbstractC10432e.ad : interfaceC16154e;
        boolean z2 = (i & 4096) != 0 ? false : z;
        long j2 = AbstractC9944e.ad;
        return interfaceC12864e.premium(new C7254e(f5, f6, f7, f8, f9, j, interfaceC16154e2, z2, j2, j2, (i & 65536) == 0 ? 1 : 0));
    }

    public static final void vip(C2892e c2892e, C2892e c2892e2, InterfaceC12864e interfaceC12864e, C2892e c2892e3, Function2 function2, C10405e c10405e, C15274e c15274e, C13770e c13770e, int i) {
        C2892e c2892e4;
        Function2 function22;
        C10405e c10405e2;
        C15274e c15274e2;
        C10405e c10405e3;
        Function2 function23;
        C15274e c15274e3;
        c13770e.m3671package(-461880444);
        int i2 = i | 1662976;
        if (c13770e.m3673protected(i2 & 1, (599187 & i2) != 599186)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                C2892e c2892e5 = AbstractC0111e.ad;
                long appmetrica = ((C6032e) c13770e.adcel(AbstractC12491e.ad)).appmetrica();
                c10405e3 = new C10405e(appmetrica, appmetrica, appmetrica);
                Object m3681throw = c13770e.m3681throw();
                if (m3681throw == C2987e.ad) {
                    m3681throw = AbstractC17861e.adcel(c13770e);
                }
                function23 = c2892e5;
                c15274e3 = (C15274e) m3681throw;
            } else {
                c13770e.m3659default();
                function23 = function2;
                c10405e3 = c10405e;
                c15274e3 = c15274e;
            }
            c13770e.admob();
            InterfaceC3314e metrica = AbstractC13281e.metrica(c15274e3, c13770e, 6);
            InterfaceC3314e vip = AbstractC13083e.vip(c15274e3, c13770e, 6);
            C9616e c9616e = AbstractC16497e.metrica;
            C4789e ad2 = AbstractC14801e.ad(c9616e, C5438e.f11672e, c13770e, 0);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.appmetrica(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            InterfaceC2747e license = AbstractC17074e.license(C3007e.ad, false);
            long j2 = c13770e.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, C0115e.f1276e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC2270e.appmetrica(c13770e, Integer.valueOf(i4), c14865e3);
            AbstractC2270e.purchase(c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            c2892e4 = c2892e;
            c2892e4.invoke(c15274e3, c13770e, 54);
            c13770e.Signature(true);
            C9577e c9577e = C5438e.f11678e;
            C15061e c15061e = new C15061e(c9577e);
            C4789e ad3 = AbstractC14801e.ad(c9616e, c9577e, c13770e, 48);
            long j3 = c13770e.f27286case;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert3 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, c15061e);
            c13770e.m3666import();
            Function2 function24 = function23;
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad3, c14865e);
            AbstractC2270e.yandex(c13770e, advert3, c14865e2);
            AbstractC2270e.appmetrica(c13770e, Integer.valueOf(i5), c14865e3);
            AbstractC2270e.purchase(c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
            ad(c2892e2, c2892e3, function24, ((Boolean) metrica.getValue()).booleanValue() ? c10405e3.vip : ((Boolean) vip.getValue()).booleanValue() ? c10405e3.metrica : c10405e3.ad, c13770e, 438);
            c13770e.Signature(true);
            c13770e.Signature(true);
            function22 = function24;
            c10405e2 = c10405e3;
            c15274e2 = c15274e3;
        } else {
            c2892e4 = c2892e;
            c13770e.m3659default();
            function22 = function2;
            c10405e2 = c10405e;
            c15274e2 = c15274e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15044e(c2892e4, c2892e2, interfaceC12864e, c2892e3, function22, c10405e2, c15274e2, i);
        }
    }

    public static final InterfaceC12864e yandex(InterfaceC12864e interfaceC12864e, Function1 function1) {
        return interfaceC12864e.premium(new C13800e(function1));
    }
}
