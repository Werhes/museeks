package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۤؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC9088e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AppMeasurementDynamiteService f18203e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9026e f18204e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18205e;

    public /* synthetic */ RunnableC9088e(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC9026e interfaceC9026e, int i) {
        this.f18205e = i;
        this.f18204e = interfaceC9026e;
        this.f18203e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18205e) {
            case 0:
                C10640e mopub = this.f18203e.metrica.mopub();
                InterfaceC9026e interfaceC9026e = this.f18204e;
                mopub.mo2250e();
                mopub.m1411e();
                mopub.m2851e(new RunnableC11666e(mopub, mopub.m2858e(false), interfaceC9026e, false, 19));
                return;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f18203e;
                C5240e c5240e = appMeasurementDynamiteService.metrica.f14223e;
                C6936e.purchase(c5240e);
                C6936e c6936e = appMeasurementDynamiteService.metrica;
                c5240e.m1828e(this.f18204e, c6936e.f14216e != null && c6936e.f14216e.booleanValue());
                return;
        }
    }
}
