package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16268e {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(final defpackage.AbstractC10727e r15, final defpackage.InterfaceC12864e r16, defpackage.InterfaceC8079e r17, defpackage.InterfaceC2872e r18, float r19, defpackage.C13770e r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16268e.ad(eُؑٗ, eّۤۧ, eًٝ٘, eؔۜؕ, float, eٓؕۥ, int, int):void");
    }

    public static EnumC12473e appmetrica(String str) {
        if (str.equals("http/1.0")) {
            return EnumC12473e.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return EnumC12473e.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return EnumC12473e.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return EnumC12473e.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return EnumC12473e.SPDY_3;
        }
        if (str.equals("quic")) {
            return EnumC12473e.QUIC;
        }
        if (AbstractC6507e.pro(str, "h3", false)) {
            return EnumC12473e.HTTP_3;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e, C14995e c14995e, EnumC17426e enumC17426e, Function2 function2) {
        return interfaceC12864e.premium(new C16584e(c14995e, function2, enumC17426e));
    }

    public static HashMap metrica(Rect rect, boolean z, Rational rational, int i, int i2, int i3, Map map) {
        boolean z2 = false;
        AbstractC4265e.license(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap hashMap = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((C6884e) entry.getValue()).ad.getWidth(), ((C6884e) entry.getValue()).ad.getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap.put((AbstractC16510e) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational metrica = AbstractC15428e.metrica(i, rational);
        if (i2 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF5 = new RectF(0.0f, 0.0f, metrica.getNumerator(), metrica.getDenominator());
            if (i2 == 0) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.START);
            } else if (i2 == 1) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.CENTER);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException(AbstractC1786e.admob(i2, "Unexpected scale type: "));
                }
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.END);
            }
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z3 = z ^ (i3 == 1);
            boolean z4 = i == 0 && !z3;
            boolean z5 = i == 90 && z3;
            if (z4 || z5) {
                rectF2 = rectF6;
            } else {
                boolean z6 = i == 0 && z3;
                boolean z7 = i == 270 && !z3;
                if (z6 || z7) {
                    float centerX = rectF2.centerX();
                    float f = centerX + centerX;
                    rectF2 = new RectF(f - rectF6.right, rectF6.top, f - rectF6.left, rectF6.bottom);
                } else {
                    boolean z8 = i == 90 && !z3;
                    boolean z9 = i == 180 && z3;
                    if (z8 || z9) {
                        float centerY = rectF2.centerY();
                        float f2 = centerY + centerY;
                        rectF2 = new RectF(rectF6.left, f2 - rectF6.bottom, rectF6.right, f2 - rectF6.top);
                    } else {
                        boolean z10 = i == 180 && !z3;
                        if (i == 270 && z3) {
                            z2 = true;
                        }
                        if (!z10 && !z2) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z3 + " rotation " + i);
                        }
                        float centerY2 = rectF2.centerY();
                        float f3 = centerY2 + centerY2;
                        RectF rectF7 = new RectF(rectF6.left, f3 - rectF6.bottom, rectF6.right, f3 - rectF6.top);
                        float centerX2 = rectF2.centerX();
                        float f4 = centerX2 + centerX2;
                        rectF2 = new RectF(f4 - rectF7.right, rectF7.top, f4 - rectF7.left, rectF7.bottom);
                    }
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        RectF rectF8 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF8, rectF2);
            Rect rect2 = new Rect();
            rectF8.round(rect2);
            hashMap2.put((AbstractC16510e) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    public static AbstractC16696e purchase() {
        C5363e c5363e = AbstractC16696e.ad;
        List list = (List) c5363e.getValue();
        C5775e.ad.getClass();
        int intValue = ((Number) C5775e.startapp.ad()).intValue();
        return (AbstractC16696e) ((intValue < 0 || intValue >= list.size()) ? (AbstractC16696e) ((List) c5363e.getValue()).get(0) : list.get(intValue));
    }

    public static final void vip(C1362e c1362e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i, int i2) {
        C10156e c10156e = C5438e.f11700e;
        InterfaceC2872e interfaceC2872e = (i2 & 16) != 0 ? C16477e.vip : C16477e.ad;
        boolean purchase = c13770e.purchase(c1362e);
        Object m3681throw = c13770e.m3681throw();
        if (purchase || m3681throw == C2987e.ad) {
            m3681throw = AbstractC11765e.ad(c1362e, 1);
            c13770e.m3682throws(m3681throw);
        }
        ad((C8368e) m3681throw, interfaceC12864e, c10156e, interfaceC2872e, 1.0f, c13770e, 440 | (57344 & i), 0);
    }
}
