package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۨۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12155e extends ImageButton {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f24438e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Csuper f24439e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17790e f24440e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12155e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC7474e.ad(context);
        this.f24438e = false;
        AbstractC17382e.ad(this, getContext());
        C17790e c17790e = new C17790e(this);
        this.f24440e = c17790e;
        c17790e.applovin(attributeSet, i);
        Csuper csuper = new Csuper(this);
        this.f24439e = csuper;
        csuper.m4650protected(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C17790e c17790e = this.f24440e;
        if (c17790e != null) {
            c17790e.license();
        }
        Csuper csuper = this.f24439e;
        if (csuper != null) {
            csuper.billing();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C17790e c17790e = this.f24440e;
        if (c17790e != null) {
            return c17790e.tapsense();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C17790e c17790e = this.f24440e;
        if (c17790e != null) {
            return c17790e.isPro();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0142e c0142e;
        Csuper csuper = this.f24439e;
        if (csuper == null || (c0142e = (C0142e) csuper.f36471e) == null) {
            return null;
        }
        return (ColorStateList) c0142e.f1373e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0142e c0142e;
        Csuper csuper = this.f24439e;
        if (csuper == null || (c0142e = (C0142e) csuper.f36471e) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0142e.f1375e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f24439e.f36469e).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C17790e c17790e = this.f24440e;
        if (c17790e != null) {
            c17790e.subs();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C17790e c17790e = this.f24440e;
        if (c17790e != null) {
            c17790e.m4430interface(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        Csuper csuper = this.f24439e;
        if (csuper != null) {
            csuper.billing();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Csuper csuper = this.f24439e;
        if (csuper != null && drawable != null && !this.f24438e) {
            csuper.f36470e = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (csuper != null) {
            csuper.billing();
            if (this.f24438e) {
                return;
            }
            ImageView imageView = (ImageView) csuper.f36469e;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(csuper.f36470e);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f24438e = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        Csuper csuper = this.f24439e;
        ImageView imageView = (ImageView) csuper.f36469e;
        if (i != 0) {
            Drawable purchase = AbstractC4628e.purchase(imageView.getContext(), i);
            if (purchase != null) {
                AbstractC13982e.ad(purchase);
            }
            imageView.setImageDrawable(purchase);
        } else {
            imageView.setImageDrawable(null);
        }
        csuper.billing();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        Csuper csuper = this.f24439e;
        if (csuper != null) {
            csuper.billing();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C17790e c17790e = this.f24440e;
        if (c17790e != null) {
            c17790e.m4423break(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C17790e c17790e = this.f24440e;
        if (c17790e != null) {
            c17790e.m4422abstract(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        Csuper csuper = this.f24439e;
        if (csuper != null) {
            if (((C0142e) csuper.f36471e) == null) {
                csuper.f36471e = new Object();
            }
            C0142e c0142e = (C0142e) csuper.f36471e;
            c0142e.f1373e = colorStateList;
            c0142e.f1374e = true;
            csuper.billing();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        Csuper csuper = this.f24439e;
        if (csuper != null) {
            if (((C0142e) csuper.f36471e) == null) {
                csuper.f36471e = new Object();
            }
            C0142e c0142e = (C0142e) csuper.f36471e;
            c0142e.f1375e = mode;
            c0142e.f1376e = true;
            csuper.billing();
        }
    }
}
