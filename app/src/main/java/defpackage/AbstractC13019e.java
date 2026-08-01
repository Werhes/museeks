package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import android.media.audiofx.DynamicsProcessing;
import android.media.session.MediaSessionManager;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC13019e {
    public static /* synthetic */ SessionConfiguration ad(int i, ArrayList arrayList, Executor executor, C16262e c16262e) {
        return new SessionConfiguration(i, arrayList, executor, c16262e);
    }

    public static /* synthetic */ void appmetrica(int i, int i2, String str) {
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public static /* synthetic */ void license() {
    }

    public static /* synthetic */ DynamicsProcessing.MbcBand metrica(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new DynamicsProcessing.MbcBand(true, f, f2, f3, f4, f5, 0.0f, f6, f7, 0.0f, f8);
    }

    public static /* synthetic */ void purchase() {
    }

    public static /* synthetic */ DynamicsProcessing.Limiter vip(boolean z, float f, float f2, float f3, float f4, float f5) {
        return new DynamicsProcessing.Limiter(true, z, 0, f, f2, f3, f4, f5);
    }
}
