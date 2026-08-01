package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۛۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16509e implements InterfaceC9208e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC10500e f32325e;

    public /* synthetic */ C16509e(InterfaceC10500e interfaceC10500e) {
        this.f32325e = interfaceC10500e;
    }

    @Override // defpackage.InterfaceC9208e
    public final Object ad(C13895e c13895e) {
        return Unit.INSTANCE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16509e) {
            return AbstractC7890e.billing(this.f32325e, ((C16509e) obj).f32325e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32325e.hashCode();
    }

    @Override // defpackage.InterfaceC9208e
    public final /* synthetic */ void metrica() {
    }

    @Override // defpackage.InterfaceC9208e
    public final /* synthetic */ void start() {
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f32325e + ")";
    }

    @Override // defpackage.InterfaceC9208e
    public final /* synthetic */ void vip() {
    }
}
