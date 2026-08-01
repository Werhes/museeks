package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّّٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC12438e extends InterfaceC7775e, InterfaceC14405e {

    /* renamed from: eؒٞ٘, reason: contains not printable characters */
    public static final C14326e f24885e;

    /* renamed from: eؓٞؖ, reason: contains not printable characters */
    public static final C14326e f24886e;

    /* renamed from: eِؖؕ, reason: contains not printable characters */
    public static final C14326e f24887e;

    /* renamed from: eؚٕؗ, reason: contains not printable characters */
    public static final C14326e f24889e;

    /* renamed from: eؘؗؕ, reason: contains not printable characters */
    public static final C14326e f24890e;

    /* renamed from: eؘۗٚ, reason: contains not printable characters */
    public static final C14326e f24891e;

    /* renamed from: eؘِۢ, reason: contains not printable characters */
    public static final C14326e f24892e;

    /* renamed from: eؘُٗ, reason: contains not printable characters */
    public static final C14326e f24894e;

    /* renamed from: eُِؕ, reason: contains not printable characters */
    public static final C14326e f24896e;

    /* renamed from: eٔٞۢ, reason: contains not printable characters */
    public static final C14326e f24898e;

    /* renamed from: eٔۥۥ, reason: contains not printable characters */
    public static final C14326e f24899e;

    /* renamed from: eٍٕ, reason: contains not printable characters */
    public static final C14326e f24900e;

    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public static final C14326e f24901e;

    /* renamed from: eًٓؓ, reason: contains not printable characters */
    public static final C14326e f24893e = new C14326e("camerax.core.useCase.defaultSessionConfig", C11469e.class, null);

    /* renamed from: eٓٔؔ, reason: contains not printable characters */
    public static final C14326e f24897e = new C14326e("camerax.core.useCase.defaultCaptureConfig", C9937e.class, null);

    /* renamed from: eًؖٝ, reason: contains not printable characters */
    public static final C14326e f24888e = new C14326e("camerax.core.useCase.sessionConfigUnpacker", C0687e.class, null);

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public static final C14326e f24895e = new C14326e("camerax.core.useCase.captureConfigUnpacker", C4589e.class, null);

    static {
        Class cls = Integer.TYPE;
        f24901e = new C14326e("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        f24892e = new C14326e("camerax.core.useCase.sessionType", cls, null);
        f24889e = new C14326e("camerax.core.useCase.targetFrameRate", Range.class, null);
        f24885e = new C14326e("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        f24890e = new C14326e("camerax.core.useCase.resolutionToMaxFrameRate", Map.class, null);
        Class cls2 = Boolean.TYPE;
        f24894e = new C14326e("camerax.core.useCase.zslDisabled", cls2, null);
        f24899e = new C14326e("camerax.core.useCase.highResolutionDisabled", cls2, null);
        f24886e = new C14326e("camerax.core.useCase.captureType", EnumC12633e.class, null);
        f24900e = new C14326e("camerax.core.useCase.previewStabilizationMode", cls, null);
        f24896e = new C14326e("camerax.core.useCase.videoStabilizationMode", cls, null);
        f24887e = new C14326e("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class, null);
        f24898e = new C14326e("camerax.core.useCase.takePictureManagerProvider", C6717e.class, null);
        f24891e = new C14326e("camerax.core.useCase.streamUseCase", EnumC2392e.class, null);
    }

    /* renamed from: abstract */
    Range mo833abstract(Range range);

    /* renamed from: break */
    int mo834break();

    C11469e crashlytics();

    /* renamed from: default */
    C9937e mo835default();

    boolean isPro();

    C6717e loadAd();

    /* renamed from: native */
    EnumC2392e mo837native();

    /* renamed from: private */
    boolean mo838private();

    /* renamed from: protected */
    int mo839protected(Size size);

    C11469e remoteconfig();

    /* renamed from: return */
    boolean mo840return();

    int signatures();

    /* renamed from: static */
    boolean mo841static();

    /* renamed from: strictfp */
    int mo842strictfp();

    C0687e tapsense();

    /* renamed from: try */
    int mo843try();

    /* renamed from: while */
    EnumC12633e mo844while();
}
