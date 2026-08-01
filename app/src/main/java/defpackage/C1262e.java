package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1262e extends AbstractC5133e implements InterfaceC0569e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f3962e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f3963e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Window f3964e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f3965e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f3966e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C0576e f3967e;

    public C1262e(Context context, Window window) {
        super(context, null);
        this.f3964e = window;
        this.f3967e = AbstractC14533e.startapp(AbstractC3776e.ad);
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        AbstractC4387e.metrica(this, this);
        AbstractC2016e.subscription(this, new C4400e(this, 1));
    }

    @Override // defpackage.AbstractC5133e
    public final void ad(C13770e c13770e, int i) {
        c13770e.m3671package(1735448596);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) this.f3967e.getValue()).invoke(c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1827e(this, i, 5);
        }
    }

    @Override // defpackage.AbstractC5133e
    public final void billing(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // defpackage.InterfaceC0569e
    /* renamed from: extends */
    public final C12948e mo378extends(View view, C12948e c12948e) {
        if (!this.f3962e) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return c12948e.ad.subscription(max, max2, max3, max4);
            }
        }
        return c12948e;
    }

    @Override // defpackage.AbstractC5133e
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f3966e;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    @Override // defpackage.AbstractC5133e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yandex(int r13, int r14) {
        /*
            r12 = this;
            r0 = 0
            android.view.View r1 = r12.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.yandex(r13, r14)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r13)
            int r3 = android.view.View.MeasureSpec.getSize(r14)
            int r4 = android.view.View.MeasureSpec.getMode(r14)
            r5 = -2
            android.view.Window r6 = r12.f3964e
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r7) goto L49
            boolean r8 = r12.f3963e
            if (r8 != 0) goto L49
            android.view.WindowManager$LayoutParams r8 = r6.getAttributes()
            int r8 = r8.height
            if (r8 != r5) goto L49
            boolean r8 = r12.f3962e
            if (r8 == 0) goto L46
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r8 >= r9) goto L3b
            eؓؓۘ r8 = defpackage.C1560e.ad
            int r8 = r8.ad(r6)
            goto L4a
        L3b:
            r9 = 32
            if (r8 >= r9) goto L49
            eؗۘٛ r8 = defpackage.C5112e.ad
            int r8 = r8.ad(r6)
            goto L4a
        L46:
            int r8 = r3 + 1
            goto L4a
        L49:
            r8 = r3
        L4a:
            int r9 = r12.getPaddingLeft()
            int r10 = r12.getPaddingRight()
            int r10 = r10 + r9
            int r9 = r12.getPaddingTop()
            int r11 = r12.getPaddingBottom()
            int r11 = r11 + r9
            int r9 = r2 - r10
            if (r9 >= 0) goto L61
            r9 = r0
        L61:
            int r8 = r8 - r11
            if (r8 >= 0) goto L65
            goto L66
        L65:
            r0 = r8
        L66:
            int r8 = android.view.View.MeasureSpec.getMode(r13)
            if (r8 != 0) goto L6d
            goto L71
        L6d:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
        L71:
            if (r4 != 0) goto L74
            goto L78
        L74:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
        L78:
            r1.measure(r13, r14)
            r13 = 1073741824(0x40000000, float:2.0)
            if (r8 == r7) goto L88
            if (r8 == r13) goto L91
            int r14 = r1.getMeasuredWidth()
            int r2 = r14 + r10
            goto L91
        L88:
            int r14 = r1.getMeasuredWidth()
            int r14 = r14 + r10
            int r2 = java.lang.Math.min(r2, r14)
        L91:
            if (r4 == r7) goto L9d
            if (r4 == r13) goto L9b
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            goto La6
        L9b:
            r13 = r3
            goto La6
        L9d:
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            int r13 = java.lang.Math.min(r3, r13)
        La6:
            r12.setMeasuredDimension(r2, r13)
            boolean r13 = r12.f3962e
            if (r13 != 0) goto Lc7
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            if (r13 <= r3) goto Lc7
            android.view.WindowManager$LayoutParams r13 = r6.getAttributes()
            int r13 = r13.height
            if (r13 != r5) goto Lc7
            r6.addFlags(r7)
            boolean r13 = r12.f3963e
            if (r13 != 0) goto Lc7
            r13 = -1
            r6.setLayout(r13, r13)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1262e.yandex(int, int):void");
    }
}
