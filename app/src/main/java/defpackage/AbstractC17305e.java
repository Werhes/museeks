package defpackage;

import android.R;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteAction;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.icu.text.DecimalFormatSymbols;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17305e {
    public static AudioManager ad;
    public static Boolean license;
    public static int metrica;
    public static String vip;

    public static final List Signature(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionKeys();
    }

    /* renamed from: abstract, reason: not valid java name */
    public static int m4276abstract(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static void ad(RemoteAction remoteAction) {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC5666e.m1955class(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static Handler adcel(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static List admob(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static int ads(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static final void advert(CameraDevice cameraDevice, SessionConfiguration sessionConfiguration) {
        cameraDevice.createCaptureSession(sessionConfiguration);
    }

    public static synchronized AudioManager amazon(Context context) {
        synchronized (AbstractC17305e.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    ad = null;
                }
                AudioManager audioManager = ad;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    C12594e c12594e = new C12594e();
                    AbstractC8461e.purchase().execute(new RunnableC16019e(applicationContext, c12594e, 6));
                    c12594e.vip();
                    AudioManager audioManager2 = ad;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                ad = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String applovin(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static void appmetrica(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static Typeface billing(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    /* renamed from: break, reason: not valid java name */
    public static byte m4277break(C0768e c0768e) {
        return Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(c0768e.ad).getDigitStrings()[0], 0));
    }

    /* renamed from: case, reason: not valid java name */
    public static int m4278case(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* renamed from: catch, reason: not valid java name */
    public static void m4279catch(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* renamed from: class, reason: not valid java name */
    public static int m4280class(AudioManager audioManager, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i);
        }
        return 0;
    }

    public static int crashlytics(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* renamed from: default, reason: not valid java name */
    public static int m4281default(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: extends, reason: not valid java name */
    public static final void m4282extends(CameraManager cameraManager, String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        cameraManager.openCamera(str, executor, stateCallback);
    }

    /* renamed from: final, reason: not valid java name */
    public static final void m4283final(SessionConfiguration sessionConfiguration, InputConfiguration inputConfiguration) {
        sessionConfiguration.setInputConfiguration(inputConfiguration);
    }

    public static int firebase(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    /* renamed from: goto, reason: not valid java name */
    public static int m4284goto(Object obj) {
        return ((Icon) obj).getType();
    }

    /* renamed from: implements, reason: not valid java name */
    public static int m4285implements(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: import, reason: not valid java name */
    public static final void m4286import(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static final Map inmobi(TotalCaptureResult totalCaptureResult) {
        return totalCaptureResult.getPhysicalCameraResults();
    }

    /* renamed from: instanceof, reason: not valid java name */
    public static boolean m4287instanceof(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    /* renamed from: interface, reason: not valid java name */
    public static PrecomputedText.Params m4288interface(C13272e c13272e) {
        return c13272e.getTextMetricsParams();
    }

    public static int isPro(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static final Set isVip(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getPhysicalCameraIds();
    }

    public static void license(Menu menu, int i, Context context, TextClassification textClassification, int i2) {
        if (i2 < 0) {
            MenuItem add = menu.add(R.id.textAssist, R.id.textAssist, i, textClassification.getLabel());
            add.setShowAsAction(2);
            add.setIcon(textClassification.getIcon());
            add.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC17274e(context, textClassification, 1));
            return;
        }
        boolean z = i2 == 0;
        final RemoteAction remoteAction = textClassification.getActions().get(i2);
        MenuItem add2 = menu.add(R.id.textAssist, z ? 16908353 : 0, i, remoteAction.getTitle());
        add2.setShowAsAction(z ? 2 : 0);
        if (z || remoteAction.shouldShowIcon()) {
            add2.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: eَٜؕ
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                AbstractC17305e.ad(remoteAction);
                return true;
            }
        });
    }

    public static final List loadAd(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailablePhysicalCameraRequestKeys();
    }

    public static final DisplayCutout metrica(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException) && !(e instanceof NoSuchMethodException) && !(e instanceof NoSuchFieldException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException) && !(e instanceof InstantiationException)) {
                throw e;
            }
            InterfaceC9274e.vip.getClass();
            Log.w(C7673e.vip, e);
            return null;
        }
    }

    public static Bitmap mopub(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r4.hasTransport(4) == true) goto L36;
     */
    /* renamed from: native, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m4289native(android.net.ConnectivityManager r4) {
        /*
            eًٕٝ r0 = defpackage.AbstractC12918e.metrica
            java.net.Proxy r0 = r0.vip
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = defpackage.AbstractC12681e.vip(r1)
            r2 = 0
            if (r0 == 0) goto L3c
            android.net.Network r0 = r4.getActiveNetwork()
            if (r0 != 0) goto L16
            goto L72
        L16:
            r3 = 2
            boolean r3 = defpackage.AbstractC12681e.vip(r3)
            if (r3 == 0) goto L2a
            android.net.LinkProperties r4 = r4.getLinkProperties(r0)
            if (r4 == 0) goto L72
            boolean r4 = r4.isPrivateDnsActive()
            if (r4 != r1) goto L72
            goto L71
        L2a:
            android.net.Network r0 = r4.getActiveNetwork()
            android.net.NetworkCapabilities r4 = r4.getNetworkCapabilities(r0)
            if (r4 == 0) goto L3c
            r0 = 4
            boolean r4 = r4.hasTransport(r0)
            if (r4 != r1) goto L3c
            goto L71
        L3c:
            java.util.Enumeration r4 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Exception -> L6f
        L40:
            boolean r0 = r4.hasMoreElements()     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L72
            java.lang.Object r0 = r4.nextElement()     // Catch: java.lang.Exception -> L6f
            java.net.NetworkInterface r0 = (java.net.NetworkInterface) r0     // Catch: java.lang.Exception -> L6f
            boolean r3 = r0.isUp()     // Catch: java.lang.Exception -> L6f
            if (r3 == 0) goto L40
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L6f
            java.lang.String r3 = "tun"
            boolean r3 = defpackage.AbstractC5304e.inmobi(r0, r3, r2)     // Catch: java.lang.Exception -> L6f
            if (r3 != 0) goto L71
            java.lang.String r3 = "ppp"
            boolean r3 = defpackage.AbstractC5304e.inmobi(r0, r3, r2)     // Catch: java.lang.Exception -> L6f
            if (r3 != 0) goto L71
            java.lang.String r3 = "pptp"
            boolean r0 = defpackage.AbstractC5304e.inmobi(r0, r3, r2)     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L40
            goto L71
        L6f:
            r4 = move-exception
            goto L73
        L71:
            return r1
        L72:
            return r2
        L73:
            r4.printStackTrace()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17305e.m4289native(android.net.ConnectivityManager):boolean");
    }

    /* renamed from: new, reason: not valid java name */
    public static void m4290new(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }

    /* renamed from: package, reason: not valid java name */
    public static void m4291package(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static int premium(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: private, reason: not valid java name */
    public static final void m4292private(OutputConfiguration outputConfiguration, String str) {
        outputConfiguration.setPhysicalCameraId(str);
    }

    public static Executor pro(Context context) {
        return context.getMainExecutor();
    }

    /* renamed from: protected, reason: not valid java name */
    public static void m4293protected(View view) {
        view.resetPivot();
    }

    public static final void purchase(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static long remoteconfig(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static final int signatures(OutputConfiguration outputConfiguration) {
        return outputConfiguration.getMaxSharedSurfaceCount();
    }

    public static TextClassifier smaato(Context context, EnumC4478e enumC4478e) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int ordinal = enumC4478e.ordinal();
        if (ordinal == 0) {
            str = "edittext";
        } else {
            if (ordinal != 1) {
                throw new C14803e(10);
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static Handler startapp(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* renamed from: static, reason: not valid java name */
    public static Person m4294static(C2730e c2730e) {
        Person.Builder name = new Person.Builder().setName(c2730e.ad);
        IconCompat iconCompat = c2730e.vip;
        return name.setIcon(iconCompat != null ? iconCompat.adcel(null) : null).setUri(c2730e.metrica).setKey(c2730e.license).setBot(c2730e.appmetrica).setImportant(c2730e.purchase).build();
    }

    /* renamed from: strictfp, reason: not valid java name */
    public static void m4295strictfp(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }

    public static int subs(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static String[] subscription(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* renamed from: super, reason: not valid java name */
    public static void m4296super(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static boolean m4297synchronized() {
        Boolean bool = license;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (invoke == null) {
                        throw new C14803e(AbstractC5797e.appmetrica("expected a non-null reference", objArr), 22, (byte) 0);
                    }
                    bool = (Boolean) invoke;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            license = bool;
        }
        return bool.booleanValue();
    }

    public static String tapsense() {
        BufferedReader bufferedReader;
        if (vip == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                vip = Application.getProcessName();
            } else {
                int i = metrica;
                if (i == 0) {
                    i = Process.myPid();
                    metrica = i;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 14);
                        sb.append("/proc/");
                        sb.append(i);
                        sb.append("/cmdline");
                        String sb2 = sb.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(sb2));
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        String readLine = bufferedReader.readLine();
                        AbstractC9528e.startapp(readLine);
                        str = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        AbstractC2206e.ad(bufferedReader2);
                        throw th;
                    }
                    AbstractC2206e.ad(bufferedReader);
                }
                vip = str;
            }
        }
        return vip;
    }

    /* renamed from: this, reason: not valid java name */
    public static Uri m4298this(Object obj) {
        return ((Icon) obj).getUri();
    }

    /* renamed from: throw, reason: not valid java name */
    public static boolean m4299throw(Handler handler, RunnableC12320e runnableC12320e, long j) {
        return handler.postDelayed(runnableC12320e, "retry_token", j);
    }

    /* renamed from: transient, reason: not valid java name */
    public static final void m4300transient(SessionConfiguration sessionConfiguration, CaptureRequest captureRequest) {
        sessionConfiguration.setSessionParameters(captureRequest);
    }

    /* renamed from: try, reason: not valid java name */
    public static int m4301try(AudioManager audioManager, C11442e c11442e) {
        if (Build.VERSION.SDK_INT < 26) {
            return audioManager.requestAudioFocus(c11442e.vip, c11442e.license.license(), c11442e.ad);
        }
        Object obj = c11442e.purchase;
        obj.getClass();
        return audioManager.requestAudioFocus(C4403e.metrica(obj));
    }

    public static void vip(AudioManager audioManager, C11442e c11442e) {
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(c11442e.vip);
            return;
        }
        Object obj = c11442e.purchase;
        obj.getClass();
        audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
    }

    /* renamed from: while, reason: not valid java name */
    public static final void m4302while(CameraManager cameraManager, Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        cameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public static Handler yandex(Looper looper) {
        return Handler.createAsync(looper);
    }
}
