package defpackage;

import android.view.MotionEvent;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17140e {
    public static final C2892e ad = new C2892e(985783600, false, new C13060e(20));
    public static final C2892e vip = new C2892e(-1122204817, false, new C13060e(21));
    public static final C2892e metrica = new C2892e(190765633, false, new C13060e(22));

    public static final void ad(int i, String str, Function0 function0, C13770e c13770e, int i2) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-770821719);
        int i3 = i2 | (c13770e2.license(i) ? 4 : 2) | (c13770e2.purchase(str) ? 32 : 16) | (c13770e2.yandex(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e2.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            C0115e c0115e = C0115e.f1276e;
            float f = 16;
            InterfaceC12864e metrica2 = AbstractC18007e.metrica(AbstractC12220e.advert(AbstractC9546e.license(c0115e, false, null, function0, 15), f, 12), 1.0f);
            C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e2, 48);
            long j = c13770e2.f27286case;
            int i4 = (int) ((j >>> 32) ^ j);
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, metrica2);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            AbstractC10727e metrica3 = AbstractC12475e.metrica(i, i3 & 14, c13770e2);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC5647e.vip(metrica3, null, null, ((C7019e) c13770e2.adcel(c15492e)).ad.ad, c13770e2, 56, 4);
            AbstractC12534e.ad(c13770e2, AbstractC18007e.smaato(c0115e, f));
            AbstractC14489e.vip(str, null, ((C7019e) c13770e2.adcel(c15492e)).ad.ad, AbstractC13362e.startapp(15), null, C1812e.f4893e, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, ((i3 >> 3) & 14) | 1597440, 0, 262058);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(i, str, function0, i2);
        }
    }

    public static boolean appmetrica(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static void license(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder pro = AbstractC17861e.pro(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
            pro.append(i3);
            throw new IndexOutOfBoundsException(pro.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static void metrica(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder pro = AbstractC17861e.pro(i, i2, "startIndex: ", ", endIndex: ", ", size: ");
            pro.append(i3);
            throw new IndexOutOfBoundsException(pro.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i, i2, "startIndex: ", " > endIndex: "));
        }
    }

    public static final boolean vip(C14677e c14677e, Set set) {
        Object obj;
        if (c14677e.vip()) {
            return set.contains(c14677e);
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C14677e c14677e2 = (C14677e) obj;
            AbstractC4265e.yandex("Fully specified range is not actually fully specified.", c14677e2.vip());
            int i = c14677e.vip;
            if (i == 0 || i == c14677e2.vip) {
                AbstractC4265e.yandex("Fully specified range is not actually fully specified.", c14677e2.vip());
                int i2 = c14677e.ad;
                if (i2 != 0) {
                    int i3 = c14677e2.ad;
                    if ((i2 == 2 && i3 != 1) || i2 == i3) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return obj != null;
    }
}
