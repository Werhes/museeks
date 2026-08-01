package defpackage;

import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985e extends AbstractC16858e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C17596e f3419e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f3420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0985e(C17596e c17596e, int i) {
        super(0);
        this.f3420e = i;
        this.f3419e = c17596e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC4134e mo2526e;
        int i = this.f3420e;
        C17596e c17596e = this.f3419e;
        switch (i) {
            case 0:
                C11874e c11874e = c17596e.f34480e;
                c11874e.yandex = 0;
                C12431e ads = c11874e.ad.ads();
                Object[] objArr = ads.f24870e;
                int i2 = ads.f24868e;
                for (int i3 = 0; i3 < i2; i3++) {
                    C17596e c17596e2 = ((C13915e) objArr[i3]).f27612e.admob;
                    c17596e2.f34468e = c17596e2.f34477e;
                    c17596e2.f34477e = Alert.DURATION_SHOW_INDEFINITELY;
                    if (c17596e2.f34460e == 2) {
                        c17596e2.f34460e = 3;
                    }
                }
                C13915e c13915e = c11874e.ad;
                C13915e c13915e2 = c11874e.ad;
                C12431e ads2 = c13915e.ads();
                Object[] objArr2 = ads2.f24870e;
                int i4 = ads2.f24868e;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((C13915e) objArr2[i5]).f27612e.admob.f34475e.license = false;
                    Unit unit = Unit.INSTANCE;
                }
                C12009e c12009e = c17596e.appmetrica().f29168e;
                if (c12009e != null) {
                    boolean z = c12009e.f18514e;
                    C8794e c8794e = (C8794e) c13915e2.loadAd();
                    int i6 = ((C12431e) c8794e.f17708e).f24868e;
                    for (int i7 = 0; i7 < i6; i7++) {
                        AbstractC4134e mo2526e2 = ((AbstractC17732e) ((C13915e) c8794e.get(i7)).f27592e.appmetrica).mo2526e();
                        if (mo2526e2 != null) {
                            mo2526e2.f18514e = z;
                        }
                    }
                }
                c17596e.appmetrica().f29168e.mo1469e().metrica();
                if (c17596e.appmetrica().f29168e != null) {
                    C8794e c8794e2 = (C8794e) c13915e2.loadAd();
                    int i8 = ((C12431e) c8794e2.f17708e).f24868e;
                    for (int i9 = 0; i9 < i8; i9++) {
                        AbstractC4134e mo2526e3 = ((AbstractC17732e) ((C13915e) c8794e2.get(i9)).f27592e.appmetrica).mo2526e();
                        if (mo2526e3 != null) {
                            mo2526e3.f18514e = false;
                        }
                    }
                }
                C12431e ads3 = c13915e2.ads();
                Object[] objArr3 = ads3.f24870e;
                int i10 = ads3.f24868e;
                for (int i11 = 0; i11 < i10; i11++) {
                    C17596e c17596e3 = ((C13915e) objArr3[i11]).f27612e.admob;
                    int i12 = c17596e3.f34468e;
                    int i13 = c17596e3.f34477e;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        c17596e3.m4372static(true);
                    }
                }
                C12431e ads4 = c13915e2.ads();
                Object[] objArr4 = ads4.f24870e;
                int i14 = ads4.f24868e;
                for (int i15 = 0; i15 < i14; i15++) {
                    C10324e c10324e = ((C13915e) objArr4[i15]).f27612e.admob.f34475e;
                    c10324e.appmetrica = c10324e.license;
                    Unit unit2 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 1:
                C11874e c11874e2 = c17596e.f34480e;
                AbstractC3698e abstractC3698e = null;
                if (AbstractC2467e.startapp(c11874e2.ad) || c11874e2.metrica) {
                    AbstractC17732e abstractC17732e = c11874e2.ad().f34794e;
                    if (abstractC17732e != null) {
                        abstractC3698e = abstractC17732e.f18510e;
                    }
                } else {
                    AbstractC17732e abstractC17732e2 = c11874e2.ad().f34794e;
                    if (abstractC17732e2 != null && (mo2526e = abstractC17732e2.mo2526e()) != null) {
                        abstractC3698e = mo2526e.f18510e;
                    }
                }
                if (abstractC3698e == null) {
                    abstractC3698e = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c11874e2.ad)).getPlacementScope();
                }
                AbstractC3698e.adcel(abstractC3698e, c11874e2.ad().mo2526e(), c17596e.f34465e);
                return Unit.INSTANCE;
            default:
                c17596e.f34480e.ad().mo2526e().admob(c17596e.f34469e);
                return Unit.INSTANCE;
        }
    }
}
