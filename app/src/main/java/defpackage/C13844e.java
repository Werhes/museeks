package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13844e implements InterfaceC15046e, InterfaceC6995e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f27425e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f27426e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f27427e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ boolean f27428e;

    public /* synthetic */ C13844e(C5537e c5537e, C1962e c1962e, boolean z, boolean z2) {
        this.f27425e = c5537e;
        this.f27427e = c1962e;
        this.f27428e = z;
        this.f27426e = z2;
    }

    public /* synthetic */ C13844e(C12693e c12693e, boolean z, boolean z2, C18424e c18424e) {
        this.f27425e = c12693e;
        this.f27428e = z;
        this.f27426e = z2;
        this.f27427e = c18424e;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eؘؑۢ, java.lang.Object] */
    @Override // defpackage.InterfaceC6995e
    public void ad(C18424e c18424e) {
        C5537e c5537e = (C5537e) this.f27425e;
        ListenableFuture crashlytics = c5537e.yandex.crashlytics(c18424e, AbstractC17475e.ads((C1962e) this.f27427e), -1, -9223372036854775807L);
        ?? obj = new Object();
        obj.f1375e = c5537e;
        obj.f1373e = c18424e;
        obj.f1376e = this.f27428e;
        obj.f1374e = this.f27426e;
        crashlytics.ad(new RunnableC17144e(crashlytics, (Object) obj, 11), EnumC3320e.f7489e);
    }

    @Override // defpackage.InterfaceC15046e
    public void appmetrica(InterfaceC10645e interfaceC10645e, int i) {
        interfaceC10645e.amazon(i, (C12693e) this.f27425e, this.f27428e, this.f27426e, ((C18424e) this.f27427e).metrica);
    }
}
