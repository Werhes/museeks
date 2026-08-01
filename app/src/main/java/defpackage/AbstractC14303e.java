package defpackage;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.view.ContentInfo;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC14303e {
    public static /* synthetic */ Font.Builder ad(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ void appmetrica() {
    }

    public static /* synthetic */ ContentInfo.Builder license(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ MultiResolutionStreamInfo metrica(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* synthetic */ InputConfiguration vip(int i, ArrayList arrayList) {
        return new InputConfiguration(arrayList, i);
    }
}
