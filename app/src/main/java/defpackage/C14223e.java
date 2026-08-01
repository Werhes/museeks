package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14223e implements InterfaceC6034e, InterfaceC10212e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f28096e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28097e;

    public /* synthetic */ C14223e(int i, Serializable serializable) {
        this.f28097e = i;
        this.f28096e = serializable;
    }

    public final boolean equals(Object obj) {
        switch (this.f28097e) {
            case 0:
                if ((obj instanceof InterfaceC6034e) && (obj instanceof InterfaceC10212e)) {
                    return ((C4870e) this.f28096e).equals(((InterfaceC10212e) obj).vip());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC6034e) && (obj instanceof InterfaceC10212e)) {
                    return vip().equals(((InterfaceC10212e) obj).vip());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f28097e) {
            case 0:
                return ((C4870e) this.f28096e).hashCode();
            default:
                return vip().hashCode();
        }
    }

    @Override // defpackage.InterfaceC6034e
    public final Object startapp(Object obj, InterfaceC5083e interfaceC5083e) {
        switch (this.f28097e) {
            case 0:
                return ((C4870e) this.f28096e).invoke(obj, interfaceC5083e);
            default:
                ((AtomicReference) this.f28096e).set((C8688e) obj);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC10212e
    public final InterfaceC12561e vip() {
        switch (this.f28097e) {
            case 0:
                return (C4870e) this.f28096e;
            default:
                return new C7140e(2, 4, AtomicReference.class, (AtomicReference) this.f28096e, "set", "set(Ljava/lang/Object;)V");
        }
    }
}
