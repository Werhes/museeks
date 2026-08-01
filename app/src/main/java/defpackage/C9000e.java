package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9000e implements InterfaceC2531e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7520e f18061e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final CameraCharacteristics f18062e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Object f18063e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Set f18064e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final Object f18065e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f18066e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Object f18067e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ArrayMap f18060e = new ArrayMap();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final ArrayMap f18068e = new ArrayMap();

    public C9000e(String str, CameraCharacteristics cameraCharacteristics, C7520e c7520e, Set set) {
        this.f18066e = str;
        this.f18062e = cameraCharacteristics;
        this.f18061e = c7520e;
        this.f18064e = set;
        final int i = 0;
        this.f18067e = AbstractC18039e.appmetrica(2, new Function0(this) { // from class: eؘؒٝ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C9000e f3829e;

            {
                this.f3829e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        C9000e c9000e = this.f3829e;
                        String str2 = c9000e.f18066e;
                        C3295e c3295e = C3295e.f7451e;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C5060e.vip(str2)) + "#supportedExtensions");
                                Set m3582e = Build.VERSION.SDK_INT >= 31 ? AbstractC13480e.m3582e(AbstractC16048e.subscription(c9000e.f18061e.purchase(str2))) : c3295e;
                                Trace.endSection();
                                return m3582e;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C5060e.vip(str2)), e);
                            return c3295e;
                        }
                    case 1:
                        C9000e c9000e2 = this.f3829e;
                        String str3 = c9000e2.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c9000e2.f18062e.getKeys();
                                if (keys == null) {
                                    keys = C13664e.f27089e;
                                }
                                Set m3582e2 = AbstractC13480e.m3582e(keys);
                                Trace.endSection();
                                return m3582e2;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C5060e.vip(str3)) + '}', e2);
                            return C3295e.f7451e;
                        }
                    case 2:
                        C9000e c9000e3 = this.f3829e;
                        String str4 = c9000e3.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c9000e3.f18062e.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = C13664e.f27089e;
                                }
                                Set m3582e3 = AbstractC13480e.m3582e(availableCaptureRequestKeys);
                                Trace.endSection();
                                return m3582e3;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C5060e.vip(str4)), e3);
                            return C3295e.f7451e;
                        }
                    case 3:
                        C9000e c9000e4 = this.f3829e;
                        String str5 = c9000e4.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c9000e4.f18062e.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = C13664e.f27089e;
                                }
                                Set m3582e4 = AbstractC13480e.m3582e(availableCaptureResultKeys);
                                Trace.endSection();
                                return m3582e4;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C5060e.vip(str5)), e4);
                            return C3295e.f7451e;
                        }
                    case 4:
                        C9000e c9000e5 = this.f3829e;
                        String str6 = c9000e5.f18066e;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                try {
                                    Trace.beginSection(((Object) C5060e.vip(str6)) + "#physicalCameraIds");
                                    Set isVip = AbstractC17305e.isVip(c9000e5.f18062e);
                                    Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C5060e.vip(str6)) + ": " + isVip);
                                    Set<String> set2 = isVip;
                                    ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set2, 10));
                                    for (String str7 : set2) {
                                        C5060e.ad(str7);
                                        arrayList.add(new C5060e(str7));
                                    }
                                    Set m3582e5 = AbstractC13480e.m3582e(arrayList);
                                    Trace.endSection();
                                    return m3582e5;
                                } finally {
                                }
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e5);
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e6);
                            }
                        }
                        return C3295e.f7451e;
                    case 5:
                        C9000e c9000e6 = this.f3829e;
                        String str8 = c9000e6.f18066e;
                        int i2 = Build.VERSION.SDK_INT;
                        C3295e c3295e2 = C3295e.f7451e;
                        if (i2 < 28) {
                            return c3295e2;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable loadAd = AbstractC17305e.loadAd(c9000e6.f18062e);
                                if (loadAd == null) {
                                    loadAd = C13664e.f27089e;
                                }
                                Set m3582e6 = AbstractC13480e.m3582e(loadAd);
                                Trace.endSection();
                                return m3582e6;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c3295e2;
                        }
                    case 6:
                        C9000e c9000e7 = this.f3829e;
                        String str9 = c9000e7.f18066e;
                        int i3 = Build.VERSION.SDK_INT;
                        C3295e c3295e3 = C3295e.f7451e;
                        if (i3 < 35) {
                            return c3295e3;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable metrica = AbstractC0879e.metrica(c9000e7.f18062e);
                                if (metrica == null) {
                                    metrica = C13664e.f27089e;
                                }
                                Set m3582e7 = AbstractC13480e.m3582e(metrica);
                                Trace.endSection();
                                return m3582e7;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c3295e3;
                        }
                    default:
                        C9000e c9000e8 = this.f3829e;
                        String str10 = c9000e8.f18066e;
                        int i4 = Build.VERSION.SDK_INT;
                        C3295e c3295e4 = C3295e.f7451e;
                        if (i4 < 28) {
                            return c3295e4;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable Signature = AbstractC17305e.Signature(c9000e8.f18062e);
                                if (Signature == null) {
                                    Signature = C13664e.f27089e;
                                }
                                Set m3582e8 = AbstractC13480e.m3582e(Signature);
                                Trace.endSection();
                                return m3582e8;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c3295e4;
                        }
                }
            }
        });
        final int i2 = 1;
        AbstractC18039e.appmetrica(2, new Function0(this) { // from class: eؘؒٝ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C9000e f3829e;

            {
                this.f3829e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        C9000e c9000e = this.f3829e;
                        String str2 = c9000e.f18066e;
                        C3295e c3295e = C3295e.f7451e;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C5060e.vip(str2)) + "#supportedExtensions");
                                Set m3582e = Build.VERSION.SDK_INT >= 31 ? AbstractC13480e.m3582e(AbstractC16048e.subscription(c9000e.f18061e.purchase(str2))) : c3295e;
                                Trace.endSection();
                                return m3582e;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C5060e.vip(str2)), e);
                            return c3295e;
                        }
                    case 1:
                        C9000e c9000e2 = this.f3829e;
                        String str3 = c9000e2.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c9000e2.f18062e.getKeys();
                                if (keys == null) {
                                    keys = C13664e.f27089e;
                                }
                                Set m3582e2 = AbstractC13480e.m3582e(keys);
                                Trace.endSection();
                                return m3582e2;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C5060e.vip(str3)) + '}', e2);
                            return C3295e.f7451e;
                        }
                    case 2:
                        C9000e c9000e3 = this.f3829e;
                        String str4 = c9000e3.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c9000e3.f18062e.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = C13664e.f27089e;
                                }
                                Set m3582e3 = AbstractC13480e.m3582e(availableCaptureRequestKeys);
                                Trace.endSection();
                                return m3582e3;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C5060e.vip(str4)), e3);
                            return C3295e.f7451e;
                        }
                    case 3:
                        C9000e c9000e4 = this.f3829e;
                        String str5 = c9000e4.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c9000e4.f18062e.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = C13664e.f27089e;
                                }
                                Set m3582e4 = AbstractC13480e.m3582e(availableCaptureResultKeys);
                                Trace.endSection();
                                return m3582e4;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C5060e.vip(str5)), e4);
                            return C3295e.f7451e;
                        }
                    case 4:
                        C9000e c9000e5 = this.f3829e;
                        String str6 = c9000e5.f18066e;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                try {
                                    Trace.beginSection(((Object) C5060e.vip(str6)) + "#physicalCameraIds");
                                    Set isVip = AbstractC17305e.isVip(c9000e5.f18062e);
                                    Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C5060e.vip(str6)) + ": " + isVip);
                                    Set<String> set2 = isVip;
                                    ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set2, 10));
                                    for (String str7 : set2) {
                                        C5060e.ad(str7);
                                        arrayList.add(new C5060e(str7));
                                    }
                                    Set m3582e5 = AbstractC13480e.m3582e(arrayList);
                                    Trace.endSection();
                                    return m3582e5;
                                } finally {
                                }
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e5);
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e6);
                            }
                        }
                        return C3295e.f7451e;
                    case 5:
                        C9000e c9000e6 = this.f3829e;
                        String str8 = c9000e6.f18066e;
                        int i22 = Build.VERSION.SDK_INT;
                        C3295e c3295e2 = C3295e.f7451e;
                        if (i22 < 28) {
                            return c3295e2;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable loadAd = AbstractC17305e.loadAd(c9000e6.f18062e);
                                if (loadAd == null) {
                                    loadAd = C13664e.f27089e;
                                }
                                Set m3582e6 = AbstractC13480e.m3582e(loadAd);
                                Trace.endSection();
                                return m3582e6;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c3295e2;
                        }
                    case 6:
                        C9000e c9000e7 = this.f3829e;
                        String str9 = c9000e7.f18066e;
                        int i3 = Build.VERSION.SDK_INT;
                        C3295e c3295e3 = C3295e.f7451e;
                        if (i3 < 35) {
                            return c3295e3;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable metrica = AbstractC0879e.metrica(c9000e7.f18062e);
                                if (metrica == null) {
                                    metrica = C13664e.f27089e;
                                }
                                Set m3582e7 = AbstractC13480e.m3582e(metrica);
                                Trace.endSection();
                                return m3582e7;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c3295e3;
                        }
                    default:
                        C9000e c9000e8 = this.f3829e;
                        String str10 = c9000e8.f18066e;
                        int i4 = Build.VERSION.SDK_INT;
                        C3295e c3295e4 = C3295e.f7451e;
                        if (i4 < 28) {
                            return c3295e4;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable Signature = AbstractC17305e.Signature(c9000e8.f18062e);
                                if (Signature == null) {
                                    Signature = C13664e.f27089e;
                                }
                                Set m3582e8 = AbstractC13480e.m3582e(Signature);
                                Trace.endSection();
                                return m3582e8;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c3295e4;
                        }
                }
            }
        });
        final int i3 = 2;
        AbstractC18039e.appmetrica(2, new Function0(this) { // from class: eؘؒٝ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C9000e f3829e;

            {
                this.f3829e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        C9000e c9000e = this.f3829e;
                        String str2 = c9000e.f18066e;
                        C3295e c3295e = C3295e.f7451e;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C5060e.vip(str2)) + "#supportedExtensions");
                                Set m3582e = Build.VERSION.SDK_INT >= 31 ? AbstractC13480e.m3582e(AbstractC16048e.subscription(c9000e.f18061e.purchase(str2))) : c3295e;
                                Trace.endSection();
                                return m3582e;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C5060e.vip(str2)), e);
                            return c3295e;
                        }
                    case 1:
                        C9000e c9000e2 = this.f3829e;
                        String str3 = c9000e2.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c9000e2.f18062e.getKeys();
                                if (keys == null) {
                                    keys = C13664e.f27089e;
                                }
                                Set m3582e2 = AbstractC13480e.m3582e(keys);
                                Trace.endSection();
                                return m3582e2;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C5060e.vip(str3)) + '}', e2);
                            return C3295e.f7451e;
                        }
                    case 2:
                        C9000e c9000e3 = this.f3829e;
                        String str4 = c9000e3.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c9000e3.f18062e.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = C13664e.f27089e;
                                }
                                Set m3582e3 = AbstractC13480e.m3582e(availableCaptureRequestKeys);
                                Trace.endSection();
                                return m3582e3;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C5060e.vip(str4)), e3);
                            return C3295e.f7451e;
                        }
                    case 3:
                        C9000e c9000e4 = this.f3829e;
                        String str5 = c9000e4.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c9000e4.f18062e.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = C13664e.f27089e;
                                }
                                Set m3582e4 = AbstractC13480e.m3582e(availableCaptureResultKeys);
                                Trace.endSection();
                                return m3582e4;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C5060e.vip(str5)), e4);
                            return C3295e.f7451e;
                        }
                    case 4:
                        C9000e c9000e5 = this.f3829e;
                        String str6 = c9000e5.f18066e;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                try {
                                    Trace.beginSection(((Object) C5060e.vip(str6)) + "#physicalCameraIds");
                                    Set isVip = AbstractC17305e.isVip(c9000e5.f18062e);
                                    Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C5060e.vip(str6)) + ": " + isVip);
                                    Set<String> set2 = isVip;
                                    ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set2, 10));
                                    for (String str7 : set2) {
                                        C5060e.ad(str7);
                                        arrayList.add(new C5060e(str7));
                                    }
                                    Set m3582e5 = AbstractC13480e.m3582e(arrayList);
                                    Trace.endSection();
                                    return m3582e5;
                                } finally {
                                }
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e5);
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e6);
                            }
                        }
                        return C3295e.f7451e;
                    case 5:
                        C9000e c9000e6 = this.f3829e;
                        String str8 = c9000e6.f18066e;
                        int i22 = Build.VERSION.SDK_INT;
                        C3295e c3295e2 = C3295e.f7451e;
                        if (i22 < 28) {
                            return c3295e2;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable loadAd = AbstractC17305e.loadAd(c9000e6.f18062e);
                                if (loadAd == null) {
                                    loadAd = C13664e.f27089e;
                                }
                                Set m3582e6 = AbstractC13480e.m3582e(loadAd);
                                Trace.endSection();
                                return m3582e6;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c3295e2;
                        }
                    case 6:
                        C9000e c9000e7 = this.f3829e;
                        String str9 = c9000e7.f18066e;
                        int i32 = Build.VERSION.SDK_INT;
                        C3295e c3295e3 = C3295e.f7451e;
                        if (i32 < 35) {
                            return c3295e3;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable metrica = AbstractC0879e.metrica(c9000e7.f18062e);
                                if (metrica == null) {
                                    metrica = C13664e.f27089e;
                                }
                                Set m3582e7 = AbstractC13480e.m3582e(metrica);
                                Trace.endSection();
                                return m3582e7;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c3295e3;
                        }
                    default:
                        C9000e c9000e8 = this.f3829e;
                        String str10 = c9000e8.f18066e;
                        int i4 = Build.VERSION.SDK_INT;
                        C3295e c3295e4 = C3295e.f7451e;
                        if (i4 < 28) {
                            return c3295e4;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable Signature = AbstractC17305e.Signature(c9000e8.f18062e);
                                if (Signature == null) {
                                    Signature = C13664e.f27089e;
                                }
                                Set m3582e8 = AbstractC13480e.m3582e(Signature);
                                Trace.endSection();
                                return m3582e8;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c3295e4;
                        }
                }
            }
        });
        final int i4 = 3;
        AbstractC18039e.appmetrica(2, new Function0(this) { // from class: eؘؒٝ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C9000e f3829e;

            {
                this.f3829e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        C9000e c9000e = this.f3829e;
                        String str2 = c9000e.f18066e;
                        C3295e c3295e = C3295e.f7451e;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C5060e.vip(str2)) + "#supportedExtensions");
                                Set m3582e = Build.VERSION.SDK_INT >= 31 ? AbstractC13480e.m3582e(AbstractC16048e.subscription(c9000e.f18061e.purchase(str2))) : c3295e;
                                Trace.endSection();
                                return m3582e;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C5060e.vip(str2)), e);
                            return c3295e;
                        }
                    case 1:
                        C9000e c9000e2 = this.f3829e;
                        String str3 = c9000e2.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c9000e2.f18062e.getKeys();
                                if (keys == null) {
                                    keys = C13664e.f27089e;
                                }
                                Set m3582e2 = AbstractC13480e.m3582e(keys);
                                Trace.endSection();
                                return m3582e2;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C5060e.vip(str3)) + '}', e2);
                            return C3295e.f7451e;
                        }
                    case 2:
                        C9000e c9000e3 = this.f3829e;
                        String str4 = c9000e3.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c9000e3.f18062e.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = C13664e.f27089e;
                                }
                                Set m3582e3 = AbstractC13480e.m3582e(availableCaptureRequestKeys);
                                Trace.endSection();
                                return m3582e3;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C5060e.vip(str4)), e3);
                            return C3295e.f7451e;
                        }
                    case 3:
                        C9000e c9000e4 = this.f3829e;
                        String str5 = c9000e4.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c9000e4.f18062e.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = C13664e.f27089e;
                                }
                                Set m3582e4 = AbstractC13480e.m3582e(availableCaptureResultKeys);
                                Trace.endSection();
                                return m3582e4;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C5060e.vip(str5)), e4);
                            return C3295e.f7451e;
                        }
                    case 4:
                        C9000e c9000e5 = this.f3829e;
                        String str6 = c9000e5.f18066e;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                try {
                                    Trace.beginSection(((Object) C5060e.vip(str6)) + "#physicalCameraIds");
                                    Set isVip = AbstractC17305e.isVip(c9000e5.f18062e);
                                    Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C5060e.vip(str6)) + ": " + isVip);
                                    Set<String> set2 = isVip;
                                    ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set2, 10));
                                    for (String str7 : set2) {
                                        C5060e.ad(str7);
                                        arrayList.add(new C5060e(str7));
                                    }
                                    Set m3582e5 = AbstractC13480e.m3582e(arrayList);
                                    Trace.endSection();
                                    return m3582e5;
                                } finally {
                                }
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e5);
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e6);
                            }
                        }
                        return C3295e.f7451e;
                    case 5:
                        C9000e c9000e6 = this.f3829e;
                        String str8 = c9000e6.f18066e;
                        int i22 = Build.VERSION.SDK_INT;
                        C3295e c3295e2 = C3295e.f7451e;
                        if (i22 < 28) {
                            return c3295e2;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable loadAd = AbstractC17305e.loadAd(c9000e6.f18062e);
                                if (loadAd == null) {
                                    loadAd = C13664e.f27089e;
                                }
                                Set m3582e6 = AbstractC13480e.m3582e(loadAd);
                                Trace.endSection();
                                return m3582e6;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c3295e2;
                        }
                    case 6:
                        C9000e c9000e7 = this.f3829e;
                        String str9 = c9000e7.f18066e;
                        int i32 = Build.VERSION.SDK_INT;
                        C3295e c3295e3 = C3295e.f7451e;
                        if (i32 < 35) {
                            return c3295e3;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable metrica = AbstractC0879e.metrica(c9000e7.f18062e);
                                if (metrica == null) {
                                    metrica = C13664e.f27089e;
                                }
                                Set m3582e7 = AbstractC13480e.m3582e(metrica);
                                Trace.endSection();
                                return m3582e7;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c3295e3;
                        }
                    default:
                        C9000e c9000e8 = this.f3829e;
                        String str10 = c9000e8.f18066e;
                        int i42 = Build.VERSION.SDK_INT;
                        C3295e c3295e4 = C3295e.f7451e;
                        if (i42 < 28) {
                            return c3295e4;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable Signature = AbstractC17305e.Signature(c9000e8.f18062e);
                                if (Signature == null) {
                                    Signature = C13664e.f27089e;
                                }
                                Set m3582e8 = AbstractC13480e.m3582e(Signature);
                                Trace.endSection();
                                return m3582e8;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c3295e4;
                        }
                }
            }
        });
        final int i5 = 4;
        this.f18063e = AbstractC18039e.appmetrica(2, new Function0(this) { // from class: eؘؒٝ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C9000e f3829e;

            {
                this.f3829e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        C9000e c9000e = this.f3829e;
                        String str2 = c9000e.f18066e;
                        C3295e c3295e = C3295e.f7451e;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C5060e.vip(str2)) + "#supportedExtensions");
                                Set m3582e = Build.VERSION.SDK_INT >= 31 ? AbstractC13480e.m3582e(AbstractC16048e.subscription(c9000e.f18061e.purchase(str2))) : c3295e;
                                Trace.endSection();
                                return m3582e;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C5060e.vip(str2)), e);
                            return c3295e;
                        }
                    case 1:
                        C9000e c9000e2 = this.f3829e;
                        String str3 = c9000e2.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c9000e2.f18062e.getKeys();
                                if (keys == null) {
                                    keys = C13664e.f27089e;
                                }
                                Set m3582e2 = AbstractC13480e.m3582e(keys);
                                Trace.endSection();
                                return m3582e2;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C5060e.vip(str3)) + '}', e2);
                            return C3295e.f7451e;
                        }
                    case 2:
                        C9000e c9000e3 = this.f3829e;
                        String str4 = c9000e3.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c9000e3.f18062e.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = C13664e.f27089e;
                                }
                                Set m3582e3 = AbstractC13480e.m3582e(availableCaptureRequestKeys);
                                Trace.endSection();
                                return m3582e3;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C5060e.vip(str4)), e3);
                            return C3295e.f7451e;
                        }
                    case 3:
                        C9000e c9000e4 = this.f3829e;
                        String str5 = c9000e4.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c9000e4.f18062e.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = C13664e.f27089e;
                                }
                                Set m3582e4 = AbstractC13480e.m3582e(availableCaptureResultKeys);
                                Trace.endSection();
                                return m3582e4;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C5060e.vip(str5)), e4);
                            return C3295e.f7451e;
                        }
                    case 4:
                        C9000e c9000e5 = this.f3829e;
                        String str6 = c9000e5.f18066e;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                try {
                                    Trace.beginSection(((Object) C5060e.vip(str6)) + "#physicalCameraIds");
                                    Set isVip = AbstractC17305e.isVip(c9000e5.f18062e);
                                    Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C5060e.vip(str6)) + ": " + isVip);
                                    Set<String> set2 = isVip;
                                    ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set2, 10));
                                    for (String str7 : set2) {
                                        C5060e.ad(str7);
                                        arrayList.add(new C5060e(str7));
                                    }
                                    Set m3582e5 = AbstractC13480e.m3582e(arrayList);
                                    Trace.endSection();
                                    return m3582e5;
                                } finally {
                                }
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e5);
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e6);
                            }
                        }
                        return C3295e.f7451e;
                    case 5:
                        C9000e c9000e6 = this.f3829e;
                        String str8 = c9000e6.f18066e;
                        int i22 = Build.VERSION.SDK_INT;
                        C3295e c3295e2 = C3295e.f7451e;
                        if (i22 < 28) {
                            return c3295e2;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable loadAd = AbstractC17305e.loadAd(c9000e6.f18062e);
                                if (loadAd == null) {
                                    loadAd = C13664e.f27089e;
                                }
                                Set m3582e6 = AbstractC13480e.m3582e(loadAd);
                                Trace.endSection();
                                return m3582e6;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c3295e2;
                        }
                    case 6:
                        C9000e c9000e7 = this.f3829e;
                        String str9 = c9000e7.f18066e;
                        int i32 = Build.VERSION.SDK_INT;
                        C3295e c3295e3 = C3295e.f7451e;
                        if (i32 < 35) {
                            return c3295e3;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable metrica = AbstractC0879e.metrica(c9000e7.f18062e);
                                if (metrica == null) {
                                    metrica = C13664e.f27089e;
                                }
                                Set m3582e7 = AbstractC13480e.m3582e(metrica);
                                Trace.endSection();
                                return m3582e7;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c3295e3;
                        }
                    default:
                        C9000e c9000e8 = this.f3829e;
                        String str10 = c9000e8.f18066e;
                        int i42 = Build.VERSION.SDK_INT;
                        C3295e c3295e4 = C3295e.f7451e;
                        if (i42 < 28) {
                            return c3295e4;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable Signature = AbstractC17305e.Signature(c9000e8.f18062e);
                                if (Signature == null) {
                                    Signature = C13664e.f27089e;
                                }
                                Set m3582e8 = AbstractC13480e.m3582e(Signature);
                                Trace.endSection();
                                return m3582e8;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c3295e4;
                        }
                }
            }
        });
        final int i6 = 5;
        AbstractC18039e.appmetrica(2, new Function0(this) { // from class: eؘؒٝ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C9000e f3829e;

            {
                this.f3829e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        C9000e c9000e = this.f3829e;
                        String str2 = c9000e.f18066e;
                        C3295e c3295e = C3295e.f7451e;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C5060e.vip(str2)) + "#supportedExtensions");
                                Set m3582e = Build.VERSION.SDK_INT >= 31 ? AbstractC13480e.m3582e(AbstractC16048e.subscription(c9000e.f18061e.purchase(str2))) : c3295e;
                                Trace.endSection();
                                return m3582e;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C5060e.vip(str2)), e);
                            return c3295e;
                        }
                    case 1:
                        C9000e c9000e2 = this.f3829e;
                        String str3 = c9000e2.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c9000e2.f18062e.getKeys();
                                if (keys == null) {
                                    keys = C13664e.f27089e;
                                }
                                Set m3582e2 = AbstractC13480e.m3582e(keys);
                                Trace.endSection();
                                return m3582e2;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C5060e.vip(str3)) + '}', e2);
                            return C3295e.f7451e;
                        }
                    case 2:
                        C9000e c9000e3 = this.f3829e;
                        String str4 = c9000e3.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c9000e3.f18062e.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = C13664e.f27089e;
                                }
                                Set m3582e3 = AbstractC13480e.m3582e(availableCaptureRequestKeys);
                                Trace.endSection();
                                return m3582e3;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C5060e.vip(str4)), e3);
                            return C3295e.f7451e;
                        }
                    case 3:
                        C9000e c9000e4 = this.f3829e;
                        String str5 = c9000e4.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c9000e4.f18062e.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = C13664e.f27089e;
                                }
                                Set m3582e4 = AbstractC13480e.m3582e(availableCaptureResultKeys);
                                Trace.endSection();
                                return m3582e4;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C5060e.vip(str5)), e4);
                            return C3295e.f7451e;
                        }
                    case 4:
                        C9000e c9000e5 = this.f3829e;
                        String str6 = c9000e5.f18066e;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                try {
                                    Trace.beginSection(((Object) C5060e.vip(str6)) + "#physicalCameraIds");
                                    Set isVip = AbstractC17305e.isVip(c9000e5.f18062e);
                                    Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C5060e.vip(str6)) + ": " + isVip);
                                    Set<String> set2 = isVip;
                                    ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set2, 10));
                                    for (String str7 : set2) {
                                        C5060e.ad(str7);
                                        arrayList.add(new C5060e(str7));
                                    }
                                    Set m3582e5 = AbstractC13480e.m3582e(arrayList);
                                    Trace.endSection();
                                    return m3582e5;
                                } finally {
                                }
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e5);
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e6);
                            }
                        }
                        return C3295e.f7451e;
                    case 5:
                        C9000e c9000e6 = this.f3829e;
                        String str8 = c9000e6.f18066e;
                        int i22 = Build.VERSION.SDK_INT;
                        C3295e c3295e2 = C3295e.f7451e;
                        if (i22 < 28) {
                            return c3295e2;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable loadAd = AbstractC17305e.loadAd(c9000e6.f18062e);
                                if (loadAd == null) {
                                    loadAd = C13664e.f27089e;
                                }
                                Set m3582e6 = AbstractC13480e.m3582e(loadAd);
                                Trace.endSection();
                                return m3582e6;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c3295e2;
                        }
                    case 6:
                        C9000e c9000e7 = this.f3829e;
                        String str9 = c9000e7.f18066e;
                        int i32 = Build.VERSION.SDK_INT;
                        C3295e c3295e3 = C3295e.f7451e;
                        if (i32 < 35) {
                            return c3295e3;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable metrica = AbstractC0879e.metrica(c9000e7.f18062e);
                                if (metrica == null) {
                                    metrica = C13664e.f27089e;
                                }
                                Set m3582e7 = AbstractC13480e.m3582e(metrica);
                                Trace.endSection();
                                return m3582e7;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c3295e3;
                        }
                    default:
                        C9000e c9000e8 = this.f3829e;
                        String str10 = c9000e8.f18066e;
                        int i42 = Build.VERSION.SDK_INT;
                        C3295e c3295e4 = C3295e.f7451e;
                        if (i42 < 28) {
                            return c3295e4;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable Signature = AbstractC17305e.Signature(c9000e8.f18062e);
                                if (Signature == null) {
                                    Signature = C13664e.f27089e;
                                }
                                Set m3582e8 = AbstractC13480e.m3582e(Signature);
                                Trace.endSection();
                                return m3582e8;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c3295e4;
                        }
                }
            }
        });
        final int i7 = 6;
        AbstractC18039e.appmetrica(2, new Function0(this) { // from class: eؘؒٝ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C9000e f3829e;

            {
                this.f3829e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        C9000e c9000e = this.f3829e;
                        String str2 = c9000e.f18066e;
                        C3295e c3295e = C3295e.f7451e;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C5060e.vip(str2)) + "#supportedExtensions");
                                Set m3582e = Build.VERSION.SDK_INT >= 31 ? AbstractC13480e.m3582e(AbstractC16048e.subscription(c9000e.f18061e.purchase(str2))) : c3295e;
                                Trace.endSection();
                                return m3582e;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C5060e.vip(str2)), e);
                            return c3295e;
                        }
                    case 1:
                        C9000e c9000e2 = this.f3829e;
                        String str3 = c9000e2.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c9000e2.f18062e.getKeys();
                                if (keys == null) {
                                    keys = C13664e.f27089e;
                                }
                                Set m3582e2 = AbstractC13480e.m3582e(keys);
                                Trace.endSection();
                                return m3582e2;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C5060e.vip(str3)) + '}', e2);
                            return C3295e.f7451e;
                        }
                    case 2:
                        C9000e c9000e3 = this.f3829e;
                        String str4 = c9000e3.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c9000e3.f18062e.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = C13664e.f27089e;
                                }
                                Set m3582e3 = AbstractC13480e.m3582e(availableCaptureRequestKeys);
                                Trace.endSection();
                                return m3582e3;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C5060e.vip(str4)), e3);
                            return C3295e.f7451e;
                        }
                    case 3:
                        C9000e c9000e4 = this.f3829e;
                        String str5 = c9000e4.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c9000e4.f18062e.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = C13664e.f27089e;
                                }
                                Set m3582e4 = AbstractC13480e.m3582e(availableCaptureResultKeys);
                                Trace.endSection();
                                return m3582e4;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C5060e.vip(str5)), e4);
                            return C3295e.f7451e;
                        }
                    case 4:
                        C9000e c9000e5 = this.f3829e;
                        String str6 = c9000e5.f18066e;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                try {
                                    Trace.beginSection(((Object) C5060e.vip(str6)) + "#physicalCameraIds");
                                    Set isVip = AbstractC17305e.isVip(c9000e5.f18062e);
                                    Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C5060e.vip(str6)) + ": " + isVip);
                                    Set<String> set2 = isVip;
                                    ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set2, 10));
                                    for (String str7 : set2) {
                                        C5060e.ad(str7);
                                        arrayList.add(new C5060e(str7));
                                    }
                                    Set m3582e5 = AbstractC13480e.m3582e(arrayList);
                                    Trace.endSection();
                                    return m3582e5;
                                } finally {
                                }
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e5);
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e6);
                            }
                        }
                        return C3295e.f7451e;
                    case 5:
                        C9000e c9000e6 = this.f3829e;
                        String str8 = c9000e6.f18066e;
                        int i22 = Build.VERSION.SDK_INT;
                        C3295e c3295e2 = C3295e.f7451e;
                        if (i22 < 28) {
                            return c3295e2;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable loadAd = AbstractC17305e.loadAd(c9000e6.f18062e);
                                if (loadAd == null) {
                                    loadAd = C13664e.f27089e;
                                }
                                Set m3582e6 = AbstractC13480e.m3582e(loadAd);
                                Trace.endSection();
                                return m3582e6;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c3295e2;
                        }
                    case 6:
                        C9000e c9000e7 = this.f3829e;
                        String str9 = c9000e7.f18066e;
                        int i32 = Build.VERSION.SDK_INT;
                        C3295e c3295e3 = C3295e.f7451e;
                        if (i32 < 35) {
                            return c3295e3;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable metrica = AbstractC0879e.metrica(c9000e7.f18062e);
                                if (metrica == null) {
                                    metrica = C13664e.f27089e;
                                }
                                Set m3582e7 = AbstractC13480e.m3582e(metrica);
                                Trace.endSection();
                                return m3582e7;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c3295e3;
                        }
                    default:
                        C9000e c9000e8 = this.f3829e;
                        String str10 = c9000e8.f18066e;
                        int i42 = Build.VERSION.SDK_INT;
                        C3295e c3295e4 = C3295e.f7451e;
                        if (i42 < 28) {
                            return c3295e4;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable Signature = AbstractC17305e.Signature(c9000e8.f18062e);
                                if (Signature == null) {
                                    Signature = C13664e.f27089e;
                                }
                                Set m3582e8 = AbstractC13480e.m3582e(Signature);
                                Trace.endSection();
                                return m3582e8;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c3295e4;
                        }
                }
            }
        });
        final int i8 = 7;
        this.f18065e = AbstractC18039e.appmetrica(2, new Function0(this) { // from class: eؘؒٝ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C9000e f3829e;

            {
                this.f3829e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        C9000e c9000e = this.f3829e;
                        String str2 = c9000e.f18066e;
                        C3295e c3295e = C3295e.f7451e;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) C5060e.vip(str2)) + "#supportedExtensions");
                                Set m3582e = Build.VERSION.SDK_INT >= 31 ? AbstractC13480e.m3582e(AbstractC16048e.subscription(c9000e.f18061e.purchase(str2))) : c3295e;
                                Trace.endSection();
                                return m3582e;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) C5060e.vip(str2)), e);
                            return c3295e;
                        }
                    case 1:
                        C9000e c9000e2 = this.f3829e;
                        String str3 = c9000e2.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = c9000e2.f18062e.getKeys();
                                if (keys == null) {
                                    keys = C13664e.f27089e;
                                }
                                Set m3582e2 = AbstractC13480e.m3582e(keys);
                                Trace.endSection();
                                return m3582e2;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) C5060e.vip(str3)) + '}', e2);
                            return C3295e.f7451e;
                        }
                    case 2:
                        C9000e c9000e3 = this.f3829e;
                        String str4 = c9000e3.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c9000e3.f18062e.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = C13664e.f27089e;
                                }
                                Set m3582e3 = AbstractC13480e.m3582e(availableCaptureRequestKeys);
                                Trace.endSection();
                                return m3582e3;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) C5060e.vip(str4)), e3);
                            return C3295e.f7451e;
                        }
                    case 3:
                        C9000e c9000e4 = this.f3829e;
                        String str5 = c9000e4.f18066e;
                        try {
                            try {
                                Trace.beginSection(((Object) C5060e.vip(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = c9000e4.f18062e.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = C13664e.f27089e;
                                }
                                Set m3582e4 = AbstractC13480e.m3582e(availableCaptureResultKeys);
                                Trace.endSection();
                                return m3582e4;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) C5060e.vip(str5)), e4);
                            return C3295e.f7451e;
                        }
                    case 4:
                        C9000e c9000e5 = this.f3829e;
                        String str6 = c9000e5.f18066e;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                try {
                                    Trace.beginSection(((Object) C5060e.vip(str6)) + "#physicalCameraIds");
                                    Set isVip = AbstractC17305e.isVip(c9000e5.f18062e);
                                    Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) C5060e.vip(str6)) + ": " + isVip);
                                    Set<String> set2 = isVip;
                                    ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set2, 10));
                                    for (String str7 : set2) {
                                        C5060e.ad(str7);
                                        arrayList.add(new C5060e(str7));
                                    }
                                    Set m3582e5 = AbstractC13480e.m3582e(arrayList);
                                    Trace.endSection();
                                    return m3582e5;
                                } finally {
                                }
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e5);
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) C5060e.vip(str6)), e6);
                            }
                        }
                        return C3295e.f7451e;
                    case 5:
                        C9000e c9000e6 = this.f3829e;
                        String str8 = c9000e6.f18066e;
                        int i22 = Build.VERSION.SDK_INT;
                        C3295e c3295e2 = C3295e.f7451e;
                        if (i22 < 28) {
                            return c3295e2;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable loadAd = AbstractC17305e.loadAd(c9000e6.f18062e);
                                if (loadAd == null) {
                                    loadAd = C13664e.f27089e;
                                }
                                Set m3582e6 = AbstractC13480e.m3582e(loadAd);
                                Trace.endSection();
                                return m3582e6;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c3295e2;
                        }
                    case 6:
                        C9000e c9000e7 = this.f3829e;
                        String str9 = c9000e7.f18066e;
                        int i32 = Build.VERSION.SDK_INT;
                        C3295e c3295e3 = C3295e.f7451e;
                        if (i32 < 35) {
                            return c3295e3;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable metrica = AbstractC0879e.metrica(c9000e7.f18062e);
                                if (metrica == null) {
                                    metrica = C13664e.f27089e;
                                }
                                Set m3582e7 = AbstractC13480e.m3582e(metrica);
                                Trace.endSection();
                                return m3582e7;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c3295e3;
                        }
                    default:
                        C9000e c9000e8 = this.f3829e;
                        String str10 = c9000e8.f18066e;
                        int i42 = Build.VERSION.SDK_INT;
                        C3295e c3295e4 = C3295e.f7451e;
                        if (i42 < 28) {
                            return c3295e4;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable Signature = AbstractC17305e.Signature(c9000e8.f18062e);
                                if (Signature == null) {
                                    Signature = C13664e.f27089e;
                                }
                                Set m3582e8 = AbstractC13480e.m3582e(Signature);
                                Trace.endSection();
                                return m3582e8;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c3295e4;
                        }
                }
            }
        });
    }

    public final Object metrica(CameraCharacteristics.Key key) {
        Object obj;
        if (this.f18064e.contains(key)) {
            try {
                return this.f18062e.get(key);
            } catch (AssertionError unused) {
                throw new IllegalStateException("Failed to get characteristic for " + key + ": Framework throw an AssertionError");
            }
        }
        synchronized (this.f18060e) {
            obj = this.f18060e.get(key);
        }
        if (obj != null) {
            return obj;
        }
        try {
            Object obj2 = this.f18062e.get(key);
            if (obj2 == null) {
                return obj2;
            }
            synchronized (this.f18060e) {
                this.f18060e.put(key, obj2);
                Unit unit = Unit.INSTANCE;
            }
            return obj2;
        } catch (AssertionError unused2) {
            throw new IllegalStateException("Failed to get characteristic for " + key + ": Framework throw an AssertionError");
        }
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e.equals(AbstractC3820e.ad.vip(CameraCharacteristics.class))) {
            return this.f18062e;
        }
        return null;
    }
}
