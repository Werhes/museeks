package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9994e extends AbstractC7214e {
    public final /* synthetic */ SwipeDismissBehavior appmetrica;
    public int license = -1;
    public int metrica;

    public C9994e(SwipeDismissBehavior swipeDismissBehavior) {
        this.appmetrica = swipeDismissBehavior;
    }

    @Override // defpackage.AbstractC7214e
    public final void adcel(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.appmetrica;
        float f = width * swipeDismissBehavior.appmetrica;
        float width2 = view.getWidth() * swipeDismissBehavior.purchase;
        float abs = Math.abs(i - this.metrica);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    @Override // defpackage.AbstractC7214e
    public final int appmetrica(View view) {
        return view.getWidth();
    }

    @Override // defpackage.AbstractC7214e
    public final boolean loadAd(View view, int i) {
        int i2 = this.license;
        return (i2 == -1 || i2 == i) && this.appmetrica.remoteconfig(view);
    }

    @Override // defpackage.AbstractC7214e
    public final int metrica(View view, int i) {
        return view.getTop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.metrica) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // defpackage.AbstractC7214e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mopub(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.license = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.appmetrica
            r4 = 1
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = defpackage.AbstractC2016e.ad
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L1a
            r5 = r4
            goto L1b
        L1a:
            r5 = r2
        L1b:
            int r6 = r3.license
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L67
            goto L52
        L2a:
            if (r1 <= 0) goto L67
            goto L52
        L2d:
            if (r6 != r4) goto L67
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L67
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L67
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.metrica
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L67
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.metrica
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L65
        L61:
            int r10 = r8.metrica
            int r0 = r10 - r11
        L65:
            r2 = r4
            goto L69
        L67:
            int r0 = r8.metrica
        L69:
            eؓۦ۟ r10 = r3.ad
            int r11 = r9.getTop()
            boolean r10 = r10.loadAd(r0, r11)
            if (r10 == 0) goto L7f
            eٜٗٞ r10 = new eٜٗٞ
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = defpackage.AbstractC2016e.ad
            r9.postOnAnimation(r10)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9994e.mopub(android.view.View, float, float):void");
    }

    @Override // defpackage.AbstractC7214e
    public final void startapp(int i) {
    }

    @Override // defpackage.AbstractC7214e
    public final int vip(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.appmetrica.license;
        if (i2 == 0) {
            if (z) {
                width = this.metrica - view.getWidth();
                width2 = this.metrica;
            } else {
                width = this.metrica;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.metrica - view.getWidth();
            width2 = view.getWidth() + this.metrica;
        } else if (z) {
            width = this.metrica;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.metrica - view.getWidth();
            width2 = this.metrica;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.AbstractC7214e
    public final void yandex(View view, int i) {
        this.license = i;
        this.metrica = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.appmetrica;
            swipeDismissBehavior.metrica = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.metrica = false;
        }
    }
}
