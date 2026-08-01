package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5096e {
    public static final void Signature(CameraDevice cameraDevice, int i) {
        cameraDevice.setCameraAudioRestriction(i);
    }

    public static Context ad(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static String adcel(InterfaceC17385e interfaceC17385e) {
        if (interfaceC17385e instanceof C2578e) {
            return "image/*";
        }
        if (interfaceC17385e instanceof C1164e) {
            return null;
        }
        throw new C14803e(10);
    }

    public static void admob(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        window.setDecorFitsSystemWindows(z);
    }

    public static boolean advert() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    public static boolean amazon(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9 A[Catch: AssertionError -> 0x003e, TryCatch #0 {AssertionError -> 0x003e, blocks: (B:3:0x000e, B:5:0x001b, B:7:0x0021, B:8:0x0041, B:11:0x0047, B:14:0x0076, B:16:0x007c, B:18:0x0097, B:21:0x00c3, B:23:0x00c9, B:24:0x00e3, B:26:0x00b5, B:28:0x00dd, B:29:0x0068, B:31:0x0091), top: B:2:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.util.Range appmetrica(defpackage.InterfaceC2531e r12) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5096e.appmetrica(eُّؔ):android.util.Range");
    }

    public static MediaRouter2 billing(Context context) {
        return MediaRouter2.getInstance(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C16289e inmobi(android.media.MediaRoute2Info r13) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5096e.inmobi(android.media.MediaRoute2Info):eٖ٘۠");
    }

    public static void isVip(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            AbstractC2803e.billing("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public static final Set license(CameraManager cameraManager) {
        return cameraManager.getConcurrentCameraIds();
    }

    public static boolean loadAd(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static String metrica(Context context) {
        return context.getAttributionTag();
    }

    public static Insets mopub(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void pro(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void purchase(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static void remoteconfig(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void signatures(Outline outline, C17985e c17985e) {
        if (!(c17985e instanceof C17985e)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(c17985e.ad);
    }

    public static boolean smaato(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static CharSequence startapp(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void subscription(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void tapsense(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static Icon vip(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static ArrayList yandex(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }
}
