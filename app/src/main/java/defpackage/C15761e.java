package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٜ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15761e implements InterfaceC17259e {
    public final /* synthetic */ int ad;
    public static final C15761e vip = new C15761e(0);
    public static final C9938e metrica = new C9938e(C0251e.class, InterfaceC6830e.class, new C2282e(18));
    public static final C15761e license = new C15761e(1);
    public static final C15761e appmetrica = new C15761e(2);
    public static final C9938e purchase = new C9938e(C0251e.class, InterfaceC13627e.class, new C5275e(1));
    public static final C15761e billing = new C15761e(3);
    public static final C9938e yandex = new C9938e(C0251e.class, InterfaceC7304e.class, new C0189e(11));
    public static final C15761e startapp = new C15761e(4);
    public static final C9938e adcel = new C9938e(C0251e.class, InterfaceC14710e.class, new C0189e(12));
    public static final C15761e mopub = new C15761e(5);
    public static final C9938e advert = new C9938e(C0251e.class, InterfaceC7648e.class, new C13415e(0));

    public /* synthetic */ C15761e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC17259e
    public final Class ad() {
        switch (this.ad) {
            case 0:
                return InterfaceC6830e.class;
            case 1:
                return C13293e.class;
            case 2:
                return InterfaceC13627e.class;
            case 3:
                return InterfaceC7304e.class;
            case 4:
                return InterfaceC14710e.class;
            default:
                return InterfaceC7648e.class;
        }
    }

    @Override // defpackage.InterfaceC17259e
    public final Object metrica(C17424e c17424e, C18070e c18070e) {
        C15768e advert2;
        List arrayList;
        C15768e advert3;
        List list;
        C15768e advert4;
        List arrayList2;
        C15768e advert5;
        List arrayList3;
        C15768e advert6;
        List arrayList4;
        switch (this.ad) {
            case 0:
                HashMap hashMap = new HashMap();
                for (int i = 0; i < ((List) c17424e.f34142e).size(); i++) {
                    C3611e applovin = c17424e.applovin(i);
                    if (applovin.metrica.equals(C7364e.f15095e)) {
                        AbstractC14783e ad = applovin.ad();
                        if (ad instanceof AbstractC3004e) {
                            advert2 = ((AbstractC3004e) ad).advert();
                        } else {
                            if (!(ad instanceof C0251e)) {
                                throw new GeneralSecurityException("Cannot get output prefix for key of class " + ad.getClass().getName() + " with parameters " + ad.metrica());
                            }
                            advert2 = ((C0251e) ad).advert();
                        }
                        C2165e c2165e = new C2165e((InterfaceC6830e) c18070e.adcel(applovin), applovin.license);
                        byte[] bArr = advert2.ad;
                        if (bArr.length != 0 && bArr.length != 5) {
                            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                        }
                        if (hashMap.containsKey(advert2)) {
                            arrayList = (List) hashMap.get(advert2);
                        } else {
                            arrayList = new ArrayList();
                            hashMap.put(advert2, arrayList);
                        }
                        arrayList.add(c2165e);
                    }
                }
                c17424e.isPro();
                return new C17862e(new C2165e((InterfaceC6830e) c18070e.adcel(c17424e.subs()), c17424e.subs().license), new C8866e(hashMap));
            case 1:
                C3611e subs = c17424e.subs();
                HashMap hashMap2 = new HashMap();
                for (int i2 = 0; i2 < ((List) c17424e.f34142e).size(); i2++) {
                    C3611e applovin2 = c17424e.applovin(i2);
                    if (applovin2.metrica.equals(C7364e.f15095e)) {
                        C13293e c13293e = (C13293e) c18070e.adcel(applovin2);
                        AbstractC14783e ad2 = applovin2.ad();
                        if (ad2 instanceof AbstractC17608e) {
                            advert3 = ((AbstractC17608e) ad2).advert();
                        } else {
                            if (!(ad2 instanceof C0251e)) {
                                throw new GeneralSecurityException("Cannot get output prefix for key of class " + ad2.getClass().getName() + " with parameters " + ad2.metrica());
                            }
                            advert3 = ((C0251e) ad2).advert();
                        }
                        byte[] bArr2 = advert3.ad;
                        if (bArr2.length != 0 && bArr2.length != 5) {
                            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                        }
                        if (hashMap2.containsKey(advert3)) {
                            list = (List) hashMap2.get(advert3);
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            hashMap2.put(advert3, arrayList5);
                            list = arrayList5;
                        }
                        list.add(c13293e);
                    }
                }
                return new Object();
            case 2:
                HashMap hashMap3 = new HashMap();
                for (int i3 = 0; i3 < ((List) c17424e.f34142e).size(); i3++) {
                    C3611e applovin3 = c17424e.applovin(i3);
                    if (applovin3.metrica.equals(C7364e.f15095e)) {
                        InterfaceC13627e interfaceC13627e = (InterfaceC13627e) c18070e.adcel(applovin3);
                        AbstractC14783e ad3 = applovin3.ad();
                        if (ad3 instanceof C12892e) {
                            advert4 = ((C12892e) ad3).metrica;
                        } else {
                            if (!(ad3 instanceof C0251e)) {
                                throw new GeneralSecurityException("Cannot get output prefix for key of class " + ad3.getClass().getName() + " with parameters " + ad3.metrica());
                            }
                            advert4 = ((C0251e) ad3).advert();
                        }
                        C13987e c13987e = new C13987e(interfaceC13627e, applovin3.license);
                        byte[] bArr3 = advert4.ad;
                        if (bArr3.length != 0 && bArr3.length != 5) {
                            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                        }
                        if (hashMap3.containsKey(advert4)) {
                            arrayList2 = (List) hashMap3.get(advert4);
                        } else {
                            arrayList2 = new ArrayList();
                            hashMap3.put(advert4, arrayList2);
                        }
                        arrayList2.add(c13987e);
                    }
                }
                c17424e.isPro();
                return new C7867e(new C13987e((InterfaceC13627e) c18070e.adcel(c17424e.subs()), c17424e.subs().license), new C8866e(hashMap3));
            case 3:
                HashMap hashMap4 = new HashMap();
                for (int i4 = 0; i4 < ((List) c17424e.f34142e).size(); i4++) {
                    C3611e applovin4 = c17424e.applovin(i4);
                    if (applovin4.metrica.equals(C7364e.f15095e)) {
                        InterfaceC7304e interfaceC7304e = (InterfaceC7304e) c18070e.adcel(applovin4);
                        AbstractC14783e ad4 = applovin4.ad();
                        if (ad4 instanceof AbstractC15702e) {
                            advert5 = ((AbstractC15702e) ad4).advert().advert();
                        } else {
                            if (!(ad4 instanceof C0251e)) {
                                throw new GeneralSecurityException("Cannot get output prefix for key of class " + ad4.getClass().getName() + " with parameters " + ad4.metrica());
                            }
                            advert5 = ((C0251e) ad4).advert();
                        }
                        C7807e c7807e = new C7807e(interfaceC7304e, applovin4.license);
                        byte[] bArr4 = advert5.ad;
                        if (bArr4.length != 0 && bArr4.length != 5) {
                            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                        }
                        if (hashMap4.containsKey(advert5)) {
                            arrayList3 = (List) hashMap4.get(advert5);
                        } else {
                            arrayList3 = new ArrayList();
                            hashMap4.put(advert5, arrayList3);
                        }
                        arrayList3.add(c7807e);
                    }
                }
                c17424e.isPro();
                return new C9599e(new C8866e(hashMap4));
            case 4:
                c17424e.isPro();
                C3611e subs2 = c17424e.subs();
                return new C18049e(new C7988e((InterfaceC14710e) c18070e.adcel(subs2), subs2.license));
            default:
                HashMap hashMap5 = new HashMap();
                for (int i5 = 0; i5 < ((List) c17424e.f34142e).size(); i5++) {
                    C3611e applovin5 = c17424e.applovin(i5);
                    if (applovin5.metrica.equals(C7364e.f15095e)) {
                        InterfaceC7648e interfaceC7648e = (InterfaceC7648e) c18070e.adcel(applovin5);
                        AbstractC14783e ad5 = applovin5.ad();
                        if (ad5 instanceof AbstractC17608e) {
                            advert6 = ((AbstractC17608e) ad5).advert();
                        } else {
                            if (!(ad5 instanceof C0251e)) {
                                throw new GeneralSecurityException("Cannot get output prefix for key of class " + ad5.getClass().getName() + " with parameters " + ad5.metrica());
                            }
                            advert6 = ((C0251e) ad5).advert();
                        }
                        C10914e c10914e = new C10914e(interfaceC7648e, applovin5.license);
                        byte[] bArr5 = advert6.ad;
                        if (bArr5.length != 0 && bArr5.length != 5) {
                            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                        }
                        if (hashMap5.containsKey(advert6)) {
                            arrayList4 = (List) hashMap5.get(advert6);
                        } else {
                            arrayList4 = new ArrayList();
                            hashMap5.put(advert6, arrayList4);
                        }
                        arrayList4.add(c10914e);
                    }
                }
                c17424e.isPro();
                new C10914e((InterfaceC7648e) c18070e.adcel(c17424e.subs()), c17424e.subs().license);
                new C8866e(hashMap5);
                return new Object();
        }
    }

    @Override // defpackage.InterfaceC17259e
    public final Class vip() {
        switch (this.ad) {
            case 0:
                return InterfaceC6830e.class;
            case 1:
                return C13293e.class;
            case 2:
                return InterfaceC13627e.class;
            case 3:
                return InterfaceC7304e.class;
            case 4:
                return InterfaceC14710e.class;
            default:
                return InterfaceC7648e.class;
        }
    }
}
