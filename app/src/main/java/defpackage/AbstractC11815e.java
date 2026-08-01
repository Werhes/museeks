package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.display.DisplayManager;
import android.media.AudioAttributes;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textclassifier.TextClassification;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import j$.util.function.DoubleUnaryOperator$CC;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.function.DoubleUnaryOperator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11815e {
    public static Context ad;
    public static Boolean vip;

    public static void Signature(Context context, String str, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            notificationManager.getClass();
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i), 2);
            if (i2 != 0) {
                notificationChannel.setDescription(context.getString(i2));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: abstract, reason: not valid java name */
    public static void m3243abstract(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }

    public static final void ad(OutputConfiguration outputConfiguration, Surface surface) {
        outputConfiguration.addSurface(surface);
    }

    public static final Bitmap adcel(int i, int i2, int i3, AbstractC14213e abstractC14213e) {
        Bitmap.Config config;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace isPro;
        ColorSpace colorSpace3;
        Bitmap.Config m3268switch = m3268switch(i3);
        if (AbstractC7890e.billing(abstractC14213e, C4717e.appmetrica)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.admob)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.subscription)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.loadAd)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.adcel)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.startapp)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.pro)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.remoteconfig)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.mopub)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.advert)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.billing)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.yandex)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.purchase)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.smaato)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (AbstractC7890e.billing(abstractC14213e, C4717e.Signature)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!AbstractC7890e.billing(abstractC14213e, C4717e.amazon)) {
                if (Build.VERSION.SDK_INT >= 34 && (isPro = AbstractC5666e.isPro(abstractC14213e)) != null) {
                    colorSpace2 = isPro;
                    config = m3268switch;
                    return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace2);
                }
                if (abstractC14213e instanceof C14093e) {
                    String str = abstractC14213e.ad;
                    C14093e c14093e = (C14093e) abstractC14213e;
                    float[] ad2 = c14093e.license.ad();
                    C16498e c16498e = c14093e.billing;
                    if (c16498e != null) {
                        config = m3268switch;
                        transferParameters = new ColorSpace.Rgb.TransferParameters(c16498e.vip, c16498e.metrica, c16498e.license, c16498e.appmetrica, c16498e.purchase, c16498e.billing, c16498e.ad);
                    } else {
                        config = m3268switch;
                        transferParameters = null;
                    }
                    float[] fArr = c14093e.startapp;
                    if (transferParameters != null) {
                        ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, c14093e.yandex, ad2, transferParameters);
                        if (Float.isNaN(fArr[0]) || Arrays.equals(rgb.getTransform(), fArr)) {
                            colorSpace2 = rgb;
                        } else {
                            colorSpace = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr2 = c14093e.yandex;
                        final C8899e c8899e = c14093e.advert;
                        final int i4 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: eْٕۘ
                            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i5 = i4;
                                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                            }

                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                switch (i4) {
                                    case 0:
                                        return ((Number) c8899e.invoke(Double.valueOf(d))).doubleValue();
                                    default:
                                        return ((Number) c8899e.invoke(Double.valueOf(d))).doubleValue();
                                }
                            }

                            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i5 = i4;
                                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                            }
                        };
                        final C8899e c8899e2 = c14093e.loadAd;
                        final int i5 = 1;
                        colorSpace2 = new ColorSpace.Rgb(str, fArr2, ad2, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: eْٕۘ
                            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i52 = i5;
                                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                            }

                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                switch (i5) {
                                    case 0:
                                        return ((Number) c8899e2.invoke(Double.valueOf(d))).doubleValue();
                                    default:
                                        return ((Number) c8899e2.invoke(Double.valueOf(d))).doubleValue();
                                }
                            }

                            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i52 = i5;
                                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                            }
                        }, c14093e.appmetrica, c14093e.purchase);
                    }
                    return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace2);
                }
                config = m3268switch;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                colorSpace2 = colorSpace;
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace2);
            }
            colorSpace3 = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace2 = colorSpace3;
        config = m3268switch;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace2);
    }

    public static Icon admob(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static C6571e ads(Activity activity, String str) {
        UUID uuid;
        List<StorageVolume> storageVolumes;
        String uuid2;
        if (Build.VERSION.SDK_INT < 26) {
            return m3258interface(str);
        }
        try {
            StorageManager storageManager = (StorageManager) activity.getSystemService(StorageManager.class);
            if (storageManager != null && (storageVolumes = storageManager.getStorageVolumes()) != null) {
                for (Object obj : storageVolumes) {
                    if (!((StorageVolume) obj).isPrimary()) {
                        StorageVolume storageVolume = (StorageVolume) obj;
                        if (storageVolume != null && (uuid2 = storageVolume.getUuid()) != null) {
                            uuid = (uuid2.length() == 9 && uuid2.charAt(4) == '-') ? UUID.fromString("fafafafa-fafa-5afa-8afa-fafa".concat(AbstractC6507e.subscription(uuid2, "-", BuildConfig.FLAVOR, false))) : UUID.fromString(uuid2);
                            StorageStatsManager storageStatsManager = (StorageStatsManager) activity.getSystemService(StorageStatsManager.class);
                            if (storageStatsManager == null && uuid != null) {
                            }
                            return m3258interface(str);
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            uuid = null;
            StorageStatsManager storageStatsManager2 = (StorageStatsManager) activity.getSystemService(StorageStatsManager.class);
            return storageStatsManager2 == null ? m3258interface(str) : new C6571e(Long.valueOf(storageStatsManager2.getFreeBytes(uuid)), Long.valueOf(storageStatsManager2.getTotalBytes(uuid)));
        } catch (Exception unused) {
            return m3258interface(str);
        }
    }

    public static final C13333e advert(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C13333e(AutofillValue.forToggle(z));
        }
        return null;
    }

    public static NotificationChannel amazon(String str, String str2) {
        return new NotificationChannel(str, str2, 4);
    }

    public static AutofillId applovin(View view) {
        return view.getAutofillId();
    }

    public static boolean appmetrica(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static boolean billing(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    /* renamed from: break, reason: not valid java name */
    public static void m3244break(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    /* renamed from: case, reason: not valid java name */
    public static void m3245case(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    /* renamed from: catch, reason: not valid java name */
    public static void m3246catch(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    /* renamed from: class, reason: not valid java name */
    public static synchronized boolean m3247class(Context context) {
        Boolean bool;
        synchronized (AbstractC11815e.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = ad;
            if (context2 != null && (bool = vip) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            vip = null;
            if (AbstractC11765e.metrica()) {
                vip = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    vip = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    vip = Boolean.FALSE;
                }
            }
            ad = applicationContext;
            return vip.booleanValue();
        }
    }

    /* renamed from: const, reason: not valid java name */
    public static final void m3248const(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i5 = i / (i2 / rowStride);
        int i6 = 0;
        for (int i7 = 0; i7 < rowStride; i7++) {
            int i8 = i6;
            for (int i9 = 0; i9 < i5; i9++) {
                bArr[i3] = buffer.get(i8);
                i3 += i4;
                i8 += plane.getPixelStride();
            }
            i6 += plane.getRowStride();
        }
    }

    public static long crashlytics(Animator animator) {
        return animator.getTotalDuration();
    }

    /* renamed from: default, reason: not valid java name */
    public static void m3249default(NotificationChannel notificationChannel, String str) {
        notificationChannel.setDescription(str);
    }

    /* renamed from: else, reason: not valid java name */
    public static void m3250else(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    /* renamed from: extends, reason: not valid java name */
    public static Intent m3251extends(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    /* renamed from: final, reason: not valid java name */
    public static void m3252final(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    /* renamed from: finally, reason: not valid java name */
    public static final void m3253finally(C13935e c13935e, C5753e c5753e) {
        C4069e c4069e = (C4069e) c13935e.f27641e;
        if (((ImageCapturePixelHDRPlusQuirk) AbstractC16338e.ad(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        C14326e c14326e = C5753e.f12173e;
        if (AbstractC0054e.purchase(c5753e, c14326e)) {
            int intValue = ((Integer) c5753e.subscription(c14326e)).intValue();
            if (intValue == 0) {
                CaptureRequest.Key ad2 = C0189e.ad();
                c4069e.yandex(AbstractC15428e.ad(ad2), Boolean.TRUE);
            } else {
                if (intValue != 1) {
                    return;
                }
                CaptureRequest.Key ad3 = C0189e.ad();
                c4069e.yandex(AbstractC15428e.ad(ad3), Boolean.FALSE);
            }
        }
    }

    public static final boolean firebase(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config == config2;
    }

    /* renamed from: goto, reason: not valid java name */
    public static void m3254goto(File file, File file2) {
        Path path = file.toPath();
        Path path2 = file2.toPath();
        try {
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (AtomicMoveNotSupportedException e) {
            try {
                Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e2) {
                AbstractC13362e.license(e2, e);
                throw e2;
            }
        } catch (FileAlreadyExistsException e3) {
            try {
                Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e4) {
                AbstractC13362e.license(e4, e3);
                throw e4;
            }
        }
    }

    /* renamed from: implements, reason: not valid java name */
    public static void m3255implements(NotificationChannel notificationChannel) {
        notificationChannel.setGroup(null);
    }

    /* renamed from: import, reason: not valid java name */
    public static void m3256import(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }

    public static void inmobi(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int ad2 = C4403e.ad(configuration) & 3;
        int ad3 = C4403e.ad(configuration2) & 3;
        if (ad2 != ad3) {
            C4403e.purchase(configuration3, C4403e.ad(configuration3) | ad3);
        }
        int ad4 = C4403e.ad(configuration) & 12;
        int ad5 = C4403e.ad(configuration2) & 12;
        if (ad4 != ad5) {
            C4403e.purchase(configuration3, C4403e.ad(configuration3) | ad5);
        }
    }

    /* renamed from: instanceof, reason: not valid java name */
    public static void m3257instanceof(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    /* renamed from: interface, reason: not valid java name */
    public static C6571e m3258interface(String str) {
        StatFs statFs = new StatFs(str);
        return new C6571e(Long.valueOf(statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()), Long.valueOf(statFs.getBlockSizeLong() * statFs.getBlockCountLong()));
    }

    public static final int isPro(Bitmap bitmap) {
        int i;
        Bitmap.Config config;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config2 = bitmap.getConfig();
            if (config2 == Bitmap.Config.ALPHA_8) {
                i = 1;
            } else if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444) {
                i = 2;
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    config = Bitmap.Config.RGBA_F16;
                    if (config2 == config) {
                        i = 8;
                    }
                }
                i = 4;
            }
            return height * i;
        }
    }

    public static final void isVip(CameraCaptureSession cameraCaptureSession, ArrayList arrayList) {
        cameraCaptureSession.finalizeOutputConfigurations(arrayList);
    }

    public static boolean license(Canvas canvas, android.graphics.Path path) {
        return canvas.clipOutPath(path);
    }

    public static void loadAd(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [eُٟؕ] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0086 -> B:22:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0093 -> B:22:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a6 -> B:22:0x0127). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(java.lang.Object r17, defpackage.InterfaceC5261e r18, defpackage.C5033e r19, defpackage.InterfaceC11983e r20, defpackage.AbstractC10731e r21) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11815e.metrica(java.lang.Object, eؗۥؗ, eًؗٝ, eِۚۢ, eُؑ۠):java.lang.Object");
    }

    public static Notification.Builder mopub(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* renamed from: native, reason: not valid java name */
    public static final void m3259native(C0324e c0324e, SparseArray sparseArray) {
        if (c0324e.vip.ad.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue appmetrica = C0663e.appmetrica(sparseArray.get(keyAt));
            if (appmetrica.isText()) {
                C12201e c12201e = c0324e.vip;
                appmetrica.getTextValue().toString();
                if (c12201e.ad.get(Integer.valueOf(keyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (appmetrica.isDate()) {
                    throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (appmetrica.isList()) {
                    throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (appmetrica.isToggle()) {
                    throw new Error("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    /* renamed from: new, reason: not valid java name */
    public static void m3260new(NotificationChannel notificationChannel) {
        notificationChannel.setLightColor(0);
    }

    /* renamed from: package, reason: not valid java name */
    public static void m3261package(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static PendingIntent premium(Context context, Intent intent) {
        return PendingIntent.getForegroundService(context, 0, intent, 201326592);
    }

    /* renamed from: private, reason: not valid java name */
    public static void m3262private(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static final void pro(OutputConfiguration outputConfiguration) {
        outputConfiguration.enableSurfaceSharing();
    }

    /* renamed from: protected, reason: not valid java name */
    public static void m3263protected(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static boolean purchase(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public static void remoteconfig(NotificationChannel notificationChannel) {
        notificationChannel.enableLights(false);
    }

    /* renamed from: return, reason: not valid java name */
    public static void m3264return(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static void signatures(NotificationChannel notificationChannel) {
        notificationChannel.enableVibration(false);
    }

    public static final C13333e smaato(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C13333e(AutofillValue.forText(charSequence));
        }
        return null;
    }

    public static ByteBuffer startapp(C15444e c15444e) {
        int i = c15444e.purchase;
        int i2 = 0;
        if (i != -1) {
            if (i == 17) {
                AbstractC9528e.startapp(null);
                throw null;
            }
            if (i != 35) {
                if (i != 842094169) {
                    throw new C15745e("Unsupported image format", 13);
                }
                AbstractC9528e.startapp(null);
                throw null;
            }
            Image.Plane[] ad2 = c15444e.ad();
            AbstractC9528e.startapp(ad2);
            int i3 = c15444e.metrica;
            int i4 = c15444e.license;
            int i5 = i3 * i4;
            int i6 = i5 / 4;
            byte[] bArr = new byte[i6 + i6 + i5];
            ByteBuffer buffer = ad2[1].getBuffer();
            ByteBuffer buffer2 = ad2[2].getBuffer();
            int position = buffer2.position();
            int limit = buffer.limit();
            buffer2.position(position + 1);
            buffer.limit(limit - 1);
            int i7 = (i5 + i5) / 4;
            boolean z = buffer2.remaining() == i7 + (-2) && buffer2.compareTo(buffer) == 0;
            buffer2.position(position);
            buffer.limit(limit);
            if (z) {
                ad2[0].getBuffer().get(bArr, 0, i5);
                ByteBuffer buffer3 = ad2[1].getBuffer();
                ad2[2].getBuffer().get(bArr, i5, 1);
                buffer3.get(bArr, i5 + 1, i7 - 1);
            } else {
                m3248const(ad2[0], i3, i4, bArr, 0, 1);
                m3248const(ad2[1], i3, i4, bArr, i5 + 1, 2);
                m3248const(ad2[2], i3, i4, bArr, i5, 2);
            }
            return ByteBuffer.wrap(bArr);
        }
        Bitmap bitmap = c15444e.ad;
        AbstractC9528e.startapp(bitmap);
        if (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i8 = width * height;
        int[] iArr = new int[i8];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i8);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < height) {
            int i12 = i2;
            while (i12 < width) {
                int i13 = iArr[i11];
                int i14 = i13 >> 16;
                int i15 = i13 >> 8;
                int i16 = i13 & 255;
                int i17 = i10 + 1;
                int i18 = i14 & 255;
                int i19 = i15 & 255;
                allocateDirect.put(i10, (byte) Math.min(255, ((((i16 * 25) + ((i19 * 129) + (i18 * 66))) + 128) >> 8) + 16));
                if (i9 % 2 == 0 && i11 % 2 == 0) {
                    int i20 = ((((i18 * 112) - (i19 * 94)) - (i16 * 18)) + 128) >> 8;
                    int i21 = (((((i18 * (-38)) - (i19 * 74)) + (i16 * 112)) + 128) >> 8) + 128;
                    int i22 = i8 + 1;
                    allocateDirect.put(i8, (byte) Math.min(255, i20 + 128));
                    i8 += 2;
                    allocateDirect.put(i22, (byte) Math.min(255, i21));
                }
                i11++;
                i12++;
                i10 = i17;
            }
            i9++;
            i2 = 0;
        }
        return allocateDirect;
    }

    /* renamed from: static, reason: not valid java name */
    public static void m3265static(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    /* renamed from: strictfp, reason: not valid java name */
    public static void m3266strictfp(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static C6571e subs(Activity activity) {
        StorageStatsManager storageStatsManager;
        if (Build.VERSION.SDK_INT >= 26 && (storageStatsManager = (StorageStatsManager) activity.getSystemService(StorageStatsManager.class)) != null) {
            UUID uuid = StorageManager.UUID_DEFAULT;
            return new C6571e(Long.valueOf(storageStatsManager.getFreeBytes(uuid)), Long.valueOf(storageStatsManager.getTotalBytes(uuid)));
        }
        return m3258interface(Environment.getDataDirectory().getPath());
    }

    public static boolean subscription(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: super, reason: not valid java name */
    public static final void m3267super(StaticLayout.Builder builder, int i) {
        builder.setJustificationMode(i);
    }

    /* renamed from: switch, reason: not valid java name */
    public static final Bitmap.Config m3268switch(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i2 < 26 || i != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static void m3269synchronized(NotificationChannel notificationChannel) {
        notificationChannel.setVibrationPattern(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01fc, code lost:
    
        if (metrica(r0, r6, r1, r2, r4) == r10) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x033c, code lost:
    
        if (r5 == r10) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0350, code lost:
    
        if (metrica(r5, r6, r1, r2, r4) == r10) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0352, code lost:
    
        return r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [eًؗٝ, eِۚۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [eًۦٞ, eُؑ۠] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v37, types: [eؗۥؗ, eًؗٝ, eِۚۢ] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object tapsense(java.lang.ClassLoader r18, java.lang.String r19, defpackage.C5033e r20, defpackage.InterfaceC11983e r21, defpackage.AbstractC10731e r22) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11815e.tapsense(java.lang.ClassLoader, java.lang.String, eًؗٝ, eِۚۢ, eُؑ۠):java.lang.Object");
    }

    /* renamed from: this, reason: not valid java name */
    public static final void m3270this(C10619e c10619e, C7744e c7744e) {
        Iterator it = ((List) c7744e.ad).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(c10619e);
        }
    }

    /* renamed from: throw, reason: not valid java name */
    public static Intent m3271throw(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
    }

    /* renamed from: throws, reason: not valid java name */
    public static final int m3272throws(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config3 = Bitmap.Config.RGBA_F16;
            if (config == config3) {
                return 3;
            }
        }
        if (i >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return 4;
            }
        }
        return 0;
    }

    /* renamed from: transient, reason: not valid java name */
    public static void m3273transient(NotificationChannel notificationChannel, boolean z) {
        notificationChannel.setShowBadge(z);
    }

    /* renamed from: try, reason: not valid java name */
    public static void m3274try(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static final Bitmap vip(C1362e c1362e) {
        if (c1362e instanceof C1362e) {
            return c1362e.ad;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* renamed from: while, reason: not valid java name */
    public static void m3275while(Context context, TextClassification textClassification) {
        String text = textClassification.getText();
        PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC5666e.m1955class(activity);
        } else {
            activity.send();
        }
    }

    public static boolean yandex(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}
