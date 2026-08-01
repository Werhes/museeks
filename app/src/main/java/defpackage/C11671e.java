package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11671e extends C2187e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f23459e;

    public /* synthetic */ C11671e(int i) {
        this.f23459e = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r6 != 16908346) goto L32;
     */
    @Override // defpackage.C2187e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean billing(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.f23459e
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.billing(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.billing(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L13
            goto La1
        L13:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L1e
            goto La0
        L1e:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L3b
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L3b
            int r7 = r2.height()
        L3b:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L75
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r6 == r2) goto L4e
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L4e
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L75
            goto La0
        L4e:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.tapsense(r1, r6, r0)
            goto La1
        L75:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.tapsense(r1, r6, r0)
            goto La1
        La0:
            r0 = r1
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11671e.billing(android.view.View, int, android.os.Bundle):boolean");
    }

    @Override // defpackage.C2187e
    public final void license(View view, C8092e c8092e) {
        int scrollRange;
        switch (this.f23459e) {
            case 0:
                this.f5558e.onInitializeAccessibilityNodeInfo(view, c8092e.ad);
                c8092e.advert(null);
                return;
            case 1:
                this.f5558e.onInitializeAccessibilityNodeInfo(view, c8092e.ad);
                c8092e.pro(false);
                return;
            case 2:
                this.f5558e.onInitializeAccessibilityNodeInfo(view, c8092e.ad);
                c8092e.advert(null);
                return;
            default:
                this.f5558e.onInitializeAccessibilityNodeInfo(view, c8092e.ad);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c8092e.mopub(ScrollView.class.getName());
                if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                    return;
                }
                c8092e.pro(true);
                if (nestedScrollView.getScrollY() > 0) {
                    c8092e.vip(C3614e.startapp);
                    c8092e.vip(C3614e.amazon);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    c8092e.vip(C3614e.yandex);
                    c8092e.vip(C3614e.Signature);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.C2187e
    public void metrica(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f23459e) {
            case 3:
                super.metrica(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                super.metrica(view, accessibilityEvent);
                return;
        }
    }
}
