package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497e extends AbstractC5358e implements Animatable {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ int f2569e = 0;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Context f2571e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C9380e f2573e = null;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public ArrayList f2570e = null;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C0507e f2574e = new C0507e(0, this);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C3008e f2572e = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, eَؔۧ] */
    public C0497e(Context context, int i) {
        this.f2571e = context;
    }

    @Override // defpackage.AbstractC5358e, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C3008e c3008e = this.f2572e;
        c3008e.ad.draw(canvas);
        if (c3008e.vip.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.getAlpha() : this.f2572e.ad.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f2572e.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.getColorFilter() : this.f2572e.ad.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f11478e == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C9762e(this.f11478e.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2572e.ad.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2572e.ad.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.getOpacity() : this.f2572e.ad.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [eٕ٘ؔ, eؓۨۖ] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C3008e c3008e;
        XmlResourceParser animation;
        Animator appmetrica;
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c3008e = this.f2572e;
            if (eventType == i || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray subscription = AbstractC13406e.subscription(resources, theme, attributeSet, AbstractC9180e.appmetrica);
                    int resourceId = subscription.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C2955e ad = C2955e.ad(resources, resourceId, theme);
                        AbstractC12110e.metrica(ad, "Failed to load drawable");
                        ad.f6987e = false;
                        ad.setCallback(this.f2574e);
                        C2955e c2955e = c3008e.ad;
                        if (c2955e != null) {
                            c2955e.setCallback(null);
                        }
                        c3008e.ad = ad;
                    }
                    subscription.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC9180e.purchase);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(i, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2571e;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            appmetrica = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    animation = resources2.getAnimation(resourceId2);
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } catch (IOException e) {
                                e = e;
                            } catch (XmlPullParserException e2) {
                                e = e2;
                            }
                            try {
                                appmetrica = AbstractC1328e.appmetrica(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                animation.close();
                            } catch (IOException e3) {
                                e = e3;
                                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                notFoundException.initCause(e);
                                throw notFoundException;
                            } catch (XmlPullParserException e4) {
                                e = e4;
                                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                notFoundException2.initCause(e);
                                throw notFoundException2;
                            } catch (Throwable th2) {
                                th = th2;
                                xmlResourceParser = animation;
                                if (xmlResourceParser != null) {
                                    xmlResourceParser.close();
                                }
                                throw th;
                            }
                        }
                        appmetrica.setTarget(c3008e.ad.f6982e.vip.loadAd.get(string));
                        if (c3008e.metrica == null) {
                            c3008e.metrica = new ArrayList();
                            c3008e.license = new C17519e(0);
                        }
                        c3008e.metrica.add(appmetrica);
                        c3008e.license.put(appmetrica, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
            i = 1;
        }
        if (c3008e.vip == null) {
            c3008e.vip = new AnimatorSet();
        }
        c3008e.vip.playTogether(c3008e.metrica);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.isAutoMirrored() : this.f2572e.ad.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f11478e;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2572e.vip.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.isStateful() : this.f2572e.ad.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2572e.ad.setBounds(rect);
        }
    }

    @Override // defpackage.AbstractC5358e, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.setLevel(i) : this.f2572e.ad.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.setState(iArr) : this.f2572e.ad.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f2572e.ad.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f2572e.ad.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2572e.ad.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.f2572e.ad.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f2572e.ad.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f2572e.ad.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f2572e.ad.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C3008e c3008e = this.f2572e;
        if (c3008e.vip.isStarted()) {
            return;
        }
        c3008e.vip.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2572e.vip.end();
        }
    }
}
