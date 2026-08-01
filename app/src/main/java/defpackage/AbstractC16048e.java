package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.media.AudioDescriptor;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.StrictMode;
import android.telephony.TelephonyManager;
import android.util.LongSparseArray;
import android.util.SizeF;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import android.widget.RemoteViews;
import j$.util.Comparator;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16048e {
    public static final Map Signature(TotalCaptureResult totalCaptureResult) {
        return totalCaptureResult.getPhysicalCameraTotalResults();
    }

    public static void ad(RemoteViews remoteViews, int i, RemoteViews remoteViews2, int i2) {
        remoteViews.addStableView(i, remoteViews2, i2);
    }

    public static C9219e adcel(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new C0194e(audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile(), audioProfile.getMediaType()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new C1900e(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return C9219e.appmetrica(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static C7607e admob(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(AbstractC1786e.admob(position, "Invalid position: "));
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new C7607e(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static StrictMode.VmPolicy.Builder ads(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.function.Function] */
    public static AbstractC17475e advert(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            C2171e c2171e = AbstractC17475e.f34223e;
            return C1410e.f4222e;
        }
        TreeSet treeSet = new TreeSet(Comparator.EL.reversed(Comparator.CC.comparing(new Object())));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor vip = C4403e.vip(it.next());
            if (vip.getStandard() == 1) {
                byte[] descriptor = vip.getDescriptor();
                if (descriptor.length != 3) {
                    AbstractC2803e.smaato("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(AbstractC9413e.signatures(i)));
                    }
                }
            }
        }
        return AbstractC17475e.remoteconfig(treeSet);
    }

    public static float amazon(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float applovin(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void appmetrica(Context context, C0462e c0462e) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            C8975e c8975e = new C8975e(c0462e);
            telephonyManager.registerTelephonyCallback((Executor) c0462e.f2534e, c8975e);
            telephonyManager.unregisterTelephonyCallback(c8975e);
        } catch (RuntimeException unused) {
            c0462e.firebase(5);
        }
    }

    public static void billing(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    /* renamed from: class, reason: not valid java name */
    public static void m4101class(MediaDrm mediaDrm, byte[] bArr, C5350e c5350e) {
        LogSessionId logSessionId;
        LogSessionId ad = c5350e.ad();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (ad.equals(logSessionId)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(ad);
    }

    public static void crashlytics(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    /* renamed from: extends, reason: not valid java name */
    public static final String m4102extends(C7282e c7282e, Context context) {
        List list = c7282e.ad;
        C12468e ad = AbstractC12315e.ad(context);
        int ad2 = (Build.VERSION.SDK_INT < 31 || C12582e.ad(context.getResources().getConfiguration()) == Integer.MAX_VALUE) ? 0 : C12582e.ad(context.getResources().getConfiguration());
        if (ad2 == 0) {
            return AbstractC17404e.ad(list, null, new C4526e(ad), 31);
        }
        if (list.size() > 0) {
            list.get(0).getClass();
            throw new ClassCastException();
        }
        float vip = AbstractC3062e.vip(ad2 + 400.0f, 1.0f, 1000.0f);
        return (!list.isEmpty() ? "," : BuildConfig.FLAVOR) + "'wght' " + vip;
    }

    public static void firebase(Notification.Builder builder, int i) {
        builder.setForegroundServiceBehavior(i);
    }

    /* renamed from: goto, reason: not valid java name */
    public static void m4103goto(C13391e c13391e, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((C2584e) c13391e.f26645e).ad;
            mediaSession.getClass();
            mediaSession.setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e) {
            if (!Build.MANUFACTURER.equals("motorola")) {
                throw e;
            }
            AbstractC2803e.billing("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
        }
    }

    public static final InputConfiguration inmobi(String str, List list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Call to create InputConfiguration but list of InputConfigData is empty.");
        }
        if (list.size() == 1) {
            C2308e c2308e = (C2308e) AbstractC13480e.m3591interface(list);
            return new InputConfiguration(c2308e.ad, c2308e.vip, c2308e.metrica);
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2308e c2308e2 = (C2308e) it.next();
            AbstractC14303e.appmetrica();
            arrayList.add(AbstractC14303e.metrica(c2308e2.ad, c2308e2.vip, str));
        }
        return AbstractC14303e.vip(((C2308e) AbstractC13480e.m3591interface(list)).metrica, arrayList);
    }

    /* renamed from: interface, reason: not valid java name */
    public static void m4104interface(C2532e c2532e, C5350e c5350e) {
        LogSessionId logSessionId;
        LogSessionId ad = c5350e.ad();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (ad.equals(logSessionId)) {
            return;
        }
        ((MediaFormat) c2532e.f6386e).setString("log-session-id", ad.getStringId());
    }

    public static void isPro(ViewOnAttachStateChangeListenerC5346e viewOnAttachStateChangeListenerC5346e, long[] jArr, Consumer consumer) {
        C6071e c6071e;
        String ad;
        for (long j : jArr) {
            C3993e c3993e = (C3993e) viewOnAttachStateChangeListenerC5346e.metrica().vip((int) j);
            if (c3993e != null && (c6071e = c3993e.ad) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(viewOnAttachStateChangeListenerC5346e.f11468e.getAutofillId(), c6071e.purchase);
                Object billing = c6071e.license.f2578e.billing(AbstractC9058e.subs);
                if (billing == null) {
                    billing = null;
                }
                List list = (List) billing;
                if (list != null && (ad = AbstractC17404e.ad(list, "\n", null, 62)) != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new C10566e(ad)));
                    consumer.t(builder.build());
                }
            }
        }
    }

    public static Typeface isVip(Configuration configuration, Typeface typeface) {
        int ad;
        if (Build.VERSION.SDK_INT < 31 || (ad = C12582e.ad(configuration)) == Integer.MAX_VALUE || ad == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC13482e.mopub(typeface.getWeight() + C12582e.ad(configuration), 1, 1000), typeface.isItalic());
    }

    public static Bitmap license(int i, int i2, byte[] bArr) {
        BitmapFactory.Options options;
        int i3 = 0;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i2; max /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray == null) {
            throw C15125e.ad(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C0490e c0490e = new C0490e(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (c0490e.metrica(1, "Orientation")) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = 270;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
            }
            if (i3 == 0) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static Shader.TileMode loadAd() {
        return Shader.TileMode.DECAL;
    }

    public static RemoteViews metrica(Map map) {
        return new RemoteViews((Map<SizeF, RemoteViews>) map);
    }

    public static EncoderProfiles mopub(int i, String str) {
        return CamcorderProfile.getAll(str, i);
    }

    /* renamed from: native, reason: not valid java name */
    public static void m4105native(View view, C9508e c9508e) {
        RenderEffect renderEffect;
        if (c9508e != null) {
            renderEffect = c9508e.ad;
            if (renderEffect == null) {
                renderEffect = c9508e.vip;
                c9508e.ad = renderEffect;
            }
        } else {
            renderEffect = null;
        }
        view.setRenderEffect(renderEffect);
    }

    public static RemoteViews premium(int i, int i2, String str) {
        return new RemoteViews(str, i, i2);
    }

    public static boolean pro(PendingIntent pendingIntent) {
        return pendingIntent.isActivity();
    }

    public static void purchase(ViewOnAttachStateChangeListenerC5346e viewOnAttachStateChangeListenerC5346e, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        C3993e c3993e;
        C6071e c6071e;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(keyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (c3993e = (C3993e) viewOnAttachStateChangeListenerC5346e.metrica().vip((int) keyAt)) != null && (c6071e = c3993e.ad) != null) {
                Object billing = c6071e.license.f2578e.billing(AbstractC10789e.advert);
                if (billing == null) {
                    billing = null;
                }
                C10591e c10591e = (C10591e) billing;
                if (c10591e != null && (function1 = (Function1) c10591e.vip) != null) {
                }
            }
        }
    }

    public static boolean remoteconfig(IllegalStateException illegalStateException) {
        return C13415e.billing(illegalStateException);
    }

    public static boolean signatures() {
        if (Build.VERSION.SDK_INT < 31 || !"Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            String str = Build.HARDWARE;
            Locale locale = Locale.ROOT;
            if (!AbstractC6507e.pro(str.toLowerCase(locale), "ums", false) && ((!AbstractC6507e.loadAd(Build.MANUFACTURER, "Itel", true) && !AbstractC6507e.loadAd(Build.BRAND, "Itel", true)) || !AbstractC6507e.pro(str.toLowerCase(locale), "sp", false))) {
                return false;
            }
        }
        return true;
    }

    public static Path smaato(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static void startapp(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static boolean subs(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    public static final List subscription(CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        return cameraExtensionCharacteristics.getSupportedExtensions();
    }

    public static Bitmap tapsense(Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 31 ? bitmap.asShared() : bitmap;
    }

    /* renamed from: this, reason: not valid java name */
    public static void m4106this(RenderNode renderNode, C9508e c9508e) {
        RenderEffect renderEffect;
        if (c9508e != null) {
            renderEffect = c9508e.ad;
            if (renderEffect == null) {
                renderEffect = c9508e.vip;
                c9508e.ad = renderEffect;
            }
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public static EdgeEffect vip(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static void yandex(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }
}
