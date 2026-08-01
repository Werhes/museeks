package defpackage;

import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؐۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4562e extends AbstractC16858e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C12570e f9852e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f9853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4562e(C12570e c12570e, int i) {
        super(0);
        this.f9853e = i;
        this.f9852e = c12570e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC3698e placementScope;
        int i = this.f9853e;
        C12570e c12570e = this.f9852e;
        switch (i) {
            case 0:
                C11874e c11874e = c12570e.f25213e;
                c11874e.startapp = 0;
                C12431e ads = c11874e.ad.ads();
                Object[] objArr = ads.f24870e;
                int i2 = ads.f24868e;
                for (int i3 = 0; i3 < i2; i3++) {
                    C12570e c12570e2 = ((C13915e) objArr[i3]).f27612e.Signature;
                    c12570e2.f25195e = c12570e2.f25207e;
                    c12570e2.f25207e = Alert.DURATION_SHOW_INDEFINITELY;
                    c12570e2.f25214e = false;
                    if (c12570e2.f25181e == 2) {
                        c12570e2.f25181e = 3;
                    }
                }
                C13915e c13915e = c11874e.ad;
                C13915e c13915e2 = c11874e.ad;
                C12431e ads2 = c13915e.ads();
                Object[] objArr2 = ads2.f24870e;
                int i4 = ads2.f24868e;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((C13915e) objArr2[i5]).f27612e.Signature.f25208e.license = false;
                    Unit unit = Unit.INSTANCE;
                }
                if (c12570e.appmetrica().f18514e) {
                    C8794e c8794e = (C8794e) c13915e2.loadAd();
                    int i6 = ((C12431e) c8794e.f17708e).f24868e;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((AbstractC17732e) ((C13915e) c8794e.get(i7)).f27592e.appmetrica).f18514e = true;
                    }
                }
                c12570e.appmetrica().mo1469e().metrica();
                if (c12570e.appmetrica().f18514e) {
                    C8794e c8794e2 = (C8794e) c13915e2.loadAd();
                    int i8 = ((C12431e) c8794e2.f17708e).f24868e;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((AbstractC17732e) ((C13915e) c8794e2.get(i9)).f27592e.appmetrica).f18514e = false;
                    }
                }
                C12431e ads3 = c13915e2.ads();
                Object[] objArr3 = ads3.f24870e;
                int i10 = ads3.f24868e;
                for (int i11 = 0; i11 < i10; i11++) {
                    C13915e c13915e3 = (C13915e) objArr3[i11];
                    C11874e c11874e2 = c13915e3.f27612e;
                    if (c11874e2.Signature.f25195e != c13915e3.isVip()) {
                        c13915e2.m3706default();
                        c13915e2.firebase();
                        if (c13915e3.isVip() == Integer.MAX_VALUE) {
                            if (c11874e2.metrica || AbstractC2467e.startapp(c13915e3)) {
                                c11874e2.admob.m4372static(false);
                            }
                            c11874e2.Signature.m3362return();
                        }
                    }
                }
                C12431e ads4 = c13915e2.ads();
                Object[] objArr4 = ads4.f24870e;
                int i12 = ads4.f24868e;
                for (int i13 = 0; i13 < i12; i13++) {
                    C10324e c10324e = ((C13915e) objArr4[i13]).f27612e.Signature.f25208e;
                    c10324e.appmetrica = c10324e.license;
                    Unit unit2 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 1:
                c12570e.f25213e.ad().admob(c12570e.f25203e);
                return Unit.INSTANCE;
            default:
                C11874e c11874e3 = c12570e.f25213e;
                AbstractC17732e abstractC17732e = c11874e3.ad().f34794e;
                if (abstractC17732e == null || (placementScope = abstractC17732e.f18510e) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c11874e3.ad)).getPlacementScope();
                }
                Function1 function1 = c12570e.f25205e;
                C16446e c16446e = c12570e.f25202e;
                if (c16446e != null) {
                    AbstractC17732e ad = c11874e3.ad();
                    long j = c12570e.f25192e;
                    float f = c12570e.f25209e;
                    placementScope.getClass();
                    AbstractC3698e.ad(placementScope, ad);
                    ad.mo1207case(C11490e.license(j, ad.f6802e), f, c16446e);
                } else if (function1 == null) {
                    AbstractC17732e ad2 = c11874e3.ad();
                    long j2 = c12570e.f25192e;
                    float f2 = c12570e.f25209e;
                    placementScope.getClass();
                    AbstractC3698e.ad(placementScope, ad2);
                    ad2.mo392catch(C11490e.license(j2, ad2.f6802e), f2, null);
                } else {
                    AbstractC17732e ad3 = c11874e3.ad();
                    long j3 = c12570e.f25192e;
                    float f3 = c12570e.f25209e;
                    placementScope.getClass();
                    AbstractC3698e.ad(placementScope, ad3);
                    ad3.mo392catch(C11490e.license(j3, ad3.f6802e), f3, function1);
                }
                return Unit.INSTANCE;
        }
    }
}
