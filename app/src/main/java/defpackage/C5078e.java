package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5078e extends C18540e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f10908e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public PorterDuff.Mode f10909e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Drawable f10910e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f10911e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public ColorStateList f10912e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C6878e f10913e;

    public C5078e(C6878e c6878e) {
        super(c6878e);
        this.f10912e = null;
        this.f10909e = null;
        this.f10908e = false;
        this.f10911e = false;
        this.f10913e = c6878e;
    }

    @Override // defpackage.C18540e
    /* renamed from: catch, reason: not valid java name */
    public final void mo1733catch(AttributeSet attributeSet, int i) {
        super.mo1733catch(attributeSet, R.attr.seekBarStyle);
        C6878e c6878e = this.f10913e;
        Context context = c6878e.getContext();
        int[] iArr = AbstractC6062e.billing;
        C0912e advert = C0912e.advert(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) advert.f3331e;
        AbstractC2016e.amazon(c6878e, c6878e.getContext(), iArr, attributeSet, (TypedArray) advert.f3331e, R.attr.seekBarStyle);
        Drawable startapp = advert.startapp(0);
        if (startapp != null) {
            c6878e.setThumb(startapp);
        }
        Drawable yandex = advert.yandex(1);
        Drawable drawable = this.f10910e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f10910e = yandex;
        if (yandex != null) {
            yandex.setCallback(c6878e);
            yandex.setLayoutDirection(c6878e.getLayoutDirection());
            if (yandex.isStateful()) {
                yandex.setState(c6878e.getDrawableState());
            }
            m1735return();
        }
        c6878e.invalidate();
        if (typedArray.hasValue(3)) {
            this.f10909e = AbstractC13982e.metrica(typedArray.getInt(3, -1), this.f10909e);
            this.f10911e = true;
        }
        if (typedArray.hasValue(2)) {
            this.f10912e = advert.purchase(2);
            this.f10908e = true;
        }
        advert.amazon();
        m1735return();
    }

    /* renamed from: else, reason: not valid java name */
    public final void m1734else(Canvas canvas) {
        if (this.f10910e != null) {
            int max = this.f10913e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f10910e.getIntrinsicWidth();
                int intrinsicHeight = this.f10910e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f10910e.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f10910e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: return, reason: not valid java name */
    public final void m1735return() {
        Drawable drawable = this.f10910e;
        if (drawable != null) {
            if (this.f10908e || this.f10911e) {
                Drawable mutate = drawable.mutate();
                this.f10910e = mutate;
                if (this.f10908e) {
                    mutate.setTintList(this.f10912e);
                }
                if (this.f10911e) {
                    this.f10910e.setTintMode(this.f10909e);
                }
                if (this.f10910e.isStateful()) {
                    this.f10910e.setState(this.f10913e.getDrawableState());
                }
            }
        }
    }
}
