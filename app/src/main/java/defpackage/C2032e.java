package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2032e extends Drawable implements InterfaceC6586e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C7356e f5303e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public WeakReference f5304e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public WeakReference f5305e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C4925e f5306e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public float f5307e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C11252e f5308e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f5309e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public float f5310e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Rect f5311e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public float f5312e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final WeakReference f5313e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public float f5314e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public float f5315e;

    public C2032e(Context context) {
        C4026e c4026e;
        WeakReference weakReference = new WeakReference(context);
        this.f5313e = weakReference;
        AbstractC15787e.metrica(context, AbstractC15787e.f31090e, "Theme.MaterialComponents");
        this.f5311e = new Rect();
        C4925e c4925e = new C4925e(this);
        this.f5306e = c4925e;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = c4925e.ad;
        textPaint.setTextAlign(align);
        C7356e c7356e = new C7356e(context);
        this.f5303e = c7356e;
        boolean purchase = purchase();
        C10026e c10026e = c7356e.vip;
        C11252e c11252e = new C11252e(C15339e.ad(context, purchase ? c10026e.f19824e.intValue() : c10026e.f19797e.intValue(), purchase() ? c10026e.f19811e.intValue() : c10026e.f19825e.intValue(), new C0685e(0)).ad());
        this.f5308e = c11252e;
        yandex();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && c4925e.billing != (c4026e = new C4026e(context2, c10026e.f19819e.intValue()))) {
            c4925e.vip(c4026e, context2);
            textPaint.setColor(c10026e.f19800e.intValue());
            invalidateSelf();
            adcel();
            invalidateSelf();
        }
        int i = c10026e.f19799e;
        if (i != -2) {
            this.f5309e = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.f5309e = c10026e.f19798e;
        }
        c4925e.appmetrica = true;
        adcel();
        invalidateSelf();
        c4925e.appmetrica = true;
        yandex();
        adcel();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(c10026e.f19806e.intValue());
        if (c11252e.f22618e.metrica != valueOf) {
            c11252e.advert(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(c10026e.f19800e.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f5305e;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f5305e.get();
            WeakReference weakReference3 = this.f5304e;
            startapp(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        adcel();
        setVisible(c10026e.f19826e.booleanValue(), false);
    }

    @Override // defpackage.InterfaceC6586e
    public final void ad() {
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void adcel() {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2032e.adcel():void");
    }

    public final int appmetrica() {
        int i = this.f5303e.vip.f19814e;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean billing() {
        C10026e c10026e = this.f5303e.vip;
        return c10026e.f19801e == null && c10026e.f19814e != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String vip;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f5308e.draw(canvas);
        if (!purchase() || (vip = vip()) == null) {
            return;
        }
        Rect rect = new Rect();
        C4925e c4925e = this.f5306e;
        c4925e.ad.getTextBounds(vip, 0, vip.length(), rect);
        float exactCenterY = this.f5314e - rect.exactCenterY();
        canvas.drawText(vip, this.f5315e, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), c4925e.ad);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f5303e.vip.f19821e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f5311e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f5311e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final FrameLayout license() {
        WeakReference weakReference = this.f5304e;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final CharSequence metrica() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        C7356e c7356e = this.f5303e;
        C10026e c10026e = c7356e.vip;
        C10026e c10026e2 = c7356e.vip;
        if (c10026e.f19801e != null) {
            CharSequence charSequence = c10026e.f19808e;
            return charSequence != null ? charSequence : c7356e.vip.f19801e;
        }
        if (!billing()) {
            return c10026e2.f19809e;
        }
        if (c10026e2.f19807e == 0 || (context = (Context) this.f5313e.get()) == null) {
            return null;
        }
        int i = this.f5309e;
        return (i == -2 || appmetrica() <= i) ? context.getResources().getQuantityString(c10026e2.f19807e, appmetrica(), Integer.valueOf(appmetrica())) : context.getString(c10026e2.f19804e, Integer.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, defpackage.InterfaceC6586e
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final boolean purchase() {
        return this.f5303e.vip.f19801e != null || billing();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C7356e c7356e = this.f5303e;
        c7356e.ad.f19821e = i;
        c7356e.vip.f19821e = i;
        this.f5306e.ad.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void startapp(View view, FrameLayout frameLayout) {
        this.f5305e = new WeakReference(view);
        this.f5304e = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        adcel();
        invalidateSelf();
    }

    public final String vip() {
        C7356e c7356e = this.f5303e;
        C10026e c10026e = c7356e.vip;
        C10026e c10026e2 = c7356e.vip;
        String str = c10026e.f19801e;
        WeakReference weakReference = this.f5313e;
        if (str == null) {
            if (!billing()) {
                return null;
            }
            int i = this.f5309e;
            if (i == -2 || appmetrica() <= i) {
                return NumberFormat.getInstance(c10026e2.f19803e).format(appmetrica());
            }
            Context context = (Context) weakReference.get();
            return context == null ? BuildConfig.FLAVOR : String.format(c10026e2.f19803e, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        int i2 = c10026e.f19799e;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return BuildConfig.FLAVOR;
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    public final void yandex() {
        Context context = (Context) this.f5313e.get();
        if (context == null) {
            return;
        }
        boolean purchase = purchase();
        C7356e c7356e = this.f5303e;
        this.f5308e.setShapeAppearanceModel(C15339e.ad(context, purchase ? c7356e.vip.f19824e.intValue() : c7356e.vip.f19797e.intValue(), purchase() ? c7356e.vip.f19811e.intValue() : c7356e.vip.f19825e.intValue(), new C0685e(0)).ad());
        invalidateSelf();
    }
}
