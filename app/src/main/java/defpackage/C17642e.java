package defpackage;

import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17642e extends AbstractC12943e implements InterfaceC1136e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f34569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17642e(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f34569e = i2;
    }

    @Override // defpackage.AbstractC3160e
    public final InterfaceC15954e advert() {
        return AbstractC3820e.ad.appmetrica(this);
    }

    @Override // defpackage.InterfaceC3996e
    public final InterfaceC18500e appmetrica() {
        return ((InterfaceC1136e) admob()).appmetrica();
    }

    @Override // defpackage.InterfaceC9959e
    public final Object get() {
        switch (this.f34569e) {
            case 0:
                return Boolean.valueOf(((C15601e) this.f7266e).license);
            case 1:
                return ((PlaybackService) this.f7266e).f36740e;
            case 2:
                return Boolean.valueOf(((C3067e) this.f7266e).f7137e);
            default:
                return ((InterfaceC3314e) this.f7266e).getValue();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // defpackage.InterfaceC8614e
    public final InterfaceC2554e metrica() {
        return ((InterfaceC1136e) admob()).metrica();
    }
}
