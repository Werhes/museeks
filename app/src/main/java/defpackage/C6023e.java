package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6023e implements InterfaceC13619e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final PopupWindow f12681e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C5306e f12682e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Object f12683e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C9825e f12684e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f12685e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final Object f12686e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C13391e f12687e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final Object f12688e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Activity f12689e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f12690e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final PopupWindow f12691e;

    /* JADX WARN: Multi-variable type inference failed */
    public C6023e(Activity activity, C9825e c9825e) {
        AbstractC0003e vip;
        this.f12689e = activity;
        this.f12684e = c9825e;
        final int i = 0;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.balloon_layout_body, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) inflate;
        int i2 = R.id.balloon_arrow;
        ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.balloon_arrow);
        if (imageView != null) {
            i2 = R.id.balloon_card;
            RadiusLayout radiusLayout = (RadiusLayout) AbstractC7779e.vip(inflate, R.id.balloon_card);
            if (radiusLayout != null) {
                i2 = R.id.balloon_content;
                FrameLayout frameLayout2 = (FrameLayout) AbstractC7779e.vip(inflate, R.id.balloon_content);
                if (frameLayout2 != null) {
                    i2 = R.id.balloon_text;
                    VectorTextView vectorTextView = (VectorTextView) AbstractC7779e.vip(inflate, R.id.balloon_text);
                    if (vectorTextView != null) {
                        i2 = R.id.balloon_wrapper;
                        FrameLayout frameLayout3 = (FrameLayout) AbstractC7779e.vip(inflate, R.id.balloon_wrapper);
                        if (frameLayout3 != null) {
                            this.f12682e = new C5306e(frameLayout, frameLayout, imageView, radiusLayout, frameLayout2, vectorTextView, frameLayout3, 2);
                            View inflate2 = LayoutInflater.from(activity).inflate(R.layout.balloon_layout_overlay, (ViewGroup) null, false);
                            if (inflate2 == null) {
                                throw new NullPointerException("rootView");
                            }
                            BalloonAnchorOverlayView balloonAnchorOverlayView = (BalloonAnchorOverlayView) inflate2;
                            this.f12687e = new C13391e(balloonAnchorOverlayView, balloonAnchorOverlayView, 8);
                            PopupWindow popupWindow = new PopupWindow(frameLayout, -2, -2);
                            this.f12681e = popupWindow;
                            PopupWindow popupWindow2 = new PopupWindow(balloonAnchorOverlayView, -1, -1);
                            this.f12691e = popupWindow2;
                            this.f12688e = AbstractC18039e.appmetrica(3, new C14582e(7));
                            this.f12683e = AbstractC18039e.appmetrica(3, new C13665e(this, i));
                            this.f12686e = AbstractC18039e.appmetrica(3, new C13665e(this, 1));
                            float f = c9825e.isVip;
                            float f2 = c9825e.inmobi;
                            radiusLayout.setAlpha(f);
                            radiusLayout.setRadius(c9825e.subscription);
                            radiusLayout.setRadius(c9825e.subscription);
                            WeakHashMap weakHashMap = AbstractC2016e.ad;
                            radiusLayout.setElevation(f2);
                            radiusLayout.setDrawCustomShape(false);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(c9825e.admob);
                            gradientDrawable.setCornerRadius(c9825e.subscription);
                            radiusLayout.setBackground(gradientDrawable);
                            radiusLayout.setBackgroundTintList(null);
                            radiusLayout.setPadding(c9825e.appmetrica, c9825e.purchase, c9825e.billing, c9825e.yandex);
                            ((ViewGroup.MarginLayoutParams) frameLayout3.getLayoutParams()).setMargins(0, 0, 0, 0);
                            frameLayout3.setFocusable(false);
                            frameLayout3.setFocusableInTouchMode(false);
                            int i3 = Build.VERSION.SDK_INT;
                            if (i3 >= 26) {
                                frameLayout3.setDefaultFocusHighlightEnabled(false);
                            }
                            frameLayout.setFocusable(false);
                            frameLayout.setFocusableInTouchMode(false);
                            if (i3 >= 26) {
                                frameLayout.setDefaultFocusHighlightEnabled(false);
                            }
                            radiusLayout.setFocusable(false);
                            radiusLayout.setFocusableInTouchMode(false);
                            if (i3 >= 26) {
                                radiusLayout.setDefaultFocusHighlightEnabled(false);
                            }
                            popupWindow.setOutsideTouchable(true);
                            popupWindow.setFocusable(c9825e.f19392abstract);
                            popupWindow.setClippingEnabled(c9825e.f19394case);
                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                            popupWindow.setElevation(f2);
                            popupWindow.setAttachedInDecor(c9825e.f19401implements);
                            vectorTextView.getContext();
                            float f3 = 28;
                            AbstractC1561e.appmetrica(TypedValue.applyDimension(1, f3, Resources.getSystem().getDisplayMetrics()));
                            AbstractC1561e.appmetrica(TypedValue.applyDimension(1, f3, Resources.getSystem().getDisplayMetrics()));
                            AbstractC1561e.appmetrica(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
                            boolean z = c9825e.f19405protected;
                            C11227e c11227e = vectorTextView.drawableTextViewParams;
                            if (c11227e != null) {
                                c11227e.appmetrica = z;
                                AbstractC18275e.appmetrica(vectorTextView, c11227e);
                            }
                            vectorTextView.getContext();
                            String str = c9825e.remoteconfig;
                            float f4 = c9825e.signatures;
                            int i4 = c9825e.pro;
                            int i5 = c9825e.tapsense;
                            vectorTextView.setMovementMethod(null);
                            vectorTextView.setText(str);
                            vectorTextView.setTextSize(f4);
                            vectorTextView.setGravity(i5);
                            vectorTextView.setTextColor(i4);
                            vectorTextView.setIncludeFontPadding(true);
                            vectorTextView.setTypeface(vectorTextView.getTypeface(), 0);
                            adcel(vectorTextView, radiusLayout);
                            startapp();
                            if (c9825e.isPro) {
                                balloonAnchorOverlayView.setOverlayColor(c9825e.applovin);
                                balloonAnchorOverlayView.setOverlayPadding(c9825e.ads);
                                balloonAnchorOverlayView.setOverlayPosition(null);
                                balloonAnchorOverlayView.setBalloonOverlayShape(c9825e.premium);
                                balloonAnchorOverlayView.setOverlayPaddingColor(0);
                                balloonAnchorOverlayView.setOverlayPaddingShader(null);
                                popupWindow2.setClippingEnabled(false);
                            }
                            if (c9825e.f19402interface) {
                                final int i6 = 1;
                                frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: eٍؙؕ

                                    /* renamed from: eؘٙؓ, reason: contains not printable characters */
                                    public final /* synthetic */ C6023e f13112e;

                                    {
                                        this.f13112e = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i6) {
                                            case 0:
                                                C6023e c6023e = this.f13112e;
                                                if (c6023e.f12684e.f19400goto) {
                                                    c6023e.metrica();
                                                    return;
                                                }
                                                return;
                                            default:
                                                C6023e c6023e2 = this.f13112e;
                                                if (c6023e2.f12684e.f19402interface) {
                                                    c6023e2.metrica();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                            }
                            final C2450e c2450e = c9825e.crashlytics;
                            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: eؓۚٞ
                                @Override // android.widget.PopupWindow.OnDismissListener
                                public final void onDismiss() {
                                    C6023e c6023e = C6023e.this;
                                    FrameLayout frameLayout4 = (FrameLayout) c6023e.f12682e.f11399e;
                                    Animation animation = frameLayout4.getAnimation();
                                    if (animation != null) {
                                        animation.cancel();
                                        animation.reset();
                                    }
                                    frameLayout4.clearAnimation();
                                    c6023e.metrica();
                                    C2450e c2450e2 = c2450e;
                                    if (c2450e2 != null) {
                                        c2450e2.f6258e.invoke();
                                    }
                                }
                            });
                            popupWindow.setTouchInterceptor(new ViewOnTouchListenerC9607e(i, this));
                            balloonAnchorOverlayView.setOnClickListener(new View.OnClickListener(this) { // from class: eٍؙؕ

                                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                                public final /* synthetic */ C6023e f13112e;

                                {
                                    this.f13112e = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i) {
                                        case 0:
                                            C6023e c6023e = this.f13112e;
                                            if (c6023e.f12684e.f19400goto) {
                                                c6023e.metrica();
                                                return;
                                            }
                                            return;
                                        default:
                                            C6023e c6023e2 = this.f13112e;
                                            if (c6023e2.f12684e.f19402interface) {
                                                c6023e2.metrica();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            ad(frameLayout);
                            InterfaceC16400e interfaceC16400e = c9825e.f19403native;
                            if (interfaceC16400e == null && (activity instanceof InterfaceC16400e)) {
                                InterfaceC16400e interfaceC16400e2 = (InterfaceC16400e) activity;
                                c9825e.f19403native = interfaceC16400e2;
                                interfaceC16400e2.vip().ad(this);
                                return;
                            } else {
                                if (interfaceC16400e == null || (vip = interfaceC16400e.vip()) == null) {
                                    return;
                                }
                                vip.ad(this);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public static void ad(ViewGroup viewGroup) {
        viewGroup.setFitsSystemWindows(false);
        C15926e admob = AbstractC3062e.admob(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(admob, 10));
        Iterator it = admob.iterator();
        while (true) {
            C3296e c3296e = (C3296e) it;
            if (!c3296e.f7452e) {
                break;
            } else {
                arrayList.add(viewGroup.getChildAt(c3296e.nextInt()));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            view.setFitsSystemWindows(false);
            if (view instanceof ViewGroup) {
                ad((ViewGroup) view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void adcel(android.widget.TextView r7, android.view.View r8) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6023e.adcel(android.widget.TextView, android.view.View):void");
    }

    public final float appmetrica(View view) {
        int i;
        C9825e c9825e = this.f12684e;
        boolean z = c9825e.f19397default;
        Rect rect = new Rect();
        Context context = view.getContext();
        if ((context instanceof Activity) && z) {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.top;
        } else {
            i = 0;
        }
        int i2 = AbstractC17110e.appmetrica((FrameLayout) this.f12682e.f11405e).y - i;
        int i3 = AbstractC17110e.appmetrica(view).y - i;
        float f = 0;
        float ad = (c9825e.ad() * c9825e.Signature) + f;
        float billing = ((billing() - ad) - f) - f;
        float ad2 = c9825e.ad() * 0.5f;
        int m2467class = AbstractC8703e.m2467class(c9825e.f19395catch);
        if (m2467class == 0) {
            return (((FrameLayout) r2.f11401e).getHeight() * c9825e.amazon) - ad2;
        }
        if (m2467class != 1) {
            throw new C14803e(10);
        }
        if (view.getHeight() + i3 >= i2) {
            if (billing() + i2 >= i3) {
                float height = (((view.getHeight() * c9825e.amazon) + i3) - i2) - ad2;
                if (height > c9825e.ad() * 2) {
                    if (height <= billing() - (c9825e.ad() * 2)) {
                        return height;
                    }
                }
            }
            return billing;
        }
        return ad;
    }

    public final int billing() {
        int i = this.f12684e.license;
        return i != Integer.MIN_VALUE ? i : ((FrameLayout) this.f12682e.f11400e).getMeasuredHeight();
    }

    public final float license(View view) {
        int i = AbstractC17110e.appmetrica((FrameLayout) this.f12682e.f11405e).x;
        int i2 = AbstractC17110e.appmetrica(view).x;
        C9825e c9825e = this.f12684e;
        float f = 0;
        float vip = (c9825e.vip() * c9825e.Signature) + f;
        float yandex = ((yandex() - vip) - f) - f;
        float vip2 = c9825e.vip() * 0.5f;
        int m2467class = AbstractC8703e.m2467class(c9825e.f19395catch);
        if (m2467class == 0) {
            return (((FrameLayout) r0.f11401e).getWidth() * c9825e.amazon) - vip2;
        }
        if (m2467class != 1) {
            throw new C14803e(10);
        }
        if (view.getWidth() + i2 >= i) {
            if (yandex() + i >= i2) {
                float f2 = i2;
                float f3 = i;
                float width = (((view.getWidth() * c9825e.amazon) + f2) - f3) - vip2;
                float width2 = ((view.getWidth() * c9825e.amazon) + f2) - vip2;
                if (width2 <= f3) {
                    return 0.0f;
                }
                if (width2 > f3 && view.getWidth() <= yandex()) {
                    return width2 - f3;
                }
                if (width > c9825e.vip() * 2) {
                    if (width <= yandex() - (c9825e.vip() * 2)) {
                        return width;
                    }
                }
            }
            return yandex;
        }
        return vip;
    }

    public final void metrica() {
        if (this.f12690e) {
            C13665e c13665e = new C13665e(this, 2);
            C9825e c9825e = this.f12684e;
            if (c9825e.f19407super != 4) {
                c13665e.invoke();
            } else {
                View contentView = this.f12681e.getContentView();
                contentView.post(new RunnableC15684e(contentView, c9825e.f19411while, c13665e));
            }
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void onDestroy(InterfaceC16400e interfaceC16400e) {
        AbstractC0003e vip;
        this.f12685e = true;
        this.f12691e.dismiss();
        this.f12681e.dismiss();
        InterfaceC16400e interfaceC16400e2 = this.f12684e.f19403native;
        if (interfaceC16400e2 == null || (vip = interfaceC16400e2.vip()) == null) {
            return;
        }
        vip.vip(this);
    }

    @Override // defpackage.InterfaceC13619e
    public final void onPause(InterfaceC16400e interfaceC16400e) {
        this.f12684e.getClass();
    }

    @Override // defpackage.InterfaceC13619e
    public final /* bridge */ void onResume(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final /* bridge */ void onStart(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final /* bridge */ void onStop(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final /* bridge */ void purchase() {
    }

    public final void startapp() {
        C9825e c9825e = this.f12684e;
        int i = (int) c9825e.inmobi;
        FrameLayout frameLayout = (FrameLayout) this.f12682e.f11405e;
        int ordinal = c9825e.loadAd.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            int ad = c9825e.ad() - 1;
            frameLayout.setPadding(i, ad, i, ad < i ? i : ad);
        } else {
            if (ordinal != 2 && ordinal != 3) {
                throw new C14803e(10);
            }
            int vip = c9825e.vip() - 1;
            frameLayout.setPadding(vip, i, vip, i);
        }
    }

    public final boolean vip(View view) {
        if (this.f12690e || this.f12685e || this.f12689e.isFinishing() || this.f12681e.getContentView().getParent() != null || !view.isAttachedToWindow()) {
            return false;
        }
        return view.getWindowToken().isBinderAlive();
    }

    public final int yandex() {
        int i = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        C9825e c9825e = this.f12684e;
        float f = c9825e.metrica;
        if (f != 0.0f) {
            return (int) (i * f);
        }
        c9825e.getClass();
        c9825e.getClass();
        int i2 = c9825e.ad;
        if (i2 == Integer.MIN_VALUE) {
            int measuredWidth = ((FrameLayout) this.f12682e.f11400e).getMeasuredWidth();
            c9825e.getClass();
            int metrica = AbstractC3062e.metrica(measuredWidth, 0, c9825e.vip);
            if (metrica <= i) {
                return metrica;
            }
        } else if (i2 <= i) {
            return i2;
        }
        return i;
    }
}
