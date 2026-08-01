package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteListingPreference;
import android.os.CancellationSignal;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.util.Log;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5666e {
    public static int Signature(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static final void ad(CursorAnchorInfo.Builder builder, C12476e c12476e, C0763e c0763e) {
        if (c0763e.mopub()) {
            return;
        }
        C12890e c12890e = c12476e.vip;
        int i = c12890e.purchase - 1;
        if (i < 0) {
            i = 0;
        }
        int metrica = AbstractC3062e.metrica(c12890e.appmetrica(c0763e.vip), 0, i);
        int metrica2 = AbstractC3062e.metrica(c12890e.appmetrica(c0763e.license), 0, i);
        if (metrica > metrica2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(c12476e.billing(metrica), c12890e.purchase(metrica), c12476e.yandex(metrica), c12890e.vip(metrica));
            if (metrica == metrica2) {
                return;
            } else {
                metrica++;
            }
        }
    }

    public static Set adcel(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    public static int admob(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static void ads(long j, C10566e c10566e, boolean z, C13749e c13749e) {
        if (z) {
            j = AbstractC11613e.vip(j, c10566e);
        }
        int i = (int) (4294967295L & j);
        c13749e.invoke(new C11390e(new InterfaceC5366e[]{new C8930e(i, i), new C13266e(C12347e.appmetrica(j), 0)}));
    }

    public static int advert(Context context) {
        return context.getDeviceId();
    }

    public static float amazon(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static final void applovin(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        captureCallback.onReadoutStarted(cameraCaptureSession, captureRequest, j, j2);
    }

    public static int appmetrica(HandwritingGesture handwritingGesture, C13749e c13749e) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c13749e.invoke(new C6155e(fallbackText, 1));
        return 5;
    }

    public static float billing(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    /* renamed from: class, reason: not valid java name */
    public static void m1955class(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }

    public static boolean crashlytics(C7911e c7911e, PreviewableHandwritingGesture previewableHandwritingGesture, C15860e c15860e, CancellationSignal cancellationSignal) {
        C10566e c10566e = c7911e.adcel;
        if (c10566e != null) {
            C0866e license = c7911e.license();
            if (c10566e.equals(license != null ? license.ad.ad.ad : null)) {
                boolean z = previewableHandwritingGesture instanceof SelectGesture;
                EnumC13262e enumC13262e = EnumC13262e.f26311e;
                if (z) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (c15860e != null) {
                        long amazon = AbstractC11613e.amazon(c7911e, AbstractC9764e.smaato(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        C7911e c7911e2 = c15860e.license;
                        if (c7911e2 != null) {
                            c7911e2.purchase(amazon);
                        }
                        C7911e c7911e3 = c15860e.license;
                        if (c7911e3 != null) {
                            c7911e3.appmetrica(C12347e.vip);
                        }
                        if (!C12347e.license(amazon)) {
                            c15860e.pro(false);
                            c15860e.admob(enumC13262e);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (c15860e != null) {
                        long amazon2 = AbstractC11613e.amazon(c7911e, AbstractC9764e.smaato(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        C7911e c7911e4 = c15860e.license;
                        if (c7911e4 != null) {
                            c7911e4.appmetrica(amazon2);
                        }
                        C7911e c7911e5 = c15860e.license;
                        if (c7911e5 != null) {
                            c7911e5.purchase(C12347e.vip);
                        }
                        if (!C12347e.license(amazon2)) {
                            c15860e.pro(false);
                            c15860e.admob(enumC13262e);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (c15860e != null) {
                        long license2 = AbstractC11613e.license(c7911e, AbstractC9764e.smaato(selectRangeGesture.getSelectionStartArea()), AbstractC9764e.smaato(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        C7911e c7911e6 = c15860e.license;
                        if (c7911e6 != null) {
                            c7911e6.purchase(license2);
                        }
                        C7911e c7911e7 = c15860e.license;
                        if (c7911e7 != null) {
                            c7911e7.appmetrica(C12347e.vip);
                        }
                        if (!C12347e.license(license2)) {
                            c15860e.pro(false);
                            c15860e.admob(enumC13262e);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (c15860e != null) {
                        long license3 = AbstractC11613e.license(c7911e, AbstractC9764e.smaato(deleteRangeGesture.getDeletionStartArea()), AbstractC9764e.smaato(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        C7911e c7911e8 = c15860e.license;
                        if (c7911e8 != null) {
                            c7911e8.appmetrica(license3);
                        }
                        C7911e c7911e9 = c15860e.license;
                        if (c7911e9 != null) {
                            c7911e9.purchase(C12347e.vip);
                        }
                        if (!C12347e.license(license3)) {
                            c15860e.pro(false);
                            c15860e.admob(enumC13262e);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new C6938e(1, c15860e));
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: extends, reason: not valid java name */
    public static void m1956extends(MediaRouter2 mediaRouter2, RouteListingPreference routeListingPreference) {
        mediaRouter2.setRouteListingPreference(routeListingPreference);
    }

    public static boolean firebase(C11388e c11388e, PreviewableHandwritingGesture previewableHandwritingGesture, C7102e c7102e, CancellationSignal cancellationSignal) {
        if (previewableHandwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
            remoteconfig(c11388e, AbstractC11613e.loadAd(c7102e, AbstractC9764e.smaato(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
            remoteconfig(c11388e, AbstractC11613e.loadAd(c7102e, AbstractC9764e.smaato(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() == 1 ? 1 : 0), 1);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
            remoteconfig(c11388e, AbstractC11613e.appmetrica(c7102e, AbstractC9764e.smaato(selectRangeGesture.getSelectionStartArea()), AbstractC9764e.smaato(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
            remoteconfig(c11388e, AbstractC11613e.appmetrica(c7102e, AbstractC9764e.smaato(deleteRangeGesture.getDeletionStartArea()), AbstractC9764e.smaato(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() == 1 ? 1 : 0), 1);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new C6938e(2, c11388e));
        }
        return true;
    }

    /* renamed from: goto, reason: not valid java name */
    public static void m1957goto(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static final boolean inmobi(InterfaceC2531e interfaceC2531e) {
        int[] iArr = (int[]) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
        return iArr != null && AbstractC1660e.startapp(iArr, 1);
    }

    /* renamed from: interface, reason: not valid java name */
    public static void m1958interface(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static final ColorSpace isPro(AbstractC14213e abstractC14213e) {
        if (AbstractC7890e.billing(abstractC14213e, C4717e.tapsense)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (AbstractC7890e.billing(abstractC14213e, C4717e.isVip)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static boolean isVip(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static int license(C11388e c11388e, HandwritingGesture handwritingGesture) {
        C12380e c12380e = c11388e.ad;
        InterfaceC12006e interfaceC12006e = c11388e.vip;
        c12380e.vip.ad().admob();
        C2573e c2573e = c12380e.vip;
        c2573e.f6431e = null;
        c11388e.advert(c2573e);
        C12380e.ad(c12380e, interfaceC12006e, true, 1);
        c12380e.license(true);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        C11388e.yandex(c11388e, fallbackText, false, 12);
        return 5;
    }

    public static float loadAd(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static Context metrica(Context context, int i) {
        return context.createDeviceContext(i);
    }

    public static int mopub(Context context) {
        return context.getDeviceId();
    }

    /* renamed from: native, reason: not valid java name */
    public static void m1959native(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [eؚؖٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [eؚؖٞ, java.lang.Object] */
    public static int premium(C7911e c7911e, HandwritingGesture handwritingGesture, C15860e c15860e, InterfaceC11678e interfaceC11678e, C13749e c13749e) {
        int i;
        C0866e license;
        C0866e license2;
        C10566e c10566e = c7911e.adcel;
        if (c10566e == null) {
            return 3;
        }
        C0866e license3 = c7911e.license();
        if (!c10566e.equals(license3 != null ? license3.ad.ad.ad : null)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long amazon = AbstractC11613e.amazon(c7911e, AbstractC9764e.smaato(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (C12347e.license(amazon)) {
                return appmetrica(selectGesture, c13749e);
            }
            c13749e.invoke(new C8930e((int) (amazon >> 32), (int) (amazon & 4294967295L)));
            if (c15860e != null) {
                c15860e.yandex(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i2 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long amazon2 = AbstractC11613e.amazon(c7911e, AbstractC9764e.smaato(deleteGesture.getDeletionArea()), i2);
                if (C12347e.license(amazon2)) {
                    return appmetrica(deleteGesture, c13749e);
                }
                ads(amazon2, c10566e, i2 == 1, c13749e);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i3 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long license4 = AbstractC11613e.license(c7911e, AbstractC9764e.smaato(deleteRangeGesture.getDeletionStartArea()), AbstractC9764e.smaato(deleteRangeGesture.getDeletionEndArea()), i3);
                    if (C12347e.license(license4)) {
                        return appmetrica(deleteRangeGesture, c13749e);
                    }
                    ads(license4, c10566e, i3 == 1, c13749e);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (interfaceC11678e == null) {
                        return appmetrica(joinOrSplitGesture, c13749e);
                    }
                    long yandex = AbstractC11613e.yandex(joinOrSplitGesture.getJoinOrSplitPoint());
                    C0866e license5 = c7911e.license();
                    int smaato = license5 != null ? AbstractC11613e.smaato(license5.ad.vip, yandex, c7911e.metrica(), interfaceC11678e) : -1;
                    if (smaato == -1 || ((license2 = c7911e.license()) != null && AbstractC11613e.purchase(license2.ad, smaato))) {
                        return appmetrica(joinOrSplitGesture, c13749e);
                    }
                    long billing = AbstractC11613e.billing(c10566e, smaato);
                    if (!C12347e.license(billing)) {
                        ads(billing, c10566e, false, c13749e);
                        return 1;
                    }
                    int i4 = (int) (billing >> 32);
                    c13749e.invoke(new C11390e(new InterfaceC5366e[]{new C8930e(i4, i4), new C6155e(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (interfaceC11678e == null) {
                        return appmetrica(insertGesture, c13749e);
                    }
                    long yandex2 = AbstractC11613e.yandex(insertGesture.getInsertionPoint());
                    C0866e license6 = c7911e.license();
                    int smaato2 = license6 != null ? AbstractC11613e.smaato(license6.ad.vip, yandex2, c7911e.metrica(), interfaceC11678e) : -1;
                    if (smaato2 == -1 || ((license = c7911e.license()) != null && AbstractC11613e.purchase(license.ad, smaato2))) {
                        return appmetrica(insertGesture, c13749e);
                    }
                    c13749e.invoke(new C11390e(new InterfaceC5366e[]{new C8930e(smaato2, smaato2), new C6155e(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                C0866e license7 = c7911e.license();
                long metrica = AbstractC11613e.metrica(license7 != null ? license7.ad : null, AbstractC11613e.yandex(removeSpaceGesture.getStartPoint()), AbstractC11613e.yandex(removeSpaceGesture.getEndPoint()), c7911e.metrica(), interfaceC11678e);
                if (C12347e.license(metrica)) {
                    return appmetrica(removeSpaceGesture, c13749e);
                }
                ?? obj = new Object();
                obj.f8852e = -1;
                ?? obj2 = new Object();
                obj2.f8852e = -1;
                String appmetrica = new C10445e("\\s+").appmetrica(AbstractC9262e.appmetrica(metrica, c10566e), new C5871e(obj, obj2, r12 ? 1 : 0));
                int i5 = obj.f8852e;
                if (i5 == -1 || (i = obj2.f8852e) == -1) {
                    return appmetrica(removeSpaceGesture, c13749e);
                }
                int i6 = (int) (metrica >> 32);
                c13749e.invoke(new C11390e(new InterfaceC5366e[]{new C8930e(i6 + i5, i6 + i), new C6155e(appmetrica.substring(i5, appmetrica.length() - (C12347e.appmetrica(metrica) - obj2.f8852e)), 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long license8 = AbstractC11613e.license(c7911e, AbstractC9764e.smaato(selectRangeGesture.getSelectionStartArea()), AbstractC9764e.smaato(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (C12347e.license(license8)) {
                return appmetrica(selectRangeGesture, c13749e);
            }
            c13749e.invoke(new C8930e((int) (license8 >> 32), (int) (license8 & 4294967295L)));
            if (c15860e != null) {
                c15860e.yandex(true);
            }
        }
        return 1;
    }

    public static boolean pro(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* renamed from: protected, reason: not valid java name */
    public static RouteListingPreference m1960protected(C10575e c10575e) {
        ArrayList arrayList = new ArrayList();
        for (C11620e c11620e : c10575e.ad) {
            arrayList.add(new RouteListingPreference.Item.Builder(c11620e.ad).setFlags(0).setSubText(0).setCustomSubtextMessage(null).setSelectionBehavior(c11620e.vip).build());
        }
        return new RouteListingPreference.Builder().setItems(arrayList).setLinkedItemComponentName(null).setUseSystemOrdering(c10575e.vip).build();
    }

    public static AccessibilityNodeInfo.AccessibilityAction purchase() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static void remoteconfig(C11388e c11388e, long j, int i) {
        if (C12347e.license(j)) {
            C12380e c12380e = c11388e.ad;
            InterfaceC12006e interfaceC12006e = c11388e.vip;
            c12380e.vip.ad().admob();
            C2573e c2573e = c12380e.vip;
            c2573e.f6431e = null;
            c11388e.advert(c2573e);
            C12380e.ad(c12380e, interfaceC12006e, true, 1);
            c12380e.license(true);
            return;
        }
        long appmetrica = c11388e.appmetrica(j);
        C12380e c12380e2 = c11388e.ad;
        InterfaceC12006e interfaceC12006e2 = c11388e.vip;
        c12380e2.vip.ad().admob();
        C2573e c2573e2 = c12380e2.vip;
        int i2 = (int) (appmetrica >> 32);
        int i3 = (int) (appmetrica & 4294967295L);
        C4860e c4860e = c2573e2.f6429e;
        if (i2 >= i3) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i2, i3, "Do not set reversed or empty range: ", " > "));
        }
        c2573e2.f6431e = new C6571e(new C6768e(i), new C12347e(AbstractC9262e.metrica(AbstractC3062e.metrica(i2, 0, c4860e.length()), AbstractC3062e.metrica(i3, 0, c4860e.length()))));
        C12380e.ad(c12380e2, interfaceC12006e2, true, 1);
        c12380e2.license(true);
    }

    public static final boolean signatures(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.isCaptureProcessProgressAvailable(i);
    }

    public static int[] smaato(C6458e c6458e, RectF rectF, int i, final C11213e c11213e) {
        return c6458e.purchase.getRangeForRect(rectF, i == 1 ? new C5274e(new C3168e(c6458e.purchase.getText(), c6458e.adcel(), 26)) : new GraphemeClusterSegmentFinder(c6458e.purchase.getText(), c6458e.ad), new Layout.TextInclusionStrategy() { // from class: eٍؘۡ
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) C11213e.this.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static CharSequence startapp(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eؚؖٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [eؚؖٞ, java.lang.Object] */
    public static int subs(C11388e c11388e, HandwritingGesture handwritingGesture, C7102e c7102e, Function0 function0, InterfaceC11678e interfaceC11678e) {
        int i;
        C12476e metrica;
        int i2;
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long loadAd = AbstractC11613e.loadAd(c7102e, AbstractC9764e.smaato(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (C12347e.license(loadAd)) {
                return license(c11388e, selectGesture);
            }
            c11388e.adcel(loadAd);
            if (function0 != null) {
                function0.invoke();
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                i2 = deleteGesture.getGranularity() == 1 ? 1 : 0;
                long loadAd2 = AbstractC11613e.loadAd(c7102e, AbstractC9764e.smaato(deleteGesture.getDeletionArea()), i2);
                if (C12347e.license(loadAd2)) {
                    return license(c11388e, deleteGesture);
                }
                if (i2 == 1) {
                    loadAd2 = AbstractC11613e.vip(loadAd2, c11388e.license());
                }
                C11388e.startapp(c11388e, BuildConfig.FLAVOR, loadAd2, false, 12);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    i2 = deleteRangeGesture.getGranularity() == 1 ? 1 : 0;
                    long appmetrica = AbstractC11613e.appmetrica(c7102e, AbstractC9764e.smaato(deleteRangeGesture.getDeletionStartArea()), AbstractC9764e.smaato(deleteRangeGesture.getDeletionEndArea()), i2);
                    if (C12347e.license(appmetrica)) {
                        return license(c11388e, deleteRangeGesture);
                    }
                    if (i2 == 1) {
                        appmetrica = AbstractC11613e.vip(appmetrica, c11388e.license());
                    }
                    C11388e.startapp(c11388e, BuildConfig.FLAVOR, appmetrica, false, 12);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (c11388e.ad.vip() != c11388e.ad.vip()) {
                        return 3;
                    }
                    long yandex = AbstractC11613e.yandex(joinOrSplitGesture.getJoinOrSplitPoint());
                    C12476e metrica2 = c7102e.metrica();
                    int smaato = metrica2 != null ? AbstractC11613e.smaato(metrica2.vip, yandex, c7102e.appmetrica(), interfaceC11678e) : -1;
                    if (smaato == -1 || ((metrica = c7102e.metrica()) != null && AbstractC11613e.purchase(metrica, smaato))) {
                        return license(c11388e, joinOrSplitGesture);
                    }
                    long billing = AbstractC11613e.billing(c11388e.license(), smaato);
                    if (C12347e.license(billing)) {
                        C11388e.startapp(c11388e, " ", billing, false, 12);
                        return 1;
                    }
                    C11388e.startapp(c11388e, BuildConfig.FLAVOR, billing, false, 12);
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    long yandex2 = AbstractC11613e.yandex(insertGesture.getInsertionPoint());
                    C12476e metrica3 = c7102e.metrica();
                    int smaato2 = metrica3 != null ? AbstractC11613e.smaato(metrica3.vip, yandex2, c7102e.appmetrica(), interfaceC11678e) : -1;
                    if (smaato2 == -1) {
                        return license(c11388e, insertGesture);
                    }
                    C11388e.startapp(c11388e, insertGesture.getTextToInsert(), AbstractC9262e.metrica(smaato2, smaato2), false, 12);
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                long metrica4 = AbstractC11613e.metrica(c7102e.metrica(), AbstractC11613e.yandex(removeSpaceGesture.getStartPoint()), AbstractC11613e.yandex(removeSpaceGesture.getEndPoint()), c7102e.appmetrica(), interfaceC11678e);
                if (C12347e.license(metrica4)) {
                    return license(c11388e, removeSpaceGesture);
                }
                ?? obj = new Object();
                obj.f8852e = -1;
                ?? obj2 = new Object();
                obj2.f8852e = -1;
                String appmetrica2 = new C10445e("\\s+").appmetrica(AbstractC9262e.appmetrica(metrica4, c11388e.license()), new C5871e(obj, obj2, 1));
                int i3 = obj.f8852e;
                if (i3 == -1 || (i = obj2.f8852e) == -1) {
                    return license(c11388e, removeSpaceGesture);
                }
                int i4 = (int) (metrica4 >> 32);
                C11388e.startapp(c11388e, appmetrica2.substring(obj.f8852e, appmetrica2.length() - (C12347e.appmetrica(metrica4) - obj2.f8852e)), AbstractC9262e.metrica(i3 + i4, i4 + i), false, 12);
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long appmetrica3 = AbstractC11613e.appmetrica(c7102e, AbstractC9764e.smaato(selectRangeGesture.getSelectionStartArea()), AbstractC9764e.smaato(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (C12347e.license(appmetrica3)) {
                return license(c11388e, selectRangeGesture);
            }
            c11388e.adcel(appmetrica3);
            if (function0 != null) {
                function0.invoke();
            }
        }
        return 1;
    }

    public static int subscription(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    public static final boolean tapsense(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.isPostviewAvailable(i);
    }

    /* renamed from: this, reason: not valid java name */
    public static void m1961this(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(AbstractC6874e.startapp(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(AbstractC1660e.m664case(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    /* renamed from: throw, reason: not valid java name */
    public static final void m1962throw(ExtensionSessionConfiguration extensionSessionConfiguration, OutputConfiguration outputConfiguration) {
        extensionSessionConfiguration.setPostviewOutputConfiguration(outputConfiguration);
    }

    /* renamed from: try, reason: not valid java name */
    public static boolean m1963try(MediaRouter2 mediaRouter2) {
        return mediaRouter2.showSystemOutputSwitcher();
    }

    public static final void vip(CursorAnchorInfo.Builder builder, C12476e c12476e, C0763e c0763e) {
        if (c0763e.mopub()) {
            return;
        }
        C12890e c12890e = c12476e.vip;
        int i = c12890e.purchase - 1;
        if (i < 0) {
            i = 0;
        }
        int metrica = AbstractC3062e.metrica(c12890e.appmetrica(c0763e.vip), 0, i);
        int metrica2 = AbstractC3062e.metrica(c12890e.appmetrica(c0763e.license), 0, i);
        if (metrica > metrica2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(c12476e.billing(metrica), c12890e.purchase(metrica), c12476e.yandex(metrica), c12890e.vip(metrica));
            if (metrica == metrica2) {
                return;
            } else {
                metrica++;
            }
        }
    }

    /* renamed from: while, reason: not valid java name */
    public static final void m1964while(LinkedHashMap linkedHashMap) {
        linkedHashMap.put(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }

    public static void yandex(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }
}
