package defpackage;

import android.R;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؑۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9180e {
    public static final int[] ad = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] vip = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] metrica = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] license = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] appmetrica = {R.attr.drawable};
    public static final int[] purchase = {R.attr.name, R.attr.animation};
    public static final int[] billing = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] yandex = {R.attr.ordering};
    public static final int[] startapp = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] adcel = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] mopub = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};
    public static final C2443e advert = new C2443e("NONE", 2);
    public static final C2443e smaato = new C2443e("PENDING", 2);

    public static final void ad(C13119e c13119e, InterfaceC12864e interfaceC12864e, InterfaceC6512e interfaceC6512e, Function1 function1, C2892e c2892e, C13770e c13770e, int i) {
        Function1 function12;
        c13770e.m3671package(-1877370462);
        int i2 = (i & 6) == 0 ? (c13770e.purchase(c13119e) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(interfaceC6512e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= c13770e.yandex(c2892e) ? 16384 : 8192;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 9363) != 9362)) {
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                m3681throw = C5430e.f11648e;
                c13770e.m3682throws(m3681throw);
            }
            Function1 function13 = (Function1) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            Object obj2 = m3681throw2;
            if (m3681throw2 == obj) {
                C12742e c12742e = new C12742e();
                c12742e.add(c13119e.metrica());
                c13770e.m3682throws(c12742e);
                obj2 = c12742e;
            }
            C12742e c12742e2 = (C12742e) obj2;
            Object m3681throw3 = c13770e.m3681throw();
            if (m3681throw3 == obj) {
                long[] jArr = AbstractC12981e.ad;
                m3681throw3 = new C0583e();
                c13770e.m3682throws(m3681throw3);
            }
            C0583e c0583e = (C0583e) m3681throw3;
            Object metrica2 = c13119e.metrica();
            C0576e c0576e = c13119e.license;
            if (AbstractC7890e.billing(metrica2, c0576e.getValue())) {
                c13770e.m3676strictfp(321145192);
                if (c12742e2.size() == 1 && AbstractC7890e.billing(c12742e2.get(0), c0576e.getValue())) {
                    c13770e.m3676strictfp(321469824);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3676strictfp(321279546);
                    boolean z = (i3 & 14) == 4;
                    Object m3681throw4 = c13770e.m3681throw();
                    if (z || m3681throw4 == obj) {
                        m3681throw4 = new C17097e(13, c13119e);
                        c13770e.m3682throws(m3681throw4);
                    }
                    AbstractC13480e.m3593new(c12742e2, (Function1) m3681throw4);
                    c0583e.ad();
                    c13770e.Signature(false);
                }
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(321475776);
                c13770e.Signature(false);
            }
            if (c0583e.vip(c0576e.getValue())) {
                c13770e.m3676strictfp(322279296);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(321536443);
                ListIterator listIterator = c12742e2.listIterator();
                int i4 = 0;
                while (true) {
                    C11045e c11045e = (C11045e) listIterator;
                    if (!c11045e.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (AbstractC7890e.billing(function13.invoke(c11045e.next()), function13.invoke(c0576e.getValue()))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    c12742e2.add(c0576e.getValue());
                } else {
                    c12742e2.set(i4, c0576e.getValue());
                }
                c0583e.ad();
                int size = c12742e2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj3 = c12742e2.get(i5);
                    c0583e.amazon(obj3, AbstractC16653e.license(-934471669, new C17622e(c13119e, interfaceC6512e, obj3, c2892e), c13770e));
                }
                c13770e.Signature(false);
            }
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i6 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            Function0 function0 = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert2, C2721e.purchase);
            AbstractC2270e.appmetrica(c13770e, Integer.valueOf(i6), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            c13770e.m3676strictfp(-1312707512);
            int size2 = c12742e2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Object obj4 = c12742e2.get(i7);
                c13770e.m3662final(1171574969, function13.invoke(obj4));
                Function2 function2 = (Function2) c0583e.billing(obj4);
                if (function2 == null) {
                    c13770e.m3676strictfp(1959122128);
                } else {
                    c13770e.m3676strictfp(1171576145);
                    function2.invoke(c13770e, 0);
                }
                c13770e.Signature(false);
                c13770e.Signature(false);
            }
            c13770e.Signature(false);
            c13770e.Signature(true);
            function12 = function13;
        } else {
            c13770e.m3659default();
            function12 = function1;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C8074e(c13119e, interfaceC12864e, interfaceC6512e, function12, c2892e, i);
        }
    }

    public static void appmetrica(int i, InterfaceC0293e interfaceC0293e) {
        interfaceC0293e.update((byte) (i >>> 24));
        interfaceC0293e.update((byte) (i >>> 16));
        interfaceC0293e.update((byte) (i >>> 8));
        interfaceC0293e.update((byte) i);
    }

    public static final void license(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException((i != i2 ? AbstractC8647e.inmobi(i, i2, "Both size ", " and step ", " must be greater than zero.") : AbstractC1634e.smaato("size ", i, " must be greater than zero.")).toString());
        }
    }

    public static final C1615e metrica(Object obj) {
        if (obj == null) {
            obj = AbstractC18467e.ad;
        }
        return new C1615e(obj);
    }

    public static final void vip(Object obj, InterfaceC12864e interfaceC12864e, InterfaceC6512e interfaceC6512e, String str, C2892e c2892e, C13770e c13770e, int i, int i2) {
        int i3;
        InterfaceC12864e interfaceC12864e2;
        c13770e.m3671package(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? c13770e.purchase(obj) : c13770e.yandex(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | 48;
        if ((i & 384) == 0) {
            i4 |= c13770e.yandex(interfaceC6512e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= c13770e.purchase(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= c13770e.yandex(c2892e) ? 16384 : 8192;
        }
        if (c13770e.m3673protected(i4 & 1, (i4 & 9363) != 9362)) {
            if (i5 != 0) {
                str = "Crossfade";
            }
            C0115e c0115e = C0115e.f1276e;
            ad(AbstractC0207e.advert(obj, str, c13770e, (i4 & 14) | ((i4 >> 6) & 112), 0), c0115e, interfaceC6512e, null, c2892e, c13770e, i4 & 58352);
            interfaceC12864e2 = c0115e;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        String str2 = str;
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11015e(obj, interfaceC12864e2, interfaceC6512e, str2, c2892e, i, i2);
        }
    }
}
