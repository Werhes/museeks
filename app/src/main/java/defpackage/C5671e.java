package defpackage;

import android.app.Activity;
import android.app.RemoteAction;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.renderscript.Toolkit;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5671e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f12049e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12050e;

    public /* synthetic */ C5671e(int i, Object obj) {
        this.f12050e = i;
        this.f12049e = obj;
    }

    public /* synthetic */ C5671e(C1774e c1774e, C16901e c16901e) {
        this.f12050e = 26;
        this.f12049e = c1774e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        boolean z2;
        C12618e c12618e;
        Throwable th;
        C13391e c13391e;
        float f;
        float f2;
        float max;
        char c = 7;
        boolean z3 = false;
        int i = 3;
        boolean z4 = false;
        switch (this.f12050e) {
            case 0:
                C17709e c17709e = (C17709e) this.f12049e;
                return Integer.valueOf(AbstractC16619e.appmetrica(c17709e, c17709e.mopub));
            case 1:
                return (String) ((C3446e) this.f12049e).ad("android").f13543e;
            case 2:
                C12340e c12340e = (C12340e) this.f12049e;
                AbstractC16519e.vip((AppActivity) c12340e.f10582e, new C7236e(c12340e, (InterfaceC5083e) null, 17));
                return Unit.INSTANCE;
            case 3:
                C14054e c14054e = (C14054e) this.f12049e;
                C0576e c0576e = c14054e.f27793e;
                if (((C2108e) c0576e.getValue()).ad == 9205357640488583168L || C2108e.billing(((C2108e) c0576e.getValue()).ad)) {
                    return null;
                }
                return c14054e.f27796e.metrica(((C2108e) c0576e.getValue()).ad);
            case 4:
                ((C0073e) this.f12049e).billing.subscription(BuildConfig.FLAVOR);
                return Unit.INSTANCE;
            case 5:
                ((C17047e) this.f12049e).mo734case();
                return Unit.INSTANCE;
            case 6:
                C13128e c13128e = (C13128e) this.f12049e;
                while (true) {
                    synchronized (c13128e.billing) {
                        try {
                            if (c13128e.metrica) {
                                z = z3;
                            } else {
                                c13128e.metrica = true;
                                try {
                                    C12431e c12431e = c13128e.purchase;
                                    Object[] objArr = c12431e.f24870e;
                                    int i2 = c12431e.f24868e;
                                    for (?? r5 = z3; r5 < i2; r5++) {
                                        try {
                                            C14040e c14040e = (C14040e) objArr[r5];
                                            C12618e c12618e2 = c14040e.billing;
                                            Function1 function1 = c14040e.ad;
                                            Object[] objArr2 = c12618e2.vip;
                                            long[] jArr = c12618e2.ad;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                ?? r15 = z3;
                                                c12618e = c12618e2;
                                                while (true) {
                                                    long j = jArr[r15];
                                                    int i3 = length;
                                                    if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i4 = 8 - ((~(r15 - i3)) >>> 31);
                                                        for (int i5 = 0; i5 < i4; i5++) {
                                                            if ((j & 255) < 128) {
                                                                function1.invoke(objArr2[(r15 << 3) + i5]);
                                                            }
                                                            j >>= 8;
                                                        }
                                                        if (i4 != 8) {
                                                        }
                                                    }
                                                    length = i3;
                                                    if (r15 != length) {
                                                        c = 7;
                                                        r15++;
                                                    }
                                                }
                                            } else {
                                                c12618e = c12618e2;
                                            }
                                            c12618e.vip();
                                            c = 7;
                                            z3 = false;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z2 = false;
                                            c13128e.metrica = z2;
                                            throw th;
                                        }
                                    }
                                    z = z3;
                                    c13128e.metrica = z;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z2 = z3;
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    if (!c13128e.vip()) {
                        return Unit.INSTANCE;
                    }
                    z3 = z;
                    c = 7;
                }
            case 7:
                return Integer.valueOf(((C1374e) this.f12049e).f4168e.subs());
            case 8:
                C9745e c9745e = (C9745e) this.f12049e;
                c9745e.purchase();
                Activity activity = c9745e.f10582e;
                AppActivity appActivity = activity instanceof AppActivity ? (AppActivity) activity : null;
                if (appActivity != null) {
                    appActivity.firebase();
                }
                AbstractC7237e.metrica(c9745e.f10582e, new C5422e());
                return Unit.INSTANCE;
            case 9:
                C16546e c16546e = (C16546e) this.f12049e;
                C16446e c16446e = c16546e.f32453e;
                if (c16446e != null) {
                    return c16446e;
                }
                C16446e metrica = AbstractC5851e.startapp(c16546e).metrica();
                c16546e.f32453e = metrica;
                return metrica;
            case 10:
                return new C13766e((C0149e) this.f12049e);
            case 11:
                ((InterfaceC17541e) ((C7744e) this.f12049e).ad).cancel();
                return Unit.INSTANCE;
            case 12:
                C14214e c14214e = (C14214e) this.f12049e;
                C4199e c4199e = c14214e.smaato;
                return new AbstractC14297e(c4199e, (C14918e) c4199e.f22047e, c14214e.amazon);
            case 13:
                C12578e c12578e = (C12578e) this.f12049e;
                InterfaceC8910e interfaceC8910e = c12578e.ad;
                boolean z5 = c12578e.purchase;
                C6302e c6302e = c12578e.vip;
                InterfaceC4895e mo2321e = interfaceC8910e.mo2321e();
                try {
                    c13391e = c12578e.metrica.ad(mo2321e);
                    try {
                        mo2321e.close();
                        th = null;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    try {
                        mo2321e.close();
                    } catch (Throwable th7) {
                        AbstractC13362e.license(th6, th7);
                    }
                    th = th6;
                    c13391e = null;
                }
                if (th != null) {
                    throw th;
                }
                C0912e c0912e = (C0912e) c13391e.f26645e;
                C5550e c5550e = (C5550e) c0912e.f3332e;
                if (c5550e == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                C2359e c2359e = c5550e.loadAd;
                RectF rectF = c2359e != null ? new RectF(c2359e.vip, c2359e.metrica, c2359e.metrica(), c2359e.license()) : null;
                C3339e c3339e = rectF != null ? new C3339e(rectF.left, rectF.top, rectF.right, rectF.bottom) : null;
                if (c12578e.appmetrica && c3339e != null) {
                    f = c3339e.metrica - c3339e.ad;
                    f2 = c3339e.license - c3339e.vip;
                } else {
                    if (((C5550e) c0912e.f3332e) == null) {
                        throw new IllegalArgumentException("SVG document is empty");
                    }
                    f = c0912e.billing().license;
                    if (((C5550e) c0912e.f3332e) == null) {
                        throw new IllegalArgumentException("SVG document is empty");
                    }
                    f2 = c0912e.billing().appmetrica;
                }
                C16320e c16320e = c6302e.vip;
                int i6 = c6302e.metrica;
                if (AbstractC7890e.billing(c16320e, C16320e.metrica)) {
                    float floatValue = ((Number) c12578e.license.invoke(c6302e.ad)).floatValue();
                    if (f > 0.0f) {
                        f *= floatValue;
                    }
                    if (f2 > 0.0f) {
                        f2 *= floatValue;
                    }
                }
                int i7 = AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                int appmetrica = f > 0.0f ? AbstractC1561e.appmetrica(f) : 512;
                if (f2 > 0.0f) {
                    i7 = AbstractC1561e.appmetrica(f2);
                }
                C16320e c16320e2 = c6302e.vip;
                C12916e c12916e = AbstractC2182e.vip;
                long ad = AbstractC2774e.ad(appmetrica, i7, c16320e2, i6, (C16320e) AbstractC8306e.license(c6302e, c12916e));
                int i8 = (int) (ad >> 32);
                float f3 = f;
                int i9 = (int) (ad & 4294967295L);
                if (f > 0.0f && f2 > 0.0f) {
                    C16320e c16320e3 = (C16320e) AbstractC8306e.license(c6302e, c12916e);
                    float f4 = i8 / f3;
                    float f5 = i9 / f2;
                    int m2467class = AbstractC8703e.m2467class(i6);
                    if (m2467class == 0) {
                        max = Math.max(f4, f5);
                    } else {
                        if (m2467class != 1) {
                            throw new C14803e(10);
                        }
                        max = Math.min(f4, f5);
                    }
                    if (c16320e3.ad instanceof C3645e) {
                        float f6 = ((C3645e) r3).ad / f3;
                        if (max > f6) {
                            max = f6;
                        }
                    }
                    if (c16320e3.vip instanceof C3645e) {
                        float f7 = ((C3645e) r3).ad / f2;
                        if (max > f7) {
                            max = f7;
                        }
                    }
                    int i10 = (int) (max * f3);
                    int i11 = (int) (max * f2);
                    if (c3339e == null) {
                        float f8 = f3 - 0.0f;
                        float f9 = f2 - 0.0f;
                        C5550e c5550e2 = (C5550e) c0912e.f3332e;
                        if (c5550e2 == null) {
                            throw new IllegalArgumentException("SVG document is empty");
                        }
                        c5550e2.loadAd = new C2359e(0.0f, 0.0f, f8, f9);
                    }
                    i9 = i11;
                    i8 = i10;
                }
                C5550e c5550e3 = (C5550e) c0912e.f3332e;
                if (c5550e3 == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                c5550e3.subscription = C10913e.remoteconfig("100%");
                C5550e c5550e4 = (C5550e) c0912e.f3332e;
                if (c5550e4 == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                c5550e4.remoteconfig = C10913e.remoteconfig("100%");
                String str = (String) AbstractC8306e.license(c6302e, AbstractC2426e.ad);
                if (str != null) {
                    C5891e c5891e = new C5891e(11);
                    crashlytics crashlyticsVar = new crashlytics(2, 3);
                    C6095e c6095e = new C6095e(str);
                    c6095e.m2694finally();
                    c5891e.f12440e = crashlyticsVar.subscription(c6095e);
                    c13391e.f26644e = c5891e;
                }
                InterfaceC4082e c5484e = new C5484e(c0912e, (C5891e) c13391e.f26644e, i8, i9);
                if (z5) {
                    Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
                    c5484e.billing(new Canvas(createBitmap));
                    c5484e = new C9814e(createBitmap);
                }
                return new C7132e(c5484e, z5);
            case 14:
                C6284e c6284e = (C6284e) this.f12049e;
                c6284e.f13098e = null;
                AbstractC15118e.appmetrica(c6284e);
                AbstractC1599e.purchase(c6284e);
                AbstractC12640e.advert(c6284e);
                return Boolean.TRUE;
            case 15:
                return C17975e.appmetrica((RemoteAction) this.f12049e);
            case 16:
                C16679e c16679e = (C16679e) this.f12049e;
                return c16679e.f27016e ? AbstractC0853e.vip(c16679e) : C17828e.vip;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C11242e c11242e = (C11242e) this.f12049e;
                return (c11242e.f22531e || ((EnumC11891e) c11242e.f22525e.subscription.getValue()) == EnumC11891e.f23825e) ? new C2152e(AbstractC17487e.ad(c11242e.f22526e, c11242e.f22525e, c11242e.f22528e, ((C12729e) c11242e.f22524e.getValue()).ad)) : new C2152e(9205357640488583168L);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return (InterfaceC16522e) this.f12049e;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C11490e(((C10163e) this.f12049e).metrica());
            case 20:
                C1869e c1869e = (C1869e) this.f12049e;
                c1869e.f4987e = null;
                AbstractC15118e.appmetrica(c1869e);
                AbstractC1599e.purchase(c1869e);
                AbstractC12640e.advert(c1869e);
                return Boolean.TRUE;
            case 21:
                return (Executor) ((C3428e) this.f12049e).invoke();
            case 22:
                ((C2674e) this.f12049e).f6550e.invoke(Boolean.valueOf(!r0.f6548e));
                return Unit.INSTANCE;
            case 23:
                C13817e c13817e = (C13817e) this.f12049e;
                AbstractC5336e.purchase(c13817e.metrica, null, 0, new C7195e((String) c13817e.purchase.startapp(), c13817e, z4 ? 1 : 0, i), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Integer.valueOf(((AbstractC7674e) ((C15747e) this.f12049e).ad).subs());
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C8181e(1, ((C13477e) this.f12049e).purchase);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C1774e) this.f12049e).ad("https://vkx.app/license");
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Boolean.valueOf(((C1209e) ((C12916e) this.f12049e).f25784e).ad().ad(UltraWideFlashCaptureUnderexposureQuirk.class));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                VKXApplication vKXApplication = (VKXApplication) this.f12049e;
                VKXApplication.Companion companion = VKXApplication.f36531e;
                C18511e c18511e = AbstractC11062e.f21949e;
                String str2 = C10675e.f21023e;
                File cacheDir = vKXApplication.getApplicationContext().getCacheDir();
                cacheDir.mkdirs();
                Unit unit2 = Unit.INSTANCE;
                File file = new File("image_cache");
                if (AbstractC12696e.ad(file.getPath()) <= 0) {
                    String file2 = cacheDir.toString();
                    if (file2.length() != 0) {
                        char c2 = File.separatorChar;
                        if (!AbstractC5304e.premium(file2, c2)) {
                            file = new File(file2 + c2 + file);
                        }
                    }
                    file = new File(file2 + file);
                }
                return new C5653e(67108864L, c18511e, C10215e.license(file.toString(), false));
            default:
                float f10 = ((C7943e) this.f12049e).metrica;
                if (f10 == 1.0f) {
                    Toolkit toolkit = Toolkit.ad;
                    return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
                }
                float f11 = 1 - f10;
                float f12 = 0.213f * f11;
                float f13 = 0.715f * f11;
                float f14 = f11 * 0.072f;
                return new float[]{f12 + f10, f12, f12, 0.0f, f13, f13 + f10, f13, 0.0f, f14, f14, f10 + f14, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
    }
}
