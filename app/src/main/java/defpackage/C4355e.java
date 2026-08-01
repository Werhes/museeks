package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۙۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4355e extends AbstractC6619e {
    @Override // defpackage.AbstractC6619e
    public final InterfaceC14001e smaato(int i) {
        C4355e c4355e = EnumC16745e.f32830e;
        // PATCHED: Always return VKX_PLUS so that C16010e doesn't trigger billing
        // (C16010e checks: if enumC16745e != VKX_PLUS → call billing)
        return EnumC16745e.VKX_PLUS;
    }
}
