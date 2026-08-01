package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۜؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC1335e extends AbstractBinderC5235e implements InterfaceC11904e {
    public final /* synthetic */ RunnableC12554e metrica;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1335e(C1257e c1257e, RunnableC12554e runnableC12554e) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.metrica = runnableC12554e;
    }

    @Override // defpackage.AbstractBinderC5235e
    public final boolean adcel(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        yandex();
        return true;
    }

    @Override // defpackage.InterfaceC11904e
    public final void yandex() {
        this.metrica.run();
    }
}
