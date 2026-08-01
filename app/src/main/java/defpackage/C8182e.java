package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8182e extends AbstractC18109e {

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public static final String[] f16661e = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public static final C9184e f16660e = new C9184e(0, PointF.class, "topLeft");

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public static final C9184e f16662e = new C9184e(1, PointF.class, "bottomRight");

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public static final C9184e f16659e = new C9184e(2, PointF.class, "bottomRight");

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public static final C9184e f16664e = new C9184e(3, PointF.class, "topLeft");

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public static final C9184e f16663e = new C9184e(4, PointF.class, "position");

    /* renamed from: while, reason: not valid java name */
    public static void m2385while(C4314e c4314e) {
        View view = c4314e.vip;
        HashMap hashMap = c4314e.ad;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.AbstractC18109e
    public final void billing(C4314e c4314e) {
        m2385while(c4314e);
    }

    @Override // defpackage.AbstractC18109e
    public final void license(C4314e c4314e) {
        m2385while(c4314e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC18109e
    public final Animator mopub(ViewGroup viewGroup, C4314e c4314e, C4314e c4314e2) {
        int i;
        C8182e c8182e;
        ObjectAnimator ofObject;
        if (c4314e != null) {
            HashMap hashMap = c4314e.ad;
            if (c4314e2 != null) {
                HashMap hashMap2 = c4314e2.ad;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = c4314e2.vip;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i2 = rect.left;
                    int i3 = rect2.left;
                    int i4 = rect.top;
                    int i5 = rect2.top;
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    int i8 = rect.bottom;
                    int i9 = rect2.bottom;
                    int i10 = i6 - i2;
                    int i11 = i8 - i4;
                    int i12 = i7 - i3;
                    int i13 = i9 - i5;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
                        i = 0;
                    } else {
                        i = (i2 == i3 && i4 == i5) ? 0 : 1;
                        if (i6 != i7 || i8 != i9) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i14 = i;
                    if (i14 > 0) {
                        AbstractC16571e.ad(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            c8182e = this;
                            if (i2 == i3 && i4 == i5) {
                                c8182e.f35522e.getClass();
                                ofObject = ObjectAnimator.ofObject(view, f16659e, (TypeConverter) null, C7249e.license(i6, i8, i7, i9));
                            } else {
                                c8182e.f35522e.getClass();
                                ofObject = ObjectAnimator.ofObject(view, f16664e, (TypeConverter) null, C7249e.license(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            c8182e = this;
                            c8182e.f35522e.getClass();
                            ofObject = ObjectAnimator.ofObject(view, f16663e, (TypeConverter) null, C7249e.license(i2, i4, i3, i5));
                        } else {
                            c8182e = this;
                            C0260e c0260e = new C0260e(view);
                            c8182e.f35522e.getClass();
                            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(c0260e, f16660e, (TypeConverter) null, C7249e.license(i2, i4, i3, i5));
                            c8182e.f35522e.getClass();
                            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(c0260e, f16662e, (TypeConverter) null, C7249e.license(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofObject2, ofObject3);
                            animatorSet.addListener(new C17037e(c0260e));
                            ofObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            AbstractC8141e.yandex(viewGroup4, true);
                            c8182e.Signature().ad(new C3020e(viewGroup4));
                        }
                        return ofObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC18109e
    public final String[] subscription() {
        return f16661e;
    }
}
