package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2270e {
    public static final C2892e ad = new C2892e(-994594703, false, new C8453e(1));
    public static final C2892e vip = new C2892e(762815636, false, new C8453e(2));
    public static final C2892e metrica = new C2892e(-755019677, false, new C8453e(3));
    public static final C2892e license = new C2892e(1957084782, false, new C9375e(12));
    public static final C2892e appmetrica = new C2892e(497011419, false, new C13428e(11));
    public static final C2892e purchase = new C2892e(-243495218, false, new C13428e(12));

    public static final void ad(final C10566e c10566e, final InterfaceC12864e interfaceC12864e, final C1839e c1839e, final Function1 function1, final int i, final boolean z, final int i2, final int i3, final Map map, C13770e c13770e, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        C2752e c2752e;
        boolean z2;
        boolean z3;
        c13770e.m3671package(-1343466571);
        int i9 = (i4 & 6) == 0 ? (c13770e.purchase(c10566e) ? 4 : 2) | i4 : i4;
        if ((i4 & 48) == 0) {
            i9 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i9 |= c13770e.purchase(c1839e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i4 & 3072) == 0) {
            i9 |= c13770e.yandex(function1) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i9 |= c13770e.license(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i9 |= c13770e.billing(z) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i9 |= c13770e.license(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i9 |= c13770e.license(i3) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i9 |= c13770e.yandex(map) ? 67108864 : 33554432;
        }
        int i10 = i9 | 805306368;
        if ((i6 & 1024) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i7 = i5 | ((i5 & 8) == 0 ? c13770e.purchase(null) : c13770e.yandex(null) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if (c13770e.m3673protected(i10 & 1, ((i10 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            AbstractC7711e.license(i3, i2);
            C0971e c0971e = (C0971e) c13770e.adcel(AbstractC5956e.ad);
            Object obj = C2987e.ad;
            if (c0971e != null) {
                c13770e.m3676strictfp(1588268245);
                long j = ((C15331e) c13770e.adcel(AbstractC8389e.ad)).vip;
                Object[] objArr = {c0971e};
                i8 = i10;
                int i11 = 15;
                C11883e c11883e = new C11883e(new C11213e(7, c0971e), new C17014e(i11), i11);
                boolean yandex = c13770e.yandex(c0971e);
                Object m3681throw = c13770e.m3681throw();
                if (yandex || m3681throw == obj) {
                    m3681throw = new C15490e(c0971e, 1);
                    c13770e.m3682throws(m3681throw);
                }
                long longValue = ((Number) AbstractC10510e.appmetrica(objArr, c11883e, (Function0) m3681throw, c13770e, 0)).longValue();
                boolean appmetrica2 = c13770e.appmetrica(longValue) | c13770e.purchase(c0971e) | c13770e.appmetrica(j);
                Object m3681throw2 = c13770e.m3681throw();
                if (appmetrica2 || m3681throw2 == obj) {
                    m3681throw2 = new C2752e(longValue, c0971e, j);
                    c13770e.m3682throws(m3681throw2);
                }
                c2752e = (C2752e) m3681throw2;
                c13770e.Signature(false);
            } else {
                i8 = i10;
                c13770e.m3676strictfp(1588759409);
                c13770e.Signature(false);
                c2752e = null;
            }
            C6571e c6571e = AbstractC15265e.ad;
            int length = c10566e.f20850e.length();
            List list = c10566e.f20852e;
            if (list != null) {
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    C9363e c9363e = (C9363e) list.get(i12);
                    if ((c9363e.ad instanceof C9092e) && "androidx.compose.foundation.text.inlineContent".equals(c9363e.license)) {
                        z2 = false;
                        if (AbstractC13195e.vip(0, length, c9363e.vip, c9363e.metrica)) {
                            z3 = true;
                            break;
                        }
                    }
                }
            }
            z2 = false;
            z3 = false;
            boolean vip2 = AbstractC11008e.vip(c10566e);
            InterfaceC2141e interfaceC2141e = (InterfaceC2141e) c13770e.adcel(AbstractC11473e.mopub);
            if (z3 || vip2) {
                boolean z4 = z2;
                C2752e c2752e2 = c2752e;
                c13770e.m3676strictfp(1590022070);
                boolean z5 = (i8 & 14) != 4 ? z4 : true;
                Object m3681throw3 = c13770e.m3681throw();
                if (z5 || m3681throw3 == obj) {
                    m3681throw3 = AbstractC14533e.startapp(c10566e);
                    c13770e.m3682throws(m3681throw3);
                }
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw3;
                C10566e c10566e2 = (C10566e) interfaceC3314e.getValue();
                boolean purchase2 = c13770e.purchase(interfaceC3314e);
                Object m3681throw4 = c13770e.m3681throw();
                if (purchase2 || m3681throw4 == obj) {
                    m3681throw4 = new C9214e(interfaceC3314e, 10);
                    c13770e.m3682throws(m3681throw4);
                }
                int i13 = i8 << 6;
                metrica(interfaceC12864e, c10566e2, function1, z3, map, c1839e, i, z, i2, i3, interfaceC2141e, c2752e2, (Function1) m3681throw4, c13770e, ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), ((i8 >> 21) & 896) | (57344 & (i7 << 12)));
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(1589006262);
                AbstractC12600e.ad(c10566e, c1839e, interfaceC2141e, null, c13770e);
                InterfaceC12864e startapp = startapp(interfaceC12864e, c10566e, c1839e, function1, i, z, i2, i3, interfaceC2141e, null, null, c2752e, null);
                C3783e c3783e = C3783e.purchase;
                long j2 = c13770e.f27286case;
                int i14 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, startapp);
                InterfaceC3483e advert = c13770e.advert();
                InterfaceC5685e.mopub.getClass();
                Function0 function0 = C2721e.vip;
                c13770e.m3666import();
                if (c13770e.f27292implements) {
                    c13770e.mopub(function0);
                } else {
                    c13770e.m3684volatile();
                }
                yandex(c13770e, c3783e, C2721e.billing);
                yandex(c13770e, advert, C2721e.purchase);
                purchase(c13770e, C2721e.mopub);
                yandex(c13770e, purchase3, C2721e.license);
                yandex(c13770e, Integer.valueOf(i14), C2721e.adcel);
                c13770e.Signature(true);
                c13770e.Signature(false);
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٕؗؒ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC2270e.ad(C10566e.this, interfaceC12864e, c1839e, function1, i, z, i2, i3, map, (C13770e) obj2, AbstractC5190e.advert(i4 | 1), AbstractC5190e.advert(i5), i6);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final String adcel(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final void appmetrica(C13770e c13770e, Integer num, Function2 function2) {
        if (c13770e.f27292implements) {
            c13770e.vip(num, function2);
        }
    }

    public static final InterfaceC5673e billing(String str, C13770e c13770e) {
        InterfaceC5673e interfaceC5673e;
        c13770e.m3676strictfp(923020361);
        c13770e.m3676strictfp(1537041123);
        Object m3681throw = c13770e.m3681throw();
        Object obj = C2987e.ad;
        if (m3681throw == obj) {
            m3681throw = new C4526e(19);
            c13770e.m3682throws(m3681throw);
        }
        Object obj2 = (Function1) m3681throw;
        c13770e.Signature(false);
        c13770e.m3676strictfp(-1732095526);
        if (((Boolean) c13770e.adcel(AbstractC13276e.ad)).booleanValue()) {
            interfaceC5673e = new C9308e(C3214e.ad);
        } else {
            c13770e.m3676strictfp(1424240517);
            Context context = (Context) c13770e.adcel(AbstractC2676e.vip);
            c13770e.m3676strictfp(1134374053);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                for (Context context2 = context; context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        m3681throw2 = new C8791e(str, context, (Activity) context2);
                        c13770e.m3682throws(m3681throw2);
                    }
                }
                throw new IllegalStateException("Permissions should be called in the context of an Activity");
            }
            C8791e c8791e = (C8791e) m3681throw2;
            c13770e.Signature(false);
            AbstractC0718e.vip(c8791e, null, c13770e, 0);
            C4094e c4094e = new C4094e(3);
            c13770e.m3676strictfp(1134386901);
            boolean purchase2 = c13770e.purchase(c8791e) | c13770e.purchase(obj2);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase2 || m3681throw3 == obj) {
                m3681throw3 = new C10869e(c8791e, obj2, 11);
                c13770e.m3682throws(m3681throw3);
            }
            c13770e.Signature(false);
            Object yandex = AbstractC11538e.yandex(c4094e, (Function1) m3681throw3, c13770e);
            c13770e.m3676strictfp(1134391322);
            boolean purchase3 = c13770e.purchase(c8791e) | c13770e.yandex(yandex);
            Object m3681throw4 = c13770e.m3681throw();
            if (purchase3 || m3681throw4 == obj) {
                m3681throw4 = new C10869e(c8791e, yandex, 12);
                c13770e.m3682throws(m3681throw4);
            }
            c13770e.Signature(false);
            AbstractC17680e.ad(c8791e, yandex, (Function1) m3681throw4, c13770e);
            c13770e.Signature(false);
            interfaceC5673e = c8791e;
        }
        c13770e.Signature(false);
        c13770e.Signature(false);
        return interfaceC5673e;
    }

    public static final ArrayList license(List list, Function0 function0) {
        C10629e c10629e;
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC16719e interfaceC16719e = (InterfaceC16719e) list.get(i2);
            C18070e c18070e = ((C15330e) interfaceC16719e.signatures()).f30251e;
            C2809e c2809e = (C2809e) c18070e.f35442e;
            C9363e c9363e = (C9363e) c18070e.f35441e;
            C12476e c12476e = (C12476e) c2809e.ad.getValue();
            if (c12476e == null) {
                c10629e = new C10629e(new C13117e(4), i, i, 10);
            } else {
                C9363e metrica2 = C2809e.metrica(c9363e, c12476e);
                if (metrica2 == null) {
                    c10629e = new C10629e(new C13117e(5), i, i, 10);
                } else {
                    C10163e purchase2 = AbstractC18366e.purchase(c12476e.mopub(metrica2.vip, metrica2.metrica).license());
                    c10629e = new C10629e(new C5671e(19, purchase2), purchase2.license(), purchase2.vip(), 10);
                }
            }
            int i3 = c10629e.f20951e;
            int i4 = c10629e.f20950e;
            arrayList.add(new C6571e(interfaceC16719e.admob(AbstractC15118e.license(i3, i3, i4, i4)), (Function0) c10629e.f20952e));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r42v0, types: [eٓؕۥ] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [eْۨٝ] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [eِؕۧ, java.lang.Object] */
    public static final void metrica(final InterfaceC12864e interfaceC12864e, C10566e c10566e, final Function1 function1, final boolean z, final Map map, final C1839e c1839e, final int i, final boolean z2, final int i2, final int i3, final InterfaceC2141e interfaceC2141e, final C2752e c2752e, final Function1 function12, C13770e c13770e, final int i4, final int i5) {
        C10566e c10566e2;
        C2809e c2809e;
        Celse celse;
        Function0 function0;
        C6571e c6571e;
        C9214e c9214e;
        ?? r9;
        int i6;
        Object obj;
        int i7;
        Object obj2;
        Object obj3;
        ?? r92;
        c13770e.m3671package(-2118572703);
        int i8 = (i4 & 6) == 0 ? (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i4 : i4;
        if ((i4 & 48) == 0) {
            i8 |= c13770e.purchase(c10566e) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i8 |= c13770e.yandex(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i4 & 3072) == 0) {
            i8 |= c13770e.billing(z) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i8 |= c13770e.yandex(map) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i8 |= c13770e.purchase(c1839e) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i8 |= c13770e.license(i) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i8 |= c13770e.billing(z2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i8 |= c13770e.license(i2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i8 |= c13770e.license(i3) ? 536870912 : 268435456;
        }
        int i9 = (i5 & 6) == 0 ? i5 | (c13770e.yandex(interfaceC2141e) ? 4 : 2) : i5;
        if ((i5 & 48) == 0) {
            i9 |= c13770e.yandex(c2752e) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i9 |= c13770e.yandex(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i5 & 3072) == 0) {
            i9 |= c13770e.yandex(function12) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i9 |= (32768 & i5) == 0 ? c13770e.purchase(null) : c13770e.yandex(null) ? 16384 : 8192;
        }
        if (c13770e.m3673protected(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 9363) == 9362) ? false : true)) {
            boolean vip2 = AbstractC11008e.vip(c10566e);
            C5170e c5170e = C2987e.ad;
            if (vip2) {
                c13770e.m3676strictfp(145641571);
                boolean z3 = (i8 & 112) == 32;
                ?? m3681throw = c13770e.m3681throw();
                C2809e c2809e2 = m3681throw;
                if (z3 || m3681throw == c5170e) {
                    C2809e c2809e3 = new C2809e(c10566e);
                    c13770e.m3682throws(c2809e3);
                    c2809e2 = c2809e3;
                }
                c2809e = c2809e2;
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(145707228);
                c13770e.Signature(false);
                c2809e = null;
            }
            if (AbstractC11008e.vip(c10566e)) {
                c13770e.m3676strictfp(145905443);
                boolean purchase2 = ((i8 & 112) == 32) | c13770e.purchase(c2809e);
                ?? m3681throw2 = c13770e.m3681throw();
                Celse celse2 = m3681throw2;
                if (purchase2 || m3681throw2 == c5170e) {
                    Celse celse3 = new Celse(c2809e, c10566e, 18);
                    c13770e.m3682throws(celse3);
                    celse2 = celse3;
                }
                celse = celse2;
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(146002721);
                boolean z4 = (i8 & 112) == 32;
                Object m3681throw3 = c13770e.m3681throw();
                Object obj4 = m3681throw3;
                if (z4 || m3681throw3 == c5170e) {
                    C14515e c14515e = new C14515e(18, c10566e);
                    c13770e.m3682throws(c14515e);
                    obj4 = c14515e;
                }
                celse = (Function0) obj4;
                c13770e.Signature(false);
            }
            if (z) {
                if (map != null) {
                    C6571e c6571e2 = AbstractC15265e.ad;
                    if (!map.isEmpty()) {
                        int length = c10566e.f20850e.length();
                        function0 = celse;
                        List list = c10566e.f20852e;
                        if (list != null) {
                            r92 = new ArrayList(list.size());
                            int size = list.size();
                            int i10 = 0;
                            while (i10 < size) {
                                List list2 = list;
                                C9363e c9363e = (C9363e) list.get(i10);
                                int i11 = size;
                                Object obj5 = c9363e.ad;
                                int i12 = i10;
                                int i13 = c9363e.metrica;
                                int i14 = c9363e.vip;
                                String str = c9363e.license;
                                if ((obj5 instanceof C9092e) && "androidx.compose.foundation.text.inlineContent".equals(str) && AbstractC13195e.vip(0, length, i14, i13)) {
                                    r92.add(new C9363e(((C9092e) c9363e.ad).ad, i14, i13, str));
                                }
                                i10 = i12 + 1;
                                size = i11;
                                list = list2;
                            }
                        } else {
                            r92 = C13664e.f27089e;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = r92.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            if (map.get(((C9363e) r92.get(i15)).ad) != null) {
                                throw new ClassCastException();
                            }
                        }
                        c6571e = new C6571e(arrayList, arrayList2);
                        c9214e = null;
                    }
                }
                function0 = celse;
                c6571e = AbstractC15265e.ad;
                c9214e = null;
            } else {
                function0 = celse;
                c9214e = null;
                c6571e = new C6571e(null, null);
            }
            List list3 = (List) c6571e.f13544e;
            List list4 = (List) c6571e.f13543e;
            if (z) {
                c13770e.m3676strictfp(146318828);
                Object m3681throw4 = c13770e.m3681throw();
                Object obj6 = m3681throw4;
                if (m3681throw4 == c5170e) {
                    C0576e startapp = AbstractC14533e.startapp(c9214e);
                    c13770e.m3682throws(startapp);
                    obj6 = startapp;
                }
                c13770e.Signature(false);
                r9 = (InterfaceC3314e) obj6;
            } else {
                c13770e.m3676strictfp(146406588);
                c13770e.Signature(false);
                r9 = c9214e;
            }
            if (z) {
                c13770e.m3676strictfp(146499837);
                boolean purchase3 = c13770e.purchase(r9);
                ?? m3681throw5 = c13770e.m3681throw();
                C9214e c9214e2 = m3681throw5;
                if (purchase3 || m3681throw5 == c5170e) {
                    C9214e c9214e3 = new C9214e(r9, 11);
                    c13770e.m3682throws(c9214e3);
                    c9214e2 = c9214e3;
                }
                c9214e = c9214e2;
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(146571260);
                c13770e.Signature(false);
            }
            Function1 function13 = c9214e;
            int i16 = (i8 >> 3) & 14;
            AbstractC12600e.ad(c10566e, c1839e, interfaceC2141e, list3, c13770e);
            C10566e c10566e3 = (C10566e) function0.invoke();
            boolean yandex = ((i8 & 896) == 256) | c13770e.yandex(c2809e);
            Object m3681throw6 = c13770e.m3681throw();
            if (yandex || m3681throw6 == c5170e) {
                i6 = 0;
                C13663e c13663e = new C13663e(c2809e, function1, i6);
                c13770e.m3682throws(c13663e);
                obj = c13663e;
            } else {
                i6 = 0;
                obj = m3681throw6;
            }
            InterfaceC3314e interfaceC3314e = r9;
            ?? r2 = i6;
            InterfaceC12864e startapp2 = startapp(interfaceC12864e, c10566e3, c1839e, (Function1) obj, i, z2, i2, i3, interfaceC2141e, list3, function13, c2752e, function12);
            if (z) {
                c13770e.m3676strictfp(147927697);
                boolean yandex2 = c13770e.yandex(c2809e);
                Object m3681throw7 = c13770e.m3681throw();
                Object obj7 = m3681throw7;
                if (yandex2 || m3681throw7 == c5170e) {
                    C15201e c15201e = new C15201e(c2809e, 1);
                    c13770e.m3682throws(c15201e);
                    obj7 = c15201e;
                }
                Function0 function02 = (Function0) obj7;
                boolean purchase4 = c13770e.purchase(interfaceC3314e);
                Object m3681throw8 = c13770e.m3681throw();
                if (purchase4 || m3681throw8 == c5170e) {
                    i7 = 2;
                    C1672e c1672e = new C1672e(interfaceC3314e, i7);
                    c13770e.m3682throws(c1672e);
                    obj2 = c1672e;
                } else {
                    i7 = 2;
                    obj2 = m3681throw8;
                }
                C14785e c14785e = new C14785e(function02, (Function0) obj2, i7);
                c13770e.Signature(r2);
                obj3 = c14785e;
            } else {
                c13770e.m3676strictfp(147750935);
                boolean yandex3 = c13770e.yandex(c2809e);
                Object m3681throw9 = c13770e.m3681throw();
                Object obj8 = m3681throw9;
                if (yandex3 || m3681throw9 == c5170e) {
                    C15201e c15201e2 = new C15201e(c2809e, r2 == true ? 1 : 0);
                    c13770e.m3682throws(c15201e2);
                    obj8 = c15201e2;
                }
                obj3 = new C9346e(r2 == true ? 1 : 0, (Function0) obj8);
                c13770e.Signature(r2);
            }
            long j = c13770e.f27286case;
            int i17 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e, startapp2);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            yandex(c13770e, obj3, C2721e.billing);
            yandex(c13770e, advert, C2721e.purchase);
            yandex(c13770e, Integer.valueOf(i17), C2721e.adcel);
            purchase(c13770e, C2721e.mopub);
            yandex(c13770e, purchase5, C2721e.license);
            if (c2809e == null) {
                c13770e.m3676strictfp(-433557001);
                c13770e.Signature(r2);
            } else {
                c13770e.m3676strictfp(-291080374);
                c2809e.ad(c13770e, r2 == true ? 1 : 0);
                c13770e.Signature(r2);
                Unit unit = Unit.INSTANCE;
            }
            if (list4 == null) {
                c13770e.m3676strictfp(-433506223);
                c13770e.Signature(r2);
                c10566e2 = c10566e;
            } else {
                c13770e.m3676strictfp(-433506222);
                c10566e2 = c10566e;
                AbstractC15265e.ad(c10566e2, list4, c13770e, i16);
                Unit unit2 = Unit.INSTANCE;
                c13770e.Signature(r2);
            }
            c13770e.Signature(true);
        } else {
            c10566e2 = c10566e;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            final C10566e c10566e4 = c10566e2;
            subscription.license = new Function2() { // from class: eؘَٛ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    int advert2 = AbstractC5190e.advert(i4 | 1);
                    int advert3 = AbstractC5190e.advert(i5);
                    AbstractC2270e.metrica(InterfaceC12864e.this, c10566e4, function1, z, map, c1839e, i, z2, i2, i3, interfaceC2141e, c2752e, function12, (C13770e) obj9, advert2, advert3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void purchase(C13770e c13770e, Function1 function1) {
        c13770e.vip(Unit.INSTANCE, new C6282e(function1));
    }

    public static final InterfaceC12864e startapp(InterfaceC12864e interfaceC12864e, C10566e c10566e, C1839e c1839e, Function1 function1, int i, boolean z, int i2, int i3, InterfaceC2141e interfaceC2141e, List list, Function1 function12, C2752e c2752e, Function1 function13) {
        if (c2752e == null) {
            return interfaceC12864e.premium(C0115e.f1276e).premium(new C10585e(c10566e, c1839e, interfaceC2141e, function1, i, z, i2, i3, list, function12, function13));
        }
        return interfaceC12864e.premium(c2752e.f6664e).premium(new C14252e(c10566e, c1839e, interfaceC2141e, function1, i, z, i2, i3, list, function12, c2752e));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(final java.lang.String r28, final defpackage.InterfaceC12864e r29, final defpackage.C1839e r30, kotlin.jvm.functions.Function1 r31, int r32, boolean r33, final int r34, int r35, defpackage.C13770e r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2270e.vip(java.lang.String, eّۤۧ, eٕؓۧ, kotlin.jvm.functions.Function1, int, boolean, int, int, eٓؕۥ, int, int):void");
    }

    public static final void yandex(C13770e c13770e, Object obj, Function2 function2) {
        if (c13770e.f27292implements || !AbstractC7890e.billing(c13770e.m3681throw(), obj)) {
            c13770e.m3682throws(obj);
            c13770e.vip(obj, function2);
        }
    }
}
