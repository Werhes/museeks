package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11167e {
    public static AbstractC6560e metrica;
    public static final int ad = Color.argb(230, 255, 255, 255);
    public static final int vip = Color.argb(128, 27, 27, 27);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ad(AbstractActivityC15824e abstractActivityC15824e, C15013e c15013e, C15013e c15013e2) {
        View decorView = abstractActivityC15824e.getWindow().getDecorView();
        AbstractC6560e abstractC6560e = metrica;
        AbstractC6560e abstractC6560e2 = abstractC6560e;
        if (abstractC6560e == null) {
            int i = Build.VERSION.SDK_INT;
            AbstractC6560e obj = i >= 35 ? new Object() : i >= 30 ? new Object() : i >= 29 ? new Object() : i >= 28 ? new Object() : i >= 26 ? new Object() : new Object();
            metrica = obj;
            abstractC6560e2 = obj;
        }
        AbstractC6560e abstractC6560e3 = abstractC6560e2;
        RunnableC14110e runnableC14110e = new RunnableC14110e(abstractC6560e3, c15013e, c15013e2, abstractActivityC15824e, decorView, 2);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                C2470e c2470e = new C2470e(runnableC14110e, viewGroup.getContext());
                c2470e.setTag(abstractC6560e3);
                c2470e.setVisibility(8);
                c2470e.setWillNotDraw(true);
                viewGroup.addView(c2470e);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof AbstractC6560e) {
                break;
            } else {
                i2 = i3;
            }
        }
        runnableC14110e.run();
        abstractC6560e3.ad(abstractActivityC15824e.getWindow());
    }
}
