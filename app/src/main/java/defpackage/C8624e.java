package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8624e {
    public static final /* synthetic */ InterfaceC8614e[] adcel;
    public final LinkedHashMap ad;
    public final C1159e appmetrica;
    public final C0394e billing;
    public final C1159e license;
    public final LinkedHashMap metrica;
    public final C8286e purchase;
    public final /* synthetic */ AbstractC4362e startapp;
    public final LinkedHashMap vip;
    public final C0394e yandex;

    static {
        C12156e c12156e = new C12156e(C8624e.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        adcel = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(C8624e.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, c12232e)};
    }

    /* JADX WARN: Type inference failed for: r5v34, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r5v36, types: [eٖؑٚ, eٖۥٌ] */
    public C8624e(AbstractC4362e abstractC4362e, List list, List list2, List list3) {
        this.startapp = abstractC4362e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C0520e metrica = AbstractC17487e.metrica((InterfaceC11824e) abstractC4362e.vip.f10513e, ((C9920e) ((AbstractC6649e) obj)).f19603e);
            Object obj2 = linkedHashMap.get(metrica);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(metrica, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.ad = ad(linkedHashMap);
        AbstractC4362e abstractC4362e2 = this.startapp;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : list2) {
            C0520e metrica2 = AbstractC17487e.metrica((InterfaceC11824e) abstractC4362e2.vip.f10513e, ((C17485e) ((AbstractC6649e) obj3)).f34278e);
            Object obj4 = linkedHashMap2.get(metrica2);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap2.put(metrica2, obj4);
            }
            ((List) obj4).add(obj3);
        }
        this.vip = ad(linkedHashMap2);
        ((C11047e) ((C18277e) this.startapp.vip.f10517e).metrica).getClass();
        AbstractC4362e abstractC4362e3 = this.startapp;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj5 : list3) {
            C0520e metrica3 = AbstractC17487e.metrica((InterfaceC11824e) abstractC4362e3.vip.f10513e, ((C16162e) ((AbstractC6649e) obj5)).f31745e);
            Object obj6 = linkedHashMap3.get(metrica3);
            if (obj6 == null) {
                obj6 = new ArrayList();
                linkedHashMap3.put(metrica3, obj6);
            }
            ((List) obj6).add(obj5);
        }
        this.metrica = ad(linkedHashMap3);
        this.license = ((C6272e) ((C18277e) this.startapp.vip.f10517e).ad).vip(new C16314e(this, 0));
        this.appmetrica = ((C6272e) ((C18277e) this.startapp.vip.f10517e).ad).vip(new C16314e(this, 1));
        this.purchase = ((C6272e) ((C18277e) this.startapp.vip.f10517e).ad).metrica(new C16314e(this, 2));
        AbstractC4362e abstractC4362e4 = this.startapp;
        C6272e c6272e = (C6272e) ((C18277e) abstractC4362e4.vip.f10517e).ad;
        C11925e c11925e = new C11925e(this, abstractC4362e4, 0);
        c6272e.getClass();
        this.billing = new C16622e(c6272e, c11925e);
        AbstractC4362e abstractC4362e5 = this.startapp;
        C6272e c6272e2 = (C6272e) ((C18277e) abstractC4362e5.vip.f10517e).ad;
        C11925e c11925e2 = new C11925e(this, abstractC4362e5, 1);
        c6272e2.getClass();
        this.yandex = new C16622e(c6272e2, c11925e2);
    }

    public static LinkedHashMap ad(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC10064e.appmetrica(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractC6649e> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(iterable, 10));
            for (AbstractC6649e abstractC6649e : iterable) {
                int metrica = abstractC6649e.metrica();
                int pro = C9831e.pro(metrica) + metrica;
                if (pro > 4096) {
                    pro = 4096;
                }
                C9831e m2672protected = C9831e.m2672protected(byteArrayOutputStream, pro);
                m2672protected.m2689e(metrica);
                abstractC6649e.purchase(m2672protected);
                m2672protected.crashlytics();
                arrayList.add(Unit.INSTANCE);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
