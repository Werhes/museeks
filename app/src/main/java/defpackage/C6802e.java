package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۧؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6802e implements InterfaceC12504e, InterfaceC1360e, InterfaceC8427e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f14014e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14015e;

    public /* synthetic */ C6802e(int i, int i2) {
        this.f14015e = i2;
        this.f14014e = i;
    }

    public /* synthetic */ C6802e(int i, C11858e c11858e, Bundle bundle, Bundle bundle2) {
        this.f14015e = 3;
        this.f14014e = i;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        switch (this.f14015e) {
            case 4:
                ((C6268e) obj).mo2111e(this.f14014e);
                return;
            case 5:
                ((C6268e) obj).mo2141transient(this.f14014e);
                return;
            case 6:
                ((C6268e) obj).signatures(this.f14014e);
                return;
            default:
                ((C6268e) obj).mo2095e(this.f14014e);
                return;
        }
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        switch (this.f14015e) {
            case 0:
                ((InterfaceC8524e) obj).Signature(this.f14014e);
                return;
            case 1:
                ((InterfaceC8524e) obj).pro(this.f14014e);
                return;
            default:
                ((InterfaceC8524e) obj).Signature(this.f14014e);
                return;
        }
    }

    @Override // defpackage.InterfaceC1360e
    public void vip(C4275e c4275e) {
        if (c4275e.mo1580e() && c4275e.advert.get(this.f14014e) != null) {
            throw new ClassCastException();
        }
    }
}
