package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9184e extends Property {
    public final /* synthetic */ int ad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9184e(int i, Class cls, String str) {
        super(cls, str);
        this.ad = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.ad) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((C14913e) obj).f29563e);
            case 6:
                return Float.valueOf(((C14913e) obj).f29559e);
            case 7:
                return Float.valueOf(((AbstractC5682e) obj).vip());
            case 8:
                return Float.valueOf(((View) obj).getLayoutParams().width);
            case 9:
                return Float.valueOf(((View) obj).getLayoutParams().height);
            case 10:
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                return Float.valueOf(((View) obj).getPaddingStart());
            case 11:
                WeakHashMap weakHashMap2 = AbstractC2016e.ad;
                return Float.valueOf(((View) obj).getPaddingEnd());
            case 12:
                return Float.valueOf(((C10512e) obj).f20749e);
            case 13:
                return Float.valueOf(((SwitchCompat) obj).f206e);
            case 14:
                return Float.valueOf(AbstractC16571e.ad.billing((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.ad) {
            case 0:
                C0260e c0260e = (C0260e) obj;
                PointF pointF = (PointF) obj2;
                c0260e.getClass();
                c0260e.ad = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0260e.vip = round;
                int i = c0260e.purchase + 1;
                c0260e.purchase = i;
                if (i == c0260e.billing) {
                    AbstractC16571e.ad(c0260e.appmetrica, c0260e.ad, round, c0260e.metrica, c0260e.license);
                    c0260e.purchase = 0;
                    c0260e.billing = 0;
                    return;
                }
                return;
            case 1:
                C0260e c0260e2 = (C0260e) obj;
                PointF pointF2 = (PointF) obj2;
                c0260e2.getClass();
                c0260e2.metrica = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0260e2.license = round2;
                int i2 = c0260e2.billing + 1;
                c0260e2.billing = i2;
                if (c0260e2.purchase == i2) {
                    AbstractC16571e.ad(c0260e2.appmetrica, c0260e2.ad, c0260e2.vip, c0260e2.metrica, round2);
                    c0260e2.purchase = 0;
                    c0260e2.billing = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC16571e.ad(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC16571e.ad(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                AbstractC16571e.ad(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                C14913e c14913e = (C14913e) obj;
                float floatValue = ((Float) obj2).floatValue();
                c14913e.f29563e = floatValue;
                int i3 = (int) (floatValue * 5400.0f);
                C17633e c17633e = c14913e.f29565e;
                ArrayList arrayList = (ArrayList) c14913e.f22046e;
                C11638e c11638e = (C11638e) arrayList.get(0);
                float f = c14913e.f29563e * 1520.0f;
                c11638e.ad = (-20.0f) + f;
                c11638e.vip = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    float f2 = 667;
                    c11638e.vip = (c17633e.getInterpolation((i3 - C14913e.f29554e[i4]) / f2) * 250.0f) + c11638e.vip;
                    c11638e.ad = (c17633e.getInterpolation((i3 - C14913e.f29553e[i4]) / f2) * 250.0f) + c11638e.ad;
                }
                float f3 = c11638e.ad;
                float f4 = c11638e.vip;
                c11638e.ad = (((f4 - f3) * c14913e.f29559e) + f3) / 360.0f;
                c11638e.vip = f4 / 360.0f;
                int i5 = 0;
                while (true) {
                    if (i5 < 4) {
                        float f5 = (i3 - C14913e.f29555e[i5]) / 333;
                        if (f5 < 0.0f || f5 > 1.0f) {
                            i5++;
                        } else {
                            int i6 = i5 + c14913e.f29560e;
                            int[] iArr = c14913e.f29564e.metrica;
                            int length = i6 % iArr.length;
                            int length2 = (length + 1) % iArr.length;
                            int i7 = iArr[length];
                            int i8 = iArr[length2];
                            float interpolation = c17633e.getInterpolation(f5);
                            C11638e c11638e2 = (C11638e) arrayList.get(0);
                            Integer valueOf = Integer.valueOf(i7);
                            Integer valueOf2 = Integer.valueOf(i8);
                            int intValue = valueOf.intValue();
                            float f6 = ((intValue >> 24) & 255) / 255.0f;
                            int intValue2 = valueOf2.intValue();
                            float f7 = ((intValue2 >> 24) & 255) / 255.0f;
                            float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
                            float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
                            float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
                            float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
                            float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
                            float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
                            float billing = AbstractC1634e.billing(f7, f6, interpolation, f6);
                            float billing2 = AbstractC1634e.billing(pow4, pow, interpolation, pow);
                            float billing3 = AbstractC1634e.billing(pow5, pow2, interpolation, pow2);
                            float billing4 = AbstractC1634e.billing(pow6, pow3, interpolation, pow3);
                            float pow7 = ((float) Math.pow(billing2, 0.45454545454545453d)) * 255.0f;
                            float pow8 = ((float) Math.pow(billing3, 0.45454545454545453d)) * 255.0f;
                            c11638e2.metrica = Integer.valueOf(Math.round(((float) Math.pow(billing4, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(billing * 255.0f) << 24) | (Math.round(pow8) << 8)).intValue();
                        }
                    }
                }
                ((C14160e) c14913e.f22047e).invalidateSelf();
                return;
            case 6:
                ((C14913e) obj).f29559e = ((Float) obj2).floatValue();
                return;
            case 7:
                AbstractC5682e abstractC5682e = (AbstractC5682e) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                if (abstractC5682e.f12065e != floatValue2) {
                    abstractC5682e.f12065e = floatValue2;
                    abstractC5682e.invalidateSelf();
                    return;
                }
                return;
            case 8:
                View view4 = (View) obj;
                view4.getLayoutParams().width = ((Float) obj2).intValue();
                view4.requestLayout();
                return;
            case 9:
                View view5 = (View) obj;
                view5.getLayoutParams().height = ((Float) obj2).intValue();
                view5.requestLayout();
                return;
            case 10:
                View view6 = (View) obj;
                int intValue3 = ((Float) obj2).intValue();
                int paddingTop = view6.getPaddingTop();
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                view6.setPaddingRelative(intValue3, paddingTop, view6.getPaddingEnd(), view6.getPaddingBottom());
                return;
            case 11:
                View view7 = (View) obj;
                WeakHashMap weakHashMap2 = AbstractC2016e.ad;
                view7.setPaddingRelative(view7.getPaddingStart(), view7.getPaddingTop(), ((Float) obj2).intValue(), view7.getPaddingBottom());
                return;
            case 12:
                C10512e c10512e = (C10512e) obj;
                c10512e.getClass();
                c10512e.f20749e = ((Float) obj2).floatValue();
                c10512e.invalidateSelf();
                return;
            case 13:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
            case 14:
                AbstractC16571e.ad.signatures((View) obj, ((Float) obj2).floatValue());
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
