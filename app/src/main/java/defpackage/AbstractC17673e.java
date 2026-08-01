package defpackage;

import android.graphics.Color;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ٘ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17673e {
    public static final C3114e ad = new C3114e(27);
    public static final C8436e vip = new C8436e(0, 12);

    public static final C8617e Signature(C10067e c10067e, C2254e c2254e) {
        int i = c10067e.f19888e;
        int i2 = c10067e.f19880e;
        InterfaceC11824e interfaceC11824e = (InterfaceC11824e) c2254e.f5736e;
        interfaceC11824e.getString(i2);
        C8617e c8617e = new C8617e(i);
        C17221e c17221e = (C17221e) c2254e.f5732e;
        amazon(AbstractC17110e.pro(c10067e, c17221e), c2254e);
        int i3 = c10067e.f19883e;
        C13212e ad2 = (i3 & 16) == 16 ? c10067e.f19886e : (i3 & 32) == 32 ? c17221e.ad(c10067e.f19889e) : null;
        if (ad2 != null) {
            amazon(ad2, c2254e);
        }
        if ((c10067e.f19883e & 64) == 64) {
            AbstractC15297e.billing(c10067e.f19887e, interfaceC11824e);
        }
        Iterator it = ((List) c2254e.f5735e).iterator();
        while (it.hasNext()) {
            ((C9484e) ((InterfaceC14256e) it.next())).getClass();
            Iterator it2 = c10067e.f19884e.iterator();
            while (it2.hasNext()) {
                c8617e.vip.add(AbstractC15297e.purchase((C4599e) it2.next(), interfaceC11824e));
            }
        }
        return c8617e;
    }

    public static final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(-46556467);
        if (c13770e.m3673protected(i & 1, (i & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC14533e.startapp(new C12130e());
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
            InterfaceC5083e interfaceC5083e = null;
            C12870e yandex = AbstractC12696e.yandex(4000, 6, null);
            long j = ((C12130e) interfaceC3314e.getValue()).ad;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C14772e(15, interfaceC3314e);
                c13770e.m3682throws(m3681throw2);
            }
            c13770e2 = c13770e;
            InterfaceC16132e ad2 = AbstractC3145e.ad(j, yandex, null, (Function1) m3681throw2, c13770e2, 3120, 4);
            InterfaceC16132e ad3 = AbstractC3145e.ad(((C12130e) interfaceC3314e.getValue()).vip, yandex, null, null, c13770e2, 48, 12);
            InterfaceC16132e ad4 = AbstractC3145e.ad(((C12130e) interfaceC3314e.getValue()).metrica, yandex, null, null, c13770e2, 48, 12);
            Unit unit = Unit.INSTANCE;
            Object m3681throw3 = c13770e2.m3681throw();
            if (m3681throw3 == c5170e) {
                m3681throw3 = new C9843e(interfaceC3314e, interfaceC5083e, 1);
                c13770e2.m3682throws(m3681throw3);
            }
            AbstractC17680e.license(c13770e2, unit, (Function2) m3681throw3);
            boolean purchase = c13770e2.purchase(ad2) | c13770e2.purchase(ad3) | c13770e2.purchase(ad4);
            Object m3681throw4 = c13770e2.m3681throw();
            if (purchase || m3681throw4 == c5170e) {
                m3681throw4 = new C9675e(15, ad2, ad3, ad4);
                c13770e2.m3682throws(m3681throw4);
            }
            AbstractC12534e.ad(c13770e2, AbstractC5750e.license(interfaceC12864e, (Function1) m3681throw4));
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C11491e(interfaceC12864e, i, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0240, code lost:
    
        if (r0 == false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C10444e adcel(defpackage.C2009e r10, defpackage.InterfaceC11824e r11, boolean r12, int r13) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17673e.adcel(eٟؓۦ, eِٚ, boolean, int):eًَۖ");
    }

    public static final void admob(InterfaceC8827e interfaceC8827e, List list, List list2, List list3, C2254e c2254e) {
        C13212e ad2;
        C13212e ad3;
        ArrayList vip2 = interfaceC8827e.vip();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vip2.add(advert((C9920e) it.next(), c2254e));
        }
        ArrayList ad4 = interfaceC8827e.ad();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ad4.add(smaato((C17485e) it2.next(), c2254e));
        }
        ArrayList license = interfaceC8827e.license();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            C16162e c16162e = (C16162e) it3.next();
            int i = c16162e.f31755e;
            ((InterfaceC11824e) c2254e.f5736e).getString(c16162e.f31745e);
            C4659e c4659e = new C4659e(i);
            C2254e yandex = c2254e.yandex(c16162e.f31758e);
            C17221e c17221e = (C17221e) yandex.f5732e;
            Iterator it4 = c16162e.f31758e.iterator();
            while (it4.hasNext()) {
                c4659e.vip.add(loadAd((C8372e) it4.next(), yandex));
            }
            int i2 = c16162e.f31748e;
            if ((i2 & 4) == 4) {
                ad2 = c16162e.f31757e;
            } else {
                if ((i2 & 8) != 8) {
                    throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                }
                ad2 = c17221e.ad(c16162e.f31753e);
            }
            amazon(ad2, yandex);
            int i3 = c16162e.f31748e;
            if ((i3 & 16) == 16) {
                ad3 = c16162e.f31756e;
            } else {
                if ((i3 & 32) != 32) {
                    throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                }
                ad3 = c17221e.ad(c16162e.f31749e);
            }
            amazon(ad3, yandex);
            Iterator it5 = c16162e.f31754e.iterator();
            while (it5.hasNext()) {
                c4659e.metrica.add(AbstractC15297e.purchase((C4599e) it5.next(), (InterfaceC11824e) yandex.f5736e));
            }
            Iterator it6 = c16162e.f31747e.iterator();
            while (it6.hasNext()) {
                c4659e.license.add(startapp(((Integer) it6.next()).intValue(), yandex));
            }
            Iterator it7 = ((List) yandex.f5735e).iterator();
            while (it7.hasNext()) {
                ((InterfaceC14256e) it7.next()).getClass();
            }
            license.add(c4659e);
        }
    }

    public static final C1395e advert(C9920e c9920e, C2254e c2254e) {
        ArrayList arrayList;
        int i = c9920e.f19598e;
        ((InterfaceC11824e) c2254e.f5736e).getString(c9920e.f19603e);
        C1395e c1395e = new C1395e(i);
        C2254e yandex = c2254e.yandex(c9920e.f19600e);
        C17221e c17221e = (C17221e) yandex.f5732e;
        Iterator it = c9920e.f19600e.iterator();
        while (it.hasNext()) {
            c1395e.vip.add(loadAd((C8372e) it.next(), yandex));
        }
        C13212e loadAd = AbstractC17110e.loadAd(c9920e, c17221e);
        if (loadAd != null) {
            amazon(loadAd, yandex);
        }
        Iterator it2 = c9920e.f19592e.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            arrayList = c1395e.appmetrica;
            if (!hasNext) {
                break;
            }
            arrayList.add(Signature((C10067e) it2.next(), yandex));
        }
        if (c9920e.f19592e.isEmpty() && !c9920e.f19584e.isEmpty()) {
            Iterator it3 = AbstractC17110e.metrica(c9920e, c17221e).iterator();
            while (it3.hasNext()) {
                amazon((C13212e) it3.next(), yandex);
                arrayList.add(new C8617e(0));
            }
        }
        Iterator it4 = c9920e.f19593e.iterator();
        while (it4.hasNext()) {
            c1395e.license.add(Signature((C10067e) it4.next(), yandex));
        }
        amazon(AbstractC17110e.admob(c9920e, c17221e), yandex);
        if ((c9920e.f19585e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            C4307e c4307e = c9920e.f19597e;
            ArrayList arrayList2 = new ArrayList(1);
            for (C12000e c12000e : c4307e.f9420e) {
                if ((c12000e.f23986e & 1) == 1) {
                    EnumC12838e enumC12838e = c12000e.f23985e;
                    if (enumC12838e == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    int ordinal = enumC12838e.ordinal();
                    if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                        throw new C14803e(10);
                    }
                    if ((c12000e.f23986e & 4) == 4) {
                        EnumC2829e enumC2829e = c12000e.f23992e;
                        if (enumC2829e == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        int ordinal2 = enumC2829e.ordinal();
                        if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2) {
                            throw new C14803e(10);
                        }
                    }
                    C1720e c1720e = new C1720e(1);
                    List list = c12000e.f23988e;
                    ArrayList arrayList3 = c1720e.vip;
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayList3.add(mopub((C3845e) it5.next(), yandex));
                    }
                    if ((c12000e.f23986e & 2) == 2) {
                        mopub(c12000e.f23984e, yandex);
                    }
                    arrayList2.add(c1720e);
                }
            }
        }
        Iterator it6 = c9920e.f19589e.iterator();
        while (it6.hasNext()) {
            c1395e.purchase.add(startapp(((Integer) it6.next()).intValue(), yandex));
        }
        Iterator it7 = ((List) yandex.f5735e).iterator();
        while (it7.hasNext()) {
            ((C9484e) ((InterfaceC14256e) it7.next())).getClass();
            InterfaceC11824e interfaceC11824e = (InterfaceC11824e) yandex.f5736e;
            Iterator it8 = c9920e.f19587e.iterator();
            while (it8.hasNext()) {
                c1395e.billing.add(AbstractC15297e.purchase((C4599e) it8.next(), interfaceC11824e));
            }
            Iterator it9 = c9920e.f19596e.iterator();
            while (it9.hasNext()) {
                c1395e.metrica.add(AbstractC15297e.purchase((C4599e) it9.next(), interfaceC11824e));
            }
            C18521e c18521e = C13814e.ad;
            C13814e.metrica(c9920e, interfaceC11824e, c17221e);
            Integer num = (Integer) AbstractC0863e.appmetrica(c9920e, AbstractC5745e.metrica);
            if (num != null) {
                interfaceC11824e.getString(num.intValue());
            }
        }
        return c1395e;
    }

    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, eؙؐٛ] */
    public static final C0632e amazon(C13212e c13212e, C2254e c2254e) {
        AbstractC6437e c11727e;
        int i;
        C17221e c17221e = (C17221e) c2254e.f5732e;
        InterfaceC11824e interfaceC11824e = (InterfaceC11824e) c2254e.f5736e;
        C0632e c0632e = new C0632e((c13212e.f26220e ? 1 : 0) + (c13212e.f26228e << 1));
        C6104e c6104e = null;
        if (c13212e.Signature()) {
            c11727e = new C9976e(AbstractC15297e.ad(interfaceC11824e, c13212e.f26235e));
        } else {
            int i2 = c13212e.f26223e;
            if ((i2 & 128) == 128) {
                c11727e = new C11136e(AbstractC15297e.ad(interfaceC11824e, c13212e.f26222e));
            } else if ((i2 & 32) == 32) {
                c11727e = new C11727e(c13212e.f26224e);
            } else {
                if ((i2 & 64) != 64) {
                    throw new IllegalArgumentException("No classifier (class, type alias or type parameter) recorded for Type", null);
                }
                Integer metrica = c2254e.metrica(c13212e.f26232e);
                if (metrica == null) {
                    throw new IllegalArgumentException("No type parameter id for " + interfaceC11824e.getString(c13212e.f26232e), null);
                }
                c11727e = new C11727e(metrica.intValue());
            }
        }
        c0632e.vip = c11727e;
        for (C16578e c16578e : c13212e.f26234e) {
            EnumC8270e enumC8270e = c16578e.f32524e;
            if (enumC8270e == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int ordinal = enumC8270e.ordinal();
            if (ordinal != 0) {
                i = 3;
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i = 1;
                    } else {
                        if (ordinal != 3) {
                            throw new C14803e(10);
                        }
                        i = 0;
                    }
                }
            } else {
                i = 2;
            }
            ArrayList arrayList = c0632e.metrica;
            if (i != 0) {
                int i3 = c16578e.f32525e;
                C13212e ad2 = (i3 & 2) == 2 ? c16578e.f32526e : (i3 & 4) == 4 ? c17221e.ad(c16578e.f32523e) : null;
                if (ad2 == null) {
                    throw new IllegalArgumentException("No type argument for non-STAR projection in Type", null);
                }
                arrayList.add(new C17653e(i, amazon(ad2, c2254e)));
            } else {
                arrayList.add(C17653e.metrica);
            }
        }
        int i4 = c13212e.f26223e;
        C13212e ad3 = (i4 & 1024) == 1024 ? c13212e.f26229e : (i4 & 2048) == 2048 ? c17221e.ad(c13212e.f26230e) : null;
        c0632e.license = ad3 != null ? amazon(ad3, c2254e) : null;
        C13212e amazon = AbstractC17110e.amazon(c13212e, c17221e);
        c0632e.appmetrica = amazon != null ? amazon(amazon, c2254e) : null;
        int i5 = c13212e.f26223e;
        C13212e ad4 = (i5 & 4) == 4 ? c13212e.f26236e : (i5 & 8) == 8 ? c17221e.ad(c13212e.f26231e) : null;
        if (ad4 != null) {
            C0632e amazon2 = amazon(ad4, c2254e);
            String string = (c13212e.f26223e & 2) == 2 ? interfaceC11824e.getString(c13212e.f26237e) : null;
            ?? obj = new Object();
            obj.ad = amazon2;
            obj.vip = string;
            c6104e = obj;
        }
        c0632e.purchase = c6104e;
        Iterator it = ((List) c2254e.f5735e).iterator();
        while (it.hasNext()) {
            ((C9484e) ((InterfaceC14256e) it.next())).getClass();
            C9736e c9736e = (C9736e) ((InterfaceC8667e) C14155e.appmetrica(c0632e.billing, C9736e.metrica));
            c9736e.ad = ((Boolean) c13212e.mopub(AbstractC5745e.purchase)).booleanValue();
            Iterator it2 = c13212e.f26226e.iterator();
            while (it2.hasNext()) {
                c9736e.vip.add(AbstractC15297e.purchase((C4599e) it2.next(), interfaceC11824e));
            }
        }
        return c0632e;
    }

    public static final C14464e appmetrica(InterfaceC1108e interfaceC1108e, Function1 function1, Function2 function2) {
        if (interfaceC1108e instanceof C14464e) {
            C14464e c14464e = (C14464e) interfaceC1108e;
            if (c14464e.f28596e == function1 && c14464e.f28595e == function2) {
                return c14464e;
            }
        }
        return new C14464e(interfaceC1108e, function1, function2);
    }

    public static final int billing(int i) {
        return AbstractC1787e.vip(AbstractC1787e.metrica.appmetrica(i).booleanValue(), (EnumC6217e) AbstractC1787e.license.appmetrica(i), (EnumC1034e) AbstractC1787e.appmetrica.appmetrica(i));
    }

    public static final void license(InterfaceC5083e interfaceC5083e, Throwable th) {
        if (th instanceof C15295e) {
            th = ((C15295e) th).f30221e;
        }
        interfaceC5083e.billing(new C12763e(th));
        throw th;
    }

    public static final C16907e loadAd(C8372e c8372e, C2254e c2254e) {
        InterfaceC11824e interfaceC11824e = (InterfaceC11824e) c2254e.f5736e;
        EnumC0655e enumC0655e = c8372e.f17135e;
        if (enumC0655e == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int ordinal = enumC0655e.ordinal();
        int i = 2;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 3;
            } else {
                if (ordinal != 2) {
                    throw new C14803e(10);
                }
                i = 1;
            }
        }
        boolean z = c8372e.f17136e;
        C16907e c16907e = new C16907e(z ? 1 : 0, c8372e.f17133e, i, interfaceC11824e.getString(c8372e.f17125e));
        Iterator it = AbstractC17110e.signatures(c8372e, (C17221e) c2254e.f5732e).iterator();
        while (it.hasNext()) {
            c16907e.appmetrica.add(amazon((C13212e) it.next(), c2254e));
        }
        Iterator it2 = ((List) c2254e.f5735e).iterator();
        while (it2.hasNext()) {
            ((C9484e) ((InterfaceC14256e) it2.next())).getClass();
            C6894e c6894e = (C6894e) ((InterfaceC13504e) C14155e.appmetrica(c16907e.purchase, C6894e.vip));
            Iterator it3 = c8372e.f17132e.iterator();
            while (it3.hasNext()) {
                c6894e.ad.add(AbstractC15297e.purchase((C4599e) it3.next(), interfaceC11824e));
            }
        }
        return c16907e;
    }

    public static int metrica(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException(AbstractC8647e.inmobi(i, i2, "overflow: checkedAdd(", ", ", ")"));
    }

    public static final C18540e mopub(C3845e c3845e, C2254e c2254e) {
        C18540e c18540e = new C18540e(27);
        int i = c3845e.f8493e;
        if ((c3845e.f8495e & 4) == 4) {
            EnumC3014e enumC3014e = c3845e.f8492e;
            if (enumC3014e == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int ordinal = enumC3014e.ordinal();
            if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                throw new C14803e(10);
            }
        }
        C17221e c17221e = (C17221e) c2254e.f5732e;
        int i2 = c3845e.f8495e;
        C13212e ad2 = (i2 & 8) == 8 ? c3845e.f8502e : (i2 & 16) == 16 ? c17221e.ad(c3845e.f8501e) : null;
        if (ad2 != null) {
            amazon(ad2, c2254e);
        }
        List list = c3845e.f8496e;
        ArrayList arrayList = (ArrayList) c18540e.f36383e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mopub((C3845e) it.next(), c2254e));
        }
        List list2 = c3845e.f8499e;
        ArrayList arrayList2 = (ArrayList) c18540e.f36382e;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(mopub((C3845e) it2.next(), c2254e));
        }
        return c18540e;
    }

    public static int purchase(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (AbstractC4116e.ad[roundingMode.ordinal()]) {
            case 1:
                AbstractC5400e.vip(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i4);
                int abs2 = abs - (Math.abs(i2) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (abs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static final C0366e smaato(C17485e c17485e, C2254e c2254e) {
        ArrayList arrayList;
        int i = c17485e.f34273e;
        ((InterfaceC11824e) c2254e.f5736e).getString(c17485e.f34278e);
        C0366e c0366e = new C0366e(i, (c17485e.f34254e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? c17485e.f34261e : billing(c17485e.f34273e), (c17485e.f34254e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512 ? c17485e.f34258e : billing(c17485e.f34273e));
        C2254e yandex = c2254e.yandex(c17485e.f34275e);
        InterfaceC11824e interfaceC11824e = (InterfaceC11824e) yandex.f5736e;
        C17221e c17221e = (C17221e) yandex.f5732e;
        Iterator it = c17485e.f34275e.iterator();
        while (it.hasNext()) {
            c0366e.license.add(loadAd((C8372e) it.next(), yandex));
        }
        C13212e Signature = AbstractC17110e.Signature(c17485e, c17221e);
        if (Signature != null) {
            amazon(Signature, yandex);
        }
        Iterator it2 = c17485e.f34262e.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            arrayList = c0366e.purchase;
            if (!hasNext) {
                break;
            }
            arrayList.add(Signature((C10067e) it2.next(), yandex));
        }
        if (c17485e.f34262e.isEmpty() && !c17485e.f34253e.isEmpty()) {
            Iterator it3 = AbstractC17110e.license(c17485e, c17221e).iterator();
            while (it3.hasNext()) {
                amazon((C13212e) it3.next(), yandex);
                arrayList.add(new C8617e(0));
            }
        }
        if ((c17485e.f34254e & 128) == 128) {
            Signature(c17485e.f34263e, yandex);
        }
        amazon(AbstractC17110e.subscription(c17485e, c17221e), yandex);
        Iterator it4 = c17485e.f34272e.iterator();
        while (it4.hasNext()) {
            c0366e.billing.add(startapp(((Integer) it4.next()).intValue(), yandex));
        }
        Iterator it5 = ((List) yandex.f5735e).iterator();
        while (it5.hasNext()) {
            ((C9484e) ((InterfaceC14256e) it5.next())).getClass();
            Iterator it6 = c17485e.f34256e.iterator();
            while (it6.hasNext()) {
                c0366e.yandex.add(AbstractC15297e.purchase((C4599e) it6.next(), interfaceC11824e));
            }
            List list = c17485e.f34270e;
            ArrayList arrayList2 = c0366e.vip.vip;
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                arrayList2.add(AbstractC15297e.purchase((C4599e) it7.next(), interfaceC11824e));
            }
            C18391e c18391e = c0366e.metrica;
            if (c18391e != null) {
                List list2 = c17485e.f34274e;
                ArrayList arrayList3 = c18391e.vip;
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(AbstractC15297e.purchase((C4599e) it8.next(), interfaceC11824e));
                }
            }
            Iterator it9 = c17485e.f34276e.iterator();
            while (it9.hasNext()) {
                c0366e.appmetrica.add(AbstractC15297e.purchase((C4599e) it9.next(), interfaceC11824e));
            }
            Iterator it10 = c17485e.f34269e.iterator();
            while (it10.hasNext()) {
                c0366e.startapp.add(AbstractC15297e.purchase((C4599e) it10.next(), interfaceC11824e));
            }
            Iterator it11 = c17485e.f34266e.iterator();
            while (it11.hasNext()) {
                c0366e.adcel.add(AbstractC15297e.purchase((C4599e) it11.next(), interfaceC11824e));
            }
            C18521e c18521e = C13814e.ad;
            C13814e.vip(c17485e, interfaceC11824e, c17221e, true);
            C4442e c4442e = (C4442e) AbstractC0863e.appmetrica(c17485e, AbstractC5745e.license);
            C17758e c17758e = null;
            C17758e c17758e2 = (c4442e == null || !c4442e.startapp()) ? null : c4442e.f9638e;
            C17758e c17758e3 = (c4442e == null || (c4442e.f9640e & 8) != 8) ? null : c4442e.f9646e;
            ((Number) c17485e.mopub(AbstractC5745e.appmetrica)).intValue();
            if (c17758e2 != null) {
                interfaceC11824e.getString(c17758e2.f34833e);
                interfaceC11824e.getString(c17758e2.f34835e);
            }
            if (c17758e3 != null) {
                interfaceC11824e.getString(c17758e3.f34833e);
                interfaceC11824e.getString(c17758e3.f34835e);
            }
            C17758e c17758e4 = (c4442e == null || (c4442e.f9640e & 2) != 2) ? null : c4442e.f9642e;
            if (c17758e4 != null) {
                interfaceC11824e.getString(c17758e4.f34833e);
                interfaceC11824e.getString(c17758e4.f34835e);
            }
            if (c4442e != null && (c4442e.f9640e & 16) == 16) {
                c17758e = c4442e.f9645e;
            }
            if (c17758e != null) {
                interfaceC11824e.getString(c17758e.f34833e);
                interfaceC11824e.getString(c17758e.f34835e);
            }
        }
        return c0366e;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C6148e startapp(int r21, defpackage.C2254e r22) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17673e.startapp(int, eؓۧ۠):eؙؓٞ");
    }

    public static final long vip() {
        C0583e c0583e = AbstractC2890e.license;
        AbstractC5427e abstractC5427e = AbstractC15440e.f30517e;
        return AbstractC6532e.vip(Color.parseColor(((C5181e) c0583e.billing(Integer.valueOf(AbstractC15440e.f30517e.adcel(c0583e.appmetrica)))).metrica));
    }

    public static int yandex(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("x (", i, ") must be > 0"));
        }
        switch (AbstractC4116e.ad[roundingMode.ordinal()]) {
            case 1:
                AbstractC5400e.vip((i > 0) & (((i + (-1)) & i) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }
}
