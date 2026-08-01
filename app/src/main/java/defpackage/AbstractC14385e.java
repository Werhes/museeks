package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۦٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14385e {
    public static final C2892e ad = new C2892e(-1472995251, false, new C2131e(6));
    public static final C2892e vip = new C2892e(1934101421, false, new C2131e(7));
    public static final C2892e metrica = new C2892e(-1637550186, false, new C2131e(8));
    public static final C2892e license = new C2892e(-1211519641, false, new C11049e(27));
    public static final C2892e appmetrica = new C2892e(-218895566, false, new C2131e(9));
    public static final C2892e purchase = new C2892e(1688112943, false, new C11049e(28));
    public static final C2892e billing = new C2892e(-1628616208, false, new C2131e(10));

    public static final C6399e ad(String str) {
        C11787e c11787e = new C11787e();
        AbstractC3202e.vip(c11787e, str);
        return c11787e.vip();
    }

    public static final void appmetrica(C11787e c11787e, C11787e c11787e2) {
        c11787e.license = c11787e2.license;
        c11787e.ad = c11787e2.ad;
        c11787e.appmetrica(c11787e2.metrica);
        c11787e.yandex = c11787e2.yandex;
        c11787e.appmetrica = c11787e2.appmetrica;
        c11787e.purchase = c11787e2.purchase;
        C10095e c10095e = new C10095e(1);
        AbstractC12900e.ad(c10095e, c11787e2.startapp);
        c11787e.startapp = c10095e;
        c11787e.adcel = new C16722e(c10095e);
        c11787e.billing = c11787e2.billing;
        c11787e.vip = c11787e2.vip;
    }

    public static final InterfaceC8910e license(InterfaceC8910e interfaceC8910e, boolean z) {
        if (!z) {
            return interfaceC8910e;
        }
        InterfaceC4895e mo2321e = interfaceC8910e.mo2321e();
        return (mo2321e.mo1682e(0L, AbstractC1207e.vip) || mo2321e.mo1682e(0L, AbstractC1207e.ad)) ? AbstractC0436e.metrica(new C13197e(new C14184e(interfaceC8910e.mo2321e())), interfaceC8910e.getFileSystem()) : interfaceC8910e;
    }

    public static InterfaceC5374e metrica(C6195e c6195e, CharSequence charSequence, InterfaceC5374e interfaceC5374e) {
        String sb;
        ArrayList arrayList = new ArrayList();
        ArrayList mopub = AbstractC6874e.mopub(new C11142e(interfaceC5374e, c6195e, 0));
        while (true) {
            C11142e c11142e = (C11142e) AbstractC13480e.m3594package(mopub);
            if (c11142e == null) {
                if (arrayList.size() > 1) {
                    AbstractC5167e.signatures(new C11797e(9), arrayList);
                }
                if (arrayList.size() == 1) {
                    sb = "Position " + ((C7883e) arrayList.get(0)).ad + ": " + ((String) ((C7883e) arrayList.get(0)).vip.invoke());
                } else {
                    StringBuilder sb2 = new StringBuilder(arrayList.size() * 33);
                    AbstractC13480e.m3610while(arrayList, sb2, ", ", "Errors: ", null, new C4526e(18), 56);
                    sb = sb2.toString();
                }
                throw new Exception(sb);
            }
            InterfaceC5374e interfaceC5374e2 = (InterfaceC5374e) ((InterfaceC5374e) c11142e.ad).ad();
            int i = c11142e.metrica;
            C6195e c6195e2 = c11142e.vip;
            List list = c6195e2.ad;
            List list2 = c6195e2.vip;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    Object ad2 = ((InterfaceC5142e) c6195e2.ad.get(i2)).ad(interfaceC5374e2, charSequence, i);
                    if (ad2 instanceof Integer) {
                        i = ((Number) ad2).intValue();
                        i2++;
                    } else {
                        if (!(ad2 instanceof C7883e)) {
                            throw new IllegalStateException(("Unexpected parse result: " + ad2).toString());
                        }
                        arrayList.add((C7883e) ad2);
                    }
                } else if (!list2.isEmpty()) {
                    int size2 = list2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i3 = size2 - 1;
                            mopub.add(new C11142e(interfaceC5374e2, (C6195e) list2.get(size2), i));
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        }
                    }
                } else {
                    if (i == charSequence.length()) {
                        return interfaceC5374e2;
                    }
                    arrayList.add(new C7883e(i, C2997e.f7044e));
                }
            }
        }
    }

    public static void vip(AppActivity appActivity) {
        SharedPreferences sharedPreferences = AbstractC16082e.license;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        C1630e c1630e = new C1630e(0, EnumC5119e.f10982e);
        while (c1630e.hasNext()) {
            EnumC5119e enumC5119e = (EnumC5119e) c1630e.next();
            if (((Boolean) enumC5119e.f10984e.invoke()).booleanValue() && !sharedPreferences.getBoolean("bad_device_vpn", false)) {
                new C4221e(enumC5119e).signatures(appActivity);
                return;
            }
        }
    }
}
