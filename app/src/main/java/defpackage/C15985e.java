package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15985e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31506e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f31507e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f31508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15985e(int i, int i2, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f31506e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15985e(C7145e c7145e, C0895e c0895e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f31506e = 2;
        this.f31508e = c7145e;
        this.f31507e = c0895e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15985e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(3, interfaceC5083e);
        this.f31506e = i;
        this.f31507e = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f31506e) {
            case 0:
                C15985e c15985e = new C15985e(3, 0, (InterfaceC5083e) obj3);
                c15985e.f31508e = (C6442e) obj;
                c15985e.f31507e = (C16074e) obj2;
                return c15985e.loadAd(Unit.INSTANCE);
            case 1:
                C15985e c15985e2 = new C15985e(3, 1, (InterfaceC5083e) obj3);
                c15985e2.f31508e = (C6442e) obj;
                c15985e2.f31507e = (C5267e) obj2;
                return c15985e2.loadAd(Unit.INSTANCE);
            case 2:
                new C15985e((C7145e) this.f31508e, (C0895e) this.f31507e, (InterfaceC5083e) obj3);
                AbstractC2003e.purchase(Unit.INSTANCE);
                return null;
            case 3:
                C15985e c15985e3 = new C15985e((C15210e) this.f31507e, (InterfaceC5083e) obj3, 3);
                c15985e3.f31508e = (AbstractC11424e) obj;
                return c15985e3.loadAd(Unit.INSTANCE);
            case 4:
                C15985e c15985e4 = new C15985e(3, 4, (InterfaceC5083e) obj3);
                c15985e4.f31508e = (C6442e) obj;
                c15985e4.f31507e = (C7190e) obj2;
                return c15985e4.loadAd(Unit.INSTANCE);
            case 5:
                C15985e c15985e5 = new C15985e(3, 5, (InterfaceC5083e) obj3);
                c15985e5.f31508e = (AbstractC16049e) obj;
                c15985e5.f31507e = (EnumC13413e) obj2;
                return c15985e5.loadAd(Unit.INSTANCE);
            case 6:
                C15985e c15985e6 = new C15985e(3, 6, (InterfaceC5083e) obj3);
                c15985e6.f31508e = (C9830e) obj;
                c15985e6.f31507e = (EnumC9603e) obj2;
                return c15985e6.loadAd(Unit.INSTANCE);
            case 7:
                C15985e c15985e7 = new C15985e((C8765e) this.f31507e, (InterfaceC5083e) obj3, 7);
                c15985e7.f31508e = (Throwable) obj2;
                return c15985e7.loadAd(Unit.INSTANCE);
            case 8:
                C15985e c15985e8 = new C15985e(3, 8, (InterfaceC5083e) obj3);
                c15985e8.f31508e = (C10282e) obj;
                c15985e8.f31507e = (C0044e) obj2;
                return c15985e8.loadAd(Unit.INSTANCE);
            case 9:
                C15985e c15985e9 = new C15985e(3, 9, (InterfaceC5083e) obj3);
                c15985e9.f31508e = (List) obj;
                c15985e9.f31507e = (EnumC9603e) obj2;
                return c15985e9.loadAd(Unit.INSTANCE);
            default:
                C15985e c15985e10 = new C15985e(3, 10, (InterfaceC5083e) obj3);
                c15985e10.f31508e = (C10282e) obj;
                c15985e10.f31507e = (C10876e) obj2;
                return c15985e10.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = 6;
        int i2 = 5;
        switch (this.f31506e) {
            case 0:
                C6442e c6442e = (C6442e) this.f31508e;
                C16074e c16074e = (C16074e) this.f31507e;
                AbstractC2003e.purchase(obj);
                return C6442e.vip(c6442e, null, null, null, c16074e, null, null, null, null, 131039);
            case 1:
                C6442e c6442e2 = (C6442e) this.f31508e;
                C5267e c5267e = (C5267e) this.f31507e;
                AbstractC2003e.purchase(obj);
                return C6442e.vip(c6442e2, null, c5267e, null, null, null, null, null, null, 131063);
            case 2:
                AbstractC2003e.purchase(obj);
                return null;
            case 3:
                AbstractC11424e abstractC11424e = (AbstractC11424e) this.f31508e;
                AbstractC2003e.purchase(obj);
                String c11787e = ((C10263e) abstractC11424e.f22964e).ad.toString();
                C18141e c18141e = new C18141e();
                C15210e c15210e = (C15210e) this.f31507e;
                C10263e c10263e = (C10263e) abstractC11424e.f22964e;
                C10095e c10095e = c10263e.metrica;
                C10095e c10095e2 = c18141e.ad;
                AbstractC12900e.ad(c10095e2, c10095e);
                C0069e m2759e = c10095e2.m2759e();
                c15210e.ad.invoke(c18141e);
                for (Map.Entry entry : m2759e.mopub()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    List mo856e = c10095e2.mo856e(str);
                    if (mo856e == null) {
                        c10095e2.mo858e(str, list);
                    } else if (!mo856e.equals(list) && !str.equals("Cookie")) {
                        c10095e2.m4628e(str);
                        c10095e2.mo858e(str, list);
                        c10095e2.m4629e(str, mo856e);
                    }
                }
                C6399e vip = c18141e.vip.vip();
                C16063e c16063e = vip.f13264e;
                C4590e c4590e = C15210e.vip;
                C11787e c11787e2 = c10263e.ad;
                if (c11787e2.license == null) {
                    c11787e2.license = c16063e;
                }
                if (c11787e2.ad.length() <= 0) {
                    C11787e c11787e3 = new C11787e();
                    c11787e3.license = c16063e;
                    c11787e3.ad = vip.f13273e;
                    int i3 = vip.f13266e;
                    Integer valueOf = i3 != 0 ? Integer.valueOf(i3) : null;
                    c11787e3.appmetrica(valueOf != null ? valueOf.intValue() : vip.f13270e.f31629e);
                    AbstractC9186e.billing(c11787e3, (String) vip.f13262e.getValue());
                    c11787e3.appmetrica = (String) vip.f13265e.getValue();
                    c11787e3.purchase = (String) vip.f13267e.getValue();
                    C10095e c10095e3 = new C10095e(1);
                    c10095e3.m4618e(AbstractC7205e.metrica(0, 6, (String) vip.f13261e.getValue()));
                    c11787e3.startapp = c10095e3;
                    c11787e3.adcel = new C16722e(c10095e3);
                    c11787e3.billing = (String) vip.f13268e.getValue();
                    c11787e3.vip = vip.f13275e;
                    c11787e3.license = c11787e2.license;
                    int i4 = c11787e2.metrica;
                    if (i4 != 0) {
                        c11787e3.appmetrica(i4);
                    }
                    List list2 = c11787e3.yandex;
                    List list3 = c11787e2.yandex;
                    if (!list3.isEmpty()) {
                        if (list2.isEmpty() || ((CharSequence) AbstractC13480e.m3591interface(list3)).length() == 0) {
                            list2 = list3;
                        } else {
                            C1169e c1169e = new C1169e((list3.size() + list2.size()) - 1);
                            int size = list2.size() - 1;
                            for (int i5 = 0; i5 < size; i5++) {
                                c1169e.add(list2.get(i5));
                            }
                            c1169e.addAll(list3);
                            list2 = AbstractC6874e.metrica(c1169e);
                        }
                    }
                    c11787e3.yandex = list2;
                    if (c11787e2.billing.length() > 0) {
                        c11787e3.billing = c11787e2.billing;
                    }
                    C10095e c10095e4 = new C10095e(1);
                    AbstractC12900e.ad(c10095e4, c11787e3.startapp);
                    InterfaceC14071e interfaceC14071e = c11787e2.startapp;
                    c11787e3.startapp = interfaceC14071e;
                    c11787e3.adcel = new C16722e(interfaceC14071e);
                    for (Map.Entry entry2 : c10095e4.mopub()) {
                        String str2 = (String) entry2.getKey();
                        List list4 = (List) entry2.getValue();
                        if (!c11787e3.startapp.contains(str2)) {
                            c11787e3.startapp.mo858e(str2, list4);
                        }
                    }
                    AbstractC14385e.appmetrica(c11787e2, c11787e3);
                }
                C5874e c5874e = c18141e.metrica;
                for (C8208e c8208e : c5874e.license()) {
                    if (!c10263e.purchase.vip(c8208e)) {
                        c10263e.purchase.billing(c8208e, c5874e.metrica(c8208e));
                    }
                }
                c10263e.metrica.clear();
                c10263e.metrica.m4618e(c10095e2.m2759e());
                InterfaceC4911e interfaceC4911e = AbstractC1515e.ad;
                StringBuilder applovin = AbstractC8703e.applovin("Applied DefaultRequest to ", c11787e, ". New url: ");
                applovin.append(c10263e.ad);
                interfaceC4911e.amazon(applovin.toString());
                return Unit.INSTANCE;
            case 4:
                C6442e c6442e3 = (C6442e) this.f31508e;
                C7190e c7190e = (C7190e) this.f31507e;
                AbstractC2003e.purchase(obj);
                return C6442e.vip(c6442e3, null, null, c7190e, null, null, null, null, null, 131055);
            case 5:
                AbstractC16049e abstractC16049e = (AbstractC16049e) this.f31508e;
                EnumC13413e enumC13413e = (EnumC13413e) this.f31507e;
                AbstractC2003e.purchase(obj);
                return new C9081e(abstractC16049e, enumC13413e);
            case 6:
                C9830e c9830e = (C9830e) this.f31508e;
                EnumC9603e enumC9603e = (EnumC9603e) this.f31507e;
                AbstractC2003e.purchase(obj);
                int ordinal = enumC9603e.ordinal();
                if (ordinal == 0) {
                    return c9830e;
                }
                if (ordinal == 1) {
                    return C9830e.ad(c9830e, AbstractC8228e.metrica(AbstractC13480e.m3607transient(c9830e.metrica)));
                }
                if (ordinal == 2) {
                    return C9830e.ad(c9830e, AbstractC8228e.metrica(AbstractC13480e.m3577else(c9830e.metrica, new C11797e(i2))));
                }
                if (ordinal == 3) {
                    return C9830e.ad(c9830e, AbstractC8228e.metrica(AbstractC13480e.m3577else(c9830e.metrica, new C11797e(7))));
                }
                if (ordinal == 4) {
                    return C9830e.ad(c9830e, AbstractC8228e.metrica(AbstractC13480e.m3577else(c9830e.metrica, new C11797e(i))));
                }
                if (ordinal == 5) {
                    return C9830e.ad(c9830e, AbstractC8228e.metrica(AbstractC13480e.m3577else(c9830e.metrica, new C11797e(8))));
                }
                throw new C14803e(10);
            case 7:
                AbstractC2003e.purchase(obj);
                Throwable th = (Throwable) this.f31508e;
                Log.e("PipePresenceSrc", "Error in camera ID flow collection.", th);
                C8765e c8765e = (C8765e) this.f31507e;
                if (((AtomicBoolean) c8765e.f17670e).get()) {
                    c8765e.appmetrica(null, th);
                } else {
                    AbstractC3192e.ad(Log.d("PipePresenceSrc", "Ignoring error because monitoring is stopped."));
                }
                return Unit.INSTANCE;
            case 8:
                C10282e c10282e = (C10282e) this.f31508e;
                C0044e c0044e = (C0044e) this.f31507e;
                AbstractC2003e.purchase(obj);
                Set keySet = c0044e.ad().keySet();
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C11951e) it.next()).ad);
                }
                LinkedHashMap vip2 = c10282e.vip();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry3 : vip2.entrySet()) {
                    if (!arrayList.contains((String) entry3.getKey())) {
                        linkedHashMap.put(entry3.getKey(), entry3.getValue());
                    }
                }
                C0044e appmetrica = c0044e.appmetrica();
                for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                    String str3 = (String) entry4.getKey();
                    Object value = entry4.getValue();
                    if (value instanceof Boolean) {
                        appmetrica.license(new C11951e(str3), value);
                    } else if (value instanceof Float) {
                        appmetrica.license(new C11951e(str3), value);
                    } else if (value instanceof Integer) {
                        appmetrica.license(new C11951e(str3), value);
                    } else if (value instanceof Long) {
                        appmetrica.license(new C11951e(str3), value);
                    } else if (value instanceof String) {
                        appmetrica.license(new C11951e(str3), value);
                    } else if (value instanceof Set) {
                        appmetrica.license(new C11951e(str3), (Set) value);
                    }
                }
                return appmetrica.purchase();
            case 9:
                List list5 = (List) this.f31508e;
                EnumC9603e enumC9603e2 = (EnumC9603e) this.f31507e;
                AbstractC2003e.purchase(obj);
                int ordinal2 = enumC9603e2.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        list5 = AbstractC13480e.m3607transient(list5);
                    } else if (ordinal2 == 2) {
                        list5 = AbstractC13480e.m3577else(list5, new C11797e(16));
                    } else if (ordinal2 == 3) {
                        list5 = AbstractC13480e.m3577else(list5, new C11797e(18));
                    } else if (ordinal2 == 4) {
                        list5 = AbstractC13480e.m3577else(list5, new C11797e(17));
                    } else {
                        if (ordinal2 != 5) {
                            throw new C14803e(10);
                        }
                        list5 = AbstractC13480e.m3577else(list5, new C11797e(19));
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list5, 10));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C1254e((CachedTrack) it2.next()));
                }
                return AbstractC8228e.metrica(arrayList2);
            default:
                C10282e c10282e2 = (C10282e) this.f31508e;
                C10876e c10876e = (C10876e) this.f31507e;
                AbstractC2003e.purchase(obj);
                SharedPreferences sharedPreferences = c10282e2.ad;
                c10282e2.ad("now_playing_controller");
                return C10876e.vip(c10876e, AbstractC7890e.billing(sharedPreferences.getString("now_playing_controller", "0"), "1"), c10282e2.metrica("swipe_nowplaying", true), false, c10282e2.metrica("interface_mpswipe", false), false, null, null, null, c10282e2.metrica("interface_roundednp", true), c10282e2.metrica("np_slide_hide_systembars", false), false, false, false, false, false, false, 261364);
        }
    }
}
