package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8392e implements InterfaceC10212e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f17164e;

    public C8392e(Function1 function1) {
        this.f17164e = function1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8392e) || !(obj instanceof InterfaceC10212e)) {
            return false;
        }
        return AbstractC7890e.billing(this.f17164e, ((InterfaceC10212e) obj).vip());
    }

    public final int hashCode() {
        return this.f17164e.hashCode();
    }

    @Override // defpackage.InterfaceC10212e
    public final InterfaceC12561e vip() {
        return this.f17164e;
    }
}
