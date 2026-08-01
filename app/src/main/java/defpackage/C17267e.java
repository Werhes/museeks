package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17267e extends View {

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C4357e f33892e = new C4357e(3);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Outline f33893e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C14434e f33894e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C16446e f33895e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16125e f33896e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public EnumC7792e f33897e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f33898e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public AbstractC16858e f33899e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC13533e f33900e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public InterfaceC14388e f33901e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f33902e;

    public C17267e(AbstractC13533e abstractC13533e, C16125e c16125e, C14434e c14434e) {
        super(abstractC13533e.getContext());
        this.f33900e = abstractC13533e;
        this.f33896e = c16125e;
        this.f33894e = c14434e;
        setOutlineProvider(f33892e);
        this.f33902e = true;
        this.f33901e = AbstractC14753e.ad;
        this.f33897e = EnumC7792e.f15794e;
        InterfaceC3828e.ad.getClass();
        this.f33899e = C8082e.f16423e;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [eؚٗٗ, kotlin.jvm.functions.Function1] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C16125e c16125e = this.f33896e;
        C11648e c11648e = c16125e.ad;
        Canvas canvas2 = c11648e.ad;
        c11648e.ad = canvas;
        InterfaceC14388e interfaceC14388e = this.f33901e;
        EnumC7792e enumC7792e = this.f33897e;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C16446e c16446e = this.f33895e;
        ?? r9 = this.f33899e;
        C14434e c14434e = this.f33894e;
        InterfaceC14388e m4534extends = c14434e.f28537e.m4534extends();
        C18478e c18478e = c14434e.f28537e;
        EnumC7792e m4562while = c18478e.m4562while();
        InterfaceC14576e m4557this = c18478e.m4557this();
        long m4560try = c18478e.m4560try();
        C16446e c16446e2 = (C16446e) c18478e.f36227e;
        c18478e.m4532const(interfaceC14388e);
        c18478e.m4542for(enumC7792e);
        c18478e.m4541finally(c11648e);
        c18478e.m4533continue(floatToRawIntBits);
        c18478e.f36227e = c16446e;
        c11648e.billing();
        try {
            r9.invoke(c14434e);
            c11648e.admob();
            c18478e.m4532const(m4534extends);
            c18478e.m4542for(m4562while);
            c18478e.m4541finally(m4557this);
            c18478e.m4533continue(m4560try);
            c18478e.f36227e = c16446e2;
            c16125e.ad.ad = canvas2;
            this.f33898e = false;
        } catch (Throwable th) {
            c11648e.admob();
            c18478e.m4532const(m4534extends);
            c18478e.m4542for(m4562while);
            c18478e.m4541finally(m4557this);
            c18478e.m4533continue(m4560try);
            c18478e.f36227e = c16446e2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f33902e;
    }

    public final C16125e getCanvasHolder() {
        return this.f33896e;
    }

    public final View getOwnerView() {
        return this.f33900e;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f33902e;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f33898e) {
            return;
        }
        this.f33898e = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f33902e != z) {
            this.f33902e = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.f33898e = z;
    }
}
