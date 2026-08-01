package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Bitmap;
import android.media.MediaDrm;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.textclassifier.TextClassifier;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18474e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f36216e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f36217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18474e(InterfaceC5083e interfaceC5083e, C6455e c6455e) {
        super(2, interfaceC5083e);
        this.f36216e = 22;
        this.f36217e = c6455e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18474e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f36216e = i;
        this.f36217e = obj;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f36216e) {
            case 0:
                return new C18474e((C14873e) this.f36217e, interfaceC5083e, 0);
            case 1:
                return new C18474e((C9289e) this.f36217e, interfaceC5083e, 1);
            case 2:
                return new C18474e((C4837e) this.f36217e, interfaceC5083e, 2);
            case 3:
                return new C18474e((C13189e) this.f36217e, interfaceC5083e, 3);
            case 4:
                return new C18474e((Function0) this.f36217e, interfaceC5083e, 4);
            case 5:
                return new C18474e((C7838e) this.f36217e, interfaceC5083e, 5);
            case 6:
                return new C18474e((String) this.f36217e, interfaceC5083e, 6);
            case 7:
                return new C18474e((C4246e) this.f36217e, interfaceC5083e, 7);
            case 8:
                return new C18474e((C4199e) this.f36217e, interfaceC5083e, 8);
            case 9:
                return new C18474e((C11469e) this.f36217e, interfaceC5083e, 9);
            case 10:
                return new C18474e((C8688e) this.f36217e, interfaceC5083e, 10);
            case 11:
                return new C18474e((C12340e) this.f36217e, interfaceC5083e, 11);
            case 12:
                return new C18474e((C0073e) this.f36217e, interfaceC5083e, 12);
            case 13:
                return new C18474e((C6621e) this.f36217e, interfaceC5083e, 13);
            case 14:
                return new C18474e((C11188e) this.f36217e, interfaceC5083e, 14);
            case 15:
                return new C18474e((C13355e) this.f36217e, interfaceC5083e, 15);
            case 16:
                return new C18474e((C5422e) this.f36217e, interfaceC5083e, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C18474e((C18480e) this.f36217e, interfaceC5083e, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C18474e((C16869e) this.f36217e, interfaceC5083e, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C18474e((C0149e) this.f36217e, interfaceC5083e, 19);
            case 20:
                return new C18474e((C14214e) this.f36217e, interfaceC5083e, 20);
            case 21:
                return new C18474e((C6571e) this.f36217e, interfaceC5083e, 21);
            case 22:
                return new C18474e(interfaceC5083e, (C6455e) this.f36217e);
            case 23:
                return new C18474e((Bitmap) this.f36217e, interfaceC5083e, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C18474e((ViewOnAttachStateChangeListenerC3798e) this.f36217e, interfaceC5083e, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C18474e((C5891e) this.f36217e, interfaceC5083e, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C18474e((C13372e) this.f36217e, interfaceC5083e, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C18474e((C11268e) this.f36217e, interfaceC5083e, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C18474e((C10345e) this.f36217e, interfaceC5083e, 28);
            default:
                return new C18474e((C18100e) this.f36217e, interfaceC5083e, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36216e) {
            case 0:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C18474e) advert((InterfaceC5083e) obj2, (C12318e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C18474e) advert((InterfaceC5083e) obj2, (Unit) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 10:
                C18474e c18474e = (C18474e) advert((InterfaceC5083e) obj2, (C8688e) obj);
                AbstractC2003e.purchase(Unit.INSTANCE);
                return (C8688e) c18474e.f36217e;
            case 11:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C18474e) advert((InterfaceC5083e) obj2, (C4315e) obj)).loadAd(Unit.INSTANCE);
            case 15:
                C18474e c18474e2 = (C18474e) advert((InterfaceC5083e) obj2, (C13355e) obj);
                AbstractC2003e.purchase(Unit.INSTANCE);
                return (C13355e) c18474e2.f36217e;
            case 16:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 20:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 21:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C18474e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [eِٖۢ, eِٜؒ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC16049e abstractC16049e;
        AbstractC16049e abstractC16049e2;
        InterfaceC2784e interfaceC2784e;
        boolean z = true;
        z = true;
        int i = 2;
        Object obj2 = null;
        switch (this.f36216e) {
            case 0:
                AbstractC2003e.purchase(obj);
                ((C14873e) this.f36217e).mo734case();
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                C9289e c9289e = (C9289e) this.f36217e;
                AbstractC5336e.purchase(c9289e.appmetrica, null, 0, new C11662e(c9289e, r5, i), 3);
                return Unit.INSTANCE;
            case 2:
                AbstractC2003e.purchase(obj);
                C4837e c4837e = (C4837e) this.f36217e;
                AbstractC5336e.purchase(c4837e.billing, null, 0, new C0145e(c4837e, r5, z ? 1 : 0), 3);
                return Unit.INSTANCE;
            case 3:
                AbstractC2003e.purchase(obj);
                C13189e c13189e = (C13189e) this.f36217e;
                TextClassifier smaato = AbstractC17305e.smaato(c13189e.vip, c13189e.metrica);
                c13189e.purchase = smaato;
                return smaato;
            case 4:
                AbstractC2003e.purchase(obj);
                return ((Function0) this.f36217e).invoke();
            case 5:
                AbstractC2003e.purchase(obj);
                C12318e c12318e = ((C7838e) this.f36217e).f15864e;
                if (c12318e != null) {
                    c12318e.pro();
                }
                return Unit.INSTANCE;
            case 6:
                String str = (String) this.f36217e;
                AbstractC2003e.purchase(obj);
                C12894e c12894e = C7838e.f15858e;
                if (c12894e == null) {
                    c12894e = null;
                }
                C14609e vip = ((C7838e) ((C14136e) c12894e.f25751e).invoke()).vip();
                if (!AbstractC7890e.billing((vip == null || (abstractC16049e2 = vip.vip) == null) ? null : abstractC16049e2.getAd(), str)) {
                    C12894e c12894e2 = C7838e.f15858e;
                    if (c12894e2 == null) {
                        c12894e2 = null;
                    }
                    C14609e vip2 = ((C7838e) ((C14136e) c12894e2.f25751e).invoke()).vip();
                    if (!AbstractC7890e.billing((vip2 == null || (abstractC16049e = vip2.vip) == null) ? null : abstractC16049e.Signature(), str)) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                C12894e c12894e3 = C7838e.f15858e;
                if (c12894e3 == null) {
                    c12894e3 = null;
                }
                if (((C7838e) ((C14136e) c12894e3.f25751e).invoke()).appmetrica() == EnumC11342e.f22808e) {
                    C12894e c12894e4 = C7838e.f15858e;
                    ((C7838e) ((C14136e) (c12894e4 != null ? c12894e4 : null).f25751e).invoke()).adcel();
                } else {
                    C12894e c12894e5 = C7838e.f15858e;
                    ((C7838e) ((C14136e) (c12894e5 != null ? c12894e5 : 0).f25751e).invoke()).smaato();
                }
                return Boolean.valueOf(z);
            case 7:
                AbstractC2003e.purchase(obj);
                ((C4246e) this.f36217e).f9318e = null;
                return Unit.INSTANCE;
            case 8:
                AbstractC2003e.purchase(obj);
                C14214e c14214e = ((C4199e) this.f36217e).f9253e;
                long j = c14214e.loadAd;
                String str2 = AbstractC6766e.ad;
                if (j == Thread.currentThread().getId() && c14214e.pro.license()) {
                    throw new IllegalStateException("Cannot close in a transaction block");
                }
                AbstractC5418e.startapp(new C7236e(c14214e, (InterfaceC5083e) r5, 23));
                AbstractC9743e.license(((C4199e) this.f36217e).f9255e, null);
                C0149e c0149e = ((C4199e) this.f36217e).f9250e;
                AbstractC5336e.yandex(c0149e.Signature, new C18474e(c0149e, r5, 19));
                ((C4199e) this.f36217e).f9246e.ad();
                AutoCloseable autoCloseable = (AutoCloseable) ((C4199e) this.f36217e).f9249e.ad;
                if (autoCloseable != null) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        AbstractC6418e.smaato((ExecutorService) autoCloseable);
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                    } else if (autoCloseable instanceof DrmManagerClient) {
                        ((DrmManagerClient) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof ContentProviderClient)) {
                            throw new IllegalArgumentException();
                        }
                        ((ContentProviderClient) autoCloseable).release();
                    }
                }
                C4199e c4199e = (C4199e) this.f36217e;
                ((C14911e) c4199e.f22046e).vip("Realm closed: " + c4199e, new Object[0]);
                return Unit.INSTANCE;
            case 9:
                AbstractC2003e.purchase(obj);
                C11469e c11469e = (C11469e) this.f36217e;
                if (c11469e != null && (interfaceC2784e = c11469e.purchase) != null) {
                    interfaceC2784e.ad(c11469e);
                }
                return Unit.INSTANCE;
            case 10:
                AbstractC2003e.purchase(obj);
                return (C8688e) this.f36217e;
            case 11:
                AbstractC2003e.purchase(obj);
                ((C12340e) this.f36217e).purchase();
                return Unit.INSTANCE;
            case 12:
                AbstractC2003e.purchase(obj);
                C0073e c0073e = (C0073e) this.f36217e;
                AbstractC5336e.purchase(c0073e.license, null, 0, new C8514e(c0073e, r5, i), 3);
                return Unit.INSTANCE;
            case 13:
                AbstractC2003e.purchase(obj);
                ((C6621e) this.f36217e).purchase();
                return Unit.INSTANCE;
            case 14:
                AbstractC2003e.purchase(obj);
                ((C11188e) this.f36217e).f22446e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 15:
                AbstractC2003e.purchase(obj);
                return (C13355e) this.f36217e;
            case 16:
                AbstractC2003e.purchase(obj);
                C5422e c5422e = (C5422e) this.f36217e;
                Boolean bool = (Boolean) ((C14688e) AbstractC1831e.ad().purchase.yandex).f29092e.getValue();
                bool.getClass();
                c5422e.f11616e.setValue(bool);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractC2003e.purchase(obj);
                C18480e c18480e = (C18480e) this.f36217e;
                Boolean bool2 = (Boolean) ((C14688e) AbstractC1831e.ad().purchase.yandex).f29092e.getValue();
                bool2.getClass();
                c18480e.f36239e.setValue(bool2);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                AbstractC2003e.purchase(obj);
                C7838e c7838e = VKXApplication.f36530e;
                (c7838e != null ? c7838e : null).subscription();
                ((AppActivity) ((C16869e) this.f36217e).pro()).recreate();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                AbstractC2003e.purchase(obj);
                C0149e c0149e2 = (C0149e) this.f36217e;
                if (c0149e2.admob.ad()) {
                    c0149e2.startapp().m3789e();
                }
                return Unit.INSTANCE;
            case 20:
                AbstractC2003e.purchase(obj);
                C14214e c14214e2 = (C14214e) this.f36217e;
                if (c14214e2.admob.ad()) {
                    c14214e2.startapp().m3789e();
                }
                return Unit.INSTANCE;
            case 21:
                AbstractC2003e.purchase(obj);
                C6571e c6571e = (C6571e) this.f36217e;
                C2746e c2746e = new C2746e(((Number) c6571e.f13544e).intValue(), ((Number) c6571e.f13543e).intValue(), C0193e.f1409e);
                AbstractC11069e abstractC11069e = c2746e.f15553e;
                ?? obj3 = new Object();
                abstractC11069e.appmetrica(obj3, c2746e);
                String appmetrica = obj3.isPro(obj3.f31731e).appmetrica();
                C11787e c11787e = new C11787e();
                c11787e.license = C16063e.f31628e;
                c11787e.ad = "open.vkx.app";
                AbstractC9186e.license(c11787e, new String[]{"iac"});
                c11787e.adcel.mo859e("a", appmetrica);
                Unit unit = Unit.INSTANCE;
                return c11787e.metrica();
            case 22:
                AbstractC2003e.purchase(obj);
                if (!((C6455e) this.f36217e).yandex.vip()) {
                    C12701e ad = ((C6455e) this.f36217e).ad.ad();
                    C12383e c12383e = ((C6455e) this.f36217e).ad;
                    c12383e.metrica.vip = c12383e.ad();
                    C5241e c5241e = c12383e.vip;
                    C12701e ad2 = c12383e.ad();
                    synchronized (c5241e.ad) {
                        try {
                            if (AbstractC9464e.smaato("CXCP")) {
                                Log.d("CXCP", "Camera graph updated from " + c5241e.license + " to " + ad2);
                            }
                            EnumC13278e enumC13278e = c5241e.appmetrica;
                            EnumC13278e enumC13278e2 = EnumC13278e.f26334e;
                            if (enumC13278e != enumC13278e2) {
                                c5241e.metrica(EnumC13278e.f26333e, null);
                                c5241e.metrica(enumC13278e2, null);
                            }
                            c5241e.license = ad2;
                            c5241e.appmetrica = enumC13278e2;
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ad.purchase();
                    Map map = (Map) ((C6455e) this.f36217e).ad.purchase.getValue();
                    C6455e c6455e = (C6455e) this.f36217e;
                    C8020e c8020e = (C8020e) c6455e.adcel.getValue();
                    C11469e c11469e2 = ((C17018e) c8020e.appmetrica.getValue()).metrica() ? (C11469e) c8020e.purchase.getValue() : null;
                    if (c11469e2 != null) {
                        List unmodifiableList = DesugarCollections.unmodifiableList(c11469e2.billing.ad);
                        Iterator it = c11469e2.vip().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (!unmodifiableList.contains((AbstractC5113e) next)) {
                                    obj2 = next;
                                }
                            }
                        }
                        AbstractC5113e abstractC5113e = (AbstractC5113e) obj2;
                        if (abstractC5113e != null) {
                        }
                    }
                    if (AbstractC9464e.smaato("CXCP")) {
                        Log.d("CXCP", "Setting up Surfaces with UseCaseSurfaceManager");
                    }
                    if (((C17018e) ((C8020e) ((C6455e) this.f36217e).adcel.getValue()).appmetrica.getValue()).metrica()) {
                        ((C6467e) C11728e.purchase((C11728e) ((C6455e) this.f36217e).startapp.getValue(), ad, (C8020e) ((C6455e) this.f36217e).adcel.getValue(), map)).mo692else(C15146e.f29974e);
                    } else if (AbstractC9464e.amazon()) {
                        Log.e("CXCP", "Unable to create capture session due to conflicting configurations");
                    }
                } else if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "UseCaseCamera is closed before starting the CameraGraph, skipping setup.");
                }
                return Unit.INSTANCE;
            case 23:
                AbstractC2003e.purchase(obj);
                C1188e c1188e = C0896e.appmetrica;
                Bitmap bitmap = (Bitmap) this.f36217e;
                C13906e vip3 = C10659e.startapp(bitmap).vip();
                C13906e c13906e = DesugarCollections.unmodifiableList(vip3.ad).isEmpty() ? null : vip3;
                if (c13906e != null) {
                    return c13906e;
                }
                C0423e startapp = C10659e.startapp(bitmap);
                ((ArrayList) startapp.f2468e).clear();
                return startapp.vip();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                AbstractC2003e.purchase(obj);
                ViewOnAttachStateChangeListenerC3798e viewOnAttachStateChangeListenerC3798e = (ViewOnAttachStateChangeListenerC3798e) this.f36217e;
                C13756e c13756e = viewOnAttachStateChangeListenerC3798e.f8408e;
                if (c13756e != null) {
                    c13756e.license();
                }
                viewOnAttachStateChangeListenerC3798e.f8408e = null;
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC2003e.purchase(obj);
                ((Cvolatile) ((C5891e) this.f36217e).f12439e).invoke();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AbstractC2003e.purchase(obj);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(((C13372e) this.f36217e).f26633e.adcel);
                return mediaExtractor.getTrackFormat(0);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC2003e.purchase(obj);
                C11268e c11268e = (C11268e) this.f36217e;
                VKXApplication.Companion companion = VKXApplication.f36531e;
                C7838e c7838e2 = VKXApplication.f36530e;
                if (c7838e2 == null) {
                    c7838e2 = null;
                }
                C14609e vip4 = c7838e2.vip();
                c11268e.f22629e = vip4 != null ? vip4.vip : null;
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                AbstractC2003e.purchase(obj);
                ((C10345e) this.f36217e).invoke();
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                ((Celse) ((C18100e) this.f36217e).f35495e).invoke();
                return Unit.INSTANCE;
        }
    }
}
