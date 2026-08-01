package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11024e extends AbstractC13616e implements InterfaceC13046e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public Function1 f21844e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public EnumC16488e f21845e;

    @Override // defpackage.InterfaceC13046e
    /* renamed from: throw */
    public final void mo1035throw(EnumC16488e enumC16488e) {
        if (AbstractC7890e.billing(this.f21845e, enumC16488e)) {
            return;
        }
        this.f21845e = enumC16488e;
        this.f21844e.invoke(enumC16488e);
    }
}
