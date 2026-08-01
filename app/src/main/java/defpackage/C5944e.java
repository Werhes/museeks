package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ۟ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5944e {
    public final Function1 Signature;
    public final Context ad;
    public InterfaceC8850e adcel;
    public InterfaceC10819e admob;
    public int advert;
    public Function1 amazon;
    public String appmetrica;
    public Map billing;
    public InterfaceC1363e license;
    public Function1 loadAd;
    public Object metrica;
    public InterfaceC8850e mopub;
    public Object pro;
    public boolean purchase;
    public int remoteconfig;
    public C15695e smaato;
    public InterfaceC8850e startapp;
    public int subscription;
    public C13661e vip;
    public InterfaceC11259e yandex;

    public C5944e(Context context) {
        this.ad = context;
        this.vip = C13661e.loadAd;
        this.metrica = null;
        this.license = null;
        this.appmetrica = null;
        this.billing = C9139e.f18290e;
        this.yandex = null;
        this.startapp = null;
        this.adcel = null;
        this.mopub = null;
        this.advert = 0;
        this.smaato = null;
        C15146e c15146e = C15146e.f29954e;
        this.amazon = c15146e;
        this.loadAd = c15146e;
        this.Signature = c15146e;
        this.admob = null;
        this.subscription = 0;
        this.remoteconfig = 0;
        this.pro = C14193e.vip;
    }

    public C5944e(C14542e c14542e, Context context) {
        this.ad = context;
        this.vip = c14542e.isVip;
        this.metrica = c14542e.vip;
        this.license = c14542e.metrica;
        this.appmetrica = c14542e.license;
        this.billing = c14542e.appmetrica;
        C2178e c2178e = c14542e.tapsense;
        this.yandex = c14542e.billing;
        this.startapp = c2178e.ad;
        this.adcel = c2178e.vip;
        this.mopub = c2178e.metrica;
        this.advert = c2178e.license;
        this.smaato = c14542e.amazon;
        this.amazon = c2178e.appmetrica;
        this.loadAd = c2178e.purchase;
        this.Signature = c2178e.billing;
        this.admob = c2178e.yandex;
        this.subscription = c2178e.startapp;
        this.remoteconfig = c2178e.adcel;
        this.pro = c14542e.signatures;
    }

    public final C14542e ad() {
        C14193e c14193e;
        Object obj = this.metrica;
        if (obj == null) {
            obj = C10734e.ad;
        }
        Object obj2 = obj;
        InterfaceC1363e interfaceC1363e = this.license;
        String str = this.appmetrica;
        Map map = this.billing;
        if (AbstractC7890e.billing(map, Boolean.valueOf(this.purchase))) {
            map = AbstractC18467e.license(AbstractC9476e.metrica(map));
        } else if (!AbstractC0869e.premium(map)) {
            throw new AssertionError();
        }
        Map map2 = map;
        C13661e c13661e = this.vip;
        AbstractC11062e abstractC11062e = c13661e.ad;
        InterfaceC11259e interfaceC11259e = this.yandex;
        int i = this.advert;
        if (i == 0) {
            i = c13661e.appmetrica;
        }
        int i2 = i;
        int i3 = c13661e.purchase;
        int i4 = c13661e.billing;
        InterfaceC8850e interfaceC8850e = this.startapp;
        if (interfaceC8850e == null) {
            interfaceC8850e = c13661e.vip;
        }
        InterfaceC8850e interfaceC8850e2 = interfaceC8850e;
        InterfaceC8850e interfaceC8850e3 = this.adcel;
        if (interfaceC8850e3 == null) {
            interfaceC8850e3 = c13661e.metrica;
        }
        InterfaceC8850e interfaceC8850e4 = interfaceC8850e3;
        InterfaceC8850e interfaceC8850e5 = this.mopub;
        if (interfaceC8850e5 == null) {
            interfaceC8850e5 = c13661e.license;
        }
        InterfaceC8850e interfaceC8850e6 = interfaceC8850e5;
        C15695e c15695e = this.smaato;
        Function1 function1 = this.amazon;
        if (function1 == null) {
            function1 = c13661e.yandex;
        }
        Function1 function12 = function1;
        Function1 function13 = this.loadAd;
        if (function13 == null) {
            function13 = c13661e.startapp;
        }
        Function1 function14 = function13;
        Function1 function15 = this.Signature;
        if (function15 == null) {
            function15 = c13661e.adcel;
        }
        Function1 function16 = function15;
        InterfaceC10819e interfaceC10819e = this.admob;
        if (interfaceC10819e == null) {
            interfaceC10819e = c13661e.mopub;
        }
        InterfaceC10819e interfaceC10819e2 = interfaceC10819e;
        int i5 = this.subscription;
        if (i5 == 0) {
            i5 = c13661e.advert;
        }
        int i6 = i5;
        int i7 = this.remoteconfig;
        if (i7 == 0) {
            i7 = c13661e.smaato;
        }
        int i8 = i7;
        Object obj3 = this.pro;
        if (obj3 instanceof C9061e) {
            c14193e = new C14193e(AbstractC18467e.license(((C9061e) obj3).ad));
        } else {
            if (!(obj3 instanceof C14193e)) {
                throw new AssertionError();
            }
            c14193e = (C14193e) obj3;
        }
        C14193e c14193e2 = c14193e;
        InterfaceC8850e interfaceC8850e7 = this.startapp;
        InterfaceC8850e interfaceC8850e8 = this.adcel;
        InterfaceC8850e interfaceC8850e9 = this.mopub;
        Function1 function17 = this.amazon;
        Function1 function18 = this.loadAd;
        return new C14542e(this.ad, obj2, interfaceC1363e, str, map2, abstractC11062e, interfaceC11259e, interfaceC8850e2, interfaceC8850e4, interfaceC8850e6, i2, i3, i4, c15695e, function12, function14, function16, interfaceC10819e2, i6, i8, c14193e2, new C2178e(interfaceC8850e7, interfaceC8850e8, interfaceC8850e9, this.advert, function17, function18, this.Signature, this.admob, this.subscription, this.remoteconfig), this.vip);
    }

    public final void license(int i) {
        AbstractC17540e.ad(i);
        C3645e c3645e = new C3645e(i);
        AbstractC17540e.ad(i);
        this.admob = new C0113e(new C16320e(c3645e, new C3645e(i)));
    }

    public final Map metrica() {
        Map map = this.billing;
        if (!AbstractC7890e.billing(map, Boolean.valueOf(this.purchase))) {
            if (!AbstractC0869e.premium(map)) {
                throw new AssertionError();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            this.billing = linkedHashMap;
            this.purchase = true;
            map = linkedHashMap;
        }
        return AbstractC9476e.metrica(map);
    }

    public final C9061e vip() {
        Object obj = this.pro;
        if (obj instanceof C9061e) {
            return (C9061e) obj;
        }
        if (!(obj instanceof C14193e)) {
            throw new AssertionError();
        }
        C9061e c9061e = new C9061e((C14193e) obj);
        this.pro = c9061e;
        return c9061e;
    }
}
