package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؔۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4628e {
    public static final C2892e ad = new C2892e(-1704504923, false, new C6039e(5));
    public static final C2892e vip = new C2892e(2029869637, false, new C6039e(6));
    public static final C2892e metrica = new C2892e(440820491, false, new C6039e(7));
    public static final C2892e license = new C2892e(-126091542, false, new C6039e(8));

    public static void ad(Drawable drawable, Matrix matrix, int i, int i2, ImageView.ScaleType scaleType) {
        float f;
        float f2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        boolean z = (intrinsicWidth < 0 || i == intrinsicWidth) && (intrinsicHeight < 0 || i2 == intrinsicHeight);
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || ImageView.ScaleType.FIT_XY == scaleType) {
            drawable.setBounds(0, 0, i, i2);
            matrix.reset();
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        if (z) {
            matrix.reset();
            return;
        }
        if (ImageView.ScaleType.CENTER == scaleType) {
            matrix.reset();
            matrix.setTranslate(Math.round((i - intrinsicWidth) * 0.5f), Math.round((i2 - intrinsicHeight) * 0.5f));
            return;
        }
        if (ImageView.ScaleType.CENTER_CROP != scaleType) {
            if (ImageView.ScaleType.CENTER_INSIDE != scaleType) {
                throw new RuntimeException("Scale type not supported: " + scaleType);
            }
            matrix.reset();
            float min = (intrinsicWidth > i || intrinsicHeight > i2) ? Math.min(i / intrinsicWidth, i2 / intrinsicHeight) : 1.0f;
            matrix.setScale(min, min);
            matrix.postTranslate(Math.round((i - (intrinsicWidth * min)) * 0.5f), Math.round((i2 - (intrinsicHeight * min)) * 0.5f));
            return;
        }
        matrix.reset();
        float f3 = 0.0f;
        if (intrinsicWidth * i2 > i * intrinsicHeight) {
            f = i2 / intrinsicHeight;
            f3 = (i - (intrinsicWidth * f)) * 0.5f;
            f2 = 0.0f;
        } else {
            f = i / intrinsicWidth;
            f2 = (i2 - (intrinsicHeight * f)) * 0.5f;
        }
        matrix.setScale(f, f);
        matrix.postTranslate(Math.round(f3), Math.round(f2));
    }

    public static final InterfaceC3314e appmetrica(C1615e c1615e, AbstractC0003e abstractC0003e, C13770e c13770e) {
        return metrica(c1615e, c1615e.getValue(), abstractC0003e, c13770e, 0, 0);
    }

    public static final InterfaceC3314e license(InterfaceC0542e interfaceC0542e, C13770e c13770e, int i) {
        InterfaceC16400e interfaceC16400e = (InterfaceC16400e) c13770e.adcel(AbstractC9179e.ad);
        Object value = interfaceC0542e.getValue();
        AbstractC0003e vip2 = interfaceC16400e.vip();
        int i2 = i & 14;
        int i3 = i << 3;
        return metrica(interfaceC0542e, value, vip2, c13770e, i2 | (i3 & 7168) | (i3 & 57344), 0);
    }

    public static final InterfaceC3314e metrica(InterfaceC1108e interfaceC1108e, Object obj, AbstractC0003e abstractC0003e, C13770e c13770e, int i, int i2) {
        int i3 = 2;
        EnumC7785e enumC7785e = EnumC7785e.f15779e;
        boolean z = true;
        Object obj2 = C2693e.f6576e;
        Object[] objArr = {interfaceC1108e, abstractC0003e, enumC7785e, obj2};
        boolean yandex = c13770e.yandex(abstractC0003e);
        if ((((i & 7168) ^ 3072) <= 2048 || !c13770e.license(enumC7785e.ordinal())) && (i & 3072) != 2048) {
            z = false;
        }
        boolean yandex2 = yandex | z | c13770e.yandex(obj2) | c13770e.yandex(interfaceC1108e);
        Object m3681throw = c13770e.m3681throw();
        Object obj3 = C2987e.ad;
        if (yandex2 || m3681throw == obj3) {
            Object c14164e = new C14164e(abstractC0003e, enumC7785e, obj2, interfaceC1108e, null, 6);
            c13770e.m3682throws(c14164e);
            m3681throw = c14164e;
        }
        Function2 function2 = (Function2) m3681throw;
        Object m3681throw2 = c13770e.m3681throw();
        if (m3681throw2 == obj3) {
            m3681throw2 = AbstractC14533e.startapp(obj);
            c13770e.m3682throws(m3681throw2);
        }
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean yandex3 = c13770e.yandex(function2);
        Object m3681throw3 = c13770e.m3681throw();
        if (yandex3 || m3681throw3 == obj3) {
            m3681throw3 = new C15360e(function2, interfaceC3314e, null, i3);
            c13770e.m3682throws(m3681throw3);
        }
        Function2 function22 = (Function2) m3681throw3;
        InterfaceC8850e interfaceC8850e = c13770e.f27289default;
        boolean z2 = false;
        for (Object obj4 : Arrays.copyOf(copyOf, copyOf.length)) {
            z2 |= c13770e.purchase(obj4);
        }
        Object m3681throw4 = c13770e.m3681throw();
        if (!z2 && m3681throw4 != obj3) {
            return interfaceC3314e;
        }
        c13770e.m3682throws(new C6481e(interfaceC8850e, function22));
        return interfaceC3314e;
    }

    public static Drawable purchase(Context context, int i) {
        return C17694e.license().purchase(context, i);
    }

    public static final InterfaceC3314e vip(InterfaceC1108e interfaceC1108e, Object obj, C13770e c13770e, int i) {
        return metrica(interfaceC1108e, obj, ((InterfaceC16400e) c13770e.adcel(AbstractC9179e.ad)).vip(), c13770e, (i & 14) | (((i >> 3) & 8) << 3) | (i & 112) | (i & 7168) | (i & 57344), 0);
    }
}
