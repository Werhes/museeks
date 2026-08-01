package defpackage;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ComposeShader;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC7440e {
    public static /* synthetic */ BlendModeColorFilter ad(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* synthetic */ MediaSession appmetrica(Context context, Bundle bundle, String str) {
        return new MediaSession(context, str, bundle);
    }

    public static /* synthetic */ WindowInsets.Builder billing(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ MediaSession license(Context context) {
        return new MediaSession(context, "CastMediaSession", null);
    }

    public static /* synthetic */ RenderNode metrica() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ WindowInsets.Builder purchase() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ ComposeShader vip(Shader shader, Shader shader2, BlendMode blendMode) {
        return new ComposeShader(shader, shader2, blendMode);
    }

    public static /* synthetic */ void yandex() {
    }
}
