package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC9607e implements View.OnTouchListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f19052e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19053e;

    public /* synthetic */ ViewOnTouchListenerC9607e(int i, Object obj) {
        this.f19053e = i;
        this.f19052e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        if ((((android.widget.FrameLayout) r0.f11401e).getMeasuredWidth() + defpackage.AbstractC17110e.appmetrica((android.widget.FrameLayout) r0.f11401e).x) < r7.getRawX()) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r5.f19053e
            switch(r0) {
                case 0: goto L58;
                case 1: goto L18;
                default: goto L5;
            }
        L5:
            android.widget.Checkable r6 = (android.widget.Checkable) r6
            boolean r6 = r6.isChecked()
            if (r6 == 0) goto L16
            java.lang.Object r6 = r5.f19052e
            android.view.GestureDetector r6 = (android.view.GestureDetector) r6
            boolean r6 = r6.onTouchEvent(r7)
            goto L17
        L16:
            r6 = 0
        L17:
            return r6
        L18:
            java.lang.Object r6 = r5.f19052e
            eٓ۟ۡ r6 = (defpackage.C14271e) r6
            eؖٞؓ r0 = r6.f28221e
            android.os.Handler r1 = r6.f28230e
            eٖٕ۟ r6 = r6.f28227e
            int r2 = r7.getAction()
            float r3 = r7.getX()
            int r3 = (int) r3
            float r7 = r7.getY()
            int r7 = (int) r7
            if (r2 != 0) goto L50
            if (r6 == 0) goto L50
            boolean r4 = r6.isShowing()
            if (r4 == 0) goto L50
            if (r3 < 0) goto L50
            int r4 = r6.getWidth()
            if (r3 >= r4) goto L50
            if (r7 < 0) goto L50
            int r6 = r6.getHeight()
            if (r7 >= r6) goto L50
            r6 = 250(0xfa, double:1.235E-321)
            r1.postDelayed(r0, r6)
            goto L56
        L50:
            r6 = 1
            if (r2 != r6) goto L56
            r1.removeCallbacks(r0)
        L56:
            r6 = 0
            return r6
        L58:
            java.lang.Object r6 = r5.f19052e
            eؘٕۤ r6 = (defpackage.C6023e) r6
            eؗۨ r0 = r6.f12682e
            eٍۡۤ r1 = r6.f12684e
            int r2 = r7.getAction()
            r3 = 4
            r4 = 1
            if (r2 != r3) goto L70
            boolean r7 = r1.firebase
            if (r7 == 0) goto Lb2
            r6.metrica()
            goto Lb2
        L70:
            boolean r2 = r1.f19396class
            if (r2 == 0) goto Lb1
            int r2 = r7.getAction()
            if (r2 != r4) goto Lb1
            java.lang.Object r2 = r0.f11401e
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            android.graphics.Point r2 = defpackage.AbstractC17110e.appmetrica(r2)
            int r2 = r2.x
            float r2 = (float) r2
            float r3 = r7.getRawX()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto La9
            java.lang.Object r2 = r0.f11401e
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            android.graphics.Point r2 = defpackage.AbstractC17110e.appmetrica(r2)
            int r2 = r2.x
            java.lang.Object r0 = r0.f11401e
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            int r0 = r0.getMeasuredWidth()
            int r0 = r0 + r2
            float r0 = (float) r0
            float r7 = r7.getRawX()
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto Lb1
        La9:
            boolean r7 = r1.firebase
            if (r7 == 0) goto Lb2
            r6.metrica()
            goto Lb2
        Lb1:
            r4 = 0
        Lb2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnTouchListenerC9607e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
