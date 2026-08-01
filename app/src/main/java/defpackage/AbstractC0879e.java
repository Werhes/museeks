package defpackage;

import android.app.PictureInPictureUiState;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.text.StaticLayout;
import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0879e {
    public static final void ad(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static final int appmetrica(InterfaceC2531e interfaceC2531e) {
        CameraCharacteristics.Key key;
        key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
        Integer num = (Integer) ((C9000e) interfaceC2531e).metrica(key);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final void billing(LinkedHashMap linkedHashMap, int i) {
        linkedHashMap.put(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(i));
    }

    public static final int license(InterfaceC2531e interfaceC2531e) {
        Integer num = (Integer) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final List metrica(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionCharacteristicsKeys();
    }

    public static final boolean purchase(InterfaceC2531e interfaceC2531e) {
        CameraCharacteristics.Key key;
        key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
        Integer num = (Integer) ((C9000e) interfaceC2531e).metrica(key);
        return num != null && num.intValue() > 1;
    }

    public static void startapp(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }

    public static C14595e vip(PictureInPictureUiState pictureInPictureUiState) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new C14595e(6);
        }
        if (i < 31) {
            return new C14595e(6);
        }
        pictureInPictureUiState.isStashed();
        return new C14595e(6);
    }

    public static void yandex(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }
}
