package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0203e extends AbstractC9531e {
    public final InterfaceC9998e billing;
    public final C4030e purchase;
    public boolean startapp;
    public int yandex;

    public /* synthetic */ C0203e(AbstractC0232e abstractC0232e, C4030e c4030e, String str, int i) {
        this(abstractC0232e, c4030e, (i & 4) != 0 ? null : str, (InterfaceC9998e) null);
    }

    public C0203e(AbstractC0232e abstractC0232e, C4030e c4030e, String str, InterfaceC9998e interfaceC9998e) {
        super(abstractC0232e, str);
        this.purchase = c4030e;
        this.billing = interfaceC9998e;
    }

    @Override // defpackage.AbstractC9531e
    /* renamed from: implements, reason: not valid java name */
    public String mo264implements(InterfaceC9998e interfaceC9998e, int i) {
        AbstractC0232e abstractC0232e = this.metrica;
        AbstractC6629e.loadAd(abstractC0232e, interfaceC9998e);
        String billing = interfaceC9998e.billing(i);
        if (this.appmetrica.adcel && !mo263catch().f8962e.keySet().contains(billing)) {
            C15816e c15816e = abstractC0232e.metrica;
            C5625e c5625e = new C5625e(interfaceC9998e, abstractC0232e, 22);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c15816e.f31190e;
            Map map = (Map) concurrentHashMap.get(interfaceC9998e);
            Object obj = null;
            C5107e c5107e = AbstractC6629e.ad;
            Object obj2 = map != null ? map.get(c5107e) : null;
            if (obj2 == null) {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = c5625e.invoke();
                Object obj3 = concurrentHashMap.get(interfaceC9998e);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(interfaceC9998e, obj3);
                }
                ((Map) obj3).put(c5107e, obj2);
            }
            Map map2 = (Map) obj2;
            Iterator it = mo263catch().f8962e.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return billing;
    }

    @Override // defpackage.AbstractC9531e
    /* renamed from: interface, reason: not valid java name */
    public AbstractC1948e mo265interface(String str) {
        return (AbstractC1948e) AbstractC10064e.license(str, mo263catch());
    }

    @Override // defpackage.AbstractC9531e, defpackage.InterfaceC11754e
    public final boolean isVip() {
        return !this.startapp && super.isVip();
    }

    @Override // defpackage.AbstractC9531e, defpackage.InterfaceC11754e
    public final InterfaceC2043e metrica(InterfaceC9998e interfaceC9998e) {
        InterfaceC9998e interfaceC9998e2 = this.billing;
        if (interfaceC9998e != interfaceC9998e2) {
            return super.metrica(interfaceC9998e);
        }
        AbstractC1948e m2601goto = m2601goto();
        String ad = interfaceC9998e2.ad();
        if (m2601goto instanceof C4030e) {
            String str = this.license;
            return new C0203e(this.metrica, (C4030e) m2601goto, str, interfaceC9998e2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C12232e c12232e = AbstractC3820e.ad;
        sb.append(c12232e.vip(C4030e.class).mopub());
        sb.append(", but had ");
        sb.append(c12232e.vip(m2601goto.getClass()).mopub());
        sb.append(" as the serialized body of ");
        sb.append(ad);
        sb.append(" at element: ");
        sb.append(m2606super());
        throw AbstractC3421e.appmetrica(sb.toString(), m2601goto.toString(), -1);
    }

    /* renamed from: package, reason: not valid java name */
    public final boolean m266package(InterfaceC9998e interfaceC9998e, int i) {
        boolean z = (this.metrica.ad.appmetrica || interfaceC9998e.mopub(i) || !interfaceC9998e.adcel(i).metrica()) ? false : true;
        this.startapp = z;
        return z;
    }

    @Override // defpackage.AbstractC9531e
    /* renamed from: private, reason: not valid java name and merged with bridge method [inline-methods] */
    public C4030e mo263catch() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC9531e, defpackage.InterfaceC2043e
    public void vip(InterfaceC9998e interfaceC9998e) {
        Set loadAd;
        AbstractC0232e abstractC0232e = this.metrica;
        if (AbstractC6629e.advert(abstractC0232e, interfaceC9998e) || (interfaceC9998e.appmetrica() instanceof AbstractC13637e)) {
            return;
        }
        AbstractC6629e.loadAd(abstractC0232e, interfaceC9998e);
        if (this.appmetrica.adcel) {
            Set ad = AbstractC14161e.ad(interfaceC9998e);
            Map map = (Map) ((ConcurrentHashMap) abstractC0232e.metrica.f31190e).get(interfaceC9998e);
            Object obj = map != null ? map.get(AbstractC6629e.ad) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set keySet = map2 != null ? map2.keySet() : null;
            if (keySet == null) {
                keySet = C3295e.f7451e;
            }
            loadAd = AbstractC4511e.loadAd(ad, keySet);
        } else {
            loadAd = AbstractC14161e.ad(interfaceC9998e);
        }
        for (String str : mo263catch().f8962e.keySet()) {
            if (!loadAd.contains(str) && !AbstractC7890e.billing(str, this.license)) {
                StringBuilder applovin = AbstractC8703e.applovin("Encountered an unknown key '", str, "' at element: ");
                applovin.append(m2606super());
                applovin.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                applovin.append((Object) AbstractC3421e.adcel(mo263catch().toString(), -1));
                throw AbstractC3421e.license(-1, applovin.toString());
            }
        }
    }

    @Override // defpackage.InterfaceC2043e
    public int yandex(InterfaceC9998e interfaceC9998e) {
        while (this.yandex < interfaceC9998e.purchase()) {
            int i = this.yandex;
            this.yandex = i + 1;
            String m2597case = m2597case(interfaceC9998e, i);
            int i2 = this.yandex - 1;
            this.startapp = false;
            if (mo263catch().containsKey(m2597case) || m266package(interfaceC9998e, i2)) {
                if (this.appmetrica.billing) {
                    boolean mopub = interfaceC9998e.mopub(i2);
                    InterfaceC9998e adcel = interfaceC9998e.adcel(i2);
                    if (!mopub || adcel.metrica() || !(((AbstractC1948e) mo263catch().get(m2597case)) instanceof C11549e)) {
                        if (AbstractC7890e.billing(adcel.appmetrica(), C7784e.appmetrica) && (!adcel.metrica() || !(((AbstractC1948e) mo263catch().get(m2597case)) instanceof C11549e))) {
                            AbstractC1948e abstractC1948e = (AbstractC1948e) mo263catch().get(m2597case);
                            String str = null;
                            AbstractC16920e abstractC16920e = abstractC1948e instanceof AbstractC16920e ? (AbstractC16920e) abstractC1948e : null;
                            if (abstractC16920e != null) {
                                C5404e c5404e = AbstractC12517e.ad;
                                if (!(abstractC16920e instanceof C11549e)) {
                                    str = abstractC16920e.appmetrica();
                                }
                            }
                            if (str != null) {
                                AbstractC0232e abstractC0232e = this.metrica;
                                int adcel2 = AbstractC6629e.adcel(adcel, abstractC0232e, str);
                                boolean z = !abstractC0232e.ad.appmetrica && adcel.metrica();
                                if (adcel2 == -3 && ((mopub || z) && !m266package(interfaceC9998e, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }
}
