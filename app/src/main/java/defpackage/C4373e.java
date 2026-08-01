package defpackage;

import android.os.Handler;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4373e implements InterfaceC7775e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17015e f9518e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C14326e f9511e = new C14326e("camerax.core.appConfig.cameraFactoryProvider", C8396e.class, null);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C14326e f9509e = new C14326e("camerax.core.appConfig.deviceSurfaceManagerProvider", C17279e.class, null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C14326e f9514e = new C14326e("camerax.core.appConfig.useCaseConfigFactoryProvider", C17168e.class, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C14326e f9507e = new C14326e("camerax.core.appConfig.cameraExecutor", Executor.class, null);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C14326e f9517e = new C14326e("camerax.core.appConfig.schedulerHandler", Handler.class, null);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C14326e f9516e = new C14326e("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C14326e f9512e = new C14326e("camerax.core.appConfig.availableCamerasLimiter", C11725e.class, null);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C14326e f9515e = new C14326e("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C14326e f9510e = new C14326e("camerax.core.appConfig.cameraProviderInitRetryPolicy", InterfaceC14449e.class, null);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C14326e f9513e = new C14326e("camerax.core.appConfig.quirksSettings", C2602e.class, null);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C14326e f9508e = new C14326e("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);

    public C4373e(C17015e c17015e) {
        this.f9518e = c17015e;
    }

    @Override // defpackage.InterfaceC12330e
    public final /* synthetic */ Set admob() {
        return AbstractC0054e.smaato(this);
    }

    public final C17279e billing() {
        return (C17279e) this.f9518e.smaato(f9509e, null);
    }

    @Override // defpackage.InterfaceC12330e
    /* renamed from: catch */
    public final /* synthetic */ EnumC13734e mo810catch(C14326e c14326e) {
        return AbstractC0054e.yandex(this, c14326e);
    }

    @Override // defpackage.InterfaceC12330e
    /* renamed from: extends */
    public final /* synthetic */ boolean mo812extends(C14326e c14326e) {
        return AbstractC0054e.purchase(this, c14326e);
    }

    @Override // defpackage.InterfaceC7775e
    public final /* synthetic */ String firebase(String str) {
        throw null;
    }

    @Override // defpackage.InterfaceC7775e
    /* renamed from: implements */
    public final /* synthetic */ String mo836implements() {
        throw null;
    }

    @Override // defpackage.InterfaceC12330e
    public final /* synthetic */ Set inmobi(C14326e c14326e) {
        return AbstractC0054e.startapp(this, c14326e);
    }

    public final C8396e license() {
        return (C8396e) this.f9518e.smaato(f9511e, null);
    }

    @Override // defpackage.InterfaceC12330e
    public final /* synthetic */ void metrica(C11565e c11565e) {
        AbstractC0054e.billing(this, c11565e);
    }

    @Override // defpackage.InterfaceC9729e
    public final InterfaceC12330e mopub() {
        return this.f9518e;
    }

    @Override // defpackage.InterfaceC12330e
    public final /* synthetic */ Object premium(C14326e c14326e, EnumC13734e enumC13734e) {
        return AbstractC0054e.admob(this, c14326e, enumC13734e);
    }

    public final long purchase() {
        return ((Long) this.f9518e.smaato(f9515e, -1L)).longValue();
    }

    @Override // defpackage.InterfaceC12330e
    public final /* synthetic */ Object smaato(C14326e c14326e, Object obj) {
        return AbstractC0054e.Signature(this, c14326e, obj);
    }

    @Override // defpackage.InterfaceC12330e
    public final /* synthetic */ Object subscription(C14326e c14326e) {
        return AbstractC0054e.loadAd(this, c14326e);
    }

    public final C11725e vip() {
        return (C11725e) this.f9518e.smaato(f9512e, null);
    }

    public final C17168e yandex() {
        return (C17168e) this.f9518e.smaato(f9514e, null);
    }
}
