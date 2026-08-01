package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۦۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8356e extends FrameLayout {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f17095e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C17940e f17096e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public MotionEvent f17097e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2690e f17098e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C11296e f17099e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final ViewOnLayoutChangeListenerC13472e f17100e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public AbstractC13757e f17101e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C7850e f17102e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public AbstractC16666e f17103e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public InterfaceC12424e f17104e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C4519e f17105e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C2884e f17106e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public EnumC7617e f17107e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final AtomicReference f17108e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C1326e f17109e;

    /* JADX WARN: Type inference failed for: r10v11, types: [eؔٚ٘, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eٍ۟ۤ, eؒۛ٘] */
    /* JADX WARN: Type inference failed for: r7v0, types: [eؖۧؒ, java.lang.Object] */
    public C8356e(Context context) {
        super(context, null, 0, 0);
        this.f17107e = EnumC7617e.PERFORMANCE;
        ?? obj = new Object();
        obj.yandex = EnumC11915e.FILL_CENTER;
        this.f17105e = obj;
        this.f17095e = true;
        this.f17109e = new AbstractC9790e(EnumC4033e.f8970e);
        this.f17108e = new AtomicReference();
        this.f17106e = new C2884e(obj);
        this.f17096e = new C17940e(1, this);
        this.f17100e = new ViewOnLayoutChangeListenerC13472e(2, this);
        this.f17102e = new C7850e(19, this);
        AbstractC13062e.metrica();
        Resources.Theme theme = context.getTheme();
        int[] iArr = AbstractC10431e.ad;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
        AbstractC2016e.amazon(this, context, iArr, null, obtainStyledAttributes, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(1, ((EnumC11915e) obj.yandex).f23864e);
            for (EnumC11915e enumC11915e : EnumC11915e.values()) {
                if (enumC11915e.f23864e == integer) {
                    setScaleType(enumC11915e);
                    int integer2 = obtainStyledAttributes.getInteger(0, 0);
                    for (EnumC7617e enumC7617e : EnumC7617e.values()) {
                        if (enumC7617e.f15488e == integer2) {
                            setImplementationMode(enumC7617e);
                            obtainStyledAttributes.recycle();
                            this.f17099e = new C11296e(context, new C2007e(2, this));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            ?? view = new View(context, null, 0, 0);
                            view.setBackgroundColor(-1);
                            view.setAlpha(0.0f);
                            view.setElevation(Float.MAX_VALUE);
                            this.f17098e = view;
                            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private InterfaceC14003e getScreenFlashInternal() {
        return this.f17098e.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    public static boolean metrica(C6122e c6122e, EnumC7617e enumC7617e) {
        boolean equals = c6122e.appmetrica.subscription().pro().equals("androidx.camera.camera2.legacy");
        boolean z = (AbstractC10970e.ad.vip(SurfaceViewStretchedQuirk.class) == null && AbstractC10970e.ad.vip(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT > 24 && !equals && !z) {
            int ordinal = enumC7617e.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal != 1) {
                throw new IllegalArgumentException("Invalid implementation mode: " + enumC7617e);
            }
        }
        return true;
    }

    private void setScreenFlashUiInfo(InterfaceC14003e interfaceC14003e) {
        AbstractC16666e abstractC16666e = this.f17103e;
        if (abstractC16666e == null) {
            AbstractC9464e.yandex("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
            return;
        }
        EnumC6335e enumC6335e = EnumC6335e.f13178e;
        C5783e c5783e = new C5783e(enumC6335e, interfaceC14003e);
        C5783e yandex = abstractC16666e.yandex();
        abstractC16666e.crashlytics.put(enumC6335e, c5783e);
        C5783e yandex2 = abstractC16666e.yandex();
        if (yandex2 == null || yandex2.equals(yandex)) {
            return;
        }
        abstractC16666e.Signature();
    }

    public final void ad(boolean z) {
        AbstractC13062e.metrica();
        C3936e viewPort = getViewPort();
        if (this.f17103e == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.f17103e.ad(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e) {
            if (!z) {
                throw e;
            }
            AbstractC9464e.mopub("PreviewView", e.toString(), e);
        }
    }

    public Bitmap getBitmap() {
        AbstractC13062e.metrica();
        AbstractC13757e abstractC13757e = this.f17101e;
        if (abstractC13757e == null) {
            return null;
        }
        FrameLayout frameLayout = abstractC13757e.vip;
        Bitmap vip = abstractC13757e.vip();
        if (vip == null) {
            return null;
        }
        C4519e c4519e = abstractC13757e.metrica;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!c4519e.yandex()) {
            return vip;
        }
        Matrix purchase = c4519e.purchase();
        RectF billing = c4519e.billing(layoutDirection, size);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), vip.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(purchase);
        matrix.postScale(billing.width() / ((Size) c4519e.appmetrica).getWidth(), billing.height() / ((Size) c4519e.appmetrica).getHeight());
        matrix.postTranslate(billing.left, billing.top);
        canvas.drawBitmap(vip, matrix, new Paint(7));
        return createBitmap;
    }

    public AbstractC16666e getController() {
        AbstractC13062e.metrica();
        return this.f17103e;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public EnumC7617e getImplementationMode() {
        AbstractC13062e.metrica();
        return this.f17107e;
    }

    public AbstractC13830e getMeteringPointFactory() {
        AbstractC13062e.metrica();
        return this.f17106e;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [eؘٕ٘, java.lang.Object] */
    public C5696e getOutputTransform() {
        Matrix matrix;
        C4519e c4519e = this.f17105e;
        AbstractC13062e.metrica();
        try {
            matrix = c4519e.appmetrica(getLayoutDirection(), new Size(getWidth(), getHeight()));
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = (Rect) c4519e.purchase;
        if (matrix == null || rect == null) {
            AbstractC9464e.yandex("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = AbstractC8261e.ad;
        RectF rectF2 = new RectF(rect);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(AbstractC8261e.ad, rectF2, Matrix.ScaleToFit.FILL);
        matrix.preConcat(matrix2);
        if (this.f17101e instanceof C0748e) {
            matrix.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            AbstractC9464e.remoteconfig("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new Object();
    }

    public AbstractC9790e getPreviewStreamState() {
        return this.f17109e;
    }

    public EnumC11915e getScaleType() {
        AbstractC13062e.metrica();
        return (EnumC11915e) this.f17105e.yandex;
    }

    public InterfaceC14003e getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        AbstractC13062e.metrica();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        C4519e c4519e = this.f17105e;
        if (!c4519e.yandex()) {
            return null;
        }
        Matrix matrix = new Matrix((Matrix) c4519e.billing);
        matrix.postConcat(c4519e.appmetrica(layoutDirection, size));
        return matrix;
    }

    public InterfaceC13777e getSurfaceProvider() {
        AbstractC13062e.metrica();
        return this.f17102e;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, eؙؖؑ] */
    public C3936e getViewPort() {
        AbstractC13062e.metrica();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        int rotation = defaultDisplay.getRotation();
        AbstractC13062e.metrica();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        ?? obj = new Object();
        obj.ad = viewPortScaleType;
        obj.vip = rational;
        obj.metrica = rotation;
        obj.license = layoutDirection;
        return obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        DisplayManager displayManager;
        super.onAttachedToWindow();
        if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
            displayManager.registerDisplayListener(this.f17096e, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f17100e);
        AbstractC13757e abstractC13757e = this.f17101e;
        if (abstractC13757e != null) {
            abstractC13757e.metrica();
        }
        ad(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DisplayManager displayManager;
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f17100e);
        AbstractC13757e abstractC13757e = this.f17101e;
        if (abstractC13757e != null) {
            abstractC13757e.license();
        }
        AbstractC16666e abstractC16666e = this.f17103e;
        if (abstractC16666e != null) {
            abstractC16666e.vip();
        }
        if (isInEditMode() || (displayManager = getDisplayManager()) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f17096e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [eٔؐ۠, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [eٔؐ۠, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [eٔؐ۠, java.lang.Object] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f17103e == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = motionEvent.getPointerCount() == 1;
        boolean z2 = motionEvent.getAction() == 1;
        boolean z3 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (z && z2 && z3) {
            this.f17097e = motionEvent;
            performClick();
            return true;
        }
        C11296e c11296e = this.f17099e;
        int i = c11296e.ad;
        C2007e c2007e = c11296e.vip;
        motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (c11296e.metrica) {
            c11296e.advert.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z4 = (motionEvent.getButtonState() & 32) != 0;
        boolean z5 = c11296e.mopub == 2 && !z4;
        boolean z6 = actionMasked == 1 || actionMasked == 3 || z5;
        if (actionMasked == 0 || z6) {
            if (c11296e.billing) {
                c11296e.ad();
                c2007e.appmetrica(new Object());
                c11296e.billing = false;
                c11296e.yandex = 0.0f;
                c11296e.mopub = 0;
            } else if (c11296e.vip() && z6) {
                c11296e.billing = false;
                c11296e.yandex = 0.0f;
                c11296e.mopub = 0;
            }
            if (z6) {
                return true;
            }
        }
        if (!c11296e.billing && c11296e.license && !c11296e.vip() && !z6 && z4) {
            c11296e.startapp = motionEvent.getX();
            c11296e.adcel = motionEvent.getY();
            c11296e.mopub = 2;
            c11296e.yandex = 0.0f;
        }
        boolean z7 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z5;
        boolean z8 = actionMasked == 6;
        int actionIndex = z8 ? motionEvent.getActionIndex() : -1;
        int i2 = z8 ? pointerCount - 1 : pointerCount;
        if (c11296e.vip()) {
            f = c11296e.startapp;
            f2 = c11296e.adcel;
            c11296e.smaato = motionEvent.getY() < f2;
        } else {
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (actionIndex != i3) {
                    f3 = motionEvent.getX(i3) + f3;
                    f4 = motionEvent.getY(i3) + f4;
                }
            }
            float f5 = i2;
            f = f3 / f5;
            f2 = f4 / f5;
        }
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (actionIndex != i4) {
                float abs = Math.abs(motionEvent.getX(i4) - f) + f6;
                f7 = Math.abs(motionEvent.getY(i4) - f2) + f7;
                f6 = abs;
            }
        }
        float f8 = i2;
        float f9 = f6 / f8;
        float f10 = f7 / f8;
        float f11 = 2;
        float f12 = f9 * f11;
        float f13 = f11 * f10;
        if (!c11296e.vip()) {
            f13 = (float) Math.hypot(f12, f13);
        }
        boolean z9 = c11296e.billing;
        AbstractC1561e.appmetrica(f);
        AbstractC1561e.appmetrica(f2);
        if (!c11296e.vip() && c11296e.billing && (f13 < 0 || z7)) {
            c11296e.ad();
            c2007e.appmetrica(new Object());
            c11296e.billing = false;
            c11296e.yandex = f13;
        }
        if (z7) {
            c11296e.appmetrica = f13;
            c11296e.purchase = f13;
            c11296e.yandex = f13;
        }
        int i5 = c11296e.vip() ? i : 0;
        if (!c11296e.billing && f13 >= i5 && (z9 || Math.abs(f13 - c11296e.yandex) > i)) {
            c11296e.appmetrica = f13;
            c11296e.purchase = f13;
            c2007e.appmetrica(new Object());
            c11296e.billing = true;
        }
        if (actionMasked != 2) {
            return true;
        }
        c11296e.appmetrica = f13;
        if (c11296e.billing) {
            c2007e.appmetrica(new C15746e(c11296e.ad()));
        }
        c11296e.purchase = c11296e.appmetrica;
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f17103e != null) {
            MotionEvent motionEvent = this.f17097e;
            float x = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.f17097e;
            float y = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            AbstractC16666e abstractC16666e = this.f17103e;
            C1326e c1326e = abstractC16666e.isPro;
            long j = abstractC16666e.firebase;
            if (!abstractC16666e.adcel()) {
                AbstractC9464e.remoteconfig("CameraController", "Use cases not attached to camera.");
            } else if (abstractC16666e.signatures) {
                PointF pointF = new PointF(x, y);
                float f = pointF.x;
                float f2 = pointF.y;
                C2884e c2884e = this.f17106e;
                C15099e ad = c2884e.ad(f, f2, 0.16666667f);
                C15099e ad2 = c2884e.ad(pointF.x, pointF.y, 0.25f);
                C16389e c16389e = new C16389e(ad);
                c16389e.ad(ad2, 2);
                if (j > 0) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    AbstractC4265e.license(j >= 1, "autoCancelDuration must be at least 1");
                    c16389e.f32196e = timeUnit.toMillis(j);
                } else {
                    c16389e.f32196e = 0L;
                }
                C16389e c16389e2 = new C16389e(c16389e);
                AbstractC9464e.yandex("CameraController", "Tap to focus started: " + x + ", " + y);
                C12309e c12309e = abstractC16666e.tapsense;
                if (c12309e != null) {
                    c12309e.close();
                }
                c1326e.adcel(new C16360e(1));
                C12309e c12309e2 = new C12309e(pointF, c1326e);
                abstractC16666e.tapsense = c12309e2;
                ListenableFuture startapp = ((C0200e) abstractC16666e.smaato.appmetrica()).metrica.startapp(c16389e2);
                startapp.ad(new RunnableC17144e(startapp, c12309e2, 0), AbstractC3062e.billing());
                long millis = TimeUnit.NANOSECONDS.toMillis(j);
                AbstractC9464e.yandex("CameraController", "Tap to focus auto cancel duration: " + millis + " ms");
                if (millis > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC17584e(13, c12309e2), millis);
                }
            } else {
                AbstractC9464e.yandex("CameraController", "Tap to focus disabled. ");
            }
        }
        this.f17097e = null;
        return super.performClick();
    }

    public void setController(AbstractC16666e abstractC16666e) {
        AbstractC13062e.metrica();
        AbstractC16666e abstractC16666e2 = this.f17103e;
        if (abstractC16666e2 != null && abstractC16666e2 != abstractC16666e) {
            abstractC16666e2.vip();
            setScreenFlashUiInfo(null);
        }
        this.f17103e = abstractC16666e;
        ad(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(EnumC7617e enumC7617e) {
        AbstractC13062e.metrica();
        this.f17107e = enumC7617e;
    }

    public void setScaleType(EnumC11915e enumC11915e) {
        AbstractC13062e.metrica();
        this.f17105e.yandex = enumC11915e;
        vip();
        ad(false);
    }

    public void setScreenFlashOverlayColor(int i) {
        this.f17098e.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        AbstractC13062e.metrica();
        this.f17098e.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public final void vip() {
        Rect rect;
        Display defaultDisplay;
        InterfaceC12424e interfaceC12424e;
        AbstractC13062e.metrica();
        if (this.f17101e != null) {
            if (this.f17095e && (defaultDisplay = getDefaultDisplay()) != null && (interfaceC12424e = this.f17104e) != null) {
                C4519e c4519e = this.f17105e;
                int signatures = interfaceC12424e.signatures(defaultDisplay.getRotation());
                int rotation = defaultDisplay.getRotation();
                if (c4519e.license) {
                    c4519e.ad = signatures;
                    c4519e.vip = rotation;
                }
            }
            this.f17101e.purchase();
        }
        C2884e c2884e = this.f17106e;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        c2884e.getClass();
        AbstractC13062e.metrica();
        synchronized (c2884e) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = c2884e.metrica) != null) {
                    c2884e.license = c2884e.vip.metrica(size, layoutDirection, rect);
                }
                c2884e.license = null;
            } finally {
            }
        }
        AbstractC16666e abstractC16666e = this.f17103e;
        if (abstractC16666e != null) {
            Matrix sensorToViewTransform = getSensorToViewTransform();
            AbstractC13062e.metrica();
            C10697e c10697e = abstractC16666e.purchase;
            if (c10697e != null && c10697e.f21082e == 1) {
                if (sensorToViewTransform == null) {
                    c10697e.f21080e = null;
                } else {
                    c10697e.getClass();
                    c10697e.f21080e = new Matrix(sensorToViewTransform);
                }
            }
        }
    }
}
