package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0181e {
    public static C17149e billing;
    public static final C2892e ad = new C2892e(-275056414, false, new C10494e(0));
    public static final C2892e vip = new C2892e(-2118692124, false, new C10494e(1));
    public static final C2892e metrica = new C2892e(1149130371, false, new C10494e(2));
    public static final C2892e license = new C2892e(-513241590, false, new C10494e(3));
    public static final C2892e appmetrica = new C2892e(584076299, false, new C10494e(4));
    public static final C2892e purchase = new C2892e(724869633, false, new C9375e(8));

    public static final void ad(C1925e c1925e, C13770e c13770e, int i) {
        c13770e.m3671package(1995512795);
        int i2 = (c13770e.purchase(c1925e) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC3314e vip2 = AbstractC3265e.vip(c1925e.purchase, c13770e, 0);
            AbstractC13348e.ad(null, AbstractC16653e.license(1741481111, new C14284e(c1925e, AbstractC3265e.vip(c1925e.yandex, c13770e, 0), 2), c13770e), null, null, null, 0, 0L, 0L, AbstractC3338e.ad, AbstractC16653e.license(810117356, new C12050e(AbstractC3265e.vip(c1925e.startapp, c13770e, 0), c1925e, AbstractC3265e.vip(c1925e.billing, c13770e, 0), vip2, 11), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C8619e(c1925e, i);
        }
    }

    public static List metrica(List list, int i, Rect rect, Rational rational, int i2, InterfaceC5592e interfaceC5592e) {
        PointF pointF;
        if (list.isEmpty() || i == 0) {
            return C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C15099e c15099e = (C15099e) it.next();
            if (arrayList.size() >= i) {
                break;
            }
            float f = c15099e.ad;
            if (f >= 0.0f && f <= 1.0f) {
                float f2 = c15099e.vip;
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    Rational rational3 = c15099e.license;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF license2 = interfaceC5592e.license(c15099e, i2);
                    if (rational3.equals(rational2)) {
                        pointF = new PointF(license2.x, license2.y);
                    } else if (rational3.compareTo(rational2) > 0) {
                        pointF = new PointF(license2.x, license2.y);
                        float doubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                        pointF.y = (1.0f / doubleValue) * (((float) ((doubleValue - 1.0d) / 2)) + pointF.y);
                    } else {
                        pointF = new PointF(license2.x, license2.y);
                        float doubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                        pointF.x = (1.0f / doubleValue2) * (((float) ((doubleValue2 - 1.0d) / 2)) + pointF.x);
                    }
                    float f3 = c15099e.metrica;
                    int width = (int) ((pointF.x * rect.width()) + rect.left);
                    int height = (int) ((pointF.y * rect.height()) + rect.top);
                    int width2 = ((int) (rect.width() * f3)) / 2;
                    int height2 = ((int) (f3 * rect.height())) / 2;
                    Rect rect2 = new Rect(width - width2, height - height2, width + width2, height + height2);
                    rect2.left = AbstractC3062e.metrica(rect2.left, rect.left, rect.right);
                    rect2.right = AbstractC3062e.metrica(rect2.right, rect.left, rect.right);
                    rect2.top = AbstractC3062e.metrica(rect2.top, rect.top, rect.bottom);
                    rect2.bottom = AbstractC3062e.metrica(rect2.bottom, rect.top, rect.bottom);
                    arrayList.add(new MeteringRectangle(rect2, 1000));
                }
            }
        }
        return arrayList;
    }

    public static final C17149e vip() {
        C17149e c17149e = billing;
        if (c17149e != null) {
            return c17149e;
        }
        C18373e c18373e = new C18373e("AutoMirrored.Rounded.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = AbstractC13069e.ad;
        C18466e c18466e = new C18466e(C3618e.vip);
        C13935e c13935e = new C13935e(20);
        c13935e.m3733extends(19.0f, 11.0f);
        c13935e.firebase(7.83f);
        c13935e.m3738native(4.88f, -4.88f);
        c13935e.premium(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        c13935e.premium(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c13935e.m3738native(-6.59f, 6.59f);
        c13935e.premium(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c13935e.m3738native(6.59f, 6.59f);
        c13935e.premium(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c13935e.premium(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        c13935e.m3747this(7.83f, 13.0f);
        c13935e.firebase(19.0f);
        c13935e.premium(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c13935e.m3735implements(-0.45f, -1.0f, -1.0f, -1.0f);
        c13935e.ads();
        C18373e.ad(c18373e, (ArrayList) c13935e.f27641e, c18466e);
        C17149e vip2 = c18373e.vip();
        billing = vip2;
        return vip2;
    }

    public abstract InterfaceC14822e license(C17611e c17611e, InterfaceC9905e interfaceC9905e);
}
