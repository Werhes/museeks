package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.text.MeasuredText;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.ImageWriter;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.contentcapture.ContentCaptureSession;
import defpackage.C14967e;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14204e {
    public static void Signature(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    /* renamed from: abstract, reason: not valid java name */
    public static void m3766abstract(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }

    public static void ad(AudioAttributes.Builder builder, boolean z) {
        builder.setHapticChannelsMuted(z);
    }

    public static void adcel(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static int admob(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            C11445e c11445e = new C11445e();
            c11445e.amazon = AbstractC8542e.amazon("video/avc");
            C16975e c16975e = new C16975e(c11445e);
            String str = c16975e.loadAd;
            if (str != null) {
                List appmetrica = AbstractC7473e.appmetrica(str, z, false);
                String metrica = AbstractC7473e.metrica(c16975e);
                Iterable appmetrica2 = metrica == null ? C1410e.f4222e : AbstractC7473e.appmetrica(metrica, z, false);
                C13304e Signature = AbstractC17475e.Signature();
                Signature.license(appmetrica);
                Signature.license(appmetrica2);
                C1410e billing = Signature.billing();
                for (int i = 0; i < billing.f4224e; i++) {
                    if (((C10643e) billing.get(i)).license != null && (videoCapabilities = ((C10643e) billing.get(i)).license.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (C13415e.purchase(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (C1393e unused) {
        }
        return 0;
    }

    public static final ImageWriter ads(int i, Surface surface) {
        return ImageWriter.newInstance(surface, 1, i);
    }

    public static void advert(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static void amazon(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static final long applovin(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e) {
        return viewTreeObserverOnGlobalLayoutListenerC5014e.getUniqueDrawingId();
    }

    public static void appmetrica(Canvas canvas) {
        canvas.disableZ();
    }

    public static void billing(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    /* renamed from: break, reason: not valid java name */
    public static void m3767break(Service service, int i, Notification notification) {
        try {
            service.startForeground(i, notification, 2);
        } catch (RuntimeException e) {
            AbstractC2803e.purchase("Util", "The service must be declared with a foregroundServiceType that includes mediaPlayback");
            throw e;
        }
    }

    /* renamed from: case, reason: not valid java name */
    public static final ImageDecoder.Source m3768case(InterfaceC8910e interfaceC8910e, C6302e c6302e, boolean z) {
        C10675e mo2320continue;
        if (interfaceC8910e.getFileSystem() == AbstractC11062e.f21949e && (mo2320continue = interfaceC8910e.mo2320continue()) != null) {
            return ImageDecoder.createSource(mo2320continue.toFile());
        }
        AbstractC9110e smaato = interfaceC8910e.smaato();
        if (smaato instanceof C18282e) {
            return ImageDecoder.createSource(c6302e.ad.getAssets(), ((C18282e) smaato).adcel);
        }
        if ((smaato instanceof C17547e) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((C17547e) smaato).adcel;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new CallableC16976e(2, assetFileDescriptor));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (smaato instanceof C13940e) {
            C13940e c13940e = (C13940e) smaato;
            if (c13940e.adcel.equals(c6302e.ad.getPackageName())) {
                return ImageDecoder.createSource(c6302e.ad.getResources(), c13940e.mopub);
            }
        }
        if (!(smaato instanceof C11417e)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((C11417e) smaato).adcel.isDirect()) {
            return ImageDecoder.createSource(((C11417e) smaato).adcel);
        }
        return null;
    }

    /* renamed from: catch, reason: not valid java name */
    public static final PorterDuff.Mode m3769catch(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: class, reason: not valid java name */
    public static Insets m3770class(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static boolean crashlytics() {
        return Trace.isEnabled();
    }

    /* renamed from: default, reason: not valid java name */
    public static final BlendMode m3771default(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        if (i == 0) {
            return C0663e.vip();
        }
        if (i == 1) {
            return C0663e.adcel();
        }
        if (i == 2) {
            blendMode21 = BlendMode.DST;
            return blendMode21;
        }
        if (i == 3) {
            blendMode20 = BlendMode.SRC_OVER;
            return blendMode20;
        }
        if (i == 4) {
            blendMode19 = BlendMode.DST_OVER;
            return blendMode19;
        }
        if (i == 5) {
            blendMode18 = BlendMode.SRC_IN;
            return blendMode18;
        }
        if (i == 6) {
            blendMode17 = BlendMode.DST_IN;
            return blendMode17;
        }
        if (i == 7) {
            blendMode16 = BlendMode.SRC_OUT;
            return blendMode16;
        }
        if (i == 8) {
            blendMode15 = BlendMode.DST_OUT;
            return blendMode15;
        }
        if (i == 9) {
            blendMode14 = BlendMode.SRC_ATOP;
            return blendMode14;
        }
        if (i == 10) {
            blendMode13 = BlendMode.DST_ATOP;
            return blendMode13;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            blendMode12 = BlendMode.MODULATE;
            return blendMode12;
        }
        if (i == 14) {
            blendMode11 = BlendMode.SCREEN;
            return blendMode11;
        }
        if (i == 15) {
            blendMode10 = BlendMode.OVERLAY;
            return blendMode10;
        }
        if (i == 16) {
            blendMode9 = BlendMode.DARKEN;
            return blendMode9;
        }
        if (i == 17) {
            blendMode8 = BlendMode.LIGHTEN;
            return blendMode8;
        }
        if (i == 18) {
            blendMode7 = BlendMode.COLOR_DODGE;
            return blendMode7;
        }
        if (i == 19) {
            return C0663e.startapp();
        }
        if (i == 20) {
            return C0663e.mopub();
        }
        if (i == 21) {
            return C0663e.advert();
        }
        if (i == 22) {
            return C0663e.smaato();
        }
        if (i == 23) {
            return C0663e.amazon();
        }
        if (i == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    /* renamed from: extends, reason: not valid java name */
    public static void m3772extends(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    /* renamed from: final, reason: not valid java name */
    public static final void m3773final(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static boolean firebase(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return true;
                }
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    /* renamed from: goto, reason: not valid java name */
    public static final void m3774goto(Activity activity, C14967e.ad adVar) {
        activity.registerActivityLifecycleCallbacks(adVar);
    }

    /* renamed from: implements, reason: not valid java name */
    public static final BlendMode m3775implements(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        if (i == 0) {
            return C0663e.vip();
        }
        if (i == 27) {
            blendMode21 = BlendMode.COLOR;
            return blendMode21;
        }
        if (i == 19) {
            return C0663e.startapp();
        }
        if (i == 18) {
            blendMode20 = BlendMode.COLOR_DODGE;
            return blendMode20;
        }
        if (i == 16) {
            blendMode19 = BlendMode.DARKEN;
            return blendMode19;
        }
        if (i == 22) {
            return C0663e.smaato();
        }
        if (i == 2) {
            blendMode18 = BlendMode.DST;
            return blendMode18;
        }
        if (i == 10) {
            blendMode17 = BlendMode.DST_ATOP;
            return blendMode17;
        }
        if (i == 6) {
            blendMode16 = BlendMode.DST_IN;
            return blendMode16;
        }
        if (i == 8) {
            blendMode15 = BlendMode.DST_OUT;
            return blendMode15;
        }
        if (i == 4) {
            blendMode14 = BlendMode.DST_OVER;
            return blendMode14;
        }
        if (i == 23) {
            return C0663e.amazon();
        }
        if (i == 20) {
            return C0663e.mopub();
        }
        if (i == 25) {
            blendMode13 = BlendMode.HUE;
            return blendMode13;
        }
        if (i == 17) {
            blendMode12 = BlendMode.LIGHTEN;
            return blendMode12;
        }
        if (i == 28) {
            blendMode11 = BlendMode.LUMINOSITY;
            return blendMode11;
        }
        if (i == 13) {
            blendMode10 = BlendMode.MODULATE;
            return blendMode10;
        }
        if (i == 24) {
            blendMode9 = BlendMode.MULTIPLY;
            return blendMode9;
        }
        if (i == 15) {
            blendMode8 = BlendMode.OVERLAY;
            return blendMode8;
        }
        if (i == 26) {
            blendMode7 = BlendMode.SATURATION;
            return blendMode7;
        }
        if (i == 14) {
            blendMode6 = BlendMode.SCREEN;
            return blendMode6;
        }
        if (i == 21) {
            return C0663e.advert();
        }
        if (i == 1) {
            return C0663e.adcel();
        }
        if (i == 9) {
            blendMode5 = BlendMode.SRC_ATOP;
            return blendMode5;
        }
        if (i == 5) {
            blendMode4 = BlendMode.SRC_IN;
            return blendMode4;
        }
        if (i == 7) {
            blendMode3 = BlendMode.SRC_OUT;
            return blendMode3;
        }
        if (i == 3) {
            blendMode2 = BlendMode.SRC_OVER;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_IN;
        return blendMode;
    }

    public static final void inmobi(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }

    /* renamed from: interface, reason: not valid java name */
    public static void m3776interface(Resources.Theme theme) {
        theme.rebase();
    }

    public static float isPro(View view) {
        return view.getTransitionAlpha();
    }

    public static int isVip(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static void license(String str) {
        Trace.beginAsyncSection(str, 0);
    }

    public static void loadAd() {
        Trace.endAsyncSection("GlanceAppWidget::update", 0);
    }

    public static void metrica() {
        Trace.beginAsyncSection("GlanceAppWidget::update", 0);
    }

    public static void mopub(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    /* renamed from: native, reason: not valid java name */
    public static void m3777native(AudioAttributes.Builder builder, int i) {
        builder.setAllowedCapturePolicy(i);
    }

    /* renamed from: new, reason: not valid java name */
    public static void m3778new(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void premium(android.content.Context r8) {
        /*
            android.content.SharedPreferences r0 = defpackage.AbstractC9110e.purchase(r8)
            r1 = 0
            java.lang.String r2 = "proxy_notification_initialized"
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 == 0) goto Lf
            goto La2
        Lf:
            java.lang.String r0 = "firebase_messaging_notification_delegation_enabled"
            r1 = 1
            android.content.Context r3 = r8.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            if (r4 == 0) goto L39
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            if (r3 == 0) goto L39
            android.os.Bundle r4 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            if (r4 == 0) goto L39
            boolean r4 = r4.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            if (r4 == 0) goto L39
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            boolean r0 = r3.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            goto L3a
        L39:
            r0 = r1
        L3a:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            r5 = 0
            if (r3 < r4) goto L9f
            eؑۛٞ r3 = new eؑۛٞ
            r3.<init>()
            java.lang.String r4 = "error configuring notification delegate for package "
            int r6 = android.os.Binder.getCallingUid()     // Catch: java.lang.Throwable -> L72
            android.content.pm.ApplicationInfo r7 = r8.getApplicationInfo()     // Catch: java.lang.Throwable -> L72
            int r7 = r7.uid     // Catch: java.lang.Throwable -> L72
            if (r6 != r7) goto L85
            android.content.SharedPreferences r4 = defpackage.AbstractC9110e.purchase(r8)     // Catch: java.lang.Throwable -> L72
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L72
            r4.putBoolean(r2, r1)     // Catch: java.lang.Throwable -> L72
            r4.apply()     // Catch: java.lang.Throwable -> L72
            java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
            java.lang.Object r8 = r8.getSystemService(r1)     // Catch: java.lang.Throwable -> L72
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = "com.google.android.gms"
            if (r0 == 0) goto L74
            r8.setNotificationDelegate(r1)     // Catch: java.lang.Throwable -> L72
            goto L81
        L72:
            r8 = move-exception
            goto L9b
        L74:
            java.lang.String r0 = r8.getNotificationDelegate()     // Catch: java.lang.Throwable -> L72
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L81
            r8.setNotificationDelegate(r5)     // Catch: java.lang.Throwable -> L72
        L81:
            r3.loadAd(r5)
            goto La2
        L85:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Throwable -> L72
            r1.append(r8)     // Catch: java.lang.Throwable -> L72
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L72
            android.util.Log.e(r0, r8)     // Catch: java.lang.Throwable -> L72
            goto L81
        L9b:
            r3.loadAd(r5)
            throw r8
        L9f:
            defpackage.AbstractC1749e.appmetrica(r5)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC14204e.premium(android.content.Context):void");
    }

    public static C1410e pro(C3335e c3335e) {
        C13304e Signature = AbstractC17475e.Signature();
        AbstractC7014e it = C16717e.yandex.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (Build.VERSION.SDK_INT >= AbstractC9413e.pro(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), c3335e.metrica())) {
                Signature.metrica(num);
            }
        }
        Signature.metrica(2);
        return Signature.billing();
    }

    /* renamed from: protected, reason: not valid java name */
    public static void m3779protected(View view, float f) {
        view.setTransitionAlpha(f);
    }

    public static void purchase(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public static ContentCaptureSession remoteconfig(View view) {
        return view.getContentCaptureSession();
    }

    public static int signatures(int i, int i2, C3335e c3335e) {
        for (int i3 = 10; i3 > 0; i3--) {
            int signatures = AbstractC9413e.signatures(i3);
            if (signatures != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(signatures).build(), c3335e.metrica())) {
                return i3;
            }
        }
        return 0;
    }

    public static void smaato(Canvas canvas) {
        canvas.enableZ();
    }

    public static void startapp(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static boolean subs() {
        return Trace.isEnabled();
    }

    public static ColorStateList subscription(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    /* renamed from: super, reason: not valid java name */
    public static void m3780super(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static String tapsense(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: this, reason: not valid java name */
    public static void m3781this(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    /* renamed from: throw, reason: not valid java name */
    public static void m3782throw(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    /* renamed from: try, reason: not valid java name */
    public static void m3783try(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public static int vip(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (C13415e.purchase(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && AbstractC5032e.license == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 37) {
                    int admob = admob(true);
                    if (i5 < 35) {
                        AbstractC5032e.license = Boolean.valueOf(z);
                        if (z) {
                        }
                    } else {
                        AbstractC5032e.license = Boolean.valueOf(z);
                        if (z) {
                        }
                    }
                }
                z = false;
                AbstractC5032e.license = Boolean.valueOf(z);
                if (z) {
                }
            }
            return i3;
        }
        return 0;
    }

    /* renamed from: while, reason: not valid java name */
    public static void m3784while(int i, String str) {
        Trace.setCounter(str, i);
    }

    public static void yandex(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }
}
