package defpackage;

import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ۟ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12781e extends AbstractC0769e implements InterfaceC9959e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f25577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12781e(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f25577e = i2;
    }

    @Override // defpackage.AbstractC3160e
    public final InterfaceC15954e advert() {
        return AbstractC3820e.ad.billing(this);
    }

    @Override // defpackage.InterfaceC9959e
    public final Object get() {
        int i = this.f25577e;
        Object obj = this.f7266e;
        switch (i) {
            case 0:
                return Integer.valueOf(((C12805e) obj).purchase.purchase());
            case 1:
                return Integer.valueOf(((C12805e) obj).billing.purchase());
            case 2:
                return ((C12856e) obj).smaato;
            case 3:
                return ((C12856e) obj).smaato;
            case 4:
                return ((InterfaceC16132e) obj).getValue();
            case 5:
                return ((InterfaceC16132e) obj).getValue();
            case 6:
                return ((InterfaceC16132e) obj).getValue();
            case 7:
                return ((InterfaceC16132e) obj).getValue();
            case 8:
                return obj.getClass().getSimpleName();
            case 9:
                return ((C7838e) obj).f15870e;
            case 10:
                int i2 = PlaybackService.f36732e;
                ((PlaybackService) obj).getClass();
                return PlaybackService.advert();
            case 11:
                int i3 = PlaybackService.f36732e;
                ((PlaybackService) obj).getClass();
                return PlaybackService.advert().f15868e;
            case 12:
                return ((InterfaceC16132e) obj).getValue();
            default:
                return ((C11046e) obj).f21899e;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // defpackage.InterfaceC8614e
    public final InterfaceC2554e metrica() {
        return ((InterfaceC9959e) admob()).metrica();
    }
}
