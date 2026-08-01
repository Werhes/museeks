package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.common.util.concurrent.ListenableFuture;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۙؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17974e implements InterfaceC18087e, InterfaceC0569e, InterfaceC18242e, InterfaceC13363e, InterfaceC7961e, InterfaceC2295e, InterfaceC14187e, InterfaceC12646e, InterfaceC3934e, InterfaceC9452e, InterfaceC2556e, InterfaceC17064e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final int[] f35231e = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static C17974e f35232e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f35233e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35234e;

    public C17974e(int i) {
        this.f35234e = i;
        switch (i) {
            case 4:
                this.f35233e = new AudioAttributes.Builder();
                return;
            case 6:
                this.f35233e = C4069e.license();
                return;
            case 8:
                this.f35233e = new HashSet();
                return;
            case 14:
                this.f35233e = AbstractC17475e.Signature();
                return;
            case 16:
                this.f35233e = (ExtraCroppingQuirk) AbstractC16338e.ad(ExtraCroppingQuirk.class);
                return;
            case 20:
                this.f35233e = new Object();
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f35233e = new Object();
                new Handler(Looper.getMainLooper(), new C14369e(0, this));
                return;
            default:
                this.f35233e = new C16722e(5);
                return;
        }
    }

    public /* synthetic */ C17974e(int i, Object obj) {
        this.f35234e = i;
        this.f35233e = obj;
    }

    public /* synthetic */ C17974e(int i, boolean z) {
        this.f35234e = i;
    }

    public C17974e(Context context, ComponentName componentName, C12894e c12894e, Bundle bundle) {
        this.f35234e = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f35233e = new C13265e(context, componentName, c12894e, bundle);
        } else {
            this.f35233e = new C13265e(context, componentName, c12894e, bundle);
        }
    }

    public C17974e(MediaInfo mediaInfo) {
        this.f35234e = 17;
        C12481e c12481e = new C12481e(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.f35233e = c12481e;
    }

    public C17974e(C5298e c5298e) {
        this.f35234e = 1;
        C16722e c16722e = new C16722e(5);
        this.f35233e = c16722e;
        c16722e.metrica(c5298e.ad);
    }

    public C17974e(ThreadFactoryC8551e threadFactoryC8551e) {
        this.f35234e = 26;
        this.f35233e = new ThreadPoolExecutor(0, Alert.DURATION_SHOW_INDEFINITELY, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC8551e);
    }

    public C17974e(C11226e c11226e, byte[][] bArr) {
        this.f35234e = 29;
        if (c11226e == null) {
            throw new NullPointerException("params == null");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                throw new NullPointerException("publicKey byte array == null");
            }
        }
        if (bArr.length != c11226e.license) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr3 : bArr) {
            if (bArr3.length != c11226e.vip) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.f35233e = AbstractC16947e.appmetrica(bArr);
    }

    public C17974e(JSONObject jSONObject) {
        this.f35234e = 17;
        this.f35233e = new C12481e(jSONObject);
    }

    public static C17974e applovin(int i) {
        return new C17974e(23, C15768e.ad(AbstractC10461e.ad(i)));
    }

    public InterfaceC16132e Signature() {
        C5188e ad = C5188e.ad();
        if (ad.metrica() == 1) {
            return new C4989e(true);
        }
        C0576e startapp = AbstractC14533e.startapp(Boolean.FALSE);
        ad.yandex(new C7158e(startapp, this));
        return startapp;
    }

    @Override // defpackage.InterfaceC18087e
    public boolean ad(MenuC8939e menuC8939e, MenuItem menuItem) {
        InterfaceC14470e interfaceC14470e = ((ActionMenuView) this.f35233e).f155e;
        return interfaceC14470e != null && interfaceC14470e.onMenuItemClick(menuItem);
    }

    @Override // defpackage.InterfaceC2556e
    public FileChannel adcel() {
        return new FileInputStream((File) this.f35233e).getChannel();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Integer[] admob() {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to get output formats from StreamConfigurationMap"
            java.lang.String r1 = "StreamConfigurationMapCompatBaseImpl"
            r2 = 0
            java.lang.Object r3 = r5.f35233e     // Catch: java.lang.IllegalArgumentException -> L10 java.lang.NullPointerException -> L12
            android.hardware.camera2.params.StreamConfigurationMap r3 = (android.hardware.camera2.params.StreamConfigurationMap) r3     // Catch: java.lang.IllegalArgumentException -> L10 java.lang.NullPointerException -> L12
            if (r3 == 0) goto L17
            int[] r0 = r3.getOutputFormats()     // Catch: java.lang.IllegalArgumentException -> L10 java.lang.NullPointerException -> L12
            goto L1d
        L10:
            r3 = move-exception
            goto L14
        L12:
            r3 = move-exception
            goto L19
        L14:
            defpackage.AbstractC9464e.pro(r1, r0, r3)
        L17:
            r0 = r2
            goto L1d
        L19:
            defpackage.AbstractC9464e.pro(r1, r0, r3)
            goto L17
        L1d:
            if (r0 == 0) goto L31
            int r1 = r0.length
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            int r1 = r0.length
            r3 = 0
        L24:
            if (r3 >= r1) goto L31
            r4 = r0[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L24
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17974e.admob():java.lang.Integer[]");
    }

    public void ads(int i, boolean z) {
        C16722e c16722e = (C16722e) this.f35233e;
        if (!z) {
            c16722e.getClass();
        } else {
            AbstractC2301e.subscription(!c16722e.f32781e);
            ((SparseBooleanArray) c16722e.f32780e).delete(i);
        }
    }

    @Override // defpackage.InterfaceC18087e
    public void advert(MenuC8939e menuC8939e) {
        C16089e c16089e = ((ActionMenuView) this.f35233e).f151e;
        if (c16089e != null) {
            c16089e.advert(menuC8939e);
        }
    }

    public InterfaceC3055e amazon(InterfaceC7227e interfaceC7227e) {
        InterfaceC3055e interfaceC3055e = (InterfaceC3055e) ((C14918e) this.f35233e).appmetrica.get(interfaceC7227e);
        if (interfaceC3055e != null) {
            return interfaceC3055e;
        }
        throw new IllegalStateException((interfaceC7227e + " not part of this configuration schema").toString());
    }

    @Override // defpackage.InterfaceC7961e, defpackage.InterfaceC9650e
    public ListenableFuture apply(Object obj) {
        return AbstractC15792e.mopub(((InterfaceC9650e) this.f35233e).apply(obj));
    }

    @Override // defpackage.InterfaceC17064e
    public C7431e appmetrica(int i) {
        List list = (List) ((SparseArray) this.f35233e).get(i);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "Cannot find the wrapper for global view type "));
        }
        return (C7431e) list.get(0);
    }

    @Override // defpackage.InterfaceC13363e
    public int billing() {
        return ((ExtendedFloatingActionButton) this.f35233e).getCollapsedPadding();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.InterfaceC0569e
    /* renamed from: extends */
    public C12948e mo378extends(View view, C12948e c12948e) {
        int i;
        int i2;
        int i3;
        int i4;
        int license = c12948e.license();
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) this.f35233e;
        Context context = layoutInflaterFactory2C8158e.f16587e;
        int license2 = c12948e.license();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C8158e.f16589e;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i2 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C8158e.f16589e.getLayoutParams();
            if (layoutInflaterFactory2C8158e.f16589e.isShown()) {
                if (layoutInflaterFactory2C8158e.f16586e == null) {
                    layoutInflaterFactory2C8158e.f16586e = new Rect();
                    layoutInflaterFactory2C8158e.f16572e = new Rect();
                }
                Rect rect = layoutInflaterFactory2C8158e.f16586e;
                Rect rect2 = layoutInflaterFactory2C8158e.f16572e;
                rect.set(c12948e.vip(), c12948e.license(), c12948e.metrica(), c12948e.ad());
                ViewGroup viewGroup = layoutInflaterFactory2C8158e.f16585e;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z = AbstractC14039e.ad;
                    AbstractC7395e.ad(viewGroup, rect, rect2);
                    i3 = 0;
                } else {
                    if (AbstractC14039e.ad) {
                        i3 = 0;
                    } else {
                        AbstractC14039e.ad = true;
                        i3 = 0;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC14039e.vip = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC14039e.vip.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = AbstractC14039e.vip;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[i3] = rect;
                            objArr[1] = rect2;
                            method.invoke(viewGroup, objArr);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i5 = rect.top;
                int i6 = rect.left;
                int i7 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C8158e.f16585e;
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                C12948e ad = AbstractC9726e.ad(viewGroup2);
                int vip = ad == null ? i3 : ad.vip();
                int metrica = ad == null ? i3 : ad.metrica();
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    i4 = i3;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    i4 = 1;
                }
                if (i5 <= 0 || layoutInflaterFactory2C8158e.f16583e != null) {
                    View view2 = layoutInflaterFactory2C8158e.f16583e;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (i8 != i9 || marginLayoutParams2.leftMargin != vip || marginLayoutParams2.rightMargin != metrica) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = vip;
                            marginLayoutParams2.rightMargin = metrica;
                            layoutInflaterFactory2C8158e.f16583e.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C8158e.f16583e = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = vip;
                    layoutParams.rightMargin = metrica;
                    layoutInflaterFactory2C8158e.f16585e.addView(layoutInflaterFactory2C8158e.f16583e, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C8158e.f16583e;
                r9 = view4 == null ? i3 : 1;
                if (r9 != 0 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C8158e.f16583e;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C8158e.f16591e && r9 != 0) {
                    license2 = i3;
                }
                i2 = r9;
                i = i3;
                r9 = i4;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    i2 = 0;
                } else {
                    i2 = 0;
                    r9 = 0;
                }
            }
            if (r9 != 0) {
                layoutInflaterFactory2C8158e.f16589e.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C8158e.f16583e;
        if (view6 != null) {
            view6.setVisibility(i2 != 0 ? i : 8);
        }
        return AbstractC2016e.adcel(view, license != license2 ? c12948e.purchase(c12948e.vip(), license2, c12948e.metrica(), c12948e.ad()) : c12948e);
    }

    @Override // defpackage.InterfaceC13363e
    public int getWidth() {
        return ((ExtendedFloatingActionButton) this.f35233e).getCollapsedSize();
    }

    @Override // defpackage.InterfaceC13363e
    /* renamed from: goto */
    public ViewGroup.LayoutParams mo817goto() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f35233e;
        return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
    }

    @Override // defpackage.InterfaceC14187e
    public void inmobi(IOException iOException) {
        C13578e c13578e = (C13578e) this.f35233e;
        if (c13578e.ads()) {
            return;
        }
        c13578e.billing(new C12763e(iOException));
    }

    public void isPro() {
        synchronized (this.f35233e) {
        }
    }

    @Override // defpackage.InterfaceC18242e
    public InterfaceC13659e isVip() {
        throw null;
    }

    @Override // defpackage.InterfaceC2295e
    public void license(Object obj) {
        switch (this.f35234e) {
            case 15:
                return;
            default:
                AbstractC9464e.yandex("Recorder", "Encodings end successfully.");
                throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
    }

    public InterfaceC10518e loadAd(InterfaceC7227e interfaceC7227e) {
        C12232e c12232e = AbstractC3820e.ad;
        if (interfaceC7227e.equals(c12232e.vip(InterfaceC16120e.class))) {
            return new C13861e();
        }
        if (!interfaceC7227e.equals(c12232e.vip(DynamicMutableRealmObject.class)) && !interfaceC7227e.equals(c12232e.vip(C16740e.class))) {
            return (InterfaceC10518e) amazon(interfaceC7227e).purchase();
        }
        return new C14021e();
    }

    @Override // defpackage.InterfaceC9452e
    public Object metrica(C11506e c11506e) {
        return ((Function1) this.f35233e).invoke(c11506e);
    }

    public C12481e mopub() {
        C12481e c12481e = (C12481e) this.f35233e;
        if (c12481e.f24986e == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(c12481e.f24984e) && c12481e.f24984e < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(c12481e.f24980e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(c12481e.f24988e) || c12481e.f24988e < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return c12481e;
    }

    @Override // defpackage.InterfaceC13363e
    /* renamed from: new */
    public int mo820new() {
        return ((ExtendedFloatingActionButton) this.f35233e).getCollapsedPadding();
    }

    public C17974e premium() {
        ((AudioAttributes.Builder) this.f35233e).setUsage(1);
        return this;
    }

    @Override // defpackage.InterfaceC3934e
    public C17985e pro(C17985e c17985e, float f, C7695e c7695e) {
        ((C2366e) this.f35233e).pro(c17985e, f, c7695e);
        return c17985e;
    }

    @Override // defpackage.InterfaceC17064e
    public InterfaceC7429e purchase(C7431e c7431e) {
        return new C10312e(this, c7431e, false, 26);
    }

    public long remoteconfig(int i, Size size) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f35233e;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(i, size);
        }
        return 0L;
    }

    public Size[] signatures(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f35233e;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(i);
        }
        return null;
    }

    public AudioAttributesImpl smaato() {
        return new AudioAttributesImplApi21(((AudioAttributes.Builder) this.f35233e).build(), 0);
    }

    public void startapp(int i, boolean z) {
        C16722e c16722e = (C16722e) this.f35233e;
        if (z) {
            c16722e.ad(i);
        } else {
            c16722e.getClass();
        }
    }

    public /* bridge */ C17974e subs() {
        return premium();
    }

    @Override // defpackage.InterfaceC14187e
    public void subscription(C4602e c4602e, C11058e c11058e) {
        ((C13578e) this.f35233e).billing(c11058e);
    }

    public boolean tapsense() {
        Object[] objArr = ((C0353e) this.f35233e).ad;
        if (objArr.length - 1 < 3) {
            throw new IllegalStateException("idx 3 size mismatch".toString());
        }
        Object obj = objArr[3];
        if (obj == null) {
            throw new IllegalStateException("idx 3 is empty".toString());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IllegalStateException("idx 3 type mismatch".toString());
    }

    @Override // defpackage.InterfaceC13363e
    public int vip() {
        return ((ExtendedFloatingActionButton) this.f35233e).getCollapsedSize();
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        ListenableFuture listenableFuture;
        switch (this.f35234e) {
            case 15:
                C5306e c5306e = (C5306e) this.f35233e;
                RunnableC2783e runnableC2783e = new RunnableC2783e(14, c5306e);
                if (AbstractC13062e.purchase()) {
                    runnableC2783e.run();
                } else {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    AbstractC4265e.yandex("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new RunnableC11247e(runnableC2783e, countDownLatch, 11)));
                    try {
                        if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                            throw new IllegalStateException("Timeout to wait main thread execution");
                        }
                    } catch (InterruptedException e) {
                        throw new C14803e(e, 6);
                    }
                }
                C13945e c13945e = (C13945e) c5306e.f11404e;
                if (c13945e != null) {
                    AbstractC13480e.m3593new(c13945e.amazon.amazon, new C0609e(21, c5306e));
                    listenableFuture = ((C13945e) c5306e.f11404e).license();
                } else {
                    listenableFuture = C4065e.f9036e;
                }
                synchronized (c5306e.f11399e) {
                    c5306e.f11402e = null;
                    c5306e.f11405e = listenableFuture;
                    ((HashMap) c5306e.f11400e).clear();
                    ((HashSet) c5306e.f11398e).clear();
                    Unit unit = Unit.INSTANCE;
                }
                c5306e.subscription(null, null);
                return;
            default:
                C13343e c13343e = (C13343e) this.f35233e;
                c13343e.getClass();
                AbstractC4265e.yandex("In-progress recording shouldn't be null", false);
                c13343e.getClass();
                throw null;
        }
    }
}
