package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7572e {
    public static final long ad;
    public static final /* synthetic */ int vip = 0;

    static {
        long j = RecyclerView.UNDEFINED_DURATION;
        ad = (j & 4294967295L) | (j << 32);
    }

    public static final void ad(C13119e c13119e, InterfaceC12864e interfaceC12864e, Function1 function1, InterfaceC8079e interfaceC8079e, Function1 function12, Function4 function4, C13770e c13770e, int i) {
        int i2;
        Function1 function13;
        C13770e c13770e2;
        C15921e c15921e;
        C12742e c12742e;
        C15921e c15921e2;
        C15037e c15037e;
        boolean z;
        C13119e c13119e2 = c13119e;
        Function1 function14 = function1;
        c13770e.m3671package(511725103);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(c13119e2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(function14) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.purchase(interfaceC8079e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.yandex(function12) ? 16384 : 8192;
        }
        Function4 function42 = function4;
        if ((196608 & i) == 0) {
            i2 |= c13770e.yandex(function42) ? 131072 : 65536;
        }
        if (c13770e.m3673protected(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (z2 || m3681throw == obj) {
                m3681throw = new C15921e(c13119e2, interfaceC8079e);
                c13770e.m3682throws(m3681throw);
            }
            C15921e c15921e3 = (C15921e) m3681throw;
            boolean z3 = i3 == 4;
            Object m3681throw2 = c13770e.m3681throw();
            if (z3 || m3681throw2 == obj) {
                Object[] objArr = {c13119e2.metrica()};
                C12742e c12742e2 = new C12742e();
                c12742e2.addAll(AbstractC1660e.m670implements(objArr));
                c13770e.m3682throws(c12742e2);
                m3681throw2 = c12742e2;
            }
            C12742e c12742e3 = (C12742e) m3681throw2;
            boolean z4 = i3 == 4;
            Object m3681throw3 = c13770e.m3681throw();
            if (z4 || m3681throw3 == obj) {
                long[] jArr = AbstractC12981e.ad;
                m3681throw3 = new C0583e();
                c13770e.m3682throws(m3681throw3);
            }
            C0583e c0583e = (C0583e) m3681throw3;
            Object metrica = c13119e2.metrica();
            C0576e c0576e = c13119e2.license;
            if (!c12742e3.contains(metrica)) {
                c12742e3.clear();
                c12742e3.add(c13119e2.metrica());
            }
            if (AbstractC7890e.billing(c13119e2.metrica(), c0576e.getValue())) {
                if (c12742e3.size() != 1 || !AbstractC7890e.billing(c12742e3.get(0), c13119e2.metrica())) {
                    c12742e3.clear();
                    c12742e3.add(c13119e2.metrica());
                }
                if (c0583e.appmetrica != 1 || c0583e.metrica(c13119e2.metrica())) {
                    c0583e.ad();
                }
                c15921e3.vip = interfaceC8079e;
            }
            if (!AbstractC7890e.billing(c13119e2.metrica(), c0576e.getValue()) && !c12742e3.contains(c0576e.getValue())) {
                ListIterator listIterator = c12742e3.listIterator();
                int i4 = 0;
                while (true) {
                    C11045e c11045e = (C11045e) listIterator;
                    if (!c11045e.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    Object invoke = function12.invoke(c11045e.next());
                    ListIterator listIterator2 = listIterator;
                    if (AbstractC7890e.billing(invoke, function12.invoke(c0576e.getValue()))) {
                        break;
                    }
                    i4++;
                    listIterator = listIterator2;
                }
                if (i4 == -1) {
                    c12742e3.add(c0576e.getValue());
                } else {
                    c12742e3.set(i4, c0576e.getValue());
                }
            }
            if (c0583e.metrica(c0576e.getValue()) && c0583e.metrica(c13119e2.metrica())) {
                c13770e.m3676strictfp(1968995539);
                c13770e.Signature(false);
                function13 = function14;
                c15921e = c15921e3;
            } else {
                c13770e.m3676strictfp(1966410449);
                c0583e.ad();
                int size = c12742e3.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = c12742e3.get(i5);
                    c0583e.amazon(obj2, AbstractC16653e.license(-23915175, new C8887e(c13119e2, obj2, function14, c15921e3, c12742e3, function42), c13770e));
                    i5++;
                    c13119e2 = c13119e;
                    function14 = function14;
                    function42 = function4;
                }
                function13 = function14;
                c15921e = c15921e3;
                c13770e.Signature(false);
            }
            boolean purchase = c13770e.purchase(c13119e.purchase()) | c13770e.purchase(c15921e);
            Object m3681throw4 = c13770e.m3681throw();
            if (purchase || m3681throw4 == obj) {
                m3681throw4 = (C2714e) function13.invoke(c15921e);
                c13770e.m3682throws(m3681throw4);
            }
            C2714e c2714e = (C2714e) m3681throw4;
            C13119e c13119e3 = c15921e.ad;
            boolean purchase2 = c13770e.purchase(c15921e);
            Object m3681throw5 = c13770e.m3681throw();
            if (purchase2 || m3681throw5 == obj) {
                m3681throw5 = AbstractC14533e.startapp(Boolean.FALSE);
                c13770e.m3682throws(m3681throw5);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw5;
            InterfaceC3314e mopub = AbstractC14533e.mopub(c2714e.license, c13770e);
            if (AbstractC7890e.billing(c13119e3.metrica(), c13119e3.license.getValue())) {
                interfaceC3314e.setValue(Boolean.FALSE);
            } else if (mopub.getValue() != null) {
                interfaceC3314e.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) interfaceC3314e.getValue()).booleanValue();
            InterfaceC12864e interfaceC12864e2 = C0115e.f1276e;
            if (booleanValue) {
                c13770e.m3676strictfp(1353077497);
                C15921e c15921e4 = c15921e;
                c12742e = c12742e3;
                c15921e2 = c15921e4;
                c13770e2 = c13770e;
                c15037e = AbstractC0207e.purchase(c15921e4.ad, AbstractC9546e.yandex, null, c13770e2, 0, 2);
                boolean purchase3 = c13770e2.purchase(c15037e);
                Object m3681throw6 = c13770e2.m3681throw();
                if (purchase3 || m3681throw6 == obj) {
                    C9539e c9539e = (C9539e) mopub.getValue();
                    if (c9539e == null || c9539e.ad) {
                        interfaceC12864e2 = AbstractC12447e.metrica(interfaceC12864e2);
                    }
                    c13770e2.m3682throws(interfaceC12864e2);
                    m3681throw6 = interfaceC12864e2;
                }
                interfaceC12864e2 = (InterfaceC12864e) m3681throw6;
                c13770e2.Signature(false);
            } else {
                c12742e = c12742e3;
                c13770e2 = c13770e;
                c15921e2 = c15921e;
                c13770e2.m3676strictfp(1353343539);
                c13770e2.Signature(false);
                c15037e = null;
            }
            InterfaceC12864e premium = interfaceC12864e.premium(interfaceC12864e2.premium(new C1797e(c15037e, mopub, c15921e2)));
            Object m3681throw7 = c13770e2.m3681throw();
            if (m3681throw7 == obj) {
                m3681throw7 = new C3866e(c15921e2);
                c13770e2.m3682throws(m3681throw7);
            }
            C3866e c3866e = (C3866e) m3681throw7;
            long j = c13770e2.f27286case;
            int i6 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e2, premium);
            InterfaceC5685e.mopub.getClass();
            Function0 function0 = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(function0);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, c3866e, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.appmetrica(c13770e2, Integer.valueOf(i6), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase4, C2721e.license);
            c13770e2.m3676strictfp(-860173498);
            int size2 = c12742e.size();
            int i7 = 0;
            while (i7 < size2) {
                C12742e c12742e4 = c12742e;
                Object obj3 = c12742e4.get(i7);
                c13770e2.m3662final(-2026002954, function12.invoke(obj3));
                Function2 function2 = (Function2) c0583e.billing(obj3);
                if (function2 == null) {
                    c13770e2.m3676strictfp(1618454323);
                    z = false;
                } else {
                    z = false;
                    c13770e2.m3676strictfp(-2026001778);
                    function2.invoke(c13770e2, 0);
                }
                c13770e2.Signature(z);
                c13770e2.Signature(z);
                i7++;
                c12742e = c12742e4;
            }
            c13770e2.Signature(false);
            c13770e2.Signature(true);
        } else {
            function13 = function14;
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C10342e(c13119e, interfaceC12864e, function13, interfaceC8079e, function12, function4, i);
        }
    }

    public static C9539e metrica(int i) {
        return new C9539e((i & 1) != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(java.lang.Object r16, defpackage.InterfaceC12864e r17, kotlin.jvm.functions.Function1 r18, defpackage.InterfaceC8079e r19, java.lang.String r20, kotlin.jvm.functions.Function1 r21, kotlin.jvm.functions.Function4 r22, defpackage.C13770e r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7572e.vip(java.lang.Object, eّۤۧ, kotlin.jvm.functions.Function1, eًٝ٘, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4, eٓؕۥ, int, int):void");
    }
}
