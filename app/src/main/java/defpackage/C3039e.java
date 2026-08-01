package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۨۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3039e implements InterfaceC9739e {
    public final Method ad;
    public final ArrayList appmetrica;
    public final ArrayList license;
    public final ArrayList metrica;
    public final Method vip;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    public C3039e(InterfaceC16528e interfaceC16528e, AbstractC15529e abstractC15529e, String str, List list) {
        ?? singletonList;
        Method yandex;
        this.ad = abstractC15529e.m4000class("constructor-impl", str);
        this.vip = abstractC15529e.m4000class("box-impl", AbstractC5304e.m1853catch(str, "V") + AbstractC2677e.vip(abstractC15529e.subs()));
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (true) {
            List list2 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC10226e vip = AbstractC14430e.vip(((InterfaceC12132e) it.next()).ad());
            ArrayList startapp = AbstractC2251e.startapp(vip);
            if (startapp == null) {
                Class Signature = AbstractC2251e.Signature(vip);
                if (Signature != null && (yandex = AbstractC2251e.yandex(Signature, interfaceC16528e)) != null) {
                    list2 = Collections.singletonList(yandex);
                }
            } else {
                list2 = startapp;
            }
            arrayList.add(list2);
        }
        this.metrica = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            InterfaceC5052e interfaceC5052e = (InterfaceC5052e) ((InterfaceC12132e) obj).ad().loadAd().advert();
            List list3 = (List) this.metrica.get(i);
            if (list3 != null) {
                singletonList = new ArrayList(AbstractC0746e.subscription(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    singletonList.add(((Method) it2.next()).getReturnType());
                }
            } else {
                singletonList = Collections.singletonList(AbstractC5965e.yandex(interfaceC5052e));
            }
            arrayList2.add(singletonList);
            i = i2;
        }
        this.license = arrayList2;
        this.appmetrica = AbstractC0746e.remoteconfig(arrayList2);
    }

    @Override // defpackage.InterfaceC9739e
    public final List ad() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC9739e
    public final Type inmobi() {
        return this.vip.getReturnType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @Override // defpackage.InterfaceC9739e
    public final Object license(Object[] objArr) {
        ?? singletonList;
        int length = objArr.length;
        ArrayList arrayList = this.metrica;
        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC0746e.subscription(arrayList, 10), length));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i >= length) {
                break;
            }
            arrayList2.add(new C6571e(objArr[i], next));
            i++;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C6571e c6571e = (C6571e) it2.next();
            Object obj = c6571e.f13544e;
            List list = (List) c6571e.f13543e;
            if (list != null) {
                singletonList = new ArrayList(AbstractC0746e.subscription(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    singletonList.add(((Method) it3.next()).invoke(obj, null));
                }
            } else {
                singletonList = Collections.singletonList(obj);
            }
            AbstractC13480e.inmobi(arrayList3, singletonList);
        }
        Object[] array = arrayList3.toArray(new Object[0]);
        this.ad.invoke(null, Arrays.copyOf(array, array.length));
        return this.vip.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // defpackage.InterfaceC9739e
    public final /* bridge */ boolean metrica() {
        return false;
    }

    @Override // defpackage.InterfaceC9739e
    public final /* bridge */ /* synthetic */ Member vip() {
        return null;
    }
}
