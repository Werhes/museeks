package defpackage;

import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC4128e extends DialogC6137e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Function0 f9094e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C1262e f9095e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f9096e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final View f9097e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C9207e f9098e;

    public DialogC4128e(Function0 function0, C9207e c9207e, View view, EnumC7792e enumC7792e, InterfaceC14388e interfaceC14388e, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme), 0);
        this.f9094e = function0;
        this.f9098e = c9207e;
        this.f9097e = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        C9207e c9207e2 = this.f9098e;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            c9207e2.getClass();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.f9098e.getClass();
        AbstractC13467e.metrica(window, true);
        window.setGravity(17);
        this.f9098e.getClass();
        C1262e c1262e = new C1262e(getContext(), window);
        this.f9098e.getClass();
        setTitle(BuildConfig.FLAVOR);
        c1262e.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c1262e.setClipChildren(false);
        c1262e.setElevation(interfaceC14388e.mo497instanceof(f));
        c1262e.setOutlineProvider(new C4357e(0));
        this.f9095e = c1262e;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            billing(viewGroup);
        }
        setContentView(c1262e);
        AbstractC0436e.startapp(c1262e, AbstractC0436e.appmetrica(view));
        AbstractC15143e.billing(c1262e, AbstractC15143e.license(view));
        AbstractC15428e.appmetrica(c1262e, AbstractC15428e.vip(view));
        startapp(this.f9094e, this.f9098e, enumC7792e);
        ad().ad(new C11109e(new C14820e(this, 1)), this);
    }

    public static final void billing(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C1262e) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                billing(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f9098e.ad || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f9094e.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r5 <= r1) goto L31;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            eٍَؓ r1 = r9.f9098e
            boolean r1 = r1.vip
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L86
            eؒۗۤ r1 = r9.f9095e
            r1.getClass()
            float r5 = r10.getX()
            float r5 = java.lang.Math.abs(r5)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            float r5 = r10.getY()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L34
            goto L69
        L34:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = defpackage.AbstractC1561e.appmetrica(r5)
            if (r7 > r5) goto L69
            if (r5 > r6) goto L69
            float r5 = r10.getY()
            int r5 = defpackage.AbstractC1561e.appmetrica(r5)
            if (r8 > r5) goto L69
            if (r5 > r1) goto L69
            goto L86
        L69:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L83
            if (r10 == r4) goto L77
            if (r10 == r2) goto L74
            goto L90
        L74:
            r9.f9096e = r3
            return r0
        L77:
            boolean r10 = r9.f9096e
            if (r10 == 0) goto L90
            kotlin.jvm.functions.Function0 r10 = r9.f9094e
            r10.invoke()
            r9.f9096e = r3
            return r4
        L83:
            r9.f9096e = r4
            return r4
        L86:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L91
            if (r10 == r4) goto L91
            if (r10 == r2) goto L91
        L90:
            return r0
        L91:
            r9.f9096e = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DialogC4128e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void startapp(Function0 function0, C9207e c9207e, EnumC7792e enumC7792e) {
        int i;
        this.f9094e = function0;
        this.f9098e = c9207e;
        c9207e.getClass();
        boolean vip = AbstractC12710e.vip(this.f9097e);
        int m2467class = AbstractC8703e.m2467class(1);
        if (m2467class != 0) {
            if (m2467class == 1) {
                vip = true;
            } else {
                if (m2467class != 2) {
                    throw new C14803e(10);
                }
                vip = false;
            }
        }
        getWindow().setFlags(vip ? 8192 : -8193, 8192);
        int ordinal = enumC7792e.ordinal();
        if (ordinal == 0) {
            i = 0;
        } else {
            if (ordinal != 1) {
                throw new C14803e(10);
            }
            i = 1;
        }
        C1262e c1262e = this.f9095e;
        c1262e.setLayoutDirection(i);
        Window window = c1262e.f3964e;
        boolean z = (c1262e.f3965e && true == c1262e.f3963e && true == c1262e.f3962e) ? false : true;
        c1262e.f3963e = true;
        c1262e.f3962e = true;
        if (z && (-2 != window.getAttributes().width || !c1262e.f3965e)) {
            window.setLayout(-2, -2);
            c1262e.f3965e = true;
        }
        setCanceledOnTouchOutside(c9207e.vip);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(0);
        }
    }
}
