package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10867e {
    public static final ColorDrawable applovin;
    public static final double isPro = Math.cos(Math.toRadians(45.0d));
    public LayerDrawable Signature;
    public final MaterialCardView ad;
    public Drawable adcel;
    public C11252e admob;
    public ColorStateList advert;
    public ColorStateList amazon;
    public int appmetrica;
    public int billing;
    public final int isVip;
    public final C11252e license;
    public RippleDrawable loadAd;
    public final C11252e metrica;
    public ColorStateList mopub;
    public ValueAnimator pro;
    public int purchase;
    public boolean remoteconfig;
    public final TimeInterpolator signatures;
    public C15339e smaato;
    public Drawable startapp;
    public final int tapsense;
    public int yandex;
    public final Rect vip = new Rect();
    public boolean subscription = false;
    public float inmobi = 0.0f;

    static {
        applovin = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C10867e(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.ad = materialCardView;
        C11252e c11252e = new C11252e(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.metrica = c11252e;
        c11252e.adcel(materialCardView.getContext());
        c11252e.amazon();
        C4568e appmetrica = c11252e.f22618e.ad.appmetrica();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC11408e.purchase, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            appmetrica.appmetrica = new C0685e(dimension);
            appmetrica.purchase = new C0685e(dimension);
            appmetrica.billing = new C0685e(dimension);
            appmetrica.yandex = new C0685e(dimension);
        }
        this.license = new C11252e();
        yandex(appmetrica.ad());
        this.signatures = AbstractC18292e.startapp(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC16664e.ad);
        this.tapsense = AbstractC18292e.yandex(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.isVip = AbstractC18292e.yandex(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float vip(AbstractC0421e abstractC0421e, float f) {
        if (abstractC0421e instanceof C0575e) {
            return (float) ((1.0d - isPro) * f);
        }
        if (abstractC0421e instanceof C5879e) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float ad() {
        AbstractC0421e abstractC0421e = this.smaato.ad;
        C11252e c11252e = this.metrica;
        return Math.max(Math.max(vip(abstractC0421e, c11252e.yandex()), vip(this.smaato.vip, c11252e.f22618e.ad.purchase.ad(c11252e.billing()))), Math.max(vip(this.smaato.metrica, c11252e.f22618e.ad.billing.ad(c11252e.billing())), vip(this.smaato.license, c11252e.f22618e.ad.yandex.ad(c11252e.billing()))));
    }

    public final boolean adcel() {
        View view = this.ad;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r1.f22618e.ad.license(r1.billing()) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void advert() {
        /*
            r6 = this;
            com.google.android.material.card.MaterialCardView r0 = r6.ad
            boolean r1 = r0.getPreventCornerOverlap()
            r2 = 0
            if (r1 == 0) goto L1a
            eُۚۜ r1 = r6.metrica
            eّؕۧ r3 = r1.f22618e
            eٌِٕ r3 = r3.ad
            android.graphics.RectF r1 = r1.billing()
            boolean r1 = r3.license(r1)
            if (r1 != 0) goto L1a
            goto L20
        L1a:
            boolean r1 = r6.startapp()
            if (r1 == 0) goto L25
        L20:
            float r1 = r6.ad()
            goto L26
        L25:
            r1 = r2
        L26:
            boolean r3 = r0.getPreventCornerOverlap()
            if (r3 == 0) goto L3e
            boolean r3 = r0.getUseCompatPadding()
            if (r3 == 0) goto L3e
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = defpackage.C10867e.isPro
            double r2 = r2 - r4
            float r4 = r0.getCardViewRadius()
            double r4 = (double) r4
            double r2 = r2 * r4
            float r2 = (float) r2
        L3e:
            float r1 = r1 - r2
            int r1 = (int) r1
            android.graphics.Rect r2 = r6.vip
            int r3 = r2.left
            int r3 = r3 + r1
            int r4 = r2.top
            int r4 = r4 + r1
            int r5 = r2.right
            int r5 = r5 + r1
            int r2 = r2.bottom
            int r2 = r2 + r1
            android.graphics.Rect r1 = r0.f341e
            r1.set(r3, r4, r5, r2)
            eُؗؒ r1 = androidx.cardview.widget.CardView.f338e
            eۨۗ r0 = r0.f340e
            r1.m1640e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10867e.advert():void");
    }

    public final void appmetrica(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.Signature != null) {
            MaterialCardView materialCardView = this.ad;
            if (materialCardView.getUseCompatPadding()) {
                i3 = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (startapp() ? ad() : 0.0f)) * 2.0f);
                i4 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (startapp() ? ad() : 0.0f)) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i7 = this.billing;
            int i8 = (i7 & 8388613) == 8388613 ? ((i - this.appmetrica) - this.purchase) - i4 : this.appmetrica;
            int i9 = (i7 & 80) == 80 ? this.appmetrica : ((i2 - this.appmetrica) - this.purchase) - i3;
            int i10 = (i7 & 8388613) == 8388613 ? this.appmetrica : ((i - this.appmetrica) - this.purchase) - i4;
            int i11 = (i7 & 80) == 80 ? ((i2 - this.appmetrica) - this.purchase) - i3 : this.appmetrica;
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            if (materialCardView.getLayoutDirection() == 1) {
                i6 = i10;
                i5 = i8;
            } else {
                i5 = i10;
                i6 = i8;
            }
            this.Signature.setLayerInset(2, i6, i11, i5, i9);
        }
    }

    public final void billing(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.adcel = mutate;
            mutate.setTintList(this.advert);
            purchase(this.ad.f834e, false);
        } else {
            this.adcel = applovin;
        }
        LayerDrawable layerDrawable = this.Signature;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.adcel);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.InsetDrawable, eؘْ۟] */
    public final C5618e license(Drawable drawable) {
        int i;
        int i2;
        if (this.ad.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (startapp() ? ad() : 0.0f));
            i = (int) Math.ceil(r0.getMaxCardElevation() + (startapp() ? ad() : 0.0f));
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new InsetDrawable(drawable, i, i2, i, i2);
    }

    public final LayerDrawable metrica() {
        if (this.loadAd == null) {
            int[] iArr = AbstractC16058e.ad;
            this.admob = new C11252e(this.smaato);
            this.loadAd = new RippleDrawable(this.mopub, null, this.admob);
        }
        if (this.Signature == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.loadAd, this.license, this.adcel});
            this.Signature = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.Signature;
    }

    public final void mopub() {
        Drawable drawable = this.startapp;
        Drawable metrica = adcel() ? metrica() : this.license;
        this.startapp = metrica;
        if (drawable != metrica) {
            MaterialCardView materialCardView = this.ad;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(metrica);
            } else {
                materialCardView.setForeground(license(metrica));
            }
        }
    }

    public final void purchase(boolean z, boolean z2) {
        Drawable drawable = this.adcel;
        if (drawable != null) {
            if (!z2) {
                drawable.setAlpha(z ? 255 : 0);
                this.inmobi = z ? 1.0f : 0.0f;
                return;
            }
            float f = z ? 1.0f : 0.0f;
            float f2 = z ? 1.0f - this.inmobi : this.inmobi;
            ValueAnimator valueAnimator = this.pro;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.pro = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.inmobi, f);
            this.pro = ofFloat;
            ofFloat.addUpdateListener(new C1498e(3, this));
            this.pro.setInterpolator(this.signatures);
            this.pro.setDuration((z ? this.tapsense : this.isVip) * f2);
            this.pro.start();
        }
    }

    public final void smaato() {
        boolean z = this.subscription;
        MaterialCardView materialCardView = this.ad;
        if (!z) {
            materialCardView.setBackgroundInternal(license(this.metrica));
        }
        materialCardView.setForeground(license(this.startapp));
    }

    public final boolean startapp() {
        MaterialCardView materialCardView = this.ad;
        if (!materialCardView.getPreventCornerOverlap()) {
            return false;
        }
        C11252e c11252e = this.metrica;
        return c11252e.f22618e.ad.license(c11252e.billing()) && materialCardView.getUseCompatPadding();
    }

    public final void yandex(C15339e c15339e) {
        this.smaato = c15339e;
        C11252e c11252e = this.metrica;
        c11252e.setShapeAppearanceModel(c15339e);
        c11252e.f22616e = !c11252e.f22618e.ad.license(c11252e.billing());
        C11252e c11252e2 = this.license;
        if (c11252e2 != null) {
            c11252e2.setShapeAppearanceModel(c15339e);
        }
        C11252e c11252e3 = this.admob;
        if (c11252e3 != null) {
            c11252e3.setShapeAppearanceModel(c15339e);
        }
    }
}
