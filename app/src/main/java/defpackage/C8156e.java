package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8156e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C8156e(Object obj, Object obj2, int i) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.ad;
        Object obj = this.metrica;
        Object obj2 = this.vip;
        switch (i) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i2 = AppBarLayout.f738e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((C11252e) obj).mopub(floatValue);
                Drawable drawable = appBarLayout.f744e;
                if (drawable instanceof C11252e) {
                    ((C11252e) drawable).mopub(floatValue);
                }
                Iterator it = appBarLayout.f748e.iterator();
                if (it.hasNext()) {
                    throw AbstractC5087e.m1747goto(it);
                }
                return;
            case 1:
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                num.getClass();
                ((C1244e) obj).purchase.appmetrica(num);
                ((C5008e) obj2).yandex.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((InterfaceC16843e) obj2).mo2126for(1.0f - floatValue2);
                ((AbstractC11130e) obj).mo2126for(floatValue2);
                return;
        }
    }
}
