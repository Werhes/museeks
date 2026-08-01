package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9936e extends ViewGroup implements InterfaceC11975e, InterfaceC16503e, InterfaceC10614e, InterfaceC0569e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f19636e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public InterfaceC10998e f19637e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public InterfaceC16400e f19638e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC16590e f19639e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public InterfaceC14388e f19640e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final int[] f19641e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final int[] f19642e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C6788e f19643e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final View f19644e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public Function1 f19645e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public long f19646e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C12948e f19647e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public InterfaceC12864e f19648e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C13915e f19649e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Function1 f19650e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public boolean f19651e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public int f19652e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C6788e f19653e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Function0 f19654e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public int f19655e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Function1 f19656e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C12434e f19657e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10663e f19658e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Function0 f19659e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Function0 f19660e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public Function1 f19661e;

    public AbstractC9936e(Context context, AbstractC5830e abstractC5830e, int i, C10663e c10663e, View view, InterfaceC16590e interfaceC16590e) {
        super(context);
        this.f19658e = c10663e;
        this.f19644e = view;
        this.f19639e = interfaceC16590e;
        if (abstractC5830e != null) {
            C0583e c0583e = AbstractC2830e.ad;
            setTag(R.id.androidx_compose_ui_view_composition_context, abstractC5830e);
        }
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        C9820e c9820e = (C9820e) this;
        AbstractC2016e.subscription(this, new C4400e(c9820e, i2));
        AbstractC4387e.metrica(this, this);
        this.f19654e = C17121e.f33491e;
        this.f19660e = C17121e.f33486e;
        this.f19659e = C17121e.f33481e;
        C0115e c0115e = C0115e.f1276e;
        this.f19648e = c0115e;
        this.f19640e = AbstractC14410e.ad();
        int i3 = 2;
        this.f19642e = new int[2];
        this.f19646e = 0L;
        int i4 = 1;
        this.f19643e = new C6788e(c9820e, i4);
        this.f19653e = new C6788e(c9820e, i2);
        this.f19641e = new int[2];
        this.f19652e = RecyclerView.UNDEFINED_DURATION;
        this.f19655e = RecyclerView.UNDEFINED_DURATION;
        this.f19657e = new C12434e((byte) 0, 7);
        C13915e c13915e = new C13915e(3);
        c13915e.f27596e = c9820e;
        InterfaceC12864e ad = AbstractC1147e.ad(AbstractC14783e.license(c0115e, AbstractC8217e.ad, c10663e), true, C5430e.f11636e);
        C13760e c13760e = new C13760e();
        c13760e.f27260e = new C8513e(c9820e, i3);
        C14772e c14772e = new C14772e();
        C14772e c14772e2 = c13760e.f27258e;
        if (c14772e2 != null) {
            c14772e2.f29219e = null;
        }
        c13760e.f27258e = c14772e;
        c14772e.f29219e = c13760e;
        setOnRequestDisallowInterceptTouchEvent$ui(c14772e);
        InterfaceC12864e premium = AbstractC11261e.license(AbstractC5750e.metrica(ad.premium(c13760e), new C7314e(c9820e, c13915e, c9820e)), new C10273e(c9820e, c13915e, i3)).premium(new C12061e(new C8513e(c9820e, i4)));
        c13915e.f27602e = i;
        c13915e.m3707else(this.f19648e.premium(premium));
        int i5 = 5;
        this.f19656e = new C5337e(c13915e, premium, i5);
        c13915e.m3713instanceof(this.f19640e);
        this.f19650e = new C17097e(i5, c13915e);
        c13915e.f27583e = new C10273e(c9820e, c13915e, i2);
        c13915e.f27591e = new C8513e(c9820e, i2);
        c13915e.m3719return(new C14785e(c9820e, c13915e, i4));
        this.f19649e = c13915e;
    }

    public static C7088e advert(C7088e c7088e, int i, int i2, int i3, int i4) {
        int i5 = c7088e.ad - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = c7088e.vip - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = c7088e.metrica - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = c7088e.license - i4;
        return C7088e.vip(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C15087e getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC14070e.metrica("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC5014e) this.f19639e).getSnapshotObserver();
    }

    public static final int mopub(C9820e c9820e, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(AbstractC3062e.metrica(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, RecyclerView.UNDEFINED_DURATION);
    }

    @Override // defpackage.InterfaceC16503e
    public final void ad() {
        this.f19659e.invoke();
    }

    @Override // defpackage.InterfaceC10856e
    public final boolean appmetrica(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // defpackage.InterfaceC10856e
    public final void billing(View view, int i) {
        C12434e c12434e = this.f19657e;
        if (i == 1) {
            c12434e.f24873e = 0;
        } else {
            c12434e.f24874e = 0;
        }
    }

    @Override // defpackage.InterfaceC0569e
    /* renamed from: extends */
    public final C12948e mo378extends(View view, C12948e c12948e) {
        this.f19647e = new C12948e(c12948e);
        return smaato(c12948e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f19641e;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC14388e getDensity() {
        return this.f19640e;
    }

    public final View getInteropView() {
        return this.f19644e;
    }

    public final C13915e getLayoutNode() {
        return this.f19649e;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f19644e.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC16400e getLifecycleOwner() {
        return this.f19638e;
    }

    public final InterfaceC12864e getModifier() {
        return this.f19648e;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C12434e c12434e = this.f19657e;
        return c12434e.f24873e | c12434e.f24874e;
    }

    public final Function1<InterfaceC14388e, Unit> getOnDensityChanged$ui() {
        return this.f19650e;
    }

    public final Function1<InterfaceC12864e, Unit> getOnModifierChanged$ui() {
        return this.f19656e;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f19661e;
    }

    public final Function0<Unit> getRelease() {
        return this.f19659e;
    }

    public final Function0<Unit> getReset() {
        return this.f19660e;
    }

    public final InterfaceC10998e getSavedStateRegistryOwner() {
        return this.f19637e;
    }

    public final Function0<Unit> getUpdate() {
        return this.f19654e;
    }

    public final View getView() {
        return this.f19644e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f19651e) {
            this.f19649e.firebase();
            return null;
        }
        this.f19644e.postOnAnimation(new RunnableC7547e(3, this.f19653e));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f19644e.isNestedScrollingEnabled();
    }

    @Override // defpackage.InterfaceC10614e
    public final boolean isPro() {
        return isAttachedToWindow();
    }

    @Override // defpackage.InterfaceC10856e
    public final void license(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.f19644e.isNestedScrollingEnabled()) {
            float f = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i * f) << 32) | (Float.floatToRawIntBits(i2 * f) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * f) << 32) | (Float.floatToRawIntBits(i4 * f) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            C1507e c1507e = this.f19658e.ad;
            C1507e m616e = c1507e != null ? c1507e.m616e() : null;
            if (m616e != null) {
                m616e.mo619e(i6, floatToRawIntBits, floatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.InterfaceC11975e
    public final void metrica(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f19644e.isNestedScrollingEnabled()) {
            float f = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i * f) << 32) | (Float.floatToRawIntBits(i2 * f) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i4 * f) & 4294967295L) | (Float.floatToRawIntBits(i3 * f) << 32);
            int i6 = i5 == 0 ? 1 : 2;
            C1507e c1507e = this.f19658e.ad;
            C1507e m616e = c1507e != null ? c1507e.m616e() : null;
            long mo619e = m616e != null ? m616e.mo619e(i6, floatToRawIntBits, floatToRawIntBits2) : 0L;
            iArr[0] = AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (mo619e >> 32))) * (-1);
            iArr[1] = AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (mo619e & 4294967295L))) * (-1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19643e.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f19651e) {
            this.f19649e.firebase();
        } else {
            this.f19644e.postOnAnimation(new RunnableC7547e(3, this.f19653e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0088 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:4:0x000e, B:6:0x0016, B:9:0x0080, B:11:0x0088, B:13:0x0098, B:15:0x008d, B:18:0x0029, B:21:0x0035, B:23:0x004a, B:25:0x0056, B:27:0x0060, B:29:0x0070, B:36:0x007b, B:39:0x009c), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetachedFromWindow() {
        /*
            r22 = this;
            r1 = r22
            super.onDetachedFromWindow()
            eٔۥۢ r0 = r1.getSnapshotObserver()
            eًْ r0 = r0.ad
            java.lang.Object r2 = r0.billing
            monitor-enter(r2)
            eّّؔ r0 = r0.purchase     // Catch: java.lang.Throwable -> L96
            int r3 = r0.f24868e     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r6 = 0
        L14:
            if (r5 >= r3) goto L9c
            java.lang.Object[] r7 = r0.f24870e     // Catch: java.lang.Throwable -> L96
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L96
            eؙٓ٘ r7 = (defpackage.C14040e) r7     // Catch: java.lang.Throwable -> L96
            eؑ۟ؖ r8 = r7.purchase     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = r8.advert(r1)     // Catch: java.lang.Throwable -> L96
            e٘ٛ۟ r8 = (defpackage.C17866e) r8     // Catch: java.lang.Throwable -> L96
            if (r8 != 0) goto L29
        L26:
            r16 = r5
            goto L80
        L29:
            java.lang.Object[] r9 = r8.vip     // Catch: java.lang.Throwable -> L96
            int[] r10 = r8.metrica     // Catch: java.lang.Throwable -> L96
            long[] r8 = r8.ad     // Catch: java.lang.Throwable -> L96
            int r11 = r8.length     // Catch: java.lang.Throwable -> L96
            int r11 = r11 + (-2)
            if (r11 < 0) goto L26
            r12 = 0
        L35:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> L96
            r16 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L96
            r17 = 7
            long r4 = r4 << r17
            long r4 = r4 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r17
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L79
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L96
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r15 = 0
        L54:
            if (r15 >= r4) goto L77
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r13 & r18
            r20 = 128(0x80, double:6.32E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L6e
            int r18 = r12 << 3
            int r18 = r18 + r15
            r19 = r5
            r5 = r9[r18]     // Catch: java.lang.Throwable -> L96
            r18 = r10[r18]     // Catch: java.lang.Throwable -> L96
            r7.metrica(r1, r5)     // Catch: java.lang.Throwable -> L96
            goto L70
        L6e:
            r19 = r5
        L70:
            long r13 = r13 >> r19
            int r15 = r15 + 1
            r5 = r19
            goto L54
        L77:
            if (r4 != r5) goto L80
        L79:
            if (r12 == r11) goto L80
            int r12 = r12 + 1
            r5 = r16
            goto L35
        L80:
            eؑ۟ؖ r4 = r7.purchase     // Catch: java.lang.Throwable -> L96
            boolean r4 = r4.adcel()     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L8b
            int r6 = r6 + 1
            goto L98
        L8b:
            if (r6 <= 0) goto L98
            java.lang.Object[] r4 = r0.f24870e     // Catch: java.lang.Throwable -> L96
            int r5 = r16 - r6
            r7 = r4[r16]     // Catch: java.lang.Throwable -> L96
            r4[r5] = r7     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r0 = move-exception
            goto Laa
        L98:
            int r5 = r16 + 1
            goto L14
        L9c:
            java.lang.Object[] r4 = r0.f24870e     // Catch: java.lang.Throwable -> L96
            int r5 = r3 - r6
            r6 = 0
            java.util.Arrays.fill(r4, r5, r3, r6)     // Catch: java.lang.Throwable -> L96
            r0.f24868e = r5     // Catch: java.lang.Throwable -> L96
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L96
            monitor-exit(r2)
            return
        Laa:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9936e.onDetachedFromWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f19644e.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f19644e;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f19652e = i;
        this.f19655e = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f19644e.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC5336e.purchase(this.f19658e.metrica(), null, 0, new C0937e(z, this, AbstractC5458e.ad(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.f19644e.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC5336e.purchase(this.f19658e.metrica(), null, 0, new C7977e(this, AbstractC5458e.ad(f * (-1.0f), f2 * (-1.0f)), (InterfaceC5083e) null, 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // defpackage.InterfaceC10856e
    public final void purchase(View view, View view2, int i, int i2) {
        C12434e c12434e = this.f19657e;
        if (i2 == 1) {
            c12434e.f24873e = i;
        } else {
            c12434e.f24874e = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Function1 function1 = this.f19645e;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rect != null ? AbstractC9764e.advert(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function1 = this.f19661e;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(InterfaceC14388e interfaceC14388e) {
        if (interfaceC14388e != this.f19640e) {
            this.f19640e = interfaceC14388e;
            Function1 function1 = this.f19650e;
            if (function1 != null) {
                function1.invoke(interfaceC14388e);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC16400e interfaceC16400e) {
        if (interfaceC16400e != this.f19638e) {
            this.f19638e = interfaceC16400e;
            AbstractC0436e.startapp(this, interfaceC16400e);
        }
    }

    public final void setModifier(InterfaceC12864e interfaceC12864e) {
        if (interfaceC12864e != this.f19648e) {
            this.f19648e = interfaceC12864e;
            Function1 function1 = this.f19656e;
            if (function1 != null) {
                function1.invoke(interfaceC12864e);
            }
        }
    }

    public final void setOnDensityChanged$ui(Function1<? super InterfaceC14388e, Unit> function1) {
        this.f19650e = function1;
    }

    public final void setOnModifierChanged$ui(Function1<? super InterfaceC12864e, Unit> function1) {
        this.f19656e = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(Function1<? super Boolean, Unit> function1) {
        this.f19661e = function1;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.f19659e = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.f19660e = function0;
    }

    public final void setSavedStateRegistryOwner(InterfaceC10998e interfaceC10998e) {
        if (interfaceC10998e != this.f19637e) {
            this.f19637e = interfaceC10998e;
            AbstractC15428e.appmetrica(this, interfaceC10998e);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.f19654e = function0;
        this.f19636e = true;
        this.f19643e.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final C12948e smaato(C12948e c12948e) {
        C2893e c2893e = c12948e.ad;
        C7088e startapp = c2893e.startapp(-1);
        C7088e c7088e = C7088e.appmetrica;
        if (!startapp.equals(c7088e) || !c2893e.adcel(-9).equals(c7088e) || c2893e.yandex() != null) {
            C14747e c14747e = (C14747e) this.f19649e.f27592e.license;
            if (c14747e.f29169e.f27016e) {
                long purchase = AbstractC17324e.purchase(c14747e.mo211this(0L));
                int i = (int) (purchase >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (purchase & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long advert = AbstractC0890e.metrica(c14747e).advert();
                int i3 = (int) (advert >> 32);
                int i4 = (int) (advert & 4294967295L);
                long j = c14747e.f6803e;
                long purchase2 = AbstractC17324e.purchase(c14747e.mo211this((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i5 = i3 - ((int) (purchase2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & purchase2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return c12948e.ad.subscription(i, i2, i5, i7);
                }
            }
        }
        return c12948e;
    }

    @Override // defpackage.InterfaceC16503e
    public final void startapp() {
        View view = this.f19644e;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f19660e.invoke();
        }
    }

    @Override // defpackage.InterfaceC16503e
    public final void vip() {
        this.f19660e.invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.InterfaceC10856e
    public final void yandex(View view, int i, int i2, int[] iArr, int i3) {
        if (this.f19644e.isNestedScrollingEnabled()) {
            float f = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i * f) << 32) | (Float.floatToRawIntBits(i2 * f) & 4294967295L);
            int i4 = i3 == 0 ? 1 : 2;
            C1507e c1507e = this.f19658e.ad;
            C1507e m616e = c1507e != null ? c1507e.m616e() : null;
            long mo620implements = m616e != null ? m616e.mo620implements(i4, floatToRawIntBits) : 0L;
            iArr[0] = AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (mo620implements >> 32))) * (-1);
            iArr[1] = AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (mo620implements & 4294967295L))) * (-1);
        }
    }
}
