package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedDispatcher;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۦْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14380e {
    public static Bitmap ad;

    public static C14677e Signature(InterfaceC2531e interfaceC2531e) {
        Long l = (Long) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l != null) {
            return (C14677e) AbstractC6940e.ad.get(l);
        }
        return null;
    }

    public static final RenderEffect ad(RenderEffect renderEffect, RenderEffect renderEffect2, BlendMode blendMode, long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L && !C2152e.vip(j, 0L)) {
            renderEffect2 = RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), renderEffect2);
        }
        return RenderEffect.createBlendModeEffect(renderEffect, renderEffect2, blendMode);
    }

    public static AudioDeviceInfo adcel(AudioManager audioManager, C3335e c3335e) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(c3335e.metrica());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return audioDevicesForAttributes.get(0);
    }

    public static String admob(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final void ads(CursorAnchorInfo.Builder builder, C0763e c0763e) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(AbstractC9764e.mopub(c0763e)).setHandwritingBounds(AbstractC9764e.mopub(c0763e)).build());
    }

    public static C2039e advert(Context context) {
        Object obj;
        String tapsense;
        int myPid = Process.myPid();
        Iterator it = purchase(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C2039e) obj).vip == myPid) {
                break;
            }
        }
        C2039e c2039e = (C2039e) obj;
        if (c2039e != null) {
            return c2039e;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            tapsense = Process.myProcessName();
        } else if ((i < 28 || (tapsense = Application.getProcessName()) == null) && (tapsense = AbstractC17305e.tapsense()) == null) {
            tapsense = BuildConfig.FLAVOR;
        }
        return new C2039e(myPid, 0, tapsense, false);
    }

    public static PackageInfo amazon(Context context, PackageManager packageManager) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static final void applovin(CursorAnchorInfo.Builder builder, C0763e c0763e) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(AbstractC9764e.mopub(c0763e)).setHandwritingBounds(AbstractC9764e.mopub(c0763e)).build());
    }

    public static C2691e appmetrica(InterfaceC2531e interfaceC2531e) {
        int i = Build.VERSION.SDK_INT;
        C2691e c2691e = null;
        if (i >= 33) {
            DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES);
            if (dynamicRangeProfiles != null) {
                if (i < 33) {
                    throw new IllegalStateException(AbstractC1634e.smaato("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API ", i, " (requires API 33)").toString());
                }
                c2691e = new C2691e(5, new C11743e(dynamicRangeProfiles));
            }
        }
        return c2691e == null ? C0372e.ad : c2691e;
    }

    public static final Set billing(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.getAvailableCaptureRequestKeys(i);
    }

    public static final void crashlytics(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setStreamUseCase(j);
    }

    public static void firebase(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    public static final void inmobi(C5385e c5385e, C12609e c12609e) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!AbstractC0869e.premium(c12609e) || (findOnBackInvokedDispatcher = c5385e.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(c12609e);
    }

    public static final void isPro(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setDynamicRangeProfile(j);
    }

    public static final void isVip(C5385e c5385e, C12609e c12609e) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!AbstractC0869e.premium(c12609e) || (findOnBackInvokedDispatcher = c5385e.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, c12609e);
    }

    public static C9219e license(EncoderProfiles encoderProfiles) {
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
            arrayList2.add(new C1900e(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return C9219e.appmetrica(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static Object loadAd(String str, Bundle bundle) {
        return bundle.getParcelable(str, C13381e.class);
    }

    public static final C9508e metrica(C15074e c15074e, C8073e c8073e) {
        long j;
        long j2;
        RenderEffect createBlurEffect;
        float f = c8073e.metrica;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            return null;
        }
        float f2 = c8073e.ad * f;
        float f3 = 0;
        if (C15765e.ad(f2, f3) < 0) {
            throw new IllegalArgumentException("blurRadius needs to be equal or greater than 0.dp");
        }
        long yandex = C2108e.yandex(f, c8073e.license);
        float ceil = (float) Math.ceil(Float.intBitsToFloat((int) (yandex >> 32)));
        long floatToRawIntBits = (Float.floatToRawIntBits((float) Math.ceil(Float.intBitsToFloat((int) (yandex & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(ceil) << 32);
        long adcel = C2152e.adcel(f, c8073e.appmetrica);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (adcel >> 32)))) << 32) | (Float.floatToRawIntBits(AbstractC1561e.appmetrica(Float.intBitsToFloat((int) (adcel & 4294967295L)))) & 4294967295L);
        C7127e c7127e = c8073e.startapp;
        Shader metrica = c7127e != null ? C8738e.vip(c7127e).metrica(floatToRawIntBits) : null;
        if (C15765e.ad(f2, f3) <= 0) {
            createBlurEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
            j = floatToRawIntBits;
            j2 = floatToRawIntBits2;
        } else if (i < 33 || metrica == null) {
            j = floatToRawIntBits;
            j2 = floatToRawIntBits2;
            try {
                float mo497instanceof = ((InterfaceC14388e) AbstractC10432e.vip(c15074e, AbstractC11473e.yandex)).mo497instanceof(f2);
                createBlurEffect = RenderEffect.createBlurEffect(mo497instanceof, mo497instanceof, AbstractC12110e.license(c8073e.adcel));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(AbstractC5087e.m1746extends("Error whilst calling RenderEffect.createBlurEffect. This is likely because this device does not support a blur radius of ", C15765e.metrica(f2), "dp"), e);
            }
        } else {
            float mo497instanceof2 = ((InterfaceC14388e) AbstractC10432e.vip(c15074e, AbstractC11473e.yandex)).mo497instanceof(f2);
            j2 = floatToRawIntBits2;
            j = floatToRawIntBits;
            createBlurEffect = RenderEffect.createChainEffect(vip(mo497instanceof2, floatToRawIntBits2, floatToRawIntBits, metrica, true), vip(mo497instanceof2, floatToRawIntBits2, floatToRawIntBits, metrica, false));
        }
        Context context = (Context) AbstractC10432e.vip(c15074e, AbstractC2676e.vip);
        float f4 = c8073e.vip;
        if (f4 >= 0.005f) {
            if (f <= 0.0f) {
                f = 1.0f;
            }
            Bitmap smaato = smaato(context);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(smaato, tileMode, tileMode);
            if (Math.abs(f - 1.0f) >= 0.001f) {
                Matrix matrix = new Matrix();
                float f5 = 1.0f / f;
                matrix.setScale(f5, f5);
                bitmapShader.setLocalMatrix(matrix);
            }
            float vip = AbstractC3062e.vip(f4, 0.0f, 1.0f);
            RenderEffect createShaderEffect = RenderEffect.createShaderEffect(bitmapShader);
            if (vip < 1.0f) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setScale(1.0f, 1.0f, 1.0f, vip);
                createShaderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), createShaderEffect);
            }
            if (metrica != null) {
                createShaderEffect = RenderEffect.createBlendModeEffect(RenderEffect.createShaderEffect(metrica), createShaderEffect, BlendMode.SRC_IN);
            }
            createBlurEffect = RenderEffect.createBlendModeEffect(createShaderEffect, createBlurEffect, BlendMode.DST_ATOP);
        }
        List<C10810e> list = c8073e.purchase;
        float f6 = c8073e.billing;
        for (C10810e c10810e : list) {
            boolean ad2 = c10810e.ad();
            long j3 = c10810e.ad;
            int i2 = c10810e.vip;
            if (ad2) {
                AbstractC4457e abstractC4457e = c10810e.metrica;
                Shader metrica2 = (abstractC4457e == null || !(abstractC4457e instanceof AbstractC9876e)) ? null : ((AbstractC9876e) abstractC4457e).metrica(j);
                if (metrica2 != null) {
                    RenderEffect createShaderEffect2 = f6 >= 1.0f ? RenderEffect.createShaderEffect(metrica2) : RenderEffect.createColorFilterEffect(new BlendModeColorFilter(AbstractC6532e.m2193extends(C3618e.vip(f6, C3618e.billing)), BlendMode.SRC_IN), RenderEffect.createShaderEffect(metrica2));
                    createBlurEffect = metrica != null ? ad(createBlurEffect, RenderEffect.createBlendModeEffect(RenderEffect.createShaderEffect(metrica), createShaderEffect2, BlendMode.SRC_IN), AbstractC14204e.m3775implements(i2), j2) : ad(createBlurEffect, createShaderEffect2, AbstractC14204e.m3775implements(i2), j2);
                } else {
                    if (f6 < 1.0f) {
                        j3 = C3618e.vip(C3618e.license(j3) * f6, j3);
                    }
                    if (C3618e.license(j3) >= 0.005f) {
                        createBlurEffect = metrica != null ? ad(createBlurEffect, RenderEffect.createColorFilterEffect(new BlendModeColorFilter(AbstractC6532e.m2193extends(j3), BlendMode.SRC_IN), RenderEffect.createShaderEffect(metrica)), AbstractC14204e.m3775implements(i2), j2) : RenderEffect.createColorFilterEffect(new BlendModeColorFilter(AbstractC6532e.m2193extends(j3), AbstractC14204e.m3775implements(i2)), createBlurEffect);
                    }
                }
            }
        }
        AbstractC4457e abstractC4457e2 = c8073e.yandex;
        BlendMode blendMode = BlendMode.DST_IN;
        if (abstractC4457e2 != null) {
            Shader metrica3 = abstractC4457e2 instanceof AbstractC9876e ? ((AbstractC9876e) abstractC4457e2).metrica(j) : null;
            if (metrica3 != null) {
                createBlurEffect = ad(createBlurEffect, RenderEffect.createShaderEffect(metrica3), blendMode, j2);
            }
        }
        return new C9508e(createBlurEffect);
    }

    public static int mopub() {
        int i = Build.VERSION.SDK_INT;
        return (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Alert.DURATION_SHOW_INDEFINITELY : MediaStore.getPickImagesMaxLimit();
    }

    public static final void premium(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static final boolean pro(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static ArrayList purchase(Context context) {
        List<ActivityManager.RunningAppProcessInfo> list;
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = C13664e.f27089e;
        }
        ArrayList firebase = AbstractC13480e.firebase(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = firebase.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            String str2 = runningAppProcessInfo.processName;
            arrayList2.add(new C2039e(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, AbstractC7890e.billing(str2, str)));
        }
        return arrayList2;
    }

    public static final boolean remoteconfig(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static boolean signatures(PowerManager powerManager) {
        return powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
    }

    public static final Bitmap smaato(Context context) {
        Bitmap bitmap = ad;
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.haze_noise);
        ad = decodeResource;
        return decodeResource;
    }

    public static C16717e startapp(AudioManager audioManager, C3335e c3335e, AbstractC17475e abstractC17475e, List list) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c3335e.metrica());
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(AbstractC10509e.appmetrica(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (AbstractC9413e.m2572try(format) || C16717e.yandex.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(AbstractC10509e.appmetrica(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(AbstractC10509e.appmetrica(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        C13304e Signature = AbstractC17475e.Signature();
        for (Map.Entry entry : hashMap.entrySet()) {
            Signature.metrica(new C10824e(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C16717e(Signature.billing(), abstractC17475e, list);
    }

    public static final void subs(OutputConfiguration outputConfiguration, int i) {
        outputConfiguration.setMirrorMode(i);
    }

    public static final BoringLayout.Metrics subscription(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static boolean tapsense(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, eؕٛؓ] */
    public static final RenderEffect vip(float f, long j, long j2, Shader shader, boolean z) {
        RuntimeShader runtimeShader = new RuntimeShader(z ? (String) AbstractC10531e.ad.getValue() : (String) AbstractC10531e.vip.getValue());
        runtimeShader.setFloatUniform("blurRadius", f);
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        runtimeShader.setFloatUniform("crop", Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
        runtimeShader.setInputShader("mask", shader);
        return RenderEffect.createRuntimeShaderEffect(runtimeShader, "content");
    }

    public static final Set yandex(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.getAvailableCaptureResultKeys(i);
    }
}
